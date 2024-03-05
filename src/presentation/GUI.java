package presentation;

import javax.swing.JOptionPane;

public class GUI {

	public GUI() {
	}
	
	public int showInput(String message) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(message));
		return num;
	};
	
	
	public String getProduct(String message) {
		return message;
	};

	public void showInformation(String message) {
		JOptionPane.showMessageDialog(null, message, "", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void showError(String message) {
		JOptionPane.showMessageDialog(null, message, "Critico", JOptionPane.ERROR_MESSAGE);
	}
}
