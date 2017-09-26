public class Solution344 {
    public String reverseString(String s) {
        if (s == null) return null;
        int i = 0;
        int j = s.length() - 1;
        char [] arr = s.toCharArray();
        while (i < j){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return new String(arr);
    }

}
