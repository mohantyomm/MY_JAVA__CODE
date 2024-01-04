package OCAC_PACKAGE;

public class Prime {
	public void prime_check(int num) {
	 int flag=0;
	 if(num ==0 || num==1) {
		 flag = 1;
	 }
	 else {
		 for(int i =2;i<=num/2;i++) {
			 if(num%i==0) {
				 flag = 1;
				 break;
			 }	 
		 }
	 }
	 if(flag==0) {
		 System.out.println("Number is prime");
	 }
	 else {
		 System.out.println("Number is not prime");
	 }
	}
}
