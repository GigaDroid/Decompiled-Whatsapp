package com.whatsapp;

import android.app.Activity;
import android.os.AsyncTask;
import com.whatsapp.gdrive.SettingsGoogleDrive;
import com.whatsapp.util.Log;
import com.whatsapp.util.cs;
import java.util.Locale;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class amh extends AsyncTask {
    private static final String[] z;
    Runnable a;
    Activity b;
    by c;

    static {
        String[] strArr = new String[11];
        String str = "~Gy@UcE~\u001b^lAfAL\"O~SOyM\u007fQ\u0013}PbSNhQ~\u001b\u0019i\u0007(";
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
                        i3 = 13;
                        break;
                    case at.g /*1*/:
                        i3 = 34;
                        break;
                    case at.i /*2*/:
                        i3 = 13;
                        break;
                    case at.o /*3*/:
                        i3 = 52;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "~Gy@UcE~\u001b^lAfAL\"O~SOyM\u007fQ\u0013hP\u007f[N-";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "~Gy@UcE~\u001b^lAfAL\"@lWWxR _Yt\u000fc[H PhWYdThP";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "}MzQN";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "~Gy@UcE~\u001b^lAfAL\"Ul]HdLj\u0019ZbP @Th\u000ffQE";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "~Gy@UcE~\u001b^lAfAL\"@lWWxR _Yt\rcAPa\rlW_bWc@\u0011eC~\\\u0013cWaX";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "oCn_I}Fo";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "~Gy@UcE~\u001b^lAfAL\"Dl]PhF\"ZIaN";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "~Gy@UcE~\u001b^lAfAL\"Dl]PhF\"YU~QdZ[ M\u007f\u0019QdQ`UHnJ";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "~Gy@UcE~\u001b^lAfAL\"Dl]PhF\"YU~QdZ[ RhFQdQ~]ScQ";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "~Gy@UcE~\u001b^lAfAL\"IhM\u0011\u007fGnQU{Gi";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Integer[] numArr) {
        int intValue = numArr[0].intValue();
        if (SettingsChat.e() != null) {
            SettingsChat.e().setMessage(SettingsChat.e().getContext().getString(2131231896, new Object[]{Integer.valueOf(intValue), cs.c(SettingsChat.e().getContext(), SettingsChat.f().getTimeInMillis())}));
        }
        if (intValue % 10 == 0) {
            Log.i(String.format(Locale.ENGLISH, z[0], new Object[]{Integer.valueOf(intValue)}));
        }
    }

    static void a(amh com_whatsapp_amh, Object[] objArr) {
        com_whatsapp_amh.publishProgress(objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.j3 r7) {
        /*
        r6 = this;
        r5 = 2131231472; // 0x7f0802f0 float:1.8079026E38 double:1.0529682537E-314;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r6.b;
        r2 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r0.removeDialog(r2);
        com.whatsapp.Conversation.K();
        r0 = com.whatsapp.j3.FAILED_INVALID;
        if (r7 != r0) goto L_0x0047;
    L_0x0013:
        com.whatsapp.ve.w();
        r0 = com.whatsapp.ve.n();
        r2 = com.whatsapp.ve.a(r0);
        if (r2 == 0) goto L_0x0037;
    L_0x0020:
        r3 = 0;
        com.whatsapp.App.a(r2, r0, r3);
        r0 = r6.c;
        r2 = 2131231475; // 0x7f0802f3 float:1.8079032E38 double:1.052968255E-314;
        r0.a(r2);
        r0 = z;
        r2 = 9;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        if (r1 == 0) goto L_0x0045;
    L_0x0037:
        r0 = r6.c;
        r0.a(r5);
        r0 = z;
        r2 = 8;
        r0 = r0[r2];
        com.whatsapp.util.Log.w(r0);
    L_0x0045:
        if (r1 == 0) goto L_0x00a5;
    L_0x0047:
        r0 = com.whatsapp.j3.SUCCESS;
        if (r7 != r0) goto L_0x0056;
    L_0x004b:
        r0 = r6.a;
        if (r0 == 0) goto L_0x00a5;
    L_0x004f:
        r0 = r6.a;
        r0.run();
        if (r1 == 0) goto L_0x00a5;
    L_0x0056:
        r0 = com.whatsapp.j3.FAILED_OUT_OF_SPACE;
        if (r7 != r0) goto L_0x0091;
    L_0x005a:
        r2 = r6.c;
        r0 = com.whatsapp.App.V();
        if (r0 == 0) goto L_0x00a6;
    L_0x0062:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = r6.b;
        r4 = 2131231473; // 0x7f0802f1 float:1.8079028E38 double:1.052968254E-314;
        r3 = r3.getString(r4);
        r0 = r0.append(r3);
        r3 = " ";
        r0 = r0.append(r3);
        r3 = r6.b;
        r4 = 2131231821; // 0x7f08044d float:1.8079734E38 double:1.052968426E-314;
        r3 = r3.getString(r4);
        r0 = r0.append(r3);
        r0 = r0.toString();
    L_0x008c:
        r2.f(r0);
        if (r1 == 0) goto L_0x00a5;
    L_0x0091:
        r0 = com.whatsapp.App.aO();
        if (r0 != 0) goto L_0x00a5;
    L_0x0097:
        r0 = z;
        r1 = 10;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r6.c;
        r0.a(r5);
    L_0x00a5:
        return;
    L_0x00a6:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = r6.b;
        r4 = 2131231474; // 0x7f0802f2 float:1.807903E38 double:1.0529682546E-314;
        r3 = r3.getString(r4);
        r0 = r0.append(r3);
        r3 = " ";
        r0 = r0.append(r3);
        r3 = r6.b;
        r4 = 2131231822; // 0x7f08044e float:1.8079736E38 double:1.0529684266E-314;
        r3 = r3.getString(r4);
        r0 = r0.append(r3);
        r0 = r0.toString();
        goto L_0x008c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amh.a(com.whatsapp.j3):void");
    }

    protected void onProgressUpdate(Object[] objArr) {
        a((Integer[]) objArr);
    }

    public amh(SettingsGoogleDrive settingsGoogleDrive, Runnable runnable) {
        this(settingsGoogleDrive, settingsGoogleDrive, runnable);
    }

    public amh(SettingsChat settingsChat, Runnable runnable) {
        this(settingsChat, settingsChat, runnable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.whatsapp.j3 a(java.lang.Void[] r12) {
        /*
        r11 = this;
        r5 = 1;
        r2 = com.whatsapp.DialogToastActivity.f;
        r1 = com.whatsapp.j3.FAILED_GENERIC;
        r0 = r11.b;
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r0 = r0.getSystemService(r3);
        r0 = (android.os.PowerManager) r0;
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        r3 = r0.newWakeLock(r5, r3);
        r3.acquire();	 Catch:{ Exception -> 0x009a }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x009a }
        r0 = com.whatsapp.ve.I();	 Catch:{ Exception -> 0x009a }
        if (r0 == 0) goto L_0x006c;
    L_0x0028:
        r0 = com.whatsapp.ve.n();	 Catch:{ Exception -> 0x009a }
        r6 = com.whatsapp.ve.a(r0);	 Catch:{ Exception -> 0x009a }
        if (r6 == 0) goto L_0x0064;
    L_0x0032:
        r7 = new android.os.ConditionVariable;	 Catch:{ Exception -> 0x009a }
        r8 = 0;
        r7.<init>(r8);	 Catch:{ Exception -> 0x009a }
        r8 = new com.whatsapp.ao9;	 Catch:{ Exception -> 0x009a }
        r8.<init>(r11, r7);	 Catch:{ Exception -> 0x009a }
        com.whatsapp.App.a(r6, r0, r8);	 Catch:{ Exception -> 0x009a }
        r0 = z;	 Catch:{ Exception -> 0x009a }
        r6 = 5;
        r0 = r0[r6];	 Catch:{ Exception -> 0x009a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x009a }
        r8 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r0 = r7.block(r8);	 Catch:{ InterruptedException -> 0x0096 }
        if (r0 != 0) goto L_0x005a;
    L_0x0050:
        r0 = z;	 Catch:{ InterruptedException -> 0x0096 }
        r6 = 3;
        r0 = r0[r6];	 Catch:{ InterruptedException -> 0x0096 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ InterruptedException -> 0x0096 }
        if (r2 == 0) goto L_0x0062;
    L_0x005a:
        r0 = z;	 Catch:{ InterruptedException -> 0x0098 }
        r6 = 1;
        r0 = r0[r6];	 Catch:{ InterruptedException -> 0x0098 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0098 }
    L_0x0062:
        if (r2 == 0) goto L_0x006c;
    L_0x0064:
        r0 = z;	 Catch:{ InterruptedException -> 0x00c5 }
        r2 = 6;
        r0 = r0[r2];	 Catch:{ InterruptedException -> 0x00c5 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ InterruptedException -> 0x00c5 }
    L_0x006c:
        r0 = com.whatsapp.App.aK;	 Catch:{ Exception -> 0x009a }
        r2 = 1;
        r6 = 0;
        r7 = new com.whatsapp.n1;	 Catch:{ Exception -> 0x009a }
        r7.<init>(r11);	 Catch:{ Exception -> 0x009a }
        r0 = r0.a(r2, r6, r7);	 Catch:{ Exception -> 0x009a }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x00d7 }
        r8 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r4 = r6 - r4;
        r4 = r8 - r4;
        r6 = 0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x008c;
    L_0x0089:
        java.lang.Thread.sleep(r4);	 Catch:{ InterruptedException -> 0x00d2 }
    L_0x008c:
        r1 = r3.isHeld();	 Catch:{ InterruptedException -> 0x00d9 }
        if (r1 == 0) goto L_0x0095;
    L_0x0092:
        r3.release();	 Catch:{ InterruptedException -> 0x00d9 }
    L_0x0095:
        return r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        r10 = r0;
        r0 = r1;
        r1 = r10;
    L_0x009e:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c7 }
        r2.<init>();	 Catch:{ all -> 0x00c7 }
        r4 = z;	 Catch:{ all -> 0x00c7 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ all -> 0x00c7 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00c7 }
        r1 = r1.toString();	 Catch:{ all -> 0x00c7 }
        r1 = r2.append(r1);	 Catch:{ all -> 0x00c7 }
        r1 = r1.toString();	 Catch:{ all -> 0x00c7 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ all -> 0x00c7 }
        r1 = r3.isHeld();
        if (r1 == 0) goto L_0x0095;
    L_0x00c1:
        r3.release();
        goto L_0x0095;
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x009a }
    L_0x00c7:
        r0 = move-exception;
        r1 = r3.isHeld();	 Catch:{ InterruptedException -> 0x00db }
        if (r1 == 0) goto L_0x00d1;
    L_0x00ce:
        r3.release();	 Catch:{ InterruptedException -> 0x00db }
    L_0x00d1:
        throw r0;
    L_0x00d2:
        r1 = move-exception;
        com.whatsapp.util.Log.a(r1);	 Catch:{ Exception -> 0x00d7 }
        goto L_0x008c;
    L_0x00d7:
        r1 = move-exception;
        goto L_0x009e;
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amh.a(java.lang.Void[]):com.whatsapp.j3");
    }

    private amh(Activity activity, by byVar, Runnable runnable) {
        this.b = activity;
        this.c = byVar;
        this.a = runnable;
    }

    protected void onPostExecute(Object obj) {
        a((j3) obj);
    }

    protected void onPreExecute() {
        this.b.showDialog(600);
    }
}
