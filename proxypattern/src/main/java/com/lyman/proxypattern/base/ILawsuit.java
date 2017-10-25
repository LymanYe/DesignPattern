package com.lyman.proxypattern.base;

/**
 * Created by yelimin on 2017/10/25.
 */
public interface ILawsuit {
    //提交上诉
    void submit();

    //进行举证
    void burden();

    //开始辩护
    void defend();

    //诉讼完成
    void finish();
}
