LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES:= \
	com_charsample_mylibraryndkdemo_JniNdkDemo.cpp \
	native-lib.cpp
	

#LOCAL_SHARED_LIBRARIES :=


	
	

LOCAL_LDLIBS := -llog
LOCAL_CFLAGS += -fPIC -shared -I$(LOCAL_PATH)/../include
LOCAL_LDFLAGS += -fPIC -shared

LOCAL_MODULE_TAGS := debug
#LOCAL_MODULE_TAGS := option
LOCAL_MODULE:= jnindkdemo

LOCAL_PRELINK_MODULE := false 

include $(BUILD_SHARED_LIBRARY)

