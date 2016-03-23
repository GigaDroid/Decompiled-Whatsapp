package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class FaqItemActivity extends DialogToastActivity {
    private static final String[] z;
    private long n;
    private long o;
    private long p;
    private int q;

    static {
        String[] strArr = new String[10];
        String str = "-UkwD\u0006Nv{M\u0006IosF-";
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
                        i3 = 89;
                        break;
                    case at.g /*1*/:
                        i3 = 58;
                        break;
                    case at.i /*2*/:
                        i3 = 31;
                        break;
                    case at.o /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 40;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "-UkwD\u0006Nv{M\u0006IosF-";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "8Hk\u007fK5_@\u007fL";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "-_gb\u00071Nrz";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "-SkzM";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ",Hs";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ":UqbM7N";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\fnY;\u0010";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "8Hk\u007fK5_@\u007fL";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "8Hk\u007fK5_@\u007fL";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.p = System.currentTimeMillis();
        this.n += this.p - this.o;
        this.o = System.currentTimeMillis();
        setResult(-1, new Intent().putExtra(z[1], this.q).putExtra(z[0], this.n));
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onBackPressed() {
        this.p = System.currentTimeMillis();
        this.n += this.p - this.o;
        this.o = System.currentTimeMillis();
        setResult(-1, new Intent().putExtra(z[3], this.q).putExtra(z[2], this.n));
        super.onBackPressed();
        overridePendingTransition(2130968592, 2130968595);
    }

    public void onPause() {
        super.onPause();
        this.p = System.currentTimeMillis();
        this.n += this.p - this.o;
        this.o = System.currentTimeMillis();
    }

    public void onResume() {
        super.onResume();
        this.o = System.currentTimeMillis();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                overridePendingTransition(2130968592, 2130968595);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(2130903182);
        getSupportActionBar().setTitle(getIntent().getStringExtra(z[5]));
        String stringExtra = getIntent().getStringExtra(z[7]);
        ((WebView) findViewById(2131755664)).loadDataWithBaseURL(getIntent().getStringExtra(z[6]), stringExtra, z[4], z[8], null);
        this.q = getIntent().getIntExtra(z[9], -1);
        this.n = 0;
    }
}
