package com.company.class23.finaldemo;

public class Parent {
    private final String NAME = "Fatma";
    protected final int AGE = 20;
    public final double WIEGHT_OF_AVG_HUMAN = 30;
    final double HEIGHT = 5.4;

    static final int NO_OF_LEGS = 2;
String hairColor="Black";
    private void printName() {  // if we already declare it as private no need to declarefinal because
        System.out.println(NAME);    // the child class can't override it any way with private access modifier
    }
    final void printAge() {  // we can use the final Keyword with default access modifier(void)
        System.out.println(AGE);
    }
    protected final void printHeight() {
        System.out.println(HEIGHT);
    }
    public final void printWeight() {
        System.out.println(WIEGHT_OF_AVG_HUMAN);
    }
public static void printNoOfLegs (){ // no need to write the final (public static final void)
    // System.out.println(WIEGHT_OF_AVG_HUMAN); not allowed because it's  an instance field
    System.out.println(NO_OF_LEGS); // no issue because it's a static field,static method

                               // only works with static fields.
    }

void printHairColor() {
    System.out.println(hairColor);

}
}// static final Parent(){   // No non access modifiers (final,static..) are allowed with Constructors
                  // because Constructors they belong to a class do not participate in inheritance,
                 // they are there to initialize the instance field


class Child extends Parent{
    public static void printNoOfLegs() {

        System.out.println(" From Child "+NO_OF_LEGS);
    }

    void printHairColor() {
        System.out.println("Black from Child");
    }
}

