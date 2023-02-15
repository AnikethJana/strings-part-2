import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class check
{
    int count=0;
    int coun=0;
    int coun1=0;
    static boolean isAlphabet(char ch)
    {
        if (ch >= 'a' && ch <= 'z')
            return true;
        if (ch >= 'A' && ch <= 'Z')
            return true;
        return false;
    }
    
    int consonants(String str)
    {
        Character vowels[]
            = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
 
        List<Character> al = Arrays.asList(vowels);
 
        StringBuffer sb = new StringBuffer(str);
 
        for (int i = 0; i < sb.length(); i++) {
            
            if (isAlphabet(sb.charAt(i))
                && !al.contains(sb.charAt(i))) {
                count++;
            }
        }
 
        return count;
}
int vowel(String str)
    {
        Character vowels[]
            = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
 
        List<Character> al = Arrays.asList(vowels);
 
        StringBuffer sb = new StringBuffer(str);
 
        for (int i = 0; i < sb.length(); i++) {
            
            if (isAlphabet(sb.charAt(i))
                && al.contains(sb.charAt(i))) {
                coun++;
            }
        }
 
        return coun;
}

int specialCharacter(String str)
{
    Character vowels[]
        = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',1,2,3,4,5,6,7,8,9};

    List<Character> al = Arrays.asList(vowels);

    StringBuffer sb = new StringBuffer(str);

    for (int i = 0; i < sb.length(); i++) {
        
        if (!al.contains(sb.charAt(i))) {
            coun1++;
        }
    }

    return coun1;
}
}

public class check2 {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str = sc.nextLine();
        
        
        check obj = new check();
        System.out.println("consonants present : "+ obj.consonants(str));
        System.out.println("vowels present : "+ obj.vowel(str));
        System.out.println("special character present : "+ obj.specialCharacter(str));
    }
}
