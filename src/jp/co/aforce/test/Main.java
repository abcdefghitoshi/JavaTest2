package jp.co.aforce.test;

public class Main {

	public static void main(String[] args) {
		PracticeTest8 method_test = new PracticeTest8();
		//練習問題1
		method_test.printHello();
		
		//練習問題2
		method_test.printRandomMessage();
		
		//練習問題3
		method_test.printMessage("Hello");
		
		//練習問題4
		method_test.printMessage("hello",5);
		
		//練習問題5
		method_test.printRectangleArea(4,6);
		
		//練習問題6
		System.out.println(method_test.getWeatherForecast());
		
		//練習問題7
		System.out.println(method_test.isEvenNumber(9));
		
		//練習問題8
		System.out.println(method_test.getMessage("たなか",true));
		
		//練習問題9
		String[] arr = { "りんご", "ぶどう", "オレンジ" };
		System.out.println(method_test.getLongestString(arr));
		
		//練習問題10
		Person person_class = new Person("田中",29);
		System.out.println(method_test.isAdult(person_class));

	}

}
