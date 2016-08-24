import java.lang.reflect.*;

public abstract class JMinitest {
    protected abstract void setup();
    
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
    
    public <T> Verifiable<T> verify(T subject) {
        return new Verifiable<T>(subject);
    }
    
    public Expectable expect(Runnable action) {
        return new Expectable(action);
    }
}