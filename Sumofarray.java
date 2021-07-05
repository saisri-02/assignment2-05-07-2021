import java.util.*;

class Sumofarray
{

public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter size of array : ");
	
int n=sc.nextInt();

int a[]=new int[n];

System.out.println("Enter values into array : ");

for(int i=0;i<n;i++)

{
  
a[i]=sc.nextInt();

}
int sum=0;
	
for(int i=0;i<n;i++)
{  
sum+=a[i];

}

System.out.println("Sum = "+sum);

}
}