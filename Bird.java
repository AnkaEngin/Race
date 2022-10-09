import java.awt.Graphics;
import java.awt.Color;
import java.lang.Math;
import java.util.Random;

public class Bird extends Racer{
	private String ID;	
	private int x;			
	private int y;
	
	public Bird () {
		super();
	}
	
	public Bird(String rID, int rX, int rY){
	     super(rID, rX, rY);
	}
	
	public void move() {
		
		
		if(getX()<200) {
			setX(getX()+3);
		}
		
		else{
			setX(getX() + 1);
		}
		
	}
	
	public void draw(Graphics g) {
		int startY = getY( );
	    int startX = getX( );
	    
	    g.setColor(Color.BLUE );
	    g.fillOval(startX - 17, startY + 8,  18, 12);
	    
	    g.fillOval(startX-37, startY+14, 30, 20);
	    
	    g.setColor(Color.ORANGE);
	    g.fillRect(startX-27, startY+25, 5, 20);
	    
	    if(this.isWinner) {
	    	 morph(g);	
	    	 g.fillOval(startX - 17, startY + 8,  18, 12);
	    	 
	    	 morph(g);
	    	 g.fillOval(startX-37, startY+14, 30, 20);
	 	    
	    	 morph(g);
	    	 g.fillRect(startX-27, startY+25, 5, 20);
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
