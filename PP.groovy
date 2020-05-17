class Perfil {
	private String bio
	private String bornDate
	private Persona persona
	private String twitter
	private String facebook
}

class Pedido {
	Persona comprador
	Date dateCreated
	Date lastUpdated

	String toString() {
	 "$comprador - $dateCreated"
	}

}

Persona persona = new Persona ()
persona.setNombre("Stephany")

println persona.dump()

/*Clase Perfil*/
Perfil perfil = new Perfil()
try {
	perfil.setBio("Mi Bio")
}
catch(Exception e) {
	println "No se puede establecer la biografia"
}

/*Clase Pedido*/
Pedido pedido = new Pedido()
pedido.setDateCreated(new Date())
pedido.setComprador(persona)
println pedido

