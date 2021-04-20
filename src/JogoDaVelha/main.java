package JogoDaVelha;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Jogo da velha
public class main extends JFrame{
	static int jogador =1;
	Manipulador mani =new Manipulador();
	private JButton btnPosi11;
	private JButton btnposi12;
	private JButton btnposi13;
	private JButton btnposi21;
	private JButton btnposi22;
	private JButton btnposi23;
	private JButton btnposi31;
	private JButton btnposi32;
	private JButton btnposi33;
	private JButton btnSair;
	private JButton btnLimpar;

	public boolean Jogada()
	{
		if(jogador%2==0)
		{
			jogador++;
			return true;
		}
		else
		{
			jogador++;
			return false;
		}
		
	}
	
	public main()
	{
		getContentPane().setLayout(null);
		
		btnPosi11 = new JButton("");
		btnPosi11.setBounds(22, 80, 89, 23);
		btnPosi11.addActionListener(mani);
		getContentPane().add(btnPosi11);
		
		btnposi21 = new JButton("");
		btnposi21.setBounds(22, 129, 89, 23);
		btnposi21.addActionListener(mani);
		getContentPane().add(btnposi21);
		
		btnposi31 = new JButton("");
		btnposi31.setBounds(22, 178, 89, 23);
		btnposi31.addActionListener(mani);
		getContentPane().add(btnposi31);
		
		btnposi12 = new JButton("");
		btnposi12.setBounds(143, 80, 89, 23);
		btnposi12.addActionListener(mani);
		getContentPane().add(btnposi12);
		
		btnposi22 = new JButton("");
		btnposi22.setBounds(143, 129, 89, 23);
		btnposi22.addActionListener(mani);
		getContentPane().add(btnposi22);
		
		btnposi32 = new JButton("");
		btnposi32.setBounds(143, 178, 89, 23);
		btnposi32.addActionListener(mani);
		getContentPane().add(btnposi32);
		
		btnposi13 = new JButton("");
		btnposi13.setBounds(258, 80, 89, 23);
		btnposi13.addActionListener(mani);
		getContentPane().add(btnposi13);
		
		btnposi23 = new JButton("");
		btnposi23.setBounds(258, 129, 89, 23);
		btnposi23.addActionListener(mani);
		getContentPane().add(btnposi23);
		
		btnposi33 = new JButton("");
		btnposi33.setBounds(258, 178, 89, 23);
		btnposi33.addActionListener(mani);
		getContentPane().add(btnposi33);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(77, 263, 89, 23);
		btnLimpar.addActionListener(mani);
		getContentPane().add(btnLimpar);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(208, 263, 89, 23);
		btnSair.addActionListener(mani);
		getContentPane().add(btnSair);
		
		JLabel lblNewLabel = new JLabel("Jogo da velha");
		lblNewLabel.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		lblNewLabel.setBounds(134, 11, 130, 33);
		getContentPane().add(lblNewLabel);
		setBounds(0, 0, 400, 400);
		setVisible(true);
	}
	
	public class Manipulador implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btnSair)
			{
				System.exit(0);
			}
			if(e.getSource()==btnPosi11)
			{
				if(Jogada())
				{
					btnPosi11.setText("O");
					btnPosi11.setEnabled(false);
				}
				else
				{
					btnPosi11.setText("X");
					btnPosi11.setEnabled(false);
					
				}
			}
			if(e.getSource()==btnposi12)
			{
				if(Jogada())
				{
					btnposi12.setText("O");
					btnposi12.setEnabled(false);
				}
				else
				{
					btnposi12.setText("X");
					btnposi12.setEnabled(false);
					
				}
			}
			if(e.getSource()==btnposi13)
			{
				if(Jogada())
				{
					btnposi13.setText("O");
					btnposi13.setEnabled(false);
				}
				else
				{
					btnposi13.setText("X");
					btnposi13.setEnabled(false);
					
				}
			}
			if(e.getSource()==btnposi21)
			{
				if(Jogada())
				{
					btnposi21.setText("O");
					btnposi21.setEnabled(false);
				}
				else
				{
					btnposi21.setText("X");
					btnposi21.setEnabled(false);
					
				}
			}
			if(e.getSource()==btnposi22)
			{
				if(Jogada())
				{
					btnposi22.setText("O");
					btnposi22.setEnabled(false);
				}
				else
				{
					btnposi22.setText("X");
					btnposi22.setEnabled(false);
					
				}
			}
			if(e.getSource()==btnposi23)
			{
				if(Jogada())
				{
					btnposi23.setText("O");
					btnposi23.setEnabled(false);
				}
				else
				{
					btnposi23.setText("X");
					btnposi23.setEnabled(false);
					
				}
			}
			if(e.getSource()==btnposi31)
			{
				if(Jogada())
				{
					btnposi31.setText("O");
					btnposi31.setEnabled(false);
				}
				else
				{
					btnposi31.setText("X");
					btnposi31.setEnabled(false);
					
				}
			}
			if(e.getSource()==btnposi32)
			{
				if(Jogada())
				{
					btnposi32.setText("O");
					btnposi32.setEnabled(false);
				}
				else
				{
					btnposi32.setText("X");
					btnposi32.setEnabled(false);
					
				}
			}
			if(e.getSource()==btnposi33)
			{
				if(Jogada())
				{
					btnposi33.setText("O");
					btnposi33.setEnabled(false);
				}
				else
				{
					btnposi33.setText("X");
					btnposi33.setEnabled(false);
					
				}
			}
			if(e.getSource()==btnLimpar)
			{
				btnPosi11.setText(null);
				btnPosi11.setEnabled(true);
				btnposi12.setText(null);
				btnposi12.setEnabled(true);
				btnposi13.setText(null);
				btnposi13.setEnabled(true);
				btnposi21.setText(null);
				btnposi21.setEnabled(true);
				btnposi22.setText(null);
				btnposi22.setEnabled(true);
				btnposi23.setText(null);
				btnposi23.setEnabled(true);
				btnposi31.setText(null);
				btnposi31.setEnabled(true);
				btnposi32.setText(null);
				btnposi32.setEnabled(true);
				btnposi33.setText(null);
				btnposi33.setEnabled(true);
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
	}

}
