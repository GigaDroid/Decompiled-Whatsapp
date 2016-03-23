package com.whatsapp;

import android.content.Intent;
import android.content.SharedPreferences.Editor;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.ca;
import com.whatsapp.protocol.cx;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class j2 implements ca {
    public static final j2 a;
    private static final String[] z;
    private final HashMap b;
    private final Object c;
    private final ArrayList d;
    private HashMap e;
    private final ArrayList f;
    private Runnable g;

    private void b() {
        boolean z = DialogToastActivity.f;
        App.p.M().removeCallbacks(this.g);
        Long l = null;
        synchronized (this.c) {
            Long l2;
            for (Entry value : this.e.entrySet()) {
                l2 = (Long) value.getValue();
                if (l != null && l2.longValue() >= l.longValue()) {
                    l2 = l;
                }
                if (z) {
                    break;
                }
                l = l2;
            }
            l2 = l;
        }
        if (l2 != null && l2.longValue() > System.currentTimeMillis()) {
            App.p.M().postDelayed(this.g, l2.longValue() - System.currentTimeMillis());
        }
    }

    public ArrayList c(String str) {
        ArrayList arrayList;
        boolean z = DialogToastActivity.f;
        synchronized (this.b) {
            arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.b.get(str);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    cx cxVar = (cx) it.next();
                    if (cxVar.a() && cxVar.g + 7200000 > System.currentTimeMillis()) {
                        arrayList.add(cxVar);
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public void a(at7 com_whatsapp_at7) {
        this.d.remove(com_whatsapp_at7);
    }

    public void a(String str, String str2) {
        boolean z = DialogToastActivity.f;
        Log.i(z[0] + str2 + z[1] + str);
        synchronized (this.b) {
            ArrayList arrayList = (ArrayList) this.b.get(str);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    cx cxVar = (cx) it.next();
                    if (cxVar.f.equals(str2)) {
                        arrayList.remove(cxVar);
                        if (!z) {
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
            }
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((a4f) it2.next()).a(str, str2);
            if (z) {
                return;
            }
        }
    }

    private String c() {
        boolean z = DialogToastActivity.f;
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : this.e.entrySet()) {
            String str = (String) entry.getKey();
            Long l = (Long) entry.getValue();
            if (stringBuilder.length() != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(str).append('#').append(l);
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r6) {
        /*
        r5 = this;
        r1 = r5.c;
        monitor-enter(r1);
        r0 = r5.e;	 Catch:{ all -> 0x007b }
        if (r0 != 0) goto L_0x000a;
    L_0x0007:
        r5.d();	 Catch:{ all -> 0x007b }
    L_0x000a:
        r0 = r5.e;	 Catch:{ all -> 0x007b }
        r0 = r0.remove(r6);	 Catch:{ all -> 0x007b }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x007b }
        if (r0 != 0) goto L_0x0016;
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
    L_0x0015:
        return;
    L_0x0016:
        r0 = com.whatsapp.App.z();	 Catch:{ all -> 0x007b }
        r2 = z;	 Catch:{ all -> 0x007b }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ all -> 0x007b }
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);	 Catch:{ all -> 0x007b }
        r0 = r0.edit();	 Catch:{ all -> 0x007b }
        r2 = r5.c();	 Catch:{ all -> 0x007b }
        r3 = r5.e;	 Catch:{ all -> 0x007b }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x007b }
        if (r3 == 0) goto L_0x0042;
    L_0x0035:
        r3 = z;	 Catch:{ all -> 0x007b }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ all -> 0x007b }
        r0.remove(r3);	 Catch:{ all -> 0x007b }
        r3 = com.whatsapp.DialogToastActivity.f;	 Catch:{ all -> 0x007b }
        if (r3 == 0) goto L_0x004b;
    L_0x0042:
        r3 = z;	 Catch:{ all -> 0x007b }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ all -> 0x007b }
        r0.putString(r3, r2);	 Catch:{ all -> 0x007b }
    L_0x004b:
        r0 = r0.commit();	 Catch:{ all -> 0x007b }
        if (r0 != 0) goto L_0x005a;
    L_0x0051:
        r0 = z;	 Catch:{ all -> 0x007b }
        r2 = 11;
        r0 = r0[r2];	 Catch:{ all -> 0x007b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x007b }
    L_0x005a:
        r0 = com.whatsapp.App.p;	 Catch:{ all -> 0x007b }
        r0 = r0.M();	 Catch:{ all -> 0x007b }
        r2 = new com.whatsapp.aoj;	 Catch:{ all -> 0x007b }
        r2.<init>(r5, r6);	 Catch:{ all -> 0x007b }
        r0.post(r2);	 Catch:{ all -> 0x007b }
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
        r5.b();
        r0 = com.whatsapp.App.p;
        r0 = r0.M();
        r1 = new com.whatsapp.q2;
        r1.<init>(r5, r6);
        r0.post(r1);
        goto L_0x0015;
    L_0x007b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.j2.b(java.lang.String):void");
    }

    static ArrayList a(j2 j2Var) {
        return j2Var.d;
    }

    public void m460a(String str, long j) {
        synchronized (this.c) {
            if (this.e == null) {
                d();
            }
            this.e.put(str, Long.valueOf(j));
            Editor edit = App.z().getSharedPreferences(z[22], 0).edit();
            edit.putString(z[24], c());
            if (!edit.commit()) {
                Log.e(z[23]);
            }
        }
        b();
        App.p.M().post(new a2a(this, str));
    }

    public int a(String str, long j) {
        Log.i(z[9] + str + z[8] + j);
        if (a(str)) {
            Intent intent = new Intent(App.z(), LocationSharingService.class);
            intent.setAction(z[6]);
            intent.putExtra(z[7], j);
            App.z().startService(intent);
            return 0;
        }
        Log.w(z[4] + str + z[5]);
        return 401;
    }

    public void a(a4f com_whatsapp_a4f) {
        if (!this.f.contains(com_whatsapp_a4f)) {
            this.f.add(com_whatsapp_a4f);
        }
    }

    public void b(at7 com_whatsapp_at7) {
        if (!this.d.contains(com_whatsapp_at7)) {
            this.d.add(com_whatsapp_at7);
        }
    }

    public void a() {
        Log.i(z[2]);
        Intent intent = new Intent(App.z(), LocationSharingService.class);
        intent.setAction(z[3]);
        App.z().startService(intent);
    }

    static {
        String[] strArr = new String[27];
        String str = "_d\n\u0015bZd\u0007\u0007{TyF\u001bxcj\u001b\u0000\u007fPb\u0019\u0015xGX\u001d\u001bfCn\r'~Ry\u0000\u001aq\u007fd\n\u0015bZd\u0007[";
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
                        i3 = 51;
                        break;
                    case at.g /*1*/:
                        i3 = 11;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 116;
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
                    str = "_d\n\u0015bZd\u0007\u0007{TyF\u001bx`\u007f\u0006\u0004Z\\h\b\u0000\u007f\\e;\u0011f\\y\u001d\u001dxT";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "Pd\u0004Za[j\u001d\u0007wC{G'~Ry\f8yPj\u001d\u001dy]X\f\u0006`Zh\fZEgD9";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "_d\n\u0015bZd\u0007\u0007{TyF\u001bx`\u007f\b\u0006b\u007fd\n\u0015bZd\u0007&sCd\u001b\u0000\u007f]lF";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0013o\u0000\u0007wQg\f\u0010";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Pd\u0004Za[j\u001d\u0007wC{G'~Ry\f8yPj\u001d\u001dy]X\f\u0006`Zh\fZEgJ; ";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "W~\u001b\u0015bZd\u0007";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0013o\u001c\u0006wGb\u0006\u001a,";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "_d\n\u0015bZd\u0007\u0007{TyF\u001bx`\u007f\b\u0006b\u007fd\n\u0015bZd\u0007&sCd\u001b\u0000\u007f]lF";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "_d\n\u0015bZd\u0007+e[j\u001b\u001dxT";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    str = "_d\n\u0015bZd\u0007\u0007{TyF\u0007sG\u007f\u0000\u001aq@$\u001b\u0011eV\u007fF\u0012wZg\f\u0010";
                    obj = 10;
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    strArr2 = strArr3;
                    str = "_d\n\u0015bZd\u0007+e[j\u001b\u001dxT";
                    obj = 11;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "Pd\u0004Za[j\u001d\u0007wC{6\u0004dVm\f\u0006s]h\f\u0007";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Pd\u0004Za[j\u001d\u0007wC{6\u0004dVm\f\u0006s]h\f\u0007";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "_d\n\u0015bZd\u0007\u0007{TyF\u001dxZ\u007f6\u0007sG\u007f\u0000\u001aq@1";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "_d\n\u0015bZd\u0007+e[j\u001b\u001dxT";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "_d\n\u0015bZd\u0007+e[j\u001b\u001dxT";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "_d\n\u0015bZd\u0007+e[j\u001b\u001dxT";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "_d\n\u0015bZd\u0007\u0007{TyF\u001dxZ\u007f6\u0007sG\u007f\u0000\u001aq@+\u000e\u0006yF{I\u001ayG+\f\ffVh\u001d\u0011r";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "_d\n\u0015bZd\u0007\u0007{TyF\u0001fWj\u001d\u0011I@n\u001d\u0000\u007f]l\u001aN";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "_d\n\u0015bZd\u0007\u0007{TyF\u0001fWj\u001d\u0011I@n\u001d\u0000\u007f]l\u001a[pRb\u0005\u0011r";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    str = "Pd\u0004Za[j\u001d\u0007wC{6\u0004dVm\f\u0006s]h\f\u0007";
                    obj = 21;
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    strArr2 = strArr3;
                    str = "_d\n\u0015bZd\u0007\u0007{TyF\u0007sG\u007f\u0000\u001aq@$\u000f\u0015\u007f_n\r";
                    obj = 22;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "_d\n\u0015bZd\u0007+e[j\u001b\u001dxT";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0013l\u001b\u001bcC1";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "_d\n\u0015bZd\u0007\u0007{TyF\u001bxcj\u001b\u0000\u007fPb\u0019\u0015xGX\u001d\u0015dGn\r'~Ry\u0000\u001aq\u007fd\n\u0015bZd\u0007[";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new j2();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0013l\u001b\u001bcC1";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static Object d(j2 j2Var) {
        return j2Var.c;
    }

    public j2() {
        this.b = new HashMap();
        this.f = new ArrayList();
        this.d = new ArrayList();
        this.c = new Object();
        this.g = new m8(this);
    }

    public boolean a(String str) {
        synchronized (this.c) {
            if (this.e == null) {
                d();
            }
            if (this.e.containsKey(str)) {
                long longValue = ((Long) this.e.get(str)).longValue();
                if (longValue == 0 || longValue > System.currentTimeMillis()) {
                    return true;
                }
                b(str);
            }
            return false;
        }
    }

    public void b(String str, String str2) {
        boolean z = DialogToastActivity.f;
        Log.i(z[26] + str2 + z[25] + str);
        synchronized (this.b) {
            ArrayList arrayList;
            Object obj;
            ArrayList arrayList2 = (ArrayList) this.b.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.b.put(str, arrayList2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
            }
            Object obj2 = null;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((cx) it.next()).f.equals(str2)) {
                    obj = 1;
                    if (!z) {
                        break;
                    }
                }
                obj = obj2;
                if (z) {
                    break;
                }
                obj2 = obj;
            }
            obj = obj2;
            if (obj == null) {
                cx cxVar = new cx();
                cxVar.f = str2;
                arrayList.add(cxVar);
            }
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((a4f) it2.next()).b(str, str2);
            if (z) {
                return;
            }
        }
    }

    static HashMap b(j2 j2Var) {
        return j2Var.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r12 = this;
        r1 = 1;
        r3 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.util.HashMap;
        r0.<init>();
        r12.e = r0;
        r0 = com.whatsapp.App.z();
        r2 = z;
        r5 = 14;
        r2 = r2[r5];
        r5 = r0.getSharedPreferences(r2, r3);
        r0 = z;
        r2 = 18;
        r0 = r0[r2];
        r2 = "";
        r0 = r5.getString(r0, r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = z;
        r7 = 15;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r0.length();
        if (r2 <= 0) goto L_0x00fd;
    L_0x0046:
        r2 = ",";
        r6 = r0.split(r2);
        r0 = r6.length;
        r0 = r0 + -1;
        r2 = r0;
        r0 = r3;
    L_0x0052:
        if (r2 < 0) goto L_0x00ae;
    L_0x0054:
        r7 = r6[r2];
        r8 = r7.length();
        if (r8 <= r1) goto L_0x00aa;
    L_0x005c:
        r8 = "#";
        r7 = r7.split(r8);
        r8 = com.whatsapp.App.as;
        r9 = r7[r3];
        r8 = r8.c(r9);
        if (r8 == 0) goto L_0x00a9;
    L_0x006d:
        r8 = r12.e;
        r9 = r7[r3];
        r8 = r8.containsKey(r9);
        if (r8 == 0) goto L_0x0096;
    L_0x0077:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r8 = z;
        r9 = 19;
        r8 = r8[r9];
        r0 = r0.append(r8);
        r8 = r7[r3];
        r0 = r0.append(r8);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        if (r4 == 0) goto L_0x0101;
    L_0x0095:
        r0 = r1;
    L_0x0096:
        r8 = r12.e;
        r9 = r7[r3];
        r7 = r7[r1];
        r10 = java.lang.Long.parseLong(r7);
        r7 = java.lang.Long.valueOf(r10);
        r8.put(r9, r7);
        if (r4 == 0) goto L_0x00aa;
    L_0x00a9:
        r0 = r1;
    L_0x00aa:
        r2 = r2 + -1;
        if (r4 == 0) goto L_0x0052;
    L_0x00ae:
        if (r0 == 0) goto L_0x00fd;
    L_0x00b0:
        r0 = r5.edit();
        r1 = r12.c();
        r2 = r12.e;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x00cb;
    L_0x00c0:
        r2 = z;
        r3 = 17;
        r2 = r2[r3];
        r0.remove(r2);
        if (r4 == 0) goto L_0x00d4;
    L_0x00cb:
        r2 = z;
        r3 = 16;
        r2 = r2[r3];
        r0.putString(r2, r1);
    L_0x00d4:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 20;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        r0 = r0.commit();
        if (r0 != 0) goto L_0x00fd;
    L_0x00f4:
        r0 = z;
        r1 = 21;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x00fd:
        r12.b();
        return;
    L_0x0101:
        r0 = r1;
        goto L_0x00aa;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.j2.d():void");
    }

    static void c(j2 j2Var) {
        j2Var.b();
    }

    public void b(a4f com_whatsapp_a4f) {
        this.f.remove(com_whatsapp_a4f);
    }
}
