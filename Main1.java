import java.util.*;

class Primary {
    int arr [][]=new int[2][3];
    void Info(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the 6 number to stoer in array");
    for(int i =0 ; i< arr.length ; i++){
        for(int j =0 ; j< arr[i].length ; j++){
            arr[i][j]= sc.nextInt();
        }
    }

    }
}10
class Secondary extends Primary {
    void Show(){
        Info();

        System.out.println ("The array elements stored ");

        for(int i =0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }


}
class Main1{
    public static void main(String [] args ){
 
        Secondary S = new Secondary();
        S.Show();
    }
}