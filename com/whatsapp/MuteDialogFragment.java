package com.whatsapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog.Builder;
import android.view.View;
import android.widget.CheckBox;
import org.v;
import org.whispersystems.at;

public class MuteDialogFragment extends DialogFragment {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "4~D";
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
                        i3 = 94;
                        break;
                    case at.g /*1*/:
                        i3 = 23;
                        break;
                    case at.i /*2*/:
                        i3 = 32;
                        break;
                    case at.o /*3*/:
                        i3 = 30;
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
                    str = "2vSjz3bT{z-rL{F*~Op";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "4~D";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "=xM0R6vTmD.g\u007fnW;qEl@0tEm";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "4~D";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        App.l(getArguments().getString(z[0]));
    }

    public static MuteDialogFragment a(String str) {
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(z[1], str);
        muteDialogFragment.setArguments(bundle);
        return muteDialogFragment;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        int i;
        String string = getArguments().getString(z[3]);
        CharSequence[] stringArray = getResources().getStringArray(2131689491);
        int[] intArray = getResources().getIntArray(2131689492);
        Builder builder = new Builder(getActivity());
        if (qm.i(string)) {
            i = 2131231508;
        } else {
            i = 2131231507;
        }
        builder.setTitle(getString(i));
        View a = aam.a(getActivity().getLayoutInflater(), 2130903235, null, false);
        CheckBox checkBox = (CheckBox) a.findViewById(2131755802);
        int[] iArr = new int[]{App.z().getSharedPreferences(z[4], 0).getInt(z[2], 0)};
        if (iArr[0] >= stringArray.length) {
            iArr[0] = 0;
        }
        builder.setSingleChoiceItems(stringArray, iArr[0], new a5m(this, iArr)).setPositiveButton(2131231580, new a9f(this, iArr, intArray, string, checkBox));
        if (a3b.a(getActivity()).e(string)) {
            checkBox.setChecked(a3b.a(getActivity()).f(string));
        }
        builder.setNegativeButton(2131230884, new azq(this));
        builder.setView(a);
        return builder.create();
    }
}
