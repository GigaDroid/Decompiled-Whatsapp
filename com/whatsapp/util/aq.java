package com.whatsapp.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;

public class aq {
    public static Signature[] a(Context context) {
        Signature[] signatureArr = null;
        String packageName = context.getPackageName();
        if (context.getPackageManager() == null) {
            return signatureArr;
        }
        try {
            return context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        } catch (NameNotFoundException e) {
            return signatureArr;
        }
    }
}
