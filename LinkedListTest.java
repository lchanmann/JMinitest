public class LinkedListTest extends JMinitest {
    private LinkedList list;
    protected void setup() {
        list = new LinkedList();
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