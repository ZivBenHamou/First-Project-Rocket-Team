public class  Function12 {
    public static void printNearestNarcissistic(int number) {
        int lower = number - 1;
        int higher = number + 1;

        while (true) {
            if (isNarcissistic(lower)) {
                System.out.println(lower);
                break;
            } else if (isNarcissistic(higher)) {
                System.out.println(higher);
                break;
            }
            lower--;
            higher++;
        }
    }

    private static boolean isNarcissistic(int number) {
        int originalNumber = number;
        int sum = 0;
        int length = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, length);
            number /= 10;
        }

        return sum == originalNumber;
    }
    }