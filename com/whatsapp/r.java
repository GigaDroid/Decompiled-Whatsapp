package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.ao;
import com.whatsapp.wallpaper.CropImage;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class r {
    private static final String[] z;

    static {
        String[] strArr = new String[39];
        String str = "\u0003\u000ep 0";
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
                        i3 = 114;
                        break;
                    case at.g /*1*/:
                        i3 = 123;
                        break;
                    case at.i /*2*/:
                        i3 = 21;
                        break;
                    case at.o /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = 73;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0011\u0014x|>\u001a\u001aa!(\u0002\u000b;;'\u0006\u001e{&g\u0013\u0018a;&\u001cUG\u0017\u001a7/J\u0015\u001b=.E\r\u0019:4A\u001d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0011\u0014x|>\u001a\u001aa!(\u0002\u000b;;'\u0006\u001e{&g\u0013\u0018a;&\u001cUF\u0017\b 8]\r\u0019:4A\u001d";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0011\u0014x|>\u001a\u001aa!(\u0002\u000b;;'\u0006\u001e{&g\u0013\u0018a;&\u001cUG\u0017\u001a7/J\u0002\u001b==\\\u001e\f-+]\u001d\u001d=";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0011\u0014x|>\u001a\u001aa!(\u0002\u000b;;'\u0006\u001e{&g\u0013\u0018a;&\u001cUV\u0013\u0019&.G\u0017\u0016\"3Z\u0006\u0006";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0002\tz4 \u001e\u001e:\"!\u001d\u000fz}<\u0002\u001ft&,\u0000Tg''R\u0018}=&\u0001\u001eg";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0013\u0015q &\u001b\u001f;;'\u0006\u001e{&g\u0017\u0003a (\\2[\u001b\u001d;:Y\r\u0000</P\u001c\u001d!";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0011\u0014x|>\u001a\u001aa!(\u0002\u000b;;'\u0006\u001e{&g\u0013\u0018a;&\u001cUE\u001b\n9$E\u001a\u0006&4";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0006\u0016e&";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001d\u000ea\"<\u0006\"";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0011\tz\"\u000b\u000b4`&9\u0007\u000fF;3\u0017";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTv &\u0002\u000b}==\u001dT{==_\u001a{\u007f \u001f\u001ar7i";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0013\be7*\u0006\"";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0001\u0018t>,";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u001f\u001am\u0014 \u001e\u001eF;3\u0017";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0013\be7*\u0006#";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001d\u000ea\"<\u0006#";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u001d\u000ea\"<\u0006=z $\u0013\u000f";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u001d\u000ea\"<\u0006";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTv &\u0002\u000b}==\u001dT{=d\u001b\u0015e'=_\ba ,\u0013\u00165";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    str = "\u001f\u0012{\u0011;\u001d\u000b";
                    obj = 20;
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    strArr2 = strArr3;
                    str = "\u0001\u0018t>,'\u000b\\4\u0007\u0017\u001eq7-";
                    obj = 21;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTv &\u0002\u000b}==\u001dT5";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTv &\u0002\u000b}==\u001dT{=d\u0016\u001aa3";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTt1=\u001b\r|&0\u0000\u001ef}&\u001d\u001687;\u0000\u0014g";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTt1=\u001b\r|&0\u0000\u001ef}'\u001dVf\"(\u0011\u001e";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTt1=\u001b\r|&0\u0000\u001ef}/\u0013\u0012y}%\u001d\u001aq\u007f \u001f\u001ar7";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTt1=\u001b\r|&0\u0000\u001ef}/\u0013\u0012y}'\u001d\u000f83d\u001b\u0016t5,";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u001b\u001487;\u0000\u0014g";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0017\tg=;_\u0014z?";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u001c\u0014a\u007f(_\u0012x3.\u0017";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u001c\u00148!9\u0013\u0018p";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0006\u0016e\"";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTf7'\u0016\u000b}==\u001d";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTf7'\u0016\u000b}==\u001dTv3'\u001c\u0014ar:\u0013\rpr=\u001a\u000ex0";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTf7'\u0016\u000b}==\u001d";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0002\tz4 \u001e\u001e|</\u001dTf7'\u0016\u000b}==\u001dTv3'\u001c\u0014ar-\u0017\u0018z6,R\u000f}'$\u0010";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0006\u0016e;";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001d\u000ea\"<\u0006";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static File c() {
        return App.j(z[33]);
    }

    public static boolean b(l5 l5Var, Activity activity) {
        Throwable e;
        Throwable e2;
        byte[] bArr;
        if (App.Q()) {
            try {
                File c = c();
                FileInputStream fileInputStream = new FileInputStream(c);
                byte[] bArr2 = new byte[((int) c.length())];
                fileInputStream.read(bArr2);
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                } catch (Throwable e4) {
                    App.a(activity.getBaseContext(), 2131231107, 0);
                    Log.b(z[34], e4);
                    return false;
                }
                try {
                    Options options = new Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
                    options.inSampleSize = Math.min(options.outWidth, options.outHeight) / 96;
                    options.inJustDecodeBounds = false;
                    options.inScaled = false;
                    options.inDither = true;
                    if (VERSION.SDK_INT >= 10) {
                        options.inPreferQualityOverSpeed = true;
                    }
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
                    if (decodeByteArray != null) {
                        Config config = decodeByteArray.getConfig();
                        if (config == null) {
                            config = Config.ARGB_8888;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(96, 96, config);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setFilterBitmap(true);
                        paint.setDither(true);
                        canvas.drawBitmap(decodeByteArray, new Rect(0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight()), new Rect(0, 0, 96, 96), paint);
                        decodeByteArray.recycle();
                        Closeable fileOutputStream;
                        try {
                            fileOutputStream = new FileOutputStream(b());
                            if (fileOutputStream != null) {
                                try {
                                    createBitmap.compress(CompressFormat.JPEG, 75, fileOutputStream);
                                } catch (IOException e5) {
                                    throw e5;
                                } catch (IOException e6) {
                                    e2 = e6;
                                }
                            }
                            ao.a(fileOutputStream);
                        } catch (IOException e7) {
                            e2 = e7;
                            fileOutputStream = null;
                            try {
                                Log.b(z[35], e2);
                                ao.a(fileOutputStream);
                                createBitmap.recycle();
                                c = b();
                                fileInputStream = new FileInputStream(c);
                                bArr = new byte[((int) c.length())];
                                fileInputStream.read(bArr);
                                fileInputStream.close();
                                App.a(new aw2(l5Var.p, bArr2, bArr));
                                if (!DialogToastActivity.f) {
                                    return true;
                                }
                                App.a(activity.getBaseContext(), 2131231107, 0);
                                Log.e(z[37]);
                                return false;
                            } catch (Throwable th) {
                                e4 = th;
                                ao.a(fileOutputStream);
                                throw e4;
                            }
                        } catch (Throwable th2) {
                            e4 = th2;
                            fileOutputStream = null;
                            ao.a(fileOutputStream);
                            throw e4;
                        }
                        createBitmap.recycle();
                        c = b();
                        fileInputStream = new FileInputStream(c);
                        bArr = new byte[((int) c.length())];
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        App.a(new aw2(l5Var.p, bArr2, bArr));
                        if (DialogToastActivity.f) {
                            return true;
                        }
                    }
                } catch (IOException e8) {
                } catch (Throwable e42) {
                    App.a(activity.getBaseContext(), 2131231107, 0);
                    Log.b(z[34], e42);
                    return false;
                }
                App.a(activity.getBaseContext(), 2131231107, 0);
                Log.e(z[37]);
                return false;
            } catch (IOException e9) {
                throw e9;
            } catch (Throwable e422) {
                App.a(activity.getBaseContext(), 2131231107, 0);
                Log.b(z[34], e422);
                return false;
            } catch (IOException e92) {
                throw e92;
            } catch (Throwable e4222) {
                App.a(activity.getBaseContext(), 2131231107, 0);
                Log.b(z[36], e4222);
                return false;
            }
        }
        App.a(activity.getBaseContext(), 2131230925, 0);
        return false;
    }

    public static void a(Intent intent, by byVar) {
        boolean z = DialogToastActivity.f;
        if (intent.getBooleanExtra(z[30], false)) {
            Log.e(z[25]);
            App.a(byVar, App.z().getString(2131231116));
            if (!z) {
                return;
            }
        }
        if (intent.getBooleanExtra(z[32], false)) {
            Log.e(z[26]);
            App.a(byVar, App.z().getString(2131231112));
            if (!z) {
                return;
            }
        }
        if (intent.getBooleanExtra(z[29], false)) {
            Log.e(z[27]);
            App.a(byVar, App.z().getString(2131231107));
            if (!z) {
                return;
            }
        }
        if (intent.getBooleanExtra(z[31], false)) {
            Log.e(z[28]);
            App.a(byVar, App.z().getString(2131231105));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.l5 r11, android.app.Activity r12, int r13) {
        /*
        r9 = 0;
        r8 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = a();
        r0.delete();
        r0 = new android.content.Intent;
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r2 = a();
        r2 = android.net.Uri.fromFile(r2);
        r0 = r0.putExtra(r1, r2);
        r1 = z;
        r1 = r1[r9];
        r2 = r11.q;
        r2 = r0.putExtra(r1, r2);
        r0 = r11.c();
        if (r0 == 0) goto L_0x0049;
    L_0x0036:
        r1 = new android.content.Intent;
        r0 = z;
        r4 = 2;
        r0 = r0[r4];
        r1.<init>(r0, r8);
        r0 = 2131231342; // 0x7f08026e float:1.8078762E38 double:1.0529681894E-314;
        r0 = r12.getString(r0);
        if (r3 == 0) goto L_0x00cf;
    L_0x0049:
        r1 = new android.content.Intent;
        r0 = z;
        r4 = 4;
        r0 = r0[r4];
        r1.<init>(r0, r8);
        r0 = 2131231711; // 0x7f0803df float:1.807951E38 double:1.0529683717E-314;
        r0 = r12.getString(r0);
        r10 = r0;
        r0 = r1;
        r1 = r10;
    L_0x005d:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new android.content.Intent;
        r6 = z;
        r7 = 8;
        r6 = r6[r7];
        r5.<init>(r6, r8);
        r4.add(r5);
        r5 = new android.content.Intent;
        r6 = z;
        r7 = 5;
        r6 = r6[r7];
        r5.<init>(r6, r8);
        r4.add(r5);
        r5 = r11.r();
        r5 = r5.exists();
        if (r5 == 0) goto L_0x0092;
    L_0x0087:
        r5 = r11.c();
        if (r5 == 0) goto L_0x00a3;
    L_0x008d:
        r4.add(r2);
        if (r3 == 0) goto L_0x00a3;
    L_0x0092:
        r0 = r11.c();
        if (r0 == 0) goto L_0x009a;
    L_0x0098:
        if (r3 == 0) goto L_0x00cd;
    L_0x009a:
        r0 = r4.get(r9);
        r0 = (android.content.Intent) r0;
        r4.remove(r9);
    L_0x00a3:
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r1 = android.content.Intent.createChooser(r0, r1);
        r0 = r4.isEmpty();
        if (r0 != 0) goto L_0x00c9;
    L_0x00b5:
        r0 = z;
        r2 = 7;
        r2 = r0[r2];
        r0 = r4.size();
        r0 = new android.content.Intent[r0];
        r0 = r4.toArray(r0);
        r0 = (android.os.Parcelable[]) r0;
        r1.putExtra(r2, r0);
    L_0x00c9:
        r12.startActivityForResult(r1, r13);
        return;
    L_0x00cd:
        r0 = r2;
        goto L_0x00a3;
    L_0x00cf:
        r10 = r0;
        r0 = r1;
        r1 = r10;
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.r.a(com.whatsapp.l5, android.app.Activity, int):void");
    }

    public static void a(Intent intent, l5 l5Var, Activity activity, int i, by byVar) {
        boolean z = DialogToastActivity.f;
        Uri uri = null;
        if (intent != null) {
            uri = intent.getData();
        }
        if (uri == null) {
            try {
                if (a().exists()) {
                    uri = Uri.fromFile(a());
                }
            } catch (IOException e) {
                throw e;
            }
        }
        c().delete();
        if (uri != null) {
            try {
                InputStream openInputStream = App.at.openInputStream(uri);
                if (openInputStream != null) {
                    Options options = new Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(openInputStream, null, options);
                    openInputStream.close();
                    if (options.outWidth <= 0 || options.outHeight <= 0) {
                        Log.e(z[12] + uri);
                        byVar.a(2131231105);
                        return;
                    } else if (options.outWidth < 192 || options.outHeight < 192) {
                        byVar.f(String.format(App.az.a(2131296273, 192), new Object[]{Integer.valueOf(192)}));
                        return;
                    } else if (!z) {
                        Intent intent2 = new Intent(activity, CropImage.class);
                        try {
                            intent2.putExtra(z[17], 640);
                            intent2.putExtra(z[10], 640);
                            intent2.putExtra(z[21], 192);
                            intent2.putExtra(z[16], 1);
                            intent2.putExtra(z[13], 1);
                            intent2.putExtra(z[14], true);
                            intent2.putExtra(z[22], false);
                            intent2.putExtra(z[11], false);
                            intent2.putExtra(z[15], 61440);
                            intent2.setData(uri);
                            intent2.putExtra(z[19], Uri.fromFile(c()));
                            intent2.putExtra(z[18], CompressFormat.JPEG.toString());
                            activity.startActivityForResult(intent2, i);
                            if (!z) {
                                return;
                            }
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                }
                Log.e(z[20] + uri);
                byVar.a(2131231107);
                return;
            } catch (IOException e3) {
                throw e3;
            } catch (IOException e32) {
                throw e32;
            } catch (Throwable e4) {
                Log.b(z[23] + uri, e4);
                byVar.a(2131231107);
                return;
            }
        }
        Log.e(z[24]);
        byVar.a(2131231105);
    }

    public static void a(l5 l5Var, Activity activity) {
        App.a(new aw2(l5Var.p, null, null));
    }

    public static File b() {
        return App.j(z[9]);
    }

    public static File a() {
        return App.j(z[38]);
    }
}
