Build Address Randomly from Different DataSources

Requirements Implement a REST HTTP service that can build a random address.

As a member of the test engineering team, I'm expected to implement the service following the technical specifications described below.

Note that the address does NOT have to be logically/shipping valid up to a country level. However, it is supposed to be in a human-readable country mailing format. As an example, “532 Union St., Apt 72, San Diego, NY, 789302” is acceptable even though this address won’t pass USPS validation. In addition, limit the set of countries to 4:

US Canada Mexico Netherlands The response must be in a human-readable format such as JSON, XML, YAML, TOML, etc. The implementation should follow best development practices and should preferably be a Java + Spring Boot solution, but you may if needed, choose another object-oriented language that you are familiar with.


Technical details: Endpoint: GET /randomizer/address

Implementation using MVC Model Architecture:

The properties are being generated randomly with the help of the java.util.Random class which helps in generating the pseudo-random numbers in Java and also used the predefined methods of Random class like nextInt(), nextBytes() in order to generate the Random numbers and Text on top of those. Defined the countries with codes and states with corresponding state codes in the constant file and fetching those randomly to set in the address to match to a more specific or a valid address.

Used spring-boot-starter-web module to publish the REST API by following MVC model architecture while generating the address, and using the RestController to the ResponseEntity as a JSON back in the response. Also used MockMvc in order to mock the service with the help of spring-boot-starter-test dependency and to unit test the methods that are defined in the Service class.



Tools:
Spring Boot 2.0.9
Maven 3.6.3


API Description:
This API generates a random address with the below mentioned properties and returns the same to the client with a success status code 200. 

API URL: http://localhost:8080/randomizer/address
Method Type: GET
Response Format: JSON
Response Sample:
    {
      "house": "house",
      "street": "street",
      "postalCode": "postalCode",
      "city": "city",
      "county": "county",
      "state": "state",
      "stateCode": "stateCode",
      "country": "country",
      "countryCode": "countryCode"
    }

With Status Code 404:
   Status = 404
    Error message = null
          Headers = [Vary:"Origin", "Access-Control-Request-Method", "Access-Control-Request-Headers"]
     Content type = null
    
    
With Status Code 405:    

Response:
           Status = 405
    Error message = Request method 'POST' not supported
             
Steps to access the API:

1. Clone the project.
2. Use mvn clean install to build the project
3. Go to RandomAddressGeneratorApplication.java and run as Java application
4. Hit the URL http://localhost:8080/randomizer/address in any browser or postman to see the response with some random address
5. unit tests available in RandomAddressGeneratorApplicationTests.java class