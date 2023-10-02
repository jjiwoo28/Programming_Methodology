
public class jwTest {
	public static void main(String [] args) {
		int a = 10;
		int b = a;
		
		b = 3;
		
		System.out.println(a);
		System.out.println(b);
				
		String c = new String("fef");
		String d = "test";
		String e = d;
		
		e = "jjiwoo";
		System.out.println(d);
		System.out.println(e);
		
		
		int z[] = {1,2,3};
		int x[] = z.clone();
		System.out.println(" array : z " + System.identityHashCode(z));
		System.out.println(" array : z " + z);	
		System.out.println(" array : x " + System.identityHashCode(x));
		System.out.println(" array : x " + x);	
		int h[] = z;
		
		System.out.println(" array : x " + System.identityHashCode(h));
		System.out.println(" array : x " + h);	
		
		
				
	}
	
}
