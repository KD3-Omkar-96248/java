import java.util.Arrays;

public class GrowableStack implements Stack 
{
    private Employee[] stack;
    private int top;

    public GrowableStack() 
    {
        stack = new Employee[Stack.STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) 
    {

        if (isFull()) 
        {
            stack = Arrays.copyOf(stack, stack.length * 2);
            System.out.println("Stack capacity increased to " + stack.length);
        }

        stack[++top] = emp;
        System.out.println("Employee added successfully.");
    }

    @Override
    public Employee pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack Underflow...No employees to remove.");
            return null;
        }

        Employee temp = stack[top];
        stack[top] = null;
        top--;

        return temp;
    }

    @Override
    public boolean isEmpty() 
    {
        return top == -1;
    }

    @Override
    public boolean isFull() 
    {
        return top == stack.length - 1;
    }
}