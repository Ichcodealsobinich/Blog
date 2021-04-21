
public class Main {

	public static void main(String[] args) {
		
		Teilnehmer peter = new Teilnehmer();
		peter.setVorname("Peter");
		peter.setNachname("Lustig");
		peter.setAlter(55);
		
		Teilnehmer susi = new Teilnehmer();
		susi.setVorname("Susi");
		susi.setNachname("Sakovski");
		susi.setAlter(25);
		
		Teilnehmer paul = new Teilnehmer();
		paul.setVorname("Paul");
		paul.setNachname("Paulus");
		paul.setAlter(30);
		
		Seminar sea4 = new Seminar();
		sea4.anmelden(susi);
		sea4.anmelden(peter);
		sea4.anmelden(paul);
		
		System.out.println(sea4.getPerson(0).getVorname());
		//System.out.println(sea4.getPerson(1).getVorname());
		System.out.println(sea4.getPerson(2).getVorname());
		
		sea4.abmelden(peter);
		System.out.println(sea4.number());
		
		Teilnehmer[] test = sea4.getAll();
		System.out.println(test[0].getVorname());
	}

}
