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

public class TelaMenuInicial extends JFrame implements ActionListener {
	// Atributos
	private static final long serialVersionUID = 1L;
	private JFrame frmMenuInicial = new JFrame("Menu Inicial");
	private JLabel lblTituloInicial = new JLabel("Loja de Perfumes");
	private JButton btnProduto = new JButton("Produto");
	private JButton btnCliente = new JButton("Cliente");
	private JButton btnCompra = new JButton("Compra");
	
	//Constutor iniciando a montagem dos componentes gr�ficos da tela inicial
	public TelaMenuInicial() {
		// Configura os componentes da JFrame do Menu Inicial
		this.frmMenuInicial.setBounds(100, 100, 698, 449);
		this.frmMenuInicial.getContentPane().setLayout(null);
		this.frmMenuInicial.setResizable(false);
		this.frmMenuInicial.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmMenuInicial.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		//Configura o Label titulo
		this.lblTituloInicial.setFont(new Font("Tahoma", Font.BOLD, 20));
		this.lblTituloInicial.setBounds(255, 24, 192, 59);
		this.frmMenuInicial.getContentPane().add(lblTituloInicial);

		//Configura o Bot�o para iniciar eventos sobre Produto
		this.btnProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnProduto.setBounds(200, 120, 274, 47);
		this.frmMenuInicial.getContentPane().add(btnProduto);

		//Configura o Bot�o para iniciar eventos sobre Cliente
		this.btnCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnCliente.setBounds(200, 193, 274, 47);
		this.frmMenuInicial.getContentPane().add(btnCliente);

		//Configura o Bot�o para iniciar eventos sobre Compra
		this.btnCompra.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnCompra.setBounds(201, 262, 274, 47);
		this.frmMenuInicial.getContentPane().add(btnCompra);

		//Permitindo que a JFrame fique vis�vel
		this.frmMenuInicial.setLocationRelativeTo(null);
		this.frmMenuInicial.setVisible(true);
	}

	public static void alterarEstiloGUI() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}
	}
	
	public static void main(String[] args) {
		//Altera o estilo da GUI
		alterarEstiloGUI();

		//Inicia a aplica��o atrav�s do Construtor
		TelaMenuInicial menu = new TelaMenuInicial();

		//Direciona e configura os eventos dos bot�es
		menu.getBtnProduto().addActionListener(menu);
		menu.getBtnCliente().addActionListener(menu);
		menu.getBtnCompra().addActionListener(menu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o bot�o escolhido
		JButton botao = (JButton) e.getSource();
		
		//Oculta o menu inical
		this.frmMenuInicial.setVisible(false);
		
		//Inicia os eventos sobre o bot�o de Produto
		if (botao == this.getBtnProduto()) {
			new TelaMenuProduto(this.getFrmMenuInicial());
		}
		
		//Inicia os eventos sobre o bot�o Cliente
		if (botao == this.getBtnCliente()) {
			
		}
		
		//Inicia os eventos sobre o bot�o Compra
		if (botao == this.getBtnCompra()) {
			
		}
	}
	
	//M�todos acessores
	public JFrame getFrmMenuInicial() {
		return frmMenuInicial;
	}
	public JLabel getLblTituloInicial() {
		return lblTituloInicial;
	}
	public JButton getBtnProduto() {
		return btnProduto;
	}
	public JButton getBtnCliente() {
		return btnCliente;
	}
	public JButton getBtnCompra() {
		return btnCompra;
	}
}