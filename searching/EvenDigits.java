package searching;

public class EvenDigits {
    public static void main(String[] args) {
int [] nums = {12,345,2,6,7896};
        System.out.println(FindNumbers(nums));
        System.out.println(digits(-789));
    }
    static  int FindNumbers(int[] nums){
        int count = 0;
        //for every numbers in number
        for(int num : nums){
           if (even(num)){
               count++;
           }
        }
        return count;
    }
    //function to check whether a number contains even digits of number or not
     static boolean even(int num) {
        int numberofdigits = digits(num);
        if (numberofdigits % 2 == 0){
            return true;
        }
        return false;
    }
    //count number of digits in a number
    static int digits(int num){
        int count =0;

        while (num> 0){
            count ++;
            num = num/10;
        }
        return count;
    }
}
