
public class VerwaltungsgruppeFrederik implements MyList{
	
	private Object[] listOfObjects = new Object[1];
	private int count = 0;
	
	public boolean add(Object p) {
		//Duplicate check
		for (int i = 0; i< listOfObjects.length; i++) {
			if (p!= null) { // equals nur möglich, wenn p nicht null ist
				if (p.equals(listOfObjects[i])) {
					return false;
				}
			}
		}
		// in case the array is full 
		//it must be copied to a bigger array
		if (count >= listOfObjects.length) { 
			this.listOfObjects = this.resize(listOfObjects);
		} 
		//insert new participant at the first free cell
		//the first free cell is defined by the number of saved participants,
		//not by the first cell with null
		listOfObjects[count]=p;
		count++;
		return true;
	}
	
	public boolean remove(Object p) {
		boolean result = false;
		for (int i = 0; i< listOfObjects.length; i++) {
			if (listOfObjects[i] == p) { //compare by reference
				listOfObjects[i] = null; //not really necessary, but who knows
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
			return this.listOfObjects[index]; //can also be null
		} else {
			return null;
		}
	}
	
	public Object[] getAll() {
		Object[] result = new Object[count];
		for (int i = 0; i< count; i++) {
			result[i]=this.listOfObjects[i];	
		}
		return result;
	}
	
	public int size() {
		return this.count;
	}
	
	private  Object[] resize(final Object[] obj) {
		Object[] biggerArray = new Object[obj.length +1];
		if (obj.length==0) {return biggerArray;}
		for (int i = 0;i < obj.length; i++) {
			biggerArray[i]=obj[i];
		}
		return biggerArray;
	}
	
	public void clear() {
		this.listOfObjects=new Object[1];
		count=0;
	}
	
	public boolean contains(Object p) {
		boolean result = false;
		for (int i = 0; i< listOfObjects.length; i++) {
			if (listOfObjects[i] == p) {
				result=true;
			}
		}
		return result;
	}
	
	public int indexOf(Object p) {
		int result =-1;
		for (int i = 0; i< listOfObjects.length; i++) {
			if (listOfObjects[i] == p) {
				result=i;
			}
		}
		return result;
	}	
}
