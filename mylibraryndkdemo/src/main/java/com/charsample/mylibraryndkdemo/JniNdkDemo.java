package com.charsample.mylibraryndkdemo;

public class JniNdkDemo {
    static{
        System.loadLibrary("jnindkdemo");
    }
    public static native String ndkDemo();

    public static  String ndkDemoX(){
        return ndkDemo();
    }
}
