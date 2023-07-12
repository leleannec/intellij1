
Exercice :

Lancer une commande maven

- Stopper le projet s'il est démarré
- Exécuter la commance maven install à la souris en double-cliquant sur la cible "install" 
- Exécuter la commande maven clean dans un terminal (ALT+F12) : `mvn clean`
  - Vérifier le build ok du projet 
- Exécuter un "mvn clean install" en utilisant le bouton "execute maven goal"  (constater l'autocomplétion proposée)

Gérer les dépendances

- cliquer sur "Analyze dependencies"
- rechercher "hibernate-commons-annotations"
- ouvrir la classe org.assertj.core.api.Assert
- décompiler la classe directement depuis IntelliJ
- cliquer sur le bouton dans la fenêtre Maven pour télécharger le code source et la documentation
- ouvrir la classe org.springframework.util.StringUtils
- constater que le code source apparait directement sans devoir cliquer sur le bouton "download sources"
- ouvrir le fichier pom.xml
- étudier les warnings signalés par IntelliJ
- ajouter la dépenance commons-io

         <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version></version>
        </dependency>

- appuyer sur CTRL+SPACE pour compléter la version

- afficher diagramme "show diagram" pour afficher les dépendances du projet
  - tester les différentes options de présentation
