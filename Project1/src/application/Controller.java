package application;
 
import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
 
 
public class Controller implements Initializable{
    @FXML private Button loginButton;
    @FXML private TextField textFieldID;
    @FXML private TextField textFieldPw;
    @FXML private Label idLabel;
    @FXML private Label pwLabel;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("ȣ��� �ڵ� ����");
        loginButton.setOnAction(e -> login());
    }
    
    public void login() {
        MyDB db = new MyDB();
        if (db.table.containsKey(textFieldID.getText()) && db.table.get(textFieldID.getText()).equals(textFieldPw.getText())) {
            System.out.println("����");
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("�α��� ����!!");
            alert.show();
        } else if (textFieldID.getText().isEmpty() || textFieldPw.getText().isEmpty() ) { 
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("���̵� Ȥ�� ��й�ȣ�� �Է����� �ʾҽ��ϴ�!!");
            alert.show();
            textFieldID.clear();
            textFieldPw.clear();
            textFieldID.requestFocus();
        } else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("�α��� ����!! ���̵� Ȥ�� ��й�ȣ�� ���� �ʽ��ϴ�!!");
            alert.show();
            textFieldID.clear();
            textFieldPw.clear();
            textFieldID.requestFocus();
        }
    }
}