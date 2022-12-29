package javaexamples;

public class Demo17 {
	// Пример 17. Объявление и использование подпрограммы
	
	public static void main(String[] args) {
	    double coordX = 0;
	    double coordY = 0;
	    double length = 0;

		Console.println("Enter X coord : ");
	    coordX = Console.readDouble();                 // ввод вещественного значения с клавиатуры	

	    Console.println("Enter Y coord: ");
	    coordY = Console.readDouble();                 // ввод вещественного значения с клавиатуры	

	    // Вызов подпрограммы calculateLengthOfVector для вычисления длины вектора.
	    // Актуальные параметры - coordX, coordY.
	    // При вызове подпрограммы их значения будут переданы
	    // в подпрограмму как параметры x и y (см. объявление подпрограммы).
	    // Возвращаемое значение после выхода из подпрограммы 
	    // будет присвоено переменной length

	    length = calculateLengthOfVector(coordX, coordY);
	    Console.println("Length of vector = " + length);
	}
	
	// объявлена подпрограмма с именем calculateLengthOfVector
	// вычисляющая длину вектора (x,y) на плоскости
	// тип возвращаемого значения double
	// список формальных параметров  состоит из двух параметров
	// double x и double y  - координат вектора
	static double calculateLengthOfVector(double x, double y) {
		double len = 0;              // объявление локальной переменной len
	    len = Math.sqrt(x*x + y*y);  // вычисление длины вектора
	    return len;                  // возврат из подпрограммы, возвращаемое значение равно len
	}
}
