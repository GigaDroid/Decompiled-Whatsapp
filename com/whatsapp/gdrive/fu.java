package com.whatsapp.gdrive;

import android.accounts.Account;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.ab;
import java.util.Timer;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class fu extends AsyncTask {
    private static final String[] z;
    final GoogleDriveActivity a;
    final ab b;
    final Timer c;
    final Account[] d;

    static {
        String[] strArr = new String[19];
        String str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0013 7JE\u0015#7JB\u0019:'\u0017\u001e\u000e+3\u0003\u001c\u000f:=\u0015P\u001b+\u007f\u0017T\u000e#;\u0014B\u0015!<JF\u0015::\u0003C\u001d9<HT\u0004'&\u000e_\u001b";
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
                        i3 = 49;
                        break;
                    case at.g /*1*/:
                        i3 = 124;
                        break;
                    case at.i /*2*/:
                        i3 = 78;
                        break;
                    case at.o /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0013 7JE\u0015#7JB\u0019:'\u0017\u0011\u001a/;\u000bT\u0018n&\b\u0011\u001d-1\u0002B\u000fn3\u0004R\u0013;<\u0013\u000b\\";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0013 7JE\u0015#7JB\u0019:'\u0017\u001e\u001a/;\u000bT\u0018c&\b\u001c\u001a+&\u0004YQ/'\u0013YQ:=\fT\u0012";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0013 7JE\u0015#7JB\u0019:'\u0017\u0011\u0013 7GP\u001f-=\u0012_\bn:\u0006B\\)=\bV\u0010+r\u0003C\u001587GS\u001d-9\u0012AR";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u001f/>\u0004";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0013 7JE\u0015#7JB\u0019:'\u0017\u001e\u001f/<\u0004T\u0010\"7\u0003";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0013 7JE\u0015#7JB\u0019:'\u0017\u001e\u000f%;\u0017A\u0015 5JP\u001f-=\u0012_\ba";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0013 7JE\u0015#7JB\u0019:'\u0017\u0011\u001e/1\fV\u000e!'\tU\\:3\u0014Z\\(;\tX\u000f&7\u0003\u0011\u001e;&GA\u001d<7\tE\\/1\u0013X\n'&\u001e\u0011\u0014/!GP\u0010<7\u0006U\u0005n7\u001fX\b+6K\u0011\b&7\u0015T\u001a! \u0002\u001d\\=&\bA\f'<\u0000\u0011\b&7GE\u001d=9I\u00118/&\u0006\u000b\\";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0013 7JE\u0015#7JB\u0019:'\u0017\u001e\u0012;?J^\u001ac>\bR\u001d\"\u007f\u0005P\u001f%'\u0017\u001c\u001a'>\u0002BS";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "^\u0012+\u007f\u0013X\u0011+\u007f\u0014T\b;\"JE\u001d%;\tVQ:=\b\u001c\u0010!<\u0000";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\\\u0019=!\u0006V\u0019";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "U\u0015/>\bV#'6";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "R\u001d 1\u0002]\u001d,>\u0002";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "}\u0013/6GE\u0015#7]\u0011Y``\u0001\u0011\u000f+1\b_\u0018=";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0013 7JE\u0015#7JB\u0019:'\u0017\u0011\t=7\u0015\u0011\u0015=r\u0006_\\+*\u000eB\b'<\u0000\u0011\t=7\u0015\u0011\u001e;&GY\u001d=r\t^\\)=\bV\u0010+r\u0003C\u001587GS\u001d-9\u0012A\u000fn4\bD\u0012*r\u0006_\u0018n<\b\u0011\u0010!1\u0006]\\,3\u0004Z\t>!GT\u0004'!\u0013\u0011\u0019'&\u000fT\u000ebr\u0010P\u000e r\u0013Y\u0019n'\u0014T\u000e`";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "A\u0013=;\u0013X\n+\r\u0005D\b:=\t";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0013 7JE\u0015#7JB\u0019:'\u0017\u0011\u0012!r\u0000^\u0013)>\u0002\u0011\u0018<;\u0011T\\,3\u0004Z\t>!GW\u0013;<\u0003\u0011\u001e;&G]\u0013-3\u000b\u0011\u001e/1\fD\fn7\u001fX\u000f:!I";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "_\u0019)3\u0013X\n+\r\u0005D\b:=\t";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "V\u0018<;\u0011TQ/1\u0013X\n'&\u001e\u001e\u0018+1\u000eU\u0019";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(@android.support.annotation.Nullable com.whatsapp.gdrive.c4 r11) {
        /*
        r10 = this;
        r1 = 0;
        r9 = 14;
        r3 = 1;
        r4 = 0;
        r5 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = r10.a;
        r0 = r0.getSupportFragmentManager();
        r2 = z;
        r6 = 10;
        r2 = r2[r6];
        r0 = r0.findFragmentByTag(r2);
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = (com.whatsapp.gdrive.PromptDialogFragment) r0;
        r0.dismissAllowingStateLoss();
    L_0x001e:
        r0 = r10.a;
        r0 = com.whatsapp.gdrive.fn.a(r0);
        if (r0 == 0) goto L_0x0041;
    L_0x0026:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r11);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x0040:
        return;
    L_0x0041:
        if (r11 == 0) goto L_0x016e;
    L_0x0043:
        r0 = r11.f;
    L_0x0045:
        r2 = com.whatsapp.App.aK;
        r2 = r2.F();
        if (r2 <= 0) goto L_0x0171;
    L_0x004d:
        r2 = r3;
    L_0x004e:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 9;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r7 = com.whatsapp.App.aK;
        r7 = r7.F();
        r6 = r6.append(r7);
        r6 = r6.toString();
        com.whatsapp.util.Log.i(r6);
        r6 = r10.a;
        com.whatsapp.gdrive.GoogleDriveActivity.b(r6, r11);
        if (r0 == 0) goto L_0x007c;
    L_0x0075:
        r0 = r10.a;
        com.whatsapp.gdrive.GoogleDriveActivity.a(r0, r11);
        if (r5 == 0) goto L_0x012e;
    L_0x007c:
        if (r2 == 0) goto L_0x009d;
    L_0x007e:
        r0 = r10.a;
        r0 = com.whatsapp.gdrive.GoogleDriveActivity.o(r0);
        if (r0 == 0) goto L_0x009d;
    L_0x0086:
        r0 = z;
        r2 = 17;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r10.a;
        r2 = com.whatsapp.fieldstats.b6.ONLY_LOCAL_BACKUP_FOUND;
        com.whatsapp.gdrive.GoogleDriveActivity.a(r0, r2);
        r0 = r10.a;
        com.whatsapp.gdrive.GoogleDriveActivity.g(r0);
        if (r5 == 0) goto L_0x012e;
    L_0x009d:
        r0 = r10.a;
        r0 = com.whatsapp.gdrive.GoogleDriveActivity.w(r0);
        if (r0 == 0) goto L_0x00b1;
    L_0x00a5:
        r0 = r10.a;
        com.whatsapp.gdrive.GoogleDriveActivity.q(r0);
        r0 = r10.a;
        r0.setResult(r3);
        if (r5 == 0) goto L_0x012e;
    L_0x00b1:
        r0 = z;
        r2 = 15;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r10.a;
        r2 = com.whatsapp.fieldstats.b6.NO_BACKUP_FOUND;
        com.whatsapp.gdrive.GoogleDriveActivity.a(r0, r2);
        r0 = new com.whatsapp.gdrive.PromptDialogFragment;
        r0.<init>();
        r2 = new android.os.Bundle;
        r2.<init>();
        r5 = z;
        r6 = 12;
        r5 = r5[r6];
        r2.putInt(r5, r9);
        r5 = z;
        r6 = 11;
        r5 = r5[r6];
        r6 = r10.a;
        r7 = 2131231240; // 0x7f080208 float:1.8078555E38 double:1.052968139E-314;
        r6 = r6.getString(r7);
        r2.putString(r5, r6);
        r5 = z;
        r6 = 13;
        r5 = r5[r6];
        r2.putBoolean(r5, r4);
        r5 = z;
        r6 = 16;
        r5 = r5[r6];
        r6 = r10.a;
        r7 = 2131231199; // 0x7f0801df float:1.8078472E38 double:1.052968119E-314;
        r6 = r6.getString(r7);
        r2.putString(r5, r6);
        r5 = z;
        r6 = 18;
        r5 = r5[r6];
        r6 = r10.a;
        r7 = 2131232028; // 0x7f08051c float:1.8080154E38 double:1.0529685284E-314;
        r6 = r6.getString(r7);
        r2.putString(r5, r6);
        r0.setArguments(r2);
        r2 = r10.a;
        r2 = com.whatsapp.gdrive.fn.a(r2);
        if (r2 != 0) goto L_0x012e;
    L_0x011e:
        r2 = r10.a;
        r2 = r2.getSupportFragmentManager();
        r2 = r2.beginTransaction();
        r2.add(r0, r1);
        r2.commitAllowingStateLoss();
    L_0x012e:
        r0 = java.util.Locale.ENGLISH;
        r1 = z;
        r1 = r1[r9];
        r2 = new java.lang.Object[r3];
        r3 = r10.b;
        r6 = r3.d();
        r6 = (double) r6;
        r8 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r6 = r6 / r8;
        r3 = java.lang.Double.valueOf(r6);
        r2[r4] = r3;
        r0 = java.lang.String.format(r0, r1, r2);
        com.whatsapp.App.v(r0);
        r0 = r10.a;
        r1 = com.whatsapp.fieldstats.bn.RESTORE_SCREEN_LOAD_TIME;
        r2 = r10.b;
        r2 = r2.d();
        r2 = (double) r2;
        r2 = java.lang.Double.valueOf(r2);
        com.whatsapp.fieldstats.i.a(r0, r1, r2);
        r0 = r10.b;
        r0.b();
        r0 = r10.c;
        r0.cancel();
        goto L_0x0040;
    L_0x016e:
        r0 = r1;
        goto L_0x0045;
    L_0x0171:
        r2 = r4;
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fu.a(com.whatsapp.gdrive.c4):void");
    }

    protected Object doInBackground(Object[] objArr) {
        return a(objArr);
    }

    fu(GoogleDriveActivity googleDriveActivity, Account[] accountArr, ab abVar, Timer timer) {
        this.a = googleDriveActivity;
        this.d = accountArr;
        this.b = abVar;
        this.c = timer;
    }

    protected void onPostExecute(@Nullable Object obj) {
        a((c4) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.whatsapp.gdrive.c4 a(java.lang.Object[] r22) {
        /*
        r21 = this;
        r14 = com.whatsapp.gdrive.GoogleDriveService.c;
        r10 = -1;
        r3 = 0;
        r2 = 0;
        r12 = 0;
        r7 = 0;
        r4 = 0;
        r0 = r21;
        r5 = r0.a;
        r5 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r5);
        if (r5 != 0) goto L_0x0267;
    L_0x0013:
        r0 = r21;
        r15 = r0.d;
        r0 = r15.length;
        r16 = r0;
        r5 = 0;
        r13 = r5;
        r6 = r7;
        r9 = r3;
        r7 = r2;
    L_0x001f:
        r0 = r16;
        if (r13 >= r0) goto L_0x0253;
    L_0x0023:
        r17 = r15[r13];
        r0 = r21;
        r2 = r0.a;	 Catch:{ ea -> 0x003d }
        r2 = com.whatsapp.gdrive.GoogleDriveActivity.x(r2);	 Catch:{ ea -> 0x003d }
        r2 = r2.get();	 Catch:{ ea -> 0x003d }
        if (r2 == 0) goto L_0x003f;
    L_0x0033:
        r2 = z;	 Catch:{ ea -> 0x003d }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ ea -> 0x003d }
        com.whatsapp.util.Log.i(r2);	 Catch:{ ea -> 0x003d }
        r2 = 0;
    L_0x003c:
        return r2;
    L_0x003d:
        r2 = move-exception;
        throw r2;
    L_0x003f:
        r0 = r21;
        r2 = r0.a;	 Catch:{ ea -> 0x0199 }
        r2 = com.whatsapp.gdrive.GoogleDriveActivity.f(r2);	 Catch:{ ea -> 0x0199 }
        r0 = r17;
        r2 = r2.contains(r0);	 Catch:{ ea -> 0x0199 }
        if (r2 == 0) goto L_0x0070;
    L_0x004f:
        r2 = new java.lang.StringBuilder;	 Catch:{ ea -> 0x0199 }
        r2.<init>();	 Catch:{ ea -> 0x0199 }
        r3 = z;	 Catch:{ ea -> 0x0199 }
        r5 = 7;
        r3 = r3[r5];	 Catch:{ ea -> 0x0199 }
        r2 = r2.append(r3);	 Catch:{ ea -> 0x0199 }
        r0 = r17;
        r3 = r0.name;	 Catch:{ ea -> 0x0199 }
        r3 = com.whatsapp.gdrive.fn.a(r3);	 Catch:{ ea -> 0x0199 }
        r2 = r2.append(r3);	 Catch:{ ea -> 0x0199 }
        r2 = r2.toString();	 Catch:{ ea -> 0x0199 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ ea -> 0x0199 }
    L_0x0070:
        r0 = r17;
        r8 = r0.name;
        r5 = new com.whatsapp.gdrive.bc;
        r0 = r21;
        r2 = r0.a;
        r2 = r2.getApplicationContext();
        r5.<init>(r8, r2);
        r0 = r21;
        r2 = r0.a;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r2 = com.whatsapp.gdrive.GoogleDriveActivity.l(r2);	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r3 = new com.whatsapp.gdrive.aa;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r0 = r21;
        r3.<init>(r0, r5, r8);	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r18 = z;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r19 = 3;
        r18 = r18[r19];	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r0 = r18;
        r2 = com.whatsapp.gdrive.by.a(r2, r3, r0);	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        if (r2 == 0) goto L_0x0245;
    L_0x00a0:
        r2 = r2.booleanValue();	 Catch:{ ea -> 0x019b, ei -> 0x01c6, et -> 0x0240 }
        if (r2 == 0) goto L_0x0245;
    L_0x00a6:
        r0 = r21;
        r2 = r0.a;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r3 = com.whatsapp.gdrive.GoogleDriveActivity.a(r2, r5);	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        if (r3 == 0) goto L_0x0245;
    L_0x00b0:
        r2 = r3.first;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r2 = (com.whatsapp.gdrive.fs) r2;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r3 = r3.second;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        r3 = (com.whatsapp.gdrive.fs) r3;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        if (r3 == 0) goto L_0x024c;
    L_0x00ba:
        r18 = z;	 Catch:{ ea -> 0x01c4, ei -> 0x01c6, et -> 0x0240 }
        r19 = 4;
        r18 = r18[r19];	 Catch:{ ea -> 0x01c4, ei -> 0x01c6, et -> 0x0240 }
        com.whatsapp.util.Log.i(r18);	 Catch:{ ea -> 0x01c4, ei -> 0x01c6, et -> 0x0240 }
        r18 = r3.c();	 Catch:{ ea -> 0x01c4, ei -> 0x01c6, et -> 0x0240 }
        r18 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1));
        if (r18 <= 0) goto L_0x0245;
    L_0x00cb:
        r6 = r3.c();	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
        if (r14 == 0) goto L_0x0262;
    L_0x00d1:
        r4 = r2;
        r2 = r5;
        r5 = r8;
    L_0x00d4:
        r0 = r21;
        r9 = r0.a;	 Catch:{ ea -> 0x01cc, ei -> 0x0238, et -> 0x0227 }
        r9 = com.whatsapp.gdrive.GoogleDriveActivity.f(r9);	 Catch:{ ea -> 0x01cc, ei -> 0x0238, et -> 0x0227 }
        r0 = r17;
        r9.add(r0);	 Catch:{ ea -> 0x01cc, ei -> 0x0238, et -> 0x0227 }
    L_0x00e1:
        r10 = r6;
        r7 = r2;
        r2 = r4;
        r4 = r3;
        r3 = r5;
    L_0x00e6:
        r5 = r13 + 1;
        if (r14 == 0) goto L_0x025c;
    L_0x00ea:
        r6 = r4;
        r4 = r2;
    L_0x00ec:
        r13 = 0;
        if (r7 == 0) goto L_0x021f;
    L_0x00ef:
        r2 = com.whatsapp.gdrive.GoogleDriveService.v;	 Catch:{ ea -> 0x0236, ei -> 0x01d6, et -> 0x0234 }
        r2 = com.whatsapp.gdrive.GoogleDriveService.a(r7, r4, r2);	 Catch:{ ea -> 0x0236, ei -> 0x01d6, et -> 0x0234 }
        r5 = r2;
    L_0x00f6:
        r9 = r4.g();
        if (r5 == 0) goto L_0x01e4;
    L_0x00fc:
        r2 = r5.g();	 Catch:{ ea -> 0x01e2 }
    L_0x0100:
        r8 = new com.whatsapp.gdrive.b6;
        r8.<init>(r7, r9, r2, r6);
        r2 = 0;
        r0 = r21;
        r6 = r0.a;	 Catch:{ eo -> 0x01e7 }
        r6 = com.whatsapp.gdrive.GoogleDriveActivity.l(r6);	 Catch:{ eo -> 0x01e7 }
        r8.a(r2, r6);	 Catch:{ eo -> 0x01e7 }
    L_0x0111:
        r6 = 0;
        r9 = com.whatsapp.azf.f();
        r10 = r9.length;
        r2 = 0;
        r20 = r2;
        r2 = r6;
        r6 = r20;
    L_0x011d:
        if (r6 >= r10) goto L_0x0242;
    L_0x011f:
        r2 = r9[r6];
        r2 = r2.getAbsolutePath();
        r2 = com.whatsapp.gdrive.fn.b(r2);
        r2 = r8.c(r2);
        if (r2 == 0) goto L_0x0131;
    L_0x012f:
        if (r14 == 0) goto L_0x0242;
    L_0x0131:
        r6 = r6 + 1;
        if (r14 == 0) goto L_0x011d;
    L_0x0135:
        r6 = r2;
    L_0x0136:
        if (r6 == 0) goto L_0x01ef;
    L_0x0138:
        r2 = r6.g();	 Catch:{ ea -> 0x01ed }
    L_0x013c:
        r9 = new com.whatsapp.util.ab;
        r10 = z;
        r11 = 1;
        r10 = r10[r11];
        r9.<init>(r10);
        if (r6 == 0) goto L_0x01f4;
    L_0x0148:
        r6 = r6.h();	 Catch:{ ea -> 0x01f2 }
    L_0x014c:
        r0 = r21;
        r10 = r0.a;	 Catch:{ ez -> 0x01f7 }
        r12 = com.whatsapp.gdrive.GoogleDriveActivity.a(r10, r6, r7, r2);	 Catch:{ ez -> 0x01f7 }
        r9.b();
        r2 = new java.util.concurrent.ArrayBlockingQueue;
        r6 = 1;
        r2.<init>(r6);
        r6 = new com.whatsapp.gdrive.e8;
        r0 = r21;
        r6.<init>(r0, r8, r12, r2);
        com.whatsapp.util.bq.a(r6);
        r2 = r2.take();	 Catch:{ InterruptedException -> 0x0215 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ InterruptedException -> 0x0215 }
        if (r2 == 0) goto L_0x021c;
    L_0x016f:
        r2 = r2.booleanValue();	 Catch:{ ea -> 0x0211 }
        if (r2 == 0) goto L_0x021c;
    L_0x0175:
        r2 = 1;
    L_0x0176:
        r13 = r2;
        r6 = r8;
    L_0x0178:
        r8 = -1;
        if (r6 == 0) goto L_0x018a;
    L_0x017c:
        r2 = r6.r();	 Catch:{ ea -> 0x0225 }
        if (r2 == 0) goto L_0x018a;
    L_0x0182:
        r2 = r6.r();
        r8 = r2.c();
    L_0x018a:
        r10 = -1;
        if (r6 == 0) goto L_0x0192;
    L_0x018e:
        r10 = r6.j();
    L_0x0192:
        r2 = new com.whatsapp.gdrive.c4;
        r2.<init>(r3, r4, r5, r6, r7, r8, r10, r12, r13);
        goto L_0x003c;
    L_0x0199:
        r2 = move-exception;
        throw r2;
    L_0x019b:
        r2 = move-exception;
        throw r2;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
    L_0x019d:
        r2 = move-exception;
    L_0x019e:
        r5 = r2;
        r3 = r9;
        r2 = r7;
        r7 = r6;
    L_0x01a2:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01c2 }
        r6.<init>();	 Catch:{ all -> 0x01c2 }
        r9 = z;	 Catch:{ all -> 0x01c2 }
        r17 = 2;
        r9 = r9[r17];	 Catch:{ all -> 0x01c2 }
        r6 = r6.append(r9);	 Catch:{ all -> 0x01c2 }
        r8 = com.whatsapp.gdrive.fn.a(r8);	 Catch:{ all -> 0x01c2 }
        r6 = r6.append(r8);	 Catch:{ all -> 0x01c2 }
        r6 = r6.toString();	 Catch:{ all -> 0x01c2 }
        com.whatsapp.util.Log.a(r6, r5);	 Catch:{ all -> 0x01c2 }
        goto L_0x00e6;
    L_0x01c2:
        r2 = move-exception;
        throw r2;
    L_0x01c4:
        r2 = move-exception;
        throw r2;	 Catch:{ ea -> 0x019d, ei -> 0x01c6, et -> 0x0240 }
    L_0x01c6:
        r2 = move-exception;
    L_0x01c7:
        r5 = r2;
        r3 = r9;
        r2 = r7;
        r7 = r6;
        goto L_0x01a2;
    L_0x01cc:
        r9 = move-exception;
        throw r9;	 Catch:{ ea -> 0x01ce, ei -> 0x0238, et -> 0x0227 }
    L_0x01ce:
        r9 = move-exception;
        r10 = r6;
        r6 = r2;
        r7 = r4;
        r4 = r3;
        r2 = r9;
        r9 = r5;
        goto L_0x019e;
    L_0x01d6:
        r2 = move-exception;
    L_0x01d7:
        r5 = z;
        r8 = 5;
        r5 = r5[r8];
        com.whatsapp.util.Log.b(r5, r2);
        r5 = r12;
        goto L_0x00f6;
    L_0x01e2:
        r2 = move-exception;
        throw r2;
    L_0x01e4:
        r2 = 0;
        goto L_0x0100;
    L_0x01e7:
        r2 = move-exception;
        com.whatsapp.util.Log.a(r2);
        goto L_0x0111;
    L_0x01ed:
        r2 = move-exception;
        throw r2;
    L_0x01ef:
        r2 = 0;
        goto L_0x013c;
    L_0x01f2:
        r2 = move-exception;
        throw r2;
    L_0x01f4:
        r6 = 0;
        goto L_0x014c;
    L_0x01f7:
        r2 = move-exception;
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        r0 = r21;
        r2 = r0.a;
        com.whatsapp.gdrive.GoogleDriveActivity.d(r2);
        r0 = r21;
        r2 = r0.a;
        r2.finish();
        r2 = 0;
        goto L_0x003c;
    L_0x0211:
        r2 = move-exception;
        throw r2;	 Catch:{ ea -> 0x0213 }
    L_0x0213:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0215 }
    L_0x0215:
        r2 = move-exception;
        com.whatsapp.util.Log.a(r2);
        r2 = 0;
        goto L_0x0176;
    L_0x021c:
        r2 = 0;
        goto L_0x0176;
    L_0x021f:
        r6 = 0;
        r2 = 0;
        r5 = r12;
        r12 = r2;
        goto L_0x0178;
    L_0x0225:
        r2 = move-exception;
        throw r2;
    L_0x0227:
        r9 = move-exception;
        r10 = r6;
        r6 = r2;
        r7 = r4;
        r4 = r3;
        r2 = r9;
        r9 = r5;
    L_0x022e:
        r5 = r2;
        r3 = r9;
        r2 = r7;
        r7 = r6;
        goto L_0x01a2;
    L_0x0234:
        r2 = move-exception;
        goto L_0x01d7;
    L_0x0236:
        r2 = move-exception;
        goto L_0x01d7;
    L_0x0238:
        r9 = move-exception;
        r10 = r6;
        r6 = r2;
        r7 = r4;
        r4 = r3;
        r2 = r9;
        r9 = r5;
        goto L_0x01c7;
    L_0x0240:
        r2 = move-exception;
        goto L_0x022e;
    L_0x0242:
        r6 = r2;
        goto L_0x0136;
    L_0x0245:
        r3 = r4;
        r2 = r6;
        r5 = r9;
        r4 = r7;
        r6 = r10;
        goto L_0x00e1;
    L_0x024c:
        r3 = r4;
        r2 = r6;
        r5 = r9;
        r4 = r7;
        r6 = r10;
        goto L_0x00d4;
    L_0x0253:
        r3 = r9;
        r20 = r6;
        r6 = r4;
        r4 = r7;
        r7 = r20;
        goto L_0x00ec;
    L_0x025c:
        r13 = r5;
        r6 = r7;
        r9 = r3;
        r7 = r2;
        goto L_0x001f;
    L_0x0262:
        r4 = r2;
        r2 = r5;
        r5 = r8;
        goto L_0x00e1;
    L_0x0267:
        r6 = r4;
        r4 = r2;
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fu.a(java.lang.Object[]):com.whatsapp.gdrive.c4");
    }
}
