
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int i;
		double sum = 0.0, avg;
		double dnum[] =new double[5];
		
		System.out.println("Length of dmun:"  + dnum.length);
		System.out.println("Uninitailized dnum[] value: ");
		
		for (int j = 0; j < dnum.length; j++) {
			System.out.print(dnum[j]+" ");
		}
		System.out.println();
		
		for (int j = 0; j < dnum.length; j++) {
			System.out.print("dnum["+j+"] values: ");
			dnum[j] = stdin.nextDouble();
		}
		
		for (int j = 0; j < dnum.length; j++) {
			sum += dnum[j];
			
		}
		
		System.out.println("Sum of the array element: " + sum);
		avg = sum/dnum.length;
		
		System.out.println("Sum of the arrray elements: " + sum);
		System.out.println("the average  of the array elements: " + avg);
		
		double test[] = dnum;
		
		test[2] = 1000;
		
		for (int j = 0; j < dnum.length; j++) {
			System.out.println(dnum[j]);
		}
		

	}

}
