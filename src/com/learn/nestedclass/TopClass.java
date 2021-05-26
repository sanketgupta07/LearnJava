package com.learn.nestedclass;

public class TopClass {
    public void print(OuterClass outer){
        System.out.println(outer.member);
        System.out.println(OuterClass.staticMember);
    }
}
