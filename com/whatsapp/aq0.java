package com.whatsapp;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Parcelable;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.whatsapp.util.Log;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class aq0 implements OnPreferenceClickListener {
    private static final String[] z;
    final SettingsChat a;

    static {
        String[] strArr = new String[12];
        String str = "\u0019w\u000e";
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
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = 11;
                        break;
                    case at.i /*2*/:
                        i3 = 46;
                        break;
                    case at.o /*3*/:
                        i3 = 55;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "ZdA[HKb]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "VyGROMjZ^NW";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "PfOPD\u0016!";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "XeJENPo\u0000^OMn@C\u000fXhZ^NW%irufHayu|Ez";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "ZdC\u0019VQjZD@I{\u0000^OMn@C\u000fXhZ^NW%jrgx^bc~nJb{qx[ke";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "ZdC\u0019VQjZD@I{\u0000^OMn@C\u000fXhZ^NW%}ruf\\o{miJ~rs";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "~jB[DKr";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "ZdC\u0019IMh\u0000VM[~C";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "ZdC\u0019VQjZD@I{\u0000^OMn@C\u000fXhZ^NW%|rr|_q``uG~vq|Y";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "XeJENPo\u0000^OMn@C\u000f\\sZE@\u0017B`~upJbhhw_kyuj";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "VyGROMjZ^NW";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    aq0(SettingsChat settingsChat) {
        this.a = settingsChat;
    }

    public boolean onPreferenceClick(Preference preference) {
        boolean z = DialogToastActivity.f;
        Intent intent = new Intent(z[5], null);
        intent.setType(z[4]);
        List queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        int i = 0;
        while (i < size) {
            ActivityInfo activityInfo = ((ResolveInfo) queryIntentActivities.get(i)).activityInfo;
            Log.i(activityInfo.applicationInfo.packageName + z[0] + activityInfo.name);
            if ((activityInfo.name.contains(z[2]) && activityInfo.name.contains(z[8])) || activityInfo.name.contains(z[9])) {
                intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
                intent.putExtra(z[3], this.a.getResources().getConfiguration().orientation);
                if (!z) {
                    break;
                }
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        new Intent(z[7], null).putExtra(z[1], this.a.getResources().getConfiguration().orientation);
        Intent intent2 = new Intent(z[6], null);
        Parcelable[] parcelableArr = new Parcelable[]{intent, r0, intent2};
        Intent createChooser = Intent.createChooser(new Intent(z[10], null), this.a.getString(2131231695));
        createChooser.putExtra(z[11], parcelableArr);
        this.a.startActivityForResult(createChooser, 17);
        return true;
    }
}
