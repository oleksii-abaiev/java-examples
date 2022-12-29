package javaexamples;

public class Demo11 {
	// ������ 11. ������������� ��������� ���������
	// ��� ��������� ��������� ���������� ����������� �����
	// �� ������������� ��������, ���������� � ����������, � ������� ��������� �� �����.
	// � ������, ���� ������� ������������� ��������, �� ��������� ��������� �� ����.
	
	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		
		Console.println("Enter the value of: "); // ����������� ��� ������������
		x = Console.readDouble();                    // ���� ������������� �������� � ����������

		if (x < 0) { // ���� (x < 0) 
			// �� ...
			Console.println("Error: negative number!");
		} else {
			// ����� ...
			y = Math.sqrt(x);
			Console.println("Square root of x = " + y);
		}	
		Console.println("End of program");       // ��� ����������� ������� ��������� 
	}
}
