package com.learn.nestedclass;

public class OuterClass {
    private String member="Outer Member";
    private static String staticMember = "Outer static member";

    class InnerClass{
        public void print(){
//             Private member of outer class are accessible in nested or Inner class.
            System.out.println("printing from Inner class: "+ member);
        }
    }

    static class StaticNestedClass{
        public void print(){
//             Non-static member are not accessible in static nested class.
//            System.out.println("printing from Inner class: "+ member);
            System.out.println("printing from static nested class: "+ staticMember);

        }
    }
}