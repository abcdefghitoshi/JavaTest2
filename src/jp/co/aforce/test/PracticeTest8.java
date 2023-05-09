package jp.co.aforce.test;


public class PracticeTest8 {

	//練習問題１
	public void printHello() {
		System.out.println("Hello");
	}

	//練習問題２

	public void printRandomMessage() {
		int n = (int) (3 * Math.random());
		switch(n) {
		case 0:
			System.out.println("こんばんは");
			break;
		case 1:
			System.out.println("こんにちは");
			break;
		default:
			System.out.println("おはよう");
		}
	}
	
	//練習問題３
	
	 void printMessage(String message) {
		System.out.println(message);
	}

	//練習問題４
	 public void printMessage(String message, int count) {
			for(int i = 0; i < count; i++) {
				System.out.println(message);
			}
		}
	
	

	//練習問題５
	void printRectangleArea(double height, double base) {
		System.out.println(height * base);
	}
	

	//練習問題６
	public String getWeatherForecast() {
		int n = (int) (3 * Math.random());
		String date;
		switch(n) {
		case 0:
			date = "今日";
			break;
		case 1:
			date = "明日";
			break;
		default:
			date = "明後日";
		}
		
		int m = (int) (4 * Math.random());
		String weather;
		switch(m) {
		case 0:
			weather = "晴れ";
			break;
		case 1:
			weather = "曇り";
			break;
		case 2:
			weather = "雨";
			break;
		default:
			weather = "雪";
		}
		return date + "の天気は" + weather + "でしょう。";
	}
	
	//練習問題７
	
	public boolean isEvenNumber(int value){
		if(value % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	//練習問題８
	public String getMessage(String name, boolean isKid) {
		if(isKid) {
			return "こんにちは。" + name + "ちゃん。";
		}else {
			return "こんにちは。" + name + "さん。";
		}
	}
	//練習問題９
	
	public String getLongestString(String[] array) {
		int leng = 0;
		
		for(int m = 0; m < array.length; m++) {
			if(array[m].length() >= array[leng].length()) {
				leng = m;
			} 
		}
		return  array[leng];
	}
	
	//練習問題１０
       boolean isAdult(Person person) {
		
		return(person.getAge() >= 20);
	}
}


