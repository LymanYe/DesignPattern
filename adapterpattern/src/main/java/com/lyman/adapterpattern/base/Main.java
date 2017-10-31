package com.lyman.adapterpattern.base;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/10/31
 * Description:
 */

public class Main {
    public static void main(String[] args){
        AdapterVolt adapterVolt = new AdapterVolt(new Adaptee220Volt());
        int volt = adapterVolt.get20Volt();
        System.out.println(volt);
    }
}
