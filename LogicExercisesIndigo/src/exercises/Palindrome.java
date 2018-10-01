package exercises;

import java.util.Scanner;

public class Palindrome {

	private static Scanner read;
	public int solution(){
		read = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int resp =0;		
		int stop=0;
		int input = 0;
		
		
		System.out.println("Insert number to get Palindrome");
			input = read.nextInt();
		
		for(int i = 1;i<=999;i++){
			a = input / i;
			for(int e = 1; e<= 999;e++){
				b = a * e;
				
				if(isPalindrome(b)){					
					if((a*e)==b){
						if((input/a ) == e){
							resp =b;
							stop = 1;
							break;
						}	
					}	
				}
				
				if(stop ==1){
					break;
				}
			}
		}
		  return resp;
	}
	
	
	public boolean isPalindrome(int x){		
	    int n = 0;
	    int m = x;

	    while (x > 0) {
	        n = n * 10 + x % 10;
	        x = x / 10 | 0;
	    }
	    
	    return n == m;	
	}

}
