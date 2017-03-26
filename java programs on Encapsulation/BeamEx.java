package javaprograms;


// if a class contain private data and public setter, getter () it is called as Beam class

public class BeamEx {

	private int id ;
	private String name ;
	private double salary ;
	
	public static void main(String[] args) {
		System.out.println("No execution, bame class is only used for declaring valuse");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
