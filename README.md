# JMinitest
Minimal testing framework for Java

## Compile and Run the program
```
  javac Program.java
  java -ea Program
```
It should print "All tests are passed!"

## Usages
Create a test class that inherits `JMinitest`
```java
public class LinkedListTest extends JMinitest
    public void test_the_truth() {
        verify(1).toEqual(1);
    }
}
```
All public methods start with `test_` will be invoked upon calling `new LinkedListTest().runTests();`.

## Extending assertion functionalities
Currently JMinitest supports only `toEqual` and `toBeNull` assertions. Yet adding new assertion is as easy as adding new method in `Verifiable` class.
```java
public class Verifiable<T> {
    // ...
    public void toBeTrue() {
        assert subject == true : "Expected true but was false";
    }
}
```
