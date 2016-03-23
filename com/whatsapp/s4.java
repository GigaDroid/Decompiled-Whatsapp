package com.whatsapp;

import android.support.v4.content.ContextCompat;
import android.text.format.DateUtils;
import com.whatsapp.protocol.co;
import com.whatsapp.util.bz;

class s4 implements ey {
    final ConversationRowAudio a;
    int b;
    final i8 c;
    final co d;

    public void b() {
        if (this.c.b(this.a.e)) {
            ConversationRowAudio.b().put(this.d.k, Integer.valueOf(this.c.a()));
            ConversationRowAudio.b(this.a).setImageDrawable(new bz(ContextCompat.getDrawable(this.a.getContext(), 2130839590)));
            this.b = this.c.a() / 1000;
            ConversationRowAudio.f(this.a).setText(DateUtils.formatElapsedTime((long) this.b));
            ConversationRowAudio.c(this.a).setProgress(this.c.a());
            ConversationRowAudio.d(this.a);
        }
    }

    public void d() {
        if (this.c.b(this.a.e)) {
            ConversationRowAudio.b(this.a).setImageResource(2130839587);
            ConversationRowAudio.c(this.a).setMax(this.c.x());
            ConversationRowAudio.b().remove(this.d.k);
            this.b = -1;
            ConversationRowAudio.a(this.a);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        r5 = this;
        r4 = 0;
        r0 = r5.c;
        r1 = r5.a;
        r1 = r1.e;
        r0 = r0.b(r1);
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r0 = r5.a;
        r0 = com.whatsapp.ConversationRowAudio.b(r0);
        r1 = new com.whatsapp.util.bz;
        r2 = r5.a;
        r2 = r2.getContext();
        r3 = 2130839590; // 0x7f020826 float:1.7284195E38 double:1.052774638E-314;
        r2 = android.support.v4.content.ContextCompat.getDrawable(r2, r3);
        r1.<init>(r2);
        r0.setImageDrawable(r1);
        r0 = r5.d;
        r0 = r0.H;
        if (r0 == 0) goto L_0x0045;
    L_0x002f:
        r0 = r5.a;
        r0 = com.whatsapp.ConversationRowAudio.f(r0);
        r1 = r5.d;
        r1 = r1.H;
        r2 = (long) r1;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x005b;
    L_0x0045:
        r0 = r5.a;
        r0 = com.whatsapp.ConversationRowAudio.f(r0);
        r1 = r5.c;
        r1 = r1.x();
        r1 = r1 / 1000;
        r2 = (long) r1;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
    L_0x005b:
        r0 = com.whatsapp.ConversationRowAudio.b();
        r1 = r5.d;
        r1 = r1.k;
        r0 = r0.containsKey(r1);
        if (r0 != 0) goto L_0x007d;
    L_0x0069:
        r0 = r5.a;
        r0 = com.whatsapp.ConversationRowAudio.c(r0);
        r0.setProgress(r4);
        r0 = com.whatsapp.ConversationRowAudio.b();
        r1 = r5.d;
        r1 = r1.k;
        r0.remove(r1);
    L_0x007d:
        r0 = r5.a;
        com.whatsapp.ConversationRowAudio.d(r0);
        r0 = r5.a;
        com.whatsapp.ConversationRowAudio.a(r0, r4);
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.s4.a():void");
    }

    s4(ConversationRowAudio conversationRowAudio, i8 i8Var, co coVar) {
        this.a = conversationRowAudio;
        this.c = i8Var;
        this.d = coVar;
        this.b = -1;
    }

    public void a(int i) {
        if (this.c.b(this.a.e)) {
            if (this.b != i / 1000) {
                this.b = i / 1000;
                ConversationRowAudio.f(this.a).setText(DateUtils.formatElapsedTime((long) this.b));
            }
            ConversationRowAudio.c(this.a).setProgress(i);
        }
    }

    public void c() {
        if (this.c.b(this.a.e)) {
            ConversationRowAudio.b(this.a).setImageResource(2130839587);
            ConversationRowAudio.b().remove(this.d.k);
            ConversationRowAudio.a(this.a);
        }
    }

    public void a(boolean z) {
        if (!this.c.j()) {
            ConversationRowAudio.a(this.a, z);
        }
    }
}
