package Coffee;



public class Main {

	public static void main(String[] args) {
		Coffee Nescafe = new Coffee();
		Metods metod = new Metods();
		Nescafe.output();
		metod.app_menu(Nescafe);
		Nescafe.output();
	}

}
