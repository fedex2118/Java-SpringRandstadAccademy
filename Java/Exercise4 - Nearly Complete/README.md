# GestioneAuto
Questo terzo esercizio consisteva nel creare un sistema di raccomandazione per una libreria online<br />
Questo esercizio richiede anche la creazione e gestione di un database legato alla libreria.

# Difficoltà
L'esercizio che riporto non è completo e manca la parte 2 dell'esercizio ovvero l'implementazione del sistema di raccomandazione.<br />
Ci sono state diverse difficoltà in questo esercizio. Scegliere se fare prima database o dedicarsi direttamente al sistema di raccomandazione è stato il primissimo ostacolo.<br />
In seguito la più grande difficoltà è stata trovata nel cercare di adattarsi a complesse situazioni di lavoro in gruppo.

# Cosa ho imparato:
Ho imparato a lasciare in sospeso un task a cui stavo lavorando per portare avanti il task di colleghi, nel momento in cui i colleghi non possano svolgere il proprio per problemi (qualsiasi tipo di problema: salute, ambiente di sviluppo che non funziona, ecc...).<br />
Ho imparato a sapermi adattare alle esigenze del team.

# Esercizio 4

Applicazione di Gestione Auto
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
