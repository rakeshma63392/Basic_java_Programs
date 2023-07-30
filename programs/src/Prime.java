public class Prime {
    public static void main(String[] args){
        int n=7;
        boolean IsPrime=true;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                IsPrime=false;
            }
        }
        String result=(IsPrime?"prime":"not prime");
        System.out.println(result);
    }
}
