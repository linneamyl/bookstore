# bookstore

Bookstore
CHAPTER 2 MODEL & VIEW

1.
a.) Create a project called Bookstore by using Spring Initializr page (include web, devtools)
b.) Add a new controller called BookController which handle get request to the path /index
c.) Add a new model class called Book which contains attributes: title, author, year, isbn, price 
d.) Add your project to your GitHub account (See the instructions from the moodle)

CHAPTER 3 DATABASE & JPA

1. Bookstore: Add JPA and database
a.) Add JPA support and H2 database to your bookstore project (in GitHub) by modifying pom.xml file.
b.) Create an entity from your Book class
c.) Add command line runner to insert few examplele data to your database
d.) Modify properties to show sql statements in the console
e.) Enable H2 console

2. Listpage
Create a template called booklist.html which shows all books from the database in html table. 
To show the books you have to add new method to controller that handle GET request from endpoint like /booklist.

3. Bookstore: Crud
Add Create and Delete functionalities to your Bookstore application
For create functionality add new thymeleaf template called addstudent.html For deletion use @PathVariable annotation

4. Edit Bookstore
Add edit functionality to your bookstore. Create edit link after delete link to your listpage.
Edit link will open current book in the edit page.
Tip. Check ‘Add book’-functionality from the controller. In add functionality you added new book object to model
but now you will add current book object to model. You also have to send current book id from the list page to controller.
