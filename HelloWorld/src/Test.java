
public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.address = "東京";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.address);
		taro.talk();
		taro.eat();

		Person jiro = new Person("二郎");
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person miho = new Person("美保",20);
		System.out.println(miho.name);
		System.out.println(miho.age);
		
		Person takayo = new Person(20);
		System.out.println(takayo.name);
		
		Person tetsuya = new Person("徹也","愛知県");
		System.out.println(tetsuya.name);
		System.out.println(tetsuya.address);

	}

}
