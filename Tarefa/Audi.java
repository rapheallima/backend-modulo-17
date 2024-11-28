package Tarefa;

public class Audi extends Car {

	public Audi(String model, Integer year, Double price) {
		super(model, year, price);
	}

	@Override
	public String getDetails() {
		return String.format("Audi %s - Year: %d - Price: $%.3f", getModel(), getYear(), getPrice());
	}

}
