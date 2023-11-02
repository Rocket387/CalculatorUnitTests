package org.example;

public class Calculator
{
    public int add (int numberA, int numberB){

        return numberA + numberB;
    }

    public int subtract (int numberA, int numberB){

        return numberA - numberB;
    }

    public boolean numEqualsNum (int numberA, int numberB){
        if (numberA == numberB) {
            return true;
        }
        return false;
    }
}
