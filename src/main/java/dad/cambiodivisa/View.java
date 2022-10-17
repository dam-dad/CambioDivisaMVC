package dad.cambiodivisa;

import dad.cambiodivisa.logica.Divisa;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class View extends GridPane {

	private TextField origenText, destinoText;
	private ComboBox<Divisa> origenCombo, destinoCombo;
	private Button cambiarButton;

	public View() {
		super();
		
		origenText = new TextField();
		origenText.setPrefColumnCount(5);

		destinoText = new TextField();
		destinoText.setPrefColumnCount(5);
		destinoText.setEditable(false);
		
		origenCombo = new ComboBox<>();
		destinoCombo = new ComboBox<>();
		
		cambiarButton = new Button("Cambiar");
		cambiarButton.setDefaultButton(true);
		
		setAlignment(Pos.CENTER);
		setHgap(5);
		setVgap(5);
		setPadding(new Insets(5));

		addRow(0, origenText, origenCombo);
		addRow(1, destinoText, destinoCombo);
		addRow(2, cambiarButton);
		
		GridPane.setColumnSpan(cambiarButton, 2);
		GridPane.setHalignment(cambiarButton, HPos.CENTER);
		
	}

	public TextField getOrigenText() {
		return origenText;
	}

	public TextField getDestinoText() {
		return destinoText;
	}

	public ComboBox<Divisa> getOrigenCombo() {
		return origenCombo;
	}

	public ComboBox<Divisa> getDestinoCombo() {
		return destinoCombo;
	}

	public Button getCambiarButton() {
		return cambiarButton;
	}

}
