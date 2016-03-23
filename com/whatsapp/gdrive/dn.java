package com.whatsapp.gdrive;

import android.content.Intent;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class dn implements Runnable {
    private static final String[] z;
    final String a;
    final GoogleDriveActivity b;
    final int c;

    static {
        String[] strArr = new String[9];
        String str = "\u0018S\u00000\u001e\u001a\u001a\u0013:\u001c\u0016A\u001b-\u0011PP\u0002*E\nY\u0013/\t\u0016[\u0013;\u0004\u001a";
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
                        i3 = 127;
                        break;
                    case at.g /*1*/:
                        i3 = 55;
                        break;
                    case at.i /*2*/:
                        i3 = 114;
                        break;
                    case at.o /*3*/:
                        i3 = 89;
                        break;
                    default:
                        i3 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001eB\u00061\u001c\u0010\\\u00177";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001eB\u00061)\u001cT\u001d,\u0006\u000b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0018S\u00000\u001e\u001a\u001a\u0013:\u001c\u0016A\u001b-\u0011PV\u0007-\u0000RE\u0017(\u001d\u001aD\u0006y\t\f\\\u001b7\u000f_p\u001d6\u000f\u0013R3,\u001c\u0017b\u00060\u0004_Q\u001d+H\u000bX\u0019<\u0006_Q\u001d+H";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "S\u0017\u00066\u0003\u001aYR1\t\f\u0017\u0010<\r\u0011\u0017\u0000<\u000b\u001a^\u0004<\fQ";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0010V\u0007-\u0000M\r\u001a-\u001c\u000fDHvG\b@\u0005w\u000f\u0010X\u00155\r\u001eG\u001b*F\u001cX\u001fv\t\nC\u001av\f\r^\u0004<F\u001eG\u0002=\t\u000bVR1\u001c\u000bG\u0001cGP@\u0005.F\u0018X\u001d>\u0004\u001aV\u00020\u001bQT\u001d4G\u001eB\u00061G\u001bE\u001b/\rQQ\u001b5\r";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0018S\u00000\u001e\u001a\u001a\u0013:\u001c\u0016A\u001b-\u0011PV\u0007-\u0000RE\u0017(\u001d\u001aD\u0006y\u000e\u0010ER8\u000b\u001cX\u00077\u001c_";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0018S\u00000\u001e\u001a\u001a\u0013:\u001c\u0016A\u001b-\u0011PV\u0007-\u0000RE\u0017(\u001d\u001aD\u0006";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0018S\u00000\u001e\u001a\u001a\u0013:\u001c\u0016A\u001b-\u0011PV\u0007-\u0000RE\u0017(\u001d\u001aD\u0006";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        Throwable e;
        try {
            Log.i(z[4] + fn.a(this.a));
            GoogleDriveActivity.a(this.b, GoogleAuthUtil.getToken(this.b, this.a, z[6], null));
            Log.i(z[7] + fn.a(this.a) + z[5]);
            Intent intent = new Intent();
            intent.putExtra(z[2], GoogleDriveActivity.r(this.b));
            intent.putExtra(z[3], this.a);
            this.b.onActivityResult(this.c, -1, intent);
            GoogleDriveActivity.n(this.b).open();
        } catch (Throwable e2) {
            this.b.runOnUiThread(new bu(this));
            Log.b(z[0], e2);
            GoogleDriveActivity.a(this.b, null);
        } catch (UserRecoverableAuthException e3) {
            GoogleDriveActivity.n(this.b).close();
            GoogleDriveActivity.a(this.b, null);
            GoogleDriveActivity.c(this.b, 25);
            this.b.startActivityForResult(e3.getIntent(), this.c);
        } catch (Throwable e22) {
            Log.b(z[1], e22);
            GoogleDriveActivity.a(this.b, null);
            GoogleDriveActivity.n(this.b).open();
            this.b.runOnUiThread(new cm(this));
        } catch (SecurityException e4) {
            e22 = e4;
            Log.b(z[8], e22);
            GoogleDriveActivity.a(this.b, null);
            GoogleDriveActivity.n(this.b).open();
            this.b.runOnUiThread(new ej(this));
        } catch (GoogleAuthException e5) {
            e22 = e5;
            Log.b(z[8], e22);
            GoogleDriveActivity.a(this.b, null);
            GoogleDriveActivity.n(this.b).open();
            this.b.runOnUiThread(new ej(this));
        }
    }

    dn(GoogleDriveActivity googleDriveActivity, String str, int i) {
        this.b = googleDriveActivity;
        this.a = str;
        this.c = i;
    }
}
