# Spring Boot - MySQL - Boilerplate


>REST API Endpoints


* >GET http://localhost:8080/api/v1/accounts
 
* >GET http://localhost:8080/api/v1/customers

* >GET http://localhost:8080/api/v1/employees


* >POST http://localhost:8080/api/v1/accounts

  ```Request Body
  {
  "accountId": 12345,
  "empId": 101,
  "customerId": 3,
  "branchName": "Hyderabad",
  "startYear": "2021"
  }
  ```  
  


* >DELETE http://localhost:8080/api/v1/accounts/12345


* >PUT http://localhost:8080/api/v1/accounts

  ```Request Body
  {
  "accountId": 12345,
  "empId": 101,
  "customerId": 3,
  "branchName": "Hyderabad",
  "startYear": "2021"
  }
  ```



>Views(MVC)

* >http://localhost:8080/view/accounts


>Swagger UI

* >http://localhost:8080/swagger-ui/index.html