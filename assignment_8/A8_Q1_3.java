public class FixedStack implements Stack 
{
    private Employee[] stack;
    private int top;

    public FixedStack() 
    {
        stack = new Employee[Stack.STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) 
    {
        if (isFull()) 
        {
            System.out.println("Stack Overflow...Cannot add more employees.");
            return;
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