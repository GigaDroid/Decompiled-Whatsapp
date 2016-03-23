package com.whatsapp;

import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class SettingsSecurity extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "^uy\u0002yDdc(eBds\u0011bNqn\u001edCc";
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
                        i3 = 45;
                        break;
                    case at.g /*1*/:
                        i3 = 16;
                        break;
                    case at.i /*2*/:
                        i3 = 26;
                        break;
                    case at.o /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 11;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "N\u007fwY|Eqn\u0004j]`E\u0007yHv\u007f\u0005nCs\u007f\u0004";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "^un\u0003bCwi\u0004nNeh\u001e\u007fT?~\u0012xYbu\u000e";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "^un\u0003bCwi\u0004nNeh\u001e\u007fT?y\u0005nLd\u007f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDestroy() {
        Log.i(z[3]);
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[1]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(2130903273);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(2131755898);
        switchCompat.setChecked(App.z().getSharedPreferences(z[2], 0).getBoolean(z[0], false));
        switchCompat.setOnCheckedChangeListener(new oo(this));
        findViewById(2131755896).setOnClickListener(new z5(this));
        findViewById(2131755897).setOnClickListener(new alc(this, switchCompat));
    }
}
