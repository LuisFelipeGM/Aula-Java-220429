package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaRadio {
	public static void main(String[] args) {
		int volume, escolha;
		float estacao;
		String aux;
		Radio radio1;
		
		try {
		aux = JOptionPane.showInputDialog("Escolha o volume");
		volume = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Escolha a estação");
		estacao = Float.parseFloat(aux);
		
		radio1 = new Radio(volume, estacao);
		
		JOptionPane.showMessageDialog(null, "Estação: " + 
		radio1.getEstacao() + "\nVolume: " + radio1.getVolume());
		
		aux = JOptionPane.showInputDialog("Escolaha uma opção:\n(1) Aumentar volume" +
		"\n(2) Diminuir volume\n(3) Trocar estação");
		escolha = Integer.parseInt(aux);
		
		switch (escolha) {
		case 1:
			radio1.aumentarVolume();
			JOptionPane.showMessageDialog(null, "Estação: " + 
					radio1.getEstacao() + "\nVolume: " + radio1.getVolume());
			break;
			
		case 2:
			radio1.diminuirVolume();;
			JOptionPane.showMessageDialog(null, "Estação: " + 
					radio1.getEstacao() + "\nVolume: " + radio1.getVolume());
			break;
			
		case 3:
			aux = JOptionPane.showInputDialog("Escolha a estação");
			estacao = Float.parseFloat(aux);
			radio1.setEstacao(estacao);
			JOptionPane.showMessageDialog(null, "Estação: " + 
					radio1.getEstacao() + "\nVolume: " + radio1.getVolume());
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida");
			break;
		}
		
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
