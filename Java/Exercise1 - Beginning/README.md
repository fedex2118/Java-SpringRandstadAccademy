# Video Game
This first exercise involved creating a hierarchy of classes to represent different types of video games. An admin should be in charge of managing the requests (the types of games requested) from users.

We could decide to follow the specifications or try to complete the exercise on our own way.

# Challenges
The exercise I'm presenting is not complete, and most of the user interface is missing. The greatest difficulty encountered in carrying out this project was time management and personal organization.

# What I'Ve Learned:
I learned that I need to manage my time better and organize myself before diving straight into coding.

# Exercise 1

Create a hierarchy of classes to represent different types of video games and allow it only after registration with attached admin management.

Specifications:
1. Create a base class called VideoGame that contains:
2. A variable 'name' for the name of the video game.
3. A variable 'genre' for the genre of the video game (e.g., Action, Adventure, Strategy).
4. A method play() that prints a generic message like "You are playing [name]".

Create two derived classes:
1. ActionVideoGame and StrategyVideoGame that inherit from VideoGame.
2. The ActionVideoGame class should have an additional method fight() that prints "Fight in progress...".
3. The StrategyVideoGame class should have an additional method plan() that prints "Strategic planning in progress...".

Demonstrate polymorphism:
1. by creating an array of VideoGame objects and traversing it to call the play() method on each element.

Handle multi-user:
1. Ensure that the user must register to gain access.
2. Create Log in and Log out options always available.
3. Ensure that more than one user can be registered in memory but with unique names.

Manage the Admin:
1. The admin is a special user who can receive "requests".
2. Can add, remove, and modify video games.
3. Requests are nothing more than users requesting a specific type of game that he can view and/or delete.
