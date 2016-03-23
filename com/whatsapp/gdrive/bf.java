package com.whatsapp.gdrive;

import android.support.annotation.Nullable;
import android.view.View.OnClickListener;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.auv;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.l;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class bf implements bi {
    private static final String[] z;
    private long a;
    @d5
    private int b;
    final SettingsGoogleDrive c;
    private long d;

    static {
        String[] strArr = new String[28];
        String str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f)LK8?)L\u0015)>?\t";
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
                        i3 = 91;
                        break;
                    case at.g /*1*/:
                        i3 = 41;
                        break;
                    case at.i /*2*/:
                        i3 = 56;
                        break;
                    case at.o /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 80;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f6Z_?$4[]a44^V ?:M\u0015<\"4NJ)#(\u0006M\"5#Y]/$>M\u0015?$:]]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "{]W817\u0013\u0018";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f9H['%+\u0004H-%(L\\c<4^\u0015.1/]]>)";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f6Z_?$4[]a44^V ?:M\u0015?$:[Lc%5L@<58]](}(]Y85";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f6Z_?$4[]a44^V ?:M\u0015)>?\u0006M\"5#Y]/$>M\u0015?$:]]";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f)LK8?)L\u0015?$:[L";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f)LK8?)L\u0015<1.Z](\u007f7FOa2:]L)\"\"";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f9H['%+\u0004H-%(L\\c#?JY>4v\\V!?.GL)4";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f9H['%+\u0004H>?<[]?#{@V/?)[]/${@V:?8HL%?5\u0013\u0018";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f9H['%+\u0004H-%(L\\c>4\u0004O%62";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f+FK8}9H['%+\u0004K/\".K\u0015?$:[L";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f6Z_?$4[]a44^V ?:M\u0015)\")FJc%5L@<58]](}(]Y85";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f9H['%+\u0004H-%(L\\c#?JY>4vDQ?#2G_";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f9H['%+\u0004]\"4{";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f9H['%+\u0004H>5+\u0004K81)]";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "(LL895NKa7?[Q:5tZ]8}6LK?1<L\u0017?84^\u0015%>?LL)\"6@V-$>";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "6LK?1<L\u0018?84\\T(p9L\u0018\"%7E\u0018;8>G\u0018.%/]W\"p3HKl$4\tZ)p?@K<<:P](~";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f9H['%+\u0004H-%(L\\c>4\u0004\\-$:\u0004[#>5L[894G";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f9H['%+\u0004[->8LT 5?";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f)LK8?)L\u0015<1.Z](\u007f(M[-\"?\u0004M\"=4\\V85?";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f9H['%+\u0004K81)]";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f)LK8?)L\u0015/15J] <>M";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f)LK8?)L\u0015<1.Z](\u007f(M[-\"?\u0004U%#(@V+";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f)LK8?)L\u0015<1.Z](\u007f8LT %7HJa1-HQ 19E]";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f)LK8?)L\u0015<1.Z](\u007f5F\u0015;9=@";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f)LK8?)L\u0015<1.Z](\u007f5F\u0015(1/H\u0015/?5G]/$2FV";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "(LL895NKa7?[Q:5vFZ?5)_]>\u007f6Z_?$4[]a44^V ?:M\u0015<\"4NJ)#(\u0006\\#'5EW-4>M\u0002l";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b(long j, long j2) {
        try {
            int i;
            Log.i(z[21]);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            a(4, this.c.getString(2131231243), null, null, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void f(long j, long j2) {
        try {
            int i;
            Log.i(z[14]);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            a(4, this.c.getString(2131231179), SettingsGoogleDrive.m(this.c), null, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    bf(SettingsGoogleDrive settingsGoogleDrive) {
        this.c = settingsGoogleDrive;
        this.a = -1;
        this.d = -1;
        SettingsGoogleDrive.a(this.c, new a8(this));
    }

    public void c(long j, long j2) {
        Log.e(z[2]);
        Log.i(z[1] + j + z[3] + j2);
    }

    public void d(@fk int i) {
        if (i != 10) {
            try {
                a(3, null, null, null, -1);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.c.runOnUiThread(new di(this, i));
    }

    public void i(long j, long j2) {
        if (j2 <= 0) {
            try {
                Log.e(z[10] + j + "/" + j2);
                if (!GoogleDriveService.c) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        String a = l.a(this.c, j);
        int i = (int) ((100 * j) / j2);
        if (((int) ((this.a * 100) / j2)) == i) {
            try {
                if (l.a(this.c, j).equals(l.a(this.c, this.a))) {
                    return;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        this.a = j;
        a(4, this.c.getString(2131231947, new Object[]{a, l.a(this.c, j2), Integer.valueOf(i)}), SettingsGoogleDrive.m(this.c), null, i);
    }

    public void c(int i) {
        if (i >= 0) {
            try {
                a(5, this.c.getString(2131231928, new Object[]{Integer.valueOf(i)}), SettingsGoogleDrive.m(this.c), null, -1);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public void a(boolean z) {
        Log.e(z[6]);
    }

    public void a(long j, long j2) {
        try {
            int i;
            Log.i(z[24]);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            a(4, this.c.getString(2131231242), null, null, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r10, long r12, long r14) {
        /*
        r9 = this;
        r1 = com.whatsapp.gdrive.GoogleDriveService.c;
        r2 = 0;
        r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0013;
    L_0x0008:
        r0 = r9.c;
        r2 = 2131232302; // 0x7f08062e float:1.808071E38 double:1.0529686637E-314;
        r0 = r0.getString(r2);
        if (r1 == 0) goto L_0x0035;
    L_0x0013:
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x002f;
    L_0x0019:
        r0 = r9.c;
        r2 = 2131231521; // 0x7f080321 float:1.8079125E38 double:1.052968278E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r4 = 0;
        r6 = (double) r10;
        r5 = java.lang.Double.valueOf(r6);
        r3[r4] = r5;
        r0 = r0.getString(r2, r3);
        if (r1 == 0) goto L_0x0035;
    L_0x002f:
        r0 = r9.c;
        r0 = com.whatsapp.util.l.a(r0, r10);
    L_0x0035:
        r1 = r9.c;	 Catch:{ IllegalArgumentException -> 0x007b }
        r1 = com.whatsapp.util.l.a(r1, r10);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r9.c;	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = r9.d;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = com.whatsapp.util.l.a(r2, r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r1 = r1.equals(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r1 != 0) goto L_0x007a;
    L_0x0049:
        r9.d = r10;	 Catch:{ IllegalArgumentException -> 0x007b }
        r1 = 4;
        r2 = r9.c;	 Catch:{ IllegalArgumentException -> 0x007b }
        r3 = 2131231962; // 0x7f0804da float:1.808002E38 double:1.0529684957E-314;
        r4 = 3;
        r4 = new java.lang.Object[r4];	 Catch:{ IllegalArgumentException -> 0x007b }
        r5 = 0;
        r4[r5] = r0;	 Catch:{ IllegalArgumentException -> 0x007b }
        r0 = 1;
        r5 = r9.c;	 Catch:{ IllegalArgumentException -> 0x007b }
        r5 = com.whatsapp.util.l.a(r5, r14);	 Catch:{ IllegalArgumentException -> 0x007b }
        r4[r0] = r5;	 Catch:{ IllegalArgumentException -> 0x007b }
        r0 = 2;
        r6 = 100;
        r6 = r6 * r10;
        r6 = r6 / r14;
        r5 = java.lang.Long.valueOf(r6);	 Catch:{ IllegalArgumentException -> 0x007b }
        r4[r0] = r5;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2.getString(r3, r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r3 = 0;
        r4 = 0;
        r6 = 100;
        r6 = r6 * r10;
        r6 = r6 / r14;
        r5 = (int) r6;	 Catch:{ IllegalArgumentException -> 0x007b }
        r0 = r9;
        r0.a(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007a:
        return;
    L_0x007b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bf.a(long, long, long):void");
    }

    public void c(boolean z) {
        try {
            Log.i(z[15] + z);
            a(3, null, null, null, -1);
            if (z) {
                SettingsGoogleDrive.k(this.c).ad().h();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(long r8, long r10) {
        /*
        r7 = this;
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x003e }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x003e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x003e }
        r0 = 0;
        r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0040;
    L_0x000f:
        r0 = 100;
        r0 = r0 * r8;
        r0 = r0 / r10;
        r5 = (int) r0;
    L_0x0014:
        r0 = com.whatsapp.App.az();
        r1 = 2;
        if (r0 != r1) goto L_0x0028;
    L_0x001b:
        r0 = r7.c;
        r1 = 2131231943; // 0x7f0804c7 float:1.8079981E38 double:1.0529684864E-314;
        r2 = r0.getString(r1);
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        if (r0 == 0) goto L_0x0031;
    L_0x0028:
        r0 = r7.c;
        r1 = 2131231944; // 0x7f0804c8 float:1.8079983E38 double:1.052968487E-314;
        r2 = r0.getString(r1);
    L_0x0031:
        r1 = 4;
        r0 = r7.c;
        r3 = com.whatsapp.gdrive.SettingsGoogleDrive.m(r0);
        r4 = 0;
        r0 = r7;
        r0.a(r1, r2, r3, r4, r5);
        return;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r5 = -1;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bf.j(long, long):void");
    }

    public void k(long j, long j2) {
        try {
            int i;
            Log.i(z[9]);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            a(4, this.c.getString(2131232315), SettingsGoogleDrive.m(this.c), null, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void h(long j, long j2) {
        try {
            int i;
            Log.i(z[27]);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            a(4, this.c.getString(2131231957), null, null, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void e() {
        Log.e(z[5]);
    }

    public void a(boolean z, long j, long j2) {
        try {
            Log.i(z[0] + z);
            a(3, null, null, null, -1);
            this.d = -1;
            this.a = -1;
            if (z) {
                SettingsGoogleDrive.k(this.c).ad().h();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void f() {
        Log.i(z[23]);
        this.c.runOnUiThread(new co(this));
        a(3, null, null, null, -1);
        this.d = -1;
        this.a = -1;
    }

    public void d() {
        Log.i(z[12]);
        a(5, this.c.getString(2131231927), SettingsGoogleDrive.m(this.c), null, -1);
    }

    public void d(long j, long j2) {
        try {
            int i;
            OnClickListener e1Var;
            Log.i(z[26]);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            if (App.az() == 2) {
                Log.i(z[25]);
                e1Var = new e1(this);
            } else {
                e1Var = null;
            }
            a(4, this.c.getString(2131231961), null, e1Var, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void l(long j, long j2) {
        try {
            int i;
            Log.i(z[8]);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            OnClickListener adVar = new ad(this);
            a(4, this.c.getString(2131231958), null, adVar, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void g(long j, long j2) {
        try {
            int i;
            Log.i(z[4]);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            a(4, this.c.getString(2131231942), SettingsGoogleDrive.m(this.c), null, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a(@fk int i) {
        if (i != 10) {
            try {
                a(2, null, null, null, -1);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.c.runOnUiThread(new f4(this, i));
    }

    public void g() {
        Log.i(z[16]);
        a(5, this.c.getString(2131231945), SettingsGoogleDrive.m(this.c), null, -1);
    }

    private void a(@d5 int i, @Nullable String str, @Nullable OnClickListener onClickListener, @Nullable OnClickListener onClickListener2, int i2) {
        boolean z = GoogleDriveService.c;
        switch (i) {
            case at.i /*2*/:
                try {
                    if (this.b != 2) {
                        this.c.runOnUiThread(new e4(this));
                        this.b = 2;
                        if (!z) {
                        }
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            case at.o /*3*/:
                try {
                    if (this.b != 3) {
                        this.c.runOnUiThread(new an(this));
                        this.b = 3;
                    }
                    if (str != null) {
                        try {
                            throw new IllegalArgumentException(z[18]);
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            case at.p /*4*/:
                try {
                    auv.a((Object) str);
                    if (this.b != 4) {
                        this.c.runOnUiThread(new ev(this, onClickListener));
                        this.b = 4;
                    }
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
                try {
                    this.c.runOnUiThread(new f9(this, i2, str, onClickListener2));
                    if (!z) {
                    }
                } catch (IllegalArgumentException e22222) {
                    throw e22222;
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                }
            case at.m /*5*/:
                auv.a((Object) str);
                if (this.b != 5) {
                    Log.i(z[17]);
                    this.c.runOnUiThread(new cd(this, onClickListener, onClickListener2));
                    this.b = 5;
                }
                this.c.runOnUiThread(new b1(this, str));
            default:
        }
    }

    public void f(int i) {
        if (i >= 0) {
            try {
                a(5, this.c.getString(2131231960, new Object[]{Integer.valueOf(i)}), null, null, i);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public void e(int i) {
        if (i >= 0) {
            try {
                auv.b();
                a(5, this.c.getString(2131231946, new Object[]{Integer.valueOf(i)}), SettingsGoogleDrive.m(this.c), null, i);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public void a() {
        Log.i(z[20]);
        a(3, null, null, null, -1);
    }

    public void e(long j, long j2) {
        try {
            int i;
            Log.i(z[19]);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            a(4, this.c.getString(2131231949), SettingsGoogleDrive.m(this.c), null, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void c() {
        Log.i(z[7]);
        a(5, this.c.getString(2131231959), null, null, -1);
    }

    public void b(boolean z) {
    }

    public void b() {
        Log.i(z[22]);
        this.a = -1;
        e(0);
    }

    public void b(@fk int i) {
        Log.e(z[13]);
    }
}
