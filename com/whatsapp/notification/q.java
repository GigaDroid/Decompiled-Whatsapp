package com.whatsapp.notification;

import com.whatsapp.a23;
import com.whatsapp.a28;

class q implements a23 {
    final PopupNotification a;

    q(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void a(int i) {
        PopupNotification.o(this.a).dismiss();
        int selectionStart = PopupNotification.c(this.a).getSelectionStart();
        int selectionEnd = PopupNotification.c(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(PopupNotification.c(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a28.b(i));
        PopupNotification.c(this.a).setText(stringBuilder);
        if (selectionEnd <= PopupNotification.c(this.a).length() - a28.d(i)) {
            PopupNotification.c(this.a).setSelection(selectionEnd + a28.d(i));
        }
    }

    public void a() {
    }
}
