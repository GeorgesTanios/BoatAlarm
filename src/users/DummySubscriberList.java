package users;
import java.util.List;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class DummySubscriberList extends ArrayList{
	List<Subscriber> subscriberList = new ArrayList<Subscriber>();
	Confidence confPerson = new Confidence("mail.confidence@test.com",000000000);
	
	public DummySubscriberList() {
		Subscriber sub1 = new Subscriber("QDucasse",
					"1234",
					"Quentin Ducasse",
				    "2 Rue François Verny",
				    "quentin.ducasse@ensta-bretagne.org", 
				    LocalDate.of(2014, Month.DECEMBER, 12),
				    confPerson,
					48500,"Le Goëland", 
					"Voilier", "Catamaran");
		
		Subscriber sub2 = new Subscriber("GLeBoucher",
					"1234",
					"Guillaume Le Boucher",
				    "2 Rue François Verny",
				    "guillaume.le_boucher@ensta-bretagne.org", 
				    LocalDate.of(2014, Month.DECEMBER, 13),
				    confPerson,
					48501,"L'Agile", 
					"Voilier", "Dériveur");
		
		Subscriber sub3 = new Subscriber("GTanios",
					"1234",
					"Georges Tanios",
				    "2 Rue François Verny",
				    "georges.tanios@ensta-bretagne.org", 
				    LocalDate.of(2014, Month.DECEMBER, 14),
				    confPerson,
					48502,"Test3", 
					"Moteur", "Yacht");
		
		Subscriber sub4 = new Subscriber("MSouafyan",
					"1234",
					"Mahmoud Souafyan",
				    "2 Rue François Verny",
				    "mahmoud.souafyan@ensta-bretagne.org", 
				    LocalDate.of(2014, Month.DECEMBER, 15),
				    confPerson,
					48503,"Test4", 
					"Moteur", "Yacht");
		
		subscriberList.add(sub1);
		subscriberList.add(sub2);
		subscriberList.add(sub3);
		subscriberList.add(sub4);
	}
	
}
