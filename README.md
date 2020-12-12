# curd-aasignment
This is assignment curd operation

1 database connection  h2   we can check data
        http://localhost:8090/h2-console/login.do
        login without password         
        
2  Save Contact :
		url : localhost:8090/saveContact
		method : POST
		request : {
						"firstName":"Vishnu",
						"lastName":"patairya",
						"email":"vishnu@test.com",
						"phoneNumber":"8748548745",
						"status":"Active"
					}
					
         response : {
						  "id": 1,
						  "firstName": "Vishnu",
						  "lastName": "patairya",
						  "email": "vishnu@test.com",
						  "phoneNumber": "8748548745",
						  "status": "Active"
					}
					

3  Update Contact  :
         URL : localhost:8090/updateContact
         Method: PUT
         request json : {
						  "id": 2,
						  "firstName": "vishnu g",
						  "lastName": "patairya",
						  "email": "vishnu@test.com",
						  "phoneNumber": "8748548745",
						  "status": "Active"
						}	 
						
4  get contact List : 
          URL : localhost:8090/contacts
          Method: GET
          Response  : 	[
							  {
							    "id": 2,
							    "firstName": "vishnu g",
							    "lastName": "patairya",
							    "email": "vishnu@test.com",
							    "phoneNumber": "8748548745",
							    "status": "Active"
							  },
							  {
							    "id": 3,
							    "firstName": "Vishnu",
							    "lastName": "patairya",
							    "email": "vishnu@test.com",
							    "phoneNumber": "8748548745",
							    "status": "Active"
							  }
							]	
							
5  Delete Contact		: 
			URL : localhost:8090/deleteContact/1
			Method : Delete
			response : success		  
