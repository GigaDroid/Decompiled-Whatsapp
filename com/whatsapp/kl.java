package com.whatsapp;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.RawContacts;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.whatsapp.contact.b;
import com.whatsapp.contact.d;
import com.whatsapp.contact.i;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class kl {
    private static final Map b;
    private static lu c;
    private static final String[] z;
    private final a24 a;

    public void f(l5 l5Var) {
        App.z().getApplicationContext().sendBroadcast(a(l5Var, true).setAction(z[1]));
    }

    @Nullable
    public l5 f(@NonNull String str) {
        if (App.ad() != null && str.equals(App.ad() + z[9])) {
            return e();
        }
        l5 l5Var = (l5) b.get(str);
        if (l5Var == null) {
            return this.a.b(str);
        }
        return l5Var;
    }

    public void e(ArrayList arrayList) {
        this.a.d(arrayList);
    }

    public void j(l5 l5Var) {
        this.a.i(l5Var);
    }

    public void l(l5 l5Var) {
        this.a.a(l5Var);
    }

    public void a(String str, String str2, String str3, long j) {
        l5 b = this.a.b(str);
        if (b == null) {
            b = new l5(str);
            this.a.e(b);
        }
        b.q = str3;
        b.j = Long.toString(j);
        b.g = str2;
        this.a.d(b);
    }

    public ArrayList h() {
        return this.a.i();
    }

    public l5 e(String str) {
        return this.a.d(str);
    }

    public ArrayList b(l5 l5Var) {
        return this.a.j(l5Var);
    }

    public void e(l5 l5Var) {
        this.a.b(l5Var);
    }

    static void c(l5 l5Var) {
        k(l5Var.p);
    }

    public ArrayList b(Collection collection, aqo com_whatsapp_aqo) {
        return this.a.a(collection, com_whatsapp_aqo);
    }

    public ArrayList i(String str) {
        return this.a.c(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.content.Context r12, android.net.Uri r13, com.whatsapp.l5 r14) {
        /*
        r11 = this;
        r10 = com.whatsapp.l5.s;
        r0 = 3;
        r2 = new java.lang.String[r0];
        r0 = 0;
        r1 = z;
        r3 = 21;
        r1 = r1[r3];
        r2[r0] = r1;
        r0 = 1;
        r1 = z;
        r3 = 31;
        r1 = r1[r3];
        r2[r0] = r1;
        r0 = 2;
        r1 = z;
        r3 = 27;
        r1 = r1[r3];
        r2[r0] = r1;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x0058;
    L_0x0026:
        r0 = 5;
        r0 = new java.lang.String[r0];
        r1 = 0;
        r3 = z;
        r4 = 24;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 1;
        r3 = z;
        r4 = 25;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 2;
        r3 = z;
        r4 = 18;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 3;
        r3 = z;
        r4 = 32;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 4;
        r3 = z;
        r4 = 30;
        r3 = r3[r4];
        r0[r1] = r3;
        if (r10 == 0) goto L_0x01fe;
    L_0x0058:
        r0 = 4;
        r0 = new java.lang.String[r0];
        r1 = 0;
        r3 = z;
        r4 = 19;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 1;
        r3 = z;
        r4 = 26;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 2;
        r3 = z;
        r4 = 28;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 3;
        r3 = z;
        r4 = 22;
        r3 = r3[r4];
        r0[r1] = r3;
        r6 = r0;
    L_0x0080:
        r0 = z;
        r1 = 20;
        r0 = r0[r1];
        if (r14 != 0) goto L_0x00c6;
    L_0x0088:
        r0 = z;	 Catch:{ Exception -> 0x00b9 }
        r1 = 29;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00b9 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00b9 }
        r0 = com.whatsapp.App.q();	 Catch:{ Exception -> 0x00b9 }
        if (r0 == 0) goto L_0x00bd;
    L_0x0097:
        r0 = com.whatsapp.contact.o.INTERACTIVE_DELTA;	 Catch:{ Exception -> 0x00bb }
    L_0x0099:
        r0 = com.whatsapp.contact.i.b(r12, r0);
        r1 = r0.isFailure();	 Catch:{ Exception -> 0x00c0 }
        if (r1 == 0) goto L_0x00ab;
    L_0x00a3:
        r1 = com.whatsapp.App.aA;	 Catch:{ Exception -> 0x00c0 }
        r2 = 0;
        r1.a(r2);	 Catch:{ Exception -> 0x00c0 }
        if (r10 == 0) goto L_0x00b7;
    L_0x00ab:
        r0 = r0.isSuccess();	 Catch:{ Exception -> 0x00c2 }
        if (r0 == 0) goto L_0x00b7;
    L_0x00b1:
        r0 = com.whatsapp.App.aA;	 Catch:{ Exception -> 0x00c4 }
        r1 = 0;
        r0.b(r1);	 Catch:{ Exception -> 0x00c4 }
    L_0x00b7:
        r0 = 1;
    L_0x00b8:
        return r0;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;
    L_0x00bd:
        r0 = com.whatsapp.contact.o.BACKGROUND_DELTA;
        goto L_0x0099;
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r7 = 0;
        r9 = 0;
        r0 = com.whatsapp.App.v(r12);	 Catch:{ all -> 0x01f3 }
        if (r0 != 0) goto L_0x00e0;
    L_0x00ce:
        r0 = z;	 Catch:{ all -> 0x01f3 }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ all -> 0x01f3 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x01f3 }
        r0 = 1;
        if (r7 == 0) goto L_0x00b8;
    L_0x00da:
        r7.close();	 Catch:{ Exception -> 0x00de }
        goto L_0x00b8;
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = com.whatsapp.App.at;	 Catch:{ all -> 0x01f3 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r13;
        r8 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x01f3 }
        if (r8 != 0) goto L_0x00f5;
    L_0x00ec:
        r0 = 1;
        if (r8 == 0) goto L_0x00b8;
    L_0x00ef:
        r8.close();	 Catch:{ Exception -> 0x00f3 }
        goto L_0x00b8;
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r0 = r9;
    L_0x00f6:
        r1 = r8.moveToNext();	 Catch:{ all -> 0x01c9 }
        if (r1 == 0) goto L_0x01be;
    L_0x00fc:
        r1 = 2;
        r1 = r8.getInt(r1);	 Catch:{ all -> 0x01c9 }
        r2 = 1;
        if (r1 != r2) goto L_0x01bc;
    L_0x0104:
        r0 = 0;
        r0 = r8.getLong(r0);	 Catch:{ all -> 0x01c9 }
        r2 = 1;
        r2 = r8.getString(r2);	 Catch:{ all -> 0x01c9 }
        if (r2 == 0) goto L_0x0116;
    L_0x0110:
        r3 = r2.length();	 Catch:{ Exception -> 0x01c7 }
        if (r3 != 0) goto L_0x0119;
    L_0x0116:
        r9 = 1;
        if (r10 == 0) goto L_0x011c;
    L_0x0119:
        r9 = 0;
        r14.q = r2;	 Catch:{ all -> 0x01c9 }
    L_0x011c:
        r2 = 1;
        r4 = new java.lang.String[r2];	 Catch:{ all -> 0x01c9 }
        r2 = 0;
        r0 = java.lang.Long.toString(r0);	 Catch:{ all -> 0x01c9 }
        r4[r2] = r0;	 Catch:{ all -> 0x01c9 }
        r7 = 0;
        r0 = com.whatsapp.App.at;	 Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
        r1 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;	 Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
        r2 = z;	 Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
        r3 = 16;
        r3 = r2[r3];	 Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
        r5 = 0;
        r2 = r6;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
        if (r1 == 0) goto L_0x01b6;
    L_0x0139:
        r0 = r1.moveToNext();	 Catch:{ Exception -> 0x01d1 }
        if (r0 == 0) goto L_0x01b6;
    L_0x013f:
        r0 = new com.whatsapp.db;	 Catch:{ Exception -> 0x01de }
        r2 = 0;
        r2 = r1.getLong(r2);	 Catch:{ Exception -> 0x01de }
        r4 = 1;
        r4 = r1.getString(r4);	 Catch:{ Exception -> 0x01de }
        r4 = android.telephony.PhoneNumberUtils.stripSeparators(r4);	 Catch:{ Exception -> 0x01de }
        r0.<init>(r2, r4);	 Catch:{ Exception -> 0x01de }
        r14.l = r0;	 Catch:{ Exception -> 0x01de }
        r0 = 2;
        r0 = r1.getInt(r0);	 Catch:{ Exception -> 0x01de }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Exception -> 0x01de }
        r14.u = r0;	 Catch:{ Exception -> 0x01de }
        r0 = 3;
        r0 = r1.getString(r0);	 Catch:{ Exception -> 0x01de }
        r14.j = r0;	 Catch:{ Exception -> 0x01de }
        r0 = r1.getColumnCount();	 Catch:{ Exception -> 0x01de }
        r2 = 4;
        if (r0 <= r2) goto L_0x01e7;
    L_0x016d:
        r0 = 4;
        r0 = r1.getString(r0);	 Catch:{ Exception -> 0x01de }
    L_0x0172:
        r14.k = r0;	 Catch:{ Exception -> 0x01e9 }
        if (r9 == 0) goto L_0x017c;
    L_0x0176:
        r0 = r14.l;	 Catch:{ Exception -> 0x01e9 }
        r0 = r0.b;	 Catch:{ Exception -> 0x01e9 }
        r14.q = r0;	 Catch:{ Exception -> 0x01e9 }
    L_0x017c:
        r0 = r14.l;	 Catch:{ Exception -> 0x01d3 }
        r0 = r0.b;	 Catch:{ Exception -> 0x01d3 }
        if (r0 == 0) goto L_0x0139;
    L_0x0182:
        r0 = r14.l;	 Catch:{ Exception -> 0x01d3 }
        r0 = r0.b;	 Catch:{ Exception -> 0x01d3 }
        r0 = r0.length();	 Catch:{ Exception -> 0x01d3 }
        if (r0 <= 0) goto L_0x0139;
    L_0x018c:
        r0 = com.whatsapp.contact.i.c();	 Catch:{ Exception -> 0x01eb }
        if (r0 != 0) goto L_0x01ac;
    L_0x0192:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01eb }
        r0.<init>();	 Catch:{ Exception -> 0x01eb }
        r2 = z;	 Catch:{ Exception -> 0x01eb }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ Exception -> 0x01eb }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x01eb }
        r0 = r0.append(r14);	 Catch:{ Exception -> 0x01eb }
        r0 = r0.toString();	 Catch:{ Exception -> 0x01eb }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x01eb }
    L_0x01ac:
        r0 = r11.a;	 Catch:{ Exception -> 0x01d3 }
        r0.f(r14);	 Catch:{ Exception -> 0x01d3 }
        r11.k(r14);	 Catch:{ Exception -> 0x01d3 }
        if (r10 == 0) goto L_0x0139;
    L_0x01b6:
        if (r1 == 0) goto L_0x01fc;
    L_0x01b8:
        r1.close();	 Catch:{ Exception -> 0x01ed }
        r0 = r9;
    L_0x01bc:
        if (r10 == 0) goto L_0x00f6;
    L_0x01be:
        if (r8 == 0) goto L_0x00b8;
    L_0x01c0:
        r8.close();	 Catch:{ Exception -> 0x01c5 }
        goto L_0x00b8;
    L_0x01c5:
        r0 = move-exception;
        throw r0;
    L_0x01c7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01c9 }
    L_0x01c9:
        r0 = move-exception;
        r1 = r8;
    L_0x01cb:
        if (r1 == 0) goto L_0x01d0;
    L_0x01cd:
        r1.close();	 Catch:{ Exception -> 0x01f1 }
    L_0x01d0:
        throw r0;
    L_0x01d1:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01d3 }
    L_0x01d3:
        r0 = move-exception;
    L_0x01d4:
        com.whatsapp.util.Log.a(r0);	 Catch:{ all -> 0x01e0 }
        if (r1 == 0) goto L_0x01fc;
    L_0x01d9:
        r1.close();	 Catch:{ all -> 0x01c9 }
        r0 = r9;
        goto L_0x01bc;
    L_0x01de:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01d3 }
    L_0x01e0:
        r0 = move-exception;
    L_0x01e1:
        if (r1 == 0) goto L_0x01e6;
    L_0x01e3:
        r1.close();	 Catch:{ Exception -> 0x01ef }
    L_0x01e6:
        throw r0;	 Catch:{ all -> 0x01c9 }
    L_0x01e7:
        r0 = 0;
        goto L_0x0172;
    L_0x01e9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01d3 }
    L_0x01eb:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01d3 }
    L_0x01ed:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01c9 }
    L_0x01ef:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01c9 }
    L_0x01f1:
        r0 = move-exception;
        throw r0;
    L_0x01f3:
        r0 = move-exception;
        r1 = r7;
        goto L_0x01cb;
    L_0x01f6:
        r0 = move-exception;
        r1 = r7;
        goto L_0x01e1;
    L_0x01f9:
        r0 = move-exception;
        r1 = r7;
        goto L_0x01d4;
    L_0x01fc:
        r0 = r9;
        goto L_0x01bc;
    L_0x01fe:
        r6 = r0;
        goto L_0x0080;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kl.a(android.content.Context, android.net.Uri, com.whatsapp.l5):boolean");
    }

    public void m(l5 l5Var) {
        this.a.h(l5Var);
    }

    public void g() {
        b.clear();
    }

    public kl(Context context) {
        this.a = new a24(context);
    }

    public ArrayList i() {
        return this.a.g();
    }

    private static boolean a(aqo com_whatsapp_aqo) {
        return com_whatsapp_aqo == air.ALLOW || com_whatsapp_aqo == a3m.ALLOW || com_whatsapp_aqo == a5i.ALLOW || com_whatsapp_aqo == a2t.ALLOW || com_whatsapp_aqo == ao4.ALLOW || com_whatsapp_aqo == tq.ALLOW || com_whatsapp_aqo == asu.ALLOW || com_whatsapp_aqo == uq.ALLOW || com_whatsapp_aqo == c7.ALLOW || com_whatsapp_aqo == ms.ALLOW || com_whatsapp_aqo == it.ALLOW;
    }

    public boolean a(Collection collection, aqo com_whatsapp_aqo) {
        return this.a.b(collection, com_whatsapp_aqo);
    }

    public void g(String str) {
        this.a.a(str, 0, null);
    }

    public l5 a(l5 l5Var, String str, String str2, long j) {
        this.a.a(l5Var, str, str2, j);
        return b(str);
    }

    public void a(ArrayList arrayList, Set set) {
        this.a.a(arrayList, set);
    }

    public ArrayList k() {
        return this.a.h();
    }

    public l5 a(Uri uri) {
        boolean z = l5.s;
        synchronized (b) {
            for (l5 l5Var : b.values()) {
                if (!uri.equals(l5Var.q())) {
                    if (z) {
                        break;
                    }
                }
                return l5Var;
            }
            return this.a.a(uri);
        }
    }

    public void a(Map map) {
        this.a.a(map);
    }

    public void l() {
        this.a.f();
    }

    public Intent a(l5 l5Var, boolean z) {
        String b = a28.b(l5Var.a(App.z()));
        Parcelable intent = new Intent(App.z().getApplicationContext(), Conversation.class);
        intent.setAction(z[35]);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra(z[34], l5Var.p);
        intent.putExtra(z[38], b);
        Intent intent2 = new Intent();
        intent2.putExtra(z[36], intent);
        intent2.putExtra(z[37], false);
        intent2.putExtra(z[33], b);
        if (z) {
            int dimensionPixelSize = App.z().getResources().getDimensionPixelSize(2131427542);
            Parcelable a = l5Var.a(dimensionPixelSize, App.z().getResources().getDimension(2131427359), false);
            if (a == null) {
                a = l5Var.w();
                if (!(a == null || (a.getWidth() == dimensionPixelSize && a.getHeight() == dimensionPixelSize))) {
                    a = Bitmap.createScaledBitmap(a, dimensionPixelSize, dimensionPixelSize, true);
                }
            }
            intent2.putExtra(z[39], a);
        }
        return intent2;
    }

    public void a(Collection collection) {
        if (collection.size() > 0) {
            Map hashMap = new HashMap();
            this.a.a(collection, hashMap);
            b.putAll(hashMap);
        }
    }

    public ArrayList l(String str) {
        return this.a.a(str);
    }

    public void b(Collection collection) {
        this.a.b(collection);
        App.d(new ArrayList(collection));
    }

    public void n(l5 l5Var) {
        if (App.v(App.z().getApplicationContext())) {
            d a = b.a(l5Var.a(App.z()));
            if (a != null && !TextUtils.isEmpty(a.a())) {
                l5Var.l = new db(a.b(), a.a());
                l5Var.u = Integer.valueOf(a.f());
                l5Var.j = a.d();
                l5Var.k = a.e();
                if (!TextUtils.isEmpty(a.g())) {
                    l5Var.q = a.g();
                }
                if (!i.c()) {
                    Log.w(z[40]);
                }
                this.a.f(l5Var);
                k(l5Var);
                return;
            }
            return;
        }
        Log.w(z[41]);
    }

    public boolean d(String str) {
        if (str == null) {
            return false;
        }
        l5 e = e();
        if (e == null || !str.equals(e.p)) {
            return false;
        }
        return true;
    }

    public void b(ArrayList arrayList) {
        boolean z = l5.s;
        this.a.a(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l5 l5Var = (l5) it.next();
            l5Var.u();
            l5Var.o();
            c(l5Var);
            if (z) {
                return;
            }
        }
    }

    public int d() {
        int b = this.a.b();
        Log.i(z[0] + b);
        return b;
    }

    public void d(ArrayList arrayList) {
        this.a.e(arrayList);
    }

    public void a(l5 l5Var) {
        App.z().getApplicationContext().sendBroadcast(a(l5Var, false).setAction(z[2]));
    }

    public void g(l5 l5Var) {
        this.a.e(l5Var);
    }

    public void h(l5 l5Var) {
        this.a.d(l5Var);
        App.aB.sendEmptyMessage(0);
    }

    public void a(ContentResolver contentResolver, String str) {
        if (!l5.e(str) && !qm.i(str) && App.v(App.z())) {
            l5 f = f(str);
            if (f != null && f.l != null && f.l.a > 0) {
                Cursor query = contentResolver.query(RawContacts.CONTENT_URI, new String[]{z[13]}, z[14], new String[]{Long.toString(f.l.a)}, null);
                if (query != null) {
                    try {
                        if (query.moveToNext()) {
                            Contacts.markAsContacted(contentResolver, query.getLong(0));
                        }
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                    }
                }
            }
        }
    }

    public ArrayList b(String str, aqo com_whatsapp_aqo) {
        return b(a(str), com_whatsapp_aqo);
    }

    public boolean j(@NonNull String str) {
        return a(a(str), it.ALLOW);
    }

    public int b(@NonNull String str, String str2) {
        boolean z = l5.s;
        int i = 0;
        for (String b : new ArrayList(h(str))) {
            int i2;
            if (str2.equals(b(b).i())) {
                i2 = i + 1;
            } else {
                i2 = i;
            }
            if (z) {
                return i2;
            }
            i = i2;
        }
        return i;
    }

    public void d(Collection collection) {
        this.a.a(collection);
        App.d(new ArrayList(collection));
    }

    static boolean o(l5 l5Var) {
        return b.put(l5Var.p, l5Var) == null;
    }

    public void a(ArrayList arrayList) {
        this.a.c(arrayList);
    }

    public void j() {
        this.a.c();
    }

    public void a(String str, String str2, String str3) {
        l5 b = b(str);
        b.q = str3;
        if (!(str2 == null || str2.startsWith(App.ad()))) {
            b.c(1);
        }
        this.a.d(b);
    }

    public l5 c(String str) {
        l5 l5Var = (l5) b.get(str);
        if (l5Var != null) {
            return l5Var;
        }
        return this.a.b(str);
    }

    public void i(l5 l5Var) {
        d(Collections.singletonList(l5Var));
    }

    static void k(String str) {
        b.remove(str);
    }

    public l5 a(db dbVar) {
        boolean z = l5.s;
        synchronized (b) {
            for (l5 l5Var : b.values()) {
                if (!dbVar.equals(l5Var.l)) {
                    if (z) {
                        break;
                    }
                }
                return l5Var;
            }
            return this.a.a(dbVar);
        }
    }

    public boolean a(@NonNull String str, @Nullable String str2, @NonNull aqo com_whatsapp_aqo) {
        if (!a(com_whatsapp_aqo) || App.aK.F(str) == 0) {
            Collection arrayList = new ArrayList(a(str, str2));
            lu e = e();
            if (e != null) {
                arrayList.remove(e.p);
            }
            boolean a = a(arrayList, com_whatsapp_aqo);
            if (!a || arrayList.isEmpty() || com_whatsapp_aqo != it.ALLOW) {
                return a;
            }
            App.aK.s(str);
            return a;
        }
        if (App.aZ() && App.aK.F(str) == 2) {
            App.aK.s(str);
        }
        return true;
    }

    @NonNull
    public Collection h(@NonNull String str) {
        return (qm.i(str) || l5.e(str)) ? qm.c(str).l() : Collections.singleton(str);
    }

    public void d(l5 l5Var) {
        this.a.l(l5Var);
    }

    @NonNull
    public Collection a(@NonNull String str) {
        Collection arrayList = new ArrayList(h(str));
        lu e = e();
        if (e != null) {
            arrayList.remove(e.p);
        }
        return arrayList;
    }

    @NonNull
    public l5 b(@NonNull String str) {
        l5 f = f(str);
        if (f != null) {
            return f;
        }
        f = new l5(str);
        this.a.e(f);
        return f;
    }

    public ArrayList f() {
        return this.a.d();
    }

    static {
        String[] strArr = new String[42];
        String str = "<3nx:62\u007f\u007f8z>ed\"!}";
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
                        i3 = 85;
                        break;
                    case at.g /*1*/:
                        i3 = 93;
                        break;
                    case at.i /*2*/:
                        i3 = 10;
                        break;
                    case at.o /*3*/:
                        i3 = 17;
                        break;
                    default:
                        i3 = 76;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "62g?-;9x~%1sfp9;>bt>{<ie%:3$D\u0002\u001c\u0013YE\r\u0019\u0011UB\u0004\u001a\u000f^R\u0019\u0001";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "1?c\u007f*:rmt8&(g>= 8xhc&)kc8";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u00162de-6)Gp\"4:oc\u00136<fr\u001a0/Yd!";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "1?c\u007f*:rmt8&(g><0/gx?&4e\u007f\u001318dx)1";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "43nc#<9$a)'0cb?<2d?\u001e\u0010\u001cNN\u000f\u001a\u0013^P\u000f\u0001\u000e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "1?c\u007f*:rmt8&(g>= 8xhc03n";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "#8xb%:3";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0015.$f$4)yp<%sdt8";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    str = "18f";
                    obj = 9;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "1?c\u007f*:rgp\"4:occ18ft80\u001ee\u007f84>~b";
                    obj = 10;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u00068xg)'\u001dy?;=<~b-%-$\u007f)!";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "62de-6)Ux(";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\n4n,s";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0015.$f$4)yp<%sdt8";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "62de-6)Ux(hb";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    str = "62de-6)gp\"4:occ -np80\u0002b~ 12\u007fe\u001362de-6)Up\"1/ex(\n4dw#o}";
                    obj = 16;
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    strArr2 = strArr3;
                    str = "1<~p~";
                    obj = 17;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "'<}N/:3~p/!\u0002cu";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "62de-6)Ux(hb";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\n4n";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "1<~p\u007f";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = " -np80\u0015e}(\u001a(~R#;)kr8z>e\u007f84>~1-6>ob?u9o\u007f%09";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "'<}N/:3~p/!\u0002cu";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "1<~p}";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "1<~p}";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "<3Ug%&4h})\n:x~9%";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "1<~p~";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = " -np80\u0015e}(\u001a(~R#;)kr8z:oe\u0013;(f}\u0013\"<i~\"!<ie";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "&2xe\u0013>8s";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "14ya 4$U\u007f-88";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "1<~p\u007f";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "43nc#<9$x\"!8deb0%~c-{.b~>!>\u007feb\u001b\u001cGT";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "?4n";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "43nc#<9$x\"!8deb4>~x#;sGP\u0005\u001b";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "43nc#<9$x\"!8deb0%~c-{.b~>!>\u007feb\u001c\u0013^T\u0002\u0001";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "1(z}%6<~t";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "14ya 4$dp!0";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "43nc#<9$x\"!8deb0%~c-{.b~>!>\u007feb\u001c\u001eE_";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "62de-6)gp\"4:occ -np80\u0002b~ 1\u0002ed8\n>e\u007f84>~>?,3iN-9/op(,\u0002c\u007f\u0013%/ev>0.y";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "62de-6)gp\"4:occ 9zp80\u0002b~ 1\u0002ed8\n>e\u007f84>~+l62de-6)*p/68ybl18dx)1";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = Collections.synchronizedMap(new HashMap());
                    return;
                default:
                    strArr2[i] = str;
                    str = "62g?-;9x~%1sfp9;>bt>{<ie%:3$X\u0002\u0006\tK]\u0000\n\u000eB^\u001e\u0001\u001e_E";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int b() {
        Throwable e;
        boolean z = l5.s;
        try {
            if (App.p.o(z[6]) != 0) {
                Log.i(z[5]);
                return 0;
            }
            String[] strArr = new String[]{z[8]};
            Cursor query;
            try {
                ce a = tp.a(z[4]);
                a.e();
                Log.i(z[3]);
                query = App.at.query(RawContacts.CONTENT_URI, strArr, null, null, null);
                try {
                    Log.i(z[7]);
                    if (query != null) {
                        a.a(a5a.COUNT, query.getCount());
                        int i = 0;
                        do {
                            if (!query.moveToNext()) {
                                break;
                            }
                            i += query.getInt(0);
                        } while (!z);
                        a.d();
                        if (query == null) {
                            return i;
                        }
                        try {
                            query.close();
                            return i;
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e22) {
                            throw e22;
                        }
                    }
                    return 0;
                } catch (Exception e222) {
                    throw e222;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                query = null;
                try {
                    Log.a(e);
                    if (query != null) {
                        query.close();
                    }
                    return 0;
                } catch (Throwable th) {
                    e = th;
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e2222) {
                            throw e2222;
                        }
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw e;
            }
        } catch (Exception e22222) {
            throw e22222;
        }
    }

    public boolean a(String str, aqo com_whatsapp_aqo) {
        if (!a(com_whatsapp_aqo) || App.aK.F(str) == 0) {
            boolean a = a(a(str), com_whatsapp_aqo);
            if (!a || com_whatsapp_aqo != it.ALLOW) {
                return a;
            }
            App.aK.s(str);
            return a;
        }
        if (App.aZ() && App.aK.F(str) == 2) {
            App.aK.s(str);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(java.util.Collection r9) {
        /*
        r8 = this;
        r1 = com.whatsapp.l5.s;
        r0 = z;
        r2 = 11;
        r0 = r0[r2];
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        com.whatsapp.l5.a(r9, r0, r2);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = r9.iterator();
    L_0x001f:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x007d;
    L_0x0025:
        r0 = r4.next();
        r0 = (com.whatsapp.l5) r0;
        if (r0 == 0) goto L_0x007b;
    L_0x002d:
        r5 = r0.p;
        if (r5 == 0) goto L_0x003f;
    L_0x0031:
        r5 = r0.p;
        r6 = z;
        r7 = 12;
        r6 = r6[r7];
        r5 = r5.equals(r6);
        if (r5 != 0) goto L_0x001f;
    L_0x003f:
        r5 = r0.c();
        if (r5 == 0) goto L_0x0047;
    L_0x0045:
        if (r1 == 0) goto L_0x001f;
    L_0x0047:
        r3.add(r0);
        r5 = r0.m;
        if (r5 == 0) goto L_0x0078;
    L_0x004e:
        r5 = r8.a;
        r5 = r5.k(r0);
        if (r5 != 0) goto L_0x0078;
    L_0x0056:
        r5 = r0.p;
        r5 = com.whatsapp.qa.c(r5);
        if (r5 != 0) goto L_0x0068;
    L_0x005e:
        r5 = com.whatsapp.App.aK;
        r6 = r0.p;
        r5 = r5.x(r6);
        if (r5 == 0) goto L_0x0073;
    L_0x0068:
        r5 = r0.l;
        if (r5 == 0) goto L_0x007b;
    L_0x006c:
        r5 = r8.a;
        r5.c(r0);
        if (r1 == 0) goto L_0x007b;
    L_0x0073:
        r2.add(r0);
        if (r1 == 0) goto L_0x007b;
    L_0x0078:
        r2.add(r0);
    L_0x007b:
        if (r1 == 0) goto L_0x001f;
    L_0x007d:
        r0 = r2.size();
        if (r0 <= 0) goto L_0x0086;
    L_0x0083:
        r8.b(r2);
    L_0x0086:
        r0 = r3.size();
        if (r0 <= 0) goto L_0x008f;
    L_0x008c:
        com.whatsapp.App.c(r2);
    L_0x008f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kl.c(java.util.Collection):void");
    }

    public Map c() {
        return this.a.a();
    }

    private void k(l5 l5Var) {
        bq.a(new v1(this, l5Var));
    }

    public lu e() {
        if (App.ad() == null) {
            return null;
        }
        if (c == null || !c.p.equals(App.ad() + z[15])) {
            c = new lu();
        }
        return c;
    }

    public void c(ArrayList arrayList) {
        this.a.b(arrayList);
    }

    public void a(Uri uri, l5 l5Var) {
        Context applicationContext = App.z().getApplicationContext();
        if (a(applicationContext, uri, l5Var)) {
            App.a(applicationContext, 2131230783, 0);
        }
    }

    public void a(String str, long j, String str2) {
        this.a.a(str, j, str2);
    }

    public boolean a() {
        return this.a.e();
    }

    public int c(@NonNull String str, String str2) {
        boolean z = l5.s;
        int i = 0;
        for (String b : new ArrayList(h(str))) {
            int i2;
            if (str2.equals(b(b).a(App.z()))) {
                i2 = i + 1;
            } else {
                i2 = i;
            }
            if (z) {
                return i2;
            }
            i = i2;
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    public java.util.Collection a(@android.support.annotation.NonNull java.lang.String r4, @android.support.annotation.Nullable java.lang.String r5) {
        /*
        r3 = this;
        r0 = com.whatsapp.qm.i(r4);
        if (r0 != 0) goto L_0x000c;
    L_0x0006:
        r0 = com.whatsapp.l5.e(r4);
        if (r0 == 0) goto L_0x0030;
    L_0x000c:
        r1 = com.whatsapp.qm.c(r4);
        r0 = r1.a();
        r0 = android.text.TextUtils.equals(r5, r0);
        if (r0 != 0) goto L_0x0024;
    L_0x001a:
        r0 = com.whatsapp.App.aK;
        r0 = r0.b(r4, r5);
        r2 = com.whatsapp.l5.s;
        if (r2 == 0) goto L_0x0028;
    L_0x0024:
        r0 = r1.l();
    L_0x0028:
        if (r0 == 0) goto L_0x002b;
    L_0x002a:
        return r0;
    L_0x002b:
        r0 = java.util.Collections.emptyList();
        goto L_0x002a;
    L_0x0030:
        r0 = java.util.Collections.singleton(r4);
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kl.a(java.lang.String, java.lang.String):java.util.Collection");
    }
}
