package samplejp;
import java.util.Scanner;
public class Array {

	int eno;
	String ename;
	static Scanner sc =new Scanner(System.in);
	
	
	Array(int eno,String ename)
	{
		this.eno=eno;
		this.ename=ename;
	}
	

	void display()
	{
		System.out.println("The Name is"+ename);
		System.out.println("The eno is"+eno);

	}
	public static void main(String[] args)
	{
		System.out.println("enter the size");
		int n=sc.nextInt();
		Array[] arr=new Array[n]; 
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the"+ (i+1) + "th employee name and no: ");
			String Nam=sc.next();
			int no=sc.nextInt();
			arr[i] = new Array(no,Nam);
			System.out.println("The details of" + (i+1) + "th employee");
			arr[i].display();
			
			
		}
		System.out.println("Enter the emp no u want to search.....");
		int search=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i].eno==search)
			{
				System.out.println("The employees present here....and the employee name is"+arr[i].ename);
			}
		}
	}
}
