import java.util.*;

class Array1 {
    public static void main(String[] args) {

        int arr[][];
        arr = new int[3][]; 
        arr[0] = new int[3]; 
        arr[1] = new int[2]; 
        arr[2] = new int[3]; 

        System.out.println("Enter the elements you need in the Jagged Array:");
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = sc.nextInt();

            }
        }

        System.out.println("Jagged  Array elements are:");

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }

      
    }
}



