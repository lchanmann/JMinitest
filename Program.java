public class Program {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        assert list.size() == 0 : "Expected 0 but was " + list.size();
        assert list.getHead() == null : "Expecte null but was " + list.getHead();
        assert list.getTail() == null : "Expecte null but was " + list.getTail();
        
        list.add(1); list.add(2); list.add(3);
        assert list.size() == 3 : "Expected 3 but was " + list.size();
        assert list.getHead().value == 1 : "Expecte 1 but was " + list.getHead().value;
        assert list.getTail().value == 3 : "Expecte 3 but was " + list.getTail().value;
        // All tests are passed!
        System.out.println("All tests are passed!");
    }
}

// LinkedList class
class LinkedList {
    // data structure
    class Node {
        public int value;
        public Node next;
        
        public Node(int value) {
            this.value = value;
        }
    }
    
    // variables
    private Node head, tail;
    private int size;

    // getter methods
    public Node getHead() {
        return head;
    }
    
    public Node getTail() {
        return tail;
    }
    
    public int size() {
        return size;
    }
    
    // functional methods
    public void add(int value) {
        Node node = new Node(value);
        Node curTail = getTail();
        
        this.tail = node;
        if (curTail != null) {
            curTail.next = node;
        }
        
        Node curHead = getHead();
        if (curHead == null) {
            this.head = node;
        }
        ++size;
    }
}