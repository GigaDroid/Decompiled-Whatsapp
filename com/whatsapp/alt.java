package com.whatsapp;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import org.v;
import org.whispersystems.at;

class alt implements OnEditorActionListener {
    private static final String z;
    final VideoPreviewActivity a;

    static {
        char[] toCharArray = "v6\rb]@5\u0018cAp<".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 31;
                    break;
                case at.g /*1*/:
                    i2 = 88;
                    break;
                case at.i /*2*/:
                    i2 = 125;
                    break;
                case at.o /*3*/:
                    i2 = 23;
                    break;
                default:
                    i2 = 41;
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
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(VideoPreviewActivity.m(this.a).getWindowToken(), 0);
        return true;
    }

    alt(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }
}
