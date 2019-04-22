
 class Exc0 extends Exception{
	
	
}
 
 class Exc1 extends Exc0{
		
		
}


public class DBSQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			throw new Exc1();
			
		}
		catch(Exc0 e){
			
			System.out.println("Exc0 caught");
		}
		
	catch(Exception e){
			
			System.out.println("Exception caught");
		}
	}

}
