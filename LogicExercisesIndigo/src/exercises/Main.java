package exercises;

import java.util.Scanner;

public class Main {

	private static Scanner read;

	public static void main(String[] args) {
		
		read = new Scanner(System.in);
		int res = 0;
		
		System.out.println("******* what option do you want to make *******");
		System.out.println(" Get ProductSerie 1  ---    Get Palindrome 2 ");
			res = read.nextInt();
		
		
			if(res==1){
				ProductSerie Prod = new ProductSerie();
				Prod.getProductoSerie();
			}else if(res ==2){
				Palindrome pal = new Palindrome();
				System.out.println(pal.solution());
			}else{
				System.out.println("wrong option");
			}
			

		

		
		

		
		
		
		
		
		
		
		/*
		

		read = new Scanner(System.in);

				List<Long> list = new ArrayList<Long>();
				int t = 0;
				int n = 0;
				int k = 0;
				int i=1;
				String nDigits = null;				
				
				System.out.println("writes number of test case");
					t = read.nextInt();
					
					if(t>=1 && t<=100){
						
						while(i<=t){
							if(i==1){
								do{
									System.out.println("writes value k");
									k = read.nextInt();
								}while(!(k>=1 && k<=7));
								
								do{
									System.out.println("writes value N");
									n = read.nextInt();
								}while(!(n>=k && n<=1000));								
							}


							System.out.println("writes Digits");
//								nDigits = read.nextInt();
								list.add(read.nextLong());
								
								i++;
							}
							
							
						}else{
							System.out.println("The number of case writes not is correct!!");
						}
											
//								System.out.println(t);
								////////////////////////
								int maxValue = 0;
								System.out.println("Output : ");
								for (long var : list){ 	
//									System.out.println(n+" "+k);
									nDigits = String.valueOf(var);
									String valueDiv = null;
									
									
									
									for(int e = 0; e<= nDigits.length()-k; e++){
										int multValues = 0;
										valueDiv =nDigits.substring(e, k+e);
										for(int u = 0; u< valueDiv.length(); u++){
											if(valueDiv.contains("0")){
												continue;
											}
											int onlyOneValue = 0;
											onlyOneValue = Integer.parseInt(valueDiv.substring(u,u+1));
											if(multValues == 0){
												multValues = onlyOneValue;
											}
											else{
												multValues = multValues*onlyOneValue;
											}
										}

										if(maxValue == 0){
											maxValue = multValues;
										}else{
											if(maxValue<multValues){
												maxValue = multValues;
											}
										}
										
										
									}
									
									System.out.println(maxValue);
									
									nDigits = null;
									maxValue = 0;
								   
								}								
	*/							
	}

}
