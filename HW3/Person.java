package Task2;

public abstract class Person {
	public String name;

	public Person(String name) {
		this.name = name;
	}
	
	public abstract void print();

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	

}