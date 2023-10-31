package gestione;

import java.util.ArrayList;
import java.util.Scanner;

import utenti.Utente;

/**
 * Classe che dovrebbe gestire l'interazione con l'utente
 */
public class Menu {
	private Scanner scanner = new Scanner(System.in);

//	public void display() {
//		Scanner scanner = getScanner();
//
//		System.out.println("Benvenuto!");
//		System.out.println("Selezionare un opzione:");
//
//		// login o signin?
//	}

	public int start(Gestore gestore) {
		Scanner scanner = getScanner();

		System.out.println("Benvenuto nell'app di giochi!");

		ArrayList<String> opzioni = new ArrayList<>();

		opzioni.add("Login");
		opzioni.add("SignIn");
		opzioni.add("Exit");

		String msg = "Selezionare un opzione:";

		return nextOption(opzioni, msg, scanner);
	}

	public void displayOpzioni(ArrayList<String> opzioni, String msg, Scanner scanner) {
		System.out.println(msg);

		for (int i = 0; i < opzioni.size(); i++) {
			System.out.println(i + ": " + opzioni.get(i));
		}
	}

	private int nextOption(ArrayList<String> opzioni, String msg, Scanner scanner) {
		displayOpzioni(opzioni, msg, scanner);
		try {
			int scelta = scanner.nextInt();
			if (scelta >= opzioni.size() || scelta < 0) {
				return nextOption(opzioni, msg, scanner);
			}
			return scelta;
		} catch (Exception e) {
			scanner.nextLine();
			return nextOption(opzioni, msg, scanner);
		}
	}

	private String nextOption(String msg, Scanner scanner) {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(msg);
			scanner.nextLine();
			return nextOption(msg, scanner);
		}
	}

	public void executeLogin(Scanner scanner, Gestore gestore) {
		int i = 0;
		while (i < 3) {
			i++;

			System.out.println("Digita nome:");
			String nome = nextOption("Digita nome:", scanner);
			System.out.println("Digita password:");
			String pwd = nextOption("Digita password:", scanner);

			Utente u = gestore.retrieveUserLogged(nome, pwd);
			
			if (i == 3) {
				System.out.println("Numero accessi falliti troppo elevato!");
			}
			
			if(u == null) {
				System.out.println("Errore: nome o password errati!");
				continue;
			}
			
			return;
		}
	}

	public void executeSignIn(Scanner scanner, Gestore gestore) {
		System.out.println("Digita nome:");
		String nome = nextOption("Digita nome:", scanner);
		System.out.println("Digita password:");
		String pwd = nextOption("Digita password:", scanner);
		
		Utente u = gestore.retrieveUserSigned(nome, pwd);
		
		if(u == null) { // se non è presente va aggiunto ovviamente
			u = new Utente(nome, pwd);
			gestore.addUserSigned(u);
		}

		return;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
}
