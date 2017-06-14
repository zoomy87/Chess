package attempt1;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Knight extends ChessPiece {
	int xLocation;
	int yLocation;
	String team;
	BufferedImage image;
	String path;

	public Knight(int x, int y, String team) {
		this.xLocation= x;
		this.yLocation= y;
		this.team= team;
		if( this.team.compareTo("a")==0 ){
			path= "//home//eric//workspace//Chess//src//images//redKnight.png";
		}else{
			path= "//home//eric//workspace//Chess//src//images//whiteKnight.png";
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
		// TODO Auto-generated method stub
		super.image(g, x, y, p);
		g.drawImage(image, (x*50)+12, (y*50)+10, null);

	}

	
	
}
