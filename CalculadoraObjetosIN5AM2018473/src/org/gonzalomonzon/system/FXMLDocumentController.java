package org.gonzalomonzon.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    double numero1 = 0, numero2 = 0, resultado = 0;
    String operacion;
    
    @FXML private TextField txtPantalla;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnSuma;    
    @FXML private Button btnResta;
    @FXML private Button btnDivision;
    @FXML private Button btnMultiplicacion;
    @FXML private Button btnIgual;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private Button btnMasMenos;
    @FXML private Button btnRaiz;
    @FXML private Button btnPotencia;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnValorAbsoluto;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        
        if(event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText() + "1");
        else if(event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText() + "2");
        else if(event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText() + "3");
        else if(event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText() + "4");
        else if(event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText() + "5");
        else if(event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText() + "6");
        else if(event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText() + "7");
        else if(event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText() + "8");
        else if(event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText() + "9");
        else if(event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText() + "0");
        else if(event.getSource() == btnSuma){
            numero1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            operacion = "suma";
        }
        else if(event.getSource() == btnResta){
            numero1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            operacion = "resta";
            }
        else if(event.getSource() == btnMultiplicacion){
            numero1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            operacion = "multiplicacion";
        }
        else if(event.getSource() == btnDivision){
            numero1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            operacion = "division"; 
        }
        else if(event.getSource() == btnRaiz){
            numero1 = Double.parseDouble(txtPantalla.getText());
            resultado = Math.sqrt(numero1);
            txtPantalla.setText(String.valueOf(resultado));
        }           
        else if(event.getSource() == btnPotencia){
            numero1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            operacion = "potencia";
        }
        else if(event.getSource() == btnPunto &&  !txtPantalla.getText().contains(".")){
            if(txtPantalla.getText().length() == 0)
                txtPantalla.setText("0.");
            else
                txtPantalla.setText(txtPantalla.getText() + ".");
        }
        else if(event.getSource() == btnCE)
            txtPantalla.clear();
        else if(event.getSource() == btnC){
            numero1 = 0;
            numero2 = 0;
            resultado = 0;
            operacion = "";
            txtPantalla.clear();
        } 
        else if(event.getSource() == btnMasMenos){
            if(txtPantalla.getText().contains("-")){
                txtPantalla.setText(txtPantalla.getText().replaceAll("-", ""));
            }
            else if(!txtPantalla.getText().contains("-"))
                txtPantalla.setText("-" + txtPantalla.getText());
        }
        else if(event.getSource() == btnValorAbsoluto && txtPantalla.getText().contains("-"))
            txtPantalla.setText(txtPantalla.getText().replace("-",""));
        else if(event.getSource() == btnPorcentaje){
            numero2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            resultado = numero1 * (numero2 / 100);
            txtPantalla.setText(String.valueOf(resultado));
        }
            else if(event.getSource() == btnIgual){
                switch(operacion){
                    case "suma":
                        numero2 = Double.parseDouble(txtPantalla.getText());
                        txtPantalla.clear();
                        resultado = numero2 + numero1;
                        txtPantalla.setText(String.valueOf(resultado));
                        numero1 = 0;
                        numero2 = 0;
                        operacion = "";
                    break;

                    case "resta":
                        numero2 = Double.parseDouble(txtPantalla.getText());
                        txtPantalla.clear();
                        resultado = numero1 - numero2;
                        txtPantalla.setText(String.valueOf(resultado));
                        numero1 = 0;
                        numero2 = 0;
                        operacion = "";
                    break;
                    
                    case "multiplicacion":
                        numero2 = Double.parseDouble(txtPantalla.getText());
                        txtPantalla.clear();
                        resultado = numero1 * numero2;
                        txtPantalla.setText(String.valueOf(resultado));
                        numero1 = 0;
                        numero2 = 0;
                        operacion = "";
                    break;
                    
                    case "division":
                        numero2 = Double.parseDouble(txtPantalla.getText());
                        txtPantalla.clear();
                        resultado = numero1 / numero2;
                        txtPantalla.setText(String.valueOf(resultado));
                        numero1 = 0;
                        numero2 = 0;
                        operacion = "";
                    break;      
                    
                    case "potencia":
                        numero2 = Double.parseDouble(txtPantalla.getText());
                        txtPantalla.clear();
                        resultado = Math.pow(numero1, numero2);
                        txtPantalla.setText(String.valueOf(resultado));
                        operacion = "";
                    break;     
                    
                    default:
                        txtPantalla.getText();
                }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

