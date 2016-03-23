package com.whatsapp.accountsync;

import android.os.AsyncTask.Status;
import com.whatsapp.VerifyMessageStoreActivity;
import com.whatsapp.arj;
import com.whatsapp.qm;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ProfileActivity extends VerifyMessageStoreActivity {
    private static final String[] z;
    c o;

    static {
        String[] strArr = new String[10];
        String str = "\u0017^-I\u000f\u000bI#L\u0012\u000eZ+[\u001fHO-A\u0012\u0006O6\u000f\u0007\u0004O'\\\u0015GH'A\u000f\u0002H";
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
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 44;
                        break;
                    case at.i /*2*/:
                        i3 = 66;
                        break;
                    case at.o /*3*/:
                        i3 = 47;
                        break;
                    default:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0017^-I\u000f\u000bI#L\u0012\u000eZ+[\u001fHO0J\u0007\u0013I";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0017^-I\u000f\u000bI#L\u0012\u000eZ+[\u001fHO0J\u0007\u0013ImM\u0007\u0004G7_\u0000\u000e@'\\\u0000\bY,KF";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\nE/J\u0012\u001e\\'";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0014U,LF\u0017^-I\u000f\u000bIbN\u0005\u0013E4F\u0012\u001e\f#C\u0014\u0002M&VF\u0001E,F\u0015\u000fE,HJGE%A\t\u0015E,HF\u0000C6@'\u0004X+Y\u000f\u0013UbL\u0007\u000b@";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0001M+C\u0003\u0003\f6@F\u0000CbN\b\u001e[*J\u0014\u0002\f$]\t\n\f1V\b\u0004\f2]\t\u0001E.JF\u0006O6F\u0010\u000eX;\u0014F\u000eB6J\b\u0013\u0011";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0003M6NW";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0011B&\u0001\u0007\tH0@\u000f\u0003\u0002!Z\u0014\u0014C0\u0001\u000f\u0013I/\u0000\u0010\tHlL\t\n\u00025G\u0007\u0013_#_\u0016I\\0@\u0000\u000e@'";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0011B&\u0001\u0007\tH0@\u000f\u0003\u0002!Z\u0014\u0014C0\u0001\u000f\u0013I/\u0000\u0010\tHlL\t\n\u00025G\u0007\u0013_#_\u0016IZ-F\u0016IO#C\n";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0006N-]\u0012\u000eB%\u000f\u0002\u0012Ib[\tGB#[\u000f\u0011IbC\u000f\u0005^#]\u000f\u0002_bB\u000f\u0014_+A\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ProfileActivity() {
        this.o = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r7 = this;
        r2 = 0;
        r6 = com.whatsapp.accountsync.PerformSyncManager.c;
        r0 = r7.isFinishing();
        if (r0 == 0) goto L_0x0012;
    L_0x0009:
        r0 = z;
        r1 = 5;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
    L_0x0011:
        return;
    L_0x0012:
        r0 = com.whatsapp.App.v(r7);
        if (r0 != 0) goto L_0x0023;
    L_0x0018:
        r0 = 2131231618; // 0x7f080382 float:1.8079322E38 double:1.052968326E-314;
        r1 = 2131231619; // 0x7f080383 float:1.8079324E38 double:1.0529683263E-314;
        r2 = 1;
        com.whatsapp.RequestPermissionActivity.a(r7, r0, r1, r2);
        goto L_0x0011;
    L_0x0023:
        r0 = r7.getIntent();
        r0 = r0.getData();
        if (r0 == 0) goto L_0x00c8;
    L_0x002d:
        r0 = r7.getContentResolver();
        r1 = r7.getIntent();
        r1 = r1.getData();
        r3 = r2;
        r4 = r2;
        r5 = r2;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x00c8;
    L_0x0042:
        r0 = r1.moveToNext();	 Catch:{ all -> 0x00ea }
        if (r0 == 0) goto L_0x00c5;
    L_0x0048:
        r0 = z;	 Catch:{ all -> 0x00ea }
        r2 = 4;
        r0 = r0[r2];	 Catch:{ all -> 0x00ea }
        r0 = r1.getColumnIndex(r0);	 Catch:{ all -> 0x00ea }
        r0 = r1.getString(r0);	 Catch:{ all -> 0x00ea }
        r2 = z;	 Catch:{ all -> 0x00ea }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ all -> 0x00ea }
        r2 = r1.getColumnIndex(r2);	 Catch:{ all -> 0x00ea }
        r2 = r1.getString(r2);	 Catch:{ all -> 0x00ea }
        r3 = com.whatsapp.App.as;	 Catch:{ all -> 0x00ea }
        r2 = r3.b(r2);	 Catch:{ all -> 0x00ea }
        r3 = r2.c();	 Catch:{ all -> 0x00ea }
        if (r3 != 0) goto L_0x0076;
    L_0x006e:
        r3 = r2.p;	 Catch:{ all -> 0x00ea }
        r3 = com.whatsapp.l5.e(r3);	 Catch:{ all -> 0x00ea }
        if (r3 == 0) goto L_0x0084;
    L_0x0076:
        r3 = new android.content.Intent;	 Catch:{ all -> 0x00ea }
        r4 = com.whatsapp.Main.e();	 Catch:{ all -> 0x00ea }
        r3.<init>(r7, r4);	 Catch:{ all -> 0x00ea }
        r7.startActivity(r3);	 Catch:{ all -> 0x00ea }
        if (r6 == 0) goto L_0x00bd;
    L_0x0084:
        r3 = z;	 Catch:{ all -> 0x00ea }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ all -> 0x00ea }
        r3 = r3.equals(r0);	 Catch:{ all -> 0x00ea }
        if (r3 == 0) goto L_0x0099;
    L_0x0090:
        r3 = com.whatsapp.Conversation.a(r2);	 Catch:{ all -> 0x00ea }
        r7.startActivity(r3);	 Catch:{ all -> 0x00ea }
        if (r6 == 0) goto L_0x00bd;
    L_0x0099:
        r3 = z;	 Catch:{ all -> 0x00ea }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ all -> 0x00ea }
        r0 = r3.equals(r0);	 Catch:{ all -> 0x00ea }
        if (r0 == 0) goto L_0x00bd;
    L_0x00a5:
        r0 = com.whatsapp.vh.j(r7);	 Catch:{ all -> 0x00ea }
        if (r0 == 0) goto L_0x00b3;
    L_0x00ab:
        r0 = com.whatsapp.fieldstats.cd.ANDROID_CONTACTS_APPLICATION;	 Catch:{ all -> 0x00ea }
        r3 = 0;
        com.whatsapp.App.a(r2, r7, r0, r3);	 Catch:{ all -> 0x00ea }
        if (r6 == 0) goto L_0x00bd;
    L_0x00b3:
        r0 = new android.content.Intent;	 Catch:{ all -> 0x00ea }
        r2 = com.whatsapp.TosUpdateActivity.class;
        r0.<init>(r7, r2);	 Catch:{ all -> 0x00ea }
        r7.startActivity(r0);	 Catch:{ all -> 0x00ea }
    L_0x00bd:
        r7.finish();	 Catch:{ all -> 0x00ea }
        r1.close();
        goto L_0x0011;
    L_0x00c5:
        r1.close();
    L_0x00c8:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r7.getIntent();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r7.finish();
        goto L_0x0011;
    L_0x00ea:
        r0 = move-exception;
        r1.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.ProfileActivity.a():void");
    }

    static void a(ProfileActivity profileActivity) {
        profileActivity.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        r5 = this;
        r4 = 3;
        r3 = 1;
        r0 = com.whatsapp.accountsync.PerformSyncManager.c;
        super.onCreate(r6);
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = 0;
        r1 = com.whatsapp.util.WhatsAppLibLoader.a(r1);
        if (r1 != 0) goto L_0x0021;
    L_0x0016:
        r0 = z;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r5.finish();
    L_0x0020:
        return;
    L_0x0021:
        r1 = com.whatsapp.App.ay;
        if (r1 == 0) goto L_0x002b;
    L_0x0025:
        r1 = com.whatsapp.App.t(r5);
        if (r1 == r4) goto L_0x0035;
    L_0x002b:
        r0 = 2131231151; // 0x7f0801af float:1.8078375E38 double:1.052968095E-314;
        com.whatsapp.App.a(r5, r0, r3);
        r5.finish();
        goto L_0x0020;
    L_0x0035:
        r1 = com.whatsapp.App.aK;
        r1 = r1.E();
        if (r1 != 0) goto L_0x0070;
    L_0x003d:
        r1 = r5.a();
        if (r1 == 0) goto L_0x0020;
    L_0x0043:
        r1 = com.whatsapp.App.aK;
        r1 = r1.F();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        if (r1 <= 0) goto L_0x006a;
    L_0x0063:
        r1 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r5.showDialog(r1);
        if (r0 == 0) goto L_0x006e;
    L_0x006a:
        r1 = 0;
        r5.c(r1);
    L_0x006e:
        if (r0 == 0) goto L_0x0020;
    L_0x0070:
        r5.b();
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.ProfileActivity.onCreate(android.os.Bundle):void");
    }

    protected void b() {
        if (qm.d) {
            if (this.o == null || this.o.getStatus() != Status.RUNNING) {
                this.o = new c(this);
                bq.a(this.o, new Void[0]);
                if (PerformSyncManager.c == 0) {
                    return;
                }
            }
            return;
        }
        a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
        r2 = this;
        switch(r3) {
            case 150: goto L_0x0007;
            default: goto L_0x0003;
        };
    L_0x0003:
        super.onActivityResult(r3, r4, r5);
        return;
    L_0x0007:
        r0 = -1;
        if (r4 != r0) goto L_0x0011;
    L_0x000a:
        r2.a();
        r0 = com.whatsapp.accountsync.PerformSyncManager.c;
        if (r0 == 0) goto L_0x0003;
    L_0x0011:
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r2.finish();
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.ProfileActivity.onActivityResult(int, int, android.content.Intent):void");
    }
}
