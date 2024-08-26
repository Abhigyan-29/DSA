package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abs");
        for (String ss : ans) {
            System.out.println(ss);
        }
    }

    static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();

        //base case
        if (s.length() == 0) {
            ans.add(" ");
        }

        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));//[bc,b,c," "]
        // ans  = [bc,b,c," " , abc,ab,ac,"a"]
        for (String ss : smallAns)
        //for (int i = 0; i < smallAns.size(); i++) {
        //    String ss = smallAns.get(i);
        //    }
        {
            ans.add(ss); //bc
            ans.add(curr + ss); //abc


        }
        return ans;

    }
}
