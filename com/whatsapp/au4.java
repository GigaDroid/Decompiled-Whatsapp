package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import android.preference.PreferenceManager;
import com.whatsapp.gdrive.bi;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class au4 extends AsyncTask {
    private static final String[] z;
    final awc a;
    final ConditionVariable b;
    final bi c;
    final Context d;
    final ConditionVariable e;

    static {
        String[] strArr = new String[11];
        String str = "\u000bD:48\f_;";
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
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 11;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 22;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "]\u000fgcb\\\u000bhebZ\u0005e`\u007fK\u0007$ez\\\u000besf\u0016\u0019nr`\\\u0018xoyWJmg\u007fU\u000fo";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "O\u000fyu\u007fV\u0004";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "]\u000fgcb\\\u000bhebZ\u0005e`\u007fK\u0007$bsU\u000f\u007foyWGhi{I\u0006nrs";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "]\u000fgcb\\\u000bhebZ\u0005e`\u007fK\u0007$bsU\u000f\u007fc;X\thicW\u001e&ez\\\u000besf\u0019\u001fegtU\u000f+ry\u0019\rnr6~\u0005daz\\JOt\u007fO\u000f+usK\u001cbes\u0019\u0005ilsZ\u001e%";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "]\u000fgcb\\\u000bhebZ\u0005e`\u007fK\u0007$bsU\u000f\u007fc;X\thicW\u001e&ez\\\u000besf";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "]\u000fgcb\\\u000bhebZ\u0005e`\u007fK\u0007$bsU\u000f\u007fc;X\thicW\u001e&ez\\\u000besf\u0019-diqU\u000f+BdP\u001cn&wZ\tdsxMJocz\\\u001ebix\u0019\u001ebks]Jdsb\u0017";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "]\u000fgcb\\\u000bhebZ\u0005e`\u007fK\u0007$bsU\u000f\u007fc;X\thicW\u001e&ez\\\u000besf\u0019-diqU\u000f+BdP\u001cn&r\\\u0006nr\u007fV\u0004+oe\u0019\fbh\u007fJ\u0002nb8";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "]\u000fgcb\\\u000bhebZ\u0005e`\u007fK\u0007$bsU\u000f\u007fc;X\thicW\u001e&ez\\\u000besf\u0019\u001djobP\u0004l&pV\u0018+ayV\rgcRK\u0003}cE\\\u0018}ou\\Jdd|\\\t\u007f&bVJic6K\u000fhc\u007fO\u000fo(";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "]\u000fgcb\\\u000bhebZ\u0005e`\u007fK\u0007$bsU\u000f\u007fc;X\thicW\u001e&ez\\\u000besf\u0019\u001djobP\u0004l&pV\u0018+AyV\rgc6}\u0018bps\u0019\tgcwW\u001f{&bVJmoxP\u0019c(";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "]\u000fgcb\\\u000bhebZ\u0005e`\u007fK\u0007$ez\\\u000besf\u0016\tgcwKJmg\u007fU\u000fo";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Void a(java.lang.Void[] r9) {
        /*
        r8 = this;
        r6 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = com.whatsapp.gdrive.GoogleDriveService.X();
        if (r1 == 0) goto L_0x006b;
    L_0x000b:
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r2 = java.lang.System.currentTimeMillis();
        r1 = r8.e;
        r1 = r1.block(r6);
        if (r1 == 0) goto L_0x0054;
    L_0x0020:
        r4 = java.lang.System.currentTimeMillis();
        r2 = r4 - r2;
        r2 = r6 - r2;
        r1 = z;	 Catch:{ IllegalStateException -> 0x006d }
        r4 = 10;
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x006d }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x006d }
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x004a;
    L_0x0037:
        r1 = r8.b;	 Catch:{ IllegalStateException -> 0x006d }
        r1 = r1.block(r2);	 Catch:{ IllegalStateException -> 0x006d }
        if (r1 == 0) goto L_0x004a;
    L_0x003f:
        r1 = z;	 Catch:{ IllegalStateException -> 0x006f }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x006f }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x006f }
        if (r0 == 0) goto L_0x0052;
    L_0x004a:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0071 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0052:
        if (r0 == 0) goto L_0x005c;
    L_0x0054:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0073 }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0073 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0073 }
    L_0x005c:
        r0 = com.whatsapp.DeleteAccountConfirmation.b();	 Catch:{ IllegalStateException -> 0x0075 }
        if (r0 == 0) goto L_0x006b;
    L_0x0062:
        r0 = com.whatsapp.DeleteAccountConfirmation.b();	 Catch:{ IllegalStateException -> 0x0075 }
        r1 = r8.c;	 Catch:{ IllegalStateException -> 0x0075 }
        r0.a(r1);	 Catch:{ IllegalStateException -> 0x0075 }
    L_0x006b:
        r0 = 0;
        return r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.au4.a(java.lang.Void[]):java.lang.Void");
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    au4(ConditionVariable conditionVariable, ConditionVariable conditionVariable2, bi biVar, Context context, awc com_whatsapp_awc) {
        this.e = conditionVariable;
        this.b = conditionVariable2;
        this.c = biVar;
        this.d = context;
        this.a = com_whatsapp_awc;
    }

    protected void a(Void voidR) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.d);
        try {
            if (!defaultSharedPreferences.edit().clear().commit()) {
                Log.e(z[1]);
            }
            try {
                App.j();
                App.d(this.d, 6);
                if (!defaultSharedPreferences.edit().putString(z[3], z[0]).commit()) {
                    Log.e(z[2]);
                }
                DeleteAccountConfirmation.a(this.d);
                App.S = false;
                aup.e();
                DeleteAccountConfirmation.b(this.d, this.a);
                App.aK.h();
                App.a(this.d, 2131231025, 1);
                if (DeleteAccountConfirmation.a() != null) {
                    DeleteAccountConfirmation.a().removeDialog(1);
                    Intent intent = new Intent(DeleteAccountConfirmation.a(), EULA.class);
                    try {
                        if (VERSION.SDK_INT >= 11) {
                            intent.addFlags(32768);
                        }
                        DeleteAccountConfirmation.a().startActivity(intent);
                        DeleteAccountConfirmation.a().finish();
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                Log.i(z[4]);
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }
}
