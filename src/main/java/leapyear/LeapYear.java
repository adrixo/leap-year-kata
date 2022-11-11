package leapyear;

public class LeapYear {
    public static boolean is(int i) {
        if (isDivisibleBy100(i) && isDivisibleBy400(i))
            return false;
        if (isDivisibleBy4(i))
            return true;
        return false;
    }

    private static boolean isDivisibleBy400(int i) {
        return i % 400 != 0;
    }

    private static boolean isDivisibleBy100(int i) {
        return i % 100 == 0;
    }

    private static boolean isDivisibleBy4(int i) {
        return isDivisibleBy100(i, 4);
    }
}
