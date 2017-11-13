package com.lyman.flyweightpattern.base;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/11/13
 * Description:
 */

public class CattleBusTickets extends BusTicket {
    private List<BusTicket> mBusTickets = new ArrayList<>();

    @Override
    public void showTicketInfo(String key) {
        for (BusTicket ticket : mBusTickets) {
            if (TextUtils.equals(ticket.mKey, key)) {
                System.out.print("有票：");
                ticket.showTicketInfo(key);
            } else {
                System.out.print("无票：");
            }
        }
    }

    public void addTicket(BusTicket ticket) {
        mBusTickets.add(ticket);
    }

    public void removeTicket(BusTicket ticket) {
        mBusTickets.remove(ticket);
    }

    public BusTicket getTicket(String key) {
        for (BusTicket ticket : mBusTickets) {
            if (key.equals(ticket.mKey)) {
                return ticket;
            }
        }
        return null;
    }
}
