package dad.cambiodivisa;

import dad.cambiodivisa.logica.Divisa;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Model {

	private DoubleProperty cantidadOrigen = new SimpleDoubleProperty();
	private DoubleProperty cantidadDestino = new SimpleDoubleProperty();
	private ObjectProperty<Divisa> divisaOrigen = new SimpleObjectProperty<>();
	private ObjectProperty<Divisa> divisaDestino = new SimpleObjectProperty<>();

	public final DoubleProperty cantidadOrigenProperty() {
		return this.cantidadOrigen;
	}

	public final double getCantidadOrigen() {
		return this.cantidadOrigenProperty().get();
	}

	public final void setCantidadOrigen(final double cantidadOrigen) {
		this.cantidadOrigenProperty().set(cantidadOrigen);
	}

	public final DoubleProperty cantidadDestinoProperty() {
		return this.cantidadDestino;
	}

	public final double getCantidadDestino() {
		return this.cantidadDestinoProperty().get();
	}

	public final void setCantidadDestino(final double cantidadDestino) {
		this.cantidadDestinoProperty().set(cantidadDestino);
	}

	public final ObjectProperty<Divisa> divisaOrigenProperty() {
		return this.divisaOrigen;
	}

	public final Divisa getDivisaOrigen() {
		return this.divisaOrigenProperty().get();
	}

	public final void setDivisaOrigen(final Divisa divisaOrigen) {
		this.divisaOrigenProperty().set(divisaOrigen);
	}

	public final ObjectProperty<Divisa> divisaDestinoProperty() {
		return this.divisaDestino;
	}

	public final Divisa getDivisaDestino() {
		return this.divisaDestinoProperty().get();
	}

	public final void setDivisaDestino(final Divisa divisaDestino) {
		this.divisaDestinoProperty().set(divisaDestino);
	}

}
