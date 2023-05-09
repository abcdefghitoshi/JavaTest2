package jp.co.aforce.test;

public class Main {

	public static void main(String[] args) {
		PracticeTest8 test = new PracticeTest8();
		//練習問題1
		test.printHello();
		
		//練習問題2
		test.printRandomMessage();
		
		//練習問題3
		test.printMessage("Hello");
		
		//練習問題4
		test.printMessage("hello",5);
		
		//練習問題5
		test.printRectangleArea(4,6);
		
		//練習問題6
		System.out.println(test.getWeatherForecast());
		
		//練習問題7
		System.out.println(test.isEvenNumber(9));
		
		//練習問題8
		System.out.println(test.getMessage("たなか",true));
		
		//練習問題9
		String[] arr = { "りんご", "ぶどう", "オレンジ" };
		System.out.println(test.getLongestString(arr));
	
		//練習問題10
		Person person_class = new Person("古塚",29);
		System.out.println(test.isAdult(person_class));

	}

}
