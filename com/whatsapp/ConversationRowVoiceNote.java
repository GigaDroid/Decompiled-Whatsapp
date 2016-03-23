package com.whatsapp;

import android.content.Context;
import android.widget.ImageView;
import com.whatsapp.protocol.co;

public class ConversationRowVoiceNote extends ConversationRowAudio {
    private final ImageView ae;
    private final ImageView af;
    private final VoiceNoteSeekBar ag;
    private final ImageView ah;

    ConversationRowVoiceNote(Context context, co coVar) {
        super(context, coVar);
        this.ae = (ImageView) findViewById(2131755434);
        this.ah = (ImageView) findViewById(2131755533);
        this.af = (ImageView) findViewById(2131755565);
        this.ag = (VoiceNoteSeekBar) findViewById(2131755527);
        c(coVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.whatsapp.protocol.co r9) {
        /*
        r8 = this;
        r7 = 2131624084; // 0x7f0e0094 float:1.8875338E38 double:1.0531622298E-314;
        r6 = 2130839661; // 0x7f02086d float:1.7284339E38 double:1.0527746733E-314;
        r5 = 8;
        r4 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x004b;
    L_0x0011:
        r0 = r9.d;
        if (r0 != r5) goto L_0x002d;
    L_0x0015:
        r0 = r8.af;
        r0.setImageResource(r6);
        r0 = r8.ag;
        r2 = r8.getContext();
        r2 = r2.getResources();
        r2 = r2.getColor(r7);
        r0.setProgressColor(r2);
        if (r1 == 0) goto L_0x008b;
    L_0x002d:
        r0 = r8.af;
        r2 = 2130839654; // 0x7f020866 float:1.7284325E38 double:1.05277467E-314;
        r0.setImageResource(r2);
        r0 = r8.ag;
        r2 = r8.getContext();
        r2 = r2.getResources();
        r3 = 2131624086; // 0x7f0e0096 float:1.8875342E38 double:1.0531622307E-314;
        r2 = r2.getColor(r3);
        r0.setProgressColor(r2);
        if (r1 == 0) goto L_0x008b;
    L_0x004b:
        r0 = r9.d;
        r2 = 9;
        if (r0 == r2) goto L_0x0057;
    L_0x0051:
        r0 = r9.d;
        r2 = 10;
        if (r0 != r2) goto L_0x006f;
    L_0x0057:
        r0 = r8.af;
        r0.setImageResource(r6);
        r0 = r8.ag;
        r2 = r8.getContext();
        r2 = r2.getResources();
        r2 = r2.getColor(r7);
        r0.setProgressColor(r2);
        if (r1 == 0) goto L_0x008b;
    L_0x006f:
        r0 = r8.af;
        r2 = 2130839660; // 0x7f02086c float:1.7284337E38 double:1.052774673E-314;
        r0.setImageResource(r2);
        r0 = r8.ag;
        r2 = r8.getContext();
        r2 = r2.getResources();
        r3 = 2131624085; // 0x7f0e0095 float:1.887534E38 double:1.05316223E-314;
        r2 = r2.getColor(r3);
        r0.setProgressColor(r2);
    L_0x008b:
        r0 = r9.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r2 = r0.transferring;
        if (r2 != 0) goto L_0x00b0;
    L_0x0093:
        r0 = r0.transferred;
        if (r0 != 0) goto L_0x00b0;
    L_0x0097:
        r0 = r9.x;
        if (r0 == 0) goto L_0x00ab;
    L_0x009b:
        r0 = r9.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x00ab;
    L_0x00a1:
        r0 = r9.k;
        r0 = r0.c;
        r0 = com.whatsapp.l5.g(r0);
        if (r0 == 0) goto L_0x00b0;
    L_0x00ab:
        r0 = r8.ag;
        r0.setProgressColor(r4);
    L_0x00b0:
        r0 = r8.ae;
        r2 = r9.k;
        r2 = r2.a;
        if (r2 != 0) goto L_0x00d6;
    L_0x00b8:
        r0 = r8.a;
        if (r0 == 0) goto L_0x00ca;
    L_0x00bc:
        r0 = r8.ah;
        r0.setVisibility(r4);
        r0 = r8.ae;
        r0.setVisibility(r5);
        r0 = r8.ah;
        if (r1 == 0) goto L_0x00d6;
    L_0x00ca:
        r0 = r8.ah;
        r0.setVisibility(r5);
        r0 = r8.ae;
        r0.setVisibility(r4);
        r0 = r8.ae;
    L_0x00d6:
        r2 = r9.k;
        r2 = r2.a;
        if (r2 == 0) goto L_0x00e9;
    L_0x00dc:
        r2 = F;
        r3 = com.whatsapp.App.as;
        r3 = r3.e();
        r2.b(r3, r0);
        if (r1 == 0) goto L_0x00fa;
    L_0x00e9:
        r1 = r8.a;
        if (r1 == 0) goto L_0x00fb;
    L_0x00ed:
        r1 = r9.t;
    L_0x00ef:
        r2 = F;
        r3 = com.whatsapp.App.as;
        r1 = r3.b(r1);
        r2.b(r1, r0);
    L_0x00fa:
        return;
    L_0x00fb:
        r1 = r9.k;
        r1 = r1.c;
        goto L_0x00ef;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowVoiceNote.c(com.whatsapp.protocol.co):void");
    }

    protected int g() {
        return 2130903139;
    }

    public void i() {
        super.i();
        c(this.e);
    }

    public void a(co coVar, boolean z) {
        Object obj = coVar != this.e ? 1 : null;
        super.a(coVar, z);
        if (obj != null || z) {
            c(coVar);
        }
    }

    protected int h() {
        return 2130903141;
    }

    public void a(String str) {
        if (this.e != null && !this.e.k.a) {
            String str2;
            if (this.a) {
                str2 = this.e.t;
            } else {
                str2 = this.e.k.c;
            }
            if (str.equals(str2)) {
                F.b(App.as.b(str2), this.a ? this.ah : this.ae);
            }
        }
    }
}
