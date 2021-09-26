package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin implements ActionListener {
	//Atributos
	private JFrame frmTelaLogin = new JFrame("Login");
	private JLabel lblAviso = new JLabel("(Somente o administrador do sistema pode ter acesso a essa fun\u00E7\u00E3o)");
	private JLabel lblCPF = new JLabel("CPF:");
	private JLabel lblSenha = new JLabel("Senha:");
	private JTextField txtCPF = new JTextField();
	private JPasswordField campoSenha = new JPasswordField();
	private JButton btnEntrar = new JButton("Entrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame frmTelaMenuProduto;
	
	//Construtor
	public TelaLogin(JFrame telaMenuProduto) {
		//Configura os componentes da JFrame Tela de login
		this.frmTelaMenuProduto = telaMenuProduto;
		this.frmTelaLogin.setBounds(100, 100, 389, 262);
		this.frmTelaLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frmTelaLogin.getContentPane().setLayout(null);
		this.frmTelaLogin.setLocationRelativeTo(null);
		
		//Configura o label de aviso
		this.lblAviso.setFont(new Font("Tahoma", Font.ITALIC, 11));
		this.lblAviso.setBounds(29, 11, 344, 23);
		this.frmTelaLogin.getContentPane().add(lblAviso);
		
		//Configura o label CPF
		this.lblCPF.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.lblCPF.setBounds(10, 67, 53, 23);
		this.frmTelaLogin.getContentPane().add(lblCPF);
		
		//Configura o label Senha
		this.lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.lblSenha.setBounds(10, 115, 64, 17);
		this.frmTelaLogin.getContentPane().add(lblSenha);
		
		//Configura o campo de texto do CPF
		this.txtCPF = new JTextField();
		this.txtCPF.setBounds(68, 65, 248, 31);
		this.frmTelaLogin.getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		//Configura o campo de texto da Senha
		this.campoSenha = new JPasswordField();
		this.campoSenha.setBounds(68, 110, 248, 31);
		this.frmTelaLogin.getContentPane().add(campoSenha);
		
		//Configura o botão entrar
		this.btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.btnEntrar.setBounds(68, 166, 111, 31);
		this.frmTelaLogin.getContentPane().add(btnEntrar);
		this.frmTelaLogin.setResizable(false);
		
		//Configura o botão cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		this.btnCancelar.setBounds(205, 166, 111, 31);
		this.frmTelaLogin.getContentPane().add(btnCancelar);
		
		//Direciona e configura os eventos dos botões
		this.getBtnEntrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		//Permitindo que a JFrame fique visível e centralizada
		this.frmTelaLogin.setLocationRelativeTo(null);
		this.frmTelaLogin.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o botão Entrar
		if (botao == this.getBtnEntrar()) {
			String cpf = this.getTxtCPF().getText();
			String senha = new String(this.getCampoSenha().getPassword());
			
			if (cpf.equals("12345678900") && senha.equals("login")) {
				this.getFrmTelaLogin().setVisible(false);
				this.getFrmTelaMenuProduto().setVisible(false);
				//Abra a tela de cadastro do produto (nova JFrame)
			} else {
				JOptionPane.showMessageDialog(null, "Login não validado!", "", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		//Inicia os eventos sobre o botão Cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmTelaLogin().setVisible(false);
			this.getFrmTelaMenuProduto().setVisible(true);
		}
	}
	
	//Métodos acessores
	public JFrame getFrmTelaLogin() {
		return this.frmTelaLogin;
	}
	public JLabel getLblAviso() {
		return this.lblAviso;
	}
	public JLabel getLblCPF() {
		return this.lblCPF;
	}
	public JLabel getLblSenha() {
		return this.lblSenha;
	}
	public JTextField getTxtCPF() {
		return this.txtCPF;
	}
	public JPasswordField getCampoSenha() {
		return this.campoSenha;
	}
	public JButton getBtnEntrar() {
		return this.btnEntrar;
	}
	public JButton getBtnCancelar() {
		return this.btnCancelar;
	}
	public JFrame getFrmTelaMenuProduto() {
		return this.frmTelaMenuProduto;
	}
}
