package com.lyman.proxypattern.base;

/**
 * Created by Lyman on 2017/10/25.
 */
public class XiaoYe implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("Xiao ye submit");
    }

    @Override
    public void burden() {
        System.out.println("Xiao ye burden");
    }

    @Override
    public void defend() {
        System.out.println("Xiao ye defend");
    }

    @Override
    public void finish() {
        System.out.println("Xiao ye finish");
    }
}
