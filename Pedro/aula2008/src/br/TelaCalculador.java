package br;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCalculador {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame janela = new JFrame("Multiplicação Longa");
		
		JTextField primeira = new JTextField(18);
		JTextField segundo = new JTextField(18);
		
		JButton botao = new JButton(" = ");
		JLabel resultado = new JLabel("  Aguardando...  ");
		
		botao.addActionListener(new AcaoBotao(primeira, segundo, resultado));
		
		JPanel painel = new JPanel();
		painel.add(primeira);
		painel.add(new JLabel("X"));
		painel.add(segundo);
		painel.add(botao);
		painel.add(resultado);
		
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);

	}
}