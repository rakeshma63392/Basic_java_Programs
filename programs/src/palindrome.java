public class palindrome {

    public static void main(String[] args) {
        String str = "pinku";
        boolean isPalindrome=true;
        int j = str.length()-1;
        System.out.println(j);
        for (int i = 0; i<j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome=false;
            }
        }
        String result=(isPalindrome? "palindrome":"notpalindrome");
        System.out.println(result);

    }
}
