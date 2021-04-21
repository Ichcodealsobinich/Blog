

public class Teilnehmer extends Object {
	private String vorname;
	private String nachname;
	private int alter;
	
	public void setVorname(String vn) {
		if (this.isValidName(vn)) {this.vorname = vn;}
	}
	public void setNachname(String nn) {
		if (this.isValidName(nn)) {this.nachname=nn;}
	}
	public void setAlter(int age) {
		this.alter=age;
	}
	public String getVorname() {
		return this.vorname;
	}
	public String getNachname() {
		return this.nachname;
	}
	public int getAlter() {
		return this.alter;
	}
	//constructor
	public Teilnehmer() {
		this.setVorname("");
		this.setNachname("");
		this.setAlter(0);
	}
	//constructor with parameters
	public Teilnehmer(String vn, String nn, int a) {
		this.setVorname(vn);
		this.setNachname(nn);
		this.setAlter(a);
	}
	public boolean equals(Teilnehmer p) {
		return (p!=null) && 
				(this.getVorname()==p.getVorname()) && 
				(this.getNachname()==p.getNachname()) && 
				(this.getAlter() == p.getAlter());
	}
	public Teilnehmer clone() {
		Teilnehmer clone = new Teilnehmer();
		clone.setVorname(this.getVorname());
		clone.setNachname(this.getNachname());
		clone.setAlter(this.getAlter());
		return clone;
	}
	public boolean isValidName(String name) {
		if (name.contains("\\"))return false;
		if (name.contains("/")) return false;
		if (name.contains("\""))return false;
		if (name.contains("§")) return false;
		if (name.contains("$")) return false;
		if (name.contains("!")) return false;
		if (name.contains("&")) return false;
		if (name.contains("(")) return false;
		if (name.contains(")")) return false;
		if (name.contains("[")) return false;
		if (name.contains("]")) return false;
		if (name.contains("{")) return false;
		if (name.contains("}")) return false;
		if (name.contains("+")) return false;
		if (name.contains("#")) return false;
		if (name.contains(",")) return false;
		if (name.contains(";")) return false;
		if (name.contains(".")) return false;
		if (name.contains(":")) return false;
		if (name.contains("<")) return false;
		if (name.contains(">")) return false;	
		return true;
	}
}
