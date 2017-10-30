package com.lyman.compositepattern.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/10/30
 * Description:
 */

public class Dirs implements IFile {
    private String mName;
    private List<IFile> mChilds = new ArrayList<>();
    public Dirs(String name){
        this.mName = name;
    }
    @Override
    public void addChild(IFile file) {
        mChilds.add(file);
    }

    @Override
    public void removeChild(IFile file) {
        mChilds.remove(file);
    }

    @Override
    public IFile getChild(int index) {
        return mChilds.get(index);
    }

    @Override
    public void operation() {
        System.out.println(mName);
        for (IFile child:mChilds) {
            System.out.print(mName+":");
            child.operation();
        }
    }
}
