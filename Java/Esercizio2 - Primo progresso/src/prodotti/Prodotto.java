package prodotti;

import java.util.ArrayList;

public class Prodotto {
	private String nome;
	private float prezzo;
	private ArrayList<String> ingredienti;
	private String descrizione;
	private int qtaDisponibile;
	
	public Prodotto(String nome, float prezzo, ArrayList<String> ingredienti, String descrizione, int qta) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
		this.descrizione = descrizione;
		this.qtaDisponibile = qta;
	}
	
	public void vendi(int qta) {
		if(this.qtaDisponibile <= 0) { // disponibilità
			System.out.println("Prodotto: " + nome + "non è disponibile");
		}
		this.qtaDisponibile -= qta;
	}
	
	public String toString() {
        return "Prodotto: " +
                "Nome: " + nome + " - " +
                "Prezzo: " + prezzo + " - " +
                "Ingredienti: " + ingredienti + " - " +
                "Descrizione: " + descrizione + " - " +
                "qtaDisponibile: " + qtaDisponibile;
    }
	
	
	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public ArrayList<String> getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(ArrayList<String> ingredienti) {
		this.ingredienti = ingredienti;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQtaDisponibile() {
		return qtaDisponibile;
	}

	public void setQta(int qta) {
		this.qtaDisponibile = qta;
	}
	
	
}
