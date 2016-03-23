package com.whatsapp;

import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class avx extends BaseAdapter implements Filterable {
    private static final String[] z;
    final MultipleContactsSelector a;
    private ArrayList b;
    private Filter c;

    static {
        String[] strArr = new String[2];
        String str = "\u0005\u0005";
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
                        i3 = 37;
                        break;
                    case at.g /*1*/:
                        i3 = 37;
                        break;
                    case at.i /*2*/:
                        i3 = 48;
                        break;
                    case at.o /*3*/:
                        i3 = 47;
                        break;
                    default:
                        i3 = 46;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0005\u0005";
                    obj = null;
            }
        }
    }

    public Filter getFilter() {
        return this.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
        r7 = this;
        r6 = 1;
        r5 = 0;
        r3 = r7.a(r8);
        if (r9 != 0) goto L_0x0016;
    L_0x0008:
        r0 = r7.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903080; // 0x7f030028 float:1.7412968E38 double:1.0528060064E-314;
        r2 = 0;
        r9 = com.whatsapp.aam.a(r0, r1, r2);
    L_0x0016:
        r0 = 2131755325; // 0x7f10013d float:1.9141526E38 double:1.0532270714E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = r7.a;
        r1 = com.whatsapp.MultipleContactsSelector.c(r1);
        r1.b(r3, r0);
        r0 = 2131755327; // 0x7f10013f float:1.914153E38 double:1.0532270724E-314;
        r0 = r9.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        com.whatsapp.a4d.a(r0);
        r1 = r7.a;
        r1 = com.whatsapp.MultipleContactsSelector.a(r1);
        r0.setContact(r3, r1);
        r1 = 2131755329; // 0x7f100141 float:1.9141534E38 double:1.0532270734E-314;
        r1 = r9.findViewById(r1);
        r1 = (com.whatsapp.TextEmojiLabel) r1;
        r2 = r3.p;
        r2 = com.whatsapp.aup.a(r2);
        if (r2 == 0) goto L_0x0061;
    L_0x004e:
        r2 = 2131232178; // 0x7f0805b2 float:1.8080458E38 double:1.0529686025E-314;
        r1.setText(r2);
        r2 = -7829368; // 0xffffffffff888888 float:NaN double:NaN;
        r0.setTextColor(r2);
        r9.setLongClickable(r6);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0087;
    L_0x0061:
        r2 = r3.w;
        if (r2 == 0) goto L_0x00a3;
    L_0x0065:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = r3.w;
        r2 = r2.append(r4);
        r4 = z;
        r4 = r4[r6];
        r2 = r2.append(r4);
        r2 = r2.toString();
    L_0x007c:
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0.setTextColor(r4);
        r1.a(r2);
        r9.setLongClickable(r5);
    L_0x0087:
        r0 = r7.a;
        r0 = r0.getResources();
        r1 = r3.a(r0);
        if (r1 == 0) goto L_0x009f;
    L_0x0093:
        r0 = 2131755328; // 0x7f100140 float:1.9141532E38 double:1.053227073E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0.setText(r1);
    L_0x009f:
        r9.setTag(r3);
        return r9;
    L_0x00a3:
        r2 = z;
        r2 = r2[r5];
        goto L_0x007c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avx.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public avx(MultipleContactsSelector multipleContactsSelector) {
        this.a = multipleContactsSelector;
        this.c = new aer(this, null);
    }

    static ArrayList a(avx com_whatsapp_avx, ArrayList arrayList) {
        com_whatsapp_avx.b = arrayList;
        return arrayList;
    }

    public Object getItem(int i) {
        return a(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public boolean hasStableIds() {
        return true;
    }

    public l5 a(int i) {
        return (l5) this.b.get(i);
    }

    public int getCount() {
        return this.b != null ? this.b.size() : 0;
    }
}
