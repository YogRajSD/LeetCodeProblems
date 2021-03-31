import java.util.*;
	
	class Xor{
		    public static  int xorOperation(int n, int start) {
		        int res=0;
		        for(int i=0;i<n;i++){
		            res =res^ start + 2 * i;
		        }
		        return res;
		}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the Starting point");
		int start=sc.nextInt();
		System.out.println(xorOperation(n,start));
	}
	}
