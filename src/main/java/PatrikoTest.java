public class PatrikoTest {
    public static void main(String[] args) {



        System.out.println("Hello , world, hello BBH");
        int myFirstNumber = (5 + 15) + (2 * 10);
        System.out.println(myFirstNumber);

        int mySecondNumber = 12;
        System.out.println(mySecondNumber);
        int myThridNumberNumber = 6;
        System.out.println(myThridNumberNumber
        );
        int myTotal = myFirstNumber + mySecondNumber + myThridNumberNumber;
        System.out.println(myTotal);

        int myLastOne = (1000 - myTotal);
        System.out.println(myLastOne);

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value=" + myMinIntValue);
        System.out.println("Integer Maximum Value= " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value=" + myMinByteValue);
        System.out.println(("Byte Maximum Value" + myMaxByteValue));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value=" + myMinShortValue);
        System.out.println(("Short Maximum Value" + myMaxShortValue));

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value=" + myMinLongValue);
        System.out.println(("Long Maximum Value" + myMaxLongValue));

        long bigLongLiteralValue = 2_124_487_654_231L;
        System.out.println(bigLongLiteralValue);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (byte) (myMinByteValue / 2);

        byte myByteChallange = 10;
        System.out.println("myByteChallange" + " " + myByteChallange);

        short myShortChallange = 20;
        System.out.println("myShortChallange" + " " + myShortChallange);
        int myIntChallange = 50;
        long myLongChallange = 50000L;
        System.out.println("Final challange" + " " + myLongChallange + 10 *
                (myByteChallange + myShortChallange + myIntChallange));
        long myLongTotal = 50000L + 10L * (myByteChallange + myShortChallange + myIntChallange);
        System.out.println(myLongTotal);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double pound = 200d;
        double kilogram = (pound) * 0.45359237d;
        System.out.println(2 * kilogram);
        System.out.println(4 * kilogram);

        char Mychar = 'D';
        char MyUnicode = '\u0044';
        System.out.println(Mychar);
        System.out.println(MyUnicode);

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more" + " even more to add";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.320";
        numberString = numberString + "  49.50";
        System.out.println(numberString);

        String lastString = "10";
        int lastInt = 50;
        double lastDouble = 20.45d;
        lastString = lastString + lastDouble;
        System.out.println(lastString);
        lastString = lastString + lastInt;
        System.out.println("Last String is equal to:" + lastString);
        //string został nadpisany przez nowy string - nieefektrywne - StringBuffer
        // 12+10 - operator + operandy , expression

        int result = 1 + 2; // 1+2=3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previous Result= " + previousResult);
        result = result - 1; // 3 - 2 = 1
        System.out.println("3-1 = " + result);

        result = result * 10; // 2*10
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20/5
        System.out.println("20 / 5 =" + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++; // 2 +1 =1
        System.out.println("1+1 = " + result);
        result--; // 2-1 = 1
        System.out.println("2-1= " + result);

        result += 2; // 1+2 =3
        System.out.println("1 + 2  = " + result);

        result *= 10; // 3*10 = 30
        System.out.println("3 * 10 = " + result);

        result /= 3;// 30 / 3 = 10
        System.out.println(" 30 / 3 =" + result);

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an alien");
            System.out.println("And i am scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("you got high score");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println(" greater than second top score and less than 100");
        }
//  & , | working at bit level

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
//ternary operator, istanceof, java presedence table

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        //challange
        double myValuec = 20.00d;
        double myValuecTwo = 80.00;
        double myResult = (myValuec + myValuecTwo) * 100;
        System.out.println("My Result = " + myResult);
        double remainder = myResult % 40.00d;
        System.out.println("Remiander = " + remainder);


        boolean isNoRemiander = (remainder == 0) ? true : false;
        System.out.println("isNoRemiander" + isNoRemiander);

        if (!isNoRemiander) {
            System.out.println("Got some reminder");
        }
// code blocks
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        calculateScore(true, 1000, levelCompleted, bonus);

        String playerName = "Wiktor";
        int position = 1;


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(" Your final score was  " + finalScore);
            System.out.println(" Your score was " + score);
        }
    }


    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(" Your final score was  " + finalScore);
            System.out.println(" Your score wass " + score);
        }

    }





}




        














//PSVS SOUT,
/*patriko nauczyl ctrl shift /*/
