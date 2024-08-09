import java.util.*;

class Primary {
        int bookpages = 1000;
        int days;
        int pages_read;
        int no_readers ;

}
class Secondary extends Primary{
    int [][]arr;
    void Info(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of readers : ");
        no_readers=sc.nextInt();
        
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

    }

}
class Show1 extends Secondary {
    void Sho_w(){
        Info();

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
class Main2{
    public static void main(String [] args ){
        Show1 S =new Show1();
        S.Sho_w();
        

    }
}