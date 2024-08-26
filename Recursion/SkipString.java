package Recursion;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skip("sugarapplered"));
    }
    static String skip( String str){
        if (str.isEmpty()) {

            return "";
        }
        // here the string "app" will be skipped but "app" won't be skipped if the substring is apple.
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skip(str.substring(3));
        }else{
            return str.charAt(0)+skip(str.substring(1));
        }
    }
}
