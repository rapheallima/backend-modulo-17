package Tarefa;

public class Main {

	public static void main(String args[]) {

		ListCar<Car> listCar = new ListCar<>();

		Honda hondaCivic = new Honda("Civic", 2022, 120.000);

		Audi audiA4 = new Audi("A4", 2023, 220.000);

		listCar.addCar(hondaCivic);
		listCar.addCar(audiA4);

		System.out.println("List of Cars");
		listCar.showCars();

	}

}
