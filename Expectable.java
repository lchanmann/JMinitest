public class Expectable {
    private Runnable action;
    
    public Expectable(Runnable action) {
        this.action = action;
    }
    
    public void toThrow(Class<? extends Throwable> exception) {
        boolean isThrown = true;
        try {
            action.run();
            isThrown = false;
        } catch (Throwable t) {
            Class<?> clazz = t.getClass();
            assert clazz == exception : "Expected to throw " +
                exception.getName() + " but was " + clazz.getName();
        } finally {
            assert isThrown : "Expected to throw " + exception.getName() + " but nothing was thrown.";
        }
    }
}