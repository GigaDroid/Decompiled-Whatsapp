package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.fieldstats.co;
import com.whatsapp.fieldstats.k;
import com.whatsapp.util.Log;
import java.util.Collection;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class NewGroup extends DialogToastActivity {
    private static final String[] z;
    private EditText n;
    private l5 o;
    private ImageView p;
    private a23 q;
    private TextView r;
    private k3 s;

    static {
        String[] strArr = new String[12];
        String str = "\u000f\n\u0006/9\u000e\u001a\u0001g/\u0004\u001c\u0005:$\u0018";
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
                        i3 = 97;
                        break;
                    case at.g /*1*/:
                        i3 = 111;
                        break;
                    case at.i /*2*/:
                        i3 = 113;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 75;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0004\u0001\u0005:2>\u001f\u001e!%\u0015";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u000f\n\u0006/9\u000e\u001a\u0001g(\u0013\n\u0010<.";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u000f\n\u0006/9\u000e\u001a\u0001g(\u0013\u0000\u00018#\u000e\u001b\u001e";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000f\n\u0006/9\u000e\u001a\u0001g9\u0004\u001c\u0014<;\t\u0000\u0005'";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\b\u001c.:.\u0012\n\u0005";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000f\n\u0006/9\u000e\u001a\u0001g;\u0004\u001d\u001c!8\u0012\u0006\u001e&8A\u000b\u0014&\"\u0004\u000b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u000f\n\u0006/9\u000e\u001a\u0001g;\t\u0000\u0005';\b\f\u001a-/";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u000b\u0006\u0015;";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u000f\n\u0006/9\u000e\u001a\u0001g%\u000eO\u001f-?\u0016\u0000\u0003#k\u0000\f\u0012-8\u0012CQ.*\b\u0003Q<$A\f\u0003-*\u0015\nQ/9\u000e\u001a\u0001";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u000f\n\u0006/9\u000e\u001a\u0001g,\u000eO\u0012:.\u0000\u001b\u0014h,\u0013\u0000\u00048q";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000b\u0006\u0015;";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static l5 a(NewGroup newGroup) {
        return newGroup.o;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.Vector r6) {
        /*
        r5 = this;
        r3 = 0;
        r0 = r5.n;
        r0 = r0.getText();
        r0 = r0.toString();
        r0 = com.whatsapp.a28.a(r0);
        r1 = com.whatsapp.a28.c(r0);
        r2 = com.whatsapp.a59.h;
        if (r1 > r2) goto L_0x0028;
    L_0x0017:
        r1 = r6.size();
        if (r1 != 0) goto L_0x0042;
    L_0x001d:
        r0 = 2131231570; // 0x7f080352 float:1.8079225E38 double:1.052968302E-314;
        r0 = r5.getString(r0);
        com.whatsapp.App.b(r5, r0, r3);
    L_0x0027:
        return;
    L_0x0028:
        r0 = 2131232086; // 0x7f080556 float:1.8080271E38 double:1.052968557E-314;
        r0 = r5.getString(r0);
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = com.whatsapp.a59.h;
        r2 = java.lang.Integer.valueOf(r2);
        r1[r3] = r2;
        r0 = java.lang.String.format(r0, r1);
        com.whatsapp.App.b(r5, r0, r3);
        goto L_0x0027;
    L_0x0042:
        r1 = com.whatsapp.qm.j(r0);
        com.whatsapp.qm.a(r1, r6);
        r2 = com.whatsapp.App.Q();
        if (r2 == 0) goto L_0x007f;
    L_0x004f:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 11;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = com.whatsapp.App.aK;
        r3 = 2;
        r3 = com.whatsapp.qm.a(r1, r0, r6, r3);
        r2.a(r3);
        r2 = new com.whatsapp.awu;
        r2.<init>(r5, r1, r0, r6);
        com.whatsapp.util.bq.a(r2);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0092;
    L_0x007f:
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = com.whatsapp.App.aK;
        r3 = 3;
        r0 = com.whatsapp.qm.a(r1, r0, r6, r3);
        r2.a(r0);
    L_0x0092:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.e();
        r0.<init>(r5, r1);
        r5.startActivity(r0);
        r5.finish();
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.NewGroup.a(java.util.Vector):void");
    }

    public static void a(@NonNull Activity activity, @NonNull co coVar, @Nullable Collection collection) {
        Intent intent = new Intent(activity, NewGroup.class);
        intent.putExtra(z[2], coVar.getCode());
        if (!(collection == null || collection.isEmpty())) {
            intent.putExtra(z[1], TextUtils.join(",", collection));
        }
        activity.startActivity(intent);
    }

    static EditText c(NewGroup newGroup) {
        return newGroup.n;
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[3]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(2130903236);
        nf.a(k.NEW_GROUP);
        this.p = (ImageView) findViewById(2131755804);
        this.p.setOnClickListener(new _v(this));
        if (bundle == null) {
            this.o.x().delete();
            this.o.r().delete();
        }
        this.r = (TextView) findViewById(2131755805);
        findViewById(2131755630).setOnClickListener(new du(this));
        this.s = new k3(this);
        this.s.a(this.q);
        this.p.setImageResource(2130837614);
        this.n = (EditText) findViewById(2131755772);
        aam.a(this.n);
        this.n.setFilters(new InputFilter[]{new aes(a59.h)});
        this.n.addTextChangedListener(new hu(this.n, this.r, a59.h));
        akz.a(this, getSupportActionBar(), getString(2131231548), new aui(this));
        if (bundle == null && !App.v((Context) this)) {
            RequestPermissionActivity.b(this, 2131231615, 2131231614);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
        r7 = this;
        r6 = 0;
        r5 = -1;
        r0 = com.whatsapp.DialogToastActivity.f;
        switch(r8) {
            case 1: goto L_0x0080;
            case 12: goto L_0x0008;
            case 13: goto L_0x004c;
            case 150: goto L_0x00a1;
            default: goto L_0x0007;
        };
    L_0x0007:
        return;
    L_0x0008:
        if (r9 != r5) goto L_0x0007;
    L_0x000a:
        if (r10 == 0) goto L_0x003b;
    L_0x000c:
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r1 = r10.getBooleanExtra(r1, r6);
        if (r1 == 0) goto L_0x003b;
    L_0x0017:
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = r7.o;
        r1 = r1.x();
        r1.delete();
        r1 = r7.o;
        r1 = r1.r();
        r1.delete();
        r1 = r7.p;
        r2 = 2130837614; // 0x7f02006e float:1.7280187E38 double:1.052773662E-314;
        r1.setImageResource(r2);
        if (r0 == 0) goto L_0x0007;
    L_0x003b:
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = r7.o;
        r2 = 13;
        com.whatsapp.r.a(r10, r1, r7, r2, r7);
        if (r0 == 0) goto L_0x0007;
    L_0x004c:
        r1 = com.whatsapp.r.a();
        r1.delete();
        if (r9 != r5) goto L_0x0077;
    L_0x0055:
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = r7.getResources();
        r2 = 2131427540; // 0x7f0b00d4 float:1.84767E38 double:1.053065124E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = r7.p;
        r3 = r7.o;
        r4 = 0;
        r1 = r3.a(r1, r4, r6);
        r2.setImageBitmap(r1);
        if (r0 == 0) goto L_0x0007;
    L_0x0077:
        if (r9 != 0) goto L_0x0007;
    L_0x0079:
        if (r10 == 0) goto L_0x0007;
    L_0x007b:
        com.whatsapp.r.a(r10, r7);
        if (r0 == 0) goto L_0x0007;
    L_0x0080:
        if (r9 != r5) goto L_0x0007;
    L_0x0082:
        r1 = new java.util.Vector;
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r2 = r10.getStringExtra(r2);
        r3 = ",";
        r2 = r2.split(r3);
        r2 = java.util.Arrays.asList(r2);
        r1.<init>(r2);
        r7.a(r1);
        if (r0 == 0) goto L_0x0007;
    L_0x00a1:
        if (r9 == r5) goto L_0x0007;
    L_0x00a3:
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r7.finish();
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.NewGroup.onActivityResult(int, int, android.content.Intent):void");
    }

    static k3 b(NewGroup newGroup) {
        return newGroup.s;
    }

    public NewGroup() {
        this.q = new _1(this);
        this.o = new ln(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.s.a(configuration);
    }
}
