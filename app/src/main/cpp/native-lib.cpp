#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_firebaseauth_App_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "AIzaSyBdWsAbuTRm9Z7_OObmHiJ3Q3fMjm3TgAI";
    return env->NewStringUTF(hello.c_str());
}