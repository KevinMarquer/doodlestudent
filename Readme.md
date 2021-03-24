# Kévin MARQUER
# Projet TLC


Ce projet consiste en la réalisation d'un déploiement d'une application sur une machine virtuelle.

On part sur la création de la machine virtuelle comme indiqué.

Tout d'abord, on part sur la création du docker-compose.yml.
Il est composé de 4 services:
    - Le front
    - Le back
    - La base de donnée bdd
    - L'etherpad

Les configurations à faire pour les services sont indiqué sur les premières étapes du projet.

Ensuite, j'essaie de tester en local le lancement de l'application par docker-compose.
Avant cela, on n'oublit pas d'ajouter les valeurs utilisé dans docker-compose dans application.yml

Et pour finir dans api.conf de mettre le nom de l'host kmarquer.diverse-team.fr et de réalisé :
```
sudo nano -w /ect/hosts
```
Afin d'ajouter kmarquer.diverse-team.fr dedans.

Ensuite On commence par build le dockerfile (on utilise Dockerfile.jmv les autres étant trop lourd)

Puis on fait sudo docker-compose up

Le lancement de l'appli se fait sur chrome en navigation privée.
Le lancement de l'application en "local" marche, mais il y a un problème qui empèche l'ouverture de la troisième page de l'application.
Il doit y avoir un oublit de ma part dans le docker-compose.
Maleureusement, j'ai perdu du temps à chercher le problème et entre les autres projets et l'alterance, le projet à ralentie.

Par concéquent, j'ai du continuer avec ce défaut.

Concernant l'implémentation du projet sur la machine virtuelle.
Le déployement ce fait plus simple que je ne le pensait.
J'ai un git clone du projet.

Mais voilà lors du test, il y a eu blocage
premièrement il n'y a pas docker-compose dans la machine virtuelle
(ce qui n'aurai pas été un problème en faisant un apt-get)

MAIS je ne peut réalisé un sudo sur la machine virtuelle.
(voir dans le dossier image)

Est-ce-que j'ai fait une mauvaise manipulation, ai-je oublier de demandé des droits.
Je reconnais être revenue sur la machine virtuelle 2 mois plus tard et et ne l'avoir quasi jamais utilisé.
Donc malheureusement je ne peut poursuivre à cause de ce bloquage.
