
public class Faketaxi2 {
    
    //attributes
    	private int x = 0;
    	private int y = 0;
    	private int destX= 0;
    	private int destY= 0;
    	private String platenum = null;
    
    public Faketaxi2() {
    	
    	
    	
    	//constructor
    	public  Taxi (String platenum){
    		this.platenum = platenum;
    	}
    	
    	public void run (String s){
    		
    		for (int i = 0; i < s.length (); i++){
    			char c = s.charAt (i);
    			
    			if (c == '1'){
    				x--;
    			}
    			else if (c == 'r'){
    				x++;
    			}
    			else if (c == 'd'){
    			}
    			else if (c == 'u'){
    				y++;
    			}
    			else {
    			}
    		}
    		
    	}
    	
    	    	
    	public void book (int x, int y){
    		destx = x;
    		desty = y;
    	}
    	
    	public void reachedDestination(){
    		if (x == destx && y == desty){
    			System.out.println(true);
    		}
    		else {
    			System.out.println(false);
    		}
    	}
    	
    	
    	
    	
    	public void printCurrentLoxation (){
    		System.out.println(x + " " + y);
    	}
    }
    
    
    
