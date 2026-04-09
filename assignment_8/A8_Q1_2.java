public interface Stack 
{
    int STACK_SIZE = 5;

    void push(Employee emp);

    Employee pop();

    boolean isEmpty();

    boolean isFull();
}