package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import java.util.List;
import org.v;
import org.whispersystems.at;

class uy extends ArrayAdapter {
    private static final String z;
    public final LayoutInflater a;
    final GroupChatInfo b;

    static {
        char[] toCharArray = "e\u0011[o*D\u0016\u0006y2UL\u001b}6".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 98;
                    break;
                case at.i /*2*/:
                    i2 = 117;
                    break;
                case at.o /*3*/:
                    i2 = 24;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private boolean a(int i) {
        return App.as.d(((l5) GroupChatInfo.e(this.b).get(i)).p);
    }

    public int getCount() {
        return GroupChatInfo.e(this.b).size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10 = this;
        r9 = 2131623991; // 0x7f0e0037 float:1.887515E38 double:1.053162184E-314;
        r6 = 8;
        r3 = 0;
        r8 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        if (r12 != 0) goto L_0x006c;
    L_0x000b:
        r0 = r10.a;
        r1 = 2130903191; // 0x7f030097 float:1.7413193E38 double:1.0528060613E-314;
        r2 = com.whatsapp.aam.a(r0, r1, r13, r8);
        r1 = new com.whatsapp.an_;
        r1.<init>(r3);
        r0 = 2131755466; // 0x7f1001ca float:1.9141812E38 double:1.053227141E-314;
        r0 = r2.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r1.a = r0;
        r0 = 2131755352; // 0x7f100158 float:1.914158E38 double:1.053227085E-314;
        r0 = r2.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r1.e = r0;
        r0 = 2131755675; // 0x7f10029b float:1.9142236E38 double:1.0532272443E-314;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1.b = r0;
        r0 = 2131755676; // 0x7f10029c float:1.9142238E38 double:1.053227245E-314;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1.f = r0;
        r0 = 2131755677; // 0x7f10029d float:1.914224E38 double:1.0532272453E-314;
        r0 = r2.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r1.g = r0;
        r0 = 2131755376; // 0x7f100170 float:1.914163E38 double:1.0532270966E-314;
        r0 = r2.findViewById(r0);
        r1.c = r0;
        r2.setTag(r1);
        r0 = r10.getContext();
        r5 = 2131624087; // 0x7f0e0097 float:1.8875344E38 double:1.053162231E-314;
        r0 = android.support.v4.content.ContextCompat.getColor(r0, r5);
        r2.setBackgroundColor(r0);
        if (r4 == 0) goto L_0x01c2;
    L_0x006c:
        r0 = r12.getTag();
        r0 = (com.whatsapp.an_) r0;
        r1 = r0;
    L_0x0073:
        r0 = r10.getCount();
        r0 = r0 + -1;
        if (r11 != r0) goto L_0x0082;
    L_0x007b:
        r0 = r1.c;
        r0.setVisibility(r6);
        if (r4 == 0) goto L_0x0087;
    L_0x0082:
        r0 = r1.c;
        r0.setVisibility(r8);
    L_0x0087:
        r0 = r1.a;
        r0.setText(r3);
        r0 = r1.a;
        r2 = r10.getContext();
        r5 = 2131624033; // 0x7f0e0061 float:1.8875234E38 double:1.0531622046E-314;
        r2 = android.support.v4.content.ContextCompat.getColor(r2, r5);
        r0.setTextColor(r2);
        r0 = r1.e;
        r0.setText(r3);
        r0 = r1.e;
        r2 = r10.getContext();
        r5 = 2131624032; // 0x7f0e0060 float:1.8875232E38 double:1.053162204E-314;
        r2 = android.support.v4.content.ContextCompat.getColor(r2, r5);
        r0.setTextColor(r2);
        r0 = r1.f;
        r0.setVisibility(r6);
        r0 = r1.g;
        r0.setVisibility(r6);
        r0 = r10.a(r11);
        if (r0 == 0) goto L_0x0129;
    L_0x00c1:
        r1.d = r3;
        r0 = r1.a;
        r2 = r10.b;
        r5 = 2131232301; // 0x7f08062d float:1.8080707E38 double:1.052968663E-314;
        r2 = r2.getString(r5);
        r0.setText(r2);
        r0 = com.whatsapp.App.S;
        if (r0 != 0) goto L_0x00fe;
    L_0x00d5:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = com.whatsapp.App.ad();
        r0 = r0.append(r2);
        r2 = z;
        r0 = r0.append(r2);
        r0 = r0.toString();
        r6 = 0;
        r2 = new android.os.Messenger;
        r5 = r10.b;
        r5 = com.whatsapp.GroupChatInfo.B(r5);
        r2.<init>(r5);
        com.whatsapp.App.a(r0, r6, r2);
        if (r4 == 0) goto L_0x0105;
    L_0x00fe:
        r0 = r1.e;
        r2 = com.whatsapp.App.v;
        r0.a(r2);
    L_0x0105:
        r0 = r10.b;
        r0 = com.whatsapp.GroupChatInfo.q(r0);
        r0 = com.whatsapp.qm.d(r0);
        if (r0 == 0) goto L_0x0116;
    L_0x0111:
        r0 = r1.f;
        r0.setVisibility(r8);
    L_0x0116:
        r0 = r10.b;
        r0 = com.whatsapp.GroupChatInfo.b(r0);
        r2 = com.whatsapp.App.as;
        r2 = r2.e();
        r5 = r1.b;
        r0.b(r2, r5);
        if (r4 == 0) goto L_0x01bf;
    L_0x0129:
        r0 = r10.getItem(r11);
        r0 = (com.whatsapp.l5) r0;
        r1.d = r0;
        r2 = r1.a;
        r2.setContact(r0);
        r2 = r10.b;
        r2 = com.whatsapp.GroupChatInfo.r(r2);
        r5 = r0.p;
        r2 = r2.containsKey(r5);
        if (r2 == 0) goto L_0x0170;
    L_0x0144:
        r2 = r1.b;
        r5 = 2130839515; // 0x7f0207db float:1.7284043E38 double:1.052774601E-314;
        r2.setImageResource(r5);
        r2 = r1.a;
        r5 = r10.getContext();
        r5 = android.support.v4.content.ContextCompat.getColor(r5, r9);
        r2.setTextColor(r5);
        r2 = r1.e;
        r5 = r10.getContext();
        r5 = android.support.v4.content.ContextCompat.getColor(r5, r9);
        r2.setTextColor(r5);
        r2 = r1.e;
        r5 = 2131232134; // 0x7f080586 float:1.8080369E38 double:1.0529685807E-314;
        r2.setText(r5);
        if (r4 == 0) goto L_0x01bf;
    L_0x0170:
        r2 = r10.b;
        r2 = com.whatsapp.GroupChatInfo.q(r2);
        r4 = r0.p;
        r2 = com.whatsapp.qm.c(r2, r4);
        if (r2 == 0) goto L_0x0183;
    L_0x017e:
        r2 = r1.f;
        r2.setVisibility(r8);
    L_0x0183:
        r2 = r10.b;
        r2 = com.whatsapp.GroupChatInfo.b(r2);
        r4 = r1.b;
        r2.b(r0, r4);
        r2 = r0.n();
        if (r2 == 0) goto L_0x01b8;
    L_0x0194:
        r2 = r1.g;
        r2.setVisibility(r8);
        r4 = r1.g;
        r2 = r0.f;
        if (r2 == 0) goto L_0x01c0;
    L_0x019f:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "~";
        r2 = r2.append(r3);
        r3 = r0.f;
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x01b5:
        r4.a(r2);
    L_0x01b8:
        r1 = r1.e;
        r0 = r0.w;
        r1.a(r0);
    L_0x01bf:
        return r12;
    L_0x01c0:
        r2 = r3;
        goto L_0x01b5;
    L_0x01c2:
        r12 = r2;
        goto L_0x0073;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.uy.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public uy(GroupChatInfo groupChatInfo, Context context, List list) {
        this.b = groupChatInfo;
        super(context, 2130903191, list);
        this.a = LayoutInflater.from(context);
    }
}
