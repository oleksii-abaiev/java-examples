package javaexamples;

public class Demo17 {
	// ������ 17. ���������� � ������������� ������������
	
	public static void main(String[] args) {
	    double coordX = 0;
	    double coordY = 0;
	    double length = 0;

		Console.println("Enter X coord : ");
	    coordX = Console.readDouble();                 // ���� ������������� �������� � ����������	

	    Console.println("Enter Y coord: ");
	    coordY = Console.readDouble();                 // ���� ������������� �������� � ����������	

	    // ����� ������������ calculateLengthOfVector ��� ���������� ����� �������.
	    // ���������� ��������� - coordX, coordY.
	    // ��� ������ ������������ �� �������� ����� ��������
	    // � ������������ ��� ��������� x � y (��. ���������� ������������).
	    // ������������ �������� ����� ������ �� ������������ 
	    // ����� ��������� ���������� length

	    length = calculateLengthOfVector(coordX, coordY);
	    Console.println("Length of vector = " + length);
	}
	
	// ��������� ������������ � ������ calculateLengthOfVector
	// ����������� ����� ������� (x,y) �� ���������
	// ��� ������������� �������� double
	// ������ ���������� ����������  ������� �� ���� ����������
	// double x � double y  - ��������� �������
	static double calculateLengthOfVector(double x, double y) {
		double len = 0;              // ���������� ��������� ���������� len
	    len = Math.sqrt(x*x + y*y);  // ���������� ����� �������
	    return len;                  // ������� �� ������������, ������������ �������� ����� len
	}
}
