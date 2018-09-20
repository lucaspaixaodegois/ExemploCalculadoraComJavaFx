package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import math.Calculadora;

public class CalculadoraController implements Initializable {
	@FXML
	private TextField tfResultado;
	@FXML
	private Button bLimpar;
	@FXML
	private Button bInverter;
	@FXML
	private Button bExponencial;
	@FXML
	private Button bDividir;
	@FXML
	private Button bSete;
	@FXML
	private Button bOito;
	@FXML
	private Button bNove;
	@FXML
	private Button bMultiplicar;
	@FXML
	private Button bQuatro;
	@FXML
	private Button bCinco;
	@FXML
	private Button bSeis;
	@FXML
	private Button bSubrair;
	@FXML
	private Button bUm;
	@FXML
	private Button bDois;
	@FXML
	private Button bTres;
	@FXML
	private Button bSomar;
	@FXML
	private Button bZero;
	@FXML
	private Button bVirgula;
	@FXML
	private Button bIgual;

	private Double valor = null;
	private Character operacao = ' ';

	private Calculadora calculadora;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		calculadora = new Calculadora();
		tfResultado.setText(converteToString(calculadora.obterResultado()));
	}

	public void inverterSinal() {
		calculadora.inverterSinal();
		tfResultado.setText(converteToString(calculadora.obterResultado()));
	}

	public void exponencial() {
		operacao = 'e';
	}

	public void dividir() {
		operacao = 'd';
	}

	public void multiplicar() {
		operacao = 'm';
	}

	public void subtrair() {
		operacao = 's';
	}

	public void somar() {
		operacao = 'a';
	}

	public void limpar() {
		calculadora.limpar();
		tfResultado.setText(converteToString(calculadora.obterResultado()));
		operacao = ' ';
		valor = null;
	}

	private void inserirNumero(Integer valor) {
		if (!operacao.equals(' ') && this.valor == null) {
			this.valor = calculadora.obterResultado();
			tfResultado.setText("0");
		}

		if (tfResultado.getText().equals("0"))
			tfResultado.setText(valor.toString());
		else
			tfResultado.appendText(valor.toString());

		if (operacao.equals(' '))
			calculadora.inserirValorInicial(new Double(tfResultado.getText()));
		else
			this.valor = new Double(tfResultado.getText());
	}

	public void addUm() {
		inserirNumero(1);
	}

	public void addDois() {
		inserirNumero(2);
	}

	public void addTres() {
		inserirNumero(3);
	}

	public void addQuatro() {
		inserirNumero(4);
	}

	public void addCinco() {
		inserirNumero(5);
	}

	public void addSeis() {
		inserirNumero(6);
	}

	public void addSete() {
		inserirNumero(7);
	}

	public void addOito() {
		inserirNumero(8);
	}

	public void addNove() {
		inserirNumero(9);
	}

	public void addZero() {
		inserirNumero(0);
	}

	public void calcularOperacao() {
		switch (operacao) {
		case 'e': // Exponencial
			calculadora.potencia(valor.intValue());
			break;
		case 'd': // dividir
			calculadora.dividir(valor);
			break;
		case 'm': // multiplicar
			calculadora.multiplicar(valor);
			break;
		case 's': // subrair
			calculadora.subtrair(valor);
			break;
		case 'a': // somar
			calculadora.somar(valor);
			break;
		default:
			break;
		}
		// limpando operadores de controle
		operacao = ' ';
		valor = null;
		// atualizando o inputText com o resultado calculado
		tfResultado.setText(converteToString(calculadora.obterResultado()));
	}
	
	private String converteToString(Double valor) {
		System.out.println(valor);
		if (valor == null || valor.equals(0d))
			return "0";
		return valor.toString();
	}

}
