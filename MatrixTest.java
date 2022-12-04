import junit.framework.Assert;
import junit.framework.TestCase;

public class MatrixTest extends TestCase {
    public void testCountAverageElementsOfIntegerArray() {
        {
            try {
                System.out.println("1 testCountAverageElementsOfIntegerArray - started");
                Integer[] tmp = new Integer[]{23, 3, -11, 18};
                double expectedResult = 8.25;
                double actualResult = Matrix.countAverageElementsOfIntegerArray(tmp);
                Assert.assertEquals(expectedResult, actualResult);
                System.out.println("1 testCountAverageElementsOfIntegerArray - passed successful");
            } finally {
                System.out.println("1 testCountAverageElementsOfIntegerArray - finished");
            }
        }
    }

    public void testCheckIfMatrixIsSquare() {
        {
            try {
                System.out.println("1 testCheckIfMatrixIsSquare - started");
                Integer[][] tmp = new Integer[3][7];
                boolean expectedResult = false;
                boolean actualResult = Matrix.checkIfMatrixIsSquare(tmp);
                Assert.assertEquals(expectedResult, actualResult);
                System.out.println("1 testCheckIfMatrixIsSquare - passed successful");
            } finally {
                System.out.println("1 testCheckIfMatrixIsSquare - finished");
            }
        }
        {
            try {
                System.out.println("2 testCheckIfMatrixIsSquare - started");
                Integer[][] tmp = new Integer[5][5];
                boolean expectedResult = true;
                boolean actualResult = Matrix.checkIfMatrixIsSquare(tmp);
                Assert.assertEquals(expectedResult, actualResult);
                System.out.println("2 testCheckIfMatrixIsSquare - passed successful");
            } finally {
                System.out.println("2 testCheckIfMatrixIsSquare - finished");
            }
        }
    }
}
