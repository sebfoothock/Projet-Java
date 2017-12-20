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

	Notre id�e de base pour notre projet �tait de faire une simple interface de jeu 
	de roulette avec plusieurs case qui renvoyer un nombre dans un Array pour le 
	compar� � un nombre random et enfin dire si le joueur avait gagn� ou non. 
	Apr�s avoir reproduit un plateau de jeu de roulette avec toutes les sortes de 
	paris possible nous avons d�cid� d�ajouter des compteurs qui indiquait, en 
	plus du total que le joueur avait, l�argent total qu�il avait gagn�/perdu, 
	le nombre partie gagn� et perdue et enfin la balance de gain/perte. Apr�s avoir 
	finit l�espace GUI nous avons d�cid� d�impl�menter une DBA, puisque c��tait 
	demand�  dans la fiche d��valuation, en ajouter un simple joueur de tel sorte 
	que si l�utilisateur fermait sa fen�tre de jeu, lorsqu�il r�ouvrait l�application 
	il r�cup�rait sa partie. Lors de la d�monstration console avec Monsieur Dewulf 
	nous lui avons pr�senter �galement la vue GUI qui �tait d�j� termin�. Il nous a 
	alors �mis l�id�e d�ajouter un �cran de connexion, ce que nous avons alors 
	impl�menter en faisant une r�cup�ration dans la base de donn�e � condition que 
	le username et le password �tait correct. Apr�s r�flexion nous trouvions que 
	l�id�e d�un �cran de connexion sans possibilit�s de cr�ation de compte �tait 
	futile, nous avons donc rajouter un �cran de cr�ation de compte qui �tait 
	�galement li� � la base de donn�es.

________________________________________________________________________________________
________________________________________________________________________________________
MODE D'EMPLOI POUR UTILISATION.

	LOGICIEL NECESSAIRE : 
		- MySQL WorkBench
		- Eclipse
	
	A EFFECTUER AU PREALABLE :
		Dans MySQL WorkBench la mettre en localhost et cr�e un utilisateur avec 
		comme login : root & password : root.
		Ensuite injecter en query cette requ�te :
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
		Et enfin apr�s avoir fait ceci, lanc� la class test qui est le main du 
		programme. Avant de pouvoir jouer il vous faut �videmment cr�e un compte 
		en cliquant sur "create account", quand celui ci est fait revenir dans 
		Home, connecter vous et vous pouvez jouer.

________________________________________________________________________________________
________________________________________________________________________________________
POINTEUR 
	
	Projet final : 
		https://github.com/sebfoothock/Projet-Java/tree/master/ProjetRouletteV2%20FINAL
	
	Projet interm�diaires :
		https://github.com/sebfoothock/Projet-Java