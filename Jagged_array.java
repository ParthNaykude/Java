//Problem 
//How much days required to the reader to read 1000 pages book 
import java.util.*;
class Jagged_array{


        public static void main(String [] args )
        {
            Scanner sc = new Scanner(System.in);
            int bookpages = 1000;
            int days;
            int pages_read;
            int no_readers ;
            
            System.out.print("Enter the no of readers : ");
            no_readers=sc.nextInt();
            
            int [][]arr;
                    arr = new int[no_readers][];
            for(int row=0 ; row<no_readers ; row++){

                System.out.print("Enter the no of pages you read : ");
                pages_read = sc.nextInt();

                days = bookpages / pages_read ;
                arr[row] = new int[days];
                for(int col = 0 ; col<arr[row].length ; col++){
                        arr[row][col] = pages_read;

                }
                System.out.println();


            }
            System.out.println();

            for(int i=0 ; i<=10 ; i++){

                System.out.print("Day" + i + " \t");

            }
            System.out.println();

            for(int row=0; row<arr.length ; row++){
                for(int col=0 ; col<arr[row].length ; col++){

                    System.out.print(arr[row][col] + "\t");

                }
                System.out.println();
            }




        }


}