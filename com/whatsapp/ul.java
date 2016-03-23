package com.whatsapp;

import android.widget.TextView.OnEditorActionListener;

class ul implements OnEditorActionListener {
    final Conversation a;

    ul(Conversation conversation) {
        this.a = conversation;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onEditorAction(android.widget.TextView r8, int r9, android.view.KeyEvent r10) {
        /*
        r7 = this;
        r4 = 0;
        r5 = 1;
        r6 = com.whatsapp.DialogToastActivity.f;
        if (r10 == 0) goto L_0x0006;
    L_0x0006:
        r0 = 4;
        if (r9 != r0) goto L_0x000f;
    L_0x0009:
        r0 = r7.a;
        com.whatsapp.Conversation.G(r0);
    L_0x000e:
        return r5;
    L_0x000f:
        if (r10 == 0) goto L_0x007b;
    L_0x0011:
        r0 = r10.getKeyCode();
        r1 = 66;
        if (r0 != r1) goto L_0x007b;
    L_0x0019:
        r0 = r7.a;
        r0 = r0.B;
        if (r0 == 0) goto L_0x0025;
    L_0x001f:
        r0 = r7.a;
        r0.B = r4;
        if (r6 == 0) goto L_0x000e;
    L_0x0025:
        r0 = com.whatsapp.Conversation.G;
        if (r0 == 0) goto L_0x0030;
    L_0x0029:
        r0 = r7.a;
        com.whatsapp.Conversation.G(r0);
        if (r6 == 0) goto L_0x0076;
    L_0x0030:
        r0 = r7.a;
        r0 = com.whatsapp.Conversation.o(r0);
        r2 = r0.getSelectionStart();
        r0 = r7.a;
        r0 = com.whatsapp.Conversation.o(r0);
        r3 = r0.getSelectionEnd();
        r0 = r7.a;
        r0 = com.whatsapp.Conversation.o(r0);
        r0 = r0.length();
        if (r2 == r0) goto L_0x006a;
    L_0x0050:
        r0 = r7.a;
        r0 = com.whatsapp.Conversation.o(r0);
        r0 = r0.getText();
        r1 = java.lang.Math.min(r2, r3);
        r2 = java.lang.Math.max(r2, r3);
        r3 = "\n";
        r0.replace(r1, r2, r3, r4, r5);
        if (r6 == 0) goto L_0x0076;
    L_0x006a:
        r0 = r7.a;
        r0 = com.whatsapp.Conversation.o(r0);
        r1 = "\n";
        r0.append(r1);
    L_0x0076:
        r0 = r7.a;
        r0.B = r5;
        goto L_0x000e;
    L_0x007b:
        r5 = r4;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ul.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
    }
}
