package pending.algorithms;

public class RainWaterTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr   = {0,1,0,2,1,0,1,3,2,1,2,1};
		// output should be Output: 10
		
		//first iterration
		
		int unit = 1;
		int total_units = 0;
		int [] cal_units = new int [arr.length];
		
		int max = 3;
		while (max >= 0){
			
			
		for (int i = 0;i < arr.length;i++){
			
			
			if (unit < arr[i]){
				
				cal_units[i] = arr[i] -1;	
			}else {
				
				cal_units[i] = arr[i];
				
			}
			
			
		}
		
		
		
		for (int x = 0;x<cal_units.length; x ++){
			
			System.out.print(cal_units[x]+ " ");
		}
		arr = cal_units;
		System.out.println();
	
		max--;
		
		}
		

	}

	
	
}
