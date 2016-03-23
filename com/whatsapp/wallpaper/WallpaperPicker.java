package com.whatsapp.wallpaper;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import com.whatsapp.CustomVelocityGallery;
import com.whatsapp.WAActivity;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.io.Serializable;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class WallpaperPicker extends WAActivity implements OnItemSelectedListener, OnClickListener {
    private static final String[] z;
    private Bitmap a;
    private s b;
    private boolean c;
    private j d;
    Resources e;
    private ImageView f;
    private ArrayList g;
    private ArrayList h;
    PackageManager i;
    private CustomVelocityGallery j;

    static {
        String[] strArr = new String[12];
        String str = "\u001d3'_/\u000b\".A\u0000\u001a;(X:\u0018";
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
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 82;
                        break;
                    case at.i /*2*/:
                        i3 = 75;
                        break;
                    case at.o /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\t=&\u001d(\u00023?@>\u001a\"eD>\u0006>;R/\u000f ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001d3'_/\u000b\".Ap\u001878\\*\u00181.l1\u0005&\u0014U0\u001f</";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u000e *D>\b>.";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000e *D>\b>.";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "5!&R3\u0006";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0005 \"V1\u001e3?Z0\u0004";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u00187/z;";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0005 \"V1\u001e3?Z0\u0004";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u000b</A0\u00036e@:\u001e&\"]8\u0019|\nc\u000f&\u001b\br\u000b#\u001d\u0005l\f/\u0006\u001fz\u0011-\u0001";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u000b</A0\u00036e@:\u001e&\"]8\u0019|\u0018v\u001c?\u0000\u0002g\u00065\u0001\u000eg\u000b#\u001c\f`";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\t=&\u001d(\u00023?@>\u001a\"eD>\u0006>;R/\u000f ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        try {
            if (this.c) {
                a(this.j.getSelectedItemPosition());
                if (CropImage.c == 0) {
                    return;
                }
            }
            finish();
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    private void a(int i) {
        Intent intent = new Intent();
        intent.putExtra(z[8], (Serializable) this.g.get(i));
        intent.putExtra(z[7], getIntent().getIntExtra(z[9], 1));
        setResult(-1, intent);
        finish();
    }

    static j a(WallpaperPicker wallpaperPicker, j jVar) {
        wallpaperPicker.d = jVar;
        return jVar;
    }

    static ArrayList d(WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.g;
    }

    protected void onDestroy() {
        try {
            super.onDestroy();
            if (this.d == null) {
                return;
            }
            if (this.d.getStatus() != Status.FINISHED) {
                this.d.cancel(true);
                this.d = null;
            }
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    static ArrayList c(WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.h;
    }

    static ImageView b(WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.f;
    }

    public WallpaperPicker() {
        this.h = new ArrayList(24);
        this.g = new ArrayList(24);
        this.c = false;
        this.e = null;
    }

    private void a() {
        a(this.e, z[2]);
    }

    static Bitmap a(WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.res.Resources r10, java.lang.String r11) {
        /*
        r9 = this;
        r8 = 1;
        r1 = com.whatsapp.wallpaper.CropImage.c;
        r0 = 2131034112; // 0x7f050000 float:1.7678732E38 double:1.052870745E-314;
        r2 = r10.getStringArray(r0);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r3 = r2.length;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r0 = 0;
    L_0x000b:
        if (r0 >= r3) goto L_0x0051;
    L_0x000d:
        r4 = r2[r0];	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r5 = z;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r6 = 5;
        r5 = r5[r6];	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r5 = r10.getIdentifier(r4, r5, r11);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        if (r5 == 0) goto L_0x004d;
    L_0x001a:
        r6 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r6.<init>();	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r4 = r6.append(r4);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r6 = z;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r7 = 6;
        r6 = r6[r7];	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r4 = r4.append(r6);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r4 = r4.toString();	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r6 = z;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r7 = 4;
        r6 = r6[r7];	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r4 = r10.getIdentifier(r4, r6, r11);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        if (r4 == 0) goto L_0x004d;
    L_0x003b:
        r6 = r9.h;	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
        r6.add(r4);	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
        r4 = r9.g;	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
        r4.add(r5);	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
    L_0x004d:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000b;
    L_0x0051:
        r0 = r9.g;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r0 = r0.size();	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        if (r0 != 0) goto L_0x006d;
    L_0x0059:
        r0 = 1;
        r9.showDialog(r0);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
    L_0x005d:
        return;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
    L_0x0060:
        r0 = move-exception;
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r9.showDialog(r8);
        goto L_0x005d;
    L_0x006d:
        r0 = r9.b;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r0.notifyDataSetChanged();	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r9.c = r8;
        goto L_0x005d;
    L_0x0075:
        r0 = move-exception;
        r9.showDialog(r8);
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.WallpaperPicker.a(android.content.res.Resources, java.lang.String):void");
    }

    protected void onResume() {
        super.onResume();
        a();
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case at.g /*1*/:
                return new Builder(this).setMessage(2131231077).setPositiveButton(2131231580, new c(this)).setNegativeButton(2131230884, new g(this)).setOnCancelListener(new q(this)).create();
            case at.i /*2*/:
                try {
                    String str;
                    if (VERSION.SDK_INT >= 14) {
                        str = z[11];
                    } else {
                        str = z[10];
                    }
                    return new Builder(this).setMessage(getString(2131231373)).setPositiveButton(getString(2131230802), new o(this, str)).setNegativeButton(getString(2131230884), new d(this)).create();
                } catch (NotFoundException e) {
                    throw e;
                }
            default:
                return null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        this.i = getPackageManager();
        setContentView(2130903293);
        this.j = (CustomVelocityGallery) findViewById(2131755844);
        this.j.setVelocityTransformer(new e(this));
        this.b = new s(this, this);
        this.j.setAdapter(this.b);
        this.j.setOnItemSelectedListener(this);
        this.j.setCallbackDuringFling(false);
        findViewById(2131755983).setOnClickListener(this);
        this.f = (ImageView) findViewById(2131755982);
        try {
            this.e = this.i.getResourcesForApplication(z[1]);
        } catch (NameNotFoundException e) {
            Log.e(z[0] + e.toString());
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    static Bitmap a(WallpaperPicker wallpaperPicker, Bitmap bitmap) {
        wallpaperPicker.a = bitmap;
        return bitmap;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        try {
            if (this.d != null) {
                if (this.d.getStatus() != Status.FINISHED) {
                    this.d.a();
                }
            }
            this.d = new j(this);
            bq.a(this.d, new Integer[]{Integer.valueOf(i)});
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }
}
