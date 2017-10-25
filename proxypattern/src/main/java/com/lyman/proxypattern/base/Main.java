package com.lyman.proxypattern.base;


import com.lyman.proxypattern.base.dynamicproxy.DynamicLawyer;
import com.lyman.proxypattern.base.staticproxy.Lawyer;

/**
 * Created by Lyman on 2017/10/25.
 */
public class Main {
    public static void main(String[] args) {
        //staticProxyMethod();
        dynamicProxyMethod();

    }

    private static void dynamicProxyMethod() {
        ILawsuit xiaoye = new XiaoYe();
        DynamicLawyer dynamicLawyer = new DynamicLawyer();
        ILawsuit lawyer = (ILawsuit) dynamicLawyer.getInstance(xiaoye);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }

    private static void staticProxyMethod() {
        ILawsuit xiaoye = new XiaoYe();
        ILawsuit lawyer = new Lawyer(xiaoye);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
