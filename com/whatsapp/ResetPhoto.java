package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.appcompat.R;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class ResetPhoto extends WAFragmentActivity {
    private static final String[] z;

    public class ConfirmDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "\bd\u0010}\u001f\u0003j\t \t\u001b{S:\u0006\u001fn\u0013'F\nh\t:\u0007\u0005%/\u0016;._\"\u0014:$^-\f8#D)\u001c".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i2 = 11;
                        break;
                    case at.i /*2*/:
                        i2 = 125;
                        break;
                    case at.o /*3*/:
                        i2 = 83;
                        break;
                    default:
                        i2 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity(), R.style.Theme_AppCompat_Light_Dialog_Alert).setMessage(getString(z.equals(getActivity().getIntent().getAction()) ? 2131231823 : 2131231827)).setCancelable(true).setNegativeButton(2131230884, new as5(this)).setPositiveButton(2131231817, new a5d(this)).create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            Activity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "8@HZ03NQ\u0007&+_\u000b\u001d)/JK\u0000i:LQ\u001d(5\u0001w1\n\u0014y`+\u0014\u0018}`1\t\bgj ";
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
                        i3 = 91;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 37;
                        break;
                    case at.o /*3*/:
                        i3 = 116;
                        break;
                    default:
                        i3 = 71;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "2\\z\u0006\"(JQ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ")JV\u00113+GJ\u0000(tK@\u00073)@\\";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ")JV\u00113+GJ\u0000(tLW\u0011&/J";
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
        if (z[0].equals(getIntent().getAction())) {
            Intent intent = new Intent();
            intent.putExtra(z[2], true);
            setResult(-1, intent);
            finish();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        if (bundle == null) {
            new ConfirmDialogFragment().show(getSupportFragmentManager(), null);
        }
    }
}
