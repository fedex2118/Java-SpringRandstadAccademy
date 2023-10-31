# LibraryRecommendation
This third exercise was about creating a recommendation system for an online bookstore.<br />
This exercise also involves the creation and management of a database related to the bookstore.

# Challenges
The exercise I am presenting is not complete and is missing part 2, i.e., the implementation of the recommendation system.<br />
There were several challenges in this exercise. Choosing whether to start with the database or to directly tackle the recommendation system was the very first hurdle.<br />
Later, the biggest challenge was trying to adapt to complex group work situations.

# What I Learned
I learned to put on hold a task I was working on in order to push forward a colleague's task when they couldn't carry out their own due to issues (any kind of issue: health, development environment not working, etc...).<br />
I learned to adapt to the team's needs.

# Exercise3
Creation of a recommendation system for an online bookstore.<br />
Part 1: Structuring the database and basic logic.<br />
Description: Your task is to design and implement a basic system for an online bookstore. This system should be able to manage users, books, and the reviews made by users on books.<br />

Details:<br />
1. Create a User class with attributes such as id, name, email, and a list of purchased books.
2. Create a Book class with attributes like id, title, author, genre, and price.
3. Create a Review class that associates a User with a Book and includes a rating (from 1 to 5 stars) and a textual comment.
4. Create an OnlineBookstore class that maintains a list of Users, Books, and Reviews.
5. Implement methods in the OnlineBookstore class to allow users to purchase books, leave reviews, and view all available books.
<br />

Part 2: Implementation of the recommendation system.
Description: Extending the work done in Part 1, you now have to create a recommendation system to suggest books to users based on their preferences and the reviews left.<br />

Details:<br />
1. Add a recommendBooks method to the User class. This method, when called, should return a list of suggested books.
2. The recommendation should be based on the following criteria:
  1. Books of the same genre as those the user has already bought and which have a high average rating (for example, 4 or 5 stars).
  2. Books written by the authors of the books the user has already bought.
  3. If the user hasn't bought any books or if there are no books meeting the above criteria, suggest the bookstore's most popular books.
3. Implement an averageRating method in the Book class to calculate the average rating based on reviews.
4. In the OnlineBookstore class, implement a popularBooks method that returns the books with the highest number of positive reviews.
5. The ultimate goal of this exercise is to develop a recommendation system that suggests relevant and interesting books for the user, thereby enhancing the user experience and potentially increasing sales for the bookstore.

# TaskList
1. Creation and definition of the User class with related variables and methods (buyBook() and leaveReview()).
2. Creation and definition of the Book class with related variables and methods (showDetails()).
3. Creation and definition of the Review class with related variables.
4. Creation and definition of the OnlineBookstore class with related variables and methods (addUser(), addBook(), addReview(), displayBooks()).
5. Database creation.
6. Database connection setup.
7. Testing initial DAO methods (TESTS CONDUCTED SUCCESSFULLY).
