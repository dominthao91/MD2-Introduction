import java.util.Scanner;

public class CountNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển sang chữ");
        int number = scanner.nextInt();
        String result = "";
        if (isNumberHasOneCharacter(number)) {
            result = readNumberInUnit(number);
        } else if (isNumberHasTwoCharacter(number)) {
            result = readNumberHasTwoCharacter(number);
        } else if (isNumberHasThreeCharacter(number)) {
            result = readNumberHasThreeCharacter(number);
        } else {
            System.out.println("Out of range");
        }
        System.out.println(result);
    }

    public static boolean isNumberHasOneCharacter(int number){
        return number < 10 && number > 0;
    }

    public static boolean isNumberHasTwoCharacter(int number){
        return number >= 10 && number < 100;
    }

    public static boolean isNumberHasThreeCharacter(int number){
        return number >= 100 && number < 1000;
    }

    public static String readNumberHasThreeCharacter(int number) {
        String result = "";
        int hundred = number / 100;
        int dozen = (number % 100) / 10;
        int unit = (number % 100) % 10;
        if (unit == 0) {
            if (dozen == 0) {
                result = readNumberInHundred(hundred);
            } else {
                result = readNumberInHundred(hundred) + " " + readNumberInDozen(dozen);
            }
        } else {
            if (dozen == 0) {
                result = readNumberInHundred(hundred) + " linh " + readNumberInUnit(unit);
            } else {
                result = readNumberInHundred(hundred) + " " + readNumberInDozen(dozen) + " " + readNumberInUnit(unit);
            }
        }
        return result;
    }

    public static String readNumberHasTwoCharacter(int number) {
        String result = "";
        int dozen = number / 10;
        int unit = number % 10;
        if (unit == 0) {
            result = readNumberInDozen(dozen);
        } else {
            result = readNumberInDozen(dozen) + " " + readNumberInUnit(unit);
        }
        return result;
    }

    public static String readNumberInHundred(int number) {
        return readNumberInUnit(number) + " trăm";
    }

    public static String readNumberInDozen(int number) {
        if (number == 1) {
            return "mười";
        }
        return readNumberInUnit(number) + " mươi";
    }

    public static String readNumberInUnit(int number) {
        String result = "";
        switch (number) {
            case 1: {
                result = "một";
                break;
            }
            case 2: {
                result = "hai";
                break;
            }
            case 3: {
                result = "ba";
                break;
            }
            case 4: {
                result = "bốn";
                break;
            }
            case 5: {
                result = "năm";
                break;
            }
            case 6: {
                result = "sáu";
                break;
            }
            case 7: {
                result = "bảy";
                break;
            }
            case 8: {
                result = "tám";
                break;
            }
            case 9: {
                result = "chín";
                break;
            }
        }
        return result;
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào 1 số: ");
//        int num = scanner.nextInt();
//        int hundred = (num - (num % 100))/100;
//        int dozen = ((num % 100) - ((num % 100) % 10))/10;
//        int unit = num % 10;
//        System.out.println(hundred);
//        System.out.println(dozen);
//        System.out.println(unit);
//        System.out.println(display(num, unit, dozen, hundred));
//    }
//
//    public static String display(int num, int unit, int dozen, int hundred){
//        if (num <= 20 && num > 0) {
//            return unit(num);
//        } else if (num < 100) {
//            return (dozen(dozen) + unit(unit));
//        } else if (num < 999 && dozen == 1){
//            return (unit(hundred) + " hundreds and " + unit(num % 100));
//        } else if (num <= 999) {
//            return (unit(hundred) + " hundreds and " + dozen(dozen) + unit(unit));
//        } else {
//            return "Out of range";
//        }
//    }
//
//    public static String unit(int num) {
//        String unit = "";
//        switch (num) {
//            case 1:
//                unit = "one";
//                break;
//            case 2:
//                unit = "two";
//                break;
//            case 3:
//                unit = "three";
//                break;
//            case 4:
//                unit = "four";
//                break;
//            case 5:
//                unit = "five";
//                break;
//            case 6:
//                unit = "six";
//                break;
//            case 7:
//                unit = "seven";
//                break;
//            case 8:
//                unit = "eight";
//                break;
//            case 9:
//                unit = "nine";
//                break;
//            case 10:
//                unit = "ten";
//                break;
//            case 11:
//                unit = "eleven";
//                break;
//            case 12:
//                unit = "twelve";
//                break;
//            case 13:
//                unit = "thirteen";
//                break;
//            case 14:
//                unit = "fourteen";
//                break;
//            case 15:
//                unit = "fifteen";
//                break;
//            case 16:
//                unit = "sixteen";
//                break;
//            case 17:
//                unit = "seventeen";
//                break;
//            case 18:
//                unit = "eighteen";
//                break;
//            case 19:
//                unit = "nineteen";
//                break;
//        }
//        return unit;
//    }
//
//    public static String dozen(int num) {
//        String unit = "";
//        switch (num) {
//            case 2:
//                unit = "twenty ";
//                break;
//            case 3:
//                unit = "thirty ";
//                break;
//            case 4:
//                unit = "forty ";
//                break;
//            case 5:
//                unit = "fifty ";
//                break;
//            case 6:
//                unit = "sixty ";
//                break;
//            case 7:
//                unit = "seventy ";
//                break;
//            case 8:
//                unit = "eighty ";
//                break;
//            case 9:
//                unit = "ninety ";
//                break;
//        }
//        return unit;
//    }
//}
