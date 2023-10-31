# Videogioco
Questo primo esercizio consisteva nel creare una gerarchia di classi per rappresentare differenti tipi di videogiochi.< br/>
Un admin si dovrebbe occupare di gestire le richieste (i tipi di gioco richiesti) degli utenti.

# Difficoltà
L'esercizio che riporto non è completo e anzi manca gran parte dell'interfaccia utente.< br/>
La più grande difficoltà trovata nello svolgere questo progetto è stata la gestione dei tempi e l'organizzazione personale.

# Cosa ho imparato:
Ho imparato che devo gestire meglio i miei tempi e organizzarmi prima di buttarmi direttamente sul codice.

# Esercizio 1

Creare una gerarchia di classi per rappresentare differenti tipi di videogiochi e che permetta di farlo solo previo registrazione con gestione admin annessa.

Specifiche:
Creare una classe base Videogioco che contiene:
Una variabile nome per il nome del videogioco.
Una variabile genere per il genere del videogioco (es. Azione, Avventura, Strategia).
Un metodo gioca() che stampa un messaggio generico come "Stai giocando a [nome]".

Creare due classi derivate: 
VideogiocoAzione e VideogiocoStrategia che ereditano da Videogioco.
La classe VideogiocoAzione dovrebbe avere un metodo aggiuntivo combatti() che stampa "Combattimento in corso...".
La classe VideogiocoStrategia dovrebbe avere un metodo aggiuntivo pianifica() che stampa "Pianificazione strategica in corso...".

Dimostra il polimorfismo 
creando un array di oggetti Videogioco e attraversandolo per chiamare il metodo gioca() su ogni elemento.

Gestire il multi utente
Far si che l’utente si debba registrare per poter accedere
Creare Log e Log out a scelta disponibili sempre
Far si che si possa registrare in memoria più di un utente ma uni-nominativo 

Gestire L’admin:
L’admin è un utente speciale che può ricevere “richieste”
Può aggiungere, rimuovere e modificare i videogiochi
Le richieste non sono altro che utenti che richiedono uno specifico tipo di gioco che lui può vedere e/o eliminare
