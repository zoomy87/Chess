/**
 * 
 */
package attempt1;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author eric
 *
 */
public class Pawn extends ChessPiece {
	private int xLocation;
	private int yLocation;
	private String team;
	private BufferedImage image;
	private String path;
	private final int size= 50;
	
	public Pawn(int x, int y, String team){
		this.xLocation= x;
		this.yLocation= y;
		this.team= team;
		if( this.team.compareTo("a")==0 ){
			path= "//home//eric//workspace//Chess//src//images//pawn.png";
		}else{
			path= "//home//eric//workspace//Chess//src//images//whitePawn.png";
		}
		
		try {
			image= ImageIO.read(new File(path) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see attempt1.ChessPiece#move()
	 */
	public void move() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see attempt1.ChessPiece#attack()
	 */
	public void attack() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see attempt1.ChessPiece#image()
	 */
	public void image(Graphics g, int x, int y, JPanel p){
		super.image(g, x, y, p);
		g.drawImage(image, (x*50)+ 12, (y*50)+ 10, null);

	}

	public void grid(Graphics g, int x, int y) {
		super.grid(g, x, y);
		
	}


}
