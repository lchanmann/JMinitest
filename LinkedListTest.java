public class LinkedListTest extends JMinitest {
    private LinkedList list;
    protected void setup() {
        list = new LinkedList();
    }
    
    public void test_initial_linkedlist() {
        verify(list.size()).toEqual(0);
        verify(list.getHead()).toBeNull();
        verify(list.getTail()).toBeNull();
    }
    
    public void test_linkedlist_add() {
        list.add(1); list.add(2); list.add(3);
        verify(list.size()).toEqual(3);
        verify(list.getHead().value).toEqual(1);
        verify(list.getTail().value).toEqual(3);
    }
}