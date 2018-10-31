package Same_Array_Pattern;

public class Pattern_Printing_Series1 {
	

	public static void main(String[] ar){
	
		int row = 5;	
	    for (int i =1; i <= row ; i++){
		
	    	if(i == 1 || i == row){
	    		
	    		for(int c = 1; c<=row/2 ;c++){
	    			System.out.print("*");
	    		}
	    		System.out.print(0);
	    		for(int c= 1; c<= row/2 ;c++){
	    			System.out.print("*");
	    		}
	    		System.out.println();
	    	}	    	
	    	else {
	    		
	    		if(i%2 == 0){
	    			for(int x = 1 ; x <= row ; x++){
	    				if(x%2 == 0){
	    					System.out.print(0);
	    				}
	    				else{
	    					System.out.print("*");
	    				}
	    			}
	    			System.out.println();
	    		}
	    		else {
	    			for(int y =1 ;y <= row ; y++){
	    				if(y%2 == 0){
	    					System.out.print("*");
	    				}
	    				else{
	    					System.out.print(0);
	    				}
	    			}
	    			System.out.println();
	    		}
	    	}
	    	
		
	}			
  }
}
