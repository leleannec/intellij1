
Exercice : débogage d'un test unitaire

- ajouter un point d'arrêt sur calculComplexe()
- lancer le test unitaire CalculComplexeTest en mode debug
- le programme s'arrête sur calculComplexe()
- step into (F7) : pour rentrer dans la méthode appelée "methodCreeDesListes"
- étudier le contenu des variables

Point d'arrêt simple

- ajouter un point d'arrêt sur 
  System.out.println("i="+i+" j="+j); dans la méthode methodFaitDesCalculsModulo
- F9 : pour continuer l'exécution jusqu'au point d'arrêt
- Constater les valeurs de i et j présentées à l'écran par IntelliJ

Point d'arrêt conditionnel

- Mettre un point d'arrêt conditionnel "i%3==0" sur la ligne "for (int i=1; i<=4_000_000; i++) {"
- relancer le test
- L'application doit s'arrêter sur i=3
- Appuyer sur F9 pour reprendre
- L'application doit s'arrêter sur i=6, etc.
- Evaluer l'expression i*j (ALT+F8 : dans une popup)

Hot swap

- Enlever les points d'arrêt et couper l'application si elle est démarrée
- Edit configuration > Modify options > On update action > hot swap classes and update triggers file if failed
- Démarrer l'application en mode debug
- Dans l'application Web, créer une commande "normale" (qté = 77)
- Dans OrderServiceImpl, modifier la ligne :         order.setDateCreated(LocalDate.now());
- remplacer par :             order.setDateCreated(LocalDate.now().plusYears(1));
- Rebuilder le fichier -> la mention "hot swap" apparait furtivement dans la barre de progression en bas, ne pas redémarrer l'application
- La modification a été prise à chaud, vérification :
- Dans l'application Web, créer une seconde commande (qté = 78 par exemple)
- Vérifier en base de données la différence d'un an sur la date (table "orders")

Rappel, indiquer quand vous avez fini l'exercice :)

Pour aller plus loin :
https://www.jetbrains.com/help/idea/examining-suspended-program.html#find-execution-point
