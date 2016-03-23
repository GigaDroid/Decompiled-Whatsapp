package com.whatsapp.preference;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.preference.RingtonePreference;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import org.v;
import org.whispersystems.at;

public class WaRingtonePreference extends RingtonePreference {
    private static final String[] z;
    String a;

    static {
        String[] strArr = new String[3];
        String str = "hDW\u000fHY";
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
                        i3 = 48;
                        break;
                    case at.g /*1*/:
                        i3 = 45;
                        break;
                    case at.i /*2*/:
                        i3 = 54;
                        break;
                    case at.o /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 37;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "QCR\u0012JYI\u0018\tKDHX\u0014\u000bUUB\u0012D\u001e__\u000eBDBX\u0005\u000bthp!p|yi5wy";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "QCR\u0012JYI\u0018\tKDHX\u0014\u000bUUB\u0012D\u001e__\u000eBDBX\u0005\u000bdtf%";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public WaRingtonePreference(Context context) {
        super(context);
    }

    public void a(String str) {
        this.a = str;
    }

    protected Uri onRestoreRingtone() {
        if (TextUtils.isEmpty(this.a)) {
            return super.onRestoreRingtone();
        }
        return Uri.parse(this.a);
    }

    public WaRingtonePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaRingtonePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected View onCreateView(ViewGroup viewGroup) {
        return WaPreference.b(WaPreference.a(super.onCreateView(viewGroup)));
    }

    protected void onPrepareRingtonePickerIntent(Intent intent) {
        super.onPrepareRingtonePickerIntent(intent);
        if (!(!getShowDefault() || (getRingtoneType() & 1) == 0 || (getRingtoneType() & 2) == 0)) {
            intent.putExtra(z[2], System.DEFAULT_NOTIFICATION_URI);
        }
        if (Build.MANUFACTURER.equalsIgnoreCase(z[0])) {
            intent.putExtra(z[1], 2);
        }
    }
}
