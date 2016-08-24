public class Program {
    public static void main(String[] args) throws Throwable {
        new LinkedListTest().runTests();
        new OptionalSetupOverrideTest().runTests();

        // All tests are passed!
        System.out.println("All tests are passed!");
    }
}

