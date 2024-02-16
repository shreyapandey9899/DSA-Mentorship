package Assignment3;

import java.util.Scanner;

public class Q7A3 {
    public static void main(String []args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the size");
            int size = sc.nextInt();
            int []arr= new int[size];
            System.out.println("enter the elements");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter the element to be searched");
            int e = sc.nextInt();
            
            for (int i=0;i<size;i++){
                if(arr[i]==e){
                  System.out.println("The index a which searched element is :  "+i);  
                }
            }
        }
    }
}
