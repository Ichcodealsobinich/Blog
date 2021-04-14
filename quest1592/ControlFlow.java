public class MainClass {
    public static void main(String[] args){
        System.out.println("Ausgabe aus der main()-Methode");
	if (args.length > 0) {
		System.out.println("Du hast mindestens " + args[0] + " eingegeben");
	}
	if (true) {
		System.out.println("Bedingung war true");
	}
	for (int i = 0; i < 4; i++) {
		System.out.println(i+1);
	}
	if (false) {
		System.out.println("Bedingung war false");
	}
    }
}
