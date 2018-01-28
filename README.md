[b3_java_diplome_polymorphism](https://spoonless.github.io/epsi-b3-java/polymorphisme.html#exercice)

## Diplôme et examens (suite)

### On souhaite faire évoluer le système de remise de diplôme du chapitre précédente.

 Pour les classes Examen, Qcm et Projet, on doit pouvoir ajouter une appréciation.

* Pour Examen, l’appréciation peut être positionnée par une méthode.

* Pour Qcm, l’appréciation est déterminée en fonction de la note :

   - =< 8 : insuffisant
   - entre 8 et 12 : passable
   - entre 12 et 15 : bien
   -  => 16 : très bien

* Pour Projet, il doit y avoir une appréciation pour l’oral et une appréciation pour l’écrit, 
   chacune positionnée par une méthode.

* Modifiez le système existant pour prendre en compte ces modifications.

* Ajoutez la méthode afficherDetailDesNotes dans la classe Diplome pour afficher la liste des notes et l’appréciation. 

* On utilisera le polymorphisme pour réaliser cette nouvelle fonctionnalité.
