public class Matrix {
    public static void main(String[] args) {
        System.out.println(countAverageElementsOfIntegerArray(new Integer[]{23, 3, -11, 18}));
    }
    public static double countAverageElementsOfIntegerArray(Object[] tmp) {
        double counterOfAverageNumber = 0.0;
        try {
            for (Object i : tmp) {
                Integer y = (Integer) i;
                counterOfAverageNumber += y;
            }
        } catch (ClassCastException exception) {
            System.out.println("You should put in method body only array with INTEGER numbers!");
            System.out.println(exception.getMessage() + "!");
            throw exception;
        }
        return counterOfAverageNumber / tmp.length;
    }

    public static boolean checkIfMatrixIsSquare(Object[][] tmp) {
        long counter = 0;
        for (Object[] i : tmp) {
            if (i.length == tmp.length) {
                counter++;
            }
        }
        return counter == tmp.length;
    }
}
