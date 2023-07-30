public class HighestArray {
    public static void main(String[] args) {
        int temp, size;
        int array[] = {50, 20, 40, 30, 10};
        size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
                }
            }for(int i=0;i<size;i++){
            System.out.println(array[i]);

        }System.out.println("first largest array "+array[4]);
        System.out.println("second largest array "+array[3]);
        System.out.println("third largest array "+array[2]);
        System.out.println("fourth largest array "+array[1]);
        System.out.println("fifth largest array "+array[0]);
        }
    }

