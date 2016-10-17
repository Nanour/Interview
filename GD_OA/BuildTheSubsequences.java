package oa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuildTheSubsequences {
    private static List<String> buildSubsequences(String S) {
        List<String> res = new ArrayList<String>();
        backtracking(res, S, "", 0);
        Collections.sort(res);
        return res;
    }
    private static void backtracking(List<String> res, String S, String temp, int start) {
        String resToAdd = temp;
        if(resToAdd != "" && !res.contains(resToAdd))
            res.add(resToAdd);
        for (int i = start; i < S.length(); i++) {
            temp += S.charAt(i);
            System.out.println(temp);
            backtracking(res, S, temp, i+1);
            temp = temp.substring(0, temp.length()-1);
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> res = buildSubsequences("abc");
        System.out.println(res);
    }

}
