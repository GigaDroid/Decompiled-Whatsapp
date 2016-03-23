package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.Locale;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class a3l extends AsyncTask {
    private static final String[] z;
    private final boolean a;

    static {
        String[] strArr = new String[18];
        String str = "8z\u001a\u0018N8i\u0001B\\vz\u0018XK+o\u0019D\u0003|nO\u0012";
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
                        i3 = 89;
                        break;
                    case at.g /*1*/:
                        i3 = 10;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 55;
                        break;
                    default:
                        i3 = 44;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "8z\u001a\u0018N8i\u0001B\\vh\u000bTG,zG\\I '\u0004XXtx\u000fTI0|\u000fS";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "8z\u001a\u0018N8i\u0001B\\vh\u000bTG,zG\\I %\u0004B@5%\u000bTO6\u007f\u0004C\u00011k\u0019_\u00037\u007f\u0006[";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "8z\u001a\u0018N8i\u0001B\\v}\u0006\u0018M:{\u001f^^<";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "8i\u001e^C7U\bVO2\u007f\u001a";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "8z\u001a\u0018N8i\u0001B\\vm\u000eEE/oEEM7n\u0005Z\u0001.k\u0003C\u0001-c\u0007R\u00010dGDI:yE";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "8\u007f\u001eXA8~\u000fS";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ";k\t\\Y)n\b";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "8z\u001a\u0018N8i\u0001B\\v}\u0006\u0018^<f\u000fV_<";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    str = "8z\u001a\u0018N8i\u0001B\\v}\u0006\u0018^<f\u000fV_<";
                    obj = 9;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "-s\u001aR";
                    obj = 10;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ")e\u001dR^";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "8z\u001a\u0018N8i\u0001B\\v}\u000b^X0d\r\u001aJ6xGCD<'\u0001RU";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "8z\u001a\u0018N8i\u0001B\\va\u000fN\u0001+o\tRE/o\u000e";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ",y\u000fEs0d\u0003CE8~\u000fS";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "8f\u000bEA";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "8z\u001a\u0018N8i\u0001B\\v}\u0006\u0018^<f\u000fV_<";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "8z\u001a\u0018N8i\u0001B\\vo\u0018EC+*";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(a3l com_whatsapp_a3l, Object[] objArr) {
        com_whatsapp_a3l.publishProgress(objArr);
    }

    protected void onPostExecute(Object obj) {
        a((j3) obj);
    }

    protected void a(Integer[] numArr) {
        if (numArr[0].intValue() % 10 == 0) {
            Log.i(String.format(Locale.ENGLISH, z[0], new Object[]{numArr[0]}));
        }
        if (App.ap() != null) {
            App.ap().g(App.z().getString(2131231470, new Object[]{Integer.valueOf(r0)}));
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(j3 j3Var) {
        Conversation.K();
        if (App.ap() != null) {
            App.ap().e();
        }
        if (j3Var == j3.FAILED_INVALID) {
            ve.w();
        }
    }

    protected void onPreExecute() {
        App.an = false;
        if (App.ap() != null) {
            App.ap().a(2131231471, 2131231469);
        }
    }

    protected void onProgressUpdate(Object[] objArr) {
        a((Integer[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.whatsapp.j3 a(java.lang.Void[] r13) {
        /*
        r12 = this;
        r1 = 1;
        r2 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r3 = com.whatsapp.j3.FAILED_GENERIC;
        r0 = com.whatsapp.App.z();
        r4 = z;
        r6 = 12;
        r4 = r4[r6];
        r0 = r0.getSystemService(r4);
        r0 = (android.os.PowerManager) r0;
        r4 = 0;
        if (r0 == 0) goto L_0x0024;
    L_0x0019:
        r4 = z;
        r6 = 8;
        r4 = r4[r6];
        r0 = r0.newWakeLock(r1, r4);
        r4 = r0;
    L_0x0024:
        if (r4 == 0) goto L_0x0029;
    L_0x0026:
        r4.acquire();	 Catch:{ IOException -> 0x0154 }
    L_0x0029:
        r0 = z;	 Catch:{ IOException -> 0x0156 }
        r6 = 4;
        r0 = r0[r6];	 Catch:{ IOException -> 0x0156 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0156 }
        r0 = com.whatsapp.ve.I();	 Catch:{ IOException -> 0x0156 }
        if (r0 == 0) goto L_0x007d;
    L_0x0037:
        r0 = com.whatsapp.ve.n();	 Catch:{ IOException -> 0x0156 }
        r6 = com.whatsapp.ve.a(r0);	 Catch:{ IOException -> 0x0156 }
        if (r6 == 0) goto L_0x0075;
    L_0x0041:
        r7 = new android.os.ConditionVariable;	 Catch:{ IOException -> 0x0156 }
        r8 = 0;
        r7.<init>(r8);	 Catch:{ IOException -> 0x0156 }
        r8 = new com.whatsapp.co;	 Catch:{ IOException -> 0x0156 }
        r8.<init>(r12, r7);	 Catch:{ IOException -> 0x0156 }
        com.whatsapp.App.a(r6, r0, r8);	 Catch:{ IOException -> 0x0156 }
        r0 = z;	 Catch:{ IOException -> 0x0156 }
        r6 = 13;
        r0 = r0[r6];	 Catch:{ IOException -> 0x0156 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0156 }
        r8 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r0 = r7.block(r8);	 Catch:{ IOException -> 0x018d }
        if (r0 != 0) goto L_0x006a;
    L_0x0060:
        r0 = z;	 Catch:{ IOException -> 0x018d }
        r6 = 2;
        r0 = r0[r6];	 Catch:{ IOException -> 0x018d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x018d }
        if (r5 == 0) goto L_0x0073;
    L_0x006a:
        r0 = z;	 Catch:{ IOException -> 0x018f }
        r6 = 14;
        r0 = r0[r6];	 Catch:{ IOException -> 0x018f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x018f }
    L_0x0073:
        if (r5 == 0) goto L_0x007d;
    L_0x0075:
        r0 = z;	 Catch:{ IOException -> 0x01a7 }
        r6 = 3;
        r0 = r0[r6];	 Catch:{ IOException -> 0x01a7 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x01a7 }
    L_0x007d:
        r0 = com.whatsapp.App.aK;	 Catch:{ IOException -> 0x0156 }
        r6 = 1;
        r7 = r12.a;	 Catch:{ IOException -> 0x0156 }
        r8 = new com.whatsapp.x;	 Catch:{ IOException -> 0x0156 }
        r8.<init>(r12);	 Catch:{ IOException -> 0x0156 }
        r3 = r0.a(r6, r7, r8);	 Catch:{ IOException -> 0x0156 }
        r0 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x01a9 }
        com.whatsapp.wallpaper.k.a(r0);	 Catch:{ IOException -> 0x01a9 }
        r0 = com.whatsapp.j3.SUCCESS;	 Catch:{ IOException -> 0x01a9 }
        if (r3 != r0) goto L_0x01ad;
    L_0x0096:
        r0 = com.whatsapp.gdrive.GoogleDriveService.z();	 Catch:{ IOException -> 0x01a9 }
        if (r0 == 0) goto L_0x01ad;
    L_0x009c:
        r0 = r1;
    L_0x009d:
        r6 = com.whatsapp.App.W();	 Catch:{ IOException -> 0x01b0 }
        if (r6 == 0) goto L_0x00ad;
    L_0x00a3:
        r6 = com.whatsapp.gdrive.GoogleDriveService.Y();	 Catch:{ IOException -> 0x01b0 }
        if (r6 == 0) goto L_0x00aa;
    L_0x00a9:
        r2 = r1;
    L_0x00aa:
        r0 = r0 & r2;
        if (r5 == 0) goto L_0x00bd;
    L_0x00ad:
        r1 = com.whatsapp.gdrive.GoogleDriveService.e();	 Catch:{ IOException -> 0x0156 }
        r0 = r0 & r1;
        r1 = new java.util.Random;	 Catch:{ IOException -> 0x0156 }
        r1.<init>();	 Catch:{ IOException -> 0x0156 }
        r2 = 14400; // 0x3840 float:2.0179E-41 double:7.1145E-320;
        r1 = r1.nextInt(r2);	 Catch:{ IOException -> 0x0156 }
    L_0x00bd:
        if (r0 == 0) goto L_0x013a;
    L_0x00bf:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0156 }
        r0.<init>();	 Catch:{ IOException -> 0x0156 }
        r2 = z;	 Catch:{ IOException -> 0x0156 }
        r6 = 6;
        r2 = r2[r6];	 Catch:{ IOException -> 0x0156 }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x0156 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0156 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0156 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0156 }
        r2 = new android.content.Intent;	 Catch:{ IOException -> 0x0156 }
        r0 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0156 }
        r6 = com.whatsapp.gdrive.GoogleDriveService.class;
        r2.<init>(r0, r6);	 Catch:{ IOException -> 0x0156 }
        r0 = z;	 Catch:{ IOException -> 0x01b4 }
        r6 = 5;
        r0 = r0[r6];	 Catch:{ IOException -> 0x01b4 }
        r2.setAction(r0);	 Catch:{ IOException -> 0x01b4 }
        r0 = z;	 Catch:{ IOException -> 0x01b4 }
        r6 = 11;
        r6 = r0[r6];	 Catch:{ IOException -> 0x01b4 }
        r0 = com.whatsapp.App.W();	 Catch:{ IOException -> 0x01b4 }
        if (r0 == 0) goto L_0x01b6;
    L_0x00f7:
        r0 = z;	 Catch:{ IOException -> 0x01b4 }
        r7 = 15;
        r0 = r0[r7];	 Catch:{ IOException -> 0x01b4 }
    L_0x00fd:
        r2.putExtra(r6, r0);	 Catch:{ IOException -> 0x0156 }
        r0 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0156 }
        r6 = z;	 Catch:{ IOException -> 0x0156 }
        r7 = 16;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0156 }
        r0 = r0.getSystemService(r6);	 Catch:{ IOException -> 0x0156 }
        r0 = (android.app.AlarmManager) r0;	 Catch:{ IOException -> 0x0156 }
        r6 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0156 }
        r7 = 0;
        r8 = 0;
        r2 = android.app.PendingIntent.getService(r6, r7, r2, r8);	 Catch:{ IOException -> 0x0156 }
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x01bd }
        r7 = 19;
        if (r6 < r7) goto L_0x012e;
    L_0x0120:
        r6 = 2;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ IOException -> 0x01bd }
        r7 = r1 * 1000;
        r10 = (long) r7;	 Catch:{ IOException -> 0x01bd }
        r8 = r8 + r10;
        r0.setExact(r6, r8, r2);	 Catch:{ IOException -> 0x01bd }
        if (r5 == 0) goto L_0x013a;
    L_0x012e:
        r5 = 2;
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ IOException -> 0x01bf }
        r1 = r1 * 1000;
        r8 = (long) r1;	 Catch:{ IOException -> 0x01bf }
        r6 = r6 + r8;
        r0.set(r5, r6, r2);	 Catch:{ IOException -> 0x01bf }
    L_0x013a:
        r0 = 0;
        com.whatsapp.App.b(r0);	 Catch:{ IOException -> 0x0156 }
        if (r4 == 0) goto L_0x01c5;
    L_0x0140:
        r0 = r4.isHeld();	 Catch:{ IOException -> 0x01c1 }
        if (r0 == 0) goto L_0x01c5;
    L_0x0146:
        r4.release();	 Catch:{ IOException -> 0x01c1 }
        r0 = z;	 Catch:{ IOException -> 0x01c1 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ IOException -> 0x01c1 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x01c1 }
        r0 = r3;
    L_0x0153:
        return r0;
    L_0x0154:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0156 }
    L_0x0156:
        r0 = move-exception;
        r1 = r0;
        r0 = r3;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0191 }
        r2.<init>();	 Catch:{ all -> 0x0191 }
        r3 = z;	 Catch:{ all -> 0x0191 }
        r5 = 1;
        r3 = r3[r5];	 Catch:{ all -> 0x0191 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0191 }
        r1 = r1.toString();	 Catch:{ all -> 0x0191 }
        r1 = r2.append(r1);	 Catch:{ all -> 0x0191 }
        r1 = r1.toString();	 Catch:{ all -> 0x0191 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ all -> 0x0191 }
        if (r4 == 0) goto L_0x0153;
    L_0x0178:
        r1 = r4.isHeld();	 Catch:{ IOException -> 0x018b }
        if (r1 == 0) goto L_0x0153;
    L_0x017e:
        r4.release();	 Catch:{ IOException -> 0x018b }
        r1 = z;	 Catch:{ IOException -> 0x018b }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ IOException -> 0x018b }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x018b }
        goto L_0x0153;
    L_0x018b:
        r0 = move-exception;
        throw r0;
    L_0x018d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x018f }
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0156 }
    L_0x0191:
        r0 = move-exception;
        if (r4 == 0) goto L_0x01a6;
    L_0x0194:
        r1 = r4.isHeld();	 Catch:{ IOException -> 0x01c3 }
        if (r1 == 0) goto L_0x01a6;
    L_0x019a:
        r4.release();	 Catch:{ IOException -> 0x01c3 }
        r1 = z;	 Catch:{ IOException -> 0x01c3 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ IOException -> 0x01c3 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x01c3 }
    L_0x01a6:
        throw r0;
    L_0x01a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0156 }
    L_0x01a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01ab }
    L_0x01ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0156 }
    L_0x01ad:
        r0 = r2;
        goto L_0x009d;
    L_0x01b0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01b2 }
    L_0x01b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0156 }
    L_0x01b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0156 }
    L_0x01b6:
        r0 = z;	 Catch:{ IOException -> 0x0156 }
        r7 = 7;
        r0 = r0[r7];	 Catch:{ IOException -> 0x0156 }
        goto L_0x00fd;
    L_0x01bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01bf }
    L_0x01bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0156 }
    L_0x01c1:
        r0 = move-exception;
        throw r0;
    L_0x01c3:
        r0 = move-exception;
        throw r0;
    L_0x01c5:
        r0 = r3;
        goto L_0x0153;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3l.a(java.lang.Void[]):com.whatsapp.j3");
    }

    protected a3l(boolean z) {
        this.a = z;
    }
}
