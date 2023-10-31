package gestione;

import java.util.ArrayList;

import utenti.Utente;
import giochi.Videogioco;
import giochi.Tipogioco;

public class Gestore {
	private ArrayList<Utente> utentiRegistrati = new ArrayList<>();
	private ArrayList<Utente> utentiLoggati = new ArrayList<>();
	private ArrayList<Videogioco> giochi = new ArrayList<>();
	private ArrayList<Tipogioco> tipi = new ArrayList<>();

	private Menu menu = new Menu();

	// TODO Da rivedere la logica di questa classe
	// TODO magari spostare i metodi in un altra classe che avrà i metodi in modo
	// statico
	public void start() {
		int scelta = menu.start(this);

		// login o signin?

		Utente u = new Utente("", "");

		switch (scelta) {
		case 0 -> {
			logIn(u);
		}
		case 1 -> {
			signIn(u);
			System.out.println(utentiRegistrati);
		}
		}

		return;
	}

	public void signIn(Utente u) {
		u.signIn(menu, this);
	}

	public void logIn(Utente u) {
		u.logIn(menu, this);
	}

	public void logOut(Utente u) {
		u.logOut(menu, this);
	}

	public Utente retrieveUserLogged(String nome, String pwd) {
		for (Utente u : utentiLoggati) {
			if (u.getNome().equals(nome) && u.getPwd().equals(pwd)) // utente esiste
				return u;
		}
		return null;
	}

	public Utente retrieveUserSigned(String nome, String pwd) {
		for (Utente u : utentiRegistrati) {
			if (u.getNome().equals(nome) && u.getPwd().equals(pwd)) // utente esiste
				return u;
		}
		return null;
	}

	public void addUserLogged(Utente u) {
		utentiLoggati.add(u);
	}

	public void removeUserLogged(Utente u) {
		utentiLoggati.remove(u);
	}

	public void addUserSigned(Utente u) {
		utentiRegistrati.add(u);
	}

	public void removeUserSigned(Utente u) {
		utentiRegistrati.remove(u);
	}

	// Alcuni metodi utili per fare testing velocemente
	public void initDefault() {
		initDefaultGiochi();
		initDefaultTipi();
		initDefaultUtenti();
	}

	private void initDefaultGiochi() {

	}

	private void initDefaultTipi() {

	}

	private void initDefaultUtenti() {

	}

	// Getters & Setters
	public ArrayList<Utente> getUtentiRegistrati() {
		return utentiRegistrati;
	}

	public void setUtentiRegistrati(ArrayList<Utente> utentiRegistrati) {
		this.utentiRegistrati = utentiRegistrati;
	}

	public ArrayList<Utente> getUtentiLoggati() {
		return utentiLoggati;
	}

	public void setUtentiLoggati(ArrayList<Utente> utentiLoggati) {
		this.utentiLoggati = utentiLoggati;
	}

	public ArrayList<Videogioco> getGiochi() {
		return giochi;
	}

	public void setGiochi(ArrayList<Videogioco> giochi) {
		this.giochi = giochi;
	}

	public ArrayList<Tipogioco> getTipi() {
		return tipi;
	}

	public void setTipi(ArrayList<Tipogioco> tipi) {
		this.tipi = tipi;
	}
}
