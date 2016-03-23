package com.whatsapp;

import android.view.KeyEvent;

class ake implements a23 {
    final Conversation a;

    public void a(int i) {
        int selectionStart = Conversation.o(this.a).getSelectionStart();
        int selectionEnd = Conversation.o(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(Conversation.o(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a28.b(i));
        Conversation.o(this.a).setText(stringBuilder);
        Conversation.o(this.a).setSelection(selectionEnd + a28.d(i));
    }

    public void a() {
        Conversation.o(this.a).dispatchKeyEvent(new KeyEvent(0, 67));
    }

    ake(Conversation conversation) {
        this.a = conversation;
    }
}
