package SistemaBanco;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

//Sistema que simula o cadastro em um banco.


public class main extends JFrame{
	static List<ContaBancaria> contas = new ArrayList<ContaBancaria>();
	static ContaCorrente auxCCo;
	static ContaPoupanca auxCPo;
	Manipulador mani = new Manipulador();
	private JButton btnCriarContaCorre;
	private JButton btnCriarContaPoup;
	private JButton btnSacar;
	private JButton btnDepositar;
	private JButton btnVerificarSaldo;
	private JButton btnSair;
	private JButton btnReturn;
	private JTextField tFdNumeroCorrent;
	private JTextField tFdSenhaCorrent;
	private JButton btnConfirmCriarCorrent;
	private JPanel pnlCadastrarPoup;
	private JTextField tFdNumeroPoup;
	private JTextField tFdSenhaPoup;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnConfirmPoup;
	private JTextField tFdRendimentoPoup;
	private JLabel lblNewLabel_7;
	private JPanel pnlDepositar;
	private JTextField tFdNumeroDepo;
	private JLabel lblNewLabel_8;
	private JPasswordField pFdSenha;
	private JTextField tFdValorDeposito;
	private JButton btnConfirmDeposito;
	private JTextField tFdNumeroSaque;
	private JTextField tFdValorSaque;
	private JPasswordField pFdSenhaSaque;
	private JButton btnConfirmSaque;
	private JTextField tFdNumeroVerificar;
	private JPasswordField pFdSenhaVerificar;
	private JButton btnConfirmVerificar;
	private JTextArea tAaVerificar;
	private JPanel pnlSacar;
	private JPanel pnlVerificarSaldo;
	private JPanel pnlCriarCorrente;
	
	public void clearFields()
	{
		tFdNumeroCorrent.setText(null);
		tFdNumeroDepo.setText(null);
		tFdNumeroPoup.setText(null);
		tFdNumeroSaque.setText(null);
		tFdNumeroVerificar.setText(null);
		tFdRendimentoPoup.setText(null);
		tFdSenhaCorrent.setText(null);
		tFdSenhaPoup.setText(null);
		tFdValorDeposito.setText(null);
		tFdValorSaque.setText(null);
	}
	
	public void criarContaCorrente()
	{
		String aux="";
		int senha, numero;
		double auxD;
		aux = tFdNumeroCorrent.getText();
		numero = Integer.parseInt(aux);
		aux = tFdSenhaCorrent.getText();
		senha = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Digite o limite");
		auxD= Double.parseDouble(aux);
		auxCCo = new ContaCorrente(senha,numero,auxD);
		contas.add(auxCCo);
		
	}
	
	public void criarContaPoup()
	{
		String aux="";
		int senha, numero;
		double auxD;
		aux = tFdNumeroPoup.getText();
		numero = Integer.parseInt(aux);
		aux = tFdSenhaPoup.getText();
		senha = Integer.parseInt(aux);
		aux = tFdRendimentoPoup.getText();
		auxD= Double.parseDouble(aux);
		auxCPo = new ContaPoupanca(senha,numero,auxD);
		contas.add(auxCPo);
	}
	
	public void Depositar()
	{
		String aux = "";
		double valor;
		int senha, numero;
		aux = tFdNumeroDepo.getText();
		numero = Integer.parseInt(aux);
		aux = pFdSenha.getSelectedText();
		senha = Integer.parseInt(aux);
		aux = tFdValorDeposito.getText();
		valor = Double.parseDouble(aux);
		
		for (int i=0;i<contas.size();i++)
		{
			if(numero==contas.get(i).getNumero() && senha==contas.get(i).getSenha())
			{
				contas.get(i).setSaldo(contas.get(i).getSaldo()+valor);
				JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
				break;
			}
		}
	}
	public void Sacar()
	{
		String aux = "";
		double valor;
		int senha, numero;
		aux = tFdNumeroSaque.getText();
		numero = Integer.parseInt(aux);
		aux = pFdSenhaSaque.getSelectedText();
		senha = Integer.parseInt(aux);
		aux = tFdValorSaque.getText();
		valor = Double.parseDouble(aux);
		for (int i=0;i<contas.size();i++)
		{
			if(numero==contas.get(i).getNumero() && senha==contas.get(i).getSenha())
			{
				
				if(contas.get(i).sacar(valor))
				{
					JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "O saque falou, tente novamente.");
					break;
				}
			}
		}
		
	}
	
	public void VerificarSaldo()
	{
		String aux = "";
		int senha, numero;
		aux = tFdNumeroVerificar.getText();
		numero = Integer.parseInt(aux);
		aux = pFdSenhaVerificar.getSelectedText();
		senha = Integer.parseInt(aux);
		
		for (int i=0;i<contas.size();i++)
		{
			if(numero==contas.get(i).getNumero() && senha==contas.get(i).getSenha())
			{
				
				aux = "A conta: "+contas.get(i).getNumero()+"\nsaldo: "+contas.get(i).getSaldo()+"\n";
				tAaVerificar.setText(aux);
				break;
			}
	}
	}
	
	public main()
	{
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 30));
		getContentPane().setLayout(null);
		
		pnlCadastrarPoup = new JPanel();
		pnlCadastrarPoup.setBounds(0, 0, 484, 497);
		pnlCadastrarPoup.setVisible(false);
		getContentPane().add(pnlCadastrarPoup);
		pnlCadastrarPoup.setLayout(null);
		
		tFdNumeroPoup = new JTextField();
		tFdNumeroPoup.setBounds(124, 152, 220, 20);
		pnlCadastrarPoup.add(tFdNumeroPoup);
		tFdNumeroPoup.setColumns(10);
		
		tFdSenhaPoup = new JTextField();
		tFdSenhaPoup.setBounds(124, 255, 220, 20);
		pnlCadastrarPoup.add(tFdSenhaPoup);
		tFdSenhaPoup.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Numero");
		lblNewLabel_4.setBounds(209, 130, 46, 14);
		pnlCadastrarPoup.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Senha");
		lblNewLabel_5.setBounds(209, 230, 46, 14);
		pnlCadastrarPoup.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Cadastro - Conta Poupan\u00E7a");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_6.setBounds(64, 11, 393, 45);
		pnlCadastrarPoup.add(lblNewLabel_6);
		
		btnConfirmPoup = new JButton("Criar");
		btnConfirmPoup.setBounds(184, 430, 89, 23);
		btnConfirmPoup.addActionListener(mani);
		pnlCadastrarPoup.add(btnConfirmPoup);
		
		tFdRendimentoPoup = new JTextField();
		tFdRendimentoPoup.setBounds(184, 353, 86, 20);
		pnlCadastrarPoup.add(tFdRendimentoPoup);
		tFdRendimentoPoup.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Rendimento Poupan\u00E7a");
		lblNewLabel_7.setBounds(169, 328, 127, 14);
		pnlCadastrarPoup.add(lblNewLabel_7);
		
		pnlVerificarSaldo = new JPanel();
		pnlVerificarSaldo.setBounds(0, 0, 484, 497);
		pnlVerificarSaldo.setVisible(false);
		getContentPane().add(pnlVerificarSaldo);
		pnlVerificarSaldo.setLayout(null);
		
		tFdNumeroVerificar = new JTextField();
		tFdNumeroVerificar.setBounds(41, 58, 156, 20);
		pnlVerificarSaldo.add(tFdNumeroVerificar);
		tFdNumeroVerificar.setColumns(10);
		
		pFdSenhaVerificar = new JPasswordField();
		pFdSenhaVerificar.setBounds(288, 58, 156, 20);
		pnlVerificarSaldo.add(pFdSenhaVerificar);
		
		JLabel lblNewLabel_14 = new JLabel("Numero");
		lblNewLabel_14.setBounds(92, 33, 65, 14);
		pnlVerificarSaldo.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Senha");
		lblNewLabel_15.setBounds(342, 33, 46, 14);
		pnlVerificarSaldo.add(lblNewLabel_15);
		
		btnConfirmVerificar = new JButton("Buscar");
		btnConfirmVerificar.setBounds(192, 103, 89, 23);
		btnConfirmVerificar.addActionListener(mani);
		pnlVerificarSaldo.add(btnConfirmVerificar);
		
		tAaVerificar = new JTextArea();
		tAaVerificar.setEditable(false);
		tAaVerificar.setBounds(10, 148, 464, 321);
		pnlVerificarSaldo.add(tAaVerificar);
		
		pnlSacar = new JPanel();
		pnlSacar.setBounds(0, 0, 484, 497);
		pnlSacar.setVisible(false);
		getContentPane().add(pnlSacar);
		pnlSacar.setLayout(null);
		
		tFdNumeroSaque = new JTextField();
		tFdNumeroSaque.setBounds(128, 103, 187, 20);
		pnlSacar.add(tFdNumeroSaque);
		tFdNumeroSaque.setColumns(10);
		
		tFdValorSaque = new JTextField();
		tFdValorSaque.setBounds(128, 279, 187, 20);
		pnlSacar.add(tFdValorSaque);
		tFdValorSaque.setColumns(10);
		
		pFdSenhaSaque = new JPasswordField();
		pFdSenhaSaque.setBounds(128, 190, 187, 20);
		pnlSacar.add(pFdSenhaSaque);
		
		JLabel lblNewLabel_11 = new JLabel("Numero");
		lblNewLabel_11.setBounds(199, 85, 68, 14);
		pnlSacar.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Senha");
		lblNewLabel_12.setBounds(199, 165, 46, 14);
		pnlSacar.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Saque");
		lblNewLabel_13.setBounds(199, 254, 46, 14);
		pnlSacar.add(lblNewLabel_13);
		
		btnConfirmSaque = new JButton("Sacar");
		btnConfirmSaque.setBounds(178, 376, 89, 23);
		btnConfirmSaque.addActionListener(mani);
		pnlSacar.add(btnConfirmSaque);
		
		pnlDepositar = new JPanel();
		pnlDepositar.setBounds(0, 0, 484, 497);
		pnlDepositar.setVisible(false);
		getContentPane().add(pnlDepositar);
		pnlDepositar.setLayout(null);
		
		tFdNumeroDepo = new JTextField();
		tFdNumeroDepo.setBounds(154, 81, 128, 20);
		pnlDepositar.add(tFdNumeroDepo);
		tFdNumeroDepo.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Numero da conta");
		lblNewLabel_8.setBounds(178, 56, 128, 14);
		pnlDepositar.add(lblNewLabel_8);
		
		pFdSenha = new JPasswordField();
		pFdSenha.setBounds(154, 158, 128, 20);
		pnlDepositar.add(pFdSenha);
		
		JLabel lblNewLabel_9 = new JLabel("Senha");
		lblNewLabel_9.setBounds(196, 133, 46, 14);
		pnlDepositar.add(lblNewLabel_9);
		
		tFdValorDeposito = new JTextField();
		tFdValorDeposito.setBounds(172, 243, 86, 20);
		pnlDepositar.add(tFdValorDeposito);
		tFdValorDeposito.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Deposito");
		lblNewLabel_10.setBounds(178, 218, 64, 14);
		pnlDepositar.add(lblNewLabel_10);
		
		btnConfirmDeposito = new JButton("Depositar");
		btnConfirmDeposito.setBounds(154, 334, 152, 23);
		btnConfirmDeposito.addActionListener(mani);
		pnlDepositar.add(btnConfirmDeposito);
		
		pnlCriarCorrente = new JPanel();
		pnlCriarCorrente.setBounds(0, 0, 484, 497);
		pnlCriarCorrente.setVisible(false);
		getContentPane().add(pnlCriarCorrente);
		pnlCriarCorrente.setLayout(null);
		
		tFdNumeroCorrent = new JTextField();
		tFdNumeroCorrent.setBounds(96, 170, 268, 20);
		pnlCriarCorrente.add(tFdNumeroCorrent);
		tFdNumeroCorrent.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero da conta");
		lblNewLabel_1.setBounds(178, 145, 108, 14);
		pnlCriarCorrente.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(211, 240, 46, 14);
		pnlCriarCorrente.add(lblNewLabel_2);
		
		tFdSenhaCorrent = new JTextField();
		tFdSenhaCorrent.setBounds(96, 268, 268, 20);
		pnlCriarCorrente.add(tFdSenhaCorrent);
		tFdSenhaCorrent.setColumns(10);
		
		btnConfirmCriarCorrent = new JButton("Criar");
		btnConfirmCriarCorrent.setBounds(189, 333, 89, 23);
		btnConfirmCriarCorrent.addActionListener(mani);
		pnlCriarCorrente.add(btnConfirmCriarCorrent);
		
		JLabel lblNewLabel_3 = new JLabel("Cadastro - Conta Corrente");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(59, 11, 375, 53);
		pnlCriarCorrente.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Banco POO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(162, 11, 166, 42);
		getContentPane().add(lblNewLabel);
		
		btnCriarContaCorre = new JButton("Criar Conta Corrente");
		btnCriarContaCorre.setBounds(118, 94, 232, 23);
		btnCriarContaCorre.addActionListener(mani);
		getContentPane().add(btnCriarContaCorre);
		
		btnCriarContaPoup = new JButton("Criar Conta Poupan\u00E7a");
		btnCriarContaPoup.setBounds(118, 151, 232, 23);
		btnCriarContaPoup.addActionListener(mani);
		getContentPane().add(btnCriarContaPoup);
		
		btnSacar = new JButton("Sacar");
		btnSacar.setBounds(118, 213, 232, 23);
		btnSacar.addActionListener(mani);
		getContentPane().add(btnSacar);
		
		btnDepositar = new JButton("Depositar");
		btnDepositar.setBounds(118, 275, 232, 23);
		btnDepositar.addActionListener(mani);
		getContentPane().add(btnDepositar);
		
		btnVerificarSaldo = new JButton("Verificar Saldo");
		btnVerificarSaldo.setBounds(118, 339, 232, 23);
		btnVerificarSaldo.addActionListener(mani);
		getContentPane().add(btnVerificarSaldo);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(118, 401, 232, 23);
		btnSair.addActionListener(mani);
		getContentPane().add(btnSair);
		
		btnReturn = new JButton("Voltar");
		btnReturn.setBounds(191, 513, 89, 23);
		btnReturn.addActionListener(mani);
		btnReturn.setVisible(false);
		getContentPane().add(btnReturn);
		
		
		setBounds(0, 0, 500, 600);
		setVisible(true);
	}
	
	public class Manipulador implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==btnSair)
			{
				System.exit(0);
			}
			if(e.getSource()==btnReturn)
			{
				pnlCadastrarPoup.setVisible(false);
				pnlCriarCorrente.setVisible(false);
				pnlDepositar.setVisible(false);
				pnlSacar.setVisible(false);
				pnlVerificarSaldo.setVisible(false);
				btnReturn.setVisible(false);
				btnCriarContaCorre.setVisible(true);
				btnCriarContaPoup.setVisible(true);
				btnSacar.setVisible(true);
				btnDepositar.setVisible(true);
				btnVerificarSaldo.setVisible(true);
				btnSair.setVisible(true);	
			}
			if(e.getSource()==btnCriarContaPoup)
			{
				pnlCadastrarPoup.setVisible(true);
				pnlCriarCorrente.setVisible(false);
				pnlDepositar.setVisible(false);
				pnlSacar.setVisible(false);
				pnlVerificarSaldo.setVisible(false);
				btnReturn.setVisible(true);
				btnCriarContaCorre.setVisible(false);
				btnCriarContaPoup.setVisible(false);
				btnSacar.setVisible(false);
				btnDepositar.setVisible(false);
				btnVerificarSaldo.setVisible(false);
				btnSair.setVisible(false);
			}
			if(e.getSource()==btnCriarContaCorre)
			{
				pnlCadastrarPoup.setVisible(false);
				pnlCriarCorrente.setVisible(true);
				pnlDepositar.setVisible(false);
				pnlSacar.setVisible(false);
				pnlVerificarSaldo.setVisible(false);
				btnReturn.setVisible(true);
				btnCriarContaCorre.setVisible(false);
				btnCriarContaPoup.setVisible(false);
				btnSacar.setVisible(false);
				btnDepositar.setVisible(false);
				btnVerificarSaldo.setVisible(false);
				btnSair.setVisible(false);
			}
			if(e.getSource()==btnSacar)
			{
				pnlCadastrarPoup.setVisible(false);
				pnlCriarCorrente.setVisible(false);
				pnlDepositar.setVisible(false);
				pnlSacar.setVisible(true);
				pnlVerificarSaldo.setVisible(false);
				btnReturn.setVisible(true);
				btnCriarContaCorre.setVisible(false);
				btnCriarContaPoup.setVisible(false);
				btnSacar.setVisible(false);
				btnDepositar.setVisible(false);
				btnVerificarSaldo.setVisible(false);
				btnSair.setVisible(false);
			}
			if(e.getSource()==btnDepositar)
			{
				pnlCadastrarPoup.setVisible(false);
				pnlCriarCorrente.setVisible(false);
				pnlDepositar.setVisible(true);
				pnlSacar.setVisible(false);
				pnlVerificarSaldo.setVisible(false);
				btnReturn.setVisible(true);
				btnCriarContaCorre.setVisible(false);
				btnCriarContaPoup.setVisible(false);
				btnSacar.setVisible(false);
				btnDepositar.setVisible(false);
				btnVerificarSaldo.setVisible(false);
				btnSair.setVisible(false);
			}
			if(e.getSource()==btnVerificarSaldo)
			{
				pnlCadastrarPoup.setVisible(false);
				pnlCriarCorrente.setVisible(false);
				pnlDepositar.setVisible(false);
				pnlSacar.setVisible(false);
				pnlVerificarSaldo.setVisible(true);
				btnReturn.setVisible(true);
				btnCriarContaCorre.setVisible(false);
				btnCriarContaPoup.setVisible(false);
				btnSacar.setVisible(false);
				btnDepositar.setVisible(false);
				btnVerificarSaldo.setVisible(false);
				btnSair.setVisible(false);
			}
			if(e.getSource()==btnConfirmCriarCorrent)
			{
				criarContaCorrente();
				clearFields();
			}
			if(e.getSource()==btnConfirmPoup)
			{
				criarContaPoup();
				clearFields();
			}
			if(e.getSource()==btnConfirmDeposito)
			{
				Depositar();
				clearFields();
			}
			if(e.getSource()==btnConfirmSaque)
			{
				Sacar();
				clearFields();
			}
			if(e.getSource()==btnConfirmVerificar)
			{
				VerificarSaldo();
				clearFields();
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
	}
}
