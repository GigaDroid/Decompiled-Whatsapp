package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import com.whatsapp.fieldstats.al;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class DescribeProblemActivity extends DialogToastActivity {
    private static final String[] z;
    private az6 n;
    private Uri[] o;
    private EditText p;
    private String q;
    private String r;
    private al s;
    private as9 t;

    class 3 extends ThumbnailButton {
        final DescribeProblemActivity k;

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setMeasuredDimension(getMeasuredWidth(), (getMeasuredWidth() * 4) / 3);
        }

        public void onDraw(Canvas canvas) {
            if (!(isSelected() || isPressed())) {
                canvas.drawColor(getResources().getColor(2131624022));
            }
            super.onDraw(canvas);
        }

        3(DescribeProblemActivity describeProblemActivity, Context context) {
            this.k = describeProblemActivity;
            super(context);
        }
    }

    static {
        String[] strArr = new String[17];
        String str = "Ktf\u00112Vd|\u001b#K";
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
                        i3 = 56;
                        break;
                    case at.g /*1*/:
                        i3 = 23;
                        break;
                    case at.i /*2*/:
                        i3 = 20;
                        break;
                    case at.o /*3*/:
                        i3 = 116;
                        break;
                    default:
                        i3 = 87;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\\rg\u0017'Jxv[3]d`\u00068A";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Ktf\u00112Vd|\u001b#K";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\\rg\u0017'Jxv\u00182U8w\u00062Ycq";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "[xyZ Pv`\u00076Hg:02Ktf\u001d5]Gf\u001b5Try54L~b\u001d#A9r\u00068U";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "[xyZ Pv`\u00076Hg:02Ktf\u001d5]Gf\u001b5Try54L~b\u001d#A9g\u0011%Nrf\u0007#Yca\u0007";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "[xyZ Pv`\u00076Hg:02Ktf\u001d5]Gf\u001b5Try54L~b\u001d#A9`\r']";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\\rg\u0017'Jxv['Ybg\u0011";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\\rg\u0017'Jxv[$[eq\u00119K\u007f{\u0000xVx9\u001d9Hb`Y$Leq\u0015:\u0018";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\\rg\u0017'Jxv[$[eq\u00119K\u007f{\u0000xVx`Y6V:}\u00196_r4";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\\rg\u0017'Jxv[$[eq\u00119K\u007f{\u0000xVx9\u001d9Hb`Y$Leq\u0015:\u0018";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\\rg\u0017'Jxv[$[eq\u00119K\u007f{\u0000xVx9\u001d9Hb`Y$Leq\u0015:\u0018";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\\rg\u0017'Jxv[$[eq\u00119K\u007f{\u0000x\u0018";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "[xyZ Pv`\u00076Hg";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "QdK\u00062Kr`";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\\rg\u0017'Jxv[']ey\u001d$K~{\u001a";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\\rg\u0017'Jxv[%]da\u00192";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onPause() {
        super.onPause();
        Log.i(z[8]);
    }

    public void onResume() {
        super.onResume();
        Log.i(z[1]);
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
        } catch (SecurityException e) {
            throw e;
        }
    }

    protected Dialog onCreateDialog(int i) {
        Dialog progressDialog;
        switch (i) {
            case at.g /*1*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131231768));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case at.i /*2*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131231857));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            default:
                return super.onCreateDialog(i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r8, android.net.Uri r9) {
        /*
        r7 = this;
        r5 = 10;
        r6 = 2131231107; // 0x7f080183 float:1.8078286E38 double:1.0529680733E-314;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r7.o;
        r0[r8] = r9;
        r0 = 2131755611; // 0x7f10025b float:1.9142106E38 double:1.0532272127E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.LinearLayout) r0;
        r0 = r0.getChildAt(r8);
        r0 = (android.widget.ImageView) r0;
        r0 = (android.widget.ImageView) r0;
        if (r9 == 0) goto L_0x010d;
    L_0x001e:
        r1 = com.whatsapp.App.at;	 Catch:{ IOException -> 0x011b }
        r1 = r1.openInputStream(r9);	 Catch:{ IOException -> 0x011b }
        if (r1 == 0) goto L_0x00eb;
    L_0x0026:
        r3 = new android.graphics.BitmapFactory$Options;	 Catch:{ IOException -> 0x011b }
        r3.<init>();	 Catch:{ IOException -> 0x011b }
        r4 = 1;
        r3.inJustDecodeBounds = r4;	 Catch:{ IOException -> 0x0119 }
        r4 = 0;
        android.graphics.BitmapFactory.decodeStream(r1, r4, r3);	 Catch:{ IOException -> 0x0119 }
        com.whatsapp.util.ao.a(r1);	 Catch:{ IOException -> 0x0119 }
        r1 = r3.outWidth;	 Catch:{ IOException -> 0x0119 }
        if (r1 <= 0) goto L_0x00c9;
    L_0x0039:
        r1 = r3.outHeight;	 Catch:{ IOException -> 0x0119 }
        if (r1 <= 0) goto L_0x00c9;
    L_0x003d:
        r1 = 0;
        r3.inJustDecodeBounds = r1;	 Catch:{ IOException -> 0x011b }
        r1 = 1;
        r3.inSampleSize = r1;	 Catch:{ IOException -> 0x011b }
        r1 = r7.getWindowManager();	 Catch:{ IOException -> 0x011b }
        r1 = r1.getDefaultDisplay();	 Catch:{ IOException -> 0x011b }
        r1 = r1.getWidth();	 Catch:{ IOException -> 0x011b }
        r1 = r1 / 3;
    L_0x0051:
        r4 = r3.outWidth;	 Catch:{ IOException -> 0x011b }
        if (r1 >= r4) goto L_0x005f;
    L_0x0055:
        r1 = r1 * 2;
        r4 = r3.inSampleSize;	 Catch:{ IOException -> 0x011b }
        r4 = r4 * 2;
        r3.inSampleSize = r4;	 Catch:{ IOException -> 0x011b }
        if (r2 == 0) goto L_0x0051;
    L_0x005f:
        r1 = com.whatsapp.App.at;	 Catch:{ IOException -> 0x011b }
        r1 = r1.openInputStream(r9);	 Catch:{ IOException -> 0x011b }
        if (r1 == 0) goto L_0x00a7;
    L_0x0067:
        r4 = 1;
        r3.inDither = r4;	 Catch:{ IOException -> 0x013a }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x013a }
        if (r4 < r5) goto L_0x0071;
    L_0x006e:
        r4 = 1;
        r3.inPreferQualityOverSpeed = r4;	 Catch:{ IOException -> 0x013c }
    L_0x0071:
        r4 = 0;
        r3 = android.graphics.BitmapFactory.decodeStream(r1, r4, r3);	 Catch:{ IOException -> 0x011b }
        if (r3 == 0) goto L_0x0082;
    L_0x0078:
        r4 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ IOException -> 0x013e }
        r0.setScaleType(r4);	 Catch:{ IOException -> 0x013e }
        r0.setImageBitmap(r3);	 Catch:{ IOException -> 0x013e }
        if (r2 == 0) goto L_0x00a2;
    L_0x0082:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0140 }
        r3.<init>();	 Catch:{ IOException -> 0x0140 }
        r4 = z;	 Catch:{ IOException -> 0x0140 }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0140 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0140 }
        r3 = r3.append(r9);	 Catch:{ IOException -> 0x0140 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0140 }
        com.whatsapp.util.Log.e(r3);	 Catch:{ IOException -> 0x0140 }
        r3 = 2131231107; // 0x7f080183 float:1.8078286E38 double:1.0529680733E-314;
        r7.a(r3);	 Catch:{ IOException -> 0x0140 }
    L_0x00a2:
        com.whatsapp.util.ao.a(r1);	 Catch:{ IOException -> 0x0142 }
        if (r2 == 0) goto L_0x00c7;
    L_0x00a7:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0142 }
        r1.<init>();	 Catch:{ IOException -> 0x0142 }
        r3 = z;	 Catch:{ IOException -> 0x0142 }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0142 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x0142 }
        r1 = r1.append(r9);	 Catch:{ IOException -> 0x0142 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0142 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x0142 }
        r1 = 2131231107; // 0x7f080183 float:1.8078286E38 double:1.0529680733E-314;
        r7.a(r1);	 Catch:{ IOException -> 0x0142 }
    L_0x00c7:
        if (r2 == 0) goto L_0x00e9;
    L_0x00c9:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0144 }
        r1.<init>();	 Catch:{ IOException -> 0x0144 }
        r3 = z;	 Catch:{ IOException -> 0x0144 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0144 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x0144 }
        r1 = r1.append(r9);	 Catch:{ IOException -> 0x0144 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0144 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x0144 }
        r1 = 2131231105; // 0x7f080181 float:1.8078282E38 double:1.0529680723E-314;
        r7.a(r1);	 Catch:{ IOException -> 0x0144 }
    L_0x00e9:
        if (r2 == 0) goto L_0x010b;
    L_0x00eb:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0146 }
        r1.<init>();	 Catch:{ IOException -> 0x0146 }
        r3 = z;	 Catch:{ IOException -> 0x0146 }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0146 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x0146 }
        r1 = r1.append(r9);	 Catch:{ IOException -> 0x0146 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0146 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x0146 }
        r1 = 2131231107; // 0x7f080183 float:1.8078286E38 double:1.0529680733E-314;
        r7.a(r1);	 Catch:{ IOException -> 0x0146 }
    L_0x010b:
        if (r2 == 0) goto L_0x0118;
    L_0x010d:
        r1 = android.widget.ImageView.ScaleType.CENTER;	 Catch:{ IOException -> 0x0148 }
        r0.setScaleType(r1);	 Catch:{ IOException -> 0x0148 }
        r1 = 2130839452; // 0x7f02079c float:1.7283915E38 double:1.05277457E-314;
        r0.setImageResource(r1);	 Catch:{ IOException -> 0x0148 }
    L_0x0118:
        return;
    L_0x0119:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x011b }
    L_0x011b:
        r1 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 13;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r9);
        r3 = r3.toString();
        com.whatsapp.util.Log.b(r3, r1);
        r7.a(r6);
        goto L_0x010b;
    L_0x013a:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x013c }
    L_0x013c:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x011b }
    L_0x013e:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0140 }
    L_0x0140:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x011b }
    L_0x0142:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x011b }
    L_0x0144:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x011b }
    L_0x0146:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x011b }
    L_0x0148:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DescribeProblemActivity.a(int, android.net.Uri):void");
    }

    static Uri[] b(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.o;
    }

    static az6 a(DescribeProblemActivity describeProblemActivity, az6 com_whatsapp_az6) {
        describeProblemActivity.n = com_whatsapp_az6;
        return com_whatsapp_az6;
    }

    static String g(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.r;
    }

    static as9 f(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.a();
    }

    static EditText a(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.p;
    }

    static az6 e(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
        r12 = this;
        r11 = 3;
        r3 = 0;
        r2 = 1;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r13);
        r0 = r12.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r2);
        r0 = r12.getSupportActionBar();
        r0.setDisplayShowCustomEnabled(r2);
        r0 = 2130903158; // 0x7f030076 float:1.7413126E38 double:1.052806045E-314;
        r12.setContentView(r0);
        r0 = 2131755608; // 0x7f100258 float:1.91421E38 double:1.053227211E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r12.p = r0;
        r0 = r12.p;
        com.whatsapp.aam.a(r0);
        r0 = 2131755609; // 0x7f100259 float:1.9142102E38 double:1.0532272117E-314;
        r0 = r12.findViewById(r0);
        r1 = new com.whatsapp.n5;
        r1.<init>(r12);
        r0.setOnClickListener(r1);
        r0 = r12.getIntent();
        r1 = z;	 Catch:{ SecurityException -> 0x0119 }
        r4 = 5;
        r1 = r1[r4];	 Catch:{ SecurityException -> 0x0119 }
        r1 = r0.getStringExtra(r1);	 Catch:{ SecurityException -> 0x0119 }
        r12.q = r1;	 Catch:{ SecurityException -> 0x0119 }
        r1 = z;	 Catch:{ SecurityException -> 0x0119 }
        r4 = 6;
        r1 = r1[r4];	 Catch:{ SecurityException -> 0x0119 }
        r1 = r0.getStringExtra(r1);	 Catch:{ SecurityException -> 0x0119 }
        r12.r = r1;	 Catch:{ SecurityException -> 0x0119 }
        r1 = z;	 Catch:{ SecurityException -> 0x0119 }
        r4 = 7;
        r1 = r1[r4];	 Catch:{ SecurityException -> 0x0119 }
        r4 = 0;
        r0 = r0.getIntExtra(r1, r4);	 Catch:{ SecurityException -> 0x0119 }
        if (r0 != r2) goto L_0x0075;
    L_0x0069:
        r0 = r12.getSupportActionBar();	 Catch:{ SecurityException -> 0x011b }
        r1 = 2131231063; // 0x7f080157 float:1.8078196E38 double:1.0529680516E-314;
        r0.setTitle(r1);	 Catch:{ SecurityException -> 0x011b }
        if (r5 == 0) goto L_0x007f;
    L_0x0075:
        r0 = r12.getSupportActionBar();	 Catch:{ SecurityException -> 0x011b }
        r1 = 2131231062; // 0x7f080156 float:1.8078194E38 double:1.052968051E-314;
        r0.setTitle(r1);	 Catch:{ SecurityException -> 0x011b }
    L_0x007f:
        r0 = r12.getSupportActionBar();
        r1 = 2131231548; // 0x7f08033c float:1.807918E38 double:1.052968291E-314;
        r1 = r12.getString(r1);
        r4 = new com.whatsapp._6;
        r4.<init>(r12);
        com.whatsapp.akz.a(r12, r0, r1, r4);
        r0 = 2131755611; // 0x7f10025b float:1.9142106E38 double:1.0532272127E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.LinearLayout) r0;
        r0.removeAllViews();
        r1 = r12.getResources();
        r4 = 2131427521; // 0x7f0b00c1 float:1.847666E38 double:1.0530651147E-314;
        r6 = r1.getDimensionPixelSize(r4);
        r1 = r6 / 4;
        if (r1 != 0) goto L_0x00ae;
    L_0x00ad:
        r1 = r2;
    L_0x00ae:
        r4 = r3;
    L_0x00af:
        if (r4 >= r11) goto L_0x00f4;
    L_0x00b1:
        r7 = new com.whatsapp.DescribeProblemActivity$3;
        r7.<init>(r12, r12);
        r7.j = r2;
        r8 = (float) r1;
        r7.setBorderSize(r8);
        r8 = r12.getResources();
        r9 = 2131624028; // 0x7f0e005c float:1.8875224E38 double:1.053162202E-314;
        r8 = r8.getColor(r9);
        r7.setBorderColor(r8);
        r8 = android.widget.ImageView.ScaleType.CENTER;
        r7.setScaleType(r8);
        r8 = 2130839452; // 0x7f02079c float:1.7283915E38 double:1.05277457E-314;
        r7.setImageResource(r8);
        r8 = new com.whatsapp.aa6;
        r8.<init>(r12, r4);
        r7.setOnClickListener(r8);
        r8 = new android.widget.LinearLayout$LayoutParams;
        r9 = -2;
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8.<init>(r3, r9, r10);
        r8.bottomMargin = r6;
        r8.rightMargin = r6;
        r8.topMargin = r6;
        r8.leftMargin = r6;
        r0.addView(r7, r8);
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x00af;
    L_0x00f4:
        if (r13 == 0) goto L_0x0111;
    L_0x00f6:
        r0 = z;
        r0 = r0[r11];
        r2 = r13.getParcelableArray(r0);
        r1 = r3;
    L_0x00ff:
        r0 = r2.length;
        if (r1 >= r0) goto L_0x0111;
    L_0x0102:
        r0 = r2[r1];	 Catch:{ SecurityException -> 0x011d }
        if (r0 == 0) goto L_0x010d;
    L_0x0106:
        r0 = r2[r1];	 Catch:{ SecurityException -> 0x011d }
        r0 = (android.net.Uri) r0;	 Catch:{ SecurityException -> 0x011d }
        r12.a(r1, r0);	 Catch:{ SecurityException -> 0x011d }
    L_0x010d:
        r0 = r1 + 1;
        if (r5 == 0) goto L_0x011f;
    L_0x0111:
        r0 = new com.whatsapp.fieldstats.al;
        r0.<init>();
        r12.s = r0;
        return;
    L_0x0119:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x011b }
    L_0x011b:
        r0 = move-exception;
        throw r0;
    L_0x011d:
        r0 = move-exception;
        throw r0;
    L_0x011f:
        r1 = r0;
        goto L_0x00ff;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DescribeProblemActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        try {
            super.onDestroy();
            if (this.t != null) {
                this.t.cancel(false);
            }
            try {
                if (this.n != null) {
                    this.n.cancel(false);
                }
                Log.i(z[2]);
            } catch (SecurityException e) {
                throw e;
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray(z[0], this.o);
    }

    static al d(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.s;
    }

    public DescribeProblemActivity() {
        this.o = new Uri[3];
    }

    static String c(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.q;
    }

    private az6 b() {
        try {
            if (this.n != null) {
                if (this.n.getStatus() == Status.RUNNING) {
                    this.n.cancel(false);
                }
            }
            this.n = new az6(this);
            return this.n;
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    static as9 a(DescribeProblemActivity describeProblemActivity, as9 com_whatsapp_as9) {
        describeProblemActivity.t = com_whatsapp_as9;
        return com_whatsapp_as9;
    }

    private as9 a() {
        try {
            if (this.t != null) {
                if (this.t.getStatus() == Status.RUNNING) {
                    this.t.cancel(false);
                }
            }
            this.t = new as9(this);
            return this.t;
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        if (i2 == -1 && i >= 1 && i < 4) {
            try {
                if (intent.getBooleanExtra(z[15], false)) {
                    a(i - 1, null);
                    if (!z) {
                        return;
                    }
                }
                Uri data = intent.getData();
                if (data != null) {
                    try {
                        grantUriPermission(z[14], data, 1);
                    } catch (Throwable e) {
                        Log.c(z[16], e);
                    }
                    try {
                        a(i - 1, data);
                        if (!z) {
                            return;
                        }
                    } catch (SecurityException e2) {
                        throw e2;
                    }
                }
                a(2131231107);
            } catch (SecurityException e22) {
                throw e22;
            } catch (SecurityException e222) {
                throw e222;
            }
        }
    }
}
