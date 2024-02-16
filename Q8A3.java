package Assignment3;


import java.util.*;
public class Q6A3 {

    public static void main(String []args){
        try(Scanner sc = new Scanner(System.in)){
            int size = sc.nextInt();
            int []arr= new int[size];
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            // for(int i=0;i<size;i++){
            //     for(int j =1;j<size-1;j++){
            //         if(arr[j]>arr[j+1]){
            //             int temp = arr[j];
            //             arr[j] = arr[j+1];
            //             arr[j+1] = temp;
            //         }
            //     }
            Arrays.sort(arr);
            
            System.out.println("maximum is: "+ arr[size-1]);
        }}
    


}
