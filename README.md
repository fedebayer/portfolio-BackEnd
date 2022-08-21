# portfolio Backend

![GitHub top language](https://img.shields.io/github/languages/top/FedeBayer/portfolio-BackEnd?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/FedeBayer/portfolio-BackEnd?style=for-the-badge)
![GitHub issues](https://img.shields.io/github/issues/FedeBayer/portfolio-BackEnd?style=for-the-badge)
![GitHub pull requests](https://img.shields.io/github/issues-pr/FedeBayer/portfolio-BackEnd?style=for-the-badge)


<a name="readme-top"></a>
<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/FedeBayer/portfolio-FrontEnd">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJikTaUj3vhsIs4XjTid7qQocT8C5AHePntQ&usqp=CAU" alt="Logo" width="100" height="100">
  </a>
  <h3 align="center">Portfolio</h3>
  <p align="center">
    <br />
    <a href="https://github.com/FedeBayer/portfolio-BackEnd/wiki"><strong>Explore the wiki »</strong></a>
    <br />
    <br />
    <a href="https://porfolio-fb.web.app/">View Live Page</a>
    ·
    <a href="https://github.com/FedeBayer/portfolio-FrontEnd/issues">Report Bug</a>
    ·
    <a href="https://github.com/FedeBayer/portfolio-FrontEnd/issues">Request Feature</a>
    .
    <a href="https://fedebayer.github.io/portfolio-FrontEnd/">View Demo</a>
  </p>
</div>

## Introduction

This project is about a **full-stack web**, in this case a web portfolio.

Here is the deployed web: <a href="https://porfolio-fb.web.app/">https://porfolio-fb.web.app/</a>

This part focus on the backend of the page (**Database and API**).

Here is more info about the [frontend](https://github.com/FedeBayer/portfolio-FrontEnd)

<div align="center">
  <img src="https://bs-uploads.toptal.io/blackfish-uploads/components/seo/content/og_image_file/og_image/952696/0811_SpringBatchTutorial_Dan_Social-5204ab72ae8a53de53c879ec851fd76e.png" width="50%"></img>
</div>

### Description

The web portfolio shows personal data like education and skills, is made with a distributed architecture, and contains a
user interface design (front end) that displays the information, a database that stores the previously said data, and an API to provide the information through the internet (back end). In the wiki there is diagrams of UML and ERR.

### Built With

* Java
* Hibernate
* Maven
* JPA
* JWT

<h4>Frameworks/Libraries</h4>

* [![SpringBoot][SpringBoot-badge]][SpringBoot-url] 
* SpringBoot

<p align="right">(<a href="#readme-top">back to top</a>)</p>


## DataBase

Technologies used: MySql Workbench, XAMPP and PhpMyAdmin.
There is the ERR Diagram too(`DataBase/EER.Diagram.png`).

To import the database use the `portfolio.sql` file in DataBase folder.

## API REST

Technologies used: Spring Boot, JPA, Hibernate, Java.

Implemented with **MVC** design pattern.

examples of endpoints

```js
url: `http://localhost:8080`
getPersonList: `http://localhost:8080/persons/all` 
```

It was used Swagger for the API documentation, here is the link:
```js
`http://localhost:8080/swagger-ui/index.html` 
```
or use 
```js
`yourUrl/swagger-ui/index.html`
```


### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/FedeBayer/portfolio-BackEnd.git
   ```
2. Install Maven dependencies
   ```sh
   mvn install
   ```
3. Configure (or keep the default config) `application.properties` in `src/main/resources/`

```properties
spring.datasource.url=jdbc:mysql://<<DB_host>>:<<DB_port>>/<<DB_name>>?useSSL=false&serverTimezone=UTC
spring.datasource.username=<<user>>
spring.datasource.password=<<password>>

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

jwt.secret=<<key_code_JWT>>
jwt.expiration=<<expiration_time_JWT>>
```
            NOTE: Replace the values inside the <<>> and delete these signs after.

4. Run the DB ports (with XAMPP for example)

5. Execute application in `PortfolioApplication.Java` or execute command:
    `mvn sprin-boot:run`
    
6. To insert the roles in the DB, you can uncomment the class in `src/main/java/com/portfolio/fb/util/CreateRoles.java` and run the app (commment the class again after running 1 time), or insert them manually.
    
<p align="right">(<a href="#readme-top">back to top</a>)</p>


## Login / Authentication

The authentication is via JSON Web Token(JWT) with the access token and the refresh token. When the access token expires, it will call the function to refresh.
Each user has roles, these are User and Admin.

* Anyone can see the lists of data.
* To transform the data (insert/update/delete) you need to log in as an **admin**.
* use `/login` to log in.



<!-- CONTACT -->
## Contact

[https://www.linkedin.com/in/federicobayerque/](https://www.linkedin.com/in/federicobayerque/)  - federicobayerque@gmail.com

Project Link: [https://github.com/FedeBayer/portfolio-BackEnd](https://github.com/FedeBayer/portfolio-BackEnd)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
* [SpringBoot](https://spring.io/projects/spring-boot)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[SpringBoot-badge]:https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white
[SpringBoot-url]: https://spring.io/projects/spring-boot
