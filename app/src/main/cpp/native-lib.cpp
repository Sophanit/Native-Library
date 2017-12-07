#include <jni.h>
#include <string>

extern "C"
{
using namespace std;

JNIEXPORT jstring JNICALL
Java_rxandroid_androidapp_com_myapplication_NativeLibrary_stringFromJNI(JNIEnv *env, jclass type) {
    string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

JNIEXPORT jstring JNICALL
Java_rxandroid_androidapp_com_myapplication_NativeLibrary_getMyNewString(JNIEnv *env, jclass type) {
    string hello = "Hello from C++ New String";
    return env->NewStringUTF(hello.c_str());
}

}
