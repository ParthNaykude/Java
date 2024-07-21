import java.util.*;

class Array{
    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);

        int arr[][]=new int [2][3];
        System.out.println("Enter The first element (6) : " );
        for(int row=0 ; row<arr.length ; row++ ){
            for(int col=0 ; col<arr[row].length ; col++){

            
                arr[row][col]=sc.nextInt();
                

            }
        }
        System.err.println("Stored in Two dimensional array ");
        for(int row=0 ; row<arr.length ; row++ ){
            for(int col=0 ; col<arr[row].length ; col++){

                System.out.print(arr[row][col] + " ");
            }
            System.out.println("\n");
        }
    }

}