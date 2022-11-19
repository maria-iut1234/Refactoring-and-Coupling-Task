package assignment1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testNormalDate()
    {
        Solution solution=new Solution();
        String expected = "2002/03/25";

        String nextDate = solution.getNextDate(2002, 03, 24);

        assertEquals(expected, nextDate);
    }

    @Test
    public void testLeapYear()
    {
        Solution solution=new Solution();
        String expected = "2020/02/29";

        String nextDate = solution.getNextDate(2020, 02, 28);

        assertEquals(expected, nextDate);
    }

    @Test
    public void testLastDateforMonth31()
    {
        Solution solution=new Solution();
        String expected = "2013/04/01";

        String nextDate = solution.getNextDate(2013, 03, 31);

        assertEquals(expected, nextDate);
    }

    @Test
    public void testLastDateforMonth30()
    {
        Solution solution=new Solution();
        String expected = "2014/05/01";

        String nextDate = solution.getNextDate(2014, 04, 30);

        assertEquals(expected, nextDate);
    }

    @Test
    public void testLastDateOfYear()
    {
        Solution solution=new Solution();
        String expected = "2023/01/01";

        String nextDate = solution.getNextDate(2022, 12, 31);

        assertEquals(expected, nextDate);
    }

}