package calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class CalculadoraController implements Initializable {

	@FXML
	private GridPane view;
	
	@FXML
	private TextField totalText;
	
	private Calculadora c = new Calculadora();
	private CalculadoraModel model = new CalculadoraModel();
	
	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		model.totalProperty().bindBidirectional(totalText.textProperty());
	}
	
	@FXML
	public void onClickNumberAction(ActionEvent e) {
		Button b = (Button) e.getSource();
		c.insertar(b.getText().charAt(0));
		model.setTotal(c.getPantalla());
	}

	@FXML
    public void onClickCAction(ActionEvent event) {
		c.borrarTodo();
		model.setTotal(c.getPantalla());
    }

    @FXML
    public void onClickCEAction(ActionEvent event) {
		c.borrar();
		model.setTotal(c.getPantalla());
    }

    @FXML
    public void onClickPointAction(ActionEvent event) {
    	c.insertarComa();
//		model.setTotal(c.getPantalla());

    }

    @FXML
    public void onOperadorAction(ActionEvent e) {
    	Button b = (Button) e.getSource();
    	c.operar(b.getText().charAt(0));
		model.setTotal(c.getPantalla());

    }
    
	
	public GridPane getView() {
		return view;
	}
	
}
