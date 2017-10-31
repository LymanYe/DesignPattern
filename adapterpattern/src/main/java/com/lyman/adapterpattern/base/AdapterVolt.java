package com.lyman.adapterpattern.base;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/10/31
 * Description:
 */

public class AdapterVolt implements Target20Volt{
    Adaptee220Volt mAdaptee;
    public AdapterVolt(Adaptee220Volt adaptee220Volt){
        this.mAdaptee = adaptee220Volt;
    }

    public int get220Volt(){
        return mAdaptee.get220Volt();
    }
    @Override
    public int get20Volt() {
        return 20;
    }
}
