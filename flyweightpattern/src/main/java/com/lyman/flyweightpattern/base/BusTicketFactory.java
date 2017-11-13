package com.lyman.flyweightpattern.base;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/11/13
 * Description:
 */

public class BusTicketFactory {
    private static Map<String, BusTicket> mTicketMap = new ConcurrentHashMap<String, BusTicket>();
    private static CattleBusTickets mCattle = new CattleBusTickets();

    static {
        CustomerBusTicket ticket = new CustomerBusTicket("上海-北京");
        mCattle.addTicket(ticket);
    }

    public static void showTicket(String key) {
        if (mCattle.getTicket(key) != null) {
            System.out.print("黄牛车票：");
            mCattle.getTicket(key).showTicketInfo(key);
        } else if (mTicketMap.containsKey(key)) {
            System.out.print("使用缓存车票：");
            mTicketMap.get(key).showTicketInfo(key);
        } else {
            System.out.print("创建车票：");
            BusTicket ticket = new CustomerBusTicket(key);
            mTicketMap.put(key, ticket);
            mTicketMap.get(key).showTicketInfo(key);
        }
    }
}
