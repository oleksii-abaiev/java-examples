package javaexamples;

public class Demo9 {
	// ������ 9. ���������� �������������� �������		
	// ��� ��������� ��������� ���������� ������ �� ������������� ��������
	// ���������� � ����������, ��������� ��������� � ������� ��� �� �����.
	// ������ �������������� ������� ������������ ����������

	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		int rounded = 0;

		Console.println("Enter value of x: "); // ����������� ��� ������������
		x = Console.readDouble();                  // ���� ������������� �������� � ����������
		
		y = Math.sqrt(x);                                  // ���������� ����������� �����
		
		Console.println("Square root of x = " + y);    // ����� ���������� �� �����
		
		rounded = (int)Math.round(y);                      // ���������� ����������
		Console.println("Rounded result =" + rounded); // ����� ���������� �� �����		
	}
}
