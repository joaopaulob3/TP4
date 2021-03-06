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

import controller.ConjuntoCondicionador;
import controller.ConjuntoHidratante;
import controller.ConjuntoPerfumaria;
import controller.ConjuntoProtetorSolar;
import controller.ConjuntoSaboneteLiquido;
import controller.ConjuntoShampoo;

public class TelaDelecao implements ActionListener {
	//Atributos
	private JFrame frmDelecao = new JFrame("Dele\u00E7\u00E3o de dados");
	private JLabel lblTitulo = new JLabel("Deseja deletar qual produto?");
	private JButton btnPerfume = new JButton("Perfume");
	private JButton btnHidratante = new JButton("Hidratante");
	private JButton btnProtetorSolar = new JButton("Protetor Solar");
	private JButton btnShampoo = new JButton("Shampoo");
	private JButton btnCondicionador = new JButton("Condicionador");
	private JButton btnSaboneteLiquido = new JButton("Sabonete L\u00EDquido");
	private JButton btnVoltar = new JButton("Voltar");
	private JFrame frmMenuProduto;
	
	//Construtuor
	public TelaDelecao (JFrame frmMenuProduto) {
		//Configura os componentes da JFrame da tela de edi??o de produto
		this.frmMenuProduto = frmMenuProduto;
		this.frmDelecao.setBounds(100, 100, 534, 451);
		this.frmDelecao.getContentPane().setLayout(null);
		this.frmDelecao.setResizable(false);
		this.frmDelecao.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmDelecao.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label t?tulo da pergunta
		this.lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.lblTitulo.setBounds(150, 46, 350, 36);
		this.frmDelecao.getContentPane().add(lblTitulo);
		
		//Configura o bot?o de perfume
		this.btnPerfume.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnPerfume.setBounds(156, 112, 217, 27);
		this.frmDelecao.getContentPane().add(btnPerfume);
		
		//Configura o bot?o de hidratante
		this.btnHidratante.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnHidratante.setBounds(156, 150, 217, 27);
		this.frmDelecao.getContentPane().add(btnHidratante);
		
		//Configura o bot?o de protetor solar
		this.btnProtetorSolar.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnProtetorSolar.setBounds(156, 188, 217, 27);
		this.frmDelecao.getContentPane().add(btnProtetorSolar);
		
		//Configura o bot?o de shampoo
		this.btnShampoo.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnShampoo.setBounds(156, 227, 217, 27);
		this.frmDelecao.getContentPane().add(btnShampoo);
		
		//Configura o bot?o de condicionador
		this.btnCondicionador.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnCondicionador.setBounds(156, 266, 217, 27);
		this.frmDelecao.getContentPane().add(btnCondicionador);
		
		//Condigura o bot?o de sabonte l?quido
		this.btnSaboneteLiquido.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnSaboneteLiquido.setBounds(156, 304, 217, 27);
		this.frmDelecao.getContentPane().add(btnSaboneteLiquido);
		
		//Condigura o bot?o de voltar
		this.btnVoltar.setBounds(415, 377, 89, 23);
		this.frmDelecao.getContentPane().add(btnVoltar);
		this.frmDelecao.setLocationRelativeTo(null);
		
		//Direciona e configura os eventos dos bot?es
		this.getBtnPerfume().addActionListener(this);
		this.getBtnHidratante().addActionListener(this);
		this.getBtnProtetorSolar().addActionListener(this);
		this.getBtnShampoo().addActionListener(this);
		this.getBtnCondicionador().addActionListener(this);
		this.getBtnSaboneteLiquido().addActionListener(this);
		this.getBtnVoltar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e vis?vel
		this.frmDelecao.setLocationRelativeTo(null);
		this.frmDelecao.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Declara??es
		int opcao;
				
		//Armazena o bot?o escolhido
		JButton botao = (JButton) e.getSource();
		
		//Oculta a tela de edi??o
		this.getFrmDelecao().dispose();
		
		//Inicia os eventos sobre o cadastro de perfume
		if (botao == this.getBtnPerfume()) {
			//Se h? perfume no sistema, podemos prosseguir
			if (ConjuntoPerfumaria.temPerfume()) {
				//Lista os perfumes no sistema e aciona a tela de pesquisa por c?digo
				opcao = 1;
				TelaListaPerfume telaListaPerfume = new TelaListaPerfume(ConjuntoPerfumaria.getListaPerfumes());
				new TelaPesquisaPorCodigo3(this.getFrmDelecao(), opcao, telaListaPerfume.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n?o foi cadastrado nenhum perfume!", "", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//Inicia os eventos sobre o cadastro de hidratante
		if (botao == this.getBtnHidratante()) {
			//Se h? hidratante no sistema, podemos prosseguir
			if (ConjuntoHidratante.temHidratante()) {
				//Lista os hidratantes no sistema e aciona a tela de pesquisa por c?digo
				opcao = 2;
				TelaListaHidratante telaListaHidratante = new TelaListaHidratante(ConjuntoHidratante.getListaHidratantes());
				new TelaPesquisaPorCodigo3(this.getFrmDelecao(), opcao, telaListaHidratante.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n?o foi cadastrado nenhum hidratante!", "", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//Inicia os eventos sobre o cadastro de protetor solar
		if (botao == this.getBtnProtetorSolar()) {
			//Se h? protetor solar no sistema, podemos prosseguir
			if (ConjuntoProtetorSolar.temProtetorSolar()) {
				//Lista os protetores solar no sistema e aciona a tela de pesquisa por c?digo
				opcao = 3;
				TelaListaProtetorSolar telaListaProtetor = new TelaListaProtetorSolar(ConjuntoProtetorSolar.getListaProtetorSolar());
				new TelaPesquisaPorCodigo3(this.getFrmDelecao(), opcao, telaListaProtetor.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n?o foi cadastrado nenhum protetor solar!", "", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//Inicia os eventos sobre o cadastro de shampoo
		if (botao == this.getBtnShampoo()) {
			//Se h? shampoo no sistema, podemos prosseguir
			if (ConjuntoShampoo.temShampoo()) {
				//Lista os shampoos no sistema e aciona a tela de pesquisa por c?digo
				opcao = 4;
				TelaListaShampoo telaListaShampoo = new TelaListaShampoo(ConjuntoShampoo.getListaShampoos());
				new TelaPesquisaPorCodigo3(this.getFrmDelecao(), opcao, telaListaShampoo.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n?o foi cadastrado nenhum shampoo!", "", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//Inicia os eventos sobre o cadastro de condicionador
		if (botao == this.getBtnCondicionador()) {
			//Se h? condicionador no sistema, podemos prosseguir
			if (ConjuntoCondicionador.temCondicionador()) {
				//Lista os condicionadores no sistema e aciona a tela de pesquisa por c?digo
				opcao = 5;
				TelaListaCondicionador telaListaCondicionador = new TelaListaCondicionador(ConjuntoCondicionador.getListaCondicionadores());
				new TelaPesquisaPorCodigo3(this.getFrmDelecao(), opcao, telaListaCondicionador.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n?o foi cadastrado nenhum condicionador!", "", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//Inicia os eventos sobre o cadastro de sabonete l?quido
		if (botao == this.getBtnSaboneteLiquido()) {
			//Se h? sabonete l?quido no sistema, podemos prosseguir
			if (ConjuntoSaboneteLiquido.temSaboneteLiquido()) {
				//Lista os sabonetes l?quido no sistema e aciona a tela de pesquisa por c?digo
				opcao = 6;
				TelaListaSaboneteLiquido telaListaSabonete = new TelaListaSaboneteLiquido(ConjuntoSaboneteLiquido.getListaSabonetesLiquido());
				new TelaPesquisaPorCodigo3(this.getFrmDelecao(), opcao, telaListaSabonete.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n?o foi cadastrado nenhum sabonete l?quido!", "", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		//Inicia os eventos sobre o bot?o voltar
		if (botao == this.getBtnVoltar()) {
			this.getFrmMenuProduto().setVisible(true);
		}
	}

	//M?todos acessores
	public JFrame getFrmDelecao() {
		return this.frmDelecao;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
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

	public JFrame getFrmMenuProduto() {
		return frmMenuProduto;
	}

}
