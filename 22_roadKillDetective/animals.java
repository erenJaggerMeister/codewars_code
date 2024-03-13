import java.util.*;

public class animals {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        roadKill("==========h===yyyyyy===eeee=n==a========");
        roadKill("======pe====nnnnnn=======================n=n=ng====u==iiii=iii==nn========================n=");
        roadKill("=====r=rrr=rra=====eee======bb====b=======");
    }

    public static String roadKill(final String photo) {
        String resultFinal = "";
        String[] allAnimalName = { "Dog", "Cat", "Elephant", "Lion", "Tiger", "Giraffe", "Horse", "Monkey", "Gorilla",
                "Kangaroo", "Koala", "Penguin", "Dolphin", "Whale", "Seagull", "Crocodile", "Alligator",
                "Snake", "Lizard", "Frog", "Turtle", "Bear", "Panda", "Zebra", "Hippopotamus", "Rabbit",
                "Squirrel", "Deer", "Ostrich", "Cheetah", "Fox", "Raccoon", "Octopus", "Shark", "Jellyfish",
                "Butterfly", "Bee", "Ant", "Spider", "Panda", "Polar Bear", "Giraffe", "Hedgehog", "Sloth",
                "Peacock", "Pig", "Goat", "Sheep", "Cow", "Chicken", "Duck", "Goose", "Turkey", "Elephant",
                "Penguin", "Dolphin", "Kangaroo", "Koala", "Flamingo", "Owl", "Bat", "Hamster", "Guinea Pig",
                "Parrot", "Raven", "Pigeon", "Rat", "Mouse", "Chameleon", "Hamster", "Guinea Pig", "Parrot",
                "Raven", "Pigeon", "Rat", "Mouse", "Chameleon", "Hamster", "Guinea Pig", "Parrot", "Raven",
                "Pigeon", "Rat", "Mouse", "Chameleon", "Hamster", "Guinea Pig", "Parrot", "Raven", "Pigeon",
                "Rat", "Mouse", "Chameleon", "Hamster", "Guinea Pig", "Parrot", "Raven", "Pigeon", "Rat",
                "Mouse", "Chameleon", "hyena" };
        String[] tempStr = photo.split("");
        for (int i = 1; i < tempStr.length; i++) {
            if (tempStr[i].equals(tempStr[i - 1])) {
                tempStr[i] = "=";
            }
        }
        for (int i = 0; i < tempStr.length; i++) {
            if (!(tempStr[i].equals("="))) {
                if (resultFinal.length() == 0) {
                    resultFinal = resultFinal + tempStr[i];
                } else {
                    String checkLast = resultFinal.substring(resultFinal.length() - 1, resultFinal.length());
                    if (!(checkLast.equals(tempStr[i]))) {
                        resultFinal = resultFinal + tempStr[i];
                    }
                }
            }
        }
        boolean lookIntoArray = false;
        boolean lookIntoArray2 = false;
        String newFlip = reverseString(resultFinal);
        for (String elem : allAnimalName) {

            if (elem.equalsIgnoreCase(resultFinal)) {
                lookIntoArray = true;
                break;
            } else if (elem.equalsIgnoreCase(newFlip)) {
                lookIntoArray2 = true;
                break;
            }
        }
        // System.out.println(resultFinal);
        if (lookIntoArray == true) {
            // System.out.println(resultFinal);
            return resultFinal;
        } else if (lookIntoArray2 == true) {
            // System.out.println(newFlip);
            return newFlip;
        } else {
            // System.out.println("??");
            return "??";
        }
    }

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}
