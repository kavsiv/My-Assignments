package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int num=10;
		boolean flag=false;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				flag= true;	
			}
			}
		if(!flag) {
				System.out.println(num+"The number is prime");
			
		}else {
			
				System.out.println(num+"The number is not prime");
			
		}
	}

}
