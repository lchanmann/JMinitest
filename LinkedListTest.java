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

    public void test_linkedlist_get() {
        list.add(11); list.add(22); list.add(33);
        verify(list.get(1)).toEqual(22);
    }

    public void test_empty_linkedlist_get() {
        expect( () -> list.get(0) ).toThrow(IndexOutOfBoundsException.class);
    }
    
    public void test_linkedlist_get_negative_index() {
        list.add(1);
        expect( () -> list.get(-1) ).toThrow(IndexOutOfBoundsException.class);
    }
    
    public void test_linkedlist_get_outofbound_index() {
        list.add(1);
        expect( () -> list.get(5) ).toThrow(IndexOutOfBoundsException.class);
    }
}