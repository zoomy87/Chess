/**
 * 
 */
package attempt1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author eric
 *
 */
public class ChessPiece {
	private final int gridSize= 50;
	private int x;
	private int y;
	
	public ChessPiece(){
		
	}
	public ChessPiece(int x, int y){
		this.x= x;
		this.y= y;
	}
	
	public void move(){
		
	}
	
	public void attack(){
		
	}
	public void image(Graphics g, int x, int y, JPanel p){
		g.setColor(Color.BLACK);
		if( (x+y) %2== 0){
			g.drawRect(x*50, y*50, gridSize, gridSize);
		}else{
			g.fillRect(x*50, y*50, gridSize, gridSize);
		}
	}
	public void grid(Graphics g, int x, int y){
		g.setColor(Color.BLACK);
		if( (x+y) %2== 0){
			g.drawRect(x*50, y*50, gridSize, gridSize);
		}else{
			g.fillRect(x*50, y*50, gridSize, gridSize);
		}
	}

}
