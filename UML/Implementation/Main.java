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
		
		Location location = new Location(2,15,6);
		
		
		
		
	}

}
