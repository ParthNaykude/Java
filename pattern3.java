import java.util.*;

public class pattern3{
    public static void main(String[] args){
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int spaces=2*(5-1);
       for(int j=0;j<spaces;j++){
        System.out.print(" " );
    }
}}