

public class Solution165 {

    public int compareVersion(String version1, String version2) {
        String [] ver1 = version1.split("\\.");
        String [] ver2 = version2.split("\\.");
        int len1 = ver1.length;
        int len2 = ver2.length;
        int maxlen = len1 > len2 ? len1 : len2;
        for (int i = 0; i < maxlen; i++) {
            int v1 = 0;
            int v2 = 0;
            if (i < len1) {
                v1 = Integer.parseInt(ver1[i]);
            }
            if (i < len2) {
                v2 = Integer.parseInt(ver2[i]);
            }
            if (v1 < v2) return -1;
            if (v1 > v2) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        new Solution165().compareVersion("1.001.0.1", "1.0");
    }
}
