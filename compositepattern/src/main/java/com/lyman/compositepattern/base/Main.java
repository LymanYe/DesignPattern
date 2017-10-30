package com.lyman.compositepattern.base;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/10/30
 * Description:
 */

public class Main {
    public static void main(String[] args){
        IFile root = new Dirs("root");
        IFile subDir = new Dirs("subDir");
        IFile leaf1 = new LeafFile("leaf1");
        IFile leaf2 = new LeafFile("leaf2");
        subDir.addChild(leaf1);
        root.addChild(subDir);
        root.addChild(leaf2);
        root.operation();
    }
}
