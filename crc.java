package mcwc3;
import java.util.*;
public class crc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String binaryData="",binaryKey="",z="0",quotient="",transmittedData="";
		
		
		System.out.println("Enter the Data in Binary");
		binaryData=sc.nextLine();
		transmittedData=binaryData;
		System.out.println("Enter the Key in Binary");
		binaryKey=sc.nextLine();
		
		int keyLength=binaryKey.length();
		
	   for(int i=0;i<keyLength-1;i++)
	   {
		   binaryData=binaryData + "0";
		   z=z+"0";
	   }
	   
	   String temp=binaryData.substring(0, keyLength);
	   
	   for(int i=keyLength;i<binaryData.length()+1;i++)
	   {
		   if(temp.charAt(0)=='1')
		   {
			   quotient=quotient+"1";
			   for(int j=0;j<keyLength;j++)
			   {
				   if(binaryKey.charAt(j)==temp.charAt(j))
				   {
					   temp=temp + "0";
				   }
				   else
				   {
					   temp=temp+"1";
				   }
			   }
			   
		   }
		   else
		   {
			   quotient=quotient+"0";
			   for(int j=0;j<keyLength;j++)
			   {
				   if(z.charAt(j)==temp.charAt(j))
				   {
					   temp=temp + "0";
				   }
				   else
				   {
					   temp=temp+"1";
				   }
			   }
		   }
		   
		   if(i==binaryData.length())
		   {
			   temp=temp.substring(keyLength+1,2*keyLength); 
		   }
		   else
		   {
		       temp=temp.substring(keyLength+1,2*keyLength) + binaryData.charAt(i);
		   }
		  
	   }
	   
	   System.out.println("The remainder of the data transmitted is "+ temp);
	   
	   System.out.println("The quotient of the data transmitted is "+ quotient);
	   
	   System.out.println("The data transmitted is "+ transmittedData + temp);
		

	}

}
