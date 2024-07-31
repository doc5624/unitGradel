package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
   public void remainTest() {

        CashbackHackService cashService = new CashbackHackService();

        int expected = 200;
        int actual = cashService.remain(800);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void remainTestBag() {

        CashbackHackService cashService = new CashbackHackService();

        int expected = 0;
        int actual = cashService.remain(1000);
        Assert.assertEquals(expected, actual);

    }

}
