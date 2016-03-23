package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class es extends AsyncTask {
    private static final String[] z;
    final ContactInfo a;

    static {
        String[] strArr = new String[18];
        String str = "5\u0012";
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
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 86;
                        break;
                    case at.i /*2*/:
                        i3 = 74;
                        break;
                    case at.o /*3*/:
                        i3 = 116;
                        break;
                    default:
                        i3 = 88;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\r7>\u0015i";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\r7>\u0015k";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\n9$\u00009\n\"\u0015\u001d<";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "5\u0012";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\r7>\u0015j";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001b7=+;\u00068>\u0015;\u001d\t#\u0010eVv\u000b:\u001cI;#\u0019=\u001d/:\u0011eN $\u0010v\b8.\u00067\u00002d\u0017-\u001b%%\u0006v\u0000\"/\u0019w\u0019>%\u001a=6 xS";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001b7=+;\u00068>\u0015;\u001d\t#\u0010";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001b7=+;\u00068>\u0015;\u001d\t#\u0010";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\b8.\u00067\u00002d\u0004=\u001b;#\u0007+\u00009$Z\n,\u0017\u000e+\u001b&\u0018\u001e5\u001b=\u0005";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\n9$\u00009\n\"\u0015\u001d<";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\n9$\u00009\n\"\u0015\u001d<Tij5\u0016-v'\u001d5\f\"3\u0004=Tq<\u001a<G7$\u0010*\u0006?.Z;\u001c$9\u001b*G?>\u00115F&\"\u001b6\f\t<F\u007f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "6?.";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\r7>\u0015j";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\r7>\u0015i";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\r7>\u0015k";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\n9$\u00009\n\"#\u001a>\u0006y?\u0004<\b\"/\u0010";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "6?.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onPostExecute(Object obj) {
        a((Void) obj);
    }

    private void e() {
        Bitmap a = ContactInfo.h(this.a).a(640, 0.0f, false);
        if (!isCancelled()) {
            this.a.runOnUiThread(new hq(this, a));
        }
    }

    public Void a(Void[] voidArr) {
        if (!isCancelled()) {
            e();
        }
        if (!isCancelled()) {
            d();
        }
        if (!isCancelled()) {
            c();
        }
        if (!isCancelled()) {
            b();
        }
        if (!isCancelled()) {
            a();
        }
        return null;
    }

    private void c() {
        long K = App.aK.K(ContactInfo.h(this.a).p);
        if (!isCancelled()) {
            this.a.runOnUiThread(new up(this, K));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(@android.support.annotation.NonNull java.util.ArrayList r15) {
        /*
        r14 = this;
        r13 = 3;
        r12 = 2;
        r5 = 0;
        r7 = 0;
        r6 = 1;
        r9 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.z();
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        r0 = android.support.v4.content.ContextCompat.checkSelfPermission(r0, r1);
        if (r0 == 0) goto L_0x0018;
    L_0x0017:
        return;
    L_0x0018:
        r0 = r14.a;
        r0 = r0.getContentResolver();
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r2 = new java.lang.String[r12];
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r2[r7] = r3;
        r3 = z;
        r4 = 11;
        r3 = r3[r4];
        r2[r6] = r3;
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        r4 = new java.lang.String[r6];
        r8 = r14.a;
        r8 = com.whatsapp.ContactInfo.h(r8);
        r10 = r8.f();
        r8 = java.lang.String.valueOf(r10);
        r4[r7] = r8;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x01d0;
    L_0x004f:
        r0 = r1.moveToNext();
        if (r0 == 0) goto L_0x01cd;
    L_0x0055:
        r0 = z;
        r2 = 4;
        r0 = r0[r2];
        r0 = r1.getColumnIndex(r0);
        r0 = r1.getString(r0);
    L_0x0062:
        r1.close();
        r8 = r0;
        r0 = r5;
    L_0x0067:
        if (r8 == 0) goto L_0x01ca;
    L_0x0069:
        r0 = r14.a;
        r0 = r0.getContentResolver();
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r2 = 5;
        r2 = new java.lang.String[r2];
        r3 = z;
        r3 = r3[r6];
        r2[r7] = r3;
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r2[r6] = r3;
        r3 = z;
        r3 = r3[r12];
        r2[r12] = r3;
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2[r13] = r3;
        r3 = 4;
        r4 = z;
        r10 = 16;
        r4 = r4[r10];
        r2[r3] = r4;
        r3 = z;
        r4 = 12;
        r3 = r3[r4];
        r4 = new java.lang.String[r6];
        r4[r7] = r8;
        r0 = r0.query(r1, r2, r3, r4, r5);
        r2 = r0;
    L_0x00a7:
        if (r2 == 0) goto L_0x0017;
    L_0x00a9:
        r0 = r2.moveToNext();
        if (r0 == 0) goto L_0x0171;
    L_0x00af:
        r0 = z;
        r1 = 15;
        r0 = r0[r1];
        r0 = r2.getColumnIndex(r0);
        r1 = r2.getString(r0);
        if (r1 != 0) goto L_0x00c1;
    L_0x00bf:
        if (r9 == 0) goto L_0x00a9;
    L_0x00c1:
        r0 = r14.isCancelled();
        if (r0 == 0) goto L_0x00c9;
    L_0x00c7:
        if (r9 == 0) goto L_0x0171;
    L_0x00c9:
        r0 = z;
        r3 = 8;
        r0 = r0[r3];
        r0 = r2.getColumnIndex(r0);
        r4 = r2.getLong(r0);
        r0 = z;
        r3 = 14;
        r0 = r0[r3];
        r0 = r2.getColumnIndex(r0);
        r3 = r2.getInt(r0);
        r0 = z;
        r0 = r0[r13];
        r0 = r2.getColumnIndex(r0);
        r0 = r2.getString(r0);
        if (r3 != 0) goto L_0x00f5;
    L_0x00f3:
        if (r0 != 0) goto L_0x0103;
    L_0x00f5:
        r0 = r14.a;
        r0 = r0.getResources();
        r3 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(r3);
        r0 = r0.getString(r3);
    L_0x0103:
        r3 = new com.whatsapp.at4;
        r8 = r14.a;
        r3.<init>(r8, r1, r0);
        r0 = com.whatsapp.App.as;
        r8 = new com.whatsapp.db;
        r10 = android.telephony.PhoneNumberUtils.stripSeparators(r1);
        r8.<init>(r4, r10);
        r0 = r0.a(r8);
        if (r0 == 0) goto L_0x0127;
    L_0x011b:
        r4 = r0.m;
        if (r4 == 0) goto L_0x0127;
    L_0x011f:
        r4 = r0.p;
        com.whatsapp.at4.b(r3, r4);
        com.whatsapp.at4.a(r3, r0);
    L_0x0127:
        r0 = z;
        r4 = 5;
        r0 = r0[r4];
        r4 = "";
        r4 = r1.replaceAll(r0, r4);
        r5 = r15.iterator();
        r1 = r6;
    L_0x0138:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x01c8;
    L_0x013e:
        r0 = r5.next();
        r0 = (com.whatsapp.at4) r0;
        r0 = com.whatsapp.at4.d(r0);
        r8 = z;
        r8 = r8[r7];
        r10 = "";
        r0 = r0.replaceAll(r8, r10);
        r8 = r4.endsWith(r0);
        if (r8 != 0) goto L_0x015f;
    L_0x0159:
        r0 = r0.endsWith(r4);
        if (r0 == 0) goto L_0x01c6;
    L_0x015f:
        if (r9 == 0) goto L_0x01c4;
    L_0x0161:
        r0 = r7;
    L_0x0162:
        if (r9 == 0) goto L_0x01c1;
    L_0x0164:
        if (r0 == 0) goto L_0x016f;
    L_0x0166:
        r0 = com.whatsapp.at4.b(r3);
        if (r0 == 0) goto L_0x016f;
    L_0x016c:
        r15.add(r3);
    L_0x016f:
        if (r9 == 0) goto L_0x00a9;
    L_0x0171:
        r1 = r6;
    L_0x0172:
        r0 = r15.size();
        if (r1 >= r0) goto L_0x01ba;
    L_0x0178:
        r0 = r15.get(r1);
        r0 = (com.whatsapp.at4) r0;
        r3 = com.whatsapp.at4.b(r0);
        if (r3 == 0) goto L_0x0191;
    L_0x0184:
        r3 = com.whatsapp.at4.b(r0);
        r3 = com.whatsapp.l5.h(r3);
        com.whatsapp.at4.a(r0, r3);
        if (r9 == 0) goto L_0x01b6;
    L_0x0191:
        r3 = com.whatsapp.at4.d(r0);
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x01b6;
    L_0x019b:
        r3 = com.whatsapp.at4.d(r0);
        r3 = r3.charAt(r7);
        r4 = 43;
        if (r3 != r4) goto L_0x01b6;
    L_0x01a7:
        r3 = com.whatsapp.at4.d(r0);
        r3 = r3.substring(r6);
        r3 = com.whatsapp.l5.c(r3);
        com.whatsapp.at4.a(r0, r3);
    L_0x01b6:
        r0 = r1 + 1;
        if (r9 == 0) goto L_0x01bf;
    L_0x01ba:
        r2.close();
        goto L_0x0017;
    L_0x01bf:
        r1 = r0;
        goto L_0x0172;
    L_0x01c1:
        r1 = r0;
        goto L_0x0138;
    L_0x01c4:
        r0 = r7;
        goto L_0x0164;
    L_0x01c6:
        r0 = r1;
        goto L_0x0162;
    L_0x01c8:
        r0 = r1;
        goto L_0x0164;
    L_0x01ca:
        r2 = r0;
        goto L_0x00a7;
    L_0x01cd:
        r0 = r5;
        goto L_0x0062;
    L_0x01d0:
        r8 = r5;
        r0 = r1;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.es.a(java.util.ArrayList):void");
    }

    es(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    private void b() {
        boolean z = DialogToastActivity.f;
        ArrayList f = App.as.f();
        List arrayList = new ArrayList();
        Iterator it = f.iterator();
        while (it.hasNext()) {
            l5 l5Var = (l5) it.next();
            if (isCancelled() && !z) {
                break;
            }
            if (!(!l5Var.c() || l5Var.A() || l5Var.q == null)) {
                Set l = qm.c(l5Var.p).l();
                if (l.contains(ContactInfo.h(this.a).p) && l.contains(App.as.e().p)) {
                    arrayList.add(l5Var);
                    continue;
                }
            }
            if (z) {
                break;
            }
        }
        if (!isCancelled()) {
            this.a.runOnUiThread(new aom(this, arrayList));
        }
    }

    public void a(Void voidR) {
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        if (ContactInfo.e(this.a).c()) {
            ContactInfo.a(this.a, ContactInfo.g(this.a));
        }
        Log.i(z[17]);
        if (this.a.findViewById(2131755756).getVisibility() == 0) {
            this.a.d();
        }
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    private void a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new at4(this.a, ContactInfo.h(this.a)));
        a(arrayList);
        arrayList.remove(0);
        if (!isCancelled()) {
            this.a.runOnUiThread(new _s(this, arrayList));
        }
    }

    private void d() {
        ArrayList a = App.aK.a(ContactInfo.h(this.a).p, 12, new i2(this));
        if (!isCancelled()) {
            this.a.runOnUiThread(new ae7(this, a));
        }
    }
}
