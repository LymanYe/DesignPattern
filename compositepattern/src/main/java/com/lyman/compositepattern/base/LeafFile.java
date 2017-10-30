package com.lyman.compositepattern.base;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/10/30
 * Description:
 */

public class LeafFile implements IFile{
    private String mName;
    public LeafFile(String name){
        this.mName = name;
    }
    @Override
    public void addChild(IFile file) {
        throw new UnsupportedOperationException("can not add child on leaf");
    }

    @Override
    public void removeChild(IFile file) {
        throw new UnsupportedOperationException("can not remove child on leaf");
    }

    @Override
    public IFile getChild(int index) {
        throw new UnsupportedOperationException("can not get child on leaf");
    }

    @Override
    public void operation() {
        System.out.println(mName);
    }
}
