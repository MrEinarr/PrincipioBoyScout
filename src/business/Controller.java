package business;

import presentation.GUI;

public class Controller {

	private GUI g;
	private Logic lo;

	public Controller() {
		g = new GUI();
		lo = new Logic();
	}

	public void getControl() {

		int total = 0;

		int n = g.showInput("Cuantos Productos desea Comprar?");
		String[] foods = new String[n];
		int[] foodsPrices = new int[n];
		int option;

		for (int i = 0; i < n; i++) {
			option = g.showInput(
					"Digite un numero para seleccionar la opcion\n1.Leche\n2.Galletas\n3.Botana\n4.Arroz\n5.Refresco\n6.Frijoles\n7.Mostrar Compra");
			foods[i] = lo.getProduct(option);
			foodsPrices[i] = lo.getPrices(foods[i]);
		} // end For

		for (int i = 0; i < n; i++) {
			total = total + foodsPrices[i];
		}
		;

		int pay = g.showInput("Por un precio total de: " + total + "\nDigite la cantidad de dinero con la que pagara.");
		int change = lo.totalPrice(pay, total);

		g.showInformation("Su cambio es de: " + change + "\n que tenga un Buen dia");

	}
}
