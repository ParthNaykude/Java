class Sort{//Bubble Sort 
        public static void main(String [] args ){

        int [] arr={20,30,40,50,60,10};
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length-1-i ;j++){
                if(arr[j]>arr[j+1]){
                    int temp=0;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }
            }
        }

        for(int i=0 ; i<6 ;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}