package doMyself;

public class Person {
	private String name = null;
	public int age = 0;

	public Person(){}

	public Person(String name){
		this.name = name;
	}

	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}


}
