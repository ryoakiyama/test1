package jp.co.internous.action;

public class SmartPhone extends Phone implements MP3Player,NewFunction{
	public void play(){
		System.out.println("再生");
	}
	public void stop(){
		System.out.println("停止");
	}
	
	public void next(){
		System.out.println("次へ");
	}
	
	public void back(){
		System.out.println("戻る");
	}
	
	public void call(){
		System.out.println("電話");
	}
	
	public void mail(){
		System.out.println("メール");
	}
	
	public void photo(){
		System.out.println("写真");
	}
	
	public void internet(){
		System.out.println("インターネット");
	}

}
