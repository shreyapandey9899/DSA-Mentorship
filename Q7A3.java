package Assignment3;
import java.util.*;
    public class Q5A3 {
        public static void main(String []args) {
            try(Scanner sc=new Scanner(System.in)){
                System.out.println("Enter the size:  ");
                int n=sc.nextInt();
                System.out.println("Enter the elements: ");
                int nums[]=new int[n];
                for(int i=0;i<n;i++){
                    nums[i]=sc.nextInt();
                }
                int suM=0;
                for(int i=0;i<n;i++){
                    suM=suM+nums[i];  
                }
                int MiNo=((n*(n+1))/2)-suM;
            
                System.out.println("The missing number is "+ MiNo);
            }   
        }
    }