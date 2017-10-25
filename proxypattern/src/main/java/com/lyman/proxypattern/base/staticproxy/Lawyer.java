package com.lyman.proxypattern.base.staticproxy;


import com.lyman.proxypattern.base.ILawsuit;

/**
 * Created by Lyman on 2017/10/25.
 */
public class Lawyer implements ILawsuit {
    private ILawsuit mCustomer;

    public Lawyer(ILawsuit customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer can not be empty");
        }
        this.mCustomer = customer;
    }

    @Override
    public void submit() {
        mCustomer.submit();
    }

    @Override
    public void burden() {
        mCustomer.burden();
    }

    @Override
    public void defend() {
        mCustomer.defend();
    }

    @Override
    public void finish() {
        mCustomer.finish();
    }
}
