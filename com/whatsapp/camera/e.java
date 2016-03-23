package com.whatsapp.camera;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import org.v;
import org.whispersystems.at;

class e implements OnEditorActionListener {
    private static final String z;
    final CameraActivity a;

    static {
        char[] toCharArray = "l\u0010\u0005P[Z\u0013\u0010QGj\u001a".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 5;
                    break;
                case at.g /*1*/:
                    i2 = 126;
                    break;
                case at.i /*2*/:
                    i2 = 117;
                    break;
                case at.o /*3*/:
                    i2 = 37;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(CameraActivity.f(this.a).getWindowToken(), 0);
        return true;
    }

    e(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }
}
