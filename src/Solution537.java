public class Solution537 {
    public String complexNumberMultiply(String a, String b) {
        String [] aa = a.replace("i", "").split("\\+");
        String [] bb = b.replace("i", "").split("\\+");
        int [] n1 = new int[2];
        int [] n2 = new int[2];
        for (int i = 0; i < 2; i++) {
            n1[i] = Integer.parseInt(aa[i]);
            n2[i] = Integer.parseInt(bb[i]);
        }
        int r = n1[0]*n2[0] - n1[1]*n2[1];
        int v = n1[0]*n2[1] + n1[1]*n2[0];
        return r + "+" + v + "i";
    }
}
