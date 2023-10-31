# Pasticceria
Questo secondo esercizio consisteva nel creare un software che gestisca gli elementi funzionali della richiesta di un pasticcere.< br/>
Si devono gestire quindi Prodotti, Ingredienti, Dipendenti e infine anche Utenti (extra opzionale interfaccia UI).

# Difficoltà
L'esercizio che riporto non è completo, mancano il sistema di prenotazione la parte amministrativa e di fedeltà clienti.< br/>
La più grande difficoltà trovata nello svolgere questo progetto è stato il lavorare in gruppo e sapersi coordinare.

# Cosa ho imparato:
Ho imparato a dividere il lavoro in tasks e a coordinarmi in team, affrontando diversi problemi legati al setup del progetto su github.
Inoltre ho imparato che risulta molto più stabile aggiungere nuove funzionalità solo dopo aver testato le parti precedenti.

# Esercizio 2

Creare un software che gestisca gli elementi funzionali della richiesta di un pasticcere. 

Specifiche:

Classi Base:

Creare una classe Prodotto che rappresenti un singolo articolo venduto nella pasticceria. Ogni prodotto dovrebbe avere:
nome: il nome del prodotto (es. "Torta al cioccolato").
prezzo: il prezzo del prodotto.
ingredienti: una lista degli ingredienti utilizzati.
descrizione: una breve descrizione del prodotto.
quantitàDisponibile: quantità di quel prodotto disponibile in magazzino.
Un metodo vendi() che riduce la quantità disponibile quando il prodotto viene venduto.
Creare una classe Cliente che rappresenti un cliente del negozio. Ogni cliente dovrebbe avere:
nome: nome del cliente.
cognome: cognome del cliente.
indirizzo: indirizzo di consegna.
carrello: una lista di prodotti che il cliente intende acquistare.
Un metodo aggiungiAlCarrello(Prodotto p) per aggiungere prodotti al carrello.
Un metodo effettuaOrdine() per confermare l'acquisto dei prodotti nel carrello.
Classi Derivate:

Dalla classe Prodotto, creare diverse sottoclassi che rappresentino categorie specifiche di prodotti, come Torta, Biscotto, Cupcake, ecc. Queste classi potrebbero avere proprietà o metodi speciali. Ad esempio, la classe Torta potrebbe avere una variabile numeroDiPezzi o un metodo taglia().
Gestione del Personale:

Creare una classe Dipendente con le seguenti proprietà:
nome, cognome, dataDiNascita, dataAssunzione, ruolo (es. "Pasticcere", "Cassiere", "Manager").
Un metodo lavora() che stampa un messaggio in base al ruolo del dipendente.
Creare una classe Manager derivata da Dipendente con metodi aggiuntivi come assumi(Dipendente d) e licenzia(Dipendente d).
Sistema di Prenotazione:

Implementare un sistema di prenotazione che permetta ai clienti di prenotare prodotti in anticipo. Il sistema dovrebbe tracciare le prenotazioni e assicurarsi che i prodotti prenotati non vengano venduti ad altri clienti.
Interfaccia di Amministrazione:

Creare una classe Amministrazione con metodi che permettano di:
Aggiungere o rimuovere prodotti dal catalogo.
Visualizzare l'elenco dei prodotti più venduti.
Gestire gli ordini dei clienti.
Visualizzare e gestire le prenotazioni.
Assumere, licenziare o visualizzare la lista dei dipendenti.
Ulteriori sfide:

Implementare un sistema di fedeltà per i clienti che offre sconti basati sulle spese accumulate.
Creare una classe Fornitore che rappresenti aziende che forniscono ingredienti alla pasticceria. Implementare metodi per ordinare ingredienti, tracciare le scorte e gestire le fatture.
Introdurre una valutazione di feedback per i clienti per valutare i prodotti e fornire suggerimenti.
Inserire i soldi dell cliete


# LISTA TASKS (Team Federico e Valerio):

1. Creazione e definizione classe Prodotto con relative variabili e metodi ( vendi() e toString() )
2. Creazione e definizione classe Cliente con relative variabili e metodi ( aggiungiAlCarrello e effettuaOrdine() )
3. Testati in classe Pasticceria (con Main intrinseco) le classi sopra citate e i relativi metodi (FUNZIONANO)
4.Creazione e definizione di classi Dipendente e sottoclasse Manager con metodi aggiuntivi ( assumi() e licenzia() )
5.Testare i metodi e le classi definite al punto 4 (FUNZIONANO)
6.Creazione architettura sistema prenotazioni (NON TERMINATO)

Obbiettivo che volevamo raggiungere: cercare di terminare la parte di "AMMINISTRAZIONE con Cataloghi, Clienti e Personale che interagiscono tra loro".
