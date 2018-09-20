package math;

public class Calculadora {
	// Atributos
	private Double resultado = 0d;

	// Metodos
	public void inserirValorInicial(Double valor) {
		resultado = valor;
	}

	public Double obterResultado() {
		return resultado;
	}

	public void somar(Double valor) {
		resultado = resultado + valor;
	}

	public void subtrair(Double valor) {
		resultado = resultado - valor;
	}

	public void multiplicar(Double valor) {
		resultado = resultado * valor;
	}

	public void dividir(Double valor) {
		resultado = resultado / valor;
	}

	public void inverterSinal() {
		resultado = resultado * -1;
	}

	public void potencia(int potencia) {
		// se potencia for negativa .. nao faz nada.
		if (potencia < 0)
			return;
		
		if (potencia == 0)
			resultado = 1d;
		else {
			double valor = resultado;
			for (int i = 1; i < potencia; i++)
				resultado = resultado * valor;
		}
	}

	public void limpar() {
		resultado = 0d;
	}
}
