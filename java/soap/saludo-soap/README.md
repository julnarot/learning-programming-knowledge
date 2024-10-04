## Creating project with maven

```bash
mvn archetype:generate -DgroupId=julnarot -DartifactId=saludo-soap -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

> where: group was `julnarot` and name of project is `demo-soap`
### Setup java 17

Add build tag to the `pom.xml` file like:

```xml

<!-- ... -->
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.1</version>
            <configuration>
                <source>17</source> <!-- Cambia el nivel de source a 17 -->
                <target>17</target> <!-- Cambia el nivel de target a 17 -->
            </configuration>
        </plugin>
    </plugins>
</build>


<!--  -->

```


# Build and Run


### Build application
Now you can try run the application

```bash
mvn clean install
```
Adding  `-U`

```bash
mvn clean install -U
```

### Run publish

use the next
```bash
mvn compile exec:java -Dexec.mainClass="julnarot.PublicService"
```

### Try with curl


```bash

curl -X POST http://localhost:8080/hello -H "Content-Type: text/xml" -d '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:jul="http://julnarot/"><soapenv:Header/><soapenv:Body><jul:sayHello><arg0>YourName</arg0></jul:sayHello></soapenv:Body></soapenv:Envelope>'


```