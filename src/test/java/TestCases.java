import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import task1.Task1;

import static task1.Task1.generateRandomNumber;

public class TestCases {

    private static int testArray [][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20, 21}, {22, 23, 24, 25, 26}};


    @Test
    public void methodMaxValueShouldReturn26(){
        Assert.assertEquals(26, Task1.maxValue(testArray));
    }

    @Test
    public void methodMinValueShouldReturn1(){
        Assert.assertEquals(1, Task1.minValue(testArray));
    }

    @Test
    public void methodAverageValueShouldReturn14(){
        Assert.assertEquals(14, Task1.avgValue(testArray));
    }

}
