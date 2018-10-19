package akiyama;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {

		System.out.println("あなたの名前を入力してください");
		Scanner scn = new Scanner(System.in);


		String kaori = scn.next();

		System.out.println(kaori+"さん、おはようございます");


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





		Iterator<ItemList> iter = list.iterator();


		while(iter.hasNext()){
			ItemList item = iter.next();
			item.print();
		}








	}
}
