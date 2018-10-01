package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSerie {
	
	private static Scanner read;
	public void getProductoSerie(){
		
		read = new Scanner(System.in);

		List<Long> list = new ArrayList<Long>();
		int t = 0;
		int n = 0;
		int k = 0;
		int i=1;
						
		
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
					
						list.add(read.nextLong());
						
						i++;
					}
					
					
				}else{
					System.out.println("The number of case writes not is correct!!");
				}
									
			 	getMaxValue(list, k);	
					
		
	}
	
	
	public void getMaxValue(List<Long> list, int k){
		String nDigits = null;
		int maxValue = 0;
		System.out.println("Output : ");
		for (long var : list){ 	
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
		
	} 

}
