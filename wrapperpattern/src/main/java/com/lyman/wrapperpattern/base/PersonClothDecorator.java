package com.lyman.wrapperpattern.base;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/11/8
 * Description:
 */

public abstract class PersonClothDecorator extends Person {
    private Person mPerson;
    public PersonClothDecorator(Person person){
        this.mPerson = person;
    }
    @Override
    public void dress() {
        mPerson.dress();
    }
}
