package meindefaultpaket;

public class Gruesse {
	public static String formal (String name) {
		return "Guten Tag, " + name;
	}
	public static String informal (String name) {
		return "Jo, was geht ab, " + name;
	}
	public static String neutral (String name) {
		return "Hallo " + name;
	}
}