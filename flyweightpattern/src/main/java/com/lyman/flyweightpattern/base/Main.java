package com.lyman.flyweightpattern.base;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/11/13
 * Description:
 */

public class Main {
    public static void main(String[] args) {
        String key = "上海-北京";
        BusTicketFactory.showTicket(key);

        String key2 = "上海-南京";
        BusTicketFactory.showTicket(key2);

        BusTicketFactory.showTicket(key2);
    }
}
