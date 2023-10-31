package giochi;

public class Videogioco {
	private String nome;
	private String genere;
	
	private Tipogioco tipo;

	public Videogioco(String nome, String genere, Tipogioco tipo) {
		this.nome = nome;
		this.genere = genere;
		this.tipo = tipo;
	}
	
	public void gioca() {
		System.out.println("Stai giocando a " + nome);
	}

	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Tipogioco getTipo() {
		return tipo;
	}

	public void setTipo(Tipogioco tipo) {
		this.tipo = tipo;
	}
	
	
	
}
