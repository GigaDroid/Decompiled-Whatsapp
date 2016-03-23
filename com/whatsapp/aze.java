package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class aze extends AsyncTask {
    private static final String[] z;
    ut a;
    final VerifySms b;

    static {
        String[] strArr = new String[30];
        String str = "W)J\u00016\\'S\\ D6x_3Q B]$Z%B\\";
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
                        i3 = 52;
                        break;
                    case at.g /*1*/:
                        i3 = 70;
                        break;
                    case at.i /*2*/:
                        i3 = 39;
                        break;
                    case at.o /*3*/:
                        i3 = 47;
                        break;
                    default:
                        i3 = 65;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "B#UF'M5J\\nB#UF'M5J\\nQ4U@3\u0014";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "B#UF'M5J\\nB#UF'M5J\\nW)CJn";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "W)J\u00016\\'S\\ D6\t}$S/T[$F\u0016O@/QhJF2@?WJ%k5SN5Q";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "B#UF'M5J\\nB#UF'M5J\\nG%OJ%A*B\u00023Q2UVn";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "B#UF'M5J\\nB#UF'M5J\\nQ4U@3\u001b2H@lR'T[nG'QJ%\u0019%HK$\u0019/T\u0002/A*K";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "G#UY$FkTJ/PkJF2Y'SL)";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "G#UY$FkTJ/PkJF2G/IH";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "B#UF'M5J\\nB#UF'M5J\\nY/T\\(Z!";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "B#UF'M5J\\nB#UF'M5J\\nQ4U@3";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "B#UF'M5J\\nB#UF'M5J\\nG2FC$";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "B#UF'M5J\\nB#UF'M5J\\nB#UF']#C";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "B#UF'M5J\\nB#UF'M5J\\nW)IA$W2NY(@?";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "G#UY$FkTJ/PkB]3[4\n[$Y6H] F/KVlA(FY ]*FM-Q";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "B#UF'M5J\\nB#UF'M5J\\n@)H\u0002,U(^\u0002&A#T\\$G";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "G#UY$FkTJ/PkS@.\u0019+FA8\u0019!RJ2G#T";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "G#UY$FkTJ/PkB]3[4\nZ/G6BL(R/BK";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "B#UF'M5J\\nB#UF'M5J\\nV*HL*Q\"";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "G#UY$FkTJ/PkEC.W-BK";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "B#UF'M5J\\nB#UF'M5J\\nS3B\\2Q\"\n[.[kAN2@";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "B#UF'M5J\\nB#UF'M5J\\nQ4U@3\u00192BB1[4F](X?\nZ/U0FF-U$KJ";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "B#UF'M5J\\nB#UF'M5J\\nA(FZ5\\)UF;Q\"";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "B#UF'M5J\\nB#UF'M5J\\nQ4U@3\u001b%HA/Q%SF7]2^\u00002U0BKlW)CJl]5\nA4X*";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "G#UY$FkTJ/Pk@Z$G5BKl@)H\u0002'U5S";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "B#UF'M5J\\nB#UF'M5J\\nQ4U@3\u001b2BB1\u00193IN7U/K\u00002U0BKlW)CJl]5\nA4X*";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "G#UY$FkTJ/PkB]3[4\n\\5U*B";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "F#S](Q\"";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "@'W_$P";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "B#UF'M5J\\nB#UF'M5J\\";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "B#UF'M5J\\nB#UF'M5J\\n])B]3[4\u0007";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a(String str) {
        int d = VerifySms.d(this.b);
        Log.i(z[5] + d);
        VerifySms.b(this.b).sendMessageDelayed(VerifySms.b(this.b).obtainMessage(1, str), (long) d);
    }

    protected aze(VerifySms verifySms) {
        this.b = verifySms;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.v4 r8) {
        /*
        r7 = this;
        r6 = 24;
        r4 = 21;
        r5 = 12;
        r3 = 1;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r7.b;
        r1.removeDialog(r6);
        r1 = com.whatsapp.v4.YES;
        if (r8 != r1) goto L_0x0040;
    L_0x0012:
        r1 = z;
        r1 = r1[r5];
        com.whatsapp.util.Log.i(r1);
        r1 = r7.a;
        r1 = r1.a;
        r2 = r7.a;
        r2 = r2.c;
        com.whatsapp.ve.b(r1, r2);
        r1 = r7.a;
        r1 = r1.b;
        com.whatsapp.VerifyNumber.a(r1);
        r1 = r7.b;
        r1 = com.whatsapp.VerifySms.f(r1);
        r1.a(r3);
        r1 = r7.b;
        com.whatsapp.VerifySms.i(r1);
        r1 = r7.b;
        com.whatsapp.VerifySms.a(r1, r3);
        if (r0 == 0) goto L_0x01ad;
    L_0x0040:
        r1 = com.whatsapp.v4.FAIL_MISMATCH;
        if (r8 != r1) goto L_0x0065;
    L_0x0044:
        r1 = z;
        r2 = 22;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = r7.b;
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r1.d(r2);
        r1 = r7.b;
        com.whatsapp.VerifySms.i(r1);
        r1 = r7.b;
        r2 = 34;
        r1.c(r2);
        if (r0 == 0) goto L_0x01ad;
    L_0x0065:
        r1 = r7.b;
        r1 = com.whatsapp.VerifySms.e(r1);
        r2 = com.whatsapp.v4.ERROR_CONNECTIVITY;
        if (r8 != r2) goto L_0x0098;
    L_0x006f:
        r2 = z;
        r3 = 13;
        r2 = r2[r3];
        com.whatsapp.util.Log.w(r2);
        if (r1 != 0) goto L_0x0093;
    L_0x007a:
        r2 = z;
        r3 = 23;
        r2 = r2[r3];
        com.whatsapp.util.Log.e(r2);
        r2 = 4;
        com.whatsapp.VerifySms.b(r2);
        r2 = r7.b;
        com.whatsapp.VerifySms.r(r2);
        r2 = r7.b;
        r2.c(r4);
        if (r0 == 0) goto L_0x01ad;
    L_0x0093:
        r7.a(r1);
        if (r0 == 0) goto L_0x01ad;
    L_0x0098:
        r2 = com.whatsapp.v4.FAIL_GUESSED_TOO_FAST;
        if (r8 != r2) goto L_0x00c2;
    L_0x009c:
        r2 = z;
        r3 = 20;
        r2 = r2[r3];
        com.whatsapp.util.Log.e(r2);
        r2 = r7.b;
        r3 = z;
        r3 = r3[r6];
        r2.d(r3);
        if (r1 != 0) goto L_0x00bd;
    L_0x00b0:
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        com.whatsapp.util.Log.e(r2);
        r7.a();
        if (r0 == 0) goto L_0x01ad;
    L_0x00bd:
        r7.a(r1);
        if (r0 == 0) goto L_0x01ad;
    L_0x00c2:
        r2 = com.whatsapp.v4.FAIL_TEMPORARILY_UNAVAILABLE;
        if (r8 != r2) goto L_0x00ed;
    L_0x00c6:
        r2 = z;
        r2 = r2[r4];
        com.whatsapp.util.Log.e(r2);
        r2 = r7.b;
        r3 = z;
        r4 = 14;
        r3 = r3[r4];
        r2.d(r3);
        if (r1 != 0) goto L_0x00e8;
    L_0x00da:
        r2 = z;
        r3 = 25;
        r2 = r2[r3];
        com.whatsapp.util.Log.e(r2);
        r7.a();
        if (r0 == 0) goto L_0x01ad;
    L_0x00e8:
        r7.a(r1);
        if (r0 == 0) goto L_0x01ad;
    L_0x00ed:
        r1 = r7.b;
        com.whatsapp.VerifySms.i(r1);
        r1 = com.whatsapp.v4.FAIL_MISSING;
        if (r8 != r1) goto L_0x0118;
    L_0x00f6:
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
        r1 = r7.b;
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r1.d(r2);
        r1 = r7.b;
        r1 = com.whatsapp.VerifySms.p(r1);
        r2 = "";
        r1.setText(r2);
        if (r0 == 0) goto L_0x0170;
    L_0x0118:
        r1 = com.whatsapp.v4.FAIL_TOO_MANY_GUESSES;
        if (r8 != r1) goto L_0x0132;
    L_0x011c:
        r1 = z;
        r2 = 15;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
        r1 = r7.b;
        r2 = z;
        r3 = 16;
        r2 = r2[r3];
        r1.d(r2);
        if (r0 == 0) goto L_0x0170;
    L_0x0132:
        r1 = com.whatsapp.v4.ERROR_UNSPECIFIED;
        if (r8 != r1) goto L_0x014c;
    L_0x0136:
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
        r1 = r7.b;
        r2 = z;
        r3 = 17;
        r2 = r2[r3];
        r1.d(r2);
        if (r0 == 0) goto L_0x0170;
    L_0x014c:
        r1 = com.whatsapp.v4.FAIL_STALE;
        if (r8 != r1) goto L_0x0170;
    L_0x0150:
        r1 = z;
        r2 = 11;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
        r1 = r7.b;
        r2 = z;
        r3 = 26;
        r2 = r2[r3];
        r1.d(r2);
        r1 = r7.b;
        r1 = com.whatsapp.VerifySms.p(r1);
        r2 = "";
        r1.setText(r2);
    L_0x0170:
        r1 = com.whatsapp.v4.FAIL_BLOCKED;
        if (r8 != r1) goto L_0x01aa;
    L_0x0174:
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
        com.whatsapp.VerifySms.b(r5);
        r1 = r7.b;
        com.whatsapp.VerifySms.r(r1);
        r1 = r7.b;
        r2 = z;
        r3 = 19;
        r2 = r2[r3];
        r1.d(r2);
        r1 = r7.b;
        com.whatsapp.VerifySms.m(r1);
        r1 = r7.b;
        r1 = r1.t;
        if (r1 != 0) goto L_0x01a3;
    L_0x019b:
        r1 = r7.b;
        r1 = r1.isFinishing();
        if (r1 == 0) goto L_0x01ad;
    L_0x01a3:
        r1 = r7.b;
        r1.a();
        if (r0 == 0) goto L_0x01ad;
    L_0x01aa:
        r7.a();
    L_0x01ad:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aze.a(com.whatsapp.v4):void");
    }

    protected v4 a(String[] strArr) {
        Log.i(z[3] + strArr[0]);
        try {
            this.a = amb.a(VerifySms.k(this.b), VerifySms.v(this.b), strArr[0], b(strArr[1]), this.b.getSharedPreferences(z[0], 0).getString(z[4], null));
            App.f(this.b, this.a.c);
            return this.a.e;
        } catch (IOException e) {
            Log.e(z[1] + e.toString());
            return v4.ERROR_CONNECTIVITY;
        } catch (Exception e2) {
            Log.e(z[2] + e2.toString());
            return v4.ERROR_UNSPECIFIED;
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }

    private void a() {
        if (this.b.t || this.b.isFinishing()) {
            this.b.a();
        }
    }

    private as b(String str) {
        if (z[28].equals(str)) {
            return as.TAPPED_LINK;
        }
        if (z[27].equals(str)) {
            return as.RETRIED;
        }
        return as.AUTO_DETECTED;
    }

    protected void onPreExecute() {
        Log.i(z[29]);
        if (!this.b.isFinishing()) {
            this.b.showDialog(24);
        }
    }

    protected void onPostExecute(Object obj) {
        a((v4) obj);
    }
}
