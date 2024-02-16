package Assignment3;
import java.util.*;

public class Q4A3 {
    public static void main(String []args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter the size ");
            int size = sc.nextInt();
            int num[]=new int[size];
            System.out.println("enter elements");
            for (int i=0; i<size;i++){
                num[i]=sc.nextInt();
            }
            int count=0;
            for(int l=0;l<size;l++){
               if (num[l]==0){
                    count=count+1;
               }
            }
            for(int m =0;m<count;m++){
            for(int j=0;j<size-1;j++){
                if (num[j]==0){
                    int temp= num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }}
            for(int k =0;k<size;k++)
            System.out.println(num[k]);
        }
    }
}
