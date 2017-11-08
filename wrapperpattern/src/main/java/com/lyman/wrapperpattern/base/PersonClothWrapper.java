package com.lyman.wrapperpattern.base;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/11/8
 * Description:
 */

public  class PersonClothWrapper extends PersonClothDecorator {
    public PersonClothWrapper(Person person) {
        super(person);
    }

    public void dressUpperCloth(){
        System.out.println("上衣穿起来");
    }

    public void dressLowerCloth(){
        System.out.println("下衣穿起来");
    }

    @Override
    public void dress() {
        super.dress();
        dressUpperCloth();
        dressLowerCloth();
    }
}
