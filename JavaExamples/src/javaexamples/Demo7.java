package javaexamples;

public class Demo7 {
	// ������ 7. ���� ������������� �������� � ����������
	// ��� ��������� �������� ��� �����, ��������� � ����������, � ������� ��������� �� �����
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int result = 0;
		
		Console.println("Enter value of x : ");  // ����������� ��� ������������
		x = Console.readInt();                 // ���� �������������� �������� x � ����������
		
		Console.println("Enter value of y: ");   // ����������� ��� ������������
		y = Console.readInt();                 // ���� �������������� �������� y � ����������

		result = x * y;                        // ���������� ������������	
		Console.println("Result x*y=" + result); // ����� ���������� �� �����
	}
}
