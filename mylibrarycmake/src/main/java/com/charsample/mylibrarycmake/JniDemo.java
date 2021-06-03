package com.charsample.mylibrarycmake;

public class JniDemo {
    static{
        System.loadLibrary("native-lib");
    }
    public static native String testJniDemoCmake();
}
