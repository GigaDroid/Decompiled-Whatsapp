package com.facebook.phoneid;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.auv;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;

public final class b {
    private static final String[] z;
    @Nullable
    private final c a;
    @NonNull
    private final Context b;
    @NonNull
    private final d c;

    static {
        String[] strArr = new String[5];
        String str = "\u0012j'.";
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
                        i3 = 115;
                        break;
                    case at.g /*1*/:
                        i3 = 31;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 58;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "Sk!3I\u0007z7fJ\u0012|8']\u0016lif";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0010p&*^Sq<2\u001a\u0015v=\"\u001a\u0003~0-[\u0014zhfJ\u0012|8']\u0016Q2+_N";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0010p>h\\\u0012|6$U\u001ct}\u0001\u007f'@\u0003\u000eu=Z\f\u000f~";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0015p&(^S";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public b(@NonNull Context context, @NonNull d dVar, @Nullable c cVar) {
        boolean z = e.a;
        this.b = ((Context) auv.a((Object) context)).getApplicationContext();
        this.c = (d) auv.a((Object) dVar);
        this.a = cVar;
        if (WAAppCompatActivity.c != 0) {
            e.a = !z;
        }
    }

    private Bundle c() {
        Parcelable activity = PendingIntent.getActivity(this.b, 0, new Intent(), 134217728);
        Bundle bundle = new Bundle();
        bundle.putParcelable(z[0], activity);
        return bundle;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private List b() {
        boolean z = e.a;
        List<PackageInfo> installedPackages = this.b.getPackageManager().getInstalledPackages(0);
        List arrayList = new ArrayList();
        String packageName = this.b.getPackageName();
        for (PackageInfo packageInfo : installedPackages) {
            try {
                PackageInfo packageInfo2;
                if (!packageInfo2.packageName.equals(packageName) || z) {
                    try {
                        packageInfo2 = this.b.getPackageManager().getPackageInfo(packageInfo2.packageName, 64);
                    } catch (Throwable e) {
                        Log.b(z[3] + packageInfo2.packageName, e);
                        if (!z) {
                            continue;
                        }
                    }
                    try {
                        if (f.b(packageInfo2)) {
                            arrayList.add(packageInfo2.packageName);
                        }
                        if (z) {
                            break;
                        }
                    } catch (NameNotFoundException e2) {
                        throw e2;
                    }
                }
            } catch (NameNotFoundException e22) {
                throw e22;
            }
        }
        return arrayList;
    }

    public void a() {
        boolean z = e.a;
        List<String> b = b();
        Log.d(z[1] + b.size() + z[2] + b);
        for (String a : b) {
            this.b.sendOrderedBroadcast(a(a), null, new PhoneIdResponseReceiver(this.c, this.a), null, 1, null, c());
            if (z) {
                WAAppCompatActivity.c++;
                return;
            }
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent();
        intent.setAction(z[4]);
        intent.setPackage(str);
        return intent;
    }
}
