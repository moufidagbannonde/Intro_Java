# *Intro Java*
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
  ````java
  int 
  float
  char // uniquement des simples quotes
  boolean
  double  
  ````
  )
   * variables non primitives (

  `String` // définir uniquement avec les doubles quotes
 
Array  , Objects , Classes
  )
* Pour définir une variable en java 
```java
  type variable_name ;

  typeofvariable variable_name = value ;

  ```
   exemple 
  ````java
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
  

  ## Convertion de type ou Type Casting

  * Widening Casting : conversion d'un type plus petit vers un type plus grand
  
  exemple : 
  ````java
  int variable = 152;
  double variable1 = variable; // widening

  System.out.println(variable); // 152
  System.out.println(variable1); // 152.0
  ````
  * Narrowing Casting : conversion d'un type plus grand vers un type plus petit 

exemple :
````java
  double variable = 9;
  int mydouble = (double) variable; // narrowing

  System.out.println(variable); // 9
  System.out.println(mydouble); // 9.0
````
## Opérateurs Java
  * Opérateurs de logique
  * Opérateurs d'affectation

## Structures de controle
  * if...else
  * if....else if....else
  * switch

## Boucles en Java
* `while` : exécute une action lorsqu'une condition est vérifiée 
  
  exemple
  ````java
  int i = 0;
  while(i < 15){
    System.out.println("Yo les gars");
  }
  ````
* `for` : comprend trois parties
   * initialisation
   * expression booléenne
   * instruction d'incrémentation ou de décrémentation

exemple 
````java
for (int i = 0; i <= 20; i++){
  System.out.println(i);
}
````
* `do while` : exécute une fois d'abord avant de vérifier la condition
  
  exemple
  ```java
  public static void main(String[] args){
    byte i = 0;
  do {
    System.out.println("Bonjour");
    i ++
  } while(i < 5);
  }



* `foreach` : encore appelée boucle améliorée permet de parcourir directement chaque élément d'une liste d'éléments
  
  exemple 
  ````java
  for(String s : myArray){
    // code à exécuter ici
  }
  ````
  * `break` : utilisé pour quitter ou interrompre une boucle 
````java
 for (int i = 0; i < 10; i++) {
  System.out.println(i);
  if (i == 4) {
    break;
  }
}
 ````

  * `continue` : utilisé pour sauter une itération ! L'itération de la boucle en cours s'arrête et l'itération suivante commence 
````java
int[] numbers = {1, 2, 3, 4, 5};
    
for (int i = 0; i < numbers.length; i++) {
  if (numbers[i] % 2 == 0) {
    continue;
  }
  System.out.println(numbers[i]);
}
````
## Arrays
  *Basics*
  * Pour déclarer un tableau en Java , on utilise la syntaxe suivante : `T[] name_of_array` avec `T` le type de données que le tableau doit contenir
  * Pour connaître la longueur d'un tableau en Java 

````java
int[] tableau = {1, 2, 3}
````

*Arrays-Methods*
  * `T` : type
      *  `newLength` : nouvelle longueru
 **`Arrays.copyOf()`** : créer une copie d'un tableau avec une longueur spécifiée 
  `T[] Arrays.copyOf(T[] original , int newLength);`
  ````java
  int [] original = {1, 2, 3};
  T[] = Arrays.copyOf(original, 5)
  ````
  **`Array.copyOfRange()`** : copie une partie d'un tableau `T[] Arrays.copyOfRange(T[] original, int from, int to);`
   ````java
  int[] original = {1, 2, 3, 4, 5};
  int[] part = Arrays.copyOfRange(original, 1, 4); // {2, 3, 4}
   ````
   
   **`Arrays.sort()`**  : trie les éléments d'un tableau dans l'ordre naturel `void Arrays.sort(T[] array);`
 ````java
 int[] numbers = {3, 1, 4, 1, 5};
  Arrays.sort(numbers); // {1, 1, 3, 4, 5}
````
 **`Arrays.binarySearch()`** : recherche une valeur dans un tableau trié et retourne son index `int Arrays.binarySearch(T[] array, T key);`

````java
  int[] numbers = {1, 2, 3, 4, 5};
  int index = Arrays.binarySearch(numbers, 3); // 2
````
  **`Arrays.fill`** : remplit toutes les positions d'un tableau avec une valeur spécifiée `void Arrays.fill(T[] array, T value);`

````java
  int[] numbers = new int[5];
  Arrays.fill(numbers, 7); // {7, 7,  7, 7, 7}
````
**`Arrays.equals()`** : compare deux tableaux pour vérifier s'ils sont égaux `boolean Arrays.equals(T[] a, T[] b)`

  ````java
  int[] a = {1, 2, 3};
  int[] b = {1, 2, 3};
  boolean isEqual = Arrays.equals(a, b); // true
  ````
  **`Arrays.stream()`** : crée un flux à partir d'un tableau `Stream<T> Arrays.stream(T[] array);` 

````java
  int[] numbers = {1, 2, 3, 4, 5};
  Arrays.stream(numbers).forEach(System.out::println);
````
**`Arrays.asList()`** : convertit un tableau en une liste (List) `List<T> Arrays.asList(T... a);` 

````java
String[] carArray = {"toyota", "citroen", "bugatti"};
List<String> carList = Arrays.asList(carArray);
````
  **`Arrays.hashCode()`** : retourne le code de hashage pour un tableau `int Arrays.hashCode(T[] array);`

````java
int[] numbers = {1, 2, 3};
int hashCode = Arrays.hashCode(numbers);
````

  **`Arrays.deepToString()`** : retourne une chaîne de caractères représentant les éléments d'un tableau multidimensionnel `String Arrays.deepToString(Object[] array);` 

````java
int[][] matrix = {{1, 2}, {3, 4}};
String matrixString = Arrays.deepToString(matrix); // "[[1, 2], [3, 4]]"
````
# POO Java

### Constructeur : 
utilisé pour initialiser les attributs d'un objet au moment de la création
* Les accesseurs `get` permettent de lire les valeurs des variables 
* Les modificateurs `set` pour modifier leurs valeurs 