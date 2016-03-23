package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.TextView;
import com.whatsapp.util.ah;
import de.greenrobot.event.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.v;
import org.whispersystems.at;

public class BlockList extends DialogToastListActivity implements tm {
    private static final String[] z;
    private a2_ t;
    private ArrayList u;
    private a2k v;

    static {
        String[] strArr = new String[3];
        String str = "\u000f\u000b\u0010[x\b\u0003 Tz\u001e\u0013";
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
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 127;
                        break;
                    case at.o /*3*/:
                        i3 = 56;
                        break;
                    default:
                        i3 = 19;
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
                    str = "\u000e\b\u0011Lr\u000e\u0013";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000f\u000b\u0010[x2\u0004\u0010Vg\f\u0004\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(2130903082);
        b();
        f();
        this.v = new a2k(this, this, 2130903109, this.u);
        a(this.v);
        a().setEmptyView(findViewById(2131755346));
        registerForContextMenu(a());
        a().setOnItemClickListener(new aqm(this));
        App.b((tm) this);
        h.b().e(this);
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z = DialogToastActivity.f;
        switch (menuItem.getItemId()) {
            case v.m /*0*/:
                Intent intent = new Intent(this, ContactPicker.class);
                StringBuilder stringBuilder = new StringBuilder();
                Iterator it = this.u.iterator();
                while (it.hasNext()) {
                    stringBuilder.append(((l5) it.next()).p).append(",");
                    if (z) {
                        intent.putExtra(z[1], true);
                        intent.putExtra(z[0], stringBuilder.toString());
                        startActivityForResult(intent, 3);
                        break;
                    }
                }
                intent.putExtra(z[1], true);
                intent.putExtra(z[0], stringBuilder.toString());
                startActivityForResult(intent, 3);
            case 16908332:
                finish();
                break;
        }
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231426).setIcon(2130839422), 2);
        return super.onCreateOptionsMenu(menu);
    }

    public void a(Collection collection) {
        d();
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        l5 l5Var = (l5) a().getItemAtPosition(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        try {
            switch (menuItem.getItemId()) {
                case v.m /*0*/:
                    aup.a(this, false, l5Var.p);
                    return true;
                default:
                    return super.onContextItemSelected(menuItem);
            }
        } catch (NoSuchElementException e) {
            throw e;
        }
        throw e;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 3) {
            try {
                aup.a(this, true, intent.getStringExtra(z[2]));
            } catch (NoSuchElementException e) {
                throw e;
            }
        }
    }

    public void onEvent(az7 com_whatsapp_az7) {
        d();
        f();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        l5 l5Var = (l5) a().getItemAtPosition(((AdapterContextMenuInfo) contextMenuInfo).position);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, String.format(getString(2131230843), new Object[]{l5Var.a((Context) this)}));
    }

    public BlockList() {
        this.u = new ArrayList();
        this.t = new a2_();
    }

    public void d(String str) {
        d();
    }

    public void b(String str) {
    }

    public void c(String str) {
    }

    private void f() {
        TextView textView = (TextView) findViewById(2131755347);
        try {
            if (aup.d()) {
                textView.setText(ah.a(getResources().getString(2131230841), getResources().getDrawable(2130839453), textView.getPaint()));
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            textView.setText(2131231518);
        } catch (NoSuchElementException e) {
            throw e;
        } catch (NoSuchElementException e2) {
            throw e2;
        }
    }

    public void a() {
        d();
    }

    static a2_ a(BlockList blockList) {
        return blockList.t;
    }

    public void a(String str) {
        d();
    }

    public void onDestroy() {
        super.onDestroy();
        this.t.a();
        App.a((tm) this);
        h.b().c(this);
    }

    private void b() {
        boolean z = DialogToastActivity.f;
        this.u.clear();
        Enumeration keys = aup.f().keys();
        while (keys.hasMoreElements()) {
            try {
                String str = (String) keys.nextElement();
                l5 b = App.as.b(str);
                if (b != null) {
                    this.u.add(b);
                    if (!z) {
                    }
                }
                this.u.add(new l5(str));
            } catch (NoSuchElementException e) {
                throw e;
            } catch (NoSuchElementException e2) {
                throw e2;
            } catch (NoSuchElementException e3) {
                if (z) {
                    break;
                }
            }
        }
        Collections.sort(this.u, new a3d(getApplicationContext()));
    }

    private void d() {
        b();
        this.v.notifyDataSetChanged();
    }
}
