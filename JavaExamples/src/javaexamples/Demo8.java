package javaexamples;

public class Demo8 {
	// Пример 8. Ввод вещественных значений с клавиатуры
	// эта программа умножает два числа, введенных с клавиатуры, и выводит результат на экран
	
	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double result = 0;
		
		Console.println("Enter value of x: ");   // приглашение для пользователя
		x = Console.readDouble();                    // ввод вещественного значения с клавиатуры
		
		Console.println("Enter value of y: ");   // приглашение для пользователя
		y = Console.readDouble();                    // ввод вещественного значения с клавиатуры
	
		result = x * y;                              // вычисление произведения
		Console.println("Result x*y=" + result); // вывод результата на экран	
	}
}
