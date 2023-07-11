
Exercice sur la partie base de données:

- Modifier le prix du TV Set de 300 à 310$
  - sans taper de SQL dans un premier temps (double-cliquer sur le nom de la table)
  - constater le changement sur l'application Web (localhost:8080)
- ouvrir le DDL de la table product
- modifier le type de la colonne product.name en varchar (au lieu de varchar(255))
- clic bouton droit sur la table order_product > show diagram popup
- créer une vue v_product_expensive des produits dont le prix est supérieur à 100$
- ouvrir le contenu de la vue pour vérifier que cela a fonctionné
- ouvrir une console: bouton "jump to query console"
  - New query console
  - faire marcher la requête "select * from product;"  (sans préfixer par formation. la table product)
  - Modifier le prix d'un TV Set à 320$
  - Vérifier la bonne prise en compte par une requête SQL dans une console
  - Faites un export excel (xlsx)
  - Faites un export SQL de la table orders (inserts)
- Utiliser le "SQL Generator" pour générer le DDL complet

Bonus si temps dispo :
- positionner la table orders en orange
- rechercher "find usages" sur la table product pour voir qui utilise la table (on doit retrouver notamment la vue)
- explorer les différents menus disponibles
- renommer la tables product en product2 (puis de nouveau en "product")
  - utiliser SHIFT+F6
  - étudier les propositions d'IntelliJ (au final, choisir de ne modifier que la table elle-même sans toucher au code)

----


### Relevant Articles:

- [Building a Web Application with Spring Boot and Angular](https://www.baeldung.com/spring-boot-angular-web)
- [A Simple E-Commerce Implementation with Spring](https://www.baeldung.com/spring-angular-ecommerce)
