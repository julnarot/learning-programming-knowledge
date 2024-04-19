## creating project with and setup  maven application


### Creating project
go to line code and write next: 

```bash
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=[my-app-name] -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
don't forget change [my-app-name] by the project name [ref](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html#creating-a-project)

### install dependencies

for install dependencies move to project root path and execute next command 
```bash
mvn archetype:generate -DarchetypeCatalog=https://mavensync.zkoss.org/maven2/
```

this example show installation for zk using 
