package FunctionalInterface;

@FunctionalInterface
public interface DemoFunctional_Interface{
    // abstract method của riêng nó
    void doSomething();

    // method của class Object
    @Override
    boolean equals(Object obj);

    @Override
    int hashCode();

    @Override
    String toString();
    
    
}