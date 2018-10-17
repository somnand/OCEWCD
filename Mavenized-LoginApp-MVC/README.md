# Mavenized-LoginApp

Sample program for practising the tests in OCEWCD. It contains the Security chapter programs.

## Environment setup.
In the tomcat server edit the file tomcat-users.xml to add roles and users.
```
<!-- List of all Roles in tomcat -->
	<role rolename="Admin"/>
	<role rolename="Member"/>
	<role rolename="Guest"/>
<!-- List of all user-role mappings -->	
	<user username="su" password="su" roles="Admin"/>
	<user username="member" password="member" roles="Admin,Member"/>
	<user username="guest" password="guest" roles="Admin,Member,Guest"/>
```
## Getting Started

Clone the project. 

*git clone https://github.com/somnand/OCEWCD.git*

Once the clone is complete then import the project in Eclipse and run it on a server.

### Prerequisites
```
1. jdk1.8
2. git
3. maven
```
## Running the tests

Currently there are no Unit tests.

### Break down into end to end tests

Tests will cover the overall functionality of the project.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management and Project Structuring

## Authors

* **Somsurya Nanda** - *Initial work* 



