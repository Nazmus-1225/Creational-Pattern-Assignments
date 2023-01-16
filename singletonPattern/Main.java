package singletonPattern;

public class Main {

	public static void main(String[] args) {
		President president1=President.getInstance("Donald Trump");
		President president2=President.getInstance("Joe Biden");
		
		System.out.println(president1.getName());
		System.out.println(president2.getName());

	}

}
