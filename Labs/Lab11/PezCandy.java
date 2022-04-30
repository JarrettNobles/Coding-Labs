import java.io.*;
import java.util.*;

public class PezCandy
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();
        addPez(stack);
        removeGreen(stack);
        System.out.println("Stack elements after removing green: ");
        printStack(stack);
    }
    
    //add pez
    public static void addPez(Stack<String> stack)
    {
        stack.add("yellow");
        stack.add("red");
        stack.add("green");
        stack.add("green");
        stack.add("yellow");
        stack.add("yellow");
        stack.add("red");
        stack.add("green");
    }

    //remove green
    public static void removeGreen(Stack<String> stack)
    {
        Stack <String> tempStack = new Stack<String>();

        while(stack.isEmpty() == false)
        {
            if(stack.peek() != "green")
            {
                tempStack.push(stack.pop());
            }

            else
            {
                stack.pop();
            }
        }

        while(tempStack.isEmpty() == false)
        {
            stack.push(tempStack.pop());
        }
    }

    public static void printStack(Stack<String> stack)
    {
        if(stack.isEmpty())
        {
            return;
        }

        String data = stack.pop();
        System.out.println(data);
        printStack(stack);
        stack.push(data);
    }

}
