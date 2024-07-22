import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        int[] array3 = new int[3];
        array3[0] = 36;
        array3[1] = 57;
        array3[2] = 90;

        //task2
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        //task3
        for(int i = array1.length-1; i >= 0; i--){
            System.out.print(array1[i]+ " ");
        }
        System.out.println();
        for(int i = array2.length-1; i >= 0; i--){
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        for (int i = array3.length-1; i >=0; i--){
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        //task4
        for(int i = 0; i < array1.length; i++){
            if(array1[i]%2 != 0){
                array1[i]++;
            }
        }
        System.out.println(Arrays.toString(array1));

    }
}