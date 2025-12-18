
# 🧮 Annotations en Java
## Description
Ce projet illustre l’utilisation des annotations personnalisées et standards en Java pour enrichir le code avec des métadonnées, faciliter la validation, la configuration, la sécurité et le logging. Il regroupe plusieurs démonstrations pratiques :

- Création d’annotations personnalisées

- Traitement des annotations via la réflexion

- Exemples d’utilisation des annotations standards

- Mise en œuvre de cas concrets : injection de configuration, validation d’entités, contrôle d’accès par rôle, logging des méthodes.

## Project Structure
```
projets/
├── AnnotationsProject/
│   └── src/
│       └── com/example/annotations/
│           ├── AnnotatedClass.java
│           ├── AnnotationProcessor.java
│           ├── Author.java
│           ├── Bug.java
│           ├── BuggyClass.java
│           ├── MethodInfo.java
│           ├── StandardAnnotationsDemo.java
│           ├── Version.java
│           ├── ConfigValue/
│           │   ├── AppConfig.java
│           │   ├── ConfigProcesseur.java
│           │   └── ConfigValue.java
│           ├── loggable/
│           │   ├── Loggable.java
│           │   ├── LoggableClass.java
│           │   └── LoggableProcess.java
│           ├── RequiresRole/
│           │   ├── RequiresRole.java
│           │   ├── RoleProcesseur.java
│           │   ├── Service.java
│           │   └── User.java
│           └── validation/
│               ├── Length.java
│               ├── NotNull.java
│               ├── Range.java
│               ├── Utilisateur.java
│               ├── Validateur.java
│               └── ValidationTest.java
└── README.md
```
# ⚙️ Features
## 1. Annotations standards
StandardAnnotationsDemo : démonstration de @Deprecated, @Override, @SuppressWarnings.

## 2. Traitement des annotations
AnnotationProcessor : lecture des annotations de classe et de méthode via réflexion.

BuggyClass : exemple d’annotations répétables avec @Bug.

## 3. Annotations de métadonnées
@Author : nom et date d’auteur.

@Version : version de la classe.

@MethodInfo : description, tags et révision des méthodes.

@Bug / @Bugs : annotations répétables pour documenter les bugs connus.

## 4. Injection de configuration
@ConfigValue : annotation pour injecter des valeurs depuis un fichier externe.

ConfigProcesseur : lecture du fichier config.txt et injection dans AppConfig.

## 5. Logging
@Loggable : annotation pour journaliser les appels de méthodes.

LoggableProcess : affiche heure, paramètres et valeur de retour.

## 6. Sécurité par rôle
@RequiresRole : annotation pour restreindre l’accès aux méthodes selon le rôle.

RoleProcesseur : vérifie le rôle de l’utilisateur avant d’exécuter la méthode.

Service : méthodes protégées (deleteUser, viewProfile).

## 7. Validation
@NotNull, @Length, @Range : annotations pour valider les champs d’une entité.

Validateur : processeur qui applique les règles de validation.

ValidationTest : exemple avec utilisateur valide et invalide.
## 🖥️ Example Execution

### Exploration des annotations standard :
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/a3ad0c80-f78a-476f-a549-062710a2cfe7" />
### Accès aux annotations par réflexion (@Author - @MethodInfo) :
- <img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/d64a2bca-503d-494b-9847-d5d3f486de7b" />
### Traitement d'annotations répétables (@Bug) :
- <img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/3b65de3a-1d30-4f57-be9d-46eef7869d6f" />
### Test de la validation (@Length - @NotNull - @Range):
- <img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/b0a75b6a-8b10-45cc-bb63-ce0912d19d01" />
### Annotation pour la journalisation (@Loggable):
- <img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/07ee6e79-d6d3-4c26-a1ac-d3affa99e353" />
### Annotation pour la sécurité (@RequiresRole) :
- <img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/3dc7ae1e-9958-42f0-a662-27955b41efc5" />
### Annotation pour la configuration (@ConfigValue) :
- <img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/f19bae71-6649-4fa8-9275-f8594643ffcf" />
- <img width="480" height="504" alt="image" src="https://github.com/user-attachments/assets/90c2d204-758e-4a85-8f4a-9954d69727ef" />

## 💡 Concepts Practiced

- Création et utilisation d’annotations personnalisées.

- Traitement des annotations avec réflexion.

- Utilisation des annotations standards de Java.

- Injection de configuration externe.

- Logging automatique des méthodes.

- Contrôle d’accès basé sur les rôles.

- Validation des entités avec annotations.
## 🧑‍💻 Author

- 👤 Agouram Hassan
- 🏫 Programmation orientée objet : java
- 🎓 Instructor	Mr.LACHGAR
- 📅 18 décembre 2025
