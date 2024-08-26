## Spring BOOT

Il a été créé par Rod Johnson (2013) , et est un framework de spring (qui est un framework de Java)

* Annotation
  
  * Definir une annotation

  ````java
   // définir le genre d'annotation
   @Target(ElementType.TYPE);
   // niveau de rétention
   @Retention(RetentionPolicy.RUNTIME);
   public @interface annotation_name {
      // définir un paramètre à l'annotation
      String value() default "salut" ;
      // valeur par défaut : "salut"
   }
   ````
`@Target` : définir le genre d'annotation
   `@Override` est considéré comme une annotation (métadonnée qui fournit des infos supplémentaires à Spring , elles sont utilisées pour configurer et fournir des infos spécifiques à Spring)
   * markers (marqueurs)
   * single value annotations(annotations paramétrées)
   * full annotations (annotations multi-paramétrées)

## Différents types d'annotations

### Cycles de vie 

**Niveaux de rétention**

* `RetentionPolicy.CLASS` : l'annotation sera conservée dans le fichier de classe généré par le compilateur mais pas disponible au moment de l'exécution de l'application


* `RetentionPolicy.RUNTIME` comme la précédente mais sera disponible au moment de l'exécution de l'application


* `RetentionPolicy.SOURCE` : l'annotation ne sera conservée que dans le code source mais pas incluse dans le fichier de classe généré par le compilateur 