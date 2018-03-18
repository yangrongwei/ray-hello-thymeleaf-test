
Tags: Kotlin, JUnit 5, Thymeleaf, Thymeleaf Testing

[Thymeleaf testing infrastructure]:https://github.com/thymeleaf/thymeleaf-testing
[pom-of-thtest]:https://github.com/thymeleaf/thymeleaf-testing/blob/3.0-master/pom.xml#L295
[JUnit 5 for Kotlin Developers]: http://www.baeldung.com/junit-5-kotlin
[JUnit 5]: https://junit.org/junit5/

#About

A simple but full example to run a Thymeleaf unit test.

Thymeleaf has an auxiliary testing library [Thymeleaf testing infrastructure]. 
But I did not find a simple/full example code from the doc, here is mine.

This demo project used Kotlin, [JUnit 5] and initialized by Spring Initializr.

## Tricks 

Here are some tricks/memos for building a Thymeleaf unit test.

1. String parameter fed to `TestExecutor.execute`  is either **a folder** or **a specific .thtest file**.
1. Project folder layout demoed.
1. String parameter fed to `TestExecutor.execute` needs `classpath:` prefix for this demo.
1. **Trap** Maven `pom.xml` should exclude Javassist. See also [pom-of-thtest].

See also [JUnit 5 for Kotlin Developers]
 
