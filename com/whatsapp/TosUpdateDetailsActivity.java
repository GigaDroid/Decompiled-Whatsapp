package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import com.whatsapp.util.bz;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class TosUpdateDetailsActivity extends DialogToastActivity {
    private static final String[] z;
    private Toast n;
    private a9v o;

    static {
        String[] strArr = new String[9];
        String str = ". \u0012G\u001e&*X\\\u001f;+\u0018A_*6\u0002G\u0010a\u001d#w;\n\r\"";
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
                        i3 = 79;
                        break;
                    case at.g /*1*/:
                        i3 = 78;
                        break;
                    case at.i /*2*/:
                        i3 = 118;
                        break;
                    case at.o /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 113;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ";+\u000eA^?\"\u0017\\\u001f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "':\u0002E\u0002uaYB\u00068`\u0001]\u0010;=\u0017E\u0001a-\u0019X^#+\u0011T\u001d`";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ". \u0012G\u001e&*X\\\u001f;+\u0018A_.-\u0002\\\u001e!`%p?\u000b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ". \u0012G\u001e&*X\\\u001f;+\u0018A_*6\u0002G\u0010a\u001a3m%";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = " >\u0002j\u001e::";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ";!\u0005@\u0001+/\u0002P\u0015*:\u0017\\\u001d<a\u0015G\u0014.:\u0013";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ";!\u0005@\u0001+/\u0002P\u0015*:\u0017\\\u001d<a\u0012P\u0002;<\u0019L";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\"/\u001fY\u0005 t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static Toast a(TosUpdateDetailsActivity tosUpdateDetailsActivity, Toast toast) {
        tosUpdateDetailsActivity.n = toast;
        return toast;
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        Log.i(z[7]);
        b(false);
        a(false);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (!App.a1()) {
            getSupportActionBar().setHomeAsUpIndicator(new bz(getResources().getDrawable(2130839457)));
        }
        setContentView(2130903282);
        this.o = new a9v(this);
        bq.a(this.o, new Void[0]);
        ((TextView) findViewById(2131755921)).setText(Html.fromHtml(getString(2131232162)));
        CheckBox checkBox = (CheckBox) findViewById(2131755922);
        if (getIntent().getBooleanExtra(z[6], false)) {
            z = false;
        }
        checkBox.setChecked(z);
        checkBox.setOnCheckedChangeListener(new av_(this, checkBox));
        TextView textView = (Button) findViewById(2131755915);
        a4d.a(textView);
        textView.setOnClickListener(new zx(this, checkBox));
        findViewById(2131755919).setOnClickListener(new zd(this));
    }

    public void onDestroy() {
        Log.i(z[8]);
        super.onDestroy();
        this.o.cancel(true);
    }

    static a9v a(TosUpdateDetailsActivity tosUpdateDetailsActivity, a9v com_whatsapp_a9v) {
        tosUpdateDetailsActivity.o = com_whatsapp_a9v;
        return com_whatsapp_a9v;
    }

    static a9v a(TosUpdateDetailsActivity tosUpdateDetailsActivity) {
        return tosUpdateDetailsActivity.o;
    }

    private void a() {
        Intent intent = new Intent(z[4], Uri.parse(z[1]));
        intent.putExtra(z[0], getString(2131232154));
        intent.putExtra(z[5], getString(2131232155, new Object[]{z[3]}));
        intent.setType(z[2]);
        intent.addFlags(524288);
        startActivity(Intent.createChooser(intent, null));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() != 2131755050) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            a();
            return true;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755050, 0, 2131232015).setIcon(2130839557), 2);
        return true;
    }

    static Toast b(TosUpdateDetailsActivity tosUpdateDetailsActivity) {
        return tosUpdateDetailsActivity.n;
    }
}
