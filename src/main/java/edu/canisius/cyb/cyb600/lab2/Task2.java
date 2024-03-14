package edu.canisius.cyb.cyb600.lab2;

public class Task2 {

    public String method1(String parameter1){
        if(parameter1 == null){
            return "";
        }

        String myString = "";

        if(parameter1 != null){

            for (int i = parameter1.length() - 1; i >= 0; i--) {
                char myChar = Character.toUpperCase(parameter1.charAt(i));
                myString = myString + myChar;
            }


        }
        return myString;
    }

    public String method2(String parameter2){
        if(parameter2 == null) {
            return "";
        }

        String myString = "";

        for (int i = 0; i <= parameter2.length() - 1; i++) {
            char myChar = parameter2.charAt(0);
            myString = myString + myChar;
        }

        myString = myString + parameter2;
        return myString;

    }

    public String method3(String parameter3){
        if(parameter3 == null) {
            return "";
        }

        String[] strArray = parameter3.split("\\s");
        String result = "";

        for (int i = strArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                result = result + strArray[i] + " ";
            }
            if (i == 0) {
                result = result + strArray[i];
            }
        }

        return result;

    }
}
