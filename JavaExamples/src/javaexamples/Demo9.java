package javaexamples;

public class Demo9 {
	// Пример 9. Вычисление математических функций		
	// эта программа извлекает квадратный корень из вещественного значения
	// введенного с клавиатуры, округляет результат и выводит его на экран.
	// другие математические функции используются аналогично

	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		int rounded = 0;

		Console.println("Enter value of x: "); // приглашение для пользователя
		x = Console.readDouble();                  // ввод вещественного значения с клавиатуры
		
		y = Math.sqrt(x);                                  // вычисление квадратного корня
		
		Console.println("Square root of x = " + y);    // вывод результата на экран
		
		rounded = (int)Math.round(y);                      // округление результата
		Console.println("Rounded result =" + rounded); // вывод результата на экран		
	}
}
