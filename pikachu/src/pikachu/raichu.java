package pikachu;

public class raichu extends pikachu {


	public raichu(){}

	public raichu(String name,int level){
		this.name=name;
		this.level=level;

	}



	public void dengeki(){
		System.out.println(name+"のでんげき");
	}

	public void kaminari(){
		System.out.println(name+"のかみなり");
	}

}
