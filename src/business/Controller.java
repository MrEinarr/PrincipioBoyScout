package business;

import presentation.GUI;
import javax.swing.JOptionPane;
import domain.shopCar;

public class Controller {

	public void startController() {
		boolean flag = true;
		while (flag) {
			int option = GUI.menu00();

			if (option == JOptionPane.YES_OPTION) {
				int n = GUI.menu01(); // Determina el tamaño de la lista
				shopCar shopcar = new shopCar(n);

				for (int i = 0; i < n; i++) { // Iterar sobre el número de productos (n)
					int productOption = GUI.menu();
					if (shopcar.addProduct(productOption)) {
						GUI.showAddList();
					} else {
						GUI.showErrorDialog();
					}
				}
				String shoppingList = shopcar.toString();
				GUI.showShoppingList(shoppingList);

			} else if (option == JOptionPane.NO_OPTION || option == JOptionPane.CLOSED_OPTION) {
				flag = false;
			}
		}
	}
}