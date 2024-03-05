package business;

import presentation.GUI;

public class Logic {

	public Logic() {
	}

	public String getProduct(int numberProduct){
		
		if(numberProduct == 1) {
			return "Leche";
		}else if(numberProduct == 2) {
			return "Galletas";
		}else if(numberProduct == 3) {
			return "Botana";
		}else if(numberProduct == 4){
			return "Arroz";
		}else if(numberProduct == 5) {
			return "Refresco";
		}else if(numberProduct == 6) {
			return "Frijoles";
		}else {
			return null;
		}
		
	};
	
	public int getPrices(String nameProduct) {
		
		if(nameProduct == "Leche") {
			return 1500;
		}else if(nameProduct == "Galletas") {
			return 1750;
		}else if(nameProduct == "Botana") {
			return 1300;
		}else if(nameProduct == "Arroz"){
			return 1355;
		}else if(nameProduct == "Refresco") {
			return 1800;
		}else if(nameProduct == "Frijoles") {
			return 1780;
		}else {
			return 0;
		}
	};
	
	public int totalPrice(int pay,int totalPrice) {
		
		int change = 0;
		
		try {

			change = pay - totalPrice;  
		} catch(Exception e) {
			GUI.showError("No tiene suficientes fondos para esta compra");
		}
		
		return change;
	};
	
}
