package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class Broadcasts extends DialogToastListActivity {
    private static final String[] z;
    private final a2_ t;
    private final tm u;
    private ann v;
    private final akc w;

    static {
        String[] strArr = new String[4];
        String str = "s&)Rlr55G{>74Vie1i]g<9#\u001egcy+@ob )Am<0$";
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
                        i3 = 17;
                        break;
                    case at.g /*1*/:
                        i3 = 84;
                        break;
                    case at.i /*2*/:
                        i3 = 70;
                        break;
                    case at.o /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = 8;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "s&)Rlr55G{16)Ffr1fGg19'Zf";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "s&)Rlr55G{>0#@|c;?";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "s&)Rlr55G{>74Vie1";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static ann a(Broadcasts broadcasts) {
        return broadcasts.v;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, getString(2131231020));
    }

    public void onDestroy() {
        Log.i(z[3]);
        super.onDestroy();
        this.t.a();
        App.aK.a(this.w);
        App.a(this.u);
    }

    public Broadcasts() {
        this.t = new a2_();
        this.w = new ak7(this);
        this.u = new de(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public void onCreate(Bundle bundle) {
        boolean z = false;
        Log.i(z[1]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        App.aK.b(this.w);
        App.b(this.u);
        if (App.ay != null && App.aK.E() && App.t((Context) this) == 3) {
            setContentView(2130903085);
            this.v = new ann(this);
            View a = a();
            if (VERSION.SDK_INT < 11) {
                z = true;
            }
            a.setFastScrollEnabled(z);
            if (VERSION.SDK_INT < 11) {
                a.setSelector(2130839767);
            }
            a.setScrollbarFadingEnabled(true);
            a.setAdapter(this.v);
            a.setOnItemClickListener(new aed(this));
            registerForContextMenu(a);
            return;
        }
        Log.i(z[0]);
        App.v(z[2]);
        startActivity(new Intent(this, Main.class));
        finish();
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case at.g /*1*/:
                App.b((co) ((AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag(), false);
                return true;
            default:
                return super.onContextItemSelected(menuItem);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }
}
