import java.util.Scanner;

public class HelloWorld {
	
	static char getMaxOccurringChar(String str)
	{
		
		int count[] = new int[256];

		
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1; // Initialize max count
		char result = ' '; // Initialize result

		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}


	public static void main(String[] args)
	{
		String str ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str = sc.nextLine();
        
        // entering space will give ' ' as output
		System.out.println("Max occurring character is "
						+ getMaxOccurringChar(str));
	}
}
