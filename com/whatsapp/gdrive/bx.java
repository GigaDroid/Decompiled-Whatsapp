package com.whatsapp.gdrive;

import com.whatsapp.gdrive.SettingsGoogleDrive.AuthRequestDialogFragment;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class bx implements Runnable {
    private static final String[] z;
    final SettingsGoogleDrive a;
    final AuthRequestDialogFragment b;
    final String c;

    static {
        String[] strArr = new String[12];
        String str = "\u000ft\u0016\u0003rR/\u000b\u0003n\u0010fYX5\u0017b\u0014Y}\u000fz\u0004\u001b\u007f\u0001e\n\u00044\u0003z\u000eX{\u0015a\u000bX~\u0012|\u0015\u00124\u0001e\u0013\u0013{\u0014tC\u001fn\u0014e\u0010M5Ob\u0014\u00004\u0007z\f\u0010v\u0005t\u0013\u001eiNv\f\u001a5\u0001`\u0017\u001f5\u0004g\n\u0001\u007fNs\n\u001b\u007f";
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
                        i3 = 96;
                        break;
                    case at.g /*1*/:
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = 99;
                        break;
                    case at.o /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0013p\u0017\u0003s\u000er\u0010Z}\u0004g\n\u0001\u007fOt\u0016\u0003rMg\u0006\u0006o\u0005f\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0013p\u0017\u0003s\u000er\u0010Z}\u0004g\n\u0001\u007fOr\u0013\u00047\u0015{\u0002\u0001{\ty\u0002\u0015v\u0005";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0013p\u0017\u0003s\u000er\u0010Z}\u0004g\n\u0001\u007fOt\u0016\u0003rMg\u0006\u0006o\u0005f\u0017Xo\u0013p\u0011Zy\u0001{\u0000\u0012v\fp\u0007";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0013p\u0017\u0003s\u000er\u0010Z}\u0004g\n\u0001\u007fOt\u0016\u0003rMg\u0006\u0006o\u0005f\u0017Xo\u0013p\u0011Zy\u0001{\u0000\u0012v\fp\u0007";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "L5\u0017\u0018q\u0005{C\u001f{\u00135\u0001\u0012\u007f\u000e5\u0011\u0012y\u0005|\u0015\u0012~N";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0013p\u0017\u0003s\u000er\u0010Z}\u0004g\n\u0001\u007fOt\u0016\u0003rMg\u0006\u0006o\u0005f\u0017W{\u0013~\n\u0019}@R\f\u0018}\fp\"\u0002n\b@\u0017\u001ev@s\f\u0005:\u0014z\b\u0012t@s\f\u0005:";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0013p\u0017\u0003s\u000er\u0010Z}\u0004g\n\u0001\u007fOt\u0016\u0003rMg\u0006\u0006o\u0005f\u0017W|\u000fgC\u0016y\u0003z\u0016\u0019n@";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0001`\u0017\u001fn\u000f~\u0006\u0019";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0013p\u0017\u0003s\u000er\u0010Z}\u0004g\n\u0001\u007fOt\u0016\u0003rMg\u0006\u0006o\u0005f\u0017";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0001`\u0017\u001f[\u0003v\f\u0002t\u0014";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0013p\u0017\u0003s\u000er\u0010Z}\u0004g\n\u0001\u007fOt\u0016\u0003rMg\u0006\u0006o\u0005f\u0017Xh\u0005v\u0006\u001el\u0005qN\u0003u\u000bp\rZx\u0015aN\u0002i\u0005gN\u0014{\u000ev\u0006\u001bv\u0005qN\u0003r\u00058\u0011\u0012k\u0015p\u0010\u00035";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r2 = 0;
        r1 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = r6.a;
        com.whatsapp.gdrive.SettingsGoogleDrive.a(r0, r2);
        r0 = new java.lang.StringBuilder;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0.<init>();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r0.append(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = r6.c;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = com.whatsapp.gdrive.fn.a(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r0.append(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r0.toString();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = r6.c;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r4 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r5 = 0;
        r2 = com.google.android.gms.auth.GoogleAuthUtil.getToken(r2, r3, r4, r5);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        com.whatsapp.gdrive.SettingsGoogleDrive.b(r0, r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = new java.lang.StringBuilder;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0.<init>();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r0.append(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = r6.c;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = com.whatsapp.gdrive.fn.a(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r0.append(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r0.append(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r0.toString();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = new android.content.Intent;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0.<init>();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = com.whatsapp.gdrive.SettingsGoogleDrive.l(r3);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0.putExtra(r2, r3);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = r6.c;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0.putExtra(r2, r3);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = com.whatsapp.gdrive.SettingsGoogleDrive.h(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        if (r2 != 0) goto L_0x0093;
    L_0x008a:
        r2 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = 1;
        r4 = -1;
        r2.onActivityResult(r3, r4, r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00bc, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        if (r1 == 0) goto L_0x00b2;
    L_0x0093:
        r0 = new java.lang.StringBuilder;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0.<init>();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r0.append(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = r6.c;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r2 = com.whatsapp.gdrive.fn.a(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r0.append(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = r0.toString();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
    L_0x00b2:
        r0 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.t(r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
        r0.open();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
    L_0x00bb:
        return;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00be, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00c0, UserRecoverableAuthException -> 0x00f1, IOException -> 0x0123, GoogleAuthException -> 0x0198, SecurityException -> 0x015d }
    L_0x00c0:
        r0 = move-exception;
        r2 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ed }
        r3 = 0;
        com.whatsapp.gdrive.SettingsGoogleDrive.b(r2, r3);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ed }
        r2 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ed }
        r2 = com.whatsapp.gdrive.SettingsGoogleDrive.h(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ed }
        if (r2 == 0) goto L_0x00da;
    L_0x00cf:
        r2 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ef }
        r2 = com.whatsapp.gdrive.SettingsGoogleDrive.t(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ef }
        r2.open();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ef }
        if (r1 == 0) goto L_0x00e4;
    L_0x00da:
        r1 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ef }
        r2 = new com.whatsapp.gdrive.ed;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ef }
        r2.<init>(r6);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ef }
        r1.runOnUiThread(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ef }
    L_0x00e4:
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x00bb;
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x00ef }
    L_0x00ef:
        r0 = move-exception;
        throw r0;
    L_0x00f1:
        r0 = move-exception;
        r2 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0121 }
        r3 = 0;
        com.whatsapp.gdrive.SettingsGoogleDrive.b(r2, r3);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0121 }
        r2 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0121 }
        r2 = com.whatsapp.gdrive.SettingsGoogleDrive.h(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0121 }
        if (r2 == 0) goto L_0x010b;
    L_0x0100:
        r2 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x011f }
        r2 = com.whatsapp.gdrive.SettingsGoogleDrive.t(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x011f }
        r2.open();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x011f }
        if (r1 == 0) goto L_0x00bb;
    L_0x010b:
        r1 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x011f }
        r1 = com.whatsapp.gdrive.SettingsGoogleDrive.t(r1);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x011f }
        r1.close();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x011f }
        r1 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x011f }
        r0 = r0.getIntent();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x011f }
        r2 = 1;
        r1.startActivityForResult(r0, r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x011f }
        goto L_0x00bb;
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x011f }
    L_0x0123:
        r0 = move-exception;
        r2 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x015b }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x015b }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x015b }
        r0 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x015b }
        r2 = 0;
        com.whatsapp.gdrive.SettingsGoogleDrive.b(r0, r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x015b }
        r0 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x015b }
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.t(r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x015b }
        r0.open();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x015b }
        r0 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x015b }
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.h(r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x015b }
        if (r0 != 0) goto L_0x014f;
    L_0x0143:
        r0 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0159 }
        r2 = new com.whatsapp.gdrive.dx;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0159 }
        r2.<init>(r6);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0159 }
        r0.runOnUiThread(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0159 }
        if (r1 == 0) goto L_0x00bb;
    L_0x014f:
        r0 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0159 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0159 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0159 }
        goto L_0x00bb;
    L_0x0159:
        r0 = move-exception;
        throw r0;
    L_0x015b:
        r0 = move-exception;
        throw r0;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0159 }
    L_0x015d:
        r0 = move-exception;
    L_0x015e:
        r2 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0196 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0196 }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0196 }
        r0 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0196 }
        r2 = 0;
        com.whatsapp.gdrive.SettingsGoogleDrive.b(r0, r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0196 }
        r0 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0196 }
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.t(r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0196 }
        r0.open();	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0196 }
        r0 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0196 }
        r0 = com.whatsapp.gdrive.SettingsGoogleDrive.h(r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0196 }
        if (r0 != 0) goto L_0x018a;
    L_0x017e:
        r0 = r6.a;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0194 }
        r2 = new com.whatsapp.gdrive.ck;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0194 }
        r2.<init>(r6);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0194 }
        r0.runOnUiThread(r2);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0194 }
        if (r1 == 0) goto L_0x00bb;
    L_0x018a:
        r0 = z;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0194 }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0194 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0194 }
        goto L_0x00bb;
    L_0x0194:
        r0 = move-exception;
        throw r0;
    L_0x0196:
        r0 = move-exception;
        throw r0;	 Catch:{ GooglePlayServicesAvailabilityException -> 0x0194 }
    L_0x0198:
        r0 = move-exception;
        goto L_0x015e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.bx.run():void");
    }

    bx(SettingsGoogleDrive settingsGoogleDrive, String str, AuthRequestDialogFragment authRequestDialogFragment) {
        this.a = settingsGoogleDrive;
        this.c = str;
        this.b = authRequestDialogFragment;
    }
}
