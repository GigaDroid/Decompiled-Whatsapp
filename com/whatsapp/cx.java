package com.whatsapp;

import android.view.View.OnClickListener;

class cx implements OnClickListener {
    final aee a;

    cx(aee com_whatsapp_aee) {
        this.a = com_whatsapp_aee;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r10) {
        /*
        r9 = this;
        r3 = 1;
        r1 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r10;
        r0 = (android.widget.CheckBox) r0;
        r2 = r0.isChecked();
        r0 = r10.getTag();
        r0 = (com.whatsapp.l5) r0;
        r5 = r0.p;	 Catch:{ UnknownFormatConversionException -> 0x001a }
        r5 = com.whatsapp.aup.a(r5);	 Catch:{ UnknownFormatConversionException -> 0x001a }
        if (r5 == 0) goto L_0x001c;
    L_0x0019:
        return;
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        if (r2 == 0) goto L_0x0067;
    L_0x001e:
        r5 = r9.a;	 Catch:{ UnknownFormatConversionException -> 0x00d3 }
        r5 = r5.a;	 Catch:{ UnknownFormatConversionException -> 0x00d3 }
        r5 = com.whatsapp.MultipleContactPicker.d(r5);	 Catch:{ UnknownFormatConversionException -> 0x00d3 }
        r5 = r5.size();	 Catch:{ UnknownFormatConversionException -> 0x00d3 }
        r6 = r9.a;	 Catch:{ UnknownFormatConversionException -> 0x00d3 }
        r6 = r6.a;	 Catch:{ UnknownFormatConversionException -> 0x00d3 }
        r6 = com.whatsapp.MultipleContactPicker.h(r6);	 Catch:{ UnknownFormatConversionException -> 0x00d3 }
        if (r5 != r6) goto L_0x0067;
    L_0x0034:
        r2 = r9.a;	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r2 = r2.a;	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r5 = r9.a;	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r5 = r5.a;	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r6 = r9.a;	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r6 = r6.a;	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r6 = com.whatsapp.MultipleContactPicker.k(r6);	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r5 = r5.getString(r6);	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r7 = 0;
        r8 = r9.a;	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r8 = r8.a;	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r8 = com.whatsapp.MultipleContactPicker.h(r8);	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r6[r7] = r8;	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r5 = java.lang.String.format(r5, r6);	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
        r2.f(r5);	 Catch:{ UnknownFormatConversionException -> 0x00d5 }
    L_0x0061:
        r10 = (android.widget.CheckBox) r10;
        r10.setChecked(r1);
        r2 = r1;
    L_0x0067:
        r0.e = r2;	 Catch:{ UnknownFormatConversionException -> 0x00e1 }
        r2 = r0.e;	 Catch:{ UnknownFormatConversionException -> 0x00e1 }
        if (r2 == 0) goto L_0x007c;
    L_0x006d:
        r2 = r9.a;	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
        r2 = r2.a;	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
        r2 = com.whatsapp.MultipleContactPicker.d(r2);	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
        r5 = r0.p;	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
        r2.add(r5);	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
        if (r4 == 0) goto L_0x0089;
    L_0x007c:
        r2 = r9.a;	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
        r2 = r2.a;	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
        r2 = com.whatsapp.MultipleContactPicker.d(r2);	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
        r5 = r0.p;	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
        r2.remove(r5);	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
    L_0x0089:
        r2 = r9.a;
        r2 = r2.a;
        r5 = r9.a;
        r5 = r5.a;
        r5 = com.whatsapp.MultipleContactPicker.d(r5);
        r5 = r5.size();
        com.whatsapp.MultipleContactPicker.a(r2, r5);
        r2 = r9.a;
        r2 = r2.a;
        r2 = com.whatsapp.MultipleContactPicker.i(r2);
        r5 = r2.iterator();
        r2 = r1;
    L_0x00a9:
        r1 = r5.hasNext();
        if (r1 == 0) goto L_0x00eb;
    L_0x00af:
        r1 = r5.next();
        r1 = (com.whatsapp.l5) r1;
        if (r1 == r0) goto L_0x00e9;
    L_0x00b7:
        r6 = r0.p;	 Catch:{ UnknownFormatConversionException -> 0x00e5 }
        r7 = r1.p;	 Catch:{ UnknownFormatConversionException -> 0x00e5 }
        r6 = r6.equals(r7);	 Catch:{ UnknownFormatConversionException -> 0x00e5 }
        if (r6 == 0) goto L_0x00e9;
    L_0x00c1:
        r2 = r0.e;
        r1.e = r2;
        r1 = r3;
    L_0x00c6:
        if (r4 == 0) goto L_0x00e7;
    L_0x00c8:
        if (r1 == 0) goto L_0x0019;
    L_0x00ca:
        r0 = r9.a;	 Catch:{ UnknownFormatConversionException -> 0x00d1 }
        r0.notifyDataSetChanged();	 Catch:{ UnknownFormatConversionException -> 0x00d1 }
        goto L_0x0019;
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r2 = move-exception;
        r2 = r9.a;
        r2 = r2.a;
        r5 = 2131231502; // 0x7f08030e float:1.8079087E38 double:1.0529682685E-314;
        r2.a(r5);
        goto L_0x0061;
    L_0x00e1:
        r0 = move-exception;
        throw r0;	 Catch:{ UnknownFormatConversionException -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;
    L_0x00e7:
        r2 = r1;
        goto L_0x00a9;
    L_0x00e9:
        r1 = r2;
        goto L_0x00c6;
    L_0x00eb:
        r1 = r2;
        goto L_0x00c8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cx.onClick(android.view.View):void");
    }
}
