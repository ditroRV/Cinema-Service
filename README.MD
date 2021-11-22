# Cinema Service
### About project
This project is the server side of the cinema site, which allows you to add cinema halls, movies, movie sessions,
users, shopping carts and assign it to users. There are two type of users in application: common user and administrator.
Common user allowed to authenticate, view available movie sessions, add tickets to cart and make an order.
#### Endpoints available for common user:
<li>GET: /orders - user</li>
<li>POST: /orders/complete - user</li>
<li>POST: /shopping-carts/movie-sessions - user</li>
<li>GET: /shopping-carts/by-user - user</li>

The administrator is able to add films, create movie shows, and register new cinemas.
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
<ol>
<li>Clone the repository on GitHub</li>
<li>Configure Tomcat</li>
<li> Configure your database properties in ``main/resources/db.properties.`` </li>
<li> Run application</li>
</ol>