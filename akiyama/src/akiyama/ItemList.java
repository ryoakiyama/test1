package akiyama;

public class ItemList {

	private String name;
	private int price;

	public ItemList(String name,int price){
		this.name = name;
		this.price = price;
	}

	public void print(){
		System.out.println(name+price+"円");
	}
}
