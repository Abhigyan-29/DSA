package Recursion;

public class SubSequence {
    public static void main(String[] args) {
subsequence("","abc");
    }
    static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //taking it first
        subsequence(p+ch,up.substring(1));
        // then rejecting
        subsequence(p,up.substring(1));
        subsequence(p+(ch+0), up.substring(1));
    }
}
