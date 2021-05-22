# Patrons de Conception
Solution générale à un problème courant de conception de logiciels
- Accélerer processus de développement avec paradigmes testés
- Prévenir questions
- Améliorer lisibilité du code
### 4 éléments essentiels
- Nom
- Problème
- Solution
- Conséquences et compromis

### GoF (Gang of Four)
#### Classement par objectif:
- Structurel
- Comportemental 
- Créationnel       
#### Classement par scope:
- Class scope
- Object scope

## Patrons de création
**But**: abstraire le processus d'instantation      
*Exemple*: Factory, Singleton, Builder, Prototype
### Singleton 
Garantit qu'une seule instance d'une classe est créée
![singleton](https://user-images.githubusercontent.com/19282069/119225780-3e0a6a80-bb06-11eb-8253-0c2fbe8794dd.png)
#### Usage:
- Classe Logger
- Accès aux ressources en mode partagé
### Factory
Crée des objets sans révéler logique de création
![factory](https://user-images.githubusercontent.com/19282069/119225823-7c078e80-bb06-11eb-898a-77c4bfeb02d8.png)
## Patrons structurels
**But**: former des groupes de classe (par héritage ou interfaces) afin d'abstraire le code         
*Exemple*: Adapter, Proxy, Bridge, Composite
### Adaptateur
Convertit l'interface d'une classe en d'autres interfaces
![exemple-uml](https://user-images.githubusercontent.com/19282069/119226104-dce39680-bb07-11eb-827d-5e3a12224792.png)
![exemple-code](https://user-images.githubusercontent.com/19282069/119226116-e5d46800-bb07-11eb-9c54-3168004bdbf7.png)
### Composite
Structure des objets en arborescence 
![exemple-composite](https://user-images.githubusercontent.com/19282069/119226174-14ead980-bb08-11eb-94c0-3db3655d3a5f.png)
## Patrons de comportement
**But**: concept de responsabilités entre objets    
*Exemple*: Commande, Iterator, Observer, Strategy
### Commande
Encapsule une demande dans un objet avec des paramètres
![exemple-commande](https://user-images.githubusercontent.com/19282069/119226232-672bfa80-bb08-11eb-9897-04c12ac0f480.png)
### observer
Définit une/des dépendance(s) à un objet de sorte à ce que lorsqu'il change d'état, toutes les dépendances sont notifiées et mises à jour
![exemple-observer](https://user-images.githubusercontent.com/19282069/119226274-95a9d580-bb08-11eb-80df-9603b84601e1.png)