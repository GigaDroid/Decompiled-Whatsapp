package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.view.KeyEvent;
import android.widget.EditText;
import com.whatsapp.a23;
import com.whatsapp.a28;
import org.v;
import org.whispersystems.at;

class as implements a23 {
    private static final String z;
    final ImagePreview a;

    static {
        char[] toCharArray = "C+%2".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 38;
                    break;
                case at.g /*1*/:
                    i2 = 79;
                    break;
                case at.i /*2*/:
                    i2 = 76;
                    break;
                case at.o /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(int i) {
        EditText a = a();
        if (a != null) {
            int selectionStart = a.getSelectionStart();
            int selectionEnd = a.getSelectionEnd();
            if (selectionStart <= selectionEnd) {
                int i2 = selectionEnd;
                selectionEnd = selectionStart;
                selectionStart = i2;
            }
            CharSequence stringBuilder = new StringBuilder(a.getText().toString());
            stringBuilder.replace(selectionEnd, selectionStart, a28.b(i));
            if (a28.c(stringBuilder) <= 1024) {
                a.setText(stringBuilder);
                a.setSelection(a28.d(i) + selectionEnd);
            } else {
                return;
            }
        }
        ImagePreview.u(this.a).dismiss();
    }

    public void m735a() {
        EditText a = a();
        if (a != null) {
            a.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    private EditText a() {
        if (ImagePreview.o(this.a) < 0) {
            return null;
        }
        return (EditText) ImagePreview.e(this.a).findViewWithTag(((Uri) ImagePreview.c(this.a).get(ImagePreview.o(this.a))).toString() + z);
    }

    as(ImagePreview imagePreview) {
        this.a = imagePreview;
    }
}
