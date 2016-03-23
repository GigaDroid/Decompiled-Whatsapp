package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.support.v7.app.AlertDialog.Builder;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import com.whatsapp.fieldstats.a;
import com.whatsapp.fieldstats.i;
import com.whatsapp.util.Log;
import com.whatsapp.util.ao;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class SetStatus extends DialogToastActivity implements tm {
    private static SetStatus o;
    static int q;
    static int s;
    static int u;
    static ArrayList v;
    private static final String[] z;
    a2e n;
    TextEmojiLabel p;
    private View r;
    private final Handler t;
    private String w;
    private final Handler x;

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, getString(2131231061));
    }

    private void b() {
        i.a(App.z(), a.STATUS_UPDATE_C, Integer.valueOf(1));
        this.x.removeMessages(0);
        if (this.w != null) {
            App.v = this.w;
            this.w = null;
            this.x.sendEmptyMessage(1);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Log.e(z[4]);
    }

    public SetStatus() {
        this.w = null;
        this.x = new kt(this, Looper.getMainLooper());
        this.t = new Handler(new r7(this));
    }

    static void a(SetStatus setStatus) {
        setStatus.f();
    }

    public ArrayList j() {
        boolean z = DialogToastActivity.f;
        ArrayList arrayList = new ArrayList();
        TypedArray obtainTypedArray = getResources().obtainTypedArray(2131689479);
        int i = 0;
        while (i < obtainTypedArray.length()) {
            arrayList.add(obtainTypedArray.getString(i));
            i++;
            if (z) {
                break;
            }
        }
        return arrayList;
    }

    public void i() {
        findViewById(2131755580).setVisibility(0);
        findViewById(2131755890).setVisibility(8);
        App.a(App.ad() + z[6], 0, new Messenger(this.t));
    }

    public void c(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
        r4 = this;
        super.onCreate(r5);
        r0 = z;
        r1 = 5;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r4.getSupportActionBar();
        r1 = 1;
        r0.setDisplayHomeAsUpEnabled(r1);
        r0 = 2130903267; // 0x7f0300e3 float:1.7413347E38 double:1.052806099E-314;
        r4.setContentView(r0);
        r0 = com.whatsapp.fieldstats.k.STATUS_VIEWS;
        com.whatsapp.nf.a(r0);
        r0 = 2131755888; // 0x7f100370 float:1.9142668E38 double:1.0532273496E-314;
        r0 = r4.findViewById(r0);
        r4.r = r0;
        r0 = com.whatsapp.App.S;
        if (r0 != 0) goto L_0x0032;
    L_0x002b:
        r4.i();
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x003c;
    L_0x0032:
        r0 = r4.r;
        r1 = new com.whatsapp.hc;
        r1.<init>(r4);
        r0.setOnClickListener(r1);
    L_0x003c:
        r0 = 2131755889; // 0x7f100371 float:1.914267E38 double:1.05322735E-314;
        r0 = r4.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r4.p = r0;
        r0 = r4.p;
        r1 = com.whatsapp.App.v;
        r0.a(r1);
        r0 = r4.c();
        if (r0 != 0) goto L_0x005a;
    L_0x0054:
        r0 = r4.j();
        v = r0;
    L_0x005a:
        r0 = 2131755893; // 0x7f100375 float:1.9142678E38 double:1.053227352E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r1 = 2131755894; // 0x7f100376 float:1.914268E38 double:1.0532273525E-314;
        r1 = r4.findViewById(r1);
        r0.setEmptyView(r1);
        r1 = new com.whatsapp.a2e;
        r2 = 2131755895; // 0x7f100377 float:1.9142682E38 double:1.053227353E-314;
        r3 = v;
        r1.<init>(r4, r4, r2, r3);
        r4.n = r1;
        r1 = r4.n;
        r0.setAdapter(r1);
        r1 = new com.whatsapp.ah;
        r1.<init>(r4);
        r0.setOnItemClickListener(r1);
        r4.registerForContextMenu(r0);
        com.whatsapp.App.b(r4);
        o = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SetStatus.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case v.m /*0*/:
                return ProgressDialog.show(this, getString(2131232082), getString(2131232081), true, false);
            case at.g /*1*/:
                return ProgressDialog.show(this, getString(2131232079), getString(2131232078), true, false);
            case at.i /*2*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131232082));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case at.o /*3*/:
                return new Builder(this).setMessage(2131231047).setPositiveButton(2131231044, new bp(this)).setNegativeButton(2131230884, null).create();
            case arj.Theme_buttonBarStyle /*50*/:
                return new aij(this, 2131230796, App.v, new l2(this), 139, 0, 2131231554);
            default:
                return super.onCreateDialog(i);
        }
    }

    public void a(String str) {
        runOnUiThread(new ale(this, str));
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterContextMenuInfo adapterContextMenuInfo = (AdapterContextMenuInfo) menuItem.getMenuInfo();
        switch (menuItem.getItemId()) {
            case at.g /*1*/:
                v.remove(adapterContextMenuInfo.position);
                u = -1;
                this.n.notifyDataSetChanged();
                d();
                break;
        }
        return true;
    }

    protected void onDestroy() {
        super.onDestroy();
        App.a((tm) this);
        if (o == this) {
            o = null;
        }
    }

    public void e(String str) {
        showDialog(2);
        this.w = str;
        if (!App.a(str, new am1(this), new a9m(this), new pt(this))) {
            f();
        }
        this.x.sendEmptyMessageDelayed(0, 32000);
    }

    static View c(SetStatus setStatus) {
        return setStatus.r;
    }

    private void f() {
        this.x.removeMessages(0);
        this.x.sendEmptyMessage(0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case v.m /*0*/:
                if (v.size() == 0) {
                    a(2131231567);
                    if (!DialogToastActivity.f) {
                        return true;
                    }
                }
                showDialog(3);
                return true;
            case 16908332:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    private boolean c() {
        Closeable objectInputStream;
        Throwable e;
        Closeable closeable;
        boolean z = DialogToastActivity.f;
        try {
            if (new File(getFilesDir(), z[1]).exists()) {
                objectInputStream = new ObjectInputStream(openFileInput(z[2]));
                try {
                    String str = (String) objectInputStream.readObject();
                    v = new ArrayList();
                    String[] split = str.split("\n");
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        String str2 = split[i];
                        if (str2.length() > 0) {
                            v.add(str2);
                        }
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    ao.a(objectInputStream);
                    return true;
                } catch (ClassNotFoundException e2) {
                    throw e2;
                } catch (IOException e3) {
                    e = e3;
                } catch (ClassNotFoundException e4) {
                    e = e4;
                    closeable = objectInputStream;
                }
            } else {
                ao.a(null);
                return false;
            }
        } catch (ClassNotFoundException e5) {
            e = e5;
            closeable = null;
            try {
                Log.c(z[0], e);
                ao.a(closeable);
                return false;
            } catch (Throwable th) {
                e = th;
                objectInputStream = closeable;
                ao.a(objectInputStream);
                throw e;
            }
        } catch (IOException e6) {
            e = e6;
            objectInputStream = null;
            try {
                Log.a(e);
                ao.a(objectInputStream);
                return false;
            } catch (Throwable th2) {
                e = th2;
                ao.a(objectInputStream);
                throw e;
            }
        } catch (Throwable th3) {
            e = th3;
            objectInputStream = null;
            ao.a(objectInputStream);
            throw e;
        }
    }

    public void d(String str) {
    }

    static void b(SetStatus setStatus) {
        setStatus.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r6 = this;
        r3 = com.whatsapp.DialogToastActivity.f;
        r2 = 0;
        r1 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x0066, all -> 0x005e }
        r0 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0066, all -> 0x005e }
        r4 = z;	 Catch:{ IOException -> 0x0066, all -> 0x005e }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0066, all -> 0x005e }
        r5 = 0;
        r0 = r0.openFileOutput(r4, r5);	 Catch:{ IOException -> 0x0066, all -> 0x005e }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0066, all -> 0x005e }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0056 }
        r2.<init>();	 Catch:{ IOException -> 0x0056 }
        r0 = v;	 Catch:{ IOException -> 0x0056 }
        r4 = r0.iterator();	 Catch:{ IOException -> 0x0056 }
    L_0x0021:
        r0 = r4.hasNext();	 Catch:{ IOException -> 0x0056 }
        if (r0 == 0) goto L_0x0039;
    L_0x0027:
        r0 = r4.next();	 Catch:{ IOException -> 0x0056 }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x0056 }
        r0 = r2.append(r0);	 Catch:{ IOException -> 0x0056 }
        r5 = "\n";
        r0.append(r5);	 Catch:{ IOException -> 0x0056 }
        if (r3 == 0) goto L_0x0021;
    L_0x0039:
        r0 = r2.length();	 Catch:{ IOException -> 0x0054 }
        r3 = 1;
        if (r0 <= r3) goto L_0x0049;
    L_0x0040:
        r0 = r2.length();	 Catch:{ IOException -> 0x0054 }
        r0 = r0 + -1;
        r2.deleteCharAt(r0);	 Catch:{ IOException -> 0x0054 }
    L_0x0049:
        r0 = r2.toString();	 Catch:{ IOException -> 0x0056 }
        r1.writeObject(r0);	 Catch:{ IOException -> 0x0056 }
        com.whatsapp.util.ao.a(r1);
    L_0x0053:
        return;
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
    L_0x0057:
        r0.printStackTrace();	 Catch:{ all -> 0x0064 }
        com.whatsapp.util.ao.a(r1);
        goto L_0x0053;
    L_0x005e:
        r0 = move-exception;
        r1 = r2;
    L_0x0060:
        com.whatsapp.util.ao.a(r1);
        throw r0;
    L_0x0064:
        r0 = move-exception;
        goto L_0x0060;
    L_0x0066:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SetStatus.d():void");
    }

    public void a() {
    }

    static void d(SetStatus setStatus) {
        setStatus.d();
    }

    public void a(Collection collection) {
    }

    public void b(String str) {
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra(z[3]);
            if (i == q) {
                v.add(0, stringExtra);
                e(stringExtra);
                return;
            }
            if (u >= 0) {
                v.remove(u);
                v.add(u, stringExtra);
            }
            if (i == s) {
                e(stringExtra);
            }
        }
    }

    static {
        String[] strArr = new String[8];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "9#\u001b+\u0014?~\r>\u0001.$\re\u0013?#\u0017+\f3+\u001f>\t5?!/\u0012(>\f";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 90;
                        break;
                    case at.g /*1*/:
                        i4 = 81;
                        break;
                    case at.i /*2*/:
                        i4 = 126;
                        break;
                    case at.o /*3*/:
                        i4 = 74;
                        break;
                    default:
                        i4 = 96;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ")%\u001f>\u0015)";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ")%\u001f>\u0015)";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ")4\n9\u0014;%\u000b9O)%\u001f>\u0015)$\u000e.\u0001.4\u001ae\u0014?<\u000e9\u0014;%\u000b9@3\"^$\u00156=";
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ")%\u001f>\u0015)~\u001d8\u0005;%\u001b";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001a\"P=\b;%\r+\u0010*\u007f\u0010/\u0014";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ")%\u001f>\u0015)";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    u = -1;
                    o = null;
                    q = 0;
                    s = 2;
                    return;
                default:
                    strArr2[i] = str;
                    str = ")%\u001f>\u0015)";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, 2131231044).setIcon(2130839512);
        return true;
    }
}
