package Live;

import java.awt.*;

import javax.swing.JFrame;

public class DrawMap extends JFrame{
	public static int x=50; 
	public static int y=50;
	public static int w=10;
	public static int number=90;
	public static int[][] map=new int[number+2][number+2]; 
	public static int[][] map1=new int[number+2][number+2];
	public DrawMap() {
		for(int i=0;i<number+2;i++) {
			for(int j=0;j<number+2;j++) {
				if(i==0||i==number+1||j==0||j==number+1) {
					map[i][j]=0;
					map[i][j]=0;
					continue;
				}
			int randomNumber = (int) Math.round(Math.random()*(1-0)+0);
			map[i][j]=randomNumber;
			map1[i][j]=map[i][j];
			}
			}
			
		Container p = getContentPane();
		          setBounds(100, 100, 1000, 1000);
		          setVisible(true);
		          Color rectColor = null;
				p.setBackground(rectColor);
		          setLayout(null);   
		          setResizable(false);
		          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
		          
		          try {        
		              Thread.sleep(500);
		         } catch (Exception e) {
		              e.printStackTrace();
		          }        		  
		          Graphics jg = this.getGraphics();		      
		          paint(jg);
		          
	}
	
	public void paint(Graphics g) {
		            try {
		            	super.paint(g);
		            	g.setColor(Color.BLACK);		              
		                g.drawRect(x, y, w*number, w*number);
		                
		           
		               for(int i = 1; i < number; i++) {

		                   g.drawLine(x + (i * w), y, x + (i * w), y + w*number);
		                   
		                   g.drawLine(x, y + (i * w), x + w*number, y + (i * w));
		                   
		                   
		               }
		           
		           	for(int i=0;i<number+2;i++) {
		    			for(int j=0;j<number+2;j++) {	    				
		    			if(map[i][j]==1) {
		    			g.fillRect(x+i*w-w, y+j*w-w, w, w);}
		    			}
		    		}	               	               
		           } catch (Exception e) {
		               e.printStackTrace();
		           }
		      }
	public void updatemap() {
		 Graphics jg = this.getGraphics();	
		 update(jg);
		 }	
}
