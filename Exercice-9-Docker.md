Exercice 9.1 :

Créer un container Mysql et s'y connecter

- Ouvrir la vue Services
- Connecter docker
- Visualiser les containers / images / networks / volumes
- Importer une image Docker : mysql:latest
- Créer un container à partir de l'image mysql:latest
  - Nom de container : MySqlFormationContainer
- Configuration du container :
  - Variables d'environnement
    - MYSQL_ROOT_PASSWORD : password
    - MYSQL_DATABASE : formation
  - Port binding
    - 3306:3306 tcp
- Démarrer le container
- Visualiser ses logs
- Consulter le dashboard (tableau de bord)
- Visualiser les fichiers du container (Files) (opération faisable à la souris, sans taper de commande)
- Exécuter la commande : mysql -uroot -ppassword
- Une fois dans le terminal Mysql, taper une commande, exemple : select 1+1;

---

Exercice 9.2 : exploiter un dockerfile

- Ouvrir le fichier dockerfile
- Créer une image à partir du dockerfile
- Visualiser l'apparition de l'image dans la vue Services > Docker > Images
- Créer un container basé sur cette image
- Visualiser les logs du container
- Consulter le dashboard (tableau de bord)
- Visualiser les fichiers du container (Files)

---

Exercice 9.3 : exploiter un docker-compose.yml

- Ouvrir le fichier docker-compose.yml
- Relire le fichier pour bien voir l'architecture
- Cliquer sur le double triangle vert pour démarrer les services
- Visualiser les logs des 2 containers
- Ouvrir localhost:8081 dans un navigateur
- Ajouter un produit avec une quantité 123 dans le panier + checkout + Pay
- Créer une connexion à la bdd formation du container docker (disponible sur le port 5433)
- Constater le produit ajouté dans la table order_product (quantity = 123)
