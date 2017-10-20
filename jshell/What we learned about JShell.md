# What we learned about JShell
Test your code snippets, right the command line. No more need to hack in unit tests or write a main method. Cool.


- You can save and load your snippets for later use
- Every execution of an expression gets an id.
    - /list -all show you all executions
    - /$id voert het commando opnieuw uit
- Forward references: you don't need to define all your variable beforehand. You can type:

```java
public int timesThree(int x) {
    return x * three;
}
```

Three is unknown at this point, but the method has been defined. Naturally, you cannot use it yet, until you type
```java
int three = 3;
```


- With /set verbose, you get more detailled logging about what the shell does
- To set something on the classpath: start jshell with --class-path="your jars"
- Ctrl-s, ctrl-r: search


# What do we miss
- Auto import. You have to define all imports yourself, while an IDE can do this for you.


# Interesting tutorials
https://app.pluralsight.com/library/courses/java-9-whats-new/table-of-contents