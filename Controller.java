package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    Model_cadastro model_cadastro = new Model_cadastro();
    public Button botao1;
    public TextField texto21;
    public TextField texto211;
    public TextField texto2111;
    @FXML
    private Button a;
    @FXML
    public Label label;
    public Label nome;
    public Label id;
    public TextField texto1;
    public TextField texto2;

    public Button botaoVoltar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void AcaoBotao(ActionEvent actionEvent) {
        label.setText("Cadastrado");
        System.out.println("OK");
    }
}
