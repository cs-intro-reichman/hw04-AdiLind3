public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String test = "One two tHRee world";
        System.out.println(capVowelsLowRest(test));
        
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String result = ""; // create the string we want to get
        String semiresult = lowerCase(string); // change the original string we got to without Upper-Case
        int length = string.length();
        for(int i = 0 ; i< length ; i++)
        {
            char temp = semiresult.charAt(i);
            switch (temp) {
                case 97: //a
                    temp = (char) (temp - 32); //change a to A
                    result = result + temp;
                    break;
            
                default:
                    result = result + temp;
                    break;
                case 101: //e
                temp = (char) (temp - 32); //change e to E
                    result = result + temp;
                    break;

                case 105: //i
                temp = (char) (temp - 32); //change i to I
                    result = result + temp;
                    break;
                case 111: //o
                temp = (char) (temp - 32); //change o to O
                    result = result + temp;
                    break;

                case 117: //u
                temp = (char) (temp - 32); //change u to U
                    result = result + temp;
                    break;
            }
        }

        return result;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }

    public static String lowerCase(String s) { //from the HW3
        int size = s.length();
        String newS = ""; //make the new s we get but without Upper-case.
        for(int i = 0 ; i < size; i++)
        {
            char temp = s.charAt(i);
            if (temp >= 65 && temp <= 90) // the ascii code of upper
            {
                temp = (char) (temp + 32) ;
                newS = newS + temp;
            }
            else 
            {
                newS = newS + temp;
            }
            
        }

        return newS;
    }
}
