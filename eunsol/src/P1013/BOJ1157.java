package P1013;

import java.util.Scanner;

public class BOJ1157 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      String s=sc.nextLine(); 
	      String ch=s.toUpperCase();
	      int[] a=new int[26];

	      int max=0;  
	      int count=0; 
	      char cha='A';

	      for(int i=0;i<ch.length();i++) {
	    	  for(int j=0;j<a.length;j++) 
	    		  if(ch.charAt(i)-65==j) a[j]++;  
	                                                                          
	      }
		  for(int j=0;j<a.length;j++) 
			  max=Math.max(a[j],max);  
		  for(int j=0;j<a.length;j++) 
			  if(max==a[j]) count++;   
		  for(int j=0;j<a.length;j++) {
			  if(max==a[j]&&count==1) 
				  System.out.println((char)(cha+j)); 
			  else if(max==a[j]&&1<count) {
				  System.out.println("?");    
				  break;
			  }
		  }
	   }
}
