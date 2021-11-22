# Cinema Service
### About project
This project is the server side of the cinema site, which allows you to add cinema halls, movies, movie sessions,
users, shopping carts and assign it to users. There are two type of users in application: common user and administrator.

#### Common user allowed authenticating, view available movie sessions, add tickets to cart and make an order.
<li>GET: /orders - user</li>
<li>POST: /orders/complete - user</li>
<li>POST: /shopping-carts/movie-sessions - user</li>
<li>GET: /shopping-carts/by-user - user</li>


#### The administrator is able to add films, create movie shows, and register new cinemas.
<li>POST: /movie-sessions - admin</li>
<li>PUT: /movie-sessions/{id} - admin</li>
<li>DELETE: /movie-sessions/{id} - admin</li>
<li>GET: /users/by-email - admin</li>
<li>POST: /movies - admin</li>

### Technologies Used
<li>Java 11</li>
<li>Spring</li>
<li>Hibernate</li>
<li>MySQL</li>
<li>Tomcat</li>
<li>Maven</li>

### How to run the app
Firstly you need to install following programs
<ul>
<li><a href="https://www.jetbrains.com/idea/"> IntelliJ IDEA</a></li>
<li><a href="https://dev.mysql.com/downloads/installer/">MySQL</a></li>
<li><a href="https://tomcat.apache.org/download-90.cgi">Tomcat</a></li>
</ul>
<ol>
<li>Clone the repository on GitHub</li>
<li>Configure TomCat Local Server (Add New Configuration -> TomCat Server -> Local -> Fix -> cinema:war exploded -> set Application context to "/" -> OK).</li>
<li> Configure your database properties in ``main/resources/db.properties.`` </li>
<li> Run application. You can login as administrator or as common user using two preregistered profiles. </br>
"admin@com.ua" - email for administrator profile </br>
"user@com.ua" - for common user. </br>
Both profiles password are "pass1234"</li> </br>
</ol>