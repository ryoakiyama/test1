package jp.co.internous.action;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ



		Madam A = new Madam("アダム",20);
		Madam B = new Madam("マダム",25);


		A.age = 20;
		System.out.println(A.getName());
		A.skil();
		System.out.println(A.getName());
		B.skil();
		System.out.println(B.getName());


	}

}
