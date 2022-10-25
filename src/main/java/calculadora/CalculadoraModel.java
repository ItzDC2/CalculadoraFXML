package calculadora;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CalculadoraModel {

	private StringProperty total = new SimpleStringProperty();

	public StringProperty totalProperty() {
		return this.total;
	}
	
	public String getTotal() {
		return this.totalProperty().get();
	}
	
	public void setTotal(final String total) {
		this.totalProperty().set(total);
	}
	
}
