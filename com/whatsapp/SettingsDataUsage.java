package com.whatsapp;

import android.app.Dialog;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.support.v7.app.AlertDialog.Builder;
import com.whatsapp.preference.WaMultiSelectListPreference;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class SettingsDataUsage extends DialogToastPreferenceActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "u=\u001cjUi37hIz?\r";
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
                        i3 = 27;
                        break;
                    case at.g /*1*/:
                        i3 = 88;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 29;
                        break;
                    default:
                        i3 = 58;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "z-\u001cr^t/\u0006qUz<7oUz5\u0001s]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "z-\u001cr^t/\u0006qUz<7~_w4\u001dq[i";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "m7\u0001mew7\u001fB^z,\tBOh9\u000fx";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "z-\u001cr^t/\u0006qUz<7jS}1";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static int a(CharSequence[] charSequenceArr) {
        return b(charSequenceArr);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case at.g /*1*/:
                return new Builder(this).setMessage(getString(2131231891)).setPositiveButton(2131231580, new aan(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(2131099658);
        findPreference(z[0]).setOnPreferenceClickListener(new adg(this));
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(z[4]);
        checkBoxPreference.setOnPreferenceClickListener(new aoa(this, checkBoxPreference));
        WaMultiSelectListPreference waMultiSelectListPreference = (WaMultiSelectListPreference) findPreference(z[3]);
        if (!a59.d()) {
            waMultiSelectListPreference.b();
        }
        waMultiSelectListPreference.a(getString(2131231889));
        waMultiSelectListPreference.c(getString(2131231883));
        waMultiSelectListPreference.a(a(App.c(2)));
        waMultiSelectListPreference.setOnPreferenceChangeListener(new bx(this));
        waMultiSelectListPreference = (WaMultiSelectListPreference) findPreference(z[1]);
        if (!a59.d()) {
            waMultiSelectListPreference.b();
        }
        waMultiSelectListPreference.a(getString(2131231889));
        waMultiSelectListPreference.c(getString(2131231883));
        waMultiSelectListPreference.a(a(App.c(1)));
        waMultiSelectListPreference.setOnPreferenceChangeListener(new a9o(this));
        waMultiSelectListPreference = (WaMultiSelectListPreference) findPreference(z[2]);
        if (!a59.d()) {
            waMultiSelectListPreference.b();
        }
        waMultiSelectListPreference.a(getString(2131231889));
        waMultiSelectListPreference.c(getString(2131231883));
        waMultiSelectListPreference.a(a(App.c(3)));
        waMultiSelectListPreference.setOnPreferenceChangeListener(new al3(this));
    }

    private static int b(CharSequence[] charSequenceArr) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        int length = charSequenceArr.length;
        int i2 = 0;
        while (i2 < length) {
            i |= 1 << Integer.parseInt(charSequenceArr[i2].toString());
            i2++;
            if (z) {
                break;
            }
        }
        return i;
    }

    private static CharSequence[] a(int i) {
        boolean z = DialogToastActivity.f;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i != 0) {
            if ((i & 1) != 0) {
                arrayList.add(Integer.toString(i2));
            }
            i >>= 1;
            i2++;
            if (z) {
                break;
            }
        }
        return (CharSequence[]) arrayList.toArray(new CharSequence[0]);
    }
}
