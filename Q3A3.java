package Assignment3;
import java.util.*;
public class Q3A3 {
    public static void main(String []args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the size");
            int size = sc.nextInt();
            int []arr= new int[size];
            System.out.println("enter the elements");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter the element to be counted");
            int e = sc.nextInt();
            int count=0;
            for (int i=0;i<size;i++){
                if(arr[i]==e){
                    count=count+1;
                }
            }
            System.out.println(count);
        }
    }
}
