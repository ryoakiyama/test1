package jp.co.internous.action;

public class Capsule {
	public static void main(String[] args){
	Person taro = new Person("太郎",20);
	System.out.println(taro.getName());
	taro.setName("花子");
	System.out.println(taro.getName());

}
}
