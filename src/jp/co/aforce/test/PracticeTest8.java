package jp.co.aforce.test;


public class PracticeTest8 {

	//練習問題１
	public void printHello() {
		System.out.println("Hello");
	}

	//練習問題２

	public void printRandomMessage() {
		String[] str = new String[3];
		str[0] = "こんばんは";
		str[1] = "こんにちは";
		str[2] = "おはよう";
		int n = (int) (3 * Math.random());
		System.out.println(n);
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
		int dayIdx = (int)(3 * Math.random());
		int weatherIdx = (int)(4 * Math.random());
		String[] days = {"今日", "明日", "明後日"};
		String[] weather = {"晴れ", "曇り", "雨", "雪"};
		
		return String.format("%sの天気は%sでしょう。", days[dayIdx], weather[weatherIdx]);
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
		int ansIdx = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() >= array[ansIdx].length()) {
				ansIdx = i;
			}
		}
		return array[ansIdx];
	}
	
	//練習問題１０
       boolean isAdult(Person person) {
		
		return(person.getAge() >= 20);
	}
}


