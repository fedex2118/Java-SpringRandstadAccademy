# SportsStore
Questo quinto esercizio consisteva nel creare un applicazione per un "cliente" che ha un negozio sportivo (Menu UI per Admin e per Utente + collegamento a Database).

# Difficoltà
L'esercizio che riporto è completo, mancano e si potranno aggiungere funzionalità extra in futuro ma il "cliente" può ritenersi soddisfatto.

# Cosa ho imparato:
Ho imparato ad arrivare a termine lavorando in gruppo svolgendo e testando pezzettino dopo pezzettino, dallo stabilire le specifiche e le code rules con il team al completamento del progetto con l'aggiunta di documentazione accurata. 
Questo progetto lo ritengo un traguardo personale sia perché è un progetto completato ed anche perché presenta la documentazione per il "cliente".

Di seguito la documentazione:

# Progetto
Welcome to the Sport Store Web Application, an application for managing an online sports store. This application allows users to register, log in, explore products available in the store, add products to the cart, make purchases, and more.

# Project Description
The application was developed in Java and is based on a client-server architecture. It uses a MySQL database to manage user data and products available in the store.

# Main Features
- **Registration**: Users can register a new account by entering information such as username, password, email, first name, and last name.

- **Login**: Registered users can log in using their username and password.

- **Product Exploration**: Users can explore the list of products available in the store and view details such as name, description, price, and availability.

- **Cart Management**: Users can add products to their cart, specifying the desired quantity. They can also remove products from the cart.

- **Product Purchase**: Users can confirm the purchase of the products in their cart. The purchase total will be calculated, and users can confirm or cancel the purchase.

- **Administrator Management**: Administrator users have access to additional features, such as adding and removing products from the store.

# Requirements
Java JDK 21 (recommended version)
MySQL Server
JDBC Connector/J version >=8

# Installation
1. Clone the repository:
`git clone https://github.com/yourname/sport-store-app.git`

2. Open the project in Eclipse and ensure JDK 21 is installed. If not already installed, you can download it from Oracle's official site and set it up in Eclipse.

3. Add the MySQL JDBC connector (Connector/J) to the Eclipse project:

   1. Download the latest version of the MySQL connector from MySQL's official website.
   2. In Eclipse, right-click the project and select "Build Path" -> "Configure Build Path".
   3. In the "Libraries" tab, click "Add External JARs" and select the downloaded MySQL connector JAR file.
   4. Click "Apply and Close" to confirm.

4. Create the MySQL database and the necessary tables by running the SQL instructions provided in DbSetting.sql.

5. Modify the static database connection variables in the NegozioDao.java file to reflect your MySQL database configuration.

6. Run the project in Eclipse.

# Project Task Management
TASK 1: Establish specifications.

TASK 2: Set code rules.

TASK 3: Structure DB, menu structure, entity structure.

TASK 4: Merge the three logics and solve merge issues. (GitHub explosion management)

TASK 5: Implement methods communicating with DB: registration, logging.

TASK 6: Implement methods communicating with DB: add products, remove products from the cart, and USER purchase.

TASK 7: Implement methods communicating with DB: add products, remove products from store ADMIN.

TASK 8: Testing implementations related to USER menu.

TASK 9: Testing implementations related to ADMIN menu.

TASK 9: Resolve minor issues (typos, loop interruptions).

TASK 10: Implement the purchase table in the DB.

TASK 11: Testing the implementations related to the purchase table.

TASK 12: Implement documentation.

TASK 13: Implement product search.

TASK 14: Testing product search.
