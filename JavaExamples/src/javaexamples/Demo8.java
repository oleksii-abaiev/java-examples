package javaexamples;

public class Demo8 {
	// ������ 8. ���� ������������ �������� � ����������
	// ��� ��������� �������� ��� �����, ��������� � ����������, � ������� ��������� �� �����
	
	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double result = 0;
		
		Console.println("Enter value of x: ");   // ����������� ��� ������������
		x = Console.readDouble();                    // ���� ������������� �������� � ����������
		
		Console.println("Enter value of y: ");   // ����������� ��� ������������
		y = Console.readDouble();                    // ���� ������������� �������� � ����������
	
		result = x * y;                              // ���������� ������������
		Console.println("Result x*y=" + result); // ����� ���������� �� �����	
	}
}
