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
import javax.swing.JTextField;

import model.*;

public class TelaInserirNovaQuantidade implements ActionListener {
	//Atributos
	private JFrame frmQuantidade = new JFrame("Dados dos perfumes");
	private JLabel lblTitulo = new JLabel("Informe a nova quantidade:");
	private JTextField txtCampoResposta = new JTextField();
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private Produto produto;
	private int opcao;
	private JFrame frmAlteracaoEstoque;
	
	//Construtor
	public TelaInserirNovaQuantidade(Produto produto, int opcao, JFrame frmAlteracaoEstoque) {
		this.produto = produto;
		this.opcao = opcao;
		this.frmAlteracaoEstoque = frmAlteracaoEstoque;
		this.frmQuantidade.setBounds(100, 100, 427, 265);
		this.frmQuantidade.setResizable(false);
		this.frmQuantidade.getContentPane().setLayout(null);
		this.frmQuantidade.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmQuantidade.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	
		this.lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.lblTitulo.setBounds(44, 58, 202, 30);
		this.frmQuantidade.getContentPane().add(lblTitulo);
		
		this.txtCampoResposta.setBounds(44, 99, 336, 30);
		this.frmQuantidade.getContentPane().add(txtCampoResposta);
		this.txtCampoResposta.setColumns(10);
	
		this.btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnCadastrar.setBounds(44, 144, 142, 35);
		this.frmQuantidade.getContentPane().add(btnCadastrar);
		
		this.btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnCancelar.setBounds(238, 144, 142, 35);
		this.frmQuantidade.getContentPane().add(btnCancelar);
		
		this.getBtnCadastrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		this.frmQuantidade.setLocationRelativeTo(null);
		this.frmQuantidade.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
				
		//Armazena o número digitado pelo usuário já convertido
		int quantidade = Integer.valueOf(this.getTxtCampoResposta().getText()).intValue();
		
		//Inicia os eventos sobre o botão cadastrar
		if (botao == this.getBtnCadastrar()) {
			switch (this.getOpcao()) {
			case 1:
				Perfumaria perfume = (Perfumaria) this.getProduto();
				perfume.setQuantidadeProduto(quantidade);
				JOptionPane.showMessageDialog(null, "Quantidade alterada com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			}
		}
		
		//Oculta janela
		this.getFrmQuantidade().dispose();
		this.getFrmAlteracaoEstoque().dispose();
		
		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmAlteracaoEstoque().setVisible(true);
		}
		
	}

	public JFrame getFrmQuantidade() {
		return this.frmQuantidade;
	}

	public JLabel getLblTitulo() {
		return this.lblTitulo;
	}

	public JTextField getTxtCampoResposta() {
		return this.txtCampoResposta;
	}

	public JButton getBtnCadastrar() {
		return this.btnCadastrar;
	}

	public JButton getBtnCancelar() {
		return this.btnCancelar;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public int getOpcao() {
		return this.opcao;
	}
	
	public JFrame getFrmAlteracaoEstoque() {
		return this.frmAlteracaoEstoque;
	}
}
