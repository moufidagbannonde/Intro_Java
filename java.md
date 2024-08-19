# Intro Java 
   Java a été créé par `James Gosling` en juin 1991 , l'équipe verte composée de `James Gosling`, `Mike Sheridan` et `Patrick Naughton` a contribué au dévéloppement du projet !

* ## Objectif principal
Créer un langage de programmation orientée objet qui pourrait implémenter une machine virtuelle et serait plus simple et plus universelle que `C/C++` mais aurait une syntaxe similaire à celles-ci pour rendre facile à apprendre

### Pourquoi l'utiliser ?

* Fonctionne sur différentes plateformes (`Windows`, `Mac`, `Linux`, etc),
* Populaire au monde,
* Open source et gratuit,
* Sécurisé , rapide et puissant,
* Enorme soutien communautaire
* Structure claire aux programmes 
* Réutilisation du code 

 `Java Runtime Environment` en abrégé `JRE` est un environnement d'exécution nécessaire pour les applications Java 

 `Java Virtual Machine` en abrégé `JVM` 

 `Java Development Kit ` en abrégé `JDK` utilisé pour le dévéloppement ,comprend le JRE et les outils de dévéloppement 

* ## Code Java

   * création du fichier Main.class en tapant la commande javac Main.java
  * compilation avec la commande java Main 
  
  ## Variables
* Types de variables
   * variables primitives (
  ````php
  int 
  float
  char // uniquement des simples quotes
  boolean
  String // définir uniquement avec les doubles quotes
  double  
  ````
  )
   * variables non primitives (

Array  , Objects , Classes
  )
* Pour définir une variable en java 
```php
  type variable_name ;

  typeofvariable variable_name = value ;

  ```
   exemple 
  ````php
  int nbr = 15;
  double x = 25.3;
  char y = 'm';
  boolean isBoy = true;
  String msg = "I'm a student at Highfive University !"
  ````
 * utilisation du camelCase
 * éviter l'utilisation des noms trop courts ou trop longs
  
### Variables primitives 
```java
* byte => 1 octet => 8bits => (stocke des nombres entiers de -128 à 127)
 * short =>2 octets => 16bits => -32 768 à 32 767 
 * int => 4 octets / bytes => 32bits => -2 147 483 648 à 2 147 483 647. 
 * long =>8 octets => 64 bits => -9 223 372 036 854 775 808 à 9 223 372 036
 * float => 4 octets / bytes => 32bits => 6 à 7 chiffres décimaux 
 * double => 8 octets / bytes =>64bits => 15 chiffres décimaux booléens=> 1octet => 1bit => vrai ou faux
* char => 2octets / bytes => 16bit => stocke les caractères ou les valeurs ascii

1 octet équivalent à 8 bits ou 8 digits

```
NB: Le `bit` est la plus petite unité de mesure électronique !

### Différences entre les variables primitives et non primitives

  * type primitif prédéfini en java, non primitif créé par le programmeur 
  * non primitif peut être utilisé pour appeler des méthodes , primitif non
  * primitif a toujours une valeur , non primitif peut-être nul
  * primitif commence par minuscule , non primitifs par une lettre majuscule
  

## POO Java

### Constructeur : 
utilisé pour initialiser les attributs d'un objet au moment de la création
* Les accesseurs `get` permettent de lire les valeurs des variables 
* Les modificateurs `set` pour modifier leurs valeurs 