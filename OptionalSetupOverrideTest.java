public class OptionalSetupOverrideTest extends JMinitest {
    public void test_greeting() {
        verify("hello").toEqual("hello");
    }
}