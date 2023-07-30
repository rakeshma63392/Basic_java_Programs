public class multiplicationTable {

        public static void main(String args[]){
            int a;
            int n=10;
            int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=n;j++){
                    a=i*j;
                    System.out.print( "  "+a);
                }
                System.out.println(" ");
            }
        }
    }


