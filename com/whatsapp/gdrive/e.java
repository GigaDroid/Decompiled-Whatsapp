package com.whatsapp.gdrive;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class e implements OnClickListener {
    final int a;
    final String[] b;
    final SingleChoiceListDialogFragment c;
    final String d;
    final boolean[] e;

    e(SingleChoiceListDialogFragment singleChoiceListDialogFragment, boolean[] zArr, int i, String[] strArr, String str) {
        this.c = singleChoiceListDialogFragment;
        this.e = zArr;
        this.a = i;
        this.b = strArr;
        this.d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.e == null || this.e[i]) {
            SingleChoiceListDialogFragment.a(this.c).b(this.a, i, this.b);
            dialogInterface.dismiss();
            if (!GoogleDriveService.c) {
                return;
            }
        }
        if (this.d != null) {
            Toast.makeText(this.c.getContext(), this.d, 0).show();
        }
    }
}
