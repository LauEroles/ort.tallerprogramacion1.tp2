package ejercicio1;

public class NumeroTelefonico {
	private int característica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoDeLinea;


	
	
	public NumeroTelefonico() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}

	public NumeroTelefonico(int caracteristica, int numeroDeAbonado, int codigoDePais, TipoDeLinea tipoDeLinea) {
		this.setCaracterística(caracteristica);
		this.setNumeroDeAbonado(numeroDeAbonado);
		this.setCodigoDePais(codigoDePais);
		this.setTipoDeLinea(tipoDeLinea);

	}

	public int getCaracterística() {
		return característica;
	}

	public void setCaracterística(int característica) {
		this.característica = característica;
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
		return "(+) " + this.codigoDePais + this.característica + this.numeroDeAbonado + ".";
	}

	@Override
	public String toString() {
		return "NumeroTelefonico [característica=" + característica + ", numeroDeAbonado=" + numeroDeAbonado
				+ ", codigoDePais=" + codigoDePais + ", tipoDeLinea=" + tipoDeLinea + "]";
	}
	
	
}

