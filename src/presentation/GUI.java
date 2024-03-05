package presentation;

import javax.swing.JOptionPane;

public class GUI {

	public GUI() {
	}

	public static int menu00() {
		int option = JOptionPane.showConfirmDialog(null, "¡Bienvenido al Sistema de Compra!\n¿Vas a comprar?", "Bienvenida al Sistema de Compra", JOptionPane.YES_NO_OPTION);
		return option;
	}

	public static int menu01(){
		int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos que desea comprar."));
		return number;
	}

	public static int menu(){
		int option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del producto que deasea comprar.\n1 .leche\n2 .Galletas\n3 .Botana\n4 .Arroz\n5 .Refresco\n6 .Frijoles"));
		return option;
	}

	public static void showShoppingList(String shoppingList) {
		JOptionPane.showMessageDialog(null, shoppingList, "Lista de Compra", JOptionPane.PLAIN_MESSAGE);
	}

	public static void showAddList() {
		JOptionPane.showMessageDialog(null, "Producto Agregado con exito", "ShopCar", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void showErrorDialog() {
        JOptionPane.showMessageDialog(null, "Ocurrio Un Error", "Error", JOptionPane.ERROR_MESSAGE);
    }

}