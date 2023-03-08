package entities;

public class Car {
	private String model;
	private double value;

	public Car(String model, double value) {
		this.model = model;
		this.value = value;
	}

	public String getModel() {
		return model;
	}

	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}

	public void negotiation(double value) {	
		double minValue = this.value - 35000;
			if (value < this.value && value >= minValue || value >= this.value) {
				System.out.println("Compra feita!");
			}
			else {
			System.out.println("Compra negada,valor baixo demais");
			}
		}

	public void financing(int years) {
		if (years >= 1 && years <= 50) {
			System.out.printf("Você ira pagar: R$ %.2f por mês", value / (12 * years));
		}
	}

	public String toString() {
		return "Modelo: " + model + ", Valor: R$" + String.format("%.2f", value);
	}
}
