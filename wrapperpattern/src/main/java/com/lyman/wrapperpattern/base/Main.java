package com.lyman.wrapperpattern.base;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/11/8
 * Description:
 */

public class Main {
    public static void main(String[] args){
        Person person,personWrap;
        person = new XiaoYe();
        personWrap = new PersonClothWrapper(person);
        personWrap.dress();
    }
}
