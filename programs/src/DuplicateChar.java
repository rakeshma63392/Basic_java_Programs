public class DuplicateChar {
    public static void main(String[] args) {
    String str="rakeshaa";
    char[] ch=str.toCharArray();
        int n=str.length();
    for(int i=0;i<n;i++) {
        for (int j = i+1; j < n; j++) {
            if (ch[i] == ch[j]) {
                System.out.println("duplicates are" + "  " + ch[j]);
            }
        }
    }
    }
}
