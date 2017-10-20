# Can we run Java 8 apps in Java 9?

## Yes! Unless..

### ...your code, or a framework you use, uses **private api** from the JDK (f.e. sun.*)

- If the code is compiled in Java 8: Then you get a **warning**.
- If the code is compiled in Java 9: you get an **error**.
    - Workaround: java --illegal-access=permit Main
        - Could disappear in Java 10
        - Still a warning

### ...you use modules that are no longer in the standard Java API
Some functionality has been moved to Java EE, and is no longer in Java SE.

Solution:
```
javac --add-modules java.xml.bind Main.java
java --add-modules java.xml.bind Main
```

or

```
java --add-modules java.modules.ee Main
```
## How to determine if my app will run?
**Jdeps** gives you information about your "module tree".
Also, it tells you about any usage of internal api, and even suggests replacements!

## How?
Java applications without a module descriptor become an "**unnamed module**"
