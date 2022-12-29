package javaexamples;
import java.util.Locale;
import java.util.Scanner;

public class Console {
	private static Scanner scanner;

	static {		
		scanner = new Scanner(System.in);    // ������������� ������� �������  
		scanner.useLocale(Locale.US);        // ��������� ������������� ������� �����
	}
	
	static int readInt() {
		return scanner.nextInt(); // ���� �������������� �������� x � ����������	 
	}
	
	static double readDouble() {
		return scanner.nextDouble(); // ���� ������������� �������� � ����������	
	}

	static void println(String s) {
		System.out.println(s);  // ����� ������ ������ �� ����� � ������� �� ����� ������
	}
	
	static void print(String s) {
		System.out.print(s); // ����� ������ ������ �� ����� ��� �������� �� ����� ������
	}
}

