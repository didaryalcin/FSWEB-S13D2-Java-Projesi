public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1484));
        System.out.println(isPalindrome(848));
        System.out.println("--------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("--------------");
        System.out.println(numberToWords(123)); // "One Two Three"
        System.out.println(numberToWords(1010)); // "One Zero One Zero"
        System.out.println(numberToWords(-12)); // "Invalid Value"
    }

    //isPalindrome
    public static boolean isPalindrome(int number){
        String stringNumber = String.valueOf(Math.abs(number));
        String reversedNumber = "";
        for(int i= stringNumber.length()-1; 0<=i; i--){
            reversedNumber = reversedNumber + stringNumber.charAt(i);
        }
        if (stringNumber.equals(reversedNumber)) {

            return true;
        } else {
            return false;
        }

    }
    // isPalindrome alternatif 2
    public static boolean isPalindrome1(int number) {
        //707
        int originalNum = Math.abs(number);
        int reversedNumber = 0;
        while(number>0){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return originalNum == reversedNumber;
    }

    // Mükemmel sayı

    public static boolean isPerfectNumber(int number) {
        int sumOfDivison = 0;
        if(number < 0 ){
            return false;
        } else {
            for(int i=1; i<number; i++){
                if(number % i == 0){
                    sumOfDivison = sumOfDivison + i;
                }
            }
            if(sumOfDivison == number){
                return true;
            } else {
                return false;
            }
        }
    }


    // Sayıları kelimelere dök

    public static String numberToWords(int number) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";

        if(number < 0 ){
            return "Invalid Value";
        }
        else {
            char[] numberStr = String.valueOf(number).toCharArray();
            for(int i = 0; i < numberStr.length; i++){
                result = result + words[Integer.parseInt(String.valueOf(numberStr[i]))] + " ";
            }
        }
        return result;

    }
}