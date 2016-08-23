public class Program {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        assert list.size() == 0 : "Expected 0 but was " + list.size();
        assert list.getHead() == null : "Expecte null but was " + list.getHead();
        assert list.getTail() == null : "Expecte null but was " + list.getTail();
        
        // All tests are passed!
        System.out.println("All tests are passed!");
    }
}

// LinkedList class
class LinkedList {
    private Object head, tail;
    private int size;

    public Object getHead() {
        return head;
    }
    
    public Object getTail() {
        return tail;
    }
    
    public int size() {
        return size;
    }
}