package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaMenuProduto implements ActionListener {
	//Atributos
	private JFrame frmProduto = new JFrame("Produto");
	private JButton btnCadastrarProduto = new JButton("Cadastrar um produto");
	private JButton btnAumentarOuDiminuirEstoque = new JButton("Aumentar ou diminuir estoque de um produto");
	private JButton btnEditarInformacoesProduto = new JButton("Editar informa\u00E7\u00F5es de um produto");
	private JButton btnListarDadosProduto = new JButton("Listar dados dos produtos");
	private JButton btnDeletarUmProduto = new JButton("Deletar um produto");
	private JButton btnVoltar = new JButton("Voltar");
	private JFrame telaMenuInicial;
	
	public TelaMenuProduto(JFrame telaMenuInicial) {
		//Configura os componentes da JFrame da tela Produto
		this.telaMenuInicial = telaMenuInicial;
		this.frmProduto.setBounds(100, 100, 651, 409);
		this.frmProduto.getContentPane().setLayout(null);
		this.frmProduto.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmProduto.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o botão para iniciar eventos sobre cadastro de um produto
		this.btnCadastrarProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnCadastrarProduto.setBounds(112, 38, 405, 47);
		this.frmProduto.getContentPane().add(btnCadastrarProduto);
		
		//Configura o botão para iniciar eventos sobre o estoque
		this.btnAumentarOuDiminuirEstoque.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnAumentarOuDiminuirEstoque.setBounds(112, 96, 405, 47);
		this.frmProduto.getContentPane().add(btnAumentarOuDiminuirEstoque);
		
		//Configura o botão para iniciar eventos sobre edição de informações do produto
		this.btnEditarInformacoesProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnEditarInformacoesProduto.setBounds(112, 154, 405, 47);
		this.frmProduto.getContentPane().add(btnEditarInformacoesProduto);
		
		//Configura o botão para iniciar eventos sobre listagem de dados dos produtos
		this.btnListarDadosProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnListarDadosProduto.setBounds(112, 212, 405, 47);
		this.frmProduto.getContentPane().add(btnListarDadosProduto);
		
		//Configura o botão para iniciar eventos sobre deleção de um produto
		this.btnDeletarUmProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnDeletarUmProduto.setBounds(112, 270, 405, 40);
		this.frmProduto.getContentPane().add(btnDeletarUmProduto);
		this.frmProduto.setResizable(false);
		
		//Configura o botão voltar
		this.btnVoltar.setBounds(536, 336, 89, 23);
		this.frmProduto.getContentPane().add(btnVoltar);
		this.frmProduto.setResizable(false);
		
		//Direciona e configura os eventos dos botões
		this.btnCadastrarProduto.addActionListener(this);
		this.btnAumentarOuDiminuirEstoque.addActionListener(this);
		this.btnEditarInformacoesProduto.addActionListener(this);
		this.btnListarDadosProduto.addActionListener(this);
		this.btnDeletarUmProduto.addActionListener(this);
		this.btnVoltar.addActionListener(this);
		
		//Permitindo que a JFrame fique visível
		this.frmProduto.setLocationRelativeTo(null);
		this.frmProduto.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o cadastro de um produto
		if (botao == this.getBtnCadastrarProduto()) {
			
		}
		
		//Inicia os eventos sobre o estoque
		if (botao == this.getBtnAumentarOuDiminuirEstoque()) {
			
		}
		
		//Inicia os eventos sobre a edição de informações de um produto
		if (botao == this.getBtnEditarInformacoesProduto()) {
			
		}
		
		//Inicia os eventos sobre listagem de dados dos produtos
		if (botao == this.getBtnListarDadosProduto()) {
			
		}
		
		//Inicia os eventos sobre deleção de um produto
		if (botao == this.getBtnDeletarUmProduto()) {
			
		}
		
		//Inicia os eventos sobre o botão voltar
		if (botao == this.getBtnVoltar()) {
			this.getFrmProduto().setVisible(false);
			this.getTelaMenuInicial().setVisible(true);
		}
	}
	
	//Métodos acessores
	public JFrame getFrmProduto() {
		return frmProduto;
	}
	public JButton getBtnCadastrarProduto() {
		return btnCadastrarProduto;
	}
	public JButton getBtnAumentarOuDiminuirEstoque() {
		return btnAumentarOuDiminuirEstoque;
	}
	public JButton getBtnEditarInformacoesProduto() {
		return btnEditarInformacoesProduto;
	}
	public JButton getBtnListarDadosProduto() {
		return btnListarDadosProduto;
	}
	public JButton getBtnDeletarUmProduto() {
		return btnDeletarUmProduto;
	}
	public JButton getBtnVoltar() {
		return btnVoltar;
	}
	public JFrame getTelaMenuInicial() {
		return telaMenuInicial;
	}

}
