package doMyself;

public class Capsule {
	public static void main(String[] arg){
	Person satomi = new Person();

	Person ayaka = new Person("綾香",19);
	System.out.println(ayaka.age);

	System.out.println(ayaka.getName());

	ayaka.setName("光太郎");

	System.out.println(ayaka.getName());


	}
}
