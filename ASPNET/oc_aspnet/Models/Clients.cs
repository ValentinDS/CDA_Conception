using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace oc_aspnet.Models
{
    public class Clients
    {

        public List<Client> listofclients;

        public List<Client> GetClientsList()
        {

            return new List<Client>
            {
                new Client { Age = 19, Name = "Benoit" },
                new Client { Age = 52, Name = "Michel"},
                new Client{Age=45, Name = "Karen" }

            };

        }
    }
}