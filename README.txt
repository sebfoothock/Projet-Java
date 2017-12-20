PROJET ROULETTE CASINO READ ME
_________________________________________________________________________________________
_________________________________________________________________________________________
GROUPE	
	Groupe 			17
	MASSON JULIEN 		2TL2
	RAEMDONCK SEBASTIEN 	2TL2
	LAMBERT MAXIMILIEN 	2TL2


________________________________________________________________________________________
________________________________________________________________________________________
CAHIER DES CHARGES / DESCRIPTIF

	Notre idée de base pour notre projet était de faire une simple interface de jeu 
	de roulette avec plusieurs case qui renvoyer un nombre dans un Array pour le 
	comparé à un nombre random et enfin dire si le joueur avait gagné ou non. 
	Après avoir reproduit un plateau de jeu de roulette avec toutes les sortes de 
	paris possible nous avons décidé d’ajouter des compteurs qui indiquait, en 
	plus du total que le joueur avait, l’argent total qu’il avait gagné/perdu, 
	le nombre partie gagné et perdue et enfin la balance de gain/perte. Après avoir 
	finit l’espace GUI nous avons décidé d’implémenter une DBA, puisque c’était 
	demandé  dans la fiche d’évaluation, en ajouter un simple joueur de tel sorte 
	que si l’utilisateur fermait sa fenêtre de jeu, lorsqu’il réouvrait l’application 
	il récupérait sa partie. Lors de la démonstration console avec Monsieur Dewulf 
	nous lui avons présenter également la vue GUI qui était déjà terminé. Il nous a 
	alors émis l’idée d’ajouter un écran de connexion, ce que nous avons alors 
	implémenter en faisant une récupération dans la base de donnée à condition que 
	le username et le password était correct. Après réflexion nous trouvions que 
	l’idée d’un écran de connexion sans possibilités de création de compte était 
	futile, nous avons donc rajouter un écran de création de compte qui était 
	également lié à la base de données.

________________________________________________________________________________________
________________________________________________________________________________________
MODE D'EMPLOI POUR UTILISATION.

	LOGICIEL NECESSAIRE : 
		- MySQL WorkBench
		- Eclipse
	
	A EFFECTUER AU PREALABLE :
		Dans MySQL WorkBench la mettre en localhost et crée un utilisateur avec 
		comme login : root & password : root.
		Ensuite injecter en query cette requête :
			"CREATE TABLE wheel(
   				id INT PRIMARY KEY AUTOINCREMENT,
    				player varchar(45) null,
				total int(11) null,
				totalWin int(11) null,
				totalLoose int(11) null,
				nbWon int(11) null,
				nbLost int(11) null,
				WL int(11) null,
				pwd varchar(255) null
				)
			"
		Et enfin après avoir fait ceci, lancé la class test qui est le main du 
		programme. Avant de pouvoir jouer il vous faut évidemment crée un compte 
		en cliquant sur "create account", quand celui ci est fait revenir dans 
		Home, connecter vous et vous pouvez jouer.

________________________________________________________________________________________
________________________________________________________________________________________
POINTEUR 
	
	Projet final : 
		https://github.com/sebfoothock/Projet-Java/tree/master/ProjetRouletteV2%20FINAL
	
	Projet intermédiaires :
		https://github.com/sebfoothock/Projet-Java