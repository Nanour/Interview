package oa;

public class RearrangeWord {
    private static String rearrangeWord(String s) {
        char[] array = s.toCharArray();
        int i = s.length()-1, j = i;
        while (i > 0 && array[i] <= array[i-1]) i--;
        if (i == 0) {
            return "";
        }
        while (j > i && array[j] <= array[i-1]) j--;
        swap(array, i-1, j);
        reverse(array, i, array.length-1);
        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            sb.append(c);
        }
        return sb.toString();
    }
    private static void swap(char[] array, int i, int j) {
        char c = array[i];
        array[i] = array[j];
        array[j] = c;
    }
    private static void reverse(char[] array, int i, int j) {
        while (i < j) {
            swap(array, i++, j--);
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String res = rearrangeWord("abcd");
        System.out.println(res+"~~~");
    }

}
