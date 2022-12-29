package javaexamples;
import java.util.Locale;
import java.util.Scanner;

public class Console {
	private static Scanner scanner;

	static {		
		scanner = new Scanner(System.in);    // инициализация объекта сканера  
		scanner.useLocale(Locale.US);        // настройка американского формата чисел
	}
	
	static int readInt() {
		return scanner.nextInt(); // ввод целочисленного значения x с клавиатуры	 
	}
	
	static double readDouble() {
		return scanner.nextDouble(); // ввод вещественного значения с клавиатуры	
	}

	static void println(String s) {
		System.out.println(s);  // вывод строки текста на экран и переход на новую строку
	}
	
	static void print(String s) {
		System.out.print(s); // вывод строки текста на экран без перехода на новую строку
	}
}

