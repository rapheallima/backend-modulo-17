package Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListCar<T extends Car> {

	private List<T> list = new ArrayList<>();

	public void addCar(T car) {
		list.add(car);
	}

	public void removeCar(T carro) {
		list.remove(carro);
	}

	public void showCars() {
		for (T car : list) {
			System.out.println(car.getDetails());
		}
	}

}
