package com.learn.nestedclass;

class Runner{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
//      Inner class will be initialise using the object of outer class.
        OuterClass.InnerClass inner =  outer.new InnerClass();
        inner.print();

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.print();
    }
}