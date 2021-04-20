package CadastrosFuncionariosEscola;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class main extends JFrame{
	static List <Empregado> empregados = new ArrayList<Empregado>();
	static Funcionario auxFun = new Funcionario();
	static Professor auxProf = new Professor();
	Manipulador mani = new Manipulador();
	private JTextField tFdNomeFunc;
	private JTextField tFdEncargosFunc;
	private JTextField tFdSalarioFunc;
	private JTextField tFdNomeProf;
	private JTextField tFdnumHora;
	private JTextField tFdValorHora;
	private JTextField tFdEncargos;
	private JTextField tFdBuscar;
	private JPanel pnlBuscar;
	private JPanel pnlCadastrarProf;
	private JPanel pnlCadastrarFun;
	private JButton btnConfirmBusca;
	private JButton btnConfirmProf;
	private JButton btnConfirmFunc;
	private JButton btnCadastrarFuncio;
	private JButton btnCadastrarProf;
	private JButton btnSearch;
	private JButton btnLeave;
	private JButton btnReturn;
	private JTextArea tAaBusca;
	
	public String Search()
	{
		String auxString="", auxFim="";
		double auxDou,salario;
		auxString = tFdBuscar.getText();
		auxDou = Double.parseDouble(auxString);
		for(int i=0;i<empregados.size();i++)
		{
			salario = empregados.get(i).salarioLiquido();
			if(salario >=auxDou)
			{
				auxFim += empregados.get(i).getNome()+" - R$"+salario+"\n";
			}
		}
		return auxFim;
	}
	
	public void clearFields()
	{
		tFdBuscar.setText(null);
		tFdEncargos.setText(null);
		tFdEncargosFunc.setText(null);
		tFdNomeFunc.setText(null);
		tFdNomeProf.setText(null);
		tFdnumHora.setText(null);
		tFdSalarioFunc.setText(null);
		tFdValorHora.setText(null);
	}
	
	public void CadastrarProf()
	{
		String auxString = "";
		double auxDou;
		int auxInt=0;
		auxProf=new Professor();
		
		auxString = tFdNomeProf.getText();
		auxProf.setNome(auxString);
		auxString = tFdEncargos.getText();
		auxDou = Double.parseDouble(auxString);
		auxProf.setEncargos(auxDou);
		auxString=tFdValorHora.getText();
		auxDou = Double.parseDouble(auxString);
		auxProf.setValorHora(auxDou);
		auxString=tFdnumHora.getText();
		auxInt= Integer.parseInt(auxString);
		auxProf.setNumHoras(auxInt);
		
		empregados.add(auxProf);
	}
	
	
	public void cadastrarFunc()
	{
		String auxString = "";
		double auxDou;
		auxFun=new Funcionario();
		
		auxString = tFdNomeFunc.getText();
		auxFun.setNome(auxString);
		auxString = tFdEncargosFunc.getText();
		auxDou = Double.parseDouble(auxString);
		auxFun.setEncargos(auxDou);
		auxString=tFdSalarioFunc.getText();
		auxDou = Double.parseDouble(auxString);
		auxFun.setSalario(auxDou);
		
		empregados.add(auxFun);
	}
	
	public main()
	{
		getContentPane().setLayout(null);
		
		pnlBuscar = new JPanel();
		pnlBuscar.setBounds(0, 0, 484, 409);
		pnlBuscar.setVisible(false);
		getContentPane().add(pnlBuscar);
		pnlBuscar.setLayout(null);
		
		tFdBuscar = new JTextField();
		tFdBuscar.setBounds(76, 36, 86, 20);
		pnlBuscar.add(tFdBuscar);
		tFdBuscar.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Digite o valor desejado");
		lblNewLabel_9.setBounds(76, 11, 151, 14);
		pnlBuscar.add(lblNewLabel_9);
		
		tAaBusca = new JTextArea();
		tAaBusca.setEditable(false);
		tAaBusca.setBounds(21, 90, 441, 308);
		pnlBuscar.add(tAaBusca);
		
		btnConfirmBusca = new JButton("Buscar");
		btnConfirmBusca.setBounds(320, 35, 89, 23);
		btnConfirmBusca.addActionListener(mani);
		pnlBuscar.add(btnConfirmBusca);
		
		pnlCadastrarProf = new JPanel();
		pnlCadastrarProf.setBounds(0, 0, 484, 409);
		pnlCadastrarProf.setVisible(false);
		getContentPane().add(pnlCadastrarProf);
		pnlCadastrarProf.setLayout(null);
		
		tFdNomeProf = new JTextField();
		tFdNomeProf.setBounds(39, 140, 135, 20);
		pnlCadastrarProf.add(tFdNomeProf);
		tFdNomeProf.setColumns(10);
		
		tFdnumHora = new JTextField();
		tFdnumHora.setBounds(330, 140, 86, 20);
		pnlCadastrarProf.add(tFdnumHora);
		tFdnumHora.setColumns(10);
		
		tFdValorHora = new JTextField();
		tFdValorHora.setBounds(39, 242, 86, 20);
		pnlCadastrarProf.add(tFdValorHora);
		tFdValorHora.setColumns(10);
		
		tFdEncargos = new JTextField();
		tFdEncargos.setBounds(330, 242, 86, 20);
		pnlCadastrarProf.add(tFdEncargos);
		tFdEncargos.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nome");
		lblNewLabel_5.setBounds(79, 115, 46, 14);
		pnlCadastrarProf.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Numero de horas trabalhada");
		lblNewLabel_6.setBounds(305, 115, 155, 14);
		pnlCadastrarProf.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Valor da hora");
		lblNewLabel_7.setBounds(39, 221, 96, 14);
		pnlCadastrarProf.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Encargos");
		lblNewLabel_8.setBounds(330, 221, 86, 14);
		pnlCadastrarProf.add(lblNewLabel_8);
		
		btnConfirmProf = new JButton("Cadastrar");
		btnConfirmProf.setBounds(191, 186, 89, 23);
		btnConfirmProf.addActionListener(mani);
		pnlCadastrarProf.add(btnConfirmProf);
		
		pnlCadastrarFun = new JPanel();
		pnlCadastrarFun.setBounds(0, 0, 484, 409);
		pnlCadastrarFun.setVisible(false);
		getContentPane().add(pnlCadastrarFun);
		pnlCadastrarFun.setLayout(null);
		
		tFdNomeFunc = new JTextField();
		tFdNomeFunc.setBounds(37, 150, 146, 20);
		pnlCadastrarFun.add(tFdNomeFunc);
		tFdNomeFunc.setColumns(10);
		
		tFdEncargosFunc = new JTextField();
		tFdEncargosFunc.setBounds(304, 109, 86, 20);
		pnlCadastrarFun.add(tFdEncargosFunc);
		tFdEncargosFunc.setColumns(10);
		
		tFdSalarioFunc = new JTextField();
		tFdSalarioFunc.setBounds(304, 189, 86, 20);
		pnlCadastrarFun.add(tFdSalarioFunc);
		tFdSalarioFunc.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(98, 125, 67, 14);
		pnlCadastrarFun.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salario");
		lblNewLabel_2.setBounds(304, 164, 86, 14);
		pnlCadastrarFun.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Encargos");
		lblNewLabel_3.setBounds(304, 85, 86, 14);
		pnlCadastrarFun.add(lblNewLabel_3);
		
		btnConfirmFunc = new JButton("Cadastrar");
		btnConfirmFunc.setBounds(194, 281, 89, 23);
		btnConfirmFunc.addActionListener(mani);
		pnlCadastrarFun.add(btnConfirmFunc);
		
		JLabel lblNewLabel_4 = new JLabel("Cadastrar Funcion\u00E1rio");
		lblNewLabel_4.setBounds(179, 11, 225, 14);
		pnlCadastrarFun.add(lblNewLabel_4);
		
		btnCadastrarFuncio = new JButton("Cadastrar Funcionario");
		btnCadastrarFuncio.setBounds(85, 140, 284, 23);
		btnCadastrarFuncio.addActionListener(mani);
		getContentPane().add(btnCadastrarFuncio);
		
		btnCadastrarProf = new JButton("Cadastrar Professor");
		btnCadastrarProf.setBounds(85, 210, 284, 23);
		btnCadastrarProf.addActionListener(mani);
		getContentPane().add(btnCadastrarProf);
		
		btnSearch = new JButton("Buscar por sal\u00E1rio");
		btnSearch.setBounds(85, 289, 284, 23);
		btnSearch.addActionListener(mani);
		getContentPane().add(btnSearch);
		
		btnLeave = new JButton("Sair");
		btnLeave.setBounds(85, 366, 284, 23);
		btnLeave.addActionListener(mani);
		getContentPane().add(btnLeave);
		
		JLabel lblNewLabel = new JLabel("Tela de Cadastros");
		lblNewLabel.setBounds(159, 25, 163, 14);
		getContentPane().add(lblNewLabel);
		
		btnReturn = new JButton("Voltar");
		btnReturn.setBounds(195, 420, 89, 23);
		btnReturn.addActionListener(mani);
		btnReturn.setVisible(false);
		getContentPane().add(btnReturn);
		setBounds(200, 200, 500, 500);
		setVisible(true);
	}
	
	public class Manipulador implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnCadastrarFuncio)
			{
				pnlBuscar.setVisible(false);
				pnlCadastrarFun.setVisible(true);
				pnlCadastrarProf.setVisible(false);
				btnReturn.setVisible(true);
				btnCadastrarFuncio.setVisible(false);
				btnSearch.setVisible(false);
				btnCadastrarProf.setVisible(false);
				btnConfirmBusca.setVisible(false);
				btnConfirmFunc.setVisible(true);
				btnConfirmProf.setVisible(false);
				btnLeave.setVisible(false);
			}
			if(e.getSource()==btnCadastrarProf)
			{
				pnlBuscar.setVisible(false);
				pnlCadastrarFun.setVisible(false);
				pnlCadastrarProf.setVisible(true);
				btnReturn.setVisible(true);
				btnCadastrarFuncio.setVisible(false);
				btnSearch.setVisible(false);
				btnCadastrarProf.setVisible(false);
				btnConfirmBusca.setVisible(false);
				btnConfirmFunc.setVisible(false);
				btnConfirmProf.setVisible(true);
				btnLeave.setVisible(false);
			}
			if(e.getSource()==btnSearch)
			{
				pnlBuscar.setVisible(true);
				pnlCadastrarFun.setVisible(false);
				pnlCadastrarProf.setVisible(false);
				btnReturn.setVisible(true);
				btnCadastrarFuncio.setVisible(false);
				btnSearch.setVisible(false);
				btnCadastrarProf.setVisible(false);
				btnConfirmBusca.setVisible(true);
				btnConfirmFunc.setVisible(false);
				btnConfirmProf.setVisible(false);
				btnLeave.setVisible(false);
			}
			if(e.getSource()==btnReturn)
			{
				pnlBuscar.setVisible(false);
				pnlCadastrarFun.setVisible(false);
				pnlCadastrarProf.setVisible(false);
				btnReturn.setVisible(false);
				btnCadastrarFuncio.setVisible(true);
				btnSearch.setVisible(true);
				btnCadastrarProf.setVisible(true);
				btnConfirmBusca.setVisible(false);
				btnConfirmFunc.setVisible(false);
				btnConfirmProf.setVisible(false);
				btnLeave.setVisible(true);
			}
			if(e.getSource()==btnLeave)
			{
				System.exit(0);
			}
			if(e.getSource()==btnConfirmProf)
			{
				CadastrarProf();
				clearFields();
			}
			if(e.getSource()==btnConfirmFunc)
			{
				cadastrarFunc();
				clearFields();
			}
			if(e.getSource()==btnConfirmBusca)
			{
				String aux="";
				aux = Search();
				clearFields();
				tAaBusca.setText(aux);
			}
		}
		
	}
	public static void main(String[] args) {
		new main();

	}
}
