UNIVERSIDAD CENTRAL DEL ECUADOR


Facultad de Ingeniería y Ciencias Aplicadas

COLLABORATORS:

**Dayana Lema

**Daniela Yumbo

DATE:

24 - 07 - 2024

# Dog groomer

PROYECT DESCRIPTION:

**Dog Grooming  is a desktop application designed to manage the information of dogs and their owners in a dog grooming center. The app allows you to record and maintain relevant data about grooming services, including appointments, services performed, and details of owners and their pets.


## Functional Requirements

1. **Owner and Pet Registration**
   - Register owner information (name and cell phone number).
   - Register pet information (name, breed, color, allergies, special attention, observations).
   - Associate each pet with an owner.

2. **Data Management**
   - Modify owner and pet data.
   - Delete owner and pet records.
   - Retrieve specific information about pets and owners.

3. **Data Visualization**
   - Load and display data in a visual table in the user interface.
   - View service history provided to pets.

4. **Database Interaction**
   - Connect to a MySQL database to store and retrieve information.
   - Ensure data integrity and consistency during CRUD operations (Create, Read, Update, Delete).

5. **Validations**
   - Validate all input fields to ensure correct and complete information.
   - Provide appropriate error messages when information does not meet established requirements.

## Non-Functional Requirements

1. **Performance**
   - The system should respond to user requests in a reasonable time.
   - Data loading and database update operations should be performed efficiently.

2. **Usability**
   - The user interface should be intuitive and easy to use.
   - Navigation within the application should be clear and consistent.

3. **Security**
   - The system should protect sensitive user and pet information.
   - The database connection should be secure to prevent unauthorized access.

4. **Maintenance**
   - The code should be modular and well-documented to facilitate maintenance and future updates.
   - The application should follow coding standards to ensure its quality and maintainability.

5. **Compatibility**
   - The system should be compatible with JDK 21.
   - The system should be compatible with MySQL 8.0.33.
   - The application should run on multiple platforms and operating systems.

6. **Scalability**
   - The system should be scalable to handle an increase in the amount of data and users without compromising performance.



...



##Main Methods and Classes


Conection.java: Singleton class for managing database connections.

Owner.java: Class representing the owners of the pets.

Pet.java: Class representing the pets.

PetImplemented.java: Implementation of methods to register, delete, and modify information for pets and owners.

Props.java: Methods for loading data into a table in the interface.

Validation.java: Validation methods for form input fields.


##System Requirements

Java Development Kit (JDK) 21.

Apache NetBeans 21 or higher.

Database: MySQL 8.0.33.



## Main screen
	
![image](https://github.com/user-attachments/assets/05036f78-ac38-45ad-9be8-478700b23c18)


##System Features

##Registering Owners and Pets

1. Register an Owner and a Pet:

***Navigate to the registration section.

***Enter the details for the owner and the pet.

***Save the information.


![image](https://github.com/user-attachments/assets/bb60850f-2371-4193-8b72-45306a3de3c7)



2. View pet and owner records
![image](https://github.com/user-attachments/assets/33450a9f-c749-4741-b2e1-378dc9b0fc8f)

3. Elimination of records as well as that of the pets and their Owner.

![image](https://github.com/user-attachments/assets/741106ea-589b-4253-bc73-0a241ffdb761)

4. Edit pet and owner information
![image](https://github.com/user-attachments/assets/88bcfbf9-a67c-4fef-b074-37b8ce45d8db)

## Example of registration in the database
***Owner
![image](https://github.com/user-attachments/assets/b93c8904-ea37-4456-a5c2-2a6ac65aa0aa)

***Pet
![image](https://github.com/user-attachments/assets/9336a0e7-bf1d-459b-b6ea-a654ccd4a790)










