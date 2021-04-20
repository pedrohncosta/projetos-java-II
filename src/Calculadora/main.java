package Calculadora;
//Calculadora
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class main extends JFrame{
	String aux= new String();
	double resultado=0,itemA=0,itemB=0;
	int controle=-1;
	Manipulador mani = new Manipulador();
	private JButton btnAdicao;
	private JButton btnSubtracao;
	private JButton btnDivi;
	private JButton btnMultipli;
	private JButton btnClear;
	private JButton btnUm;
	private JButton btnTres;
	private JButton btnDois;
	private JButton btnCinco;
	private JButton btnSeis;
	private JButton btnQuatro;
	private JButton btnSete;
	private JButton btnOito;
	private JButton btnNove;
	private JButton btnCalc;
	private JButton btnSair;
	private JTextArea tAaExibir;
	private JButton btnZero;
	
	
	public void calcular() 
	{
		String help = "";
		help = tAaExibir.getText();
		itemB=Double.parseDouble(help);
		if(controle==0)
		{
			resultado = itemA*itemB;
		}
		else if(controle==1)
		{
			resultado=itemA+itemB;
		}
		else if(controle==2)
		{
			resultado=itemA-itemB;
		}
		else if(controle==3)
		{
			resultado=itemA/itemB;
		}
	}
	
	public void multiA()
	{
		String s ="";
		s=tAaExibir.getText();
		aux = "";
		itemA = Double.parseDouble(s);
		tAaExibir.setText(aux);
		controle=0;
	}
	
	public void somaA()
	{
		String s ="";
		s=tAaExibir.getText();
		aux = "";
		itemA = Double.parseDouble(s);
		tAaExibir.setText(aux);
		controle=1;
	}
	public void subt()
	{
		String s ="";
		s=tAaExibir.getText();
		aux = "";
		itemA = Double.parseDouble(s);
		tAaExibir.setText(aux);
		controle=2;
		
	}
	public void divi()
	{
		String s ="";
		s=tAaExibir.getText();
		aux = "";
		itemA = Double.parseDouble(s);
		tAaExibir.setText(aux);
		controle=3;
	}
	
	public main()
	{
		getContentPane().setLayout(null);
		
		tAaExibir = new JTextArea();
		tAaExibir.setEditable(false);
		tAaExibir.setBounds(10, 11, 264, 158);
		getContentPane().add(tAaExibir);
		
		btnAdicao = new JButton("+");
		btnAdicao.setBounds(10, 202, 41, 23);
		btnAdicao.addActionListener(mani);
		getContentPane().add(btnAdicao);
		
		btnSubtracao = new JButton("-");
		btnSubtracao.setBounds(61, 202, 41, 23);
		btnSubtracao.addActionListener(mani);
		getContentPane().add(btnSubtracao);
		
		btnDivi = new JButton("/");
		btnDivi.setBounds(112, 202, 41, 23);
		btnDivi.addActionListener(mani);
		getContentPane().add(btnDivi);
		
		btnMultipli = new JButton("x");
		btnMultipli.setBounds(163, 202, 41, 23);
		btnMultipli.addActionListener(mani);
		getContentPane().add(btnMultipli);
		
		btnClear = new JButton("C");
		btnClear.setBounds(218, 202, 56, 23);
		btnClear.addActionListener(mani);
		getContentPane().add(btnClear);
		
		btnUm = new JButton("1");
		btnUm.setBounds(10, 271, 70, 23);
		btnUm.addActionListener(mani);
		getContentPane().add(btnUm);
		
		btnTres = new JButton("3");
		btnTres.setBounds(192, 271, 70, 23);
		btnTres.addActionListener(mani);
		getContentPane().add(btnTres);
		
		btnDois = new JButton("2");
		btnDois.setBounds(100, 271, 70, 23);
		btnDois.addActionListener(mani);
		getContentPane().add(btnDois);
		
		btnCinco = new JButton("5");
		btnCinco.setBounds(100, 336, 70, 23);
		btnCinco.addActionListener(mani);
		getContentPane().add(btnCinco);
		
		btnSeis = new JButton("6");
		btnSeis.setBounds(192, 336, 70, 23);
		btnSeis.addActionListener(mani);
		getContentPane().add(btnSeis);
		
		btnQuatro = new JButton("4");
		btnQuatro.setBounds(10, 336, 70, 23);
		btnQuatro.addActionListener(mani);
		getContentPane().add(btnQuatro);
		
		btnSete = new JButton("7");
		btnSete.setBounds(10, 394, 70, 23);
		btnSete.addActionListener(mani);
		getContentPane().add(btnSete);
		
		btnOito = new JButton("8");
		btnOito.setBounds(100, 394, 70, 23);
		btnOito.addActionListener(mani);
		getContentPane().add(btnOito);
		
		btnNove = new JButton("9");
		btnNove.setBounds(192, 394, 70, 23);
		btnNove.addActionListener(mani);
		getContentPane().add(btnNove);
		
		btnCalc = new JButton("Calcular");
		btnCalc.setBounds(155, 500, 89, 23);
		btnCalc.addActionListener(mani);
		getContentPane().add(btnCalc);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(24, 500, 89, 23);
		btnSair.addActionListener(mani);
		
		getContentPane().add(btnSair);
		
		btnZero = new JButton("0");
		btnZero.setBounds(100, 450, 70, 23);
		btnZero.addActionListener(mani);
		
		getContentPane().add(btnZero);
		setBounds(0, 0, 300, 600);
		setVisible(true);
	}
	
	public class Manipulador implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==btnSair)
			{
				System.exit(0);
			}
			if(e.getSource()==btnClear)
			{
				tAaExibir.setText(null);
				aux="";
				itemA=0;
				itemB=0;
			}
			if(e.getSource()==btnUm)
			{
				aux+="1";
				tAaExibir.setText(aux);
				
			}
			if(e.getSource()==btnDois)
			{
				aux+="2";
				tAaExibir.setText(aux);
			}
			if(e.getSource()==btnTres)
			{
				aux+="3";
				tAaExibir.setText(aux);
			}
			if(e.getSource()==btnQuatro)
			{
				aux+="4";
				tAaExibir.setText(aux);
			}
			if(e.getSource()==btnCinco)
			{
				aux+="5";
				tAaExibir.setText(aux);
			}
			if(e.getSource()==btnSeis)
			{
				aux+="6";
				tAaExibir.setText(aux);
			}
			if(e.getSource()==btnSete)
			{
				aux+="7";
				tAaExibir.setText(aux);
			}
			if(e.getSource()==btnOito)
			{
				aux+="8";
				tAaExibir.setText(aux);
			}
			if(e.getSource()==btnNove)
			{
				aux+="9";
				tAaExibir.setText(aux);
			}
			if(e.getSource()==btnZero)
			{
				aux+="0";
				tAaExibir.setText(aux);
			}
			if(e.getSource()==btnMultipli)
			{
				multiA();
			}
			if(e.getSource()==btnAdicao)
			{
				somaA();
			}
			if(e.getSource()==btnDivi)
			{
				divi();
			}
			if(e.getSource()==btnSubtracao)
			{
				subt();
			}
			if(e.getSource()==btnCalc)
			{
				calcular();
				aux = ""+resultado+"\n";
				tAaExibir.setText(aux);
				aux = "";
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
	}
}
