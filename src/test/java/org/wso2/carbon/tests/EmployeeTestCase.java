package org.wso2.carbon.tests;
import org.testng.annotations.*;

/**
 * Created by chalitha on 9/25/17.
 */
public class EmployeeTestCase {
    @BeforeClass
    public void hello()
    {
        System.out.println("Before Class");

    }

    @AfterClass
    public void after()
    {
        System.out.println("After class");
    }

    @BeforeTest
    public void beforeMethod()
    {
        System.out.println("Before methods");
    }

    @AfterTest
    public void afterMethod()
    {
        System.out.println("After methods");

    }

    @Test
    public void employeeTest()
    {
        System.out.println("employeeName:"+ "Chalitha");

    }
}
