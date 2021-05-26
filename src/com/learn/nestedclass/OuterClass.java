package com.learn.nestedclass;

public class OuterClass {
    String member="Outer Member";
    static String staticMember = "Outer static member";

    class InnerClass{
        public void print(){
//             Private member of outer class are accessible in nested or Inner class.
            System.out.println("printing from Inner class: "+ member);
            System.out.println("printing from Inner class: "+ staticMember);
        }
    }

    static class StaticNestedClass{
        public void print(){
//             Non-static member are not accessible in static nested class.
//            System.out.println("printing from Inner class: "+ member);
            System.out.println("printing from static nested class: "+ staticMember);
        }

//      To access non static member in static nested class, it need to use instance of Outer class.
        public void access(OuterClass outer){
            System.out.println(outer.member);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
//      Inner class will be initialise using the object of outer class.
        OuterClass.InnerClass inner =  outer.new InnerClass();
        inner.print();

        StaticNestedClass staticNestedClass = new StaticNestedClass();
        staticNestedClass.print();

        TopClass top = new TopClass();
        top.print(outer);
    }
}