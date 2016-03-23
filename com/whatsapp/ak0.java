package com.whatsapp;

import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Map;
import org.v;
import org.whispersystems.at;

class ak0 extends akc {
    private static final String[] z;
    final Conversation a;

    static {
        String[] strArr = new String[3];
        String str = "U'\u0002S\u000eD;\rQ\u0002Y&CI\u0002E<\u000fM\nX/\tADZ'\rA\u000eW:\u0000L\u000eDg\u0004@\nR-\u001eF\u0005Bh";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 54;
                        break;
                    case at.g /*1*/:
                        i3 = 72;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "U'\u0002S\u000eD;\rQ\u0002Y&CV\u001bW%CH\u000eE;\rB\u000e\u001b.\u001eJ\u0006\u001b%\t";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "U'\u0002S\u000eD;\rQ\u0002Y&CI\u0002E<\u000fM\nX/\tADZ'\rA\u000eW:\u0000L\u000eDg\u0002J\u001f@!\u001fL\tZ-CW\u000e['\u001a@\tC<\u0018J\u0005";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.co r5, int r6) {
        /*
        r4 = this;
        r3 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r5 == 0) goto L_0x0082;
    L_0x0005:
        r1 = r5.k;
        r1 = r1.c;
        r2 = r4.a;
        r2 = r2.ae;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0082;
    L_0x0013:
        r1 = r5.c;
        r2 = 8;
        if (r1 == r2) goto L_0x0082;
    L_0x0019:
        r1 = r4.a;
        r1 = com.whatsapp.Conversation.I(r1);
        if (r1 == 0) goto L_0x002c;
    L_0x0021:
        r1 = r4.a;
        r1 = com.whatsapp.Conversation.al(r1);
        r1.add(r5);
        if (r0 == 0) goto L_0x005d;
    L_0x002c:
        r1 = r4.a;
        r1 = com.whatsapp.Conversation.l(r1);
        if (r1 == 0) goto L_0x0046;
    L_0x0034:
        r1 = r4.a;
        r1 = r1.bd;
        r1 = r1.getCursor();
        r1.requery();
        r1 = r4.a;
        com.whatsapp.Conversation.g(r1, r3);
        if (r0 == 0) goto L_0x0051;
    L_0x0046:
        r0 = r5.k;
        r0 = r0.a;
        if (r0 != 0) goto L_0x0051;
    L_0x004c:
        r0 = r4.a;
        com.whatsapp.Conversation.a(r0, r5);
    L_0x0051:
        r0 = r4.a;
        r0 = r0.bd;
        r0.notifyDataSetChanged();
        r0 = r4.a;
        com.whatsapp.Conversation.ai(r0);
    L_0x005d:
        r0 = r4.a;
        r0 = com.whatsapp.Conversation.ag(r0);
        if (r0 == 0) goto L_0x0082;
    L_0x0065:
        r0 = r5.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0082;
    L_0x006b:
        r0 = r5.d;
        r1 = 6;
        if (r0 == r1) goto L_0x0082;
    L_0x0070:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r4.a;
        com.whatsapp.Conversation.ad(r0);
        r0 = r4.a;
        com.whatsapp.Conversation.c(r0, r3);
    L_0x0082:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ak0.a(com.whatsapp.protocol.co, int):void");
    }

    ak0(Conversation conversation) {
        this.a = conversation;
    }

    public void a(String str) {
        if (str != null && str.equals(this.a.ae)) {
            Conversation.aa(this.a);
            this.a.bd.getCursor().requery();
            if (!App.aK.O(this.a.ae) && Conversation.i(this.a) != null) {
                Conversation.i(this.a).setVisibility(8);
                this.a.bc.removeHeaderView(Conversation.i(this.a));
                Log.i(z[0] + this.a.bc.getHeaderViewsCount());
                Conversation.a(this.a, null);
                Log.i(z[1]);
                this.a.bd.notifyDataSetChanged();
            }
        }
    }

    public void b(co coVar, int i) {
        if (coVar != null && coVar.k.c.equals(this.a.ae) && coVar.c != 8) {
            Conversation.b(this.a, coVar);
            if (i == 3 && coVar.c == 1 && this.a.bc.getLastVisiblePosition() >= this.a.bc.getCount() - 2 && this.a.bc.getChildCount() > 0 && coVar.equals(this.a.bc.getChildAt(this.a.bc.getChildCount() - 1).getTag())) {
                Conversation.Y(this.a);
            }
        }
    }

    public void a(Collection collection, String str, Map map, boolean z) {
        boolean z2 = DialogToastActivity.f;
        if (!(collection == null || collection.isEmpty())) {
            for (co coVar : collection) {
                Conversation.B(this.a).add(coVar.k);
                if (z2) {
                    break;
                }
            }
            this.a.bd.getCursor().requery();
            if (!z2) {
                return;
            }
        }
        Conversation.aa(this.a);
    }

    public void b(co coVar) {
        if (coVar != null && coVar.k.c.equals(this.a.ae) && coVar.k.a && coVar.c != 8) {
            if (this.a.bd.getCursor() != null) {
                Conversation.aj(this.a).add(coVar);
            }
            if (Conversation.g(this.a) && coVar.d == 6 && (coVar.z == 1 || coVar.z == 4 || coVar.z == 5 || coVar.z == 7 || coVar.z == 12 || coVar.z == 13 || coVar.z == 14 || coVar.z == 17)) {
                Conversation.X(this.a);
            }
            if (Conversation.g(this.a) && Conversation.f(this.a) != 0) {
                a4l.a(this.a.bd, a4l.a(this.a.bd));
                Conversation.b(this.a, 0);
            }
            this.a.bd.notifyDataSetChanged();
            Conversation.Y(this.a);
        }
    }
}
