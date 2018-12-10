# SUJET MAISON TEST JAVA


une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.

partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ] 
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ] 
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ] 

## Getting Started
mvn clean install
java -jar demo-0.0.1-SNAPSHOT.jar 1 2 3 4 5 2