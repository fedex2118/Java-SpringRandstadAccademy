# Pastry Shop
This second exercise involved creating software to manage the functional elements requested by a pastry chef. It is necessary to manage Products, Ingredients, Employees, and finally also Users (optional extra UI interface).

# Challenges
The exercise I am presenting is not complete; it lacks the booking system, the administrative part, and the customer loyalty system. The greatest difficulty encountered in carrying out this project was working in a group and coordinating.

# What I've Learned:
I learned to divide the work into tasks and to coordinate in a team, facing various problems related to setting up the project on GitHub. I also learned that it is much more stable to add new features only after testing the previous parts.

# Exercise 2
Create software that manages the functional elements requested by a pastry chef.

Specifications:

Base Classes:

1. Create a Product class that represents a single item sold in the pastry shop. Each product should have:
   - Name: the name of the product (e.g., "Chocolate Cake").
   - Price: the product price.
   - Ingredients: a list of used ingredients.
   - Description: a short product description.
   - AvailableQuantity: the quantity of that product available in stock.
   - A sell() method that reduces the available quantity when the product is sold.

2. Create a Customer class that represents a shop customer. Each customer should have:
   - Name: customer's first name.
   - Surname: customer's last name.
   - Address: delivery address.
   - Cart: a list of products the customer intends to purchase.
   - A addToCart(Product p) method to add products to the cart.
   - A placeOrder() method to confirm the purchase of the products in the cart.

Derived Classes:

From the Product class, create several subclasses representing specific product categories, such as Cake, Cookie, Cupcake, etc. These classes might have special properties or methods. For instance, the Cake class might have a numberOfPieces variable or a slice() method.

Staff Management:

1. Create an Employee class with the following properties:
   - Name, surname, dateOfBirth, hiringDate, role (e.g., "Pastry Chef", "Cashier", "Manager").
   - A work() method that prints a message based on the employee's role.

2. Create a Manager class derived from Employee with additional methods like hire(Employee d) and fire(Employee d).

Reservation System:

Implement a reservation system that allows customers to book products in advance. The system should track reservations and ensure that booked products are not sold to other customers.

Administration Interface:

1. Create an Administration class with methods that allow:
   - Adding or removing products from the catalog.
   - Viewing the list of best-selling products.
   - Managing customer orders.
   - Viewing and managing reservations.
   - Hiring, firing, or viewing the list of employees.

Additional Challenges:

1. Implement a loyalty system for customers offering discounts based on accumulated expenses.
2. Create a Supplier class representing companies supplying ingredients to the pastry shop. Implement methods to order ingredients, track stocks, and manage invoices.
3. Introduce a feedback rating for customers to evaluate products and provide suggestions.
4. Collect customer money.

# Tasks List:

1. Creation and definition of Product class with related variables and methods ( sell() and toString() ).
2. Creation and definition of Customer class with related variables and methods ( addToCart and placeOrder() ).
3. Classes mentioned above and their respective methods tested in Pastry Shop class (with intrinsic Main) (WORKING).
4. Creation and definition of Employee classes and Manager subclass with additional methods ( hire() and fire() ).
5. Testing the methods and classes defined in point 4 (WORKING).
6. Creating the architecture of the reservation system (NOT COMPLETED).

The goal we wanted to achieve: try to complete the "ADMINISTRATION with Catalogs, Customers, and Staff interacting with each other."
