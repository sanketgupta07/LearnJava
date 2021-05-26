package com.learn.nestedclass.localclass;

public class LocalClassExample {

    static String regularexp = "[^0-9]";

    public static void validatePhoneNumber(String ph1, String ph2){
        int numberlength = 10;

//        Local Class defined under a method block
        class PhoneNumber{
            String formattedNumber = null;
            PhoneNumber(String phoneNumber){
//                numberlength = 7; // to show effectively final variable, if commented out, it will generate compile time error
                String currentNumber = phoneNumber.replaceAll(
                        regularexp, "");
                if (currentNumber.length() == numberlength)
                    formattedNumber = currentNumber;
                else
                    formattedNumber = null;
            }

            public String getNumber() {
                return formattedNumber;
            }
            //          Localclass can access parameters of the enclosing method
            public void printOriginalNumbers() {
                System.out.println("Original numbers are " + ph1 +
                        " and " + ph2);
            }
        }

        PhoneNumber num1 = new PhoneNumber(ph1);
        PhoneNumber num2 = new PhoneNumber(ph2);

        num1.printOriginalNumbers();


        if (num1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + num1.getNumber());
        if (num2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + num2.getNumber());
    }

    public static void main(String[] args) {
        validatePhoneNumber("123-456-7485","245-6985");
    }

    //======================================================

    public void greetInEnglish() {
//        Can not use Interface in any block similar to local class
//        interface HelloThere {
//            public void greet();
//        }
//        class EnglishHelloThere implements HelloThere {
//            public void greet() {
//                System.out.println("Hello " + name);
//            }
//        }
//        HelloThere myGreeting = new EnglishHelloThere();
//        myGreeting.greet();
    }

    //    ==============================
    public void sayGoodbyeInEnglish1() {
        //Static local class not allowed
//        static class EnglishGoodbye {
//         class EnglishGoodbye {
//             // static declaration is not allowed in local class
//             public static void sayGoodbye() {
//                System.out.println("Bye bye");
//            }
//        }
//        EnglishGoodbye.sayGoodbye();
    }

    public void sayGoodbyeInEnglish() {
        class EnglishGoodbye {
            // Static declaration is allowed to be used for constant.
            public static final String farewell = "Bye bye";
            public void sayGoodbye() {
                System.out.println(farewell);
            }
        }
        EnglishGoodbye myEnglishGoodbye = new EnglishGoodbye();
        myEnglishGoodbye.sayGoodbye();
    }
}
