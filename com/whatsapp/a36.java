package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.fieldstats.f;
import java.util.List;
import org.v;
import org.whispersystems.at;

class a36 extends ArrayAdapter {
    private static final String z;
    final SearchFAQ a;

    static {
        char[] toCharArray = "+\u0001v\u000f\t3?f\u000e\u001a+\u0001{\u0005\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 71;
                    break;
                case at.g /*1*/:
                    i2 = 96;
                    break;
                case at.i /*2*/:
                    i2 = 15;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 124;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public a36(SearchFAQ searchFAQ, Context context, int i, List list) {
        this.a = searchFAQ;
        super(context, i, list);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        fo foVar;
        TextView textView;
        if (view == null) {
            View linearLayout = new LinearLayout(getContext());
            aam.a((LayoutInflater) getContext().getSystemService(z), 2130903262, linearLayout, true);
            if (!DialogToastActivity.f) {
                view = linearLayout;
                view.setBackgroundColor(i % 2 != 0 ? -1 : -1184275);
                foVar = (fo) getItem(i);
                textView = (TextView) view.findViewById(2131755886);
                textView.setText(foVar.d);
                textView.setOnClickListener(new asg(this, foVar));
                SearchFAQ.a(this.a, f.SUGGESTED_FAQ.getCode());
                return view;
            }
        }
        view = (LinearLayout) view;
        if (i % 2 != 0) {
        }
        view.setBackgroundColor(i % 2 != 0 ? -1 : -1184275);
        foVar = (fo) getItem(i);
        textView = (TextView) view.findViewById(2131755886);
        textView.setText(foVar.d);
        textView.setOnClickListener(new asg(this, foVar));
        SearchFAQ.a(this.a, f.SUGGESTED_FAQ.getCode());
        return view;
    }
}
