# RaccomandazioneLibreria
Questo terzo esercizio consisteva nel creare un sistema di raccomandazione per una libreria online<br />
Questo esercizio richiede anche la creazione e gestione di un database legato alla libreria.

# Difficoltà
L'esercizio che riporto non è completo e manca la parte 2 dell'esercizio ovvero l'implementazione del sistema di raccomandazione.<br />
Ci sono state diverse difficoltà in questo esercizio. Scegliere se fare prima database o dedicarsi direttamente al sistema di raccomandazione è stato il primissimo ostacolo.<br />
In seguito la più grande difficoltà è stata trovata nel cercare di adattarsi a complesse situazioni di lavoro in gruppo.

# Cosa ho imparato:
Ho imparato a lasciare in sospeso un task a cui stavo lavorando per portare avanti il task di colleghi, nel momento in cui i colleghi non possano svolgere il proprio per problemi (qualsiasi tipo di problema: salute, ambiente di sviluppo che non funziona, ecc...).<br />
Ho imparato a sapermi adattare alle esigenze del team.

# Esercizio 3

Creazione di un sistema di raccomandazione per una libreria online
Parte 1: Strutturazione del database e della logica di base
Descrizione: Il tuo compito è progettare e implementare un sistema base per una libreria online. Questo sistema dovrebbe essere in grado di gestire utenti, libri e le recensioni fatte dagli utenti sui libri.

Dettagli:
Crea una classe Utente con attributi come id, nome, email e una lista di libri acquistati.
Crea una classe Libro con attributi come id, titolo, autore, genere e prezzo.
Crea una classe Recensione che associ un Utente a un Libro e includa una valutazione (da 1 a 5 stelle) e un commento testuale.
Crea una classe LibreriaOnline che mantenga una lista di Utenti, Libri e Recensioni.
Implementa metodi nella classe LibreriaOnline per permettere agli utenti di acquistare libri, lasciare recensioni e visualizzare tutti i libri disponibili.
Parte 2: Implementazione del sistema di raccomandazione
Descrizione: Estendendo il lavoro svolto nella Parte 1, ora devi creare un sistema di raccomandazione per suggerire libri agli utenti basato sulle loro preferenze e sulle recensioni lasciate.

Dettagli:
Aggiungi un metodo raccomandaLibri nella classe Utente. Questo metodo, quando invocato, dovrebbe ritornare una lista di libri suggeriti.
La raccomandazione dovrebbe basarsi sui seguenti criteri:
Libri dello stesso genere di quelli che l'utente ha già acquistato e che hanno una valutazione media alta (ad esempio, 4 o 5 stelle).
Libri scritti dagli autori dei libri già acquistati dall'utente.
Se l'utente non ha acquistato nessun libro o se non ci sono libri che soddisfano i criteri sopra, suggerisci i libri più popolari della libreria.
Implementa un metodo valutazioneMedia nella classe Libro per calcolare la valutazione media basata sulle recensioni.
Nella classe LibreriaOnline, implementa un metodo libriPopolari che ritorna i libri con il maggior numero di recensioni positive.
L'obiettivo finale di questo esercizio è sviluppare un sistema di raccomandazione che suggerisca libri pertinenti e di interesse per l'utente, migliorando così l'esperienza dell'utente e aumentando potenzialmente le vendite per la libreria.

# Lista Tasks

1. Creazione e definizione classe Utente con relative variabili e metodi ( acquistaLibro() e lasciaRecensione() )
2. Creazione e definizione classe Libro con relative variabili e metodi ( mostraDettagli() )
3. Creazione e definizione classe Recensione con relative variabili
4. Creazione e definizione classe LibreriaOnline con relative variabili e metodi ( aggiungiUtente(), aggiungiLibro(), aggiungiLibro(), aggiungiRecensione(), mostraLibri() )
5. 5.Creazione DB
6. Crezione collegamento DB
7. Testing primi metodi DAO (TEST EFFETTUATI CON SUCCESSO)
