
Exercice :

Debugguer l'application Angular

- Ouvrir package.json
- Démarrer le script start (triangle vert)
- Chercher la méthode pay()
  - exemple : SHIFT+SHIFT > symbols > pay 
- Mettre un point d'arrêt sur la méthode pay()
- SHIFT+CTRL sur le lien proposé http://localhost:4200/ 
- Acheter un produit, aller jusqu'au bouton "Pay"
- Le point d'arrêt se déclenche
- Evaluer la propriété "this.orders"
- Evaluer la propriété "this.orders.productOrders[0].product.price" (IntelliJ propose l'autocomplétion)
- Faire du pas à pas :
  - Utiliser le "step into" pour rentrer dans la méthode saveOrder
- Dans la console, taper : this.ordersUrl  (cela doit renvoyer "/api/orders")

Créer un composant Angular, dans le répertoire ecommerce : Boutique


En fin d'exercice, nettoyage de votre code source :

- Git > rollback
- Suppression des fichiers non versionnés (apparaissent en rouge)

Rappel, indiquer quand vous avez fini l'exercice :)



Pour aller plus loin :

https://www.jetbrains.com/help/idea/profiler-intro.html?q=angular&s=full
