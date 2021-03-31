import java.util.*;
public class Solution {
	public static int numberOfSteps (int num) {
        int count=0;
        while(num>0)
        {
            if(num%2==0)
            {
            num=num/2;
            }
            else 
                num--;
            count++;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int num=sc.nextInt();
		 int result=numberOfSteps(num);
		 System.out.println("Number of steps to reduce it to zero is " + result);
	}

}
