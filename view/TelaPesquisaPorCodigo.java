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

import controller.*;
import model.*;

public class TelaPesquisaPorCodigo implements ActionListener {
	//Atributos
	private JFrame frmPesquisa = new JFrame("Pesquise pelo c\u00F3digo");
	private JLabel lblNewLabel = new JLabel("Informe o c\u00F3digo do produto:");
	private JTextField txtPesquisa = new JTextField();
	private JButton btnPesquisar = new JButton("Pesquisar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame frmAlteracaoEstoque;
	private int opcao;
	private Perfumaria perfume;
	private Hidratante hidratante;
	private ProtetorSolar protetor;
	private Shampoo shampoo;
	private Condicionador condicionador;
	private SaboneteLiquido sabonete;
	
	//Construtor
	public TelaPesquisaPorCodigo(JFrame frmAlteracaoEstoque, int opcao) {
		//Configura os componentes da JFrame da tela de pesquisa pelo c�digo
		this.frmAlteracaoEstoque = frmAlteracaoEstoque;
		this.opcao = opcao;
		this.frmPesquisa.setBounds(100, 100, 440, 257);
		this.frmPesquisa.getContentPane().setLayout(null);
		this.frmPesquisa.setResizable(false);
		this.frmPesquisa.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmPesquisa.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label t�tulo
		this.lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.lblNewLabel.setBounds(67, 58, 224, 24);
		this.frmPesquisa.getContentPane().add(lblNewLabel);
		
		//Configura o campo de texto da pesquisa
		this.txtPesquisa.setBounds(67, 93, 285, 30);
		this.frmPesquisa.getContentPane().add(txtPesquisa);
		this.txtPesquisa.setColumns(10);
		
		//Configura o bot�o Pesquisar
		this.btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnPesquisar.setBounds(67, 136, 136, 33);
		this.frmPesquisa.getContentPane().add(btnPesquisar);
		
		//Configura o bot�o Cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnCancelar.setBounds(216, 136, 136, 33);
		this.frmPesquisa.getContentPane().add(btnCancelar);
		
		//Direciona e configura os eventos dos bot�es
		this.getBtnPesquisar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e vis�vel
		this.frmPesquisa.setLocationRelativeTo(null);
		this.frmPesquisa.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o bot�o escolhido
		JButton botao = (JButton) e.getSource();
		
		//Oculta janela de pesquisa
		this.getFrmPesquisa().dispose();
		
		//Armazena o c�digo digitado
		String codigo = this.getTxtPesquisa().getText();
		
		//Inicia os eventos sobre o bot�o pesquisar
		if (botao == this.getBtnPesquisar()) {
			switch (this.getOpcao()) {
			case 1:
				//Resgata o objeto do tipo Perfumaria do ArrayList listaPerfumes
				perfume = ConjuntoPerfumaria.pesquisarPerfume(codigo);
				
				//Se o c�digo for reconhecido no sistema, podemos prosseguir
				if (perfume != null) {
					//Altera a quantidade no estoque
					new TelaInserirNovaQuantidade(perfume, this.getOpcao(), this.getFrmAlteracaoEstoque());
				} else {
					JOptionPane.showMessageDialog(null, "O c�digo informado n�o foi encontrado no sistema.", "", JOptionPane.WARNING_MESSAGE);
				}
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
		
		//Inicia os eventos sobre o bot�o cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmAlteracaoEstoque().setVisible(true);
		}
	}
	
	//M�todos acessores
	public JFrame getFrmPesquisa() {
		return this.frmPesquisa;
	}

	public JLabel getLblNewLabel() {
		return this.lblNewLabel;
	}

	public JTextField getTxtPesquisa() {
		return this.txtPesquisa;
	}

	public JButton getBtnPesquisar() {
		return this.btnPesquisar;
	}

	public JButton getBtnCancelar() {
		return this.btnCancelar;
	}

	public JFrame getFrmAlteracaoEstoque() {
		return this.frmAlteracaoEstoque;
	}
	
	public int getOpcao() {
		return this.opcao;
	}

}