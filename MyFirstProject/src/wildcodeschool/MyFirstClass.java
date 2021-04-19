package wildcodeschool;

public class MyFirstClass {
	public static void main (String[] args) {
		
		//Person-Klasse testen
		Person person1 = new Person("Erika", "Mustermann", 30);	
		Person person2 = person1.clone();
		Person person3 = person1.clone();
		person3.setVorname("Max");
				
		System.out.println(person1.equals(person2) + " " + person2.equals(person1));
		System.out.println(person1.equals(person1));
		System.out.println(person2.equals(person2));
		System.out.println(person3.equals(person3));
		System.out.println(person1.equals(person3) + " " + person3.equals(person1));
		System.out.println(person3.equals(person2) + " " + person2.equals(person3));
		
		
		//BaseClass testen
		BaseClass b1 = new BaseClass();
		BaseClass b2 = new BaseClass();
		System.out.println(b1.getId());
		System.out.println(b2.getId());
		BaseClass b3 = new BaseClass();
		System.out.println(b3.getId());
		BaseClass b4 = new BaseClass();
		System.out.println(b4.getId());
	}
}
