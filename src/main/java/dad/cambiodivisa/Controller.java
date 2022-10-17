package dad.cambiodivisa;

import dad.cambiodivisa.logica.Divisa;
import javafx.event.ActionEvent;
import javafx.util.converter.NumberStringConverter;

public class Controller {
	
	private View view = new View();
	private Model model = new Model();
	
	public Controller() {
		
		// bindings
		
		view.getOrigenText().textProperty().bindBidirectional(model.cantidadOrigenProperty(), new NumberStringConverter());
		view.getDestinoText().textProperty().bind(model.cantidadDestinoProperty().asString());
		model.divisaOrigenProperty().bind(view.getOrigenCombo().getSelectionModel().selectedItemProperty());
		model.divisaDestinoProperty().bind(view.getDestinoCombo().getSelectionModel().selectedItemProperty());

		// load data
		
		Divisa [] divisas = {
				new Divisa("euro", 1.0),
				new Divisa("dólar", 0.98),
				new Divisa("yen", 145.02),
				new Divisa("libra esterlina", 1.16)
		};
		
		view.getOrigenCombo().getItems().addAll(divisas);
		view.getDestinoCombo().getItems().addAll(divisas);
		
		view.getOrigenCombo().getSelectionModel().selectFirst();
		view.getDestinoCombo().getSelectionModel().selectFirst();
		
		// listeners
		
		view.getCambiarButton().setOnAction(this::onCambiarAction);
		
	}
	
	public View getView() {
		return view;
	}
	
	public Model getModel() {
		return model;
	}

	private void onCambiarAction(ActionEvent e) {
		Divisa from = model.getDivisaOrigen();
		Divisa to = model.getDivisaDestino();
		double cantidad = model.getCantidadOrigen();
		model.setCantidadDestino(Divisa.fromTo(from, to, cantidad));
		System.out.println("cambiando " + from + " " + to + " por " + cantidad);
	}

}
