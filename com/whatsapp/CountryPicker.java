package com.whatsapp;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

public class CountryPicker extends DialogToastListActivity {
    public static final String w;
    public static final String y;
    private static final String[] z;
    private ImageButton t;
    private TextWatcher u;
    private _z v;
    private EditText x;

    static _z c(CountryPicker countryPicker) {
        return countryPicker.v;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    finish();
                    return true;
                default:
                    return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = DialogToastActivity.f;
        Log.i(z[1]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(2130903151);
        Object arrayList = new ArrayList();
        try {
            Iterator it = u0.b().iterator();
            while (it.hasNext()) {
                i7 i7Var = (i7) it.next();
                arrayList.add(new cj(i7Var.h, String.valueOf(i7Var.c), i7Var.d, i7Var.e));
                if (z) {
                    break;
                }
            }
        } catch (IOException e) {
            Log.e(z[2]);
            arrayList.clear();
        }
        ViewGroup a = a();
        View inflate = getLayoutInflater().inflate(2130903232, a, false);
        try {
            a.addHeaderView(inflate);
            this.x = (EditText) inflate.findViewById(2131755795);
            this.x.addTextChangedListener(this.u);
            aam.a(this.x);
            aam.a(this.x, getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material), getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material));
            this.t = (ImageButton) inflate.findViewById(2131755796);
            this.t.setOnClickListener(new hv(this));
            this.v = new _z(this, 2130903152, arrayList, getIntent().getStringExtra(y), getIntent().getStringExtra(w));
            a(this.v);
            a.setOnItemClickListener(new ao5(this));
            a.setFastScrollEnabled(true);
            a.setScrollbarFadingEnabled(true);
            if (VERSION.SDK_INT >= 11) {
                a.setFastScrollAlwaysVisible(true);
                a.setScrollBarStyle(33554432);
                if (VERSION.SDK_INT >= 11) {
                    try {
                        if (App.av) {
                            try {
                                a.setVerticalScrollbarPosition(1);
                                if (!z) {
                                    return;
                                }
                            } catch (IOException e2) {
                                throw e2;
                            }
                        }
                        try {
                            a.setVerticalScrollbarPosition(2);
                            if (!z) {
                                return;
                            }
                        } catch (IOException e22) {
                            throw e22;
                        }
                    } catch (IOException e222) {
                        throw e222;
                    }
                } else {
                    return;
                }
            }
            a.setSelector(2130839767);
        } catch (IOException e2222) {
            throw e2222;
        } catch (IOException e22222) {
            throw e22222;
        }
    }

    public CountryPicker() {
        this.u = new aop(this);
    }

    static {
        Object obj = -1;
        String[] strArr = new String[3];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "xb\n{7it\u000f| ph\r:'~~\u000bg,b";
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
                        i3 = 27;
                        break;
                    case at.g /*1*/:
                        i3 = 13;
                        break;
                    case at.i /*2*/:
                        i3 = 127;
                        break;
                    case at.o /*3*/:
                        i3 = 21;
                        break;
                    default:
                        i3 = 67;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "xb\n{7it\u000f| ph\r:,un\rp\"oh_g&xh\u0016c&\u007f-6Z\u0006cn\u001ae7rb\u00115%ib\u00125\u0000tx\u0011a1b]\u0017z-~D\u0011s,";
                    obj2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    StringBuilder append = new StringBuilder().append(CountryPicker.class.getName());
                    String str2 = "5H'A\u0011ZR<Z\u0016UY-L\u001cR^0";
                    while (true) {
                        char[] toCharArray2 = str2.toCharArray();
                        i = toCharArray2.length;
                        toCharArray = toCharArray2;
                        for (int i4 = 0; i > i4; i4++) {
                            int i5;
                            char c2 = toCharArray[i4];
                            switch (i4 % 5) {
                                case v.m /*0*/:
                                    i5 = 27;
                                    break;
                                case at.g /*1*/:
                                    i5 = 13;
                                    break;
                                case at.i /*2*/:
                                    i5 = 127;
                                    break;
                                case at.o /*3*/:
                                    i5 = 21;
                                    break;
                                default:
                                    i5 = 67;
                                    break;
                            }
                            toCharArray[i4] = (char) (i5 ^ c2);
                        }
                        str2 = new String(toCharArray).intern();
                        switch (obj) {
                            case v.m /*0*/:
                                w = append.append(str2).toString();
                                return;
                            default:
                                y = append.append(str2).toString();
                                StringBuilder append2 = new StringBuilder().append(CountryPicker.class.getName());
                                str2 = "5H'A\u0011ZR<Z\u0016UY-L\u001c_D,E\u000fZT [\u0002VH";
                                append = append2;
                                obj = null;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "xb\n{7it\u000f| ph\r: ih\u001ea&";
                    i = 1;
                    strArr2 = strArr3;
                    obj2 = null;
                    break;
            }
        }
    }

    static ImageButton b(CountryPicker countryPicker) {
        return countryPicker.t;
    }

    protected void onDestroy() {
        Log.i(z[0]);
        this.x.removeTextChangedListener(this.u);
        super.onDestroy();
    }

    static EditText a(CountryPicker countryPicker) {
        return countryPicker.x;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public void onBackPressed() {
        try {
            if (!TextUtils.isEmpty(this.x.getText())) {
                this.x.setText("");
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            super.onBackPressed();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
