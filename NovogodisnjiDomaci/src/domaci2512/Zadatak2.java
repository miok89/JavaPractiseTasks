package domaci2512;

public class Zadatak2 {

	public static void main(String[] args) {
		
        boolean prost;
		 
        System.out.println("Prosti brojevi izmedju 1 i 100 su: ");
        
        
        for (int i = 2; i < 100; i++) {
        
        	prost = true;
        
        	for (int j = i - 1; j > 1; j--){
        		
        		if (i % j == 0) {
        			prost = false;
        		}
        	}
        
	        if (prost) {
	        	System.out.print(i + " ");
	        }
        }
	}
}
