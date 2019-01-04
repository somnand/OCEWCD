# TestProject(migrated from Mavenized-LoginApp-MVC) 

Sample project for practising the tests in OCEWCD. 
**Follow development branch for this project.**
**Follow security branch for all Secured Constraint related stuff**

Java classes located in /src/main/java (general naming convention)
Project Resource located in /src/main/resources (currently empty)
Web Application resources located in /src/main/webapps (general naming convention)

## Environment setup.
In the tomcat server edit the file tomcat-users.xml to add roles and users.
```
<!-- List of all Roles in tomcat -->
	<role rolename="Admin"/>
	<role rolename="Member"/>
	<role rolename="Guest"/>
<!-- List of all user-role mappings -->	
	<user username="su" password="su" roles="Admin,Member,Guest"/>
	<user username="member" password="member" roles="Admin,Member"/>
	<user username="guest" password="guest" roles="Guest"/>
```
For testing out security related resources please call them over an incognito window. 
Always close the browser window after a single request as the credentials are catched in the browser.
**NO NEED to re-deploy the Application until unless there are changes to web.xml** 

## Getting Started

Clone the project. 

*git clone https://github.com/somnand/OCEWCD.git*

Once the clone is complete then import the TestaProject in Eclipse as an Existing Maven project.
Setup the Runtime by navigating to the ProjectFacets.
Facets should be 
* WebDeploymentModule 2.3 or 2.5
* Java 1.7 or newer
* Javascript 1.0

### Prerequisites
```
1. jdk1.7(or newer)
2. git
3. maven (this is only for the project structure and not for build)
4. eclipse
```
## Running the tests

Currently there are no Unit tests.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management and Project Structuring

## Authors

* **Somsurya Nanda** - *Initial work* 



