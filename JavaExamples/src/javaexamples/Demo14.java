package javaexamples;

public class Demo14 {
	// ������ 14. ��������� ����� �� ����� � ������� ��������� break.
	// ��� ��������� ��������� ���������� ����������� ����� 
	// �� ������������� ��������, ���������� � ����������, � ������� ��������� �� �����.
	// ��������� ����������� �������� ��� ���������� �� ���� ����������� ����� 
	// �� ��� ���, ���� ������������ �� ������ ������������� ��������.

	public static void main(String[] args) {
		double x = 0;
		double y = 0;

		// ��� "����������� ����" - ����, ������� �������� ������ �������,
		// � ����� �� ����� �������������� � ������� ��������� break
		while (true) {
			Console.println("Enter the value of x: "); // ����������� ��� ������������
			x = Console.readDouble();                      // ���� ������������� �������� � ����������	

			// ���� ������������ ���� ������������� ��������, �� ���������� ����� �����������
			if (x < 0) {
				Console.println("Error: negative number!");
				break;
			}

			y = Math.sqrt(x);
			Console.println("Square root of x = " + y);

		} // ����� ���� ����� while
		Console.println("End of program");   // ��� ����������� ������� ���������
	}
}
