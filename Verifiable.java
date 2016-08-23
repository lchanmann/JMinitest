public class Verifiable<T> {
    T subject;
    
    public Verifiable(T subject) {
        this.subject = subject;
    }
    
    public void toEqual(T expected) {
        assert subject == expected : "Expected " + expected + " but was " + subject;
    }
    
    public void toBeNull() {
        assert subject == null : "Expected NULL but was " + subject;
    }
}