
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
		
		VerwaltungsgruppeFrederik sea4 = new VerwaltungsgruppeFrederik();
		sea4.add(susi);
		sea4.add(peter);
		sea4.add(paul);
		sea4.add(new Teilnehmer());
		sea4.add(null);
		
		System.out.println(sea4.getObject(0));
		System.out.println(sea4.getObject(1));
		System.out.println(sea4.getObject(1));
		System.out.println(sea4.getObject(3));
		System.out.println(sea4.size());
		
		sea4.remove(peter);
		System.out.println(sea4.size());
		System.out.println(sea4.contains(paul));
		System.out.println(sea4.indexOf(paul));
		
		//Quest 856
		Quest856.Movies movieList = new Quest856.Movies();
		Quest856.Movie raidersOfTheLostArk = new Quest856.Movie("Raiders of the Lost Ark" ,new String[] {"Harrison Ford", "Karen Allen", "Paul Freeman"});
		Quest856.Movie templeOfDoom = new Quest856.Movie("Indiana Jones and the Temple of Doom", new String[] {"Harrison Ford","Kate Capshaw", "Ke Huy Quan"});
		Quest856.Movie lastCrusade = new Quest856.Movie("Indiana Jones and the Last Crusade",new String[]{"Harrison Ford", "Sean Connery", "Denholm Elliott"});
		movieList.add(raidersOfTheLostArk);
		movieList.add(templeOfDoom);
		movieList.add(lastCrusade);
		System.out.println(movieList.get(0).toString());
		System.out.println(movieList.get(1).toString());
		System.out.println(movieList.get(2).toString());
	}

}
