package akiyama;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Helloworld {

	public static void main(String[] args) {


		ItemList il = new ItemList();
		il.taro("かおり");

		Map<String,String> asaka = new HashMap<>();
		asaka.put("samurai","侍");
		asaka.put("engineer", "侍エンジニア");
		asaka.put("house","家");

		System.out.println(asaka.get("house"));
		System.out.println(asaka.get("samurai"));



		for(Map.Entry<String, String>entry : asaka.entrySet()){
			System.out.println(entry.getKey() + ":"+entry.getValue());

		}


		List<String> asaka2 = new ArrayList<>(asaka.values());
		System.out.println(asaka2.get(0));




		ArrayList<ItemList> list = new ArrayList<ItemList>();

		ItemList list1 = new ItemList("えんぴつ",80);
		ItemList list2 = new ItemList("ペン",60);
		ItemList list3 = new ItemList("消しゴム",100);
		ItemList list4 = new ItemList("紙",100);

		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);

		Iterator<ItemList> iter = list.iterator();


		while(iter.hasNext()){
			ItemList item = iter.next();
			item.print();
		}








	}
}
