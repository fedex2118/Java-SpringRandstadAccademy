# GestioneAuto
Questo quarto esercizio consisteva nel creare un applicazione per gestire automobili presenti in un database<br />
Questo esercizio richiede anche la creazione e gestione di un database legato alle automobili.
Viene richiesta l'implementazione di un Menu UI Admin e un Sottomenu UI Admin per la parte CRUD, e si dovrebbero infine salvare le informazioni degli oggetti in un file di testo.

# Difficoltà
L'esercizio che riporto è quasi completo, manca solamente la parte di gestione dei file.
La difficoltà principale riscontrata in questo esercizio è stata trovata nello scegliere da dove cominciare a lavorare se cominciare dal File direttamente o dal Database.

# Cosa ho imparato:
Ho imparato che se ci si fossilizza su un determinato problema (es. come gestire i file), molte volte per arrivare al risultato conviene ritornarci in un secondo momento. Bisogna dunque stabilire delle priorità o adattarsi a esse.

# Esercizio 4

Applicazione di Gestione Auto.< br\>
Parte 1: Definizione delle Strutture
Obiettivo: Creare una struttura dati e le classi di base.

Dettagli Implementazione:
1. Classe Auto:
2. Attributi: id, marca, modello, anno, targa, prezzo, tipoCarburante
3. Metodi: getter, setter, toString(), costruttori

Classe GestioneAuto:
1. Attributi: listaAuto, nome del file
2. Metodi: aggiungiAuto(), modificaAuto(), eliminaAuto(), visualizzaAuto(), cercaAutoPerTarga(), leggiDaFile(), scriviSuFile()

File di Testo: auto.txt - per memorizzare le informazioni delle auto. Ogni riga rappresenta un'auto e i dettagli sono separati da virgole.

Parte 2: Interazione con l'Utente
Obiettivo: Creare un'interfaccia di interazione testuale con l'utente.
Dettagli Implementazione:
1. Menu Console Principale:
2. Aggiungi auto
3. Modifica auto
4. Elimina auto
5. Visualizza tutte le auto
6. Cerca auto per targa
7. Esci

Sottomenu per Modifica Auto: Dopo aver selezionato un'auto per la targa, presenta un altro menu:
1. Modifica marca
2. Modifica modello
3. Modifica anno
4. Modifica targa
5. Modifica prezzo
6. Modifica tipo di carburante
7. Torna al menu principale

Parte 3: Operazioni su File
Obiettivo: Implementare funzioni per leggere e scrivere sul file di testo.
Dettagli Implementazione:
1. Funzione leggiDaFile(): Dovrebbe leggere le informazioni dal file e popolare la lista listaAuto.
2. Funzione scriviSuFile(): Dovrebbe scrivere le informazioni dalla lista listaAuto al file, ogni volta che l'elenco viene modificato.

Parte 4: Operazioni Avanzate
Obiettivo: Implementare funzioni di ricerca e filtraggio.
Dettagli Implementazione:
1. Funzione cercaAutoPerAnno(): Dovrebbe permettere all'utente di inserire un anno e visualizzare tutte le auto di quell'anno.
2. Funzione filtraAutoPerPrezzo(): Dovrebbe permettere all'utente di inserire un range di prezzo e visualizzare tutte le auto all'interno di quel range.

# LISTA TASKS:

1. Creazione e definizione classe Auto con relative variabili e metodi ( getters() setters() toString() e costruttore )
2. Creazione e definizione classe GestioneAuto con relative variabili e metodi.
3.Creazione e definizione classe Utente
4. Iniziare a scrivere metodi su GestioneAuto (implementare corpo su alcuni metodi)
5.GestioneAuto implementata con menù per utente con relativi metodi
6.Creazione e definizione di classe Dao e relativi metodi
7.Testati i metodi DAO all'interno della classe GestioneAuto nel menù (inserimento, modifica e delete funzionano)
