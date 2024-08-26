package searching;

public class SearchInRange {
    public static void main(String[] args) {
        String name = "abhigyan";
        char target = 'b';
        System.out.println(search(name,target,1,4));
    }
    static boolean search (String str , char target,int start , int end){
        if(str.length() == 0){
            return false;
        }
        for (int index = start; index <=end ; index++) {
            if(target == str.charAt(index)){
                return true;
            }
        }
        return false;
    }
}
