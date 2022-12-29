package javaexamples;

public class Demo7 {
	// Пример 7. Ввод целочисленных значений с клавиатуры
	// эта программа умножает два числа, введенных с клавиатуры, и выводит результат на экран
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int result = 0;
		
		Console.println("Enter value of x : ");  // приглашение для пользователя
		x = Console.readInt();                 // ввод целочисленного значения x с клавиатуры
		
		Console.println("Enter value of y: ");   // приглашение для пользователя
		y = Console.readInt();                 // ввод целочисленного значения y с клавиатуры

		result = x * y;                        // вычисление произведения	
		Console.println("Result x*y=" + result); // вывод результата на экран
	}
}
