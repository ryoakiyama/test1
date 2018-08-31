package jp.co.internous.action;

public class hairetsu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] points = new int[3];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		
		int moneyList[] = {121902,8302,55100};
		for(int i = 0;i < moneyList.length;i++){
			System.out.println(moneyList[i]);	
		}
		
		for(int value : moneyList){
			System.out.println(value);
		}
	
		int numbers[] = {3,4,9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for(int n : numbers){
			if(n==input){
				System.out.println("あたりです");
			}
		}
		


	}

}
