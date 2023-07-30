public class alphabetSorting {
    public static void main(String args[]) {


        String Name[] = {"rakesh", "rakshi", "ananda ", "lakshmi"};
        int n = Name.length;
        String temp;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i+1; j < n; j++) {
                if (Name[j].compareTo(Name[i]) > 0) {
                    temp = Name[i];
                    Name[i] = Name[j];
                    Name[j] = temp;
                }

            }
        }

        for (i = 0; i < n; i++) {
            System.out.println(Name[i]);
        }

 }
}


