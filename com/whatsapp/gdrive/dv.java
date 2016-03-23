package com.whatsapp.gdrive;

import android.content.Context;
import android.widget.SimpleAdapter;
import java.util.List;

class dv extends SimpleAdapter {
    final int a;
    final SingleChoiceListDialogFragment b;
    final boolean[] c;
    final String[] d;

    dv(SingleChoiceListDialogFragment singleChoiceListDialogFragment, Context context, List list, int i, String[] strArr, int[] iArr, boolean[] zArr, int i2, String[] strArr2) {
        this.b = singleChoiceListDialogFragment;
        this.c = zArr;
        this.a = i2;
        this.d = strArr2;
        super(context, list, i, strArr, iArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
        r9 = this;
        r8 = 2131755144; // 0x7f100088 float:1.9141159E38 double:1.053226982E-314;
        r7 = 2131624028; // 0x7f0e005c float:1.8875224E38 double:1.053162202E-314;
        r6 = 2131623958; // 0x7f0e0016 float:1.8875082E38 double:1.0531621675E-314;
        r5 = 0;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        r3 = super.getView(r10, r11, r12);
        r0 = 16908308; // 0x1020014 float:2.3877285E-38 double:8.353814E-317;
        r0 = r3.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 16908309; // 0x1020015 float:2.3877288E-38 double:8.3538146E-317;
        r1 = r3.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r4 = r9.b;
        r4 = r4.isAdded();
        if (r4 == 0) goto L_0x006a;
    L_0x002a:
        r4 = r9.c;
        if (r4 == 0) goto L_0x0050;
    L_0x002e:
        r4 = r9.c;
        r4 = r4[r10];
        if (r4 != 0) goto L_0x0050;
    L_0x0034:
        r4 = r9.b;
        r4 = r4.getResources();
        r4 = r4.getColor(r7);
        r0.setTextColor(r4);
        r4 = r9.b;
        r4 = r4.getResources();
        r4 = r4.getColor(r7);
        r1.setTextColor(r4);
        if (r2 == 0) goto L_0x006a;
    L_0x0050:
        r4 = r9.b;
        r4 = r4.getResources();
        r4 = r4.getColor(r6);
        r0.setTextColor(r4);
        r4 = r9.b;
        r4 = r4.getResources();
        r4 = r4.getColor(r6);
        r1.setTextColor(r4);
    L_0x006a:
        r4 = r1.getText();
        r4 = android.text.TextUtils.isEmpty(r4);
        if (r4 == 0) goto L_0x007b;
    L_0x0074:
        r4 = 8;
        r1.setVisibility(r4);
        if (r2 == 0) goto L_0x007e;
    L_0x007b:
        r1.setVisibility(r5);
    L_0x007e:
        r1 = r9.a;
        if (r1 < 0) goto L_0x009e;
    L_0x0082:
        r1 = r9.d;
        r4 = r9.a;
        r1 = r1[r4];
        r0 = r0.getText();
        r0 = android.text.TextUtils.equals(r1, r0);
        if (r0 == 0) goto L_0x009e;
    L_0x0092:
        r0 = r3.findViewById(r8);
        r0 = (android.widget.RadioButton) r0;
        r1 = 1;
        r0.setChecked(r1);
        if (r2 == 0) goto L_0x00a7;
    L_0x009e:
        r0 = r3.findViewById(r8);
        r0 = (android.widget.RadioButton) r0;
        r0.setChecked(r5);
    L_0x00a7:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.dv.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
