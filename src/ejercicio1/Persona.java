package ejercicio1;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;

	public Persona() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}

	public Persona(String nombre, String apellido) {
		super();
		this.setNombre(nombre);
		this.setApellido(apellido);
		telefonos = new ArrayList<NumeroTelefonico>();
		emails = new ArrayList<Email>();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public NumeroTelefonico buscarNumero(NumeroTelefonico numero) {
		int i = 0;
		NumeroTelefonico numeroEncontrado = null;
		NumeroTelefonico numeroAux=null;
		
		while (i < telefonos.size() && numeroEncontrado==null) {
			numeroAux=this.telefonos.get(i);
			if (numeroAux.equals(numero)) {
				numeroEncontrado = numeroAux;
			}
			i++;
		}
		return numeroEncontrado;
	}

	public void agregarNumero(NumeroTelefonico numeroAbonado) {
		NumeroTelefonico numeroTelefonico = buscarNumero(numeroAbonado);

		if (numeroTelefonico == null) {
			telefonos.add(numeroAbonado);
		}
	}

	//VER PORQUE ME MARCA ERROR ?? En la linea 71 antes estaba con emailBuscado.equals
	public Email buscarEmail(Email email) {
		int i = 0;
		Email emailEncontrado = null;
		Email emailAux = null;

		// preguntar en clases lo del ==  en elementos de tipo objeto o String??
		while (i < emails.size() && emailEncontrado== null) {
			emailAux = this.emails.get(i);
			if (emailAux.equals(email)) {
				emailEncontrado = emailAux;
			}
			i++;
		}
		return emailEncontrado;
	}

	public void agregarEmail(Email emailUsuario) {
		Email email = buscarEmail(emailUsuario);

		if (email == null) {
			emails.add(emailUsuario);
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", telefonos=" + telefonos + ", emails="
				+ emails + "]";
	}

	public String mostrarPersona() {
		String personaTelefonos = "";
		String personaEmails = "";
		

		for (Email email : emails) {
			personaEmails = personaEmails + email.toString() + "\n";
		}
		
		for (NumeroTelefonico telefono : telefonos) {
			personaTelefonos= personaTelefonos+ telefono.toString()+ "\n";
		}
		return this.toString()+ "\n" + "Telefonos: \n "+ personaTelefonos + "\n"+ personaEmails ;
	}

	
	
}
