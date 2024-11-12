



Spring Boot
-	Introduction of Spring Boot
-	Spring vs Spring Boot
-	Spring Boot (STS)
-	Spring Boot – Code Structure
-	Spring Boot – Runners
-	Spring Boot – Configuration
-	Spring Boot – Annotations
-	Spring Boot – Logging
-	RESTful Web Services
-	Spring Boot with RESTful Web Service – CRUD Operations
o	GET
o	POST
o	PUT
o	DELETE
-	Spring Boot with Thymeleaf
-	Spring Boot with Data JPA – CRUD Operations
o	Unit Testing
-	Microservices
o	Monolithic Architecture
o	Microservice Architecture
o	Monolithic VS Microservice
o	Service Registration with Eureka Server
o	Gateway
o	Spring Cloud Configuration 
o	Spring Boot – Actuator
o	Spring Boot – Swagger2
o	Spring Boot with Hystrix
o	Spring Boot with Batch Service
o	Spring Boot with 
	RabbitMQ
	Apache Kafka
o	Spring Boot with Security
	Basic Authentication
	Authorization and Authentication
	JWT
	OAuth2


Project With Both FrontEnd and BackEnd
•	FrontEnd
o	HTML,CSS,JS,
o	TypeScript
o	Angular
•	BackEnd
o	Spring Boot
•	Integration of FrontEnd and Backend
•	Docker
•	AWS
























		INTRODUCTION TO SPRING BOOT

-	It is an open-source java-based framework which is used to create a microservice application.
-	It is used to develop both stand-alone and web-based application specially we can design the RESTful web service application.
-	It provides multiple flexible ways to configure 
o	Java Beans
o	XML Configurations
o	Database Transaction
-	It is providing auto configuration there is no manual configuration needed.
-	In this case we can create a running application with very few annotations.
-	It provides many starters as per need like for web, for database etc. it will handle dependencies effectively.
-	It provides an embedded servlet container(jetty)  and others.
-	By using the Spring Boot with can develop the application very quickly or RAD(rapid application development)
Spring Boot = Spring Framework + Embedded Http Servers(Tomcat,Jetty) 
 –  XML(beans) Configurations is reduced.

-	The major goal of Spring Boot is as below:
o	Simpler Configuration
o	Ease of Development
o	Reduce the Development Efforts
o	Easy Deployment
Let’s Learn How to Develop the Simple Spring Boot Project
Step1: Install the STS
https://spring.io/tools
Step2: In order to create the Spring Boot project, we can use the following 2 approaches:
1.	We can use start.spring.io
https://start.spring.io/


 
-	Download the zip file and extract it and open the STS Ide and import the project
 

   pom.xml
-	Project Object Model : It is an XML file which contains the information about  the project(maven) and configuration details like dependencies , project information , jdk version and other plugins details	

Web Services
-	It is a software system that enables communication between different applications over the internet which is basically used to exchange data, platform, language.
-	It is rely on standardized protocols like HTTP in order to send and receive the data over on the network.
-	The following are the types of webservices:
o	SOAP(Simple Object Access Protocol)
	It uses XML format to send and receive the data over on the network.
	In order to implement we use JAX-WS API
	It is best suitable for application like enterprise.

o	RESTful(Representational state transfer)
	It share the data in different format like plan text, HTML, XML, JSON format data.
	In order to implement we use JAX-RS API
	It uses standard HTTP methods like (GET, POST, PUT, DELETE, TRACE , OPTION) in order to manage the resources
	It is lightweight and best suitable for web-application.
	JAX-RS API
•	The following implementation vendors:
o	Jersey
o	RESTEasy

RESTful Web Services

REST stands for REpresentational State Transfer. It is developed by Roy Thomas Fielding, who also developed HTTP. The main goal of RESTful web services is to make web services more effective. RESTful web services try to define services using the different concepts that are already present in HTTP. REST is an architectural approach, not a protocol.
It does not define the standard message exchange format. We can build REST services with both XML and JSON. JSON is more popular format with REST. The key abstraction is a resource in REST. A resource can be anything. It can be accessed through a Uniform Resource Identifier (URI). For example:
The resource has representations like XML, HTML, and JSON. The current state capture by representational resource. When we request a resource, we provide the representation of the resource. The important methods of HTTP are:
o	GET: It reads a resource.
o	PUT: It updates an existing resource.
o	POST: It creates a new resource.
o	DELETE: It deletes the resource.

A web service is a software system that enables communication between different applications over the internet, allowing them to interact and exchange data, regardless of their underlying architecture, platform, or language. Web services rely on standardized protocols like HTTP or HTTPS to send and receive data, making it possible for diverse systems to work together seamlessly.
Why We Need Web Services
1.	Interoperability: Web services facilitate communication between applications built in different languages and frameworks, enabling seamless integration.
2.	Reusability: Components of web services can be reused across multiple applications, reducing duplication.
3.	Scalability: Web services can scale as they support distributed, loosely coupled, and independently deployable services.
4.	Easy Access: Since web services use internet protocols (like HTTP), they are accessible anywhere on the web, making it easy to build systems that work across locations.
Types of Web Services
There are mainly two types of web services:
1.	SOAP (Simple Object Access Protocol) Web Services:
o	Uses XML to send and receive messages.
o	Highly standardized, with strict security, reliability, and transactional support.
o	Suitable for enterprise applications that require formal structure and security.
2.	REST (Representational State Transfer) Web Services:
o	Uses standard HTTP methods (GET, POST, PUT, DELETE) to manage resources.
o	Can exchange data in multiple formats (JSON, XML), but JSON is most commonly used.
o	Lightweight and suitable for scalable web applications.
RESTful Web Services
A RESTful Web Service is a web service built using REST principles. REST is an architectural style rather than a strict protocol, and it’s commonly used for creating APIs. RESTful services focus on accessing and manipulating resources, where each resource is identified by a unique URL.
Key Concepts of RESTful Web Services
1.	Stateless: Each request from a client to a server must contain all the information the server needs to fulfill that request. The server does not retain session data.
2.	Client-Server Architecture: The client and server are separated, and the client only requests resources from the server, which responds without being concerned about the client’s state.
3.	Cacheable: Responses can be marked as cacheable, enabling clients to store responses and reduce the need for future requests.
4.	Layered System: RESTful services can include intermediate servers (e.g., load balancers, security layers) without affecting the interaction between the client and the server.
5.	Uniform Interface: This standardization simplifies the architecture and allows independent evolution of the client and server.




RESTful Web Service Example: Book Store API
Imagine a RESTful API for a bookstore that manages books, authors, and orders. Here’s how it could be designed:
1.	Resource: /books
o	GET /books: Retrieve a list of all books.
o	POST /books: Add a new book to the bookstore.
o	GET /books/{id}: Retrieve details of a specific book by ID.
o	PUT /books/{id}: Update a specific book's information by ID.
o	DELETE /books/{id}: Remove a book by ID.
2.	Resource: /authors
o	GET /authors: Retrieve a list of all authors.
o	GET /authors/{id}: Get details about a specific author.
3.	Resource: /orders
o	POST /orders: Place an order.
o	GET /orders/{id}: Get details of a specific order.
This API lets clients manage the bookstore's inventory and orders without needing a direct connection to the database.
RESTful Web Service Rules and Best Practices
To design an effective RESTful API, follow these principles:
1.	Use Nouns for Endpoints: Use nouns instead of verbs in the URLs (e.g., /books instead of /getBooks or /addBook).
2.	HTTP Methods: Use the HTTP methods appropriately:
o	GET: Retrieve information.
o	POST: Create a new resource.
o	PUT: Update an existing resource.
o	DELETE: Delete a resource.
3.	Statelessness: Avoid storing user state on the server. Each request should carry the necessary data for the operation.
4.	Hierarchical Structure: Use hierarchy in the URL to denote relationships (e.g., /books/{id}/authors for the authors of a specific book).
5.	Response Codes: Use standard HTTP response codes (e.g., 200 OK, 201 Created, 404 Not Found, 400 Bad Request) to indicate the result of an API request.
6.	Return JSON: Use JSON as the data format because it's lightweight, widely supported, and easy to read.
7.	Documentation: Document the API endpoints, parameters, responses, and errors to make the API easier to use.
Real-World Example of RESTful API Use
Social media platforms like Twitter use RESTful APIs to allow applications to interact with their services. For example, a Twitter client app may use the REST API to retrieve a user's timeline, post a tweet, delete a tweet, or follow/unfollow a user. Each of these actions corresponds to a RESTful resource and follows REST principles, making Twitter’s API scalable and easy to use across a variety of devices and applications.

Principle	Description	Benefit
Client-Server	Separates client and server responsibilities.	Allows independent development and scalability.
Stateless	Each request is independent, containing all necessary information.	Simplifies server design, improves scalability, and supports caching.
Cacheable	Responses are cacheable when possible.	Reduces latency and bandwidth usage, improves server scalability.
Uniform Interface	Standardized interactions through unique resource identifiers and hypermedia links.	Promotes consistency, simplifies the client-server interaction, and allows for better decoupling and interoperability.
Layered System	Architecture can be layered with intermediaries for caching, security, and load balancing.	Enhances scalability, security, and modularity.
Code on Demand	Server can send executable code to the client (optional).	Adds flexibility, allowing clients to execute code for additional processing.

Real-World Example of REST Principles: E-commerce API
For an e-commerce REST API that handles products, orders, and customers, the design based on REST principles might look like this:
1.	Uniform Interface:
o	Resources: /products, /orders, /customers.
o	HTTP Methods: GET /products (fetch products), POST /orders (create order), PUT /customers/{id} (update customer).
o	Response Format: JSON format, including self-descriptive messages with appropriate headers.
2.	Stateless:
o	Each API request, like POST /orders, contains all the required data (e.g., product ID, quantity), and the server processes it without retaining session information.
3.	Cacheable:
o	Frequently requested data, like GET /products, can be cached to reduce load on the server.
4.	Layered System:
o	A load balancer distributes incoming requests, while a caching layer handles frequent queries, and a separate layer manages sensitive information securely.
5.	Hypermedia (HATEOAS):
o	A response to GET /products might include links to product details, related products, and reviews, allowing clients to navigate without hardcoding URLs.
By following these REST principles, this API becomes more scalable, interoperable, and easier to maintain, making it well-suited for modern web and mobile applications.




















Let’s learn how to build Spring Boot with RESTful API Application to expose the API to use in an web-application
HTTP status codes are three-digit codes sent by a server in response to an HTTP request from a client, such as a web browser or app. These codes indicate whether a specific HTTP request was successfully completed or if there was an error. They help communicate the result of the request to the client and provide information about any issues that may have occurred.
Why We Need HTTP Status Codes
1.	Clear Communication: They provide a standardized way for servers to inform clients of the outcome of their requests, whether successful or not.
2.	Error Handling: Status codes indicate specific types of errors, enabling applications to handle errors programmatically and provide appropriate feedback to users.
3.	Debugging and Troubleshooting: When issues arise, status codes help developers and administrators identify and diagnose problems, making it easier to maintain and debug applications.
4.	Automation and Monitoring: Automated systems and monitoring tools use status codes to track the health of web applications and services, alerting administrators when unusual or problematic codes appear frequently.
Common Categories of HTTP Status Codes
HTTP status codes are grouped into five categories based on the nature of the response:
1.	1xx - Informational: Indicates that the request was received and understood, and the client should continue the request or ignore it if already finished.
o	Example: 100 Continue – The server has received the initial part of the request and the client should continue.
2.	2xx - Success: Indicates that the client's request was successfully received, understood, and accepted.
o	Example: 200 OK – The request was successful, and the server returned the requested data.
o	Example: 201 Created – The request was successful, and a new resource was created (often used in POST requests).
3.	3xx - Redirection: Indicates that further action is needed to complete the request, usually by redirecting to a different URL.
o	Example: 301 Moved Permanently – The requested resource has been permanently moved to a new URL.
o	Example: 302 Found – The requested resource has temporarily moved to a different URL.
4.	4xx - Client Error: Indicates that the client’s request has an error or cannot be fulfilled due to issues on the client side.
o	Example: 400 Bad Request – The request cannot be processed due to a client error, such as malformed syntax.
o	Example: 401 Unauthorized – Authentication is required to access the resource.
o	Example: 403 Forbidden – The client does not have permission to access the resource.
o	Example: 404 Not Found – The requested resource could not be found on the server.
5.	5xx - Server Error: Indicates that the server failed to fulfil a valid request due to an error on its end.
o	Example: 500 Internal Server Error – The server encountered an unexpected condition that prevented it from fulfilling the request.
o	Example: 503 Service Unavailable – The server is temporarily unavailable, often due to maintenance or overload.

Examples of HTTP Status Code Usage in Real Applications
•	200 OK: After a user successfully logs in, the server returns a 200 OK response with user data.
•	404 Not Found: If a user tries to access a non-existent page, the server returns a 404 Not Found error.
•	401 Unauthorized: When accessing a restricted resource without being logged in, the server returns a 401 Unauthorized status, prompting the user to authenticate.
•	500 Internal Server Error: If there’s an unexpected issue on the server, a 500 Internal Server Error is returned, indicating the need for technical troubleshooting.
HTTP status codes are essential for effective client-server communication, making it easier to design, troubleshoot, and maintain web services and applications.

Spring Data JPA With Hibernate by using Spring Boot
•	JDBC -> Hibernate->ORM
•	Spring -> JDBCTemplate
•	Spring -> HibernateTemplate
•	SpringBoot -> Spring Data JPA with Hibernate to reduce the configuration
Key Points:
ORM: It is technique in order to mapped the corresponding pojo to table and property to column. i.e. object to table
JPA: It is specification for java that define how ORM should be implemented. 
Hibernate: It is ORM framework that implements JPA and additional features.
Spring Data JPA: It is part of spring framework which simplifies data access by using JPA and leveraging hibernate as underlying ORM framework.

Let’s create the project by using the following steps:
Step1: Create the starter project in sts by adding the following dependencies
-	Spring Web
-	Spring Boot DevTools
-	Spring Data JPA
-	MySQL Driver
Step2: Configure the application.properties
Step3: Create the Product entity
Step4: 
Step2:
Spring Boot Annotation
@GetMapping -> @RequestMapping(path=”/”, method=RequestMethod.GET)
@PostMapping-> @RequestMapping(path=”/”,method=RequestMethod.POST)
….
@RequestBody
-	It is used to bind the HTTP request which is coming from client and bind the method parameter in a controller.
-	It is basically used to handle incomding JSON , XML , plan text data and convert it into an java object which is then used in the application to persist.
@RestController
-	It is combination of @Controller + @ResponseBody 
-	It is used to create RESTful webservices
-	It is used to simply the development of RESTful API by eliminating the need to annotate each method with @ResponseBody

----------------------------------------------------------------------------------------------------------------------------------------------------------------------

S.NO	ANNOTATION	DESCRPITION
1.	@ControllerAdvice	It is used to tell the spring that the class will handle the exceptions for all the controllers in the application.
2.	@ExceptionHandler	It is used to handle the exception of the corresponding method i.e. method can handle that exception which is raised. 
                                 Example : ResourceNotFoundException
3.	ResponseEntity	        It is class which is used to send the information like 
I.	Header
II.	Status Code
III.	Body
		

