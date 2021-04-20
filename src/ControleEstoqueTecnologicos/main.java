package ControleEstoqueTecnologicos;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

//Controle de Estoque - Tablet e Desktop

public class main extends JFrame{
	static List<Aparelho> aparelhos = new ArrayList<Aparelho>();
	static Desktop auxDesk;
	static Tablet auxTablet;
	Manipulador mani = new Manipulador();
	private JButton btnCadastrarDesktop;
	private JButton btnExibir;
	private JButton btnCadastrarTablet;
	private JButton btnSair;
	private JPanel pnlDesktop;
	private JPanel pnlExibir;
	private JPanel pnlTablet;
	private JTextField tFdNucleoDesktop;
	private JTextField tFdMemoriaDesktop;
	private JTextField tFdHdDesk;
	private JButton btnConfirmDesk;
	private JTextField tFdnucleoTablet;
	private JTextField tFdMemoriaTablet;
	private JTextField tFdtelaTablet;
	private JButton btnConfirmTablet;
	private JButton btnVoltar;
	private JTextArea tAaExibir;

	public void clearFields()
	{
		tFdHdDesk.setText(null);
		tFdMemoriaDesktop.setText(null);
		tFdMemoriaTablet.setText(null);
		tFdNucleoDesktop.setText(null);
		tFdnucleoTablet.setText(null);
		tFdtelaTablet.setText(null);
	}
	
	public void cadastroDesktop()
	{
		String aux="";
		int auxI;
		auxDesk = new Desktop();
		aux = tFdNucleoDesktop.getText();
		auxI=Integer.parseInt(aux);
		auxDesk.setNucleo(auxI);
		aux= tFdMemoriaDesktop.getText();
		auxI=Integer.parseInt(aux);
		auxDesk.setMemoria(auxI);
		aux =tFdHdDesk.getText();
		auxI= Integer.parseInt(aux);
		auxDesk.setHd(auxI);
		
		aparelhos.add(auxDesk);
		
	}
	public void cadastroTablet()
	{
		String aux="";
		int auxI;
		auxTablet = new Tablet();
		aux = tFdnucleoTablet.getText();
		auxI=Integer.parseInt(aux);
		auxTablet.setNucleo(auxI);
		aux= tFdMemoriaTablet.getText();
		auxI=Integer.parseInt(aux);
		auxTablet.setMemoria(auxI);
		aux =tFdtelaTablet.getText();
		auxI= Integer.parseInt(aux);
		auxTablet.setTela(auxI);
		
		aparelhos.add(auxTablet);
		
	}
	public void exibir()
	{
		String aux="";
		for(int i=0;i<aparelhos.size();i++)
		{
			aux += aparelhos.get(i).especificacao()+"\n";
		}
		tAaExibir.setText(aux);
	}
	
	public main()
	{
		getContentPane().setLayout(null);
		
		pnlExibir = new JPanel();
		pnlExibir.setBounds(0, 0, 384, 161);
		pnlExibir.setVisible(false);
		
		pnlTablet = new JPanel();
		pnlTablet.setBounds(0, 0, 384, 161);
		pnlTablet.setVisible(false);
		
		pnlDesktop = new JPanel();
		pnlDesktop.setBounds(0, 0, 384, 161);
		pnlDesktop.setVisible(false);
		getContentPane().add(pnlDesktop);
		pnlDesktop.setLayout(null);
		
		tFdNucleoDesktop = new JTextField();
		tFdNucleoDesktop.setBounds(10, 42, 129, 20);
		pnlDesktop.add(tFdNucleoDesktop);
		tFdNucleoDesktop.setColumns(10);
		
		tFdMemoriaDesktop = new JTextField();
		tFdMemoriaDesktop.setBounds(10, 99, 129, 20);
		pnlDesktop.add(tFdMemoriaDesktop);
		tFdMemoriaDesktop.setColumns(10);
		
		tFdHdDesk = new JTextField();
		tFdHdDesk.setBounds(254, 42, 86, 20);
		pnlDesktop.add(tFdHdDesk);
		tFdHdDesk.setColumns(10);
		
		btnConfirmDesk = new JButton("Cadastrar");
		btnConfirmDesk.setBounds(231, 98, 120, 23);
		btnConfirmDesk.addActionListener(mani);
		pnlDesktop.add(btnConfirmDesk);
		
		JLabel lblNewLabel = new JLabel("Nucleo");
		lblNewLabel.setBounds(20, 17, 55, 14);
		pnlDesktop.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Memoria");
		lblNewLabel_1.setBounds(20, 73, 68, 14);
		pnlDesktop.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("HD");
		lblNewLabel_2.setBounds(266, 17, 46, 14);
		pnlDesktop.add(lblNewLabel_2);
		getContentPane().add(pnlTablet);
		pnlTablet.setLayout(null);
		
		tFdnucleoTablet = new JTextField();
		tFdnucleoTablet.setBounds(10, 40, 86, 20);
		pnlTablet.add(tFdnucleoTablet);
		tFdnucleoTablet.setColumns(10);
		
		tFdMemoriaTablet = new JTextField();
		tFdMemoriaTablet.setBounds(10, 103, 86, 20);
		pnlTablet.add(tFdMemoriaTablet);
		tFdMemoriaTablet.setColumns(10);
		
		tFdtelaTablet = new JTextField();
		tFdtelaTablet.setBounds(264, 40, 86, 20);
		pnlTablet.add(tFdtelaTablet);
		tFdtelaTablet.setColumns(10);
		
		btnConfirmTablet = new JButton("Cadastrar");
		btnConfirmTablet.setBounds(248, 102, 102, 23);
		btnConfirmTablet.addActionListener(mani);
		pnlTablet.add(btnConfirmTablet);
		
		JLabel lblNewLabel_3 = new JLabel("Nucleo");
		lblNewLabel_3.setBounds(10, 15, 60, 14);
		pnlTablet.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Memoria");
		lblNewLabel_4.setBounds(10, 78, 60, 14);
		pnlTablet.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tela");
		lblNewLabel_5.setBounds(264, 15, 46, 14);
		pnlTablet.add(lblNewLabel_5);
		getContentPane().add(pnlExibir);
		pnlExibir.setLayout(null);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(147, 127, 89, 23);
		btnVoltar.addActionListener(mani);
		pnlExibir.add(btnVoltar);
		
		tAaExibir = new JTextArea();
		tAaExibir.setEditable(false);
		tAaExibir.setBounds(10, 11, 364, 111);
		pnlExibir.add(tAaExibir);
		
		btnCadastrarDesktop = new JButton("Desktop");
		btnCadastrarDesktop.setBounds(22, 32, 89, 36);
		btnCadastrarDesktop.addActionListener(mani);
		getContentPane().add(btnCadastrarDesktop);
		
		btnExibir = new JButton("Exibir");
		btnExibir.setBounds(22, 92, 89, 36);
		btnExibir.addActionListener(mani);
		getContentPane().add(btnExibir);
		
		btnCadastrarTablet = new JButton("Tablet");
		btnCadastrarTablet.setBounds(245, 32, 89, 36);
		btnCadastrarTablet.addActionListener(mani);
		getContentPane().add(btnCadastrarTablet);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(245, 92, 89, 36);
		btnSair.addActionListener(mani);
		
		getContentPane().add(btnSair);
		setBounds(0, 0, 400, 200);
		setVisible(true);
	}
	
	public class Manipulador implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnSair)
			{
				System.exit(0);
			}
			if(e.getSource()==btnVoltar)
			{
				pnlDesktop.setVisible(false);
				pnlExibir.setVisible(false);
				pnlTablet.setVisible(false);
				btnSair.setVisible(true);
				btnCadastrarDesktop.setVisible(true);
				btnCadastrarTablet.setVisible(true);
				btnExibir.setVisible(true);
				tAaExibir.setText(null);
			}
			if(e.getSource()==btnCadastrarDesktop)
			{
				pnlDesktop.setVisible(true);
				pnlExibir.setVisible(false);
				pnlTablet.setVisible(false);
				btnSair.setVisible(false);
				btnCadastrarDesktop.setVisible(false);
				btnCadastrarTablet.setVisible(false);
				btnExibir.setVisible(false);
			}
			if(e.getSource()==btnCadastrarTablet)
			{
				pnlDesktop.setVisible(false);
				pnlExibir.setVisible(false);
				pnlTablet.setVisible(true);
				btnSair.setVisible(false);
				btnCadastrarDesktop.setVisible(false);
				btnCadastrarTablet.setVisible(false);
				btnExibir.setVisible(false);
			}
			if(e.getSource()==btnExibir)
			{
				pnlDesktop.setVisible(false);
				pnlExibir.setVisible(true);
				pnlTablet.setVisible(false);
				btnSair.setVisible(false);
				btnCadastrarDesktop.setVisible(false);
				btnCadastrarTablet.setVisible(false);
				btnExibir.setVisible(false);
				exibir();
			}
			if(e.getSource()==btnConfirmDesk)
			{
				cadastroDesktop();
				clearFields();
				pnlDesktop.setVisible(false);
				pnlExibir.setVisible(false);
				pnlTablet.setVisible(false);
				btnSair.setVisible(true);
				btnCadastrarDesktop.setVisible(true);
				btnCadastrarTablet.setVisible(true);
				btnExibir.setVisible(true);
			}
			if(e.getSource()==btnConfirmTablet)
			{
				cadastroTablet();
				clearFields();
				pnlDesktop.setVisible(false);
				pnlExibir.setVisible(false);
				pnlTablet.setVisible(false);
				btnSair.setVisible(true);
				btnCadastrarDesktop.setVisible(true);
				btnCadastrarTablet.setVisible(true);
				btnExibir.setVisible(true);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
	}
}
