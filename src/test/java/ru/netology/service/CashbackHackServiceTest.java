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

}
