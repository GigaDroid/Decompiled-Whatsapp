package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class SmsDefaultAppWarning extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "lzaw/>!:p4ezff,t vh1+jy(";
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
                        i3 = 4;
                        break;
                    case at.g /*1*/:
                        i3 = 14;
                        break;
                    case at.i /*2*/:
                        i3 = 21;
                        break;
                    case at.o /*3*/:
                        i3 = 7;
                        break;
                    default:
                        i3 = 92;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "gax)+loat=t~";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "wcfc9bo`k(e~ep=v`|i;+mgb=pk";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "e`qu3mj;n2pk{sreman3j FB\u0012@ZZ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(SmsDefaultAppWarning smsDefaultAppWarning) {
        smsDefaultAppWarning.b();
    }

    static void b(SmsDefaultAppWarning smsDefaultAppWarning) {
        smsDefaultAppWarning.a();
    }

    private void a() {
        App.a((Context) this, getIntent().getData(), getString(2131232144, new Object[]{z[0]}));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[3]);
        Intent intent = new Intent(z[1]);
        intent.setData(getIntent().getData());
        ResolveInfo resolveActivity = getPackageManager().resolveActivity(intent, 0);
        if (!(resolveActivity == null || resolveActivity.activityInfo == null || !z[2].equals(resolveActivity.activityInfo.packageName))) {
            showDialog(0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        showDialog(1);
    }

    private void b() {
        App.a((Context) this, getIntent().getData(), null);
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case v.m /*0*/:
                return new Builder(this).setMessage(2131232278).setNeutralButton(2131232032, new a_k(this)).setNegativeButton(2131232039, new a_7(this)).setPositiveButton(2131232040, new gi(this)).setOnCancelListener(new aiq(this)).create();
            case at.g /*1*/:
                return new Builder(this).setMessage(2131232277).setNeutralButton(2131232032, new d7(this)).setPositiveButton(2131232040, new eq(this)).setOnCancelListener(new _o(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }
}
