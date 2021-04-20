package DesenhandoTela;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
//Programa para desenhar circulos na tela a medida que usuário clica e arrasta o curso


public class main extends JFrame{
	static List <Ponto> pontos = new ArrayList<Ponto>();
	static Ponto auxPont;
	Manipulador mani = new Manipulador();

	public class Manipulador implements MouseMotionListener
	{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			auxPont=new Ponto();
			auxPont.setX(e.getX());
			auxPont.setY(e.getY());
			
			pontos.add(auxPont);
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public main()
	{
		setLayout(null);
		setBounds(0, 0, 500, 500);
		setVisible(true);
		addMouseMotionListener(mani);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		for (Ponto ponto : pontos) {
			g.drawOval(ponto.getX(), ponto.getY(), 6, 6);
		}
	}
	

	
	
	public static void main(String[] args) {
		new main();
	}	
}