package android.support.v4.app;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompatBase.Action;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class RemoteInputCompatJellybean {
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "\u001bu\u0006\u001do<k\u000f\u0017^\u0015k\u0007;v\nl\u001e";
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
                        i3 = 122;
                        break;
                    case at.g /*1*/:
                        i3 = 25;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = 24;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001fa\u001e\u0000y\t";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\b|\u0019\u0007t\u000eR\u000f\u000b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0016x\b\u0017t";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001bw\u000e\u0000w\u0013}D\u0000}\u0017v\u001e\u0017q\u0014i\u001f\u00066\b|\u0019\u0007t\u000ej";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u000e|\u0012\u00067\fw\u000e\\y\u0014}\u0018\u001dq\u001e7\u0003\u001cl\u001fw\u001e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001bw\u000e\u0000w\u0013}D\u0000}\u0017v\u001e\u0017q\u0014i\u001f\u00066\b|\u0019\u0007t\u000ej.\u0013l\u001b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0019q\u0005\u001b{\u001fj";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static Bundle getResultsFromIntent(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType(z[6]) && description.getLabel().equals(z[5])) {
            return (Bundle) clipData.getItemAt(0).getIntent().getExtras().getParcelable(z[7]);
        }
        return null;
    }

    static Bundle[] toBundleArray(RemoteInput[] remoteInputArr) {
        int i = Action.a;
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        int i2 = 0;
        while (i2 < remoteInputArr.length) {
            bundleArr[i2] = toBundle(remoteInputArr[i2]);
            i2++;
            if (i != 0) {
                break;
            }
        }
        return bundleArr;
    }

    static Bundle toBundle(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        bundle.putString(z[3], remoteInput.getResultKey());
        bundle.putCharSequence(z[4], remoteInput.getLabel());
        bundle.putCharSequenceArray(z[1], remoteInput.getChoices());
        bundle.putBoolean(z[0], remoteInput.getAllowFreeFormInput());
        bundle.putBundle(z[2], remoteInput.getExtras());
        return bundle;
    }
}
