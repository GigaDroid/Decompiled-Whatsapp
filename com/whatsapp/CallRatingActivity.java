package com.whatsapp;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.Pair;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.v;
import org.whispersystems.at;

public class CallRatingActivity extends WAAppCompatActivity {
    private static int f;
    private static int i;
    private static CallRatingActivity l;
    public static String m;
    public static String n;
    private static final String[] z;
    private boolean d;
    private TextView e;
    private LinearLayout g;
    private LinearLayout h;
    private View j;
    private Integer k;
    private RatingBar o;
    private Events$Call p;
    private EditText q;

    private void b() {
        boolean z = false;
        int rating = (int) this.o.getRating();
        String trim = this.q.getText().toString().trim();
        View view = this.j;
        if (rating > 0 || trim.codePointCount(0, trim.length()) >= i) {
            z = true;
        }
        view.setEnabled(z);
    }

    static Events$Call c(CallRatingActivity callRatingActivity) {
        return callRatingActivity.p;
    }

    static TextView a(CallRatingActivity callRatingActivity) {
        return callRatingActivity.e;
    }

    static EditText g(CallRatingActivity callRatingActivity) {
        return callRatingActivity.q;
    }

    static {
        Object obj = -1;
        String[] strArr = new String[2];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "\u0011\u0004n{t\u0013\u0011kya\u0013\u0006v~p\u001b\u0011{8e\u0000\u0000ccc";
        Object obj2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 114;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.i /*2*/:
                        i3 = 2;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 6;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    String str2 = "\u0017\u0013gyr";
                    while (true) {
                        char[] toCharArray2 = str2.toCharArray();
                        i = toCharArray2.length;
                        toCharArray = toCharArray2;
                        for (int i4 = 0; i > i4; i4++) {
                            int i5;
                            char c2 = toCharArray[i4];
                            switch (i4 % 5) {
                                case v.m /*0*/:
                                    i5 = 114;
                                    break;
                                case at.g /*1*/:
                                    i5 = arj.Theme_buttonStyleSmall;
                                    break;
                                case at.i /*2*/:
                                    i5 = 2;
                                    break;
                                case at.o /*3*/:
                                    i5 = 23;
                                    break;
                                default:
                                    i5 = 6;
                                    break;
                            }
                            toCharArray[i4] = (char) (i5 ^ c2);
                        }
                        str2 = new String(toCharArray).intern();
                        switch (obj) {
                            case v.m /*0*/:
                                m = str2;
                                i = 3;
                                f = 1024;
                                return;
                            default:
                                n = str2;
                                str2 = "\u0007\u0015nxg\u0016#krj\u00166vvr";
                                obj = null;
                        }
                    }
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0011\u0004n{t\u0013\u0011kya\u0013\u0006v~p\u001b\u0011{8b\u0017\u0016vei\u000b";
                    obj2 = null;
            }
        }
    }

    static RatingBar h(CallRatingActivity callRatingActivity) {
        return callRatingActivity.o;
    }

    static LinearLayout d(CallRatingActivity callRatingActivity) {
        return callRatingActivity.g;
    }

    static Integer a(CallRatingActivity callRatingActivity, Integer num) {
        callRatingActivity.k = num;
        return num;
    }

    public static void a() {
        if (l != null) {
            App.p.M().post(new arf());
        }
    }

    static CallRatingActivity c() {
        return l;
    }

    static Integer b(CallRatingActivity callRatingActivity) {
        return callRatingActivity.k;
    }

    protected void onCreate(Bundle bundle) {
        boolean z = DialogToastActivity.f;
        Log.i(z[0]);
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131624052)));
        getWindow().addFlags(2621440);
        if (getIntent().getBundleExtra(n) != null) {
            this.p = new Events$Call();
            nf.a(this.p, getIntent().getBundleExtra(n));
            this.p.userRating = Double.valueOf(0.0d);
            this.d = getIntent().getBooleanExtra(m, false);
        }
        setContentView(aam.a(getLayoutInflater(), 2130903087, null, false));
        this.q = (EditText) findViewById(2131755365);
        this.o = (RatingBar) findViewById(2131755368);
        this.e = (TextView) findViewById(2131755367);
        this.j = findViewById(2131755370);
        this.g = (LinearLayout) findViewById(2131755366);
        this.h = (LinearLayout) findViewById(2131755358);
        this.j.setEnabled(false);
        this.o.setOnRatingBarChangeListener(new jl(this));
        findViewById(2131755369).setOnClickListener(new yw(this));
        List arrayList = new ArrayList();
        arrayList.add(new Pair(Integer.valueOf(0), Integer.valueOf(2131230869)));
        arrayList.add(new Pair(Integer.valueOf(1), Integer.valueOf(2131230870)));
        arrayList.add(new Pair(Integer.valueOf(2), Integer.valueOf(2131230871)));
        Collections.shuffle(arrayList);
        int[] iArr = new int[]{2131755359, 2131755361, 2131755363};
        int[] iArr2 = new int[]{2131755360, 2131755362, 2131755364};
        int i = 0;
        while (i < iArr.length) {
            TextView textView = (TextView) findViewById(iArr2[i]);
            textView.setText(((Integer) ((Pair) arrayList.get(i)).second).intValue());
            textView.setTag(Integer.valueOf(iArr[i]));
            textView.setOnClickListener(new ard(this));
            CheckBox checkBox = (CheckBox) findViewById(iArr[i]);
            checkBox.setTag(((Pair) arrayList.get(i)).first);
            checkBox.setOnClickListener(new ii(this));
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        this.j.setOnClickListener(new ye(this));
        this.q.setFilters(new InputFilter[]{new aes(f)});
        this.q.addTextChangedListener(new hm(this, this.q, null, f));
        l = this;
    }

    static void e(CallRatingActivity callRatingActivity) {
        callRatingActivity.b();
    }

    static LinearLayout f(CallRatingActivity callRatingActivity) {
        return callRatingActivity.h;
    }

    public void onDestroy() {
        Log.i(z[1]);
        super.onDestroy();
        l = null;
        nf.a(App.z(), this.p, this.d);
    }
}
