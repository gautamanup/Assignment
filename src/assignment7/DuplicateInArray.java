package assignment7;
import java.util.*;
public class DuplicateInArray {


	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of Array: ");
        int length= sc.nextInt();
        int[] array = new int[length];
        for(int i =0; i<array.length;i++) {
            System.out.println("Enter value for index "+i+":");
            array[i] = sc.nextInt();
            }

        DuplicateInArray obj = new DuplicateInArray();

        obj.DupicateInArray(array);
    }
            
        public void DupicateInArray(int[] a) {
        int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k]) {
                    count++;
                }
            }
            
            if(count==1)
            	
               System.out.println(a[j]);
            count = 0;
        }
    
        }
}
