package meindefaultpaket;

public class testclass {
	public static void main (String[] args) {
		System.out.println(Gruesse.formal("Frederik"));
		System.out.println(Gruesse.informal("Frederik"));
		System.out.println(Gruesse.neutral("Frederik"));
	}
	public static void gibAus(String ausgabe) {
		System.out.println(ausgabe);
	}
}

