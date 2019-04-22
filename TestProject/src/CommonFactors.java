import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonFactors {

	
	
public static void main(String[] args) throws IOException {
	
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int low = Integer.parseInt(br.readLine());                // Reading input from STDIN
     int high = Integer.parseInt(br.readLine());  // Writing output to STDOUT
  
     
    System.out.println(( commonFactor(low, high)));
	
}

private static int commonFactor(int low, int high) {
	// TODO Auto-generated method stub
	
	int count =0;
	for (int i=1 ; i<=high; i++){
		
		
		if ((low % i == 0) && (high % i == 0)){
			
			count++;
		}
		
	}
	return count;
	
}


}
