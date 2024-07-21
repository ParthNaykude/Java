import java.util.*;

class Arra_y{

    public static void main(String [] args){

        int arr[]=new int[5];
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the elements in array : ");
        for(int row=0 ; row<arr.length ; row++){
            arr[row] = sc.nextInt();
            }
        
        System.out.println("The Array Elements : ");
        for(int row=0 ; row<arr.length ; row++){

            System.out.print(arr[row] +" ");
        }
    }
}