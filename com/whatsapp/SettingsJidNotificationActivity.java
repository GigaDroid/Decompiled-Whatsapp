package com.whatsapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SettingsJidNotificationActivity extends DialogToastPreferenceActivity {
    private static final String[] z;
    private String i;

    static {
        String[] strArr = new String[15];
        String str = "7v0";
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
                        i3 = 93;
                        break;
                    case at.g /*1*/:
                        i3 = 31;
                        break;
                    case at.i /*2*/:
                        i3 = 84;
                        break;
                    case at.o /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "7v0Q\u00078l'o\r8@\"g\b/~ k";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "7v0Q\u00078l'o\r8@8g\r5k";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "7v0Q\t<s8Q\u00184q3z\u00053z";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "7v0Q\t<s8Q\u001c4}&o\u001e8";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "7v0Q\u00078l'o\r8@ a\u00048";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "7v0Q\u00078l'o\r8@\"g\b/~ k";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "7v0Q\u001f.z\u000bm\u001f.k;c";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "7v0Q\t<s8Q\u00184q3z\u00053z";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "7v0Q\u00078l'o\r8@$a\u001a(o";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "7v0Q\u00078l'o\r8@ a\u00048";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "7v0Q\t<s8Q\u001c4}&o\u001e8";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "7v0Q\u00078l'o\r8@8g\r5k";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "7v0Q\t<s8";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "7v0Q\u00078l'o\r8@$a\u001a(o";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r4 = this;
        r1 = com.whatsapp.a3b.a(r4);
        r0 = r4.i;
        r2 = r1.b(r0);
        r0 = 2131099661; // 0x7f06000d float:1.7811682E38 double:1.0529031304E-314;
        r4.addPreferencesFromResource(r0);
        r0 = z;
        r3 = 11;
        r0 = r0[r3];
        r0 = r4.findPreference(r0);
        r0 = (com.whatsapp.preference.WaRingtonePreference) r0;
        r3 = r2.c();
        r0.a(r3);
        r3 = r2.c();
        r3 = com.whatsapp.notification.d.a(r4, r3);
        r0.setSummary(r3);
        r3 = new com.whatsapp.l3;
        r3.<init>(r4, r0, r1);
        r0.setOnPreferenceChangeListener(r3);
        r0 = z;
        r3 = 7;
        r0 = r0[r3];
        r0 = r4.findPreference(r0);
        r0 = (android.preference.ListPreference) r0;
        r3 = r2.l();
        r0.setValue(r3);
        r3 = r0.getEntry();
        r0.setSummary(r3);
        r3 = new com.whatsapp.aez;
        r3.<init>(r4, r1);
        r0.setOnPreferenceChangeListener(r3);
        r0 = z;
        r3 = 10;
        r0 = r0[r3];
        r0 = r4.findPreference(r0);
        r0 = (android.preference.ListPreference) r0;
        r3 = r2.b();
        r0.setValue(r3);
        r3 = r0.getEntry();
        r0.setSummary(r3);
        r3 = new com.whatsapp._l;
        r3.<init>(r4, r1);
        r0.setOnPreferenceChangeListener(r3);
        r0 = z;
        r3 = 13;
        r0 = r0[r3];
        r0 = r4.findPreference(r0);
        r0 = (android.preference.ListPreference) r0;
        r3 = r2.e();
        r0.setValue(r3);
        r3 = r0.getEntry();
        r0.setSummary(r3);
        r3 = new com.whatsapp.ai9;
        r3.<init>(r4, r1);
        r0.setOnPreferenceChangeListener(r3);
        r0 = r4.i;
        r0 = com.whatsapp.qm.i(r0);
        if (r0 == 0) goto L_0x00bc;
    L_0x00a3:
        r0 = z;
        r3 = 14;
        r0 = r0[r3];
        r0 = r4.findPreference(r0);
        r0 = (android.preference.PreferenceCategory) r0;
        if (r0 == 0) goto L_0x00b8;
    L_0x00b1:
        r3 = r4.getPreferenceScreen();
        r3.removePreference(r0);
    L_0x00b8:
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0104;
    L_0x00bc:
        r0 = z;
        r3 = 9;
        r0 = r0[r3];
        r0 = r4.findPreference(r0);
        r0 = (com.whatsapp.preference.WaRingtonePreference) r0;
        r3 = r2.g();
        r0.a(r3);
        r3 = r2.g();
        r3 = com.whatsapp.notification.d.a(r4, r3);
        r0.setSummary(r3);
        r3 = new com.whatsapp.avt;
        r3.<init>(r4, r0, r1);
        r0.setOnPreferenceChangeListener(r3);
        r0 = z;
        r3 = 12;
        r0 = r0[r3];
        r0 = r4.findPreference(r0);
        r0 = (android.preference.ListPreference) r0;
        r3 = r2.d();
        r0.setValue(r3);
        r3 = r0.getEntry();
        r0.setSummary(r3);
        r3 = new com.whatsapp.o7;
        r3.<init>(r4, r1);
        r0.setOnPreferenceChangeListener(r3);
    L_0x0104:
        r0 = z;
        r3 = 8;
        r0 = r0[r3];
        r0 = r4.findPreference(r0);
        r0 = (android.preference.CheckBoxPreference) r0;
        r2 = r2.k();
        r0.setChecked(r2);
        r2 = new com.whatsapp.azy;
        r2.<init>(r4, r1);
        r0.setOnPreferenceChangeListener(r2);
        r4.a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsJidNotificationActivity.b():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755045, 0, 2131231987), 0);
        return super.onCreateOptionsMenu(menu);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = getIntent().getStringExtra(z[0]);
        b();
    }

    private void a() {
        boolean k = a3b.a((Context) this).b(this.i).k();
        findPreference(z[6]).setEnabled(k);
        findPreference(z[2]).setEnabled(k);
        findPreference(z[1]).setEnabled(k);
        findPreference(z[3]).setEnabled(k);
        if (!qm.i(this.i)) {
            findPreference(z[4]).setEnabled(k);
            findPreference(z[5]).setEnabled(k);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131755045) {
            return super.onOptionsItemSelected(menuItem);
        }
        a3b.a((Context) this).g(this.i);
        getPreferenceScreen().removeAll();
        b();
        return true;
    }

    static void a(SettingsJidNotificationActivity settingsJidNotificationActivity) {
        settingsJidNotificationActivity.a();
    }

    static String b(SettingsJidNotificationActivity settingsJidNotificationActivity) {
        return settingsJidNotificationActivity.i;
    }
}
