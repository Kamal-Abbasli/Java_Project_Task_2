Product Backend Project 🛒

This project uses CRUD operations on product. Project focuses on creating, updating, deleting, and getting product.

Project is using REST API, Custom Exception. Main tech stacks are Java and Spring boot. H2 Database will be used for storing product. In the end, the project uses Swagger UI for testing API endpoints
------------------------------------------------------------------------------------------------------------

Tech Stack 💻

I. Java 17+ 

II. Spring Boot 

III. Spring Web 

IV. Spring Data JPA

V. H2 Database 

VI. Swagger / Springdoc OpenAPI

------------------------------------------------------------------------------------------------------------

🔗 Features - API Endpoints 

Create - POST "/" - to Create Product. As a parameter it will take a product in json format and return a response if there is no problem. 

![Post](https://github.com/user-attachments/assets/f188cdd9-b02a-46fc-a0bc-e548d323a29e)

Get - GET "/{id}" - to get specific product by id. if there is no product with specific id, it will return us a ProductNotFound Exception. 

![Get](https://github.com/user-attachments/assets/191a3c1f-420b-4ec0-b3e8-5577a3964758)

Update - PUT "{id}" - The endpoint will update the product by getting it’s id. We are getting new product details from RequestBody as JSON. 

![Put1](https://github.com/user-attachments/assets/a87f0e3f-9d1d-484a-93e4-ba6a28fe9149)

![Put2](https://github.com/user-attachments/assets/7e5fb3c8-42e6-488a-be8e-8f751e6d438f)


Get - GET "/" - We are listing all the products.

<img width="1275" height="520" alt="Screenshot 2025-12-08 at 01 16 54" src="https://github.com/user-attachments/assets/9e74611d-a249-4815-bf64-705b53f033df" />

Delete - DELETE "/{id}" - to delete the product by id. If there is no product with specific id, it will return us a ProductNotFound Exception.  

![Delete1](https://github.com/user-attachments/assets/e28b6fe6-ad4e-4a7a-8479-e6656789a056)

![Delete2](https://github.com/user-attachments/assets/2ac8b6f7-a8fd-4827-996a-0c94112b31c0)



------------------------------------------------------------------------------------------------------------

❌ Exception Handling


When specific ID product is not found, the program throws ProductNotFoundException.

![Exception1](https://github.com/user-attachments/assets/f221ca18-b3f0-413f-94a0-556047573268)

------------------------------------------------------------------------------------------------------------

📄 Example JSON Request Bodies

Create - POST

{

"name" : "Example Product Name"

}

<img width="1421" height="306" alt="Screenshot 2025-12-08 at 01 14 52" src="https://github.com/user-attachments/assets/9a6ff7bd-67be-4a3a-b1cb-51ac583a42af" />

------------------------

Update - PUT

{

"name" : "New Product Name",

"id" : productID

}

<img width="1276" height="1007" alt="Screenshot 2025-12-08 at 01 16 29" src="https://github.com/user-attachments/assets/dda86180-3727-48a8-bb82-098b40077e1d" />

<img width="1275" height="520" alt="Screenshot 2025-12-08 at 01 16 54" src="https://github.com/user-attachments/assets/46ab81ce-949f-40d6-b2ed-11fce8bb938c" />


------------------------------------------------------------------------------------------------------------

How to Clone the Project i) Clone the repository git clone https://github.com/Kamal-Abbasli/Java_Project_Task_2.git
