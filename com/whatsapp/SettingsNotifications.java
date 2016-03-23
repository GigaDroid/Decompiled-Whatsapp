package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.notification.d;
import com.whatsapp.preference.WaRingtonePreference;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SettingsNotifications extends DialogToastPreferenceActivity {
    private static final String[] z;
    private OnPreferenceChangeListener i;
    private OnPreferenceChangeListener j;
    private OnPreferenceChangeListener k;
    private OnPreferenceChangeListener l;

    static {
        String[] strArr = new String[10];
        String str = "3#J:H\u000b?J;Q2(z#Q39Q\u0010[;=J=";
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
                        i3 = 84;
                        break;
                    case at.g /*1*/:
                        i3 = 81;
                        break;
                    case at.i /*2*/:
                        i3 = 37;
                        break;
                    case at.o /*3*/:
                        i3 = 79;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ":>Q&^-\u000eU H!!z\"W04";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ":>Q&^-\u000eI&_<%z,W8>W";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "70I#g\"8G=Y 4z#]:6Q'";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "3#J:H\u000b?J;Q2(z?W$$U\u0010U;5@";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ":>Q&^-\u000eS&Z&0Q*g84K(L<";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ":>Q&^-\u000eW&V3%J!]";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "3#J:H\u000b?J;Q2(z;W:4";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "70I#g&8K(L;?@";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "3#J:H\u000b?J;Q2(z9Q6#D;]\u000b=@!_ 9";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755045, 0, 2131231987), 0);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131755045) {
            return super.onOptionsItemSelected(menuItem);
        }
        showDialog(8);
        return true;
    }

    static void a(SettingsNotifications settingsNotifications) {
        settingsNotifications.a();
    }

    public SettingsNotifications() {
        this.l = new awk(this);
        this.k = new a3j(this);
        this.j = new tn(this);
        this.i = new a4a(this);
    }

    private void a() {
        addPreferencesFromResource(2131099663);
        a3b a = a3b.a((Context) this);
        a9q d = a.d();
        a9q g = a.g();
        WaRingtonePreference waRingtonePreference = (WaRingtonePreference) findPreference(z[7]);
        waRingtonePreference.a(d.c());
        waRingtonePreference.setSummary(d.a((Context) this, d.c()));
        waRingtonePreference.setOnPreferenceChangeListener(this.i);
        waRingtonePreference = (WaRingtonePreference) findPreference(z[8]);
        waRingtonePreference.a(g.c());
        waRingtonePreference.setSummary(d.a((Context) this, g.c()));
        waRingtonePreference.setOnPreferenceChangeListener(this.i);
        waRingtonePreference = (WaRingtonePreference) findPreference(z[9]);
        waRingtonePreference.a(d.g());
        waRingtonePreference.setSummary(d.a((Context) this, d.g()));
        waRingtonePreference.setOnPreferenceChangeListener(this.i);
        ListPreference listPreference = (ListPreference) findPreference(z[3]);
        listPreference.setValue(d.e());
        listPreference.setSummary(listPreference.getEntry());
        listPreference.setOnPreferenceChangeListener(this.l);
        listPreference = (ListPreference) findPreference(z[0]);
        listPreference.setValue(g.e());
        listPreference.setSummary(listPreference.getEntry());
        listPreference.setOnPreferenceChangeListener(this.l);
        listPreference = (ListPreference) findPreference(z[6]);
        listPreference.setValue(d.l());
        listPreference.setSummary(listPreference.getEntry());
        listPreference.setOnPreferenceChangeListener(this.k);
        listPreference = (ListPreference) findPreference(z[1]);
        listPreference.setValue(g.l());
        listPreference.setSummary(listPreference.getEntry());
        listPreference.setOnPreferenceChangeListener(this.k);
        listPreference = (ListPreference) findPreference(z[4]);
        listPreference.setValue(d.d());
        listPreference.setSummary(listPreference.getEntry());
        listPreference.setOnPreferenceChangeListener(this.k);
        listPreference = (ListPreference) findPreference(z[2]);
        listPreference.setValue(d.b());
        listPreference.setSummary(listPreference.getEntry());
        listPreference.setOnPreferenceChangeListener(this.j);
        listPreference = (ListPreference) findPreference(z[5]);
        listPreference.setValue(g.b());
        listPreference.setSummary(listPreference.getEntry());
        listPreference.setOnPreferenceChangeListener(this.j);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case aF.v /*7*/:
                return new Builder(this).setMessage(getString(2131231391)).setPositiveButton(2131231580, new as_(this)).create();
            case aF.u /*8*/:
                return new Builder(this).setMessage(2131231988).setPositiveButton(2131231836, new azi(this)).setNegativeButton(2131230884, null).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }
}
