public class LinkedList {
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
    
    public int get(int index) {
        if (index < 0 || index > size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        
        Node node = getHead();
        if (node == null) {
            throw new IndexOutOfBoundsException();
        }
        
        for (int i = 1; i <= index; i++) {
            node = node.next;
        }
        return node.value;
    }
}