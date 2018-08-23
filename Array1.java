import java .util.Scanner;
import java.util.Arrays;
public class Array1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("STRING DETAILS:\t");                                                               //string class
		String s1="hello sri welcome to java";
		String s2="srinisha";
		String s3="raja";
		System.out.println("\t the string name is\t " +s1);
		System.out.println("\t the string name is\t " +s2);
		System.out.println("\t the string name is\t " +s3);
		System.out.println("the length of the third  string is:\t" +s3.length());                              //count the no of character in string
		System.out.println("\t the string s1 is located at the index:" +s1.indexOf('r') );                     //To count the index
		System.out.println("\t the string s1 located ath the index:" +s1.indexOf('i'));
		System.out.println("\t the concatenation of two strings:" +s1.concat(s2));                             //concatenate the two strings
		System.out.println("\t the uppercase of the string of  is:\t" +s1.toUpperCase());                      //convert to uppercase
		System.out.println("\t the lowercase of the string is:\t"+s1.toLowerCase());                           //convert to lowercase
		System.out.println("\t the trim is:\t" +s1.trim());
		System.out.println("\t the replace the character of the string is:\t" +s3.replace('r','k' ));          //replace the old character by new character
		if(s1.equals("hello sri"))                                                                             //check foe equal condition
		{
		System.out.println("s1 equal ");	
		}
		else
		{
			System.out.println("s1 is not equal");
		}
		if(s3.equalsIgnoreCase(s2))                                                                             //check for ignorecase
		{
			System.out.printf("%s",s3,s2);
		}
		else
		{
			System.out.println("s3 does not equal to s2");
		}
			System.out.println("ARRAY DETAILS:\t");                                                               // declaraing 1D array
		int a[]=new int[5];
		int a1[]=new int[5];
		int i,n,j,sum=0;
		int temp,k;

		float avg=0;
		int rollno,id;
		int[][] b= {{0,1},{1,32,22},{41}};                                                                         //declaring 2D array
	System.out.println("enter 5 elements in array 1");
		for(i=0;i<5;i++)
		{
			a[i]=input.nextInt();
		}
		System.out.println("enter 5 elements in array 2");
		for(i=0;i<5;i++)
		{
			a1[i]=input.nextInt();
		}
		for(i=0;i<5;i++) 
		{                                                                                         //sorting the array
			for(j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println(" the display the array is;\t");
		{
			for(i=0;i<a.length;i++)
			{
				System.out.println("the printed array is:\t"+a[i]);
				System.out.println("the printed array is:\t" +a1[i]);
			}
			
		}
		if(a==a1)                                                                                               //equal the array
		{
		System.out.println(" is array1 equal to array2:\t");
		Arrays.equals(a,a1);
		}
		else
		System.out.println("\t the array1 is not equal to array2");
		Arrays.equals(a, a1);
		System.out.println("the sorted array is:\t");
		for(i=0;i<5-1;i++)
		{
			System.out.print(a[i]+ " ,");
		}
		System.out.print(a[5-1]);
		
		for(int r:a)
		{
			sum=sum+r;
			avg=sum/r;
		}
		System.out.println("the sum of the array is:\t" +sum );
		System.out.println("the average is :\t" +avg);
		int col,total=0;
		int rows;
		for(rows=0;rows<b.length;rows++)
		{
			for( col=0;col<b[rows].length;col++)
			{
		
				System.out.println("the printed 2d array is:\t");                                                    //print the 2D array
				System.out.println(b[rows][col]);
			}
		
		}
		System.out.println("\t copy the arrays:");
		a1=a;
         for(i=0;i<5;i++)
          {
	    System.out.print("\t"+a1[i]);
          }
	}
}