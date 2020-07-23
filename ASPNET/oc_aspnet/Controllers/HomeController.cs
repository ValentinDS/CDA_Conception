using oc_aspnet.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace oc_aspnet.Controllers
{
    public class HomeController : Controller
    {
        // GET: Home
        public ActionResult Index(string id)
        {
            if (string.IsNullOrEmpty(id))
            {
                return View("Index");
            }

                ViewData["Name"] = id;
                return View("Index");
            
       
        }

        public ActionResult ShowClientsList()
        {
            Clients clients = new Clients();
            ViewBag.ListClients = clients.GetClientsList();


            return View("ClientsList");

        }

        public ActionResult FindAClient(string id)
        {
            ViewBag.Name = id;

            Clients clients = new Clients();
            Client client = clients.GetClientsList().FirstOrDefault(cli => cli.Name == id);

            if(client != null)
            {
                ViewBag.Age = client.Age;
                return View("Find");

            }

            return View("NotFound");

        }

    }
}