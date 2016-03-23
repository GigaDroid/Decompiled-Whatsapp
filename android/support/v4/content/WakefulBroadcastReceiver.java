package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final SparseArray mActiveWakeLocks;
    private static int mNextId;
    private static final String[] z;

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (mActiveWakeLocks) {
            int i = mNextId;
            mNextId++;
            if (mNextId <= 0) {
                mNextId = 1;
            }
            intent.putExtra(z[0], i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            WakeLock newWakeLock = ((PowerManager) context.getSystemService(z[1])).newWakeLock(1, z[2] + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            mActiveWakeLocks.put(i, newWakeLock);
            return startService;
        }
    }

    static {
        String[] strArr = new String[6];
        String str = "/\t=\u0012L'\u0003w\u0013V>\u00176\u0012W`\u00046\u000eW+\t-NT/\f<\fL-\f0\u0004";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 78;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 89;
                        break;
                    case at.o /*3*/:
                        i4 = 96;
                        break;
                    default:
                        i4 = 35;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "9\u00062\u0005\u0019";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0000\by\u0001@:\u000e/\u0005\u00039\u00062\u0005\u0003\"\b:\u000b\u0003'\u0003yC";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0019\u00062\u0005E;\u000b\u001b\u0012L/\u0003:\u0001P:5<\u0003F'\u0011<\u0012";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "/\t=\u0012L'\u0003w\u0013V>\u00176\u0012W`\u00046\u000eW+\t-NT/\f<\fL-\f0\u0004";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    mActiveWakeLocks = new SparseArray();
                    mNextId = 1;
                    return;
                default:
                    strArr2[i2] = str;
                    str = ">\b.\u0005Q";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static boolean completeWakefulIntent(Intent intent) {
        int intExtra = intent.getIntExtra(z[5], 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (mActiveWakeLocks) {
            WakeLock wakeLock = (WakeLock) mActiveWakeLocks.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                mActiveWakeLocks.remove(intExtra);
                return true;
            }
            Log.w(z[4], z[3] + intExtra);
            return true;
        }
    }
}
