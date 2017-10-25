package com.lyman.proxypattern.base.dynamicproxy;

import com.lyman.proxypattern.base.ILawsuit;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Lyman on 2017/10/25.
 */
public class DynamicLawyer implements InvocationHandler {
    private Object mObject;

    public Object getInstance(Object object) {
        this.mObject = object;
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(mObject.getClass().getClassLoader(), new Class[]{ILawsuit.class}, this);
        return lawyer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(mObject, args);
    }
}
