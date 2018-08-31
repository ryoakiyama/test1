/**
 * 
 */

/**
 * @author internousdev
 *
 */
public class CheckLoadJDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws InstantiationException,IllegalAccessException {
		// TODO 自動生成されたメソッド・スタブ
		String msg = "";
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg = "ドライバーのロードに成功したぜ";
		} catch(ClassNotFoundException e){
			msg = "ドライバーのロードに失敗したぜ";
			
		}
		System.out.println(msg);

	}

}
