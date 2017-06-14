/**
 * 
 */
package attempt1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author eric
 * 
 */
public class ChessGui extends JPanel {
	private static final int PANEL_HEIGHT = 400;
	private static final int PANEL_WIDTH = 400;
	private ChessPiece[][] board;
	private static ChessGui panel;
	private static Mouse_Listen click;
	

	public ChessGui() {
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		setBackground(Color.LIGHT_GRAY);
		click= new Mouse_Listen();
		
		
		// panel= new ChessGui();

		board = new ChessPiece[8][8];
		for (int y = 0; y < board.length; y++) {
			for (int x = 0; x < board[y].length; x++) {
				board[y][x] = new ChessPiece(x, y);
			}
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setPieces();
		for (int y = 0; y < board.length; y++) {
			for (int x = 0; x < board[y].length; x++) {
				board[y][x].image(g, x, y, panel);
			}
		}

		// g.setColor(Color.BLACK);
		// board[0][0].grid(g, 0, 0);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		panel = new ChessGui();
		JFrame frame = new JFrame("Chess Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setBackground(Color.gray);
		frame.setVisible(true);
		frame.addMouseListener(click);
		

	}

	public void setPieces() {
		setPawns();
		setRooks();
		setKnights();
		setBishops();
		setKings();
		setQueens();

	}
	
	/*
	 * generates queens
	 */
	private void setQueens(){
		board[0][3]= new Queen(3, 0, "a");
		board[7][3]= new Queen(3, 7, "b");
	}
	
	private void setKings(){
		board[0][4]= new King(4, 0, "a");
		board[7][4]= new King(4, 7, "b");
	}
	
	/*
	 * generates bishops for game
	 */
	private void setBishops(){
		board[0][2]= new Bishop(2, 0, "a");
		board[0][5]= new Bishop(5, 0, "a");
		board[7][2]= new Bishop(2, 7, "b");
		board[7][5]= new Bishop(5, 7, "b");
	}
	
	
	/*
	 * generates knights for the game
	 */
	private void setKnights(){
		//    Y  X
		board[0][1]= new Knight(1, 0, "a");
		board[0][6]= new Knight(6, 0, "a");
		board[7][1]= new Knight(1, 7, "b");
		board[7][6]= new Knight(6, 7, "b");
	}
	
	private void setRooks(){
		board[0][0]= new Rook(0, 0, "a");
		board[0][7]= new Rook(7, 0, "a");
		board[7][0]= new Rook(0, 7, "b");
		board[7][7]= new Rook(7, 7, "b");
	}

	private void setPawns() {
		int x = 0;
		int y = 1;
		while (x < 8) {
			board[y][x] = new Pawn(x, y, "a");
			x++;
		}
		y = 6;
		x = 0;
		while (x < 8) {
			board[y][x] = new Pawn(x, y, "b");
			x++;
		}
	}
	
	
	public class Mouse_Listen implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getPoint().getLocation());
			System.out.println("");

		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
	
}



