/**
 * 
 */

/**
 * @author internousdev
 *
 */
public class ChkLoadJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InstantiationException,IllegalAccessException {
		
		String msg = "";
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg = "ドライバーのロードに成功しました。";
		}catch(ClassNotFoundException e){
			msg = "ドライバーのロードに失敗しました。";
		}
		System.out.println(msg);
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
