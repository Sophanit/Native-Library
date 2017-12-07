package rxandroid.androidapp.com.myapplication;

/**
 * Created by sophanit on 12/7/17.
 */

class NativeLibrary {
    static {
        System.loadLibrary("native-lib");
    }

    public static native String stringFromJNI();

    public static native String getMyNewString();
}
