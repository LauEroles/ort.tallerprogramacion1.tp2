package ejercicio1;

public class Main_ej1_tp2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Persona persona1=new Persona("Leonel", "Messi");
		persona1.agregarNumero(new NumeroTelefonico(549,114111,2222,TipoDeLinea.CELULAR));
		persona1.agregarNumero(new NumeroTelefonico(168,032444,5678,TipoDeLinea.CELULAR));
		persona1.agregarNumero(new NumeroTelefonico(054,4411,5472,TipoDeLinea.FIJO));
		persona1.agregarEmail(new Email("lio@messi.com"));
		
		//System.out.print(persona1.toString());
		System.out.print(persona1.mostrarPersona());

	}

}
