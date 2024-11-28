package Tarefa;

public class Honda extends Car {

	public Honda(String model, Integer year, Double preco) {
		super(model, year, preco);
	}

	@Override
	public String getDetails() {
		return String.format("Honda %s - Year: %d - Price: $%.3f", getModel(), getYear(), getPrice());
	}
}