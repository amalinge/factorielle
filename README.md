# Factorielle

Base de code propice à l'écriture de tests unitaires

[Cf. définition Wikipédia pour appréhender le fonctionnel](https://fr.wikipedia.org/wiki/Factorielle)

## Contenu de l'exercice

- Etape 1 : forker le dépôt, cloner en local, importer dans l'environnemment de développement
- Etape 2 : ajout JUnit au projet
- Etpae 3 : initialiser une classe de Test
- Etape 4 : écrire une méthode de test pour vérifier le comportement pour la valeur 1. Exécuter le test
- Bonus étape 3 : mettre en place un build Travis et intégrer l'indicateur de build de la branche courante dans le Readme.
- Etape 5 : compléter la classe de test avec au moins deux autres scénarios pertinents (se concenter sur l'intervalle 0 .. 19). En cas de détection de bug, corriger le code afin que les tests soient passants
- Etape 6 :
  - utiliser les annotations JUnit pour :
    - désactiver un test sans le mettre en commentaire ou lui retirer l'annotation @Test
    - écrire une méthode d'initialisation de la variable f / factorielle commune à tous les tests
  - utiliser la variante de *assertEquals* prenant 3 paramètres
  - remplacer un *assertEquals* par un *assertTrue* en adaptant le code et en constatant la différence quand le test est KO
- Etape 7 : étudier l'attribut *expected* de l'annotation @Test pour écrire un scénario de test pour la valeur -1
- Etape 8 : étudier l'attribut *timeout* de l'annotation @Test pour écrire un scénario de test permettant de valider que l'enchaînement de 100 appels de la méthode *calculer* avec le paramètre 18 ne prend pas plus d'1 ms
- Etape 9 : exécuter les commandes suivantes et observer le contenu du répertoire *target* :
  - mvn clean
  - mvn test
  - mvn surefire-report:report
