### Problems whit software development

- software starts to rot
- as time goes by, it becomes difficult to maintain the software
- eventually, it takes enormous effort to add small changes to the software
- 

### designe smells

- *rigidity.* System is hard to change because every change forces many other changes to other of the system
- *Fragility* Changes cause the system to break in places tjat have no conceptual relationship to the part that wa changed

- *immobility* Hard to refactor components whic could  be reused

- *Needless* complexity
- *Code* is dificcult to undestand

   ### The Solid Principles

- *S* - Single Responsability Principle
- *O* - Open Close Principle
- *L* - Liskov Substitution Principle
- *I* - Interface Segregation Principle
- *D* - Dependency Inversion Principle

### The Single Responsability Principle

*Definition*: A class should have only one responsability

What's a responsability?
 it's reason to *change*

#### what is a Change?
- A big Change
- A small Change
- Or a breaking change 


#### how to i decide if my class is SRP compliant?

*well thi depends of folling*

- look for really large clases and really large methods.
if method has too many parameters
- writing unit test for the class or mehods is very difficuld

*what can i do to make it compliant?*
- your ability to name clasess in a beatiful way. (Requires nice vocabulary)
- Your ability to group similar kind of behavior together. (Comes with practice)
- Try solving the above mentioned problems


#### Commom responsabilities for a class

- An action take
- A delegator(kind of a proxy)
- An orchectrator
