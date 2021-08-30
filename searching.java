package com.prajwal.code;
import java.util.Scanner; 
public class searching {
	 	public static void main(String[] args) {  
	    int[] arr = {3,60,35,2,45,320,5};  
	    int item,flag=0;   
	    Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter Item ?");  
	    item = sc.nextInt();  
	    for(int i = 0; i<arr.length; i++)  
	    {  
	        if(arr[i]==item)  
	        {  
	            flag = i+1;  
	            break;  
	        }  
	        else   
	            flag = 0;   
	    }  
	    if(flag != 0)  
	    {  
	        System.out.println("Item found at position" + flag);  
	    }  
	    else   
	        System.out.println("Item not found");  
	      
	}  
	}  

