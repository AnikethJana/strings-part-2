public class Check {
    public static void main(String[] args) {
        String str = "aabbcc";
        int count;
        str = str.toLowerCase();
        for (char i='a';i<='z';i++){
            count =0;
            for (int j = 0;j<str.length();j++){
                if(str.charAt(j)==i){
                    count ++;
                }
            }
            if(count > 1){
                System.out.println(i);
            }
        }
    }
}
