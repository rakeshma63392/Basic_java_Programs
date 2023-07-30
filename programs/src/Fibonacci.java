public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        int result=0;
        int v1=0;
        int v2=1;
       System.out.println(v1);
        System.out.println(v2);
        for(int i=0;i<n-2;i++) {
            result=v1+v2;
            v1=v2;
            v2=result;
            System.out.println(result);

        }
    }
}
