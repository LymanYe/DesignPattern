package com.lyman.flyweightpattern.base;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/11/13
 * Description:
 */

public abstract class BusTicket {
    protected String mKey;

    public abstract void showTicketInfo(String key);
}
