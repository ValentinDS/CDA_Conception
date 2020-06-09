import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.crm.bo.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User david = new User("Flint", "David", 40);
		User louis = new User("LeFuneste", "Louis", 25);
		User andrew = new User("Warfield","Andrew",20);

		Ressource cthulhu = new Book("L'appel de Cthulhu", 17.5f, "HP Lovecraft", 1455299754);
		Ressource revuedelespace = new Revue("La revue de l'espace", 0.42f, 10, new GregorianCalendar(2007,1,17));
		
		ArrayList<Ressource> ressources = new ArrayList<Ressource>();
		ressources.add(cthulhu);
		ressources.add(revuedelespace);
		
		cthulhu.addCopy("045414880804871078", new GregorianCalendar(2020,7,9));
		cthulhu.addCopy("04548741818184148118", new GregorianCalendar(2020,9,17));
		
		revuedelespace.addCopy("4148148141822", new GregorianCalendar(2020,9,21));
		revuedelespace.addCopy("51101988410", new GregorianCalendar(2020,9,20));
		
		ArrayList<Copy> borrowedCopiesDavid = new ArrayList<Copy>();
		ArrayList<Copy> borrowedCopiesLouis = new ArrayList<Copy>();
		ArrayList<Copy> borrowedCopiesAndrew = new ArrayList<Copy>();
		
		borrowedCopiesDavid.add(cthulhu.getCopies().get(0));
		
		borrowedCopiesLouis.add(cthulhu.getCopies().get(1));
		borrowedCopiesLouis.add(revuedelespace.getCopies().get(0));
		
		borrowedCopiesAndrew.add(revuedelespace.getCopies().get(1));
		
		david.setBorrowedCopies(borrowedCopiesDavid);
		louis.setBorrowedCopies(borrowedCopiesLouis);
		andrew.setBorrowedCopies(borrowedCopiesAndrew);
		
		Location location = new Location(2,15,6);
		
		location.addStockedRessource(ressources);
		
		System.out.println(david.getBorrowedCopies().get(0).getBarCode());
		System.out.println(louis.getBorrowedCopies().get(1).getBarCode());
		
		
		
		
		
	}

}
