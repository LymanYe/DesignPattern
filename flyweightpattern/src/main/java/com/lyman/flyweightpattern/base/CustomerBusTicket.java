package com.lyman.flyweightpattern.base;

import java.util.Random;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/11/13
 * Description:
 */

public class CustomerBusTicket extends BusTicket {

    public CustomerBusTicket(String key) {
        this.mKey = key;
    }

    @Override
    public void showTicketInfo(String key) {
        Random random = new Random();
        System.out.println("Buy BusTicket " + mKey + " prize is " + random.nextInt(300));
        System.out.println("");
    }

}
