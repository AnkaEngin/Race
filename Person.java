import java.awt.Graphics;
import java.awt.Color;
import java.lang.Math;
import java.util.Random;

public class Person extends Racer{
	private String ID;	
	private int x;			
	private int y;
	
	public Person () {
		super();
	}
	
	public Person(String rID, int rX, int rY){
	     super(rID, rX, rY);
	}
	
	public void move() {
		
		
		if(getX()<350) {
			setX(getX()+2);
		}
		
		else{
			setX(getX() + 5);
		}
		
	}
	
	public void draw(Graphics g) {
		int startY = getY( );
	    int startX = getX( );
	    
	    
	    g.setColor(Color.ORANGE );
	    g.fillOval(startX - 37, startY + 8,  18, 18);
	    
	    g.setColor(Color.GREEN);
	    g.fillRect(startX-37, startY+24, 18, 30);
	    
	    g.setColor(Color.BLUE);
	    g.fillRect(startX-37, startY+54, 5, 15);
	    g.fillRect(startX-24, startY+54, 5, 15);
	    
	    if(this.isWinner) {
	    	 morph(g);	
	    	 g.fillOval(startX - 37, startY + 8,  18, 18);
	    	 
	    	 morph(g);
	    	 g.fillRect(startX-37, startY+24, 18, 30);
	    	 
	    	 morph(g);
	    	 g.fillRect(startX-37, startY+54, 5, 15);
	    	 
	    	 morph(g);
	    	 g.fillRect(startX-24, startY+54, 5, 15);
	    	 
	    }    
	}
	
	public void morph(Graphics g) {
		Random rand1 = new Random();
		int r1 = rand1.nextInt(250);
		int r2 = rand1.nextInt(250);
		int r3 = rand1.nextInt(250);
		g.setColor(new Color (r1,r2,r3));
	} 
}
