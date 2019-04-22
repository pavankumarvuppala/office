import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;



public class EmployeeClass{
	
	public static void main(String [] args){
	Map<Employeee,String> map = new HashMap<Employeee,String>();
	Employeee emp1 = new Employeee(1, "pav");
	Employeee emp2 = new Employeee(1,"pav");
	

	map.put(emp1, "one");
	map.put(emp2, "two");
	System.out.println(map.size());
	}

	public Object name;
	public int id;
	
	
	
}









class Employeee {

	int id;
	String name;
	
	Employeee(int id, String name){
		this.id = id;
		this.name = name;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employeee other = (Employeee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

	

}
