package com.whatsapp;

import android.text.TextWatcher;

class at1 implements TextWatcher {
    final Conversation a;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aam.a(Conversation.o(this.a), charSequence);
    }

    at1(Conversation conversation) {
        this.a = conversation;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r10) {
        /*
        r9 = this;
        r8 = 0;
        r7 = 8;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = r10.toString();
        r0 = com.whatsapp.Conversation.l(r4);
        if (r0 != 0) goto L_0x0115;
    L_0x0011:
        r0 = r1;
    L_0x0012:
        r5 = r9.a;
        r5 = com.whatsapp.Conversation.s(r5);
        r5.setEnabled(r0);
        r5 = r9.a;
        r5 = com.whatsapp.Conversation.M(r5);
        r5 = r5.getVisibility();
        if (r5 != r7) goto L_0x006d;
    L_0x0027:
        if (r0 != 0) goto L_0x006d;
    L_0x0029:
        r5 = r9.a;
        r5 = com.whatsapp.Conversation.M(r5);
        r6 = com.whatsapp.a9z.a(r1);
        r5.startAnimation(r6);
        r5 = r9.a;
        r5 = com.whatsapp.Conversation.M(r5);
        r5.setVisibility(r2);
        r5 = r9.a;
        r5 = com.whatsapp.Conversation.ak(r5);
        r6 = com.whatsapp.Conversation.d(r1);
        r5.startAnimation(r6);
        r5 = r9.a;
        r5 = com.whatsapp.Conversation.ak(r5);
        r5.setVisibility(r2);
        r5 = r9.a;
        r5 = com.whatsapp.Conversation.s(r5);
        r6 = com.whatsapp.a9z.a(r2);
        r5.startAnimation(r6);
        r5 = r9.a;
        r5 = com.whatsapp.Conversation.s(r5);
        r5.setVisibility(r7);
        if (r3 == 0) goto L_0x00bd;
    L_0x006d:
        r5 = r9.a;
        r5 = com.whatsapp.Conversation.M(r5);
        r5 = r5.getVisibility();
        if (r5 != 0) goto L_0x00bd;
    L_0x0079:
        if (r0 == 0) goto L_0x00bd;
    L_0x007b:
        r0 = r9.a;
        r0 = com.whatsapp.Conversation.M(r0);
        r5 = com.whatsapp.a9z.a(r2);
        r0.startAnimation(r5);
        r0 = r9.a;
        r0 = com.whatsapp.Conversation.M(r0);
        r0.setVisibility(r7);
        r0 = r9.a;
        r0 = com.whatsapp.Conversation.ak(r0);
        r5 = com.whatsapp.Conversation.d(r2);
        r0.startAnimation(r5);
        r0 = r9.a;
        r0 = com.whatsapp.Conversation.ak(r0);
        r0.setVisibility(r7);
        r0 = r9.a;
        r0 = com.whatsapp.Conversation.s(r0);
        r1 = com.whatsapp.a9z.a(r1);
        r0.startAnimation(r1);
        r0 = r9.a;
        r0 = com.whatsapp.Conversation.s(r0);
        r0.setVisibility(r2);
    L_0x00bd:
        r0 = com.whatsapp.util.ac.d(r4);
        r1 = r9.a;
        r1 = com.whatsapp.Conversation.as(r1);
        r2 = r9.a;
        com.whatsapp.Conversation.f(r2, r0);
        if (r0 == 0) goto L_0x0100;
    L_0x00ce:
        r2 = r9.a;
        r2 = com.whatsapp.Conversation.R(r2);
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x0100;
    L_0x00da:
        r2 = r9.a;
        com.whatsapp.Conversation.d(r2, r8);
        r1 = android.text.TextUtils.equals(r1, r0);
        if (r1 != 0) goto L_0x0105;
    L_0x00e5:
        r1 = r9.a;
        r2 = com.whatsapp.ae2.a(r0);
        r1.a(r2);
        r1 = r9.a;
        r1 = com.whatsapp.Conversation.r(r1);
        if (r1 != 0) goto L_0x0105;
    L_0x00f6:
        r1 = new com.whatsapp.k2;
        r1.<init>(r9);
        com.whatsapp.ae2.a(r0, r1);
        if (r3 == 0) goto L_0x0105;
    L_0x0100:
        r0 = r9.a;
        r0.a(r8);
    L_0x0105:
        r0 = r9.a;
        r1 = r9.a;
        r1 = com.whatsapp.Conversation.o(r1);
        r1 = r1.getPaint();
        com.whatsapp.a28.a(r10, r0, r1);
        return;
    L_0x0115:
        r0 = r2;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.at1.afterTextChanged(android.text.Editable):void");
    }
}
