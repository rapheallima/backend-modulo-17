package Tarefa;

public abstract class Car {

	private String model;
	private Integer year;
	private Double price;

	public Car(String model, Integer year, Double price) {

		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public Integer getYear() {
		return year;
	}

	public Double getPrice() {
		return price;
	}

	public abstract String getDetails();

}
