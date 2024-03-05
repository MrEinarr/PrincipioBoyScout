package business;

import presentation.GUI;
import javax.swing.JOptionPane;
import domain.shopCar;

public class Controller {

	public void startController() {
		boolean flag = true;
		while (flag) {
			int option = GUI.menu00();//inicia el rpogarama o lo termina

			if (option == JOptionPane.YES_OPTION) {
				int n = GUI.menu01(); // Determina el tamaño de la lista
				shopCar shopcar = new shopCar(n);// Crea el objeto carrito de compra

				for (int i = 0; i < n; i++) { // Iterar sobre el número de productos (n)
					int productOption = GUI.menu(); // Solicitar al usuario que elija un producto
					if (shopcar.addProduct(productOption)) { // Añadir el producto al carrito de compras
						GUI.showAddList();// Producto agregado
					} else {
						GUI.showErrorDialog();// Error al agregar
					}
				}
				String shoppingList = shopcar.toString(); // Obtener la lista de compra como una cadena
				GUI.showShoppingList(shoppingList); // Pasar la cadena al GUI para mostrarla

			} else if (option == JOptionPane.NO_OPTION || option == JOptionPane.CLOSED_OPTION) { //Cerrar programa
				flag = false;
			}
		}
	}
}