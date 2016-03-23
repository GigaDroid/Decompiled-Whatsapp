package com.whatsapp.gdrive;

import android.app.Activity;
import android.support.v4.app.DialogFragment;
import android.support.v7.appcompat.R;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class PromptDialogFragment extends DialogFragment {
    private static final String[] z;
    cg b;

    static {
        String[] strArr = new String[16];
        String str = "Lr\r;FLv\u00158^\tr\u001d&FLO\n'_\u001ck<!S\u0000p\u001f\u000b^\u0005|\u0013\u0004[\u001fk\u001d&W\u001e";
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
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 31;
                        break;
                    case at.i /*2*/:
                        i3 = 120;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 50;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0018v\f$W";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0001z\u000b;S\u000bz";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0002z\u001f)F\u0005i\u001d\u0017P\u0019k\f'\\";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000f~\u0016+W\u0000~\u001a$W";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001cp\u000b!F\u0005i\u001d\u0017P\u0019k\f'\\";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\bv\u0019$]\u000b@\u0011,\u0012\u001fw\u0017=^\b?\u001a-\u0012\u001cm\u0017>[\bz\u001cf";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0002z\r<@\rs'*G\u0018k\u0017&";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0018v\f$W";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\bv\u0019$]\u000b@\u0011,";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0001z\u000b;S\u000bz";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u000f~\u0016+W\u0000~\u001a$W";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0002z\r<@\rs'*G\u0018k\u0017&";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0002z\u001f)F\u0005i\u001d\u0017P\u0019k\f'\\";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\bv\u0019$]\u000b@\u0011,";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001cp\u000b!F\u0005i\u001d\u0017P\u0019k\f'\\";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
        r9 = this;
        r6 = 1;
        r2 = 8;
        r3 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = 2130903050; // 0x7f03000a float:1.7412907E38 double:1.0528059916E-314;
        r1 = 0;
        r4 = r10.inflate(r0, r11, r1);
        r5 = r9.getArguments();
        r0 = z;	 Catch:{ ClassCastException -> 0x0028 }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ ClassCastException -> 0x0028 }
        r0 = r5.containsKey(r0);	 Catch:{ ClassCastException -> 0x0028 }
        if (r0 != 0) goto L_0x002a;
    L_0x001d:
        r0 = new java.lang.IllegalStateException;	 Catch:{ ClassCastException -> 0x0028 }
        r1 = z;	 Catch:{ ClassCastException -> 0x0028 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ ClassCastException -> 0x0028 }
        r0.<init>(r1);	 Catch:{ ClassCastException -> 0x0028 }
        throw r0;	 Catch:{ ClassCastException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = r9.getDialog();
        r0 = r0.getWindow();
        r0.requestFeature(r6);
        r0 = 16908294; // 0x1020006 float:2.3877246E-38 double:8.353807E-317;
        r0 = r4.findViewById(r0);
        r0.setVisibility(r2);
        r0 = 2131755139; // 0x7f100083 float:1.9141149E38 double:1.0532269795E-314;
        r0 = r4.findViewById(r0);
        r0.setVisibility(r2);
        r0 = z;
        r1 = 15;
        r0 = r0[r1];
        r6 = r5.getInt(r0);
        r0 = z;	 Catch:{ ClassCastException -> 0x016d }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ ClassCastException -> 0x016d }
        r0 = r5.containsKey(r0);	 Catch:{ ClassCastException -> 0x016d }
        if (r0 == 0) goto L_0x0076;
    L_0x005f:
        r0 = 2131755133; // 0x7f10007d float:1.9141137E38 double:1.0532269766E-314;
        r0 = r4.findViewById(r0);	 Catch:{ ClassCastException -> 0x016f }
        r0 = (android.widget.TextView) r0;	 Catch:{ ClassCastException -> 0x016f }
        r1 = z;	 Catch:{ ClassCastException -> 0x016f }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ ClassCastException -> 0x016f }
        r1 = r5.getString(r1);	 Catch:{ ClassCastException -> 0x016f }
        r0.setText(r1);	 Catch:{ ClassCastException -> 0x016f }
        if (r3 == 0) goto L_0x0082;
    L_0x0076:
        r0 = 2131755131; // 0x7f10007b float:1.9141133E38 double:1.0532269756E-314;
        r0 = r4.findViewById(r0);	 Catch:{ ClassCastException -> 0x016f }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ClassCastException -> 0x016f }
    L_0x0082:
        r0 = z;	 Catch:{ ClassCastException -> 0x0171 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ ClassCastException -> 0x0171 }
        r0 = r5.containsKey(r0);	 Catch:{ ClassCastException -> 0x0171 }
        if (r0 == 0) goto L_0x00a5;
    L_0x008d:
        r0 = 16908299; // 0x102000b float:2.387726E-38 double:8.3538097E-317;
        r0 = r4.findViewById(r0);	 Catch:{ ClassCastException -> 0x0173 }
        r0 = (android.widget.TextView) r0;	 Catch:{ ClassCastException -> 0x0173 }
        r1 = z;	 Catch:{ ClassCastException -> 0x0173 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ ClassCastException -> 0x0173 }
        r1 = r5.getString(r1);	 Catch:{ ClassCastException -> 0x0173 }
        r0.setText(r1);	 Catch:{ ClassCastException -> 0x0173 }
        if (r3 == 0) goto L_0x00b1;
    L_0x00a5:
        r0 = 16908299; // 0x102000b float:2.387726E-38 double:8.3538097E-317;
        r0 = r4.findViewById(r0);	 Catch:{ ClassCastException -> 0x0173 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ClassCastException -> 0x0173 }
    L_0x00b1:
        r0 = 16908313; // 0x1020019 float:2.38773E-38 double:8.3538166E-317;
        r0 = r4.findViewById(r0);
        r0 = (android.support.v7.widget.AppCompatButton) r0;
        r1 = 16908314; // 0x102001a float:2.3877302E-38 double:8.353817E-317;
        r1 = r4.findViewById(r1);
        r1 = (android.support.v7.widget.AppCompatButton) r1;
        r2 = 16908315; // 0x102001b float:2.3877305E-38 double:8.3538176E-317;
        r2 = r4.findViewById(r2);
        r2 = (android.support.v7.widget.AppCompatButton) r2;
        r7 = 1;
        r0.setSupportAllCaps(r7);	 Catch:{ ClassCastException -> 0x0175 }
        r7 = 1;
        r1.setSupportAllCaps(r7);	 Catch:{ ClassCastException -> 0x0175 }
        r7 = 1;
        r2.setSupportAllCaps(r7);	 Catch:{ ClassCastException -> 0x0175 }
        r7 = z;	 Catch:{ ClassCastException -> 0x0175 }
        r8 = 13;
        r7 = r7[r8];	 Catch:{ ClassCastException -> 0x0175 }
        r7 = r5.containsKey(r7);	 Catch:{ ClassCastException -> 0x0175 }
        if (r7 == 0) goto L_0x00fb;
    L_0x00e4:
        r7 = z;	 Catch:{ ClassCastException -> 0x0177 }
        r8 = 8;
        r7 = r7[r8];	 Catch:{ ClassCastException -> 0x0177 }
        r7 = r5.getString(r7);	 Catch:{ ClassCastException -> 0x0177 }
        r2.setText(r7);	 Catch:{ ClassCastException -> 0x0177 }
        r7 = new com.whatsapp.gdrive.em;	 Catch:{ ClassCastException -> 0x0177 }
        r7.<init>(r9, r6);	 Catch:{ ClassCastException -> 0x0177 }
        r2.setOnClickListener(r7);	 Catch:{ ClassCastException -> 0x0177 }
        if (r3 == 0) goto L_0x0100;
    L_0x00fb:
        r7 = 8;
        r2.setVisibility(r7);	 Catch:{ ClassCastException -> 0x0177 }
    L_0x0100:
        r2 = z;	 Catch:{ ClassCastException -> 0x0179 }
        r7 = 6;
        r2 = r2[r7];	 Catch:{ ClassCastException -> 0x0179 }
        r2 = r5.containsKey(r2);	 Catch:{ ClassCastException -> 0x0179 }
        if (r2 == 0) goto L_0x0121;
    L_0x010b:
        r2 = z;	 Catch:{ ClassCastException -> 0x017b }
        r7 = 1;
        r2 = r2[r7];	 Catch:{ ClassCastException -> 0x017b }
        r2 = r5.getString(r2);	 Catch:{ ClassCastException -> 0x017b }
        r0.setText(r2);	 Catch:{ ClassCastException -> 0x017b }
        r2 = new com.whatsapp.gdrive.cb;	 Catch:{ ClassCastException -> 0x017b }
        r2.<init>(r9, r6);	 Catch:{ ClassCastException -> 0x017b }
        r0.setOnClickListener(r2);	 Catch:{ ClassCastException -> 0x017b }
        if (r3 == 0) goto L_0x0126;
    L_0x0121:
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ ClassCastException -> 0x017b }
    L_0x0126:
        r0 = z;	 Catch:{ ClassCastException -> 0x017d }
        r2 = 14;
        r0 = r0[r2];	 Catch:{ ClassCastException -> 0x017d }
        r0 = r5.containsKey(r0);	 Catch:{ ClassCastException -> 0x017d }
        if (r0 == 0) goto L_0x0148;
    L_0x0132:
        r0 = z;	 Catch:{ ClassCastException -> 0x017f }
        r2 = 4;
        r0 = r0[r2];	 Catch:{ ClassCastException -> 0x017f }
        r0 = r5.getString(r0);	 Catch:{ ClassCastException -> 0x017f }
        r1.setText(r0);	 Catch:{ ClassCastException -> 0x017f }
        r0 = new com.whatsapp.gdrive.bw;	 Catch:{ ClassCastException -> 0x017f }
        r0.<init>(r9, r6);	 Catch:{ ClassCastException -> 0x017f }
        r1.setOnClickListener(r0);	 Catch:{ ClassCastException -> 0x017f }
        if (r3 == 0) goto L_0x014d;
    L_0x0148:
        r0 = 8;
        r1.setVisibility(r0);	 Catch:{ ClassCastException -> 0x017f }
    L_0x014d:
        r0 = z;	 Catch:{ ClassCastException -> 0x0181 }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ ClassCastException -> 0x0181 }
        r0 = r5.containsKey(r0);	 Catch:{ ClassCastException -> 0x0181 }
        if (r0 == 0) goto L_0x0169;
    L_0x0159:
        r0 = r9.getDialog();	 Catch:{ ClassCastException -> 0x0181 }
        r1 = z;	 Catch:{ ClassCastException -> 0x0181 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ ClassCastException -> 0x0181 }
        r1 = r5.getBoolean(r1);	 Catch:{ ClassCastException -> 0x0181 }
        r0.setCanceledOnTouchOutside(r1);	 Catch:{ ClassCastException -> 0x0181 }
    L_0x0169:
        r9.a(r4);
        return r4;
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassCastException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;
    L_0x0171:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassCastException -> 0x0173 }
    L_0x0173:
        r0 = move-exception;
        throw r0;
    L_0x0175:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassCastException -> 0x0177 }
    L_0x0177:
        r0 = move-exception;
        throw r0;
    L_0x0179:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassCastException -> 0x017b }
    L_0x017b:
        r0 = move-exception;
        throw r0;
    L_0x017d:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassCastException -> 0x017f }
    L_0x017f:
        r0 = move-exception;
        throw r0;
    L_0x0181:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.PromptDialogFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (cg) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + z[0]);
        }
    }

    private void a(View view) {
        boolean z = GoogleDriveService.c;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.buttonPanel);
        Button button = (Button) linearLayout.findViewById(16908313);
        Button button2 = (Button) linearLayout.findViewById(16908314);
        Button button3 = (Button) linearLayout.findViewById(16908315);
        float paddingLeft = 0.0f + ((float) (linearLayout.getPaddingLeft() + linearLayout.getPaddingRight()));
        Button[] buttonArr = new Button[]{button, button2, button3};
        int length = buttonArr.length;
        float f = paddingLeft;
        int i = 0;
        while (i < length) {
            Button button4 = buttonArr[i];
            try {
                if (button4.getVisibility() == 0 || button4.getVisibility() == 4) {
                    f += ((float) button4.getPaddingRight()) + (button4.getPaint().measureText(button4.getText().toString()) + ((float) button4.getPaddingLeft()));
                }
                i++;
                if (z) {
                    break;
                }
            } catch (ClassCastException e) {
                throw e;
            }
        }
        if (f >= ((float) getDialog().getWindow().getWindowManager().getDefaultDisplay().getWidth())) {
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            button.setLayoutParams(layoutParams);
            button2.setLayoutParams(layoutParams);
            button3.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            linearLayout.removeAllViews();
            linearLayout.addView(button);
            linearLayout.addView(button2);
            linearLayout.addView(button3);
        }
    }
}
