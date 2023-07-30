public class Immutable_Strings {
    public static void main(String[] args) {
       String name="rakesh";
        name=name+"rocky";
        System.out.println(name);

        //here we cant change the data So it creates new object of address then it updates
        // u just changing the address
        // before data will go to garbage strings



        // for mutable string we use stringBuffer
        //stringBuffer and StringBuilder are mutable classes

       StringBuffer namee = new StringBuffer("rakesh");
       namee.append("rocky");
       System.out.println(name);
    }
}
