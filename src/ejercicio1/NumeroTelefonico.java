package ejercicio1;

public class NumeroTelefonico {
	private int caracter�stica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoDeLinea;


	
	
	public NumeroTelefonico() {
		super();
		// TODO Ap�ndice de constructor generado autom�ticamente
	}

	public NumeroTelefonico(int caracteristica, int numeroDeAbonado, int codigoDePais, TipoDeLinea tipoDeLinea) {
		this.setCaracter�stica(caracteristica);
		this.setNumeroDeAbonado(numeroDeAbonado);
		this.setCodigoDePais(codigoDePais);
		this.setTipoDeLinea(tipoDeLinea);

	}

	public int getCaracter�stica() {
		return caracter�stica;
	}

	public void setCaracter�stica(int caracter�stica) {
		this.caracter�stica = caracter�stica;
	}

	public int getNumeroDeAbonado() {
		return numeroDeAbonado;
	}

	public void setNumeroDeAbonado(int numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}

	public int getCodigoDePais() {
		return codigoDePais;
	}

	public void setCodigoDePais(int codigoDePais) {
		this.codigoDePais = codigoDePais;
	}

	public TipoDeLinea getTipoDeLinea() {
		return tipoDeLinea;
	}

	public void setTipoDeLinea(TipoDeLinea tipoDeLinea) {
		this.tipoDeLinea = tipoDeLinea;
	}

	public String getValor(){	
		return "(+) " + this.codigoDePais + this.caracter�stica + this.numeroDeAbonado + ".";
	}

	@Override
	public String toString() {
		return "NumeroTelefonico [caracter�stica=" + caracter�stica + ", numeroDeAbonado=" + numeroDeAbonado
				+ ", codigoDePais=" + codigoDePais + ", tipoDeLinea=" + tipoDeLinea + "]";
	}
	
	
}

