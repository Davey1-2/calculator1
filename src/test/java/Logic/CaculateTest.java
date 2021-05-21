package Logic;

import junit.framework.TestCase;

public class CaculateTest extends TestCase {

    public void testSum() {
        Caculate fin = new Caculate(0);

        fin.sum(5, 10);
        assertEquals(15, fin.getFinaleRes());
    }

    public void testSubstract() {
        Caculate fin = new Caculate(0);

        fin.substract(50, 40);
        assertEquals(10, fin.getFinaleRes());
    }

    public void testTimes() {
        Caculate fin = new Caculate(0);

        fin.times(5, 10);
        assertEquals(50, fin.getFinaleRes());
    }

    public void testDivide() {
        Caculate fin = new Caculate(0);

        fin.divide(50, 10);
        assertEquals(5, fin.getFinaleRes());

    }

    public void testPower() {
        Caculate fin = new Caculate(0);

        fin.power(5, 2);
        assertEquals(25, fin.getFinaleRes());
    }

    public void testFactorial() {
        Caculate fin = new Caculate(0);

        fin.factorial(5);
        assertEquals(120, fin.getFinaleRes());
    }


}