package com.whatsapp.preference;

import android.content.Context;
import android.os.Build.VERSION;
import android.preference.Preference;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.aam;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class WaPreference extends Preference {
    private static final String[] z;
    private int a;

    static {
        String[] strArr = new String[4];
        String str = "\u000f/\rd\u001eHt\nwL\u00026\u0018g\n\u00065\u001dfK\u000e?WwK\nt\u0018dOH)\u001cg\u000b\u00065\u001dfK\u000e?";
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
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 91;
                        break;
                    case at.i /*2*/:
                        i3 = 121;
                        break;
                    case at.o /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 36;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000f/\rd\u001eHt\nwL\u00026\u0018g\n\u00065\u001dfK\u000e?WwK\nt\u0018dOH)\u001cg\u000b\u00065\u001dfK\u000e?";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u000e8\u0016z";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000e8\u0016z";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static View b(View view) {
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextColor(view.getContext().getResources().getColorStateList(R.color.abc_primary_text_material_light));
        }
        return view;
    }

    protected View onCreateView(ViewGroup viewGroup) {
        return b(a(super.onCreateView(viewGroup)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onBindView(android.view.View r4) {
        /*
        r3 = this;
        r2 = 0;
        super.onBindView(r4);
        r0 = r3.a;
        if (r0 == 0) goto L_0x003d;
    L_0x0008:
        r0 = 16908310; // 0x1020016 float:2.387729E-38 double:8.353815E-317;
        r0 = r4.findViewById(r0);
        if (r0 == 0) goto L_0x003d;
    L_0x0011:
        r1 = r0 instanceof android.widget.TextView;
        if (r1 == 0) goto L_0x003d;
    L_0x0015:
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.App.a1();
        if (r1 == 0) goto L_0x0026;
    L_0x001d:
        r1 = r3.a;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r2, r2);
        r1 = com.whatsapp.preference.WaListPreference.a;
        if (r1 == 0) goto L_0x002b;
    L_0x0026:
        r1 = r3.a;
        r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r1, r2);
    L_0x002b:
        r1 = r3.getContext();
        r1 = r1.getResources();
        r2 = 2131427534; // 0x7f0b00ce float:1.8476687E38 double:1.053065121E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r0.setCompoundDrawablePadding(r1);
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.preference.WaPreference.onBindView(android.view.View):void");
    }

    public WaPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (VERSION.SDK_INT < 11 && attributeSet != null) {
            this.a = attributeSet.getAttributeResourceValue(z[2], z[3], 0);
        }
    }

    public WaPreference(Context context) {
        super(context);
    }

    public WaPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (VERSION.SDK_INT < 11 && attributeSet != null) {
            this.a = attributeSet.getAttributeResourceValue(z[0], z[1], 0);
        }
    }

    public static View a(View view) {
        aam.a(view);
        if (!App.a1()) {
            View findViewById = view.findViewById(16908310);
            if (findViewById != null) {
                findViewById.getLayoutParams().width = -1;
            }
            findViewById = view.findViewById(16908304);
            if (findViewById != null) {
                findViewById.getLayoutParams().width = -1;
            }
        }
        return view;
    }
}
