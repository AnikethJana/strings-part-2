
import java.util.Arrays;

public class check3 
{
    public static void main(String[] args) 
    {
        String str1="keep";
        String str2="peek";

        str1=str1.toLowerCase().replace(" ", "");
        str2=str2.toLowerCase().replace(" ", "");

        char []ar1=str1.toCharArray();
        char []ar2=str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1, ar2))
        {
            System.out.println("It's an Anagram");
        }
        else 
        {
            System.out.println("Its not an Anagram");
        }
    }
    
}