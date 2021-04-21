
public class Seminar {
	
	private Teilnehmer[] listeDerTeilnehmer = new Teilnehmer[15];
	private int count = 0;
	
	public boolean anmelden(Teilnehmer p) {
		boolean result = false;
		for (int i = 0; i< listeDerTeilnehmer.length; i++) {
			if (listeDerTeilnehmer[i] == null) {
				listeDerTeilnehmer[i] = p;
				count++;
				result= true;
				break;
			}
		}
		return result;
	}
	
	public boolean abmelden(Teilnehmer p) {
		boolean result = false;
		for (int i = 0; i< listeDerTeilnehmer.length; i++) {
			if (listeDerTeilnehmer[i] == p) {
				listeDerTeilnehmer[i] = null;
				count--;
				result = true;
			}
		}
		return result;
	}

	public Teilnehmer getPerson(int index) {
		if (index < this.listeDerTeilnehmer.length && index >=0) {
			return this.listeDerTeilnehmer[index];
		} else {
			return null;
		}
	}
	
	public Teilnehmer[] getAll() {

		Teilnehmer[] result = new Teilnehmer[count];
		for (int i = 0; i< listeDerTeilnehmer.length; i++) {
			if (listeDerTeilnehmer[i] != null) {
				for (int j = 0; j< result.length; j++) {
					if (result[j] == null) {
						result[j] = listeDerTeilnehmer[i];
					}
				}
			}	
		}
		return result;
	}
	
	public int number() {
		return this.count;
	}
}
