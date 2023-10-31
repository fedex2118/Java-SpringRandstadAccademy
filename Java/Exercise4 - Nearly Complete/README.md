# CarManagement
This fourth exercise was about creating an application to manage cars present in a database. <br />
This exercise also requires the creation and management of a database related to cars.
Implementation of an Admin UI Menu and an Admin UI Submenu for the CRUD part is required, and information about the objects should be finally saved in a text file.

# Challenges
The exercise I present is almost complete, missing only the file management part.
The main difficulty encountered in this exercise was deciding where to start working, whether from the File directly or from the Database.

# What I've learned:
I've learned that if you focus on a particular problem (e.g., how to handle files), many times it's better to come back to it later. Therefore, you need to set priorities or adapt to them.

# Exercise 4
Car Management Application.

Part 1: Definition of Structures.

Goal: Create a data structure and basic classes.

Implementation Details:

Car Class:
Attributes: id, brand, model, year, license plate, price, fuelType
Methods: getter, setter, toString(), constructors
CarManagement Class:

Attributes: carList, file name
Methods: addCar(), modifyCar(), deleteCar(), viewCar(), searchCarByLicensePlate(), readFromFile(), writeToFile()
Text File: car.txt - to store car information. Each line represents a car, and details are separated by commas.

Part 2: User Interaction
Goal: Create a textual interaction interface with the user.
Implementation Details:

Main Console Menu:
1. Add car
2. Modify car
3. Delete car
4. View all cars
5. Search car by license plate
6. Exit

Submenu for Modifying Car: After selecting a car by license plate, another menu is presented:

1. Modify brand
2. Modify model
3. Modify year
4. Modify license plate
5. Modify price
6. Modify fuel type
7. Return to the main menu

Part 3: File Operations.

Goal: Implement functions to read and write to the text file.

Implementation Details:

1. Function readFromFile(): Should read the information from the file and populate the carList.
2. Function writeToFile(): Should write information from the carList to the file, every time the list is modified.

Part 4: Advanced Operations.

Goal: Implement search and filtering functions.

Implementation Details:

1. Function searchCarByYear(): Should allow the user to enter a year and display all cars of that year.
2. Function filterCarByPrice(): Should allow the user to enter a price range and display all cars within that range.

# Tasks List:
1. Creation and definition of Car class with related variables and methods (getters() setters() toString() and constructor)
2. Creation and definition of CarManagement class with related variables and methods.
3. Creation and definition of User class
4. Begin to write methods on CarManagement (implement body on some methods)
5. CarManagement implemented with user menu and related methods
6. Creation and definition of Dao class and related methods
7. Tested the DAO methods inside the CarManagement class in the menu (insert, modify, and delete work).
