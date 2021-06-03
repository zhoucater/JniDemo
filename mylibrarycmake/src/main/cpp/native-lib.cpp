//
// Created by charbaby on 2021/6/1.
//

#include <jni.h>


extern "C" JNIEXPORT jstring  Java_com_charsample_mylibrarycmake_JniDemo_testJniDemoCmake(JNIEnv *env, jclass classz){
    return env->NewStringUTF("testjnidemo cmake");
}