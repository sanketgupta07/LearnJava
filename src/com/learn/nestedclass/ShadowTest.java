package com.learn.nestedclass;

public class ShadowTest {
    public int x = 10;

    class FirstLevel{
        public int x = 5;

        public void firstLevelMethod(int x){
            System.out.println("in method level x: "+x);
            System.out.println("from class level x: "+this.x);
            System.out.println("from outer class level x: "+ShadowTest.this.x);

        }
    }

    public static void main(String[] args) {
        FirstLevel firstLevel = new ShadowTest().new FirstLevel();
        firstLevel.firstLevelMethod(2);
    }
}
