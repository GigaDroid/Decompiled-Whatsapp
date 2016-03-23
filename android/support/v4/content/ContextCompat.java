package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.NonNull;
import android.util.Log;
import com.whatsapp.arj;
import java.io.File;
import org.v;
import org.whispersystems.at;

public class ContextCompat {
    public static boolean a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "r\u0005G\b\u0015BKR\u0005YD\u0019C\u000b\rBK@\u0003\u0015B\u0018\u0006\u0019\fE\u000fO\u0018Y";
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
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 38;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "W\u000eT\u0007\u0010T\u0018O\u0005\u0017\u0007\u0002UJ\u0017R\u0007J";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "I\u0004y\b\u0018D\u0000S\u001a";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "d\u0004H\u001e\u001c_\u001fe\u0005\u0014W\nR";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public final File getNoBackupFilesDir(Context context) {
        if (VERSION.SDK_INT < 21) {
            return createFilesDir(new File(context.getApplicationInfo().dataDir, z[3]));
        }
        try {
            return ContextCompatApi21.getNoBackupFilesDir(context);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static final int getColor(Context context, int i) {
        if (VERSION.SDK_INT < 23) {
            return context.getResources().getColor(i);
        }
        try {
            return ContextCompatApi23.getColor(context, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static final Drawable getDrawable(Context context, int i) {
        if (VERSION.SDK_INT < 21) {
            return context.getResources().getDrawable(i);
        }
        try {
            return ContextCompatApi21.getDrawable(context, i);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static synchronized File createFilesDir(File file) {
        synchronized (ContextCompat.class) {
            try {
                if (!file.exists()) {
                    if (!file.mkdirs()) {
                        try {
                            if (!file.exists()) {
                                Log.w(z[1], z[0] + file.getPath());
                                file = null;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        return file;
    }

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        try {
            throw new IllegalArgumentException(z[2]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 16) {
            try {
                ContextCompatJellybean.startActivities(context, intentArr, bundle);
                return true;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i < 11) {
            return false;
        } else {
            try {
                ContextCompatHoneycomb.startActivities(context, intentArr);
                return true;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }
}
