package com.whatsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import com.whatsapp.messaging.bk;
import com.whatsapp.protocol.bz;
import com.whatsapp.protocol.ct;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import org.whispersystems.aw;

final class i1 implements bk {
    private static final String[] z;
    private final App a;
    private final awc b;
    private final Context c;

    static {
        String[] strArr = new String[16];
        String str = "s//\u0002\u0002f;`\u001e\u001fww+\u000b\u001423)\t\ba#";
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
                        i3 = 18;
                        break;
                    case at.g /*1*/:
                        i3 = 87;
                        break;
                    case at.i /*2*/:
                        i3 = 64;
                        break;
                    case at.o /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = arj.Theme_switchStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "2 !\u001dMa\"#\r\ba$&\u001b\u0001)w)\u0000\u0004f>!\u001a\u0004|0`\u000f\u0015};/\u001a\u00012$%\u001d\u001e{8.";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "s//\u0002\u0002f;`\u001e\u001fww+\u000b\u001423)\t\ba#`\u0000\u0002|2";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "s//\u0002\u0002f;`\u001e\u001fww+\u000b\u00142%%\u001f\u0018w$4N\u000b}%`";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "21!\u0007\u0001w3`\u0019\u0004f?`\u000b\u001f`82N\u000e}3%N";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "s//\u0002\u0002f;`\u001e\u001fww+\u000b\u001424/\u001b\u0003fw2\u001b\u0003|>.\tM~87TM";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "s//\u0002\u0002f;`\u001e\u001fww+\u000b\u00142%%\u001f\u0018w$4N\u000b}%`";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "2 !\u001dM|8.\u000b";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "s//\u0002\u0002f;`\u001e\u001fww+\u000b\u001423)\t\ba#`\u001d\b`!%\u001cMw%2\u0001\u001f";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "s//\u0002\u0002f;`\u001e\u001fww+\u000b\u00142$5\r\u000ew$3\b\u0018~;9N\u001ew#";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ";l`\u0019\u0004~;`\u001a\u001fkw!\t\f{9`\u0001\u000329%\u0016\u00192/-\u001e\u001d24/\u0000\u0003w44";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "s//\u0002\u0002f;`\u001a\u001f{2$N\u0019}w3\u000b\u00192\".\u000f\u000eq20\u001a\fp;%N\u001d`2`\u0005\bk$`F\b`%/\u001c.}3%S";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "R$n\u0019\u0005s#3\u000f\u001dby.\u000b\u0019";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ";l`\u001c\bu2.\u000b\u001fs#)\u0000\n2<%\u0017\u001e";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "s//\u0002\u0002f;`\b\f{;%\nMf8`\u001d\bfw0\u001c\b2<%\u0017M:22\u001c\u0002`\u0014/\n\b/";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "s//\u0002\u0002f;`\u001e\u001fww+\u000b\u00142%%\u001f\u0018w$4N\u000b}%`";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(ct ctVar, int i) {
        Log.i(z[6] + i);
        a(ctVar);
    }

    static int[] a(i1 i1Var, byte[][] bArr) {
        return i1Var.a(bArr);
    }

    static void c(i1 i1Var) {
        i1Var.d();
    }

    public void a(int i) {
        if (i == 406) {
            Log.e(z[12] + i + z[14]);
            awc.e.execute(new f_(this));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Log.e(z[15] + i + z[11]);
        this.a.aW.remove(App.ad() + z[13]);
    }

    public void b() {
        Log.i(z[9]);
    }

    public void a(String str, byte[] bArr, byte[] bArr2, byte b, bz bzVar, bz bzVar2) {
        Log.i(z[1] + str + z[2]);
        awc.e.execute(new q_(this, str, bArr, b, bzVar, bzVar2, bArr2));
    }

    private int[] a(byte[][] bArr) {
        boolean z = DialogToastActivity.f;
        int[] iArr = new int[bArr.length];
        int i = 0;
        while (i < bArr.length) {
            iArr[i] = aw.a(bArr[i], 0);
            i++;
            if (z) {
                break;
            }
        }
        return iArr;
    }

    public void a(String str, int i) {
        Log.i(z[4] + str + z[5] + i);
        this.a.aW.remove(str);
    }

    private void d() {
        this.b.a();
        this.a.l();
    }

    public i1(@NonNull Context context, @NonNull App app) {
        this.c = context.getApplicationContext();
        this.b = awc.a(this.c);
        this.a = app;
    }

    static awc a(i1 i1Var) {
        return i1Var.b;
    }

    public void a(byte[] bArr, byte b, byte[] bArr2, byte[][] bArr3, byte[] bArr4) {
        Log.i(z[0]);
        awc.e.execute(new _h(this, b, bArr, bArr2, bArr3, bArr4));
    }

    private void a(ct ctVar) {
        awc.e.execute(new ai4(this, ctVar));
    }

    public void a() {
        Log.i(z[10]);
        awc.e.execute(new qo(this));
    }

    public void c() {
        Log.i(z[3]);
        awc.e.execute(new bq(this));
    }

    static App b(i1 i1Var) {
        return i1Var.a;
    }

    public void a(String str) {
        Log.i(z[7] + str + z[8]);
        awc.e.execute(new axy(this, str));
    }
}
