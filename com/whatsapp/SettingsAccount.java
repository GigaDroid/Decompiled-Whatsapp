package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.preference.Preference;
import android.support.v7.app.AlertDialog.Builder;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.preference.WaCheckBoxPreference;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SettingsAccount extends DialogToastPreferenceActivity {
    private static final String[] z;

    class 11 extends Preference {
        private static final String[] z;
        final SettingsAccount a;

        static {
            String[] strArr = new String[2];
            String str = "4\bl[\u0014fS7\\\u0010+RoC\u0006(\u000fy[\u0017r\u001fwFH:\u001di\u0004";
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
                            i3 = 92;
                            break;
                        case at.g /*1*/:
                            i3 = 124;
                            break;
                        case at.i /*2*/:
                            i3 = 24;
                            break;
                        case at.o /*3*/:
                            i3 = 43;
                            break;
                        default:
                            i3 = arj.Theme_checkedTextViewStyle;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "s\u001b}E\u0002.\u001dt\u0004UdL+\u001bWmM";
                        obj = null;
                }
            }
        }

        protected View onCreateView(ViewGroup viewGroup) {
            View onCreateView = super.onCreateView(viewGroup);
            TextView textView = (TextView) onCreateView.findViewById(2131755528);
            textView.setLinksClickable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            String str = z[0] + aqu.g() + "_" + aqu.c() + z[1];
            textView.setText(Html.fromHtml(this.a.getString(2131232160, new Object[]{str})));
            return onCreateView;
        }

        11(SettingsAccount settingsAccount, Context context) {
            this.a = settingsAccount;
            super(context);
        }
    }

    class 9 extends WaCheckBoxPreference {
        final SettingsAccount a;

        9(SettingsAccount settingsAccount, Context context) {
            this.a = settingsAccount;
            super(context);
        }

        protected View onCreateView(ViewGroup viewGroup) {
            View onCreateView = super.onCreateView(viewGroup);
            if (onCreateView != null) {
                TextView textView = (TextView) onCreateView.findViewById(16908304);
                if (textView != null) {
                    textView.setLinksClickable(true);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            return onCreateView;
        }
    }

    static {
        String[] strArr = new String[9];
        String str = "TpOlRNaU";
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
                        i3 = 39;
                        break;
                    case at.g /*1*/:
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = 44;
                        break;
                    case at.o /*3*/:
                        i3 = 25;
                        break;
                    default:
                        i3 = 32;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "Cp@|TBJMzCH`Bm";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "WgEoADl";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "WgEoADlsvPSJClTxqIjCU|\\mIH{";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "WgEoADlsvPSJClT";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "WgEoADlsvPSJClTxqIjCU|\\mIH{";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "WgEoADlsvPSJClT";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "TpXmIIr_iRNcMzY\bqIjTUzU";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "D}MwGBJBlMEp^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(SettingsAccount settingsAccount) {
        settingsAccount.b();
    }

    private void a() {
        Preference preference = (WaCheckBoxPreference) findPreference(z[5]);
        Preference findPreference = findPreference(z[6]);
        if (vh.e(this)) {
            if (preference == null) {
                preference = new 9(this, this);
                preference.setKey(z[7]);
                preference.setTitle(2131232161);
                preference.setPersistent(false);
                getPreferenceScreen().addPreference(preference);
            }
            preference.setChecked(true);
            preference.setOnPreferenceClickListener(new od(this));
            if (findPreference == null) {
                findPreference = new 11(this, this);
            }
            findPreference.setKey(z[4]);
            findPreference.setLayoutResource(2130903270);
            findPreference.setPersistent(false);
            findPreference.setSelectable(false);
            getPreferenceScreen().addPreference(findPreference);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        if (preference != null) {
            getPreferenceScreen().removePreference(preference);
        }
        if (findPreference != null) {
            getPreferenceScreen().removePreference(findPreference);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r3) {
        /*
        r2 = this;
        super.onCreate(r3);
        r0 = com.whatsapp.fieldstats.k.ACCOUNT;
        com.whatsapp.nf.a(r0);
        r0 = 2131099654; // 0x7f060006 float:1.7811667E38 double:1.052903127E-314;
        r2.addPreferencesFromResource(r0);
        r0 = z;
        r1 = 1;
        r0 = r0[r1];
        r0 = r2.findPreference(r0);
        r1 = new com.whatsapp.dl;
        r1.<init>(r2);
        r0.setOnPreferenceClickListener(r1);
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        r0 = r2.findPreference(r0);
        r1 = new com.whatsapp.sm;
        r1.<init>(r2);
        r0.setOnPreferenceClickListener(r1);
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        r0 = r2.findPreference(r0);
        r1 = new com.whatsapp.a4y;
        r1.<init>(r2);
        r0.setOnPreferenceClickListener(r1);
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        r0 = r2.findPreference(r0);
        if (r0 == 0) goto L_0x0063;
    L_0x004c:
        r1 = com.whatsapp.a59.m;
        if (r1 == 0) goto L_0x005c;
    L_0x0050:
        r1 = new com.whatsapp.a5p;
        r1.<init>(r2);
        r0.setOnPreferenceClickListener(r1);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0063;
    L_0x005c:
        r1 = r2.getPreferenceScreen();
        r1.removePreference(r0);
    L_0x0063:
        r2.a();
        com.whatsapp.App.aW();
        r0 = de.greenrobot.event.h.b();
        r0.e(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsAccount.onCreate(android.os.Bundle):void");
    }

    public void onEvent(q9 q9Var) {
        a();
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case at.g /*1*/:
                return new Builder(this).setMessage(2131231586).setPositiveButton(2131231585, new aqv(this)).setNegativeButton(2131230884, new aip(this)).setOnCancelListener(new sv(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    public void onDestroy() {
        Log.i(z[8]);
        super.onDestroy();
        h.b().c(this);
    }

    static void b(SettingsAccount settingsAccount) {
        settingsAccount.a();
    }

    private void b() {
        a(0, 2131231813);
        bq.a(new aub(this), new Void[0]);
    }
}
