package myFirstPackage;

public class MyFirstClass {
	public static void main (String[] args) {
		Person meinNachbar = new Person();
		meinNachbar.setVorname("Erika");
		meinNachbar.setNachname("Mustermann");
		meinNachbar.setAlter(30);
		Person meinAndererNachbar = meinNachbar.clone();
		meinAndererNachbar=null;
		System.out.println(meinNachbar.equals(meinAndererNachbar));
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
