package com.jap;

public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber){
        //create local variable
        int finalNumber;
        try {
            //write logic
            finalNumber = firstNumber / secondNumber;
            //Handle specific exception
        }catch (Exception exception){
          return exception.toString();
        }
        return String.valueOf(finalNumber);
    }


}
