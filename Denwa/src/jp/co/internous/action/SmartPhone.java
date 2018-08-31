package jp.co.internous.action;

public class SmartPhone implements MP3Player,NewFunction {
	public void play(){
		System.out.println("再生をする");
	}

	public void stop(){
		System.out.println("停止をする");
	}

	public void eat(){
		System.out.println("携帯電話を食べる");
	}

	public void waste(){
		System.out.println("携帯電話を捨てる");
	}

}
