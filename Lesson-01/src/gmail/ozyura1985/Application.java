package gmail.ozyura1985;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello, world!!!");
		//�������� 1. �������� ���� �����:
		//byte-->����������� ���� �����--(-128 .. 127)
		//short-->����������� ���� �����--(-32,768 .. 32,767)
		//int-->����������� ���� �����--(-2,147,483,648 .. 2,147,483,647)
		//long-->����������� ���� �����--(-9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807)
		//char-->��� ����� ��� ������������� �������--(0 �� 65535)
		//float-->���� ����� � ��������� �����--(3.40282347 x 1038, 1.40239846 x 10-45)
		//double->���� ����� � ��������� �����--(1.7976931348623157 x 10308, 4.9406564584124654 x 10-324)
		//boolean--> ��� ����� ����������� ��� ��������� ������� ������� � �� ��� ��������:true ��� false
		byte b; 
		short sh; 
		int i=67;
		long l = 39009284783278l; 
		b = -13;
		sh = 1000;
		
		System.out.println(b);
		System.out.println(sh);
		System.out.println(i);
		System.out.println(l);
		
		
		float f; 
		f = 3.998f; 
		double d;
		d = -340.349489287;
		float ff = -3.99f; 
		double dd = 779303028.3398;
		
		System.out.println(ff);
		System.out.println(dd);

		
		//�������� 2.������� �� ������� �������� �� ����������� �������� ���� �����:
		
		float num1 = 4.25f;
		int num2 =5;
 
		System.out.println("Max �����: " + Math.max(num1,num2));
		System.out.println("Min �����: " + Math.min(num1,num2));
		
		
		//3. �������� �����, ������ �������� �� ����������� �������� � �����:
		int array[] = {1,2,3,4,6,7,8,9,10};
        int max = array[0];
        for (int v = 0; v < 9; v++) {
            if (max < array[v])
                max = array[v];
        }
        System.out.println("����������� ����� � �����: " + max);
        
        int array1[] = {1,2,3,4,6,7,8,9,10};
        int min = array1[0];
        for (int o= 0; o > 9; o--) {
            if (min > array1[o])
                min = array1[o];
        }
        System.out.println("̳������� ����� � �����: " + min);
		
		
	}

}
// First commit to GitHub