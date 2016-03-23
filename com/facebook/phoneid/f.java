package com.facebook.phoneid;

import android.app.PendingIntent;
import android.backport.util.Base64;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.v;
import org.whispersystems.at;

public final class f {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "!\u001d\u0013dc6\\\u001bcb&\\\rko)\u001d\u001ao7b\f\u001cig#\u001b\u0018Dm/\u0019@";
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
                        i3 = 66;
                        break;
                    case at.g /*1*/:
                        i3 = 124;
                        break;
                    case at.i /*2*/:
                        i3 = 125;
                        break;
                    case at.o /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 12;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "+\u0012\u000bk`+\u0018]ky6\u0014]cb6\u0019\u0013~7b\u0018\u001c~m\u007f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u00114<'=";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "#\t\tb";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    @Nullable
    private static String a(@NonNull PackageInfo packageInfo) {
        try {
            if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                return null;
            }
            try {
                return Base64.encodeToString(MessageDigest.getInstance(z[3]).digest(packageInfo.signatures[0].toByteArray()), 11);
            } catch (NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw e2;
        }
    }

    public static boolean b(@NonNull PackageInfo packageInfo) {
        return a.a(a(packageInfo));
    }

    public static boolean a(Context context, Bundle bundle) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(z[1]);
        if (pendingIntent == null) {
            try {
                Log.e(z[2] + bundle);
                return false;
            } catch (NameNotFoundException e) {
                throw e;
            }
        }
        String str;
        if (VERSION.SDK_INT >= 17) {
            String creatorPackage = pendingIntent.getCreatorPackage();
            if (!e.a) {
                str = creatorPackage;
                return b(context.getPackageManager().getPackageInfo(str, 64));
            }
        }
        str = pendingIntent.getTargetPackage();
        try {
            return b(context.getPackageManager().getPackageInfo(str, 64));
        } catch (NameNotFoundException e2) {
            Log.e(z[0] + str);
            return false;
        }
    }
}
