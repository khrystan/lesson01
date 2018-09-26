package gmail.ozyura1985;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello, world!!!");
		//Завдання 1. Примітивні типи даних:
		//byte-->цілочисельні типи даних--(-128 .. 127)
		//short-->цілочисельні типи даних--(-32,768 .. 32,767)
		//int-->цілочисельні типи даних--(-2,147,483,648 .. 2,147,483,647)
		//long-->цілочисельні типи даних--(-9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807)
		//char-->тип даних для представлення символів--(0 до 65535)
		//float-->типи даних з плаваючою комою--(3.40282347 x 1038, 1.40239846 x 10-45)
		//double->типи даних з плаваючою комою--(1.7976931348623157 x 10308, 4.9406564584124654 x 10-324)
		//boolean--> тип даних призначений для зберігання логічних значень і має два значення:true або false
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

		
		//Завдання 2.Вивести на консоль мінімальне та максимальне значення типів даних:
		
		float num1 = 4.25f;
		int num2 =5;
 
		System.out.println("Max число: " + Math.max(num1,num2));
		System.out.println("Min число: " + Math.min(num1,num2));
		
		
		//3. Створити масив, знайти мінімальне та максимальне значення в масиві:
		int array[] = {1,2,3,4,6,7,8,9,10};
        int max = array[0];
        for (int v = 0; v < 9; v++) {
            if (max < array[v])
                max = array[v];
        }
        System.out.println("Максимальне число в масиві: " + max);
        
        int array1[] = {1,2,3,4,6,7,8,9,10};
        int min = array1[0];
        for (int o= 0; o > 9; o--) {
            if (min > array1[o])
                min = array1[o];
        }
        System.out.println("Мінімальне число в масиві: " + min);
		
		
	}

}
// First commit to GitHub