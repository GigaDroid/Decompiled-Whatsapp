package com.whatsapp;

import android.widget.BaseAdapter;
import java.util.List;
import org.v;
import org.whispersystems.at;

class ny extends BaseAdapter {
    private static final String[] z;
    protected List a;
    final WebSessionsActivity b;

    static {
        String[] strArr = new String[6];
        String str = "\u0004\u000f";
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
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 69;
                        break;
                    case at.o /*3*/:
                        i3 = 61;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001e\u000b#\\\u000e\u0004";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0002\u001a O\u001d";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\b\u000e\"X";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000e\u00027R\u0011\b";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000b\u00037X\u001a\u0002\u0012";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int getViewTypeCount() {
        return 1;
    }

    ny(WebSessionsActivity webSessionsActivity, u5 u5Var) {
        this(webSessionsActivity);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public Object getItem(int i) {
        return a(i);
    }

    private ny(WebSessionsActivity webSessionsActivity) {
        this.b = webSessionsActivity;
    }

    public int getCount() {
        return this.a == null ? 0 : this.a.size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
        r8 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r10 != 0) goto L_0x0014;
    L_0x0004:
        r0 = r8.b;
        r0 = r0.getLayoutInflater();
        r1 = 2130903297; // 0x7f030101 float:1.7413408E38 double:1.0528061137E-314;
        r3 = 0;
        r0 = com.whatsapp.aam.a(r0, r1, r11, r3);
        if (r2 == 0) goto L_0x0135;
    L_0x0014:
        r3 = r8.a(r9);
        r0 = 2131755466; // 0x7f1001ca float:1.9141812E38 double:1.053227141E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755352; // 0x7f100158 float:1.914158E38 double:1.053227085E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        com.whatsapp.a4d.b(r1);
        r4 = r3.c;
        r4 = com.whatsapp.wn.a(r4);
        r5 = r8.b;
        r5 = r5.getBaseContext();
        r6 = r3.f;
        r4 = com.whatsapp.util.cs.a(r5, r6, r4);
        r0.setText(r4);
        r0 = r3.j;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0069;
    L_0x004a:
        r0 = r8.b;
        r0 = r0.getResources();
        r4 = 2131232281; // 0x7f080619 float:1.8080667E38 double:1.0529686533E-314;
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = r3.j;
        r5[r6] = r7;
        r6 = 1;
        r7 = r3.d;
        r5[r6] = r7;
        r0 = r0.getString(r4, r5);
        r1.setText(r0);
        if (r2 == 0) goto L_0x006e;
    L_0x0069:
        r0 = r3.d;
        r1.setText(r0);
    L_0x006e:
        r0 = 2130837576; // 0x7f020048 float:1.728011E38 double:1.052773643E-314;
        r1 = r3.b;
        if (r1 == 0) goto L_0x0132;
    L_0x0075:
        r0 = r3.b;
        r1 = java.util.Locale.US;
        r1 = r0.toLowerCase(r1);
        r0 = -1;
        r4 = r1.hashCode();
        switch(r4) {
            case -1361128838: goto L_0x00c0;
            case -909897856: goto L_0x00ea;
            case -849452327: goto L_0x00ce;
            case 3356: goto L_0x00f8;
            case 3108285: goto L_0x0106;
            case 105948115: goto L_0x00dc;
            default: goto L_0x0085;
        };
    L_0x0085:
        switch(r0) {
            case 0: goto L_0x0114;
            case 1: goto L_0x0119;
            case 2: goto L_0x011e;
            case 3: goto L_0x0123;
            case 4: goto L_0x0128;
            case 5: goto L_0x012d;
            default: goto L_0x0088;
        };
    L_0x0088:
        r0 = 2130837583; // 0x7f02004f float:1.7280124E38 double:1.0527736466E-314;
        r1 = r0;
    L_0x008c:
        r0 = 2131755675; // 0x7f10029b float:1.9142236E38 double:1.0532272443E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r0.setImageResource(r1);
        r0 = r3.g;
        if (r0 == 0) goto L_0x00b8;
    L_0x009c:
        r0 = r3.k;
        r4 = 0;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x00ad;
    L_0x00a4:
        r0 = r8.b;
        r1 = r3.c;
        com.whatsapp.WebSessionsActivity.a(r0, r1);
        if (r2 == 0) goto L_0x00bf;
    L_0x00ad:
        r0 = r8.b;
        r1 = r3.c;
        r4 = r3.k;
        com.whatsapp.WebSessionsActivity.a(r0, r1, r4);
        if (r2 == 0) goto L_0x00bf;
    L_0x00b8:
        r0 = r8.b;
        r1 = r3.c;
        com.whatsapp.WebSessionsActivity.a(r0, r1);
    L_0x00bf:
        return r10;
    L_0x00c0:
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r4 = r1.equals(r4);
        if (r4 == 0) goto L_0x0085;
    L_0x00cb:
        r0 = 0;
        if (r2 == 0) goto L_0x0085;
    L_0x00ce:
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r4 = r1.equals(r4);
        if (r4 == 0) goto L_0x0085;
    L_0x00d9:
        r0 = 1;
        if (r2 == 0) goto L_0x0085;
    L_0x00dc:
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r4 = r1.equals(r4);
        if (r4 == 0) goto L_0x0085;
    L_0x00e7:
        r0 = 2;
        if (r2 == 0) goto L_0x0085;
    L_0x00ea:
        r4 = z;
        r5 = 2;
        r4 = r4[r5];
        r4 = r1.equals(r4);
        if (r4 == 0) goto L_0x0085;
    L_0x00f5:
        r0 = 3;
        if (r2 == 0) goto L_0x0085;
    L_0x00f8:
        r4 = z;
        r5 = 0;
        r4 = r4[r5];
        r4 = r1.equals(r4);
        if (r4 == 0) goto L_0x0085;
    L_0x0103:
        r0 = 4;
        if (r2 == 0) goto L_0x0085;
    L_0x0106:
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x0085;
    L_0x0111:
        r0 = 5;
        goto L_0x0085;
    L_0x0114:
        r0 = 2130837576; // 0x7f020048 float:1.728011E38 double:1.052773643E-314;
        if (r2 == 0) goto L_0x0132;
    L_0x0119:
        r0 = 2130837578; // 0x7f02004a float:1.7280114E38 double:1.052773644E-314;
        if (r2 == 0) goto L_0x0132;
    L_0x011e:
        r0 = 2130837581; // 0x7f02004d float:1.728012E38 double:1.0527736456E-314;
        if (r2 == 0) goto L_0x0132;
    L_0x0123:
        r0 = 2130837582; // 0x7f02004e float:1.7280122E38 double:1.052773646E-314;
        if (r2 == 0) goto L_0x0132;
    L_0x0128:
        r0 = 2130837579; // 0x7f02004b float:1.7280116E38 double:1.0527736447E-314;
        if (r2 == 0) goto L_0x0132;
    L_0x012d:
        r0 = 2130837577; // 0x7f020049 float:1.7280112E38 double:1.0527736437E-314;
        if (r2 != 0) goto L_0x0088;
    L_0x0132:
        r1 = r0;
        goto L_0x008c;
    L_0x0135:
        r10 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ny.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public i6 a(int i) {
        return (i6) this.a.get(i);
    }

    public void a(List list) {
        this.a = list;
        notifyDataSetChanged();
    }
}
