
Exercice :

- Ajouter le support Kotlin au projet
- Constater que le pom.xml a été modifié (ajout de dépendances)
- Créer un répertoire kotlin dans src/main
- Le déclarer comme source (bouton droit -> Mark directory as -> Sources Root)

- Créer un fichier HelloWorld.kt avec comme contenu (pas besoin de classe ici) :

      import com.baeldung.ecommerce.model.Order

      fun main(args: Array<String>) {
          println("Hello World!")
          val order = Order()
          order.status = "EN_COURS"
          println("order = $order")
      }

- Optionnel
  - générer une méthode toString dans Order avec les propriétés id, status, dateCreated
  - relancer le programme 


- Transformer la classe ProductController.java en Kotlin (extension automatique : .kt)
- Corriger les éventuels problèmes de compilation
- Relancer le programme en mode debug
- Mettre un point d'arrêt sur la ligne get() = productService.allProducts
- F5 dans le navigateur, constater que le point d'arrêt est atteint
- Evaluer l'expression productService.allProducts (ALT+F8)


En fin d'exercice, nettoyage de votre code source :

- Git > rollback
- Suppression des fichiers non versionnés (apparaissent en rouge)
