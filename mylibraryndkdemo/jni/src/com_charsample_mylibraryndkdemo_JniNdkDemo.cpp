#include "com_charsample_mylibraryndkdemo_JniNdkDemo.h"

extern "C" JNIEXPORT jstring  Java_com_charsample_mylibraryndkdemo_JniNdkDemo_ndkDemo(JNIEnv *env, jclass classz){
return env->NewStringUTF("testjnidemo ndk");
}