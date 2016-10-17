package oa;

import java.util.ArrayList;
import java.util.List;

public class MissingWord {
    private static String[] findMissingWord(String S, String T) {
        String[] strS = S.split("\\s+");
        String[] strT = T.split("\\s+");
        List<String> res = new ArrayList<String>();
        int i = 0, j = 0;
        for (i = 0, j = 0; i < strS.length && j < strT.length; ) {
            if (strS[i].equals(strT[j])) {
                i++;
                j++;
            } else {
                res.add(strS[i]);
                i++;
            }
        }
        while(i < strS.length) {
            res.add(strS[i++]);
        }
        String[] resArray = new String[S.length()];
        return res.toArray(resArray);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String[] res = findMissingWord("I am using as to improve programming", "am as to improve");
	    System.out.println(res[2]);
	}

}
