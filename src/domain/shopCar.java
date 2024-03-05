package domain;

public class shopCar {
    private String[] foods;
    private int[] foodsPrices;
    private int currentIndex;

    public shopCar(int n){
        foods = new String[n];
        foodsPrices = new int[n];
        currentIndex = 0;
    }

    public String getProductName(int option) {
        switch(option) {
            case 1:
                return "Leche";
            case 2:
                return "Galletas";
            case 3:
                return "Botana";
            case 4:
                return "Arroz";
            case 5:
                return "Refresco";
            case 6:
                return "Frijoles";
            default:
                return "Producto desconocido";
        }
    }

    public boolean addProduct(int option){
        if(currentIndex >= foods.length) {
            System.out.println("No hay suficiente espacio en el carrito.");
            return false;
        }

        switch(option) {
            case 1:
                foods[currentIndex] = "Leche";
                foodsPrices[currentIndex] = 5;
                break;
            case 2:
                foods[currentIndex] = "Galletas";
                foodsPrices[currentIndex] = 3;
                break;
            case 3:
                foods[currentIndex] = "Botana";
                foodsPrices[currentIndex] = 4;
                break;
            case 4:
                foods[currentIndex] = "Arroz";
                foodsPrices[currentIndex] = 6;
                break;
            case 5:
                foods[currentIndex] = "Refresco";
                foodsPrices[currentIndex] = 8;
                break;
            case 6:
                foods[currentIndex] = "Frijoles";
                foodsPrices[currentIndex] = 7;
                break;
            default:
                System.out.println("Opción no válida.");
                return false;
        }

        currentIndex++;
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Lista de Compra:\n"); //StringBuilder permite agregar y trasladar arreglos de texto
        int total = 0;
        for (int i = 0; i < currentIndex; i++) {
            sb.append(foods[i]).append(": $").append(foodsPrices[i]).append("\n");// append es parte de stringbuilder y agrega lo siguiente .append("")
            total += foodsPrices[i];
        }
        return sb.append("Total: $").append(total).toString();
    }

}