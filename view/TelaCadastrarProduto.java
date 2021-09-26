package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaCadastrarProduto implements ActionListener {
	//Atributos
	private JFrame frmCadastrarProduto = new JFrame("Cadastro de Produto");
	private JLabel lblNewLabel = new JLabel("Qual produto deseja cadastrar?");
	private JButton btnPerfume = new JButton("Perfume");
	private JButton btnHidratante = new JButton("Hidratante");
	private JButton btnProtetorSolar = new JButton("Protetor Solar");
	private JButton btnShampoo = new JButton("Shampoo");
	private JButton btnCondicionador = new JButton("Condicionador");
	private JButton btnSaboneteLiquido = new JButton("Sabonete L\u00EDquido");
	private JButton btnVoltar = new JButton("Voltar");
	private JFrame frmProduto;
	
	//Construtor
	public TelaCadastrarProduto(JFrame frmProduto) {
		//Configura os componentes da JFrame da tela de cadastro de produto
		this.frmProduto = frmProduto;
		this.frmCadastrarProduto.setBounds(100, 100, 534, 451);
		this.frmCadastrarProduto.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmCadastrarProduto.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		this.frmCadastrarProduto.getContentPane().setLayout(null);
		
		//Configura o label título da pergunta
		this.lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.lblNewLabel.setBounds(143, 46, 264, 36);
		this.frmCadastrarProduto.getContentPane().add(lblNewLabel);
		
		//Configura o botão de perfume
		this.btnPerfume.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnPerfume.setBounds(156, 112, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnPerfume);
		
		//Configura o botão de hidratante
		this.btnHidratante.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnHidratante.setBounds(156, 150, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnHidratante);
		
		//Configura o botão de protetor solar
		this.btnProtetorSolar.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnProtetorSolar.setBounds(156, 188, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnProtetorSolar);
		
		//Configura o botão de shampoo
		this.btnShampoo.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnShampoo.setBounds(156, 227, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnShampoo);
		
		//Configura o botão de condicionador
		this.btnCondicionador.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnCondicionador.setBounds(156, 266, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnCondicionador);
		
		//Condigura o botão de sabonte líquido
		this.btnSaboneteLiquido.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnSaboneteLiquido.setBounds(156, 304, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnSaboneteLiquido);
		
		//Condigura o botão de voltar
		this.btnVoltar.setBounds(415, 377, 89, 23);
		this.frmCadastrarProduto.getContentPane().add(btnVoltar);
		this.frmCadastrarProduto.setLocationRelativeTo(null);
		this.frmCadastrarProduto.setResizable(false);
		
		//Direciona e configura os eventos dos botões
		this.getBtnPerfume().addActionListener(this);
		this.getBtnHidratante().addActionListener(this);
		this.getBtnProtetorSolar().addActionListener(this);
		this.getBtnShampoo().addActionListener(this);
		this.getBtnCondicionador().addActionListener(this);
		this.getBtnSaboneteLiquido().addActionListener(this);
		this.getBtnVoltar().addActionListener(this);
		
		//Permitindo que a JFrame fique visível
		this.frmCadastrarProduto.setLocationRelativeTo(null);
		this.frmCadastrarProduto.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o cadastro de perfume
		
		//Inicia os eventos sobre o cadastro de hidratante
		
		//Inicia os eventos sobre o cadastro de protetor solar
		
		//Inicia os eventos sobre o cadastro de shampoo
		
		//Inicia os eventos sobre o cadastro de condicionador
		
		//Inicia os eventos sobre o cadastro de sabonete líquido
		
		//Inicia os eventos sobre o botão voltar
		
	}
	
	//Métodos acessores
	public JFrame getFrmCadastrarProduto() {
		return frmCadastrarProduto;
	}
	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}
	public JButton getBtnPerfume() {
		return btnPerfume;
	}
	public JButton getBtnHidratante() {
		return btnHidratante;
	}
	public JButton getBtnProtetorSolar() {
		return btnProtetorSolar;
	}
	public JButton getBtnShampoo() {
		return btnShampoo;
	}
	public JButton getBtnCondicionador() {
		return btnCondicionador;
	}
	public JButton getBtnSaboneteLiquido() {
		return btnSaboneteLiquido;
	}
	public JButton getBtnVoltar() {
		return btnVoltar;
	}
	public JFrame getFrmProduto() {
		return frmProduto;
	}
	
}
