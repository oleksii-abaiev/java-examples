package javaexamples;

public class Demo10 {
	// ������ 10. ���������� ��������
	// ��� ��������� ��������� �������� ��������� ������������� ��������,
	// ���������� � ����������, � �������� ��������, � ������� ��������� �� �����

	public static void main(String[] args) {
		double x1 = 5.75;                       // ����� ������� ��������� (����������)
		double x2 = 15.5;                       // ������ ������� ��������� (�����������)
		
		boolean b = false;
		double x = 0;

		Console.println("The range is [ " + x1 + "; "  + x2 + ")"); // ������� ������� ���������
		
		Console.println("Enter value of x: "); // ����������� ��� ������������
		x = Console.readDouble();            // ���� ������������� �������� � ����������

		b = (x1 <= x) & (x < x2);            // ��������� �������� �� ��������� ����� � ��������
		
		Console.println("The value of x belongs to the given range: " + b); // ������� ���������
	}
}
