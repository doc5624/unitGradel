package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void remainTest() {

        CashbackHackService cashService = new CashbackHackService();

        int expected = 200;
        int actual = cashService.remain(800);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void remainTestBag() {

        CashbackHackService cashService = new CashbackHackService();

        int expected = 0;
        int actual = cashService.remain(1000);
        Assert.assertEquals(expected, actual);

    }

}
