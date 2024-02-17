package slaytAlistirma;

import java.util.Scanner;

public class GitHub {

	public static void main(String[] args) {
		
		// Çıkarma işlemi yapan program 
		
				
		Scanner scan=new Scanner(System.in);
				
		int num1 = (int)(Math.random() * 10);
	    int num2 = (int)(Math.random() * 10);
			    
		  if(num1<num2) {
		  int sayi=num1;
	    	num1=num2;
			num2=sayi;
			   }
			    
		System.out.println(num1+"-"+num2+" sonucu kaçtır ?");
	    int answer=scan.nextInt();
			   
		if(answer==num1-num2)
			System.out.println("Tebrikler doğru cevap");
		else
			System.out.println("Yanlış cevap. Doğrusu : " +(num1-num2)+" olacaktı");	
	}
}