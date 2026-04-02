Question 1:
-	My first thinking is, I will use the first try to split the balls into 4 each, and I will observe which 4 balls is heavier, after that, I will focus on those 4 and disregard the other 4, the second try would be the same, split into two then disregard the other two after some measurement, now that I have only two balls, my final judgement without using the scale is by feeling the heaviness on both balls and thus I will make my judgement to find the heaviest balls.

Question 2:
-	The most common cause of this is the classpath scanning, since every startup of a spring server, spring uses classpath scanning, to find classes annotated with @Service, @Component etc, and if we registered too much beans, this will cause a lot of time registering those beans.

Question 3:
-	First, almost the logging of Spring errors is already sufficient enough to detect what’s causing issues, including what line of code, because of this, I have still not yet found a reason to use a tool to detect bugs or issues as spring errors logs errors in the terminal efficiently, and usually the technique I do when I have to read a lot of logs is that, I copy and paste the error logs in a notepad and use word finder that’s if I have a clue what file is causing the error, but usually I just rely on spring logs to find errors.

Question 4:
-	The difference between @Controller and @RestController is that @Controller doesn’t come up with @ResponseBody which is the structure of data we’re receiving from a client which is why it’s required when using @Controller, while @RestController comes with both @Controller and @ResponseBody making it easier to handle upcoming data.

Question 5:
-	So in our traditional way of injecting a dependency is by declaring an object using the new keyword, this creates a tightly coupled structure, which why it will be harder to maintain if future changes happens, constructor injection on the other hand now relies on the dependencies maintained by the IoC container, which is creates a loosely coupled structure, making dependencies to maintain later on.

Question 6:
-	@SpringBootApplication comes with three annotations such as @EnableAutoConfiguration, @ComponentScan and @SpringBootAutoConfiguration

Question 8:
-	An INNER JOIN, combines two table with matching records, this will not add that doesn’t match any condition or values, while LEFT JOIN, this actually combines two table with or without matching records from the Left table on the select structure, given such circumstances, this will create a null values on the columns of the Left Table.

Question 9:
-	@Entity marks a class as a candidate for a jpa table, this tells a spring that this is a table in a relational database. The only caveat here is that Spring assumes the same name of @Entity annotated class to the table you are referring to, which is why @Table must be specified to tell the spring that  a given value in this @Table annotation is the table name in our database. @Column, even based on its name, specifies a column in the database, the same reason in @Entity, without marking fields with @Column, spring assumes that the field name is the same as the column name of the referred table. @Table is not actually required, but is a must if you need to specify an actual table name given that a class in Java should be written in Pascal Case, which is against the format of naming convention of tables in database.

Question 10:
-	FetchType.EAGER is the default fetch type when dealing with relations in jpa, given on Class1 we have an @OneToMany annotated field List<Users> users and a @ManyToOne annotated field Data data which this annotation refers to the id field in class 1, so if in our repository, we used a jpa query, to get those data, all related fields will be queried upon method call that handles such query, this can cause performance issues given when a data we’re fetching is huge, which is why we should add to a @OneToMany or @ManyToOne field parameters a FetchType.LAZY, which such fields will not be queried until requested from a specific method. This improves and reduces the time to query when reading a large set of data from the database.

Question 11:
-	The difference is detached state EntityManager wont be able to sync changes with the database and attached state does the opposite where any changes to an entity is automatically tracked and is sync on the database.

Question 12:
-	@Transactional annotation does a rollback and does not commit to the database in case of errors from the server side. So when a RuntimeException occurs, this will prevent a transaction from being commited from a database preventing unexpected data creation.