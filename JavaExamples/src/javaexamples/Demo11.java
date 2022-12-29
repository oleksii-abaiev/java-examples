package javaexamples;

public class Demo11 {
	// Пример 11. Использования оператора ветвления
	// эта программа выполняет извлечение квадратного корня
	// из вещественного значения, введенного с клавиатуры, и выводит результат на экран.
	// в случае, если введено отрицательное значение, то выводится сообщение об этом.
	
	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		
		Console.println("Enter the value of: "); // приглашение для пользователя
		x = Console.readDouble();                    // ввод вещественного значения с клавиатуры

		if (x < 0) { // ЕСЛИ (x < 0) 
			// ТО ...
			Console.println("Error: negative number!");
		} else {
			// ИНАЧЕ ...
			y = Math.sqrt(x);
			Console.println("Square root of x = " + y);
		}	
		Console.println("End of program");       // для наглядности выводим сообщение 
	}
}
