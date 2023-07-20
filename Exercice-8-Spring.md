
Exercice :

- Ouvrir l'interface ProductRepository
- Ajouter la méthode findAllByNameContainingIgnoreCaseAndPriceGreaterThanEqual en tapant caractère par caractère
  pour voir les propositions d'IntelliJ pour compléter le nom de la méthode

- Créer un fichier application-local.yml (à côté de application.yml)

      spring:
        jpa:
          show-sql: false

- Relancer l'application en positionnant le profil à "local"
- Le log de Spring doit contenir : The following 1 profile is active: "local"
- Constater que les traces de sql ont disparu dans la console
- Positionner show-sql à true
- Relancer l'application
- Constater que les traces de sql sont de nouveau présentes

Vue Actuator

- Ouvrir la vue actuator (dans l'onglet run ou debug)
- Parcourir onglet beans
- Parcourir onglet Health
- Parcourir onglet Mappings
  - Générer une requête dans Http client pour interroger les produits

Modification d'un paramètre de JVM

- Edit configuration...
- Sélectionner EcommerceApplication
- Ajouter une option VM
- Renseigner -Xmx10m  (le paramètre -Xmx est utilisé pour spécifier la quantité de mémoire maximum que peut utiliser la heap lors de l'exécution de la machine)
- Relancer l'application
- Constater un crash ! (manque de ram) -> java.lang.OutOfMemoryError: Java heap space
- Position -Xmx1024m
- Relancer l'application


En fin d'exercice, nettoyage de votre code source :

- Git > rollback
- Suppression des fichiers non versionnés (apparaissent en rouge)

Rappel, indiquer quand vous avez fini l'exercice :)


Pour aller plus loin :
https://www.jetbrains.com/help/idea/profiler-intro.html?q=spring&s=full
