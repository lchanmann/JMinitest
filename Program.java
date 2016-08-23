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
    public Object getHead() {
        return null;
    }
    
    public Object getTail() {
        return null;
    }
    
    public int size() {
        return 0;
    }
}