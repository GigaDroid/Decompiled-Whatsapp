package com.whatsapp;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.Preference;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.appcompat.R;
import android.view.View;
import android.widget.CheckBox;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

public class SettingsChatHistory extends DialogToastPreferenceActivity {
    private static final String[] z;
    private String i;

    static {
        String[] strArr = new String[6];
        String str = "\u0002iRTr\u0000hPxg\u001dy]Np\nETKj0y]Fr\u001c";
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
                        i3 = 111;
                        break;
                    case at.g /*1*/:
                        i3 = 26;
                        break;
                    case at.i /*2*/:
                        i3 = 53;
                        break;
                    case at.o /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 6;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\nwTNj0y]Fr0r\\Tr\u0000hL";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0002iRTr\u0000hPxb\nvPSc0{YKY\frTSu";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0002iRTr\u0000hPxe\u0003\u007fTUY\u000evYxe\u0007{AT";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\fu[Sg\fn";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0002iRTr\u0000hPxg\u001dy]Np\nETKj0y]Fr\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case arj.Theme_editTextStyle /*104*/:
                if (i2 == -1) {
                    this.i = intent.getStringExtra(z[5]);
                    showDialog(19);
                }
            default:
        }
    }

    public SettingsChatHistory() {
        this.i = null;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(2131099656);
        findPreference(z[2]).setOnPreferenceClickListener(new ao0(this));
        findPreference(z[3]).setOnPreferenceClickListener(new a_q(this));
        findPreference(z[4]).setOnPreferenceClickListener(new azs(this));
        Preference findPreference = findPreference(z[1]);
        int i = (qa.d() > 0 || qa.e() == 0) ? 2131230816 : 2131232173;
        findPreference.setTitle(i);
        findPreference(z[0]).setOnPreferenceClickListener(new a9p(this));
    }

    private static void b(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (elapsedRealtime < j2) {
            try {
                Thread.sleep(j2 - elapsedRealtime);
            } catch (InterruptedException e) {
            }
        }
    }

    static void a(long j, long j2) {
        b(j, j2);
    }

    private void a(boolean z) {
        a(2131231710, 2131231813);
        bq.a(new eo(this, z, SystemClock.elapsedRealtime()), new Object[0]);
    }

    static void a(SettingsChatHistory settingsChatHistory, boolean z) {
        settingsChatHistory.a(z);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case at.o /*3*/:
                View inflate = View.inflate(this, 2130903206, null);
                Dialog create = new Builder(this).setMessage(2131230914).setView(inflate).setNegativeButton(2131230884, new a51(this)).setPositiveButton(2131230912, new av(this, (CheckBox) inflate.findViewById(R.id.checkbox))).create();
                create.show();
                return create;
            case at.p /*4*/:
                return new Builder(this).setMessage(2131231046).setPositiveButton(2131231580, new ja(this)).setNegativeButton(2131230884, null).create();
            case at.m /*5*/:
                int i2;
                boolean z = qa.d() > 0;
                OnClickListener com_whatsapp_adk = new adk(this, z);
                Builder builder = new Builder(this);
                if (z) {
                    i2 = 2131230817;
                } else {
                    i2 = 2131232174;
                }
                return builder.setMessage(i2).setPositiveButton(2131231580, com_whatsapp_adk).setNegativeButton(2131230884, null).create();
            case arj.Toolbar_collapseContentDescription /*19*/:
                if (this.i == null) {
                    return super.onCreateDialog(i);
                }
                l5 b = App.as.b(this.i);
                return new Builder(this).setMessage(2131231086).setPositiveButton(2131230828, new lz(this, b)).setNeutralButton(2131232297, new avn(this, b)).create();
            default:
                return super.onCreateDialog(i);
        }
    }
}
