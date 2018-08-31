package pikachu;

public class Person {
	public static void main(String[] args){
		raichu A = new raichu("ライチュウ",50);
		raichu B = new raichu("カビゴン",30);

		A.dengeki();
		A.shippo();
		System.out.println("あなたの"+A.name+"のレベルは"+A.level);
		System.out.println("あなたの"+B.name+"のレベルは"+B.level);

		if(A.level > B.level){
			System.out.println(A.name+"は"+B.name+"を倒した");
		} else{
			System.out.println(B.name+"は"+A.name+"を倒した");
		}






	}
}
