package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.e2;
import com.google.e5;
import com.whatsapp.util.Log;
import java.util.List;
import org.v;
import org.whispersystems.at;

class a2k extends ArrayAdapter {
    private static final String[] z;
    final BlockList a;

    static {
        String[] strArr = new String[3];
        String str = "=0'1t%\u000e70g=0*;s";
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
                        i3 = 81;
                        break;
                    case at.g /*1*/:
                        i3 = 81;
                        break;
                    case at.i /*2*/:
                        i3 = 94;
                        break;
                    case at.o /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = 1;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "3=1=j=8-*.4#,1s~";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0004\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        CharSequence s;
        l5 l5Var = (l5) getItem(i);
        if (view == null) {
            View linearLayout = new LinearLayout(getContext());
            aam.a((LayoutInflater) getContext().getSystemService(z[0]), 2130903109, linearLayout, true);
            linearLayout.findViewById(2131755476).setVisibility(8);
            if (!DialogToastActivity.f) {
                view = linearLayout;
                BlockList.a(this.a).b(l5Var, (ImageView) view.findViewById(2131755325));
                textView = (TextEmojiLabel) view.findViewById(2131755475);
                a4d.a(textView);
                textView.setContact(l5Var);
                textView = (TextView) view.findViewById(2131755477);
                a4d.b(textView);
                s = l5Var.s();
                e2 a = e2.a();
                s = a.a(a.b((String) s, z[1]), e5.INTERNATIONAL);
                textView.setText(s);
                return view;
            }
        }
        view = (LinearLayout) view;
        BlockList.a(this.a).b(l5Var, (ImageView) view.findViewById(2131755325));
        textView = (TextEmojiLabel) view.findViewById(2131755475);
        a4d.a(textView);
        textView.setContact(l5Var);
        textView = (TextView) view.findViewById(2131755477);
        a4d.b(textView);
        s = l5Var.s();
        try {
            e2 a2 = e2.a();
            s = a2.a(a2.b((String) s, z[1]), e5.INTERNATIONAL);
        } catch (Throwable e) {
            Log.c(z[2] + s, e);
        }
        textView.setText(s);
        return view;
    }

    public a2k(BlockList blockList, Context context, int i, List list) {
        this.a = blockList;
        super(context, i, list);
    }
}
