class A_rray{

    public static void main(String [] args){

        int arr[][]={
            {10,20,30},
            {50,60},
            {80,90,100,200}
            
        };

        for(int row=0 ; row<arr.length ; row++){
            for(int col=0 ; col<arr[row].length ; col++){

                System.out.print(arr[row][col] +" ");

            }
            System.out.println("\n");
        }   
     }
}