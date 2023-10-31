package utenti;

import java.util.ArrayList;

import gestione.Gestore;
import gestione.Menu;
import giochi.Tipogioco;

public class Admin {
	private String nome;
	private String pwd;
	
	private ArrayList<Tipogioco> richieste = new ArrayList<>();
	
	public Admin() {

	}
	
	public Admin(String nome, String pwd) {
		this.nome = nome;
		this.pwd = pwd;
	}
	
	public void signIn(Menu menu, Gestore gestore) {
		menu.executeSignIn(menu.getScanner(), gestore);
	}
	
	public void logIn(Menu menu, Gestore gestore) {
		menu.executeLogin(menu.getScanner(), gestore);
	}
	
	public void logOut(Menu menu, Gestore gestore) {
		
	}
	
	public void aggiungi(Admin admin) {

	}
	
	public void modifica(Admin admin) {
		
	}
	
	public void rimuovi(Admin admin) {
		
	}
	
	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
