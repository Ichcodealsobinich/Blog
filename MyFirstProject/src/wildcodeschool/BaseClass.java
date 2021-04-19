package wildcodeschool;

public class BaseClass {
	//counter um für jede Instanz eine eigene Id zu vergeben
	private static int counter=0;
	//Eindeutige id der Instanz
	private int id;
	
	//der Consturcor vergibt eine eindeutige Id für jede neue Instanz
	public BaseClass() {
		this.id = BaseClass.getCount();
	}
	//diese Methode ist static, damit sie in der Klasse aufgerufen wird 
	//und nicht in der Instanz
	public static int getCount() {
		++counter;
		return (counter-1);
	}
	public int getId() {
		return this.id;
	}
	
	//Teil 2 der Quest: Vergleichen
	//da es nichts sinnvolles zu vergleichen gibt, vergleichen wir die Ids
	public boolean isGreaterThan(BaseClass b) {
		return (this.getId() > b.getId());
	}
	public boolean isGreaterOrEqual(BaseClass b) {
		return (this.getId() >= b.getId());
	}
	public boolean isLessThan(BaseClass b) {
		return (this.getId() < b.getId());
	}
	public boolean isLessOrEqual(BaseClass b) {
		return (this.getId() <= b.getId());
	}
	
	//Teil 3 der Quest: Eine Equal Methode bereitstellen
	//schamlos aus der Quest kopiert
	@Override
    public boolean equals(Object obj) {
        if (obj == null) { // null check
            return false;
        }
        if (this == obj) {// self check     
            return true;
        }
        if (getClass() != obj.getClass()) { // type check
            return false;
        }
        // type check and cast
        BaseClass b = (BaseClass) obj; // keine Ahnung was das bringen soll
        return this.getId()==b.getId();

    }
	// Auch für Teil 3: Eine hashCode-Methode bereitstellen
	//da jede Instanz eine eindeutige Id bekommt, ist sie auch ein gültiger Hashcode
	public int hashCode() {
		return this.getId();
	}
}
