Running the Server Application:

- First go to the root of the project, and run "mvn spring-boot:run", make sure you have JDK 21 installed and a Maven package installed and is both declared in the Path on your environment variables.


How does the Server run?:

- The server currently has 3 controllers, one controller that requests data from an external API, and bring the same structured result upon request, while the other 2 controllers are responsible for reading and write data from the database. Insertion of newly created data involves a built in save method of a jpa repository, while reading data involves a jpq SELECT query.


Testing the URL Endpoints:

- http://localhost:8080/api/fetch-external, a GET request type route and is used to fetch data from an external API and return resuls to the client.

- http://localhost:8080/api/users, this route has two type of request method, a POST and a GET method, where in POST method accepts a body from a client request and return a response upon successful transaction while the GET method returns all the users from the enriched_table table.


Guide on creating the database file:

- Create a test.mv.db and must be located at C:/db ( C:/db/test.mv.db ), as this is where i specified the location of the database.