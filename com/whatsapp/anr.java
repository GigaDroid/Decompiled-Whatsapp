package com.whatsapp;

import android.os.AsyncTask;
import android.preference.CheckBoxPreference;
import com.whatsapp.contact.i;
import com.whatsapp.contact.j;
import com.whatsapp.contact.o;
import org.v;
import org.whispersystems.at;

class anr extends AsyncTask {
    private static final String[] z;
    final SettingsContacts a;

    static {
        String[] strArr = new String[4];
        String str = "B\u00169*^_\u0014>qDH\u001d.qDD\u0010.;DB\\.<DE\u00129+D\u0011";
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
                        i3 = 115;
                        break;
                    case at.i /*2*/:
                        i3 = 77;
                        break;
                    case at.o /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "B\u00169*^_\u0014>qDH\u001d.qQP\u001a!;S\u001e\u0010/-CP\u00078-\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "B\u00169*^_\u0014>qDH\u001d.qQP\u001a!;S\u001e\u0010/-CP\u00078-\u0017";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "B\u00169*^_\u0014>qDH\u001d.qQP\u001a!;S\u001e\u0010/-CP\u00078-\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected j a(Void[] voidArr) {
        return i.b(this.a.getApplicationContext(), o.INTERACTIVE_FULL);
    }

    protected void onPreExecute() {
        this.a.showDialog(16);
    }

    private anr(SettingsContacts settingsContacts) {
        this.a = settingsContacts;
    }

    protected void onPostExecute(Object obj) {
        a((j) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.contact.j r6) {
        /*
        r5 = this;
        r4 = 1;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r5.a;
        r2 = 16;
        r1.removeDialog(r2);
        r1 = com.whatsapp.g.a;
        r2 = r6.ordinal();
        r1 = r1[r2];
        switch(r1) {
            case 1: goto L_0x0016;
            case 2: goto L_0x004f;
            case 3: goto L_0x0085;
            case 4: goto L_0x0085;
            case 5: goto L_0x00bf;
            default: goto L_0x0015;
        };
    L_0x0015:
        return;
    L_0x0016:
        r1 = com.whatsapp.App.aA;
        r1.b(r4);
        r2 = java.lang.System.currentTimeMillis();
        com.whatsapp.App.c(r2);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.a;
        r2 = com.whatsapp.SettingsContacts.a(r2);
        r2 = r2.isChecked();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r5.a;
        r2 = 2131230966; // 0x7f0800f6 float:1.8078E38 double:1.0529680037E-314;
        r1.a(r2);
        if (r0 == 0) goto L_0x0015;
    L_0x004f:
        r1 = r5.a;
        r1 = com.whatsapp.SettingsContacts.a(r1);
        r5.a(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.a;
        r2 = com.whatsapp.SettingsContacts.a(r2);
        r2 = r2.isChecked();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r5.a;
        r2 = 2131232311; // 0x7f080637 float:1.8080728E38 double:1.052968668E-314;
        r1.a(r2);
        if (r0 == 0) goto L_0x0015;
    L_0x0085:
        r1 = com.whatsapp.App.aA;
        r1.a(r4);
        r1 = r5.a;
        r1 = com.whatsapp.SettingsContacts.a(r1);
        r5.a(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r5.a;
        r2 = com.whatsapp.SettingsContacts.a(r2);
        r2 = r2.isChecked();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r5.a;
        r2 = 2131230924; // 0x7f0800cc float:1.8077915E38 double:1.052967983E-314;
        r1.a(r2);
        if (r0 == 0) goto L_0x0015;
    L_0x00bf:
        r0 = r5.a;
        r0 = com.whatsapp.SettingsContacts.a(r0);
        r5.a(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r5.a;
        r1 = com.whatsapp.SettingsContacts.a(r1);
        r1 = r1.isChecked();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r5.a;
        r1 = 2131230925; // 0x7f0800cd float:1.8077917E38 double:1.0529679834E-314;
        r0.a(r1);
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anr.a(com.whatsapp.contact.j):void");
    }

    anr(SettingsContacts settingsContacts, im imVar) {
        this(settingsContacts);
    }

    private void a(CheckBoxPreference checkBoxPreference) {
        checkBoxPreference.setChecked(!checkBoxPreference.isChecked());
    }
}
