package javaexamples;

public class Demo10 {
	// Пример 10. Логические операции
	// эта программа выполняет проверку вхождения вещественного значения,
	// введенного с клавиатуры, в заданный диапазон, и выводит результат на экран

	public static void main(String[] args) {
		double x1 = 5.75;                       // левая граница диапазона (включается)
		double x2 = 15.5;                       // правая граница диапазона (исключается)
		
		boolean b = false;
		double x = 0;

		Console.println("The range is [ " + x1 + "; "  + x2 + ")"); // выводим границы диапазона
		
		Console.println("Enter value of x: "); // приглашение для пользователя
		x = Console.readDouble();            // ввод вещественного значения с клавиатуры

		b = (x1 <= x) & (x < x2);            // выполняем проверку на вхождение числа в диапазон
		
		Console.println("The value of x belongs to the given range: " + b); // выводим результат
	}
}
