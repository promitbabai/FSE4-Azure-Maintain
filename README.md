# FSE4-Azure-Maintain
------------------------


The code included in this sample is intended to illustrate using Azure MySQL DB from SpringBoot application

Azure-Maintain Microservices is Deployed on Azure with below 2 DB connection options -
    1) Local MySQL Database
    2) Azure MySQL Database,

Once Data is inserted into any of the above two databases then a JSON Message is sent to the 
Azure Service Bus Queue - so that it is recieved by the Azure Search Microserice project and inserted into the 
Azure CosmosDB (MongoDB API) - This is a part of the CQRS Design Pattern
Then it sends 
    
## Running this sample

1. Create a new database in your Azure MySQL DB account.
 a. Create the Schema and the TABLES from the scripts given in the MySQL-Commands.txt file

2. Clone this repository

3A. Change in the file = *src\main\resources\application.yml*

Replace with the name of the database in your Azure Cosmos DB account.
      
# Local MySQL DB
    #url: jdbc:mysql://localhost:3306/skilltracker?autoReconnect=true&failOverReadOnly=false&maxReconnects=10
    #username: root
    #password: pass@word1
# Azure MySQL DB
    #url: jdbc:mysql://mysql-server-skilltracker.mysql.database.azure.com:3306/skilltracker?autoReconnect=true&failOverReadOnly=false&maxReconnects=10
    #username: promitbabai
    #password: Mamonbabai-1

4. Run your application:

    ```bash
	mvn clean install
    mvn spring-boot:run
    ```


