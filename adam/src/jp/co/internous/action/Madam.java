package jp.co.internous.action;

public class Madam {
	private String name = null;
	public int age = 0;
	public int attack = 0;
	public int gard = 0;


	public Madam(){}

	public Madam(String name,int age){
		this.name = name;
		this.age = age;
	}





	public void skil(){
		System.out.println("アイシクルコフィン");
	}
	public void ability(){
		System.out.println("水属性の攻撃アップ");
	}

	public String getName(){
		return this.name;
	}



}