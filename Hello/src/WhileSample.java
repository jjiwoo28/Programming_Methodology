
public class WhileSample {
	public static void main(String[] args)
	{
		System.out.println("test");
		char c = 'a';
		
		while (c <= 'Z') {
			System.out.println(c);
			System.out.println((int)c);
			c = (char)(c+1);
			
			
		}
	}

}
