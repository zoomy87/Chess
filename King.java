package attempt1;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class King extends ChessPiece {
	int xLocation;
	int yLocation;
	String team;
	BufferedImage image;
	String path;

	public King(int x, int y, String team) {
		this.xLocation= x;
		this.yLocation= y;
		this.team= team;
		if( this.team.compareTo("a")==0 ){
			path= "//home//eric//workspace//Chess//src//images//redKing.png";
		}else{
			path= "//home//eric//workspace//Chess//src//images//whiteKing.png";
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
		super.move();
	}

	/* (non-Javadoc)
	 * @see attempt1.ChessPiece#attack()
	 */
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
	}

	/* (non-Javadoc)
	 * @see attempt1.ChessPiece#image(java.awt.Graphics, int, int, javax.swing.JPanel)
	 */
	public void image(Graphics g, int x, int y, JPanel p) {
		super.image(g, x, y, p);
		g.drawImage(image, (x*50)+9, (y*50)+10, null);

	}
	
	
	
	
}
