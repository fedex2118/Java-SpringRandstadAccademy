package gestione;

import java.util.ArrayList;
import java.util.HashMap;

import persone.Cliente;

public class SistemaPrenotazioni {
	// Cliente pk: ["nomeProdotto:qtaPrenotata", "nomeProdotto:qtaPrenotata"]
	private HashMap<Cliente, ArrayList<String>> clientiPrenotazioni = new HashMap<>();
	// ["nomeProdotto:qtaPrenotataTotale", ... ]
	private ArrayList<String> prodottiQta = new ArrayList<>();
	
	public SistemaPrenotazioni() {
		
	}
	
	public void aggiungiPrenotazioneACliente(String prodQta, Cliente c) {
		// TODO
//		ArrayList<String> values = clientiPrenotazioni.get(c);
//		for (clientiPrenotazioni.)
	}
	
	public HashMap<Cliente, ArrayList<String>> getClientiPrenotazioni() {
		return clientiPrenotazioni;
	}
	public void setClientiPrenotazioni(HashMap<Cliente, ArrayList<String>> clientiPrenotazioni) {
		this.clientiPrenotazioni = clientiPrenotazioni;
	}
	public ArrayList<String> getProdottiQta() {
		return prodottiQta;
	}
	public void setProdottiQta(ArrayList<String> prodottiQta) {
		this.prodottiQta = prodottiQta;
	}
}
