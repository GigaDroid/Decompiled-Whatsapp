package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.DocumentPickerActivity.SendDocumentsConfirmationDialogFragment;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class aec implements OnClickListener {
    private static final String z;
    final ArrayList a;
    final SendDocumentsConfirmationDialogFragment b;

    static {
        char[] toCharArray = ".!\u0000Y\u001d&+JB\u001c;*\n_\\*7\u0010Y\u0013a\u001c0y7\u000e\u0002".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 79;
                    break;
                case at.g /*1*/:
                    i2 = 79;
                    break;
                case at.i /*2*/:
                    i2 = 100;
                    break;
                case at.o /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.b.getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra(z, this.a);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    aec(SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment, ArrayList arrayList) {
        this.b = sendDocumentsConfirmationDialogFragment;
        this.a = arrayList;
    }
}
