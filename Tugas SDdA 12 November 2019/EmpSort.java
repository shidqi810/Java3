import java.util.*;

public class Employee implements Comparable<Employee> {
	public Name name() {

	}

	public int number() {

	}

	public Date hireDate() {

	}
}

public class EmpSort{
	static final Comparator<Employee>
		SENIORITY_ORDER = new Comparator<Employee>(){
			public int compare(Employee e1, Employee e2){
				return e2.hireDate().compareTo(e1.hireDate());
			}
		};

	//employee database
	//Implementasi Collection diserahkan pada
	//Anda (bisa menggunakan Array, list, dan lain-lain)
	static final Collection<Employee> employees = new ArrayList<Employee>();

	public static void main(String[] args){
		List<Employee> e = new ArrayList<Employee>(employees);
		Collections.sort(e, SENIORITY_ORDER);
		System.out.println(e);
	}
}