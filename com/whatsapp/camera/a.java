package com.whatsapp.camera;

import android.view.KeyEvent;
import com.whatsapp.a23;
import com.whatsapp.a28;

class a implements a23 {
    final CameraActivity a;

    a(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public void a(int i) {
        int selectionStart = CameraActivity.f(this.a).getSelectionStart();
        int selectionEnd = CameraActivity.f(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(CameraActivity.f(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a28.b(i));
        if (a28.c(stringBuilder) <= 1024) {
            CameraActivity.f(this.a).setText(stringBuilder);
            CameraActivity.f(this.a).setSelection(selectionEnd + a28.d(i));
            CameraActivity.t(this.a).dismiss();
        }
    }

    public void a() {
        CameraActivity.f(this.a).dispatchKeyEvent(new KeyEvent(0, 67));
    }
}
