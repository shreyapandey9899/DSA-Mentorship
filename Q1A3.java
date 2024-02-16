package Assignment3;

import java.util.*;

public class Q1A3 {
    public static void main(String []args){
        try(Scanner sc = new Scanner(System.in)){
            int size = sc.nextInt();
            int []arr= new int[size];
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            if(arr[0]>arr[1]){
                System.out.println(0);
            }
            if(arr[size-1]>arr[size-2]){
                System.out.println(size-1);
            }
            for(int i=1;i<size-1;i++){
                if(arr[i]>arr[i-1]&& arr[i]>arr[i+1]){
                    System.out.println(i);
                }
            }
        }
    }
}