package com.lyman.compositepattern.base;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/10/30
 * Description:
 */

public interface IFile {
    void addChild(IFile file);
    void removeChild(IFile file);
    IFile getChild(int index);
    void operation();
}
