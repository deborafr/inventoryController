Inventory controller
Description: The system includes 3 main classes that controls the inventory inside the vending machine.
1.	productController – implements the REST controller.
2.	productssService - implements the back end service with the business logic.
3.	productsDB - The data base layer (assume you have a connection to the DB).
And the classes:	
Model – implements Data transform object.
Battle – extracts the Model class. Implements a DTO  of type Battle
Charger – extracts the Model class. Implements a DTO  of type Charger.

Rest API:
1.	Get all products
•	URL - http://localhost:8080/products
•	Method – Get
•	Purpose – Retrieve List of all products that are in the inventory (DB).
•	Parameters – NONE
•	Body params – NONE
•	Result – List of products
2.	Add a Battle 
•	URL - http://localhost:8080/battle
•	Method – Post
•	Purpose –  Add new Battle  product to the DB
•	Parameters – NONE
•	Body params – a Battle product including the fields: String id, String type, double price, String expDate.
•	Result – Battle product
3.	Add a Charger 
•	URL - http://localhost:8080/charger
•	Method – Post
•	Purpose – Add new Charger product to the DB
•	Parameters – NONE
•	Body params – a Chrger product including the fields: String id, String type, double price, String specificType, String company.
•	Result – Charger product
4.	Get all Battles
•	URL - http://localhost:8080/battles
•	Method – Get
•	Purpose – Retrieve List of all Battle products that are in the inventory (DB).
•	Parameters – NONE
•	Body params – NONE
•	Result – List of Battles products
5.	Get Battles amount
•	URL - http://localhost:8080/battlesAmount
•	Method – Get
•	Purpose – Retrieve  number of battles that are in the DB
•	Parameters – NONE
•	Body params – NONE
•	Result – int
6.	Get all Chargers
•	URL - http://localhost:8080/chargers
•	Method – Get
•	Purpose – Retrieve List of all Charger products that are in the inventory (DB).
•	Parameters – NONE
•	Body params – NONE
•	Result – List of Charger products
7.	Get Chragers amount
•	URL - http://localhost:8080/chargersAmount
•	Method – Get
•	Purpose – Retrieve  number of chargers that are in the DB
•	Parameters – NONE
•	Body params – NONE
•	Result – int

8.	Get a product by ID
•	URL - http://localhost:8080/product/{id}
•	Method – Get
•	Purpose – Retrieve a specific product by it's ID
•	Parameters –string ID 
•	Body params – NONE
•	Result – Battle / Charger product
9.	Update a Battles
•	URL - http://localhost:8080/battles
•	Method – Patch
•	Purpose – update a Battle product that is in the DB
•	Parameters – NONE
•	Body params – a Battle product including the fields: String id, String type, double price, String expDate.
•	Result – Battle product 
10.	Update a Chargers
•	URL - http://localhost:8080/chargers
•	Method – Patch
•	Purpose – update a Charger product that is in the DB.
•	Parameters – NONE
•	Body params – a Chrger product including the fields: String id, String type, double price, String specificType, String company.
•	Result – Charger product
11.	Delete product
•	URL - http://localhost:8080/product/{id}
•	Method – delete
•	Purpose – delete a product that is in the DB.
•	Parameters – NONE
•	Body params – a Battle/Charger product including it's fields: String id, String type, double price. For battle add: String expDate. For charger add: String specificType, String company.
•	Result -  Battle / Charger product
