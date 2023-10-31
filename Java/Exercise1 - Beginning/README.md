# Video Game
This first exercise involved creating a hierarchy of classes to represent different types of video games. An admin should be in charge of managing the requests (the types of games requested) from users.

# Challenges
The exercise I'm presenting is not complete, and most of the user interface is missing. The greatest difficulty encountered in carrying out this project was time management and personal organization.

# What I'Ve Learned:
I learned that I need to manage my time better and organize myself before diving straight into coding.

# Exercise 1

Create a hierarchy of classes to represent different types of video games and allow it only after registration with attached admin management.

Specifications:
Create a base class called VideoGame that contains:
A variable 'name' for the name of the video game.
A variable 'genre' for the genre of the video game (e.g., Action, Adventure, Strategy).
A method play() that prints a generic message like "You are playing [name]".

Create two derived classes:
ActionVideoGame and StrategyVideoGame that inherit from VideoGame.
The ActionVideoGame class should have an additional method fight() that prints "Fight in progress...".
The StrategyVideoGame class should have an additional method plan() that prints "Strategic planning in progress...".

Demonstrate polymorphism
by creating an array of VideoGame objects and traversing it to call the play() method on each element.

Handle multi-user:
Ensure that the user must register to gain access.
Create Log in and Log out options always available.
Ensure that more than one user can be registered in memory but with unique names.

Manage the Admin:
The admin is a special user who can receive "requests".
Can add, remove, and modify video games.
Requests are nothing more than users requesting a specific type of game that he can view and/or delete.
