package com.whatsapp;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.registration.a;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class a3r extends AsyncTask {
    private static final String[] z;
    private String a;
    @NonNull
    private o6 b;
    private int c;
    private byte[] d;
    private byte[] e;
    private String f;
    private String g;
    final EnterPhoneNumber h;
    private int i;
    private Runnable j;
    private byte[] k;
    private boolean l;
    private String m;

    static {
        String[] strArr = new String[19];
        String str = "l4^\u001fPy2E\u0014G&8K\u001e\u000f}5A\u001fL";
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
                        i3 = 9;
                        break;
                    case at.g /*1*/:
                        i3 = 90;
                        break;
                    case at.i /*2*/:
                        i3 = 42;
                        break;
                    case at.o /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 34;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "l4^\u001fPy2E\u0014G&?X\bM{wI\u0015Lg?I\u000eK\u007f3^\u0003";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "l4^\u001fPy2E\u0014G&*B\u0015LlwD\u000fOk?XWVf5\u0007\u0016Mg=";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "l4^\u001fPy2E\u0014G&.O\u0017Rf(K\bKe#\u0007\u000fLh,K\u0013Nh8F\u001f";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "a.^\nQ3u\u0005\rJh.Y\u001bRytI\u0015O&;D\u001ePf3N";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "l4^\u001fPy2E\u0014G&.E\u0015\u000f{?I\u001fL}u^\u0013OlwD\u0015V$3D\u000e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "l4^\u001fPy2E\u0014G&.E\u0015\u000f{?I\u001fL}u^\u0013OlwD\u0015V$3D\u000e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "l4^\u001fPy2E\u0014G&*B\u0015LlwD\u000fOk?XWVf5\u0007\tJf(^";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = "l4^\u001fPy2E\u0014G&4O\r\u000f`4Y\u000eCe6K\u000eKf4";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "l4^\u001fPy2E\u0014G&8F\u0015Ab?N";
                    obj = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "l4^\u001fPy2E\u0014G&(O\u0013Lz.K\u0016Nl>";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "l4^\u001fPy2E\u0014G&5F\u001e\u000f\u007f?X\tKf4";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "l4^\u001fPy2E\u0014G&.E\u0015\u000f{?I\u001fL}";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "l4^\u001fPy2E\u0014G&*B\u0015LlwD\u000fOk?XW@h>\u0007\u001cM{7K\u000e";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ")(O\u001cWz?N";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "l4^\u001fPy2E\u0014G&9B\u001fAb(O\u0013Lz.K\u0016Nl>\u0005\u0013Ml(X\u0015P)";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "$k";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "l4^\u001fPy2E\u0014G&9B\u001fAb(O\u0013Lz.K\u0016Nl>\u0005\u001fP{5X";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "l4^\u001fPy2E\u0014G&?X\bM{w_\u0014Qy?I\u0013D`?N";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Integer a(byte[][] bArr) {
        this.e = bArr[0];
        this.d = bArr[1];
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < EnterPhoneNumber.y) {
                this.g = ((EnterPhoneNumber.y - elapsedRealtime) / 1000) + "";
                return Integer.valueOf(11);
            }
            byte[] bytes;
            a a = a.a(this.h, new String(bArr[1]));
            if (bArr[3] == null) {
                bytes = z[17].getBytes();
            } else {
                bytes = bArr[3];
            }
            an9 a2 = amb.a(bArr[0], bArr[1], bArr[2], a.toString(), bytes);
            if (a2.a == dq.OK) {
                this.m = a2.f;
                this.k = a2.g;
                this.l = a2.i;
                return Integer.valueOf(1);
            }
            if (a2.a == dq.FAIL) {
                this.i = a2.h;
                this.c = a2.d;
                if (a2.e == null) {
                    return Integer.valueOf(4);
                }
                if (a2.e == s2.BLOCKED) {
                    return Integer.valueOf(5);
                }
                if (a2.e == s2.LENGTH_LONG) {
                    return Integer.valueOf(6);
                }
                if (a2.e == s2.LENGTH_SHORT) {
                    return Integer.valueOf(7);
                }
                if (a2.e == s2.FORMAT_WRONG) {
                    return Integer.valueOf(8);
                }
                if (a2.e == s2.TEMPORARILY_UNAVAILABLE) {
                    this.g = a2.c;
                    return Integer.valueOf(9);
                } else if (a2.e == s2.OLD_VERSION) {
                    return Integer.valueOf(12);
                } else {
                    if (a2.e == s2.ERROR_BAD_TOKEN) {
                        return Integer.valueOf(14);
                    }
                    this.a = a2.b;
                    this.f = a2.j;
                    return Integer.valueOf(2);
                }
            }
            return Integer.valueOf(4);
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            Log.b(z[18], e2);
        } catch (IOException e3) {
            throw e3;
        } catch (IOException e32) {
            String iOException = e32.toString();
            try {
                Log.e(z[16] + iOException);
                if (iOException != null) {
                    if (iOException.contains(z[15])) {
                        return Integer.valueOf(4);
                    }
                }
                return Integer.valueOf(3);
            } catch (IOException e322) {
                throw e322;
            } catch (IOException e3222) {
                throw e3222;
            }
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((byte[][]) objArr);
    }

    protected a3r(EnterPhoneNumber enterPhoneNumber, @NonNull Runnable runnable, o6 o6Var) {
        this.h = enterPhoneNumber;
        this.b = o6Var;
        this.j = runnable;
    }

    protected void onPreExecute() {
        this.h.showDialog(9);
    }

    protected void onPostExecute(Object obj) {
        a((Integer) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.lang.Integer r13) {
        /*
        r12 = this;
        r6 = 4;
        r5 = 3;
        r11 = 2;
        r10 = 0;
        r9 = 1;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.i;	 Catch:{ NumberFormatException -> 0x02af }
        if (r0 == 0) goto L_0x0012;
    L_0x000b:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02af }
        r2 = r12.i;	 Catch:{ NumberFormatException -> 0x02af }
        com.whatsapp.App.e(r0, r2);	 Catch:{ NumberFormatException -> 0x02af }
    L_0x0012:
        r0 = r12.c;	 Catch:{ NumberFormatException -> 0x02b1 }
        if (r0 == 0) goto L_0x001d;
    L_0x0016:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02b1 }
        r2 = r12.c;	 Catch:{ NumberFormatException -> 0x02b1 }
        com.whatsapp.App.b(r0, r2);	 Catch:{ NumberFormatException -> 0x02b1 }
    L_0x001d:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x02b3 }
        if (r0 == r6) goto L_0x002e;
    L_0x0023:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x02b3 }
        if (r0 == r5) goto L_0x002e;
    L_0x0029:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02b5 }
        r2 = 0;
        r0.B = r2;	 Catch:{ NumberFormatException -> 0x02b5 }
    L_0x002e:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x02b7 }
        if (r0 != r9) goto L_0x006c;
    L_0x0034:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02b7 }
        r0.j();	 Catch:{ NumberFormatException -> 0x02b7 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x02b7 }
        r2 = 11;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x02b7 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x02b7 }
        r0 = r12.j;	 Catch:{ NumberFormatException -> 0x02b7 }
        if (r0 == 0) goto L_0x004b;
    L_0x0046:
        r0 = r12.j;	 Catch:{ NumberFormatException -> 0x02b9 }
        r0.run();	 Catch:{ NumberFormatException -> 0x02b9 }
    L_0x004b:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02bb }
        r2 = r12.m;	 Catch:{ NumberFormatException -> 0x02bb }
        com.whatsapp.App.f(r0, r2);	 Catch:{ NumberFormatException -> 0x02bb }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02bb }
        r2 = 1;
        com.whatsapp.App.c(r0, r2);	 Catch:{ NumberFormatException -> 0x02bb }
        r0 = r12.k;	 Catch:{ NumberFormatException -> 0x02bb }
        r2 = r12.m;	 Catch:{ NumberFormatException -> 0x02bb }
        com.whatsapp.ve.b(r0, r2);	 Catch:{ NumberFormatException -> 0x02bb }
        r0 = r12.l;	 Catch:{ NumberFormatException -> 0x02bb }
        com.whatsapp.VerifyNumber.a(r0);	 Catch:{ NumberFormatException -> 0x02bb }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02bb }
        r2 = 0;
        r0.c(r2);	 Catch:{ NumberFormatException -> 0x02bb }
        if (r1 == 0) goto L_0x02ae;
    L_0x006c:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x02bb }
        if (r0 != r11) goto L_0x00aa;
    L_0x0072:
        r0 = z;	 Catch:{ NumberFormatException -> 0x02bd }
        r2 = 9;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x02bd }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x02bd }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02bd }
        r2 = 0;
        com.whatsapp.App.c(r0, r2);	 Catch:{ NumberFormatException -> 0x02bd }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02bd }
        r2 = com.whatsapp.VerifyNumber.s;	 Catch:{ NumberFormatException -> 0x02bd }
        r0.d(r2);	 Catch:{ NumberFormatException -> 0x02bd }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02bd }
        r0.j();	 Catch:{ NumberFormatException -> 0x02bd }
        r0 = 15;
        com.whatsapp.EnterPhoneNumber.C = r0;	 Catch:{ NumberFormatException -> 0x02bd }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02bd }
        r0.c();	 Catch:{ NumberFormatException -> 0x02bd }
        r0 = r12.j;	 Catch:{ NumberFormatException -> 0x02bd }
        if (r0 == 0) goto L_0x009f;
    L_0x009a:
        r0 = r12.j;	 Catch:{ NumberFormatException -> 0x02bf }
        r0.run();	 Catch:{ NumberFormatException -> 0x02bf }
    L_0x009f:
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x02c1 }
        r2 = r12.a;	 Catch:{ NumberFormatException -> 0x02c1 }
        r3 = r12.f;	 Catch:{ NumberFormatException -> 0x02c1 }
        r0.a(r2, r3);	 Catch:{ NumberFormatException -> 0x02c1 }
        if (r1 == 0) goto L_0x02ae;
    L_0x00aa:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x02c1 }
        r2 = 5;
        if (r0 != r2) goto L_0x0100;
    L_0x00b1:
        r0 = z;	 Catch:{ NumberFormatException -> 0x02c3 }
        r2 = 10;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x02c3 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x02c3 }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02c3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x02c3 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x02c3 }
        r3 = "+";
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x02c3 }
        r3 = new java.lang.String;	 Catch:{ NumberFormatException -> 0x02c3 }
        r4 = r12.e;	 Catch:{ NumberFormatException -> 0x02c3 }
        r3.<init>(r4);	 Catch:{ NumberFormatException -> 0x02c3 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x02c3 }
        r3 = new java.lang.String;	 Catch:{ NumberFormatException -> 0x02c3 }
        r4 = r12.d;	 Catch:{ NumberFormatException -> 0x02c3 }
        r3.<init>(r4);	 Catch:{ NumberFormatException -> 0x02c3 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x02c3 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x02c3 }
        r0.B = r2;	 Catch:{ NumberFormatException -> 0x02c3 }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02c3 }
        r0.j();	 Catch:{ NumberFormatException -> 0x02c3 }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02c3 }
        r0 = r0.t;	 Catch:{ NumberFormatException -> 0x02c3 }
        if (r0 != 0) goto L_0x02ae;
    L_0x00ef:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02c5 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x02c5 }
        if (r0 != 0) goto L_0x02ae;
    L_0x00f7:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02c7 }
        r2 = 23;
        r0.showDialog(r2);	 Catch:{ NumberFormatException -> 0x02c7 }
        if (r1 == 0) goto L_0x02ae;
    L_0x0100:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x02c9 }
        if (r0 != r6) goto L_0x012a;
    L_0x0106:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02cb }
        r0.j();	 Catch:{ NumberFormatException -> 0x02cb }
        r0 = z;	 Catch:{ NumberFormatException -> 0x02cb }
        r2 = 1;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x02cb }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x02cb }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02cb }
        r0 = r0.t;	 Catch:{ NumberFormatException -> 0x02cb }
        if (r0 != 0) goto L_0x02ae;
    L_0x0119:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02cd }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x02cd }
        if (r0 != 0) goto L_0x02ae;
    L_0x0121:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02cf }
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0.showDialog(r2);	 Catch:{ NumberFormatException -> 0x02cf }
        if (r1 == 0) goto L_0x02ae;
    L_0x012a:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x02d1 }
        if (r0 != r5) goto L_0x015c;
    L_0x0130:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02d3 }
        r0.j();	 Catch:{ NumberFormatException -> 0x02d3 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x02d3 }
        r2 = 2;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x02d3 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x02d3 }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02d3 }
        r2 = r12.h;	 Catch:{ NumberFormatException -> 0x02d3 }
        r3 = 2131231746; // 0x7f080402 float:1.8079582E38 double:1.052968389E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x02d3 }
        r5 = 0;
        r6 = r12.h;	 Catch:{ NumberFormatException -> 0x02d3 }
        r7 = 2131230939; // 0x7f0800db float:1.8077945E38 double:1.0529679903E-314;
        r6 = r6.getString(r7);	 Catch:{ NumberFormatException -> 0x02d3 }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x02d3 }
        r2 = r2.getString(r3, r4);	 Catch:{ NumberFormatException -> 0x02d3 }
        r0.j(r2);	 Catch:{ NumberFormatException -> 0x02d3 }
        if (r1 == 0) goto L_0x02ae;
    L_0x015c:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x02d5 }
        r2 = 6;
        if (r0 != r2) goto L_0x0194;
    L_0x0163:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02d7 }
        r0.j();	 Catch:{ NumberFormatException -> 0x02d7 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x02d7 }
        r2 = 3;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x02d7 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x02d7 }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02d7 }
        r0 = r0.v;	 Catch:{ NumberFormatException -> 0x02d7 }
        r0 = r0.g;	 Catch:{ NumberFormatException -> 0x02d7 }
        if (r0 != 0) goto L_0x02db;
    L_0x0178:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02d9 }
        r0 = r0.v;	 Catch:{ NumberFormatException -> 0x02d9 }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x02d9 }
    L_0x017e:
        r2 = r12.h;	 Catch:{ NumberFormatException -> 0x02eb }
        r3 = r12.h;	 Catch:{ NumberFormatException -> 0x02eb }
        r4 = 2131231743; // 0x7f0803ff float:1.8079576E38 double:1.0529683875E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x02eb }
        r6 = 0;
        r5[r6] = r0;	 Catch:{ NumberFormatException -> 0x02eb }
        r0 = r3.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x02eb }
        r2.j(r0);	 Catch:{ NumberFormatException -> 0x02eb }
        if (r1 == 0) goto L_0x02ae;
    L_0x0194:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x02eb }
        r2 = 7;
        if (r0 != r2) goto L_0x01cd;
    L_0x019b:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02ed }
        r0.j();	 Catch:{ NumberFormatException -> 0x02ed }
        r0 = z;	 Catch:{ NumberFormatException -> 0x02ed }
        r2 = 8;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x02ed }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x02ed }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02ed }
        r0 = r0.v;	 Catch:{ NumberFormatException -> 0x02ed }
        r0 = r0.g;	 Catch:{ NumberFormatException -> 0x02ed }
        if (r0 != 0) goto L_0x02f1;
    L_0x01b1:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x02ef }
        r0 = r0.v;	 Catch:{ NumberFormatException -> 0x02ef }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x02ef }
    L_0x01b7:
        r2 = r12.h;	 Catch:{ NumberFormatException -> 0x0301 }
        r3 = r12.h;	 Catch:{ NumberFormatException -> 0x0301 }
        r4 = 2131231744; // 0x7f080400 float:1.8079578E38 double:1.052968388E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x0301 }
        r6 = 0;
        r5[r6] = r0;	 Catch:{ NumberFormatException -> 0x0301 }
        r0 = r3.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x0301 }
        r2.j(r0);	 Catch:{ NumberFormatException -> 0x0301 }
        if (r1 == 0) goto L_0x02ae;
    L_0x01cd:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x0301 }
        r2 = 8;
        if (r0 != r2) goto L_0x0256;
    L_0x01d5:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x0303 }
        r0.j();	 Catch:{ NumberFormatException -> 0x0303 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0303 }
        r2 = 14;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0303 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0303 }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x0303 }
        r0 = r0.v;	 Catch:{ NumberFormatException -> 0x0303 }
        r0 = r0.g;	 Catch:{ NumberFormatException -> 0x0303 }
        if (r0 != 0) goto L_0x0307;
    L_0x01eb:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x0305 }
        r0 = r0.v;	 Catch:{ NumberFormatException -> 0x0305 }
        r0 = r0.d;	 Catch:{ NumberFormatException -> 0x0305 }
    L_0x01f1:
        r2 = r12.h;	 Catch:{ NumberFormatException -> 0x0317 }
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0317 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x0317 }
        r4 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0317 }
        r4.<init>();	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = "+";
        r4 = r4.append(r5);	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = r12.h;	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = r5.v;	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = r5.e;	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = r5.getText();	 Catch:{ NumberFormatException -> 0x0317 }
        r4 = r4.append(r5);	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = " ";
        r4 = r4.append(r5);	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = r12.h;	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = r5.v;	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = r5.c;	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = r5.getText();	 Catch:{ NumberFormatException -> 0x0317 }
        r4 = r4.append(r5);	 Catch:{ NumberFormatException -> 0x0317 }
        r4 = r4.toString();	 Catch:{ NumberFormatException -> 0x0317 }
        r4 = com.whatsapp.aam.a(r4);	 Catch:{ NumberFormatException -> 0x0317 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x0317 }
        r4 = "\n";
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x0317 }
        r4 = r12.h;	 Catch:{ NumberFormatException -> 0x0317 }
        r5 = 2131231740; // 0x7f0803fc float:1.807957E38 double:1.052968386E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0317 }
        r7 = 0;
        r6[r7] = r0;	 Catch:{ NumberFormatException -> 0x0317 }
        r0 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x0317 }
        r0 = r3.append(r0);	 Catch:{ NumberFormatException -> 0x0317 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0317 }
        r2.j(r0);	 Catch:{ NumberFormatException -> 0x0317 }
        if (r1 == 0) goto L_0x02ae;
    L_0x0256:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x0317 }
        r2 = 9;
        if (r0 != r2) goto L_0x032e;
    L_0x025e:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x0319 }
        r0.j();	 Catch:{ NumberFormatException -> 0x0319 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0319 }
        r2 = 4;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0319 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0319 }
        r0 = r12.g;	 Catch:{ NumberFormatException -> 0x0319 }
        if (r0 != 0) goto L_0x027f;
    L_0x026f:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x031b }
        r2 = r12.h;	 Catch:{ NumberFormatException -> 0x031b }
        r3 = 2131231789; // 0x7f08042d float:1.8079669E38 double:1.0529684103E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x031b }
        r0.j(r2);	 Catch:{ NumberFormatException -> 0x031b }
        if (r1 == 0) goto L_0x02ae;
    L_0x027f:
        r0 = r12.g;	 Catch:{ NumberFormatException -> 0x031d }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x031d }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r4;
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NumberFormatException -> 0x031d }
        r4 = r4 + r2;
        com.whatsapp.EnterPhoneNumber.y = r4;	 Catch:{ NumberFormatException -> 0x031d }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x031d }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x031d }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x031d }
        r4 = r12.h;	 Catch:{ NumberFormatException -> 0x031d }
        r5 = 2131231790; // 0x7f08042e float:1.807967E38 double:1.052968411E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x031d }
        r7 = 0;
        r8 = r12.h;	 Catch:{ NumberFormatException -> 0x031d }
        r2 = com.whatsapp.util.cs.f(r8, r2);	 Catch:{ NumberFormatException -> 0x031d }
        r6[r7] = r2;	 Catch:{ NumberFormatException -> 0x031d }
        r2 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x031d }
        r0.j(r2);	 Catch:{ NumberFormatException -> 0x031d }
    L_0x02ae:
        return;
    L_0x02af:
        r0 = move-exception;
        throw r0;
    L_0x02b1:
        r0 = move-exception;
        throw r0;
    L_0x02b3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02b5 }
    L_0x02b5:
        r0 = move-exception;
        throw r0;
    L_0x02b7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02b9 }
    L_0x02b9:
        r0 = move-exception;
        throw r0;
    L_0x02bb:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02bd }
    L_0x02bd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02bf }
    L_0x02bf:
        r0 = move-exception;
        throw r0;
    L_0x02c1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02c3 }
    L_0x02c3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02c5 }
    L_0x02c5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02c7 }
    L_0x02c7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02c9 }
    L_0x02c9:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02cb }
    L_0x02cb:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02cd }
    L_0x02cd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02cf }
    L_0x02cf:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02d1 }
    L_0x02d1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02d3 }
    L_0x02d3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02d5 }
    L_0x02d5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02d7 }
    L_0x02d7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02d9 }
    L_0x02d9:
        r0 = move-exception;
        throw r0;
    L_0x02db:
        r0 = r12.h;
        r0 = r0.v;
        r0 = r0.g;
        r0 = r0.getText();
        r0 = r0.toString();
        goto L_0x017e;
    L_0x02eb:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02ed }
    L_0x02ed:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02ef }
    L_0x02ef:
        r0 = move-exception;
        throw r0;
    L_0x02f1:
        r0 = r12.h;
        r0 = r0.v;
        r0 = r0.g;
        r0 = r0.getText();
        r0 = r0.toString();
        goto L_0x01b7;
    L_0x0301:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0303 }
    L_0x0303:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0305 }
    L_0x0305:
        r0 = move-exception;
        throw r0;
    L_0x0307:
        r0 = r12.h;
        r0 = r0.v;
        r0 = r0.g;
        r0 = r0.getText();
        r0 = r0.toString();
        goto L_0x01f1;
    L_0x0317:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0319 }
    L_0x0319:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x031b }
    L_0x031b:
        r0 = move-exception;
        throw r0;
    L_0x031d:
        r0 = move-exception;
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x041a }
        r2 = r12.h;	 Catch:{ NumberFormatException -> 0x041a }
        r3 = 2131231789; // 0x7f08042d float:1.8079669E38 double:1.0529684103E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x041a }
        r0.j(r2);	 Catch:{ NumberFormatException -> 0x041a }
        if (r1 == 0) goto L_0x02ae;
    L_0x032e:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x041a }
        r2 = 12;
        if (r0 != r2) goto L_0x0350;
    L_0x0336:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x041c }
        r0.j();	 Catch:{ NumberFormatException -> 0x041c }
        r0 = z;	 Catch:{ NumberFormatException -> 0x041c }
        r2 = 12;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x041c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x041c }
        r0 = 1;
        com.whatsapp.App.r = r0;	 Catch:{ NumberFormatException -> 0x041c }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x041c }
        r2 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x041c }
        if (r1 == 0) goto L_0x02ae;
    L_0x0350:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x041e }
        r2 = 14;
        if (r0 != r2) goto L_0x039c;
    L_0x0358:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x0420 }
        r0.j();	 Catch:{ NumberFormatException -> 0x0420 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0420 }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0420 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0420 }
        r0 = com.whatsapp.App.j;	 Catch:{ NumberFormatException -> 0x0420 }
        if (r0 != r11) goto L_0x0374;
    L_0x0369:
        r0 = r12.h;
        r2 = 2131231778; // 0x7f080422 float:1.8079647E38 double:1.052968405E-314;
        r0 = r0.getString(r2);
        if (r1 == 0) goto L_0x0395;
    L_0x0374:
        r0 = com.whatsapp.App.j;	 Catch:{ NumberFormatException -> 0x0422 }
        if (r0 != 0) goto L_0x0383;
    L_0x0378:
        r0 = r12.h;
        r2 = 2131231779; // 0x7f080423 float:1.8079649E38 double:1.0529684053E-314;
        r0 = r0.getString(r2);
        if (r1 == 0) goto L_0x0395;
    L_0x0383:
        r0 = r12.h;
        r2 = 2131231780; // 0x7f080424 float:1.807965E38 double:1.052968406E-314;
        r3 = new java.lang.Object[r9];
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r3[r10] = r4;
        r0 = r0.getString(r2, r3);
    L_0x0395:
        r2 = r12.h;	 Catch:{ NumberFormatException -> 0x0424 }
        r2.j(r0);	 Catch:{ NumberFormatException -> 0x0424 }
        if (r1 == 0) goto L_0x02ae;
    L_0x039c:
        r0 = r13.intValue();	 Catch:{ NumberFormatException -> 0x0424 }
        r2 = 11;
        if (r0 != r2) goto L_0x02ae;
    L_0x03a4:
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x0426 }
        r0.j();	 Catch:{ NumberFormatException -> 0x0426 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0426 }
        r2 = 13;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0426 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0426 }
        r0 = r12.g;	 Catch:{ NumberFormatException -> 0x0426 }
        if (r0 == 0) goto L_0x0400;
    L_0x03b6:
        r0 = r12.g;	 Catch:{ NumberFormatException -> 0x03e7 }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x03e7 }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r4;
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NumberFormatException -> 0x03e7 }
        r4 = r4 + r2;
        com.whatsapp.EnterPhoneNumber.y = r4;	 Catch:{ NumberFormatException -> 0x03e7 }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x03e7 }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x03e7 }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x03e7 }
        r4 = r12.h;	 Catch:{ NumberFormatException -> 0x03e7 }
        r5 = 2131231792; // 0x7f080430 float:1.8079675E38 double:1.0529684118E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x03e7 }
        r7 = 0;
        r8 = r12.h;	 Catch:{ NumberFormatException -> 0x03e7 }
        r2 = com.whatsapp.util.cs.f(r8, r2);	 Catch:{ NumberFormatException -> 0x03e7 }
        r6[r7] = r2;	 Catch:{ NumberFormatException -> 0x03e7 }
        r2 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x03e7 }
        r0.j(r2);	 Catch:{ NumberFormatException -> 0x03e7 }
        goto L_0x02ae;
    L_0x03e7:
        r0 = move-exception;
        r0 = z;	 Catch:{ NumberFormatException -> 0x0418 }
        r2 = 7;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0418 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0418 }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x0418 }
        r2 = r12.h;	 Catch:{ NumberFormatException -> 0x0418 }
        r3 = 2131231793; // 0x7f080431 float:1.8079677E38 double:1.052968412E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0418 }
        r0.j(r2);	 Catch:{ NumberFormatException -> 0x0418 }
        if (r1 == 0) goto L_0x02ae;
    L_0x0400:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0418 }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0418 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0418 }
        r0 = r12.h;	 Catch:{ NumberFormatException -> 0x0418 }
        r1 = r12.h;	 Catch:{ NumberFormatException -> 0x0418 }
        r2 = 2131231793; // 0x7f080431 float:1.8079677E38 double:1.052968412E-314;
        r1 = r1.getString(r2);	 Catch:{ NumberFormatException -> 0x0418 }
        r0.j(r1);	 Catch:{ NumberFormatException -> 0x0418 }
        goto L_0x02ae;
    L_0x0418:
        r0 = move-exception;
        throw r0;
    L_0x041a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x041c }
    L_0x041c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x041e }
    L_0x041e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0420 }
    L_0x0420:
        r0 = move-exception;
        throw r0;
    L_0x0422:
        r0 = move-exception;
        throw r0;
    L_0x0424:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0426 }
    L_0x0426:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3r.a(java.lang.Integer):void");
    }
}
