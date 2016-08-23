import java.lang.reflect.*;

public class LinkedListTest {
    
    private LinkedList list;
    protected void setup() {
        list = new LinkedList();
    }
    
    public void runTests() throws Throwable {
        Method[] methods = getClass().getMethods();
        for(Method method : methods) {
            if (method.getName().startsWith("test_")) {
                try {
                    // call setup for each test methods
                    setup();
                    method.invoke(this);
                } catch (InvocationTargetException e) {
                    // re-throw exception in method call
                    throw e.getCause();
                }
            }
        }
    }
    
    public void test_initial_linkedlist() {
        assert list.size() == 0 : "Expected 0 but was " + list.size();
        assert list.getHead() == null : "Expecte null but was " + list.getHead();
        assert list.getTail() == null : "Expecte null but was " + list.getTail();
    }
    
    public void test_linkedlist_add() {
        list.add(1); list.add(2); list.add(3);
        assert list.size() == 3 : "Expected 3 but was " + list.size();
        assert list.getHead().value == 1 : "Expecte 1 but was " + list.getHead().value;
        assert list.getTail().value == 3 : "Expecte 3 but was " + list.getTail().value;
    }
}