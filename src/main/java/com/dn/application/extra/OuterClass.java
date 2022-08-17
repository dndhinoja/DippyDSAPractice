package com.dn.application.extra;

public class OuterClass {

    private static String msg = "GeeksForGeeks";

    // Static nested class
    public static class NestedStaticClass {

        // Only static members of Outer class
        // is directly accessible in nested
        // static class
        public void printMessage()
        {

            // Try making 'message' a non-static
            // variable, there will be compiler error
            System.out.println(
                    "Message from nested static class: " + msg);
        }
    }

    public class InnerClass {

        // Both static and non-static members
        // of Outer class are accessible in
        // this Inner class
        public void display()
        {

            // Print statement whenever this method is
            // called
            System.out.println(
                    "Message from non-static nested class: "
                            + msg);
        }
    }
}
class GFG {

    // Main driver method
    public static void main(String args[])
    {

        // Creating instance of nested Static class
        // inside main() method
        OuterClass.NestedStaticClass printer
                = new OuterClass.NestedStaticClass();

        // Calling non-static method of nested
        // static class
        printer.printMessage();

        // Note: In order to create instance of Inner class
        //  we need an Outer class instance

        // Creating Outer class instance for creating
        // non-static nested class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner
                = outer.new InnerClass();

        // Calling non-static method of Inner class
        inner.display();
        OuterClass.InnerClass innerObject
                = new OuterClass().new InnerClass();

        // Similarly calling inner class defined method
        innerObject.display();
    }
}
