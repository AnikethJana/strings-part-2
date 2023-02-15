import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class uniqueCharacter {
    int count =0;
    int specialCharacter(String str)
{
    
    Character vowels[]
        = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',1,2,3,4,5,6,7,8,9};

    List<Character> al = Arrays.asList(vowels);

    StringBuffer sb = new StringBuffer(str);

    for (int i = 0; i < sb.length(); i++) {
        
        if (!al.contains(sb.charAt(i))) {
            count++;
        }
    }
    if(count == str.length()){
        System.out.println("it has all characters  special");
    }
    else{
        System.out.println("it doesnt !!");
    }
    return 0;
}
}

public class special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ="";
        System.out.print("Enter A string to determine : ");
        str = sc.nextLine();
        uniqueCharacter obj = new uniqueCharacter();
        obj.specialCharacter(str);
    }
    
}
