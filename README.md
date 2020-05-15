# craftmanship-tp-appingx2

Projet EPITA de craftmanship géré par Emmanuel Chaffraix.
Fait par l'équipe Yadaviin: Daniel Sebton, Yann Moussan, Kevin Voyer

## General observations:
 - Nous avons passé le projet en java 11 pour que Travis passe (il n'arrivait pas a cibler java 8)
 - Nous avons implémenté Travis *et* Github Actions.
   - Nous avons du modifier quelques versions de plugins pour les faire passer.
   - Nous avons aussi modifié le fichier checkstyle pour qu'il apelle une version locale et non la version de ngeor.
   - Ceci était pour éviter les warning "magic number" qui ne sont pas justifiés dans ce contexte.
 - Nous avons uniquement fait le deuxième translator (Roman->Arabic) à la demande du client.
 - Le premier (Arabic->Numeral) a été laissé à l'abandon après que le client ait changé d'avis. (vive l'agilité)
 - Nous avons tout de même implémenté un main qui sait interpréter des roman et des arabics (même s'il ne traduit que des arabics).

## Prerequisites:

- mvn
- jre 11 or jdk 11

## Compiling:

```
mvn compile
```

## Running the tests:

```
mvn test
```

## Running the program:

Attention: **cette commande ne marche pas avec powershell** (ne nous demandez pas pourquoi). Il faut utiliser CMD.exe sur windows.
```
mvn -q exec:java -Dexec.mainClass=com.epita.socra.app.App
```

## Authors:
* **Daniel Sebton** - exercise implementation - [Allexio-bot](https://github.com/Allexio-bot)
* **Kevin Voyer** - exercise implementation - [Kmynes](https://github.com/Kmynes)
* **Yann Moussan** - exercise implementation - [YannMoussan](https://github.com/yannmoussan)
* **Emmanuel Chaffraix** - base file structure and main - [EChaffraix](https://github.com/EChaffraix)

## Acknowledgments
* **O'Reilly** - Roman numeral strict Regex - [O'Reilly](oreilly.com)
