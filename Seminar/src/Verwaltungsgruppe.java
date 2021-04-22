
public class Verwaltungsgruppe implements VerwaltungsInterface{
	
	private Object[] listOfObjects = new Object[15];
	private int count = 0;
	
	public boolean anmelden(Object p) {
		boolean result = false;
		//Duplicate check
		for (int i = 0; i< listOfObjects.length; i++) {
			if (p!= null) { // equals nur möglich, wenn p nicht null ist
				if (p.equals(listOfObjects[i])) {
					return false;
				}
			}
		}
		//insert new participant at the first free cell
		//the first free cell is defined by the number of saved participants,
		//not by the first cell with null
		if (count < listOfObjects.length) {
			listOfObjects[count]=p;
			count++;
			result=true;
		}
		return result;
	}
	
	public boolean abmelden(Object p) {
		boolean result = false;
		for (int i = 0; i< listOfObjects.length; i++) {
			if (listOfObjects[i] == p) {
				listOfObjects[i] = null;
				count--;
				result = true;
				//all cells after i must shift 1 left
				for (int j = i+1; j < listOfObjects.length; j++) {
					listOfObjects[j-1] = listOfObjects[j];  
				}
			}
		}
		return result;
	}

	public Object getObject(int index) {
		if (index < this.listOfObjects.length && index >=0) {
			return this.listOfObjects[index];
		} else {
			return null;
		}
	}
	
	public Object[] getAll() {

		Object[] result = new Teilnehmer[count];
		for (int i = 0; i< listOfObjects.length; i++) {
			if (listOfObjects[i] != null) {
				for (int j = 0; j< result.length; j++) {
					if (result[j] == null) {
						result[j] = listOfObjects[i];
					}
				}
			}	
		}
		return result;
	}
	
	public int anzahlObjects() {
		return this.count;
	}
	
	public void clear() {
		//TODO
	}
	public boolean contains(Teilnehmer p) {
		//TODO
		return false;
	}
	public int indexOf(Teilnehmer p) {
		//TODO
		return -1;
	}	
}
