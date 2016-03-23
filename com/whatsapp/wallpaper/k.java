package com.whatsapp.wallpaper;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.qi;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.ve;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class k {
    private static Drawable a;
    public static boolean b;
    private static final String[] z;

    static {
        String[] strArr = new String[50];
        String str = "l\"o~Hz3f`\u0017y\"`yMklp{B~c";
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
                        i3 = 27;
                        break;
                    case at.g /*1*/:
                        i3 = 67;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 18;
                        break;
                    default:
                        i3 = 56;
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
                    str = "l\"o~Hz3f`\u0017y\"`yMklf`Jt1#";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Y\"`yMk0";
                    obj = 2;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "l\"o~Hz3f`\u0016y(vb";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "l\"o~Hz3f`\u0017i&pfWi&#qWn/g2Vt7#`]u\"nw\u0018o.s2^r/f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "l\"o~Hz3f`\u0017i&pfWi&#aSr3s{V|ce{Vz/#`]u\"nw\u0018\u007f6f2Ltcp{B~cn{Kv\"wqP";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "l\"o~Hz3f`\u0017i&pfWi&,{V4*lwJi,q2";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "l\"o~Hz3f`\u0017i&pfWi&,}Molj}]i1l`\u0018";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "l\"o~Hz3f`\u0016y(vb";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "l\"o~Hz3f`\u0017i&pfWi&,{W~1q}J;";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "Y\"`yMk0";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "l\"o~Hz3f`\u0016y(vb";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "l\"o~Hz3f`\u0017i&pfWi&,}Molj}]i1l`\u0018";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "l\"o~Hz3f`\u0017i&pfWi&#qWv3owL~";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "l*mvWl";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "l\"o~Hz3f`\u0017i&pfWi&,qWk:#";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "l\"o~Hz3f`\u0017i&pfWi&,{V4*lwJi,q2";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    str = "l\"o~Hz3f`\u0017i&pfWi&,}Molj}]i1l`\u0018";
                    obj = 17;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "l\"o~Hz3f`\u0017i&pfWi&,{V4*lwJi,q2";
                    obj = 18;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "l\"o~Hz3f`\u0016q3d";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "l\"o~Hz3f`\u0017\u007f&esMw7";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "l*mvWl";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "l\"o~Hz3f`\u0016q3d";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = ";?#";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = ";?#";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "*\u0003";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    str = "l\"o~Hz3f`\u0017h&wEYw/SsH~19I";
                    obj = 26;
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    strArr2 = strArr3;
                    str = "+\u0003";
                    obj = 27;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "x,n<Os\"waYk3\\bJ~%f`]u fa";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "l\"o~Hz3f`\u0015";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "l\"o~Hz3f`\u0017i&pwL";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "l\"o~Hz3f`\u0016q3d";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "5)su";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "l\"o~Hz3f`\u0017h&w2";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "l\"o~Hz3f`\u0017u\"nwVt7e}Mu'fj[~3w{Wu";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "l\"o~Hz3f`\u0017i6mfQv&fj[~3w{Wu";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "l\"o~Hz3f`\u0017t,n";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "l\"o~Hz3f`\u0016q3d";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "x,n<Os\"waYk3-eYw/ssH~1";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "l\"o~Hz3f`\u0017|&wEYw/SsH~19I";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "x,n<Os\"waYk3-eYw/ssH~1";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "l\"o~Hz3f`\u0015";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "x,n<Os\"waYk3\\bJ~%f`]u fa";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "l\"o~Hz3f`g\u007f&`}\\~";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "l\"o~Hz3f`\u0017x\"m|Wocgw[t'f2\\~%bgToctsTw3bb]i";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "l\"o~Hz3f`\u0016q3d";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "l\"o~Hz3f`\u0017|&w2";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "l\"o~Hz3f`\u0017x\"m|Wocgw[t'f2\\~%bgToctsTw3bb]i";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "l\"o~Hz3f`\u0017|&w2Vn/o";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "l\"o~Hz3f`\u0017y\"`yMklpv[z1gMMu\"usQw\"a~];";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, java.lang.String r6, boolean r7, int r8, android.net.Uri r9) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 27;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r1 = z;
        r2 = 24;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r1 = z;
        r2 = 25;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r9);
        r1 = "]";
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r7 == 0) goto L_0x005a;
    L_0x003f:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 28;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r0 = r0.toString();
        r1 = com.whatsapp.wallpaper.CropImage.c;
        if (r1 == 0) goto L_0x0071;
    L_0x005a:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 26;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r9);
        r0 = r0.toString();
    L_0x0071:
        r1 = z;
        r2 = 29;
        r1 = r1[r2];
        r2 = 0;
        r1 = r5.getSharedPreferences(r1, r2);
        r1 = r1.edit();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 30;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r6);
        r2 = r2.toString();
        r1.putString(r2, r0);
        r1.commit();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.k.a(android.content.Context, java.lang.String, boolean, int, android.net.Uri):void");
    }

    private static Bitmap a(InputStream inputStream) {
        byte[] a = qi.a(inputStream);
        Options options = new Options();
        options.inPreferredConfig = Config.RGB_565;
        options.inDither = false;
        options.inInputShareable = true;
        options.inPurgeable = true;
        return BitmapFactory.decodeByteArray(a, 0, a.length, options);
    }

    public static Drawable a(Context context, String str) {
        Drawable drawable = null;
        String string = context.getSharedPreferences(z[43], 0).getString(z[42] + str, "");
        Log.i(z[40] + str + "]");
        String[] split = string.split("@");
        try {
            if (split.length < 2) {
                return drawable;
            }
            if (split[0].equalsIgnoreCase("0")) {
                try {
                    return context.getPackageManager().getResourcesForApplication(z[41]).getDrawable(Integer.parseInt(split[1]));
                } catch (NameNotFoundException e) {
                    Log.e(e.toString());
                    return drawable;
                }
            }
            try {
                return new BitmapDrawable(context.getResources(), a(ag.c(Uri.parse(split[1]))));
            } catch (IOException e2) {
                Log.e(e2.toString());
                return drawable;
            }
        } catch (NameNotFoundException e3) {
            throw e3;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap a(android.graphics.Bitmap r6, int r7, int r8) {
        /*
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.wallpaper.CropImage.c;
        if (r6 != 0) goto L_0x0008;
    L_0x0006:
        r6 = 0;
    L_0x0007:
        return r6;
    L_0x0008:
        r0 = r6.getWidth();
        r0 = (float) r0;
        r2 = (float) r7;
        r0 = r0 / r2;
        r2 = r6.getHeight();
        r2 = (float) r2;
        r3 = (float) r8;
        r2 = r2 / r3;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0040;
    L_0x001a:
        r0 = r6.getWidth();
        r0 = (float) r0;
        r0 = r0 / r2;
        r0 = (int) r0;
        if (r0 <= 0) goto L_0x003d;
    L_0x0023:
        if (r8 <= 0) goto L_0x003d;
    L_0x0025:
        if (r7 <= 0) goto L_0x003d;
    L_0x0027:
        r2 = android.graphics.Bitmap.createScaledBitmap(r6, r0, r8, r5);
        r0 = r2.getWidth();
        r0 = r0 - r7;
        r0 = r0 / 2;
        r0 = android.graphics.Bitmap.createBitmap(r2, r0, r4, r7, r8);
        if (r0 == r2) goto L_0x003b;
    L_0x0038:
        r2.recycle();	 Catch:{ RuntimeException -> 0x006c }
    L_0x003b:
        if (r1 == 0) goto L_0x003e;
    L_0x003d:
        r0 = r6;
    L_0x003e:
        if (r1 == 0) goto L_0x006a;
    L_0x0040:
        r0 = r6.getHeight();
        r0 = (float) r0;
        r2 = (float) r7;
        r0 = r0 * r2;
        r2 = r6.getWidth();
        r2 = (float) r2;
        r0 = r0 / r2;
        r0 = (int) r0;
        if (r0 <= 0) goto L_0x0007;
    L_0x0050:
        if (r8 <= 0) goto L_0x0007;
    L_0x0052:
        if (r7 <= 0) goto L_0x0007;
    L_0x0054:
        r2 = android.graphics.Bitmap.createScaledBitmap(r6, r7, r0, r5);
        r0 = r2.getHeight();
        r0 = r0 - r8;
        r0 = r0 / 2;
        r0 = android.graphics.Bitmap.createBitmap(r2, r4, r0, r7, r8);
        if (r0 == r2) goto L_0x0068;
    L_0x0065:
        r2.recycle();	 Catch:{ RuntimeException -> 0x006e }
    L_0x0068:
        if (r1 != 0) goto L_0x0007;
    L_0x006a:
        r6 = r0;
        goto L_0x0007;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.k.a(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    public static File b(Context context) {
        return new File(context.getFilesDir(), z[23]);
    }

    public static void f(Context context) {
        FileOutputStream fileOutputStream = null;
        Log.i(z[21]);
        a = null;
        try {
            fileOutputStream = context.openFileOutput(z[20], 0);
            fileOutputStream.write(2);
            fileOutputStream.flush();
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    Log.e(e.toString());
                }
            }
        } catch (IOException e2) {
            Log.e(e2.toString());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e22) {
                    Log.e(e22.toString());
                }
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    Log.e(e3.toString());
                } catch (RuntimeException e4) {
                    throw e4;
                }
            }
        }
        a = g(context);
        a(context);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r11) {
        /*
        r10 = 1;
        r1 = 0;
        r4 = com.whatsapp.wallpaper.CropImage.c;
        r0 = new java.io.File;
        r2 = new java.io.File;
        r3 = com.whatsapp.App.a3;
        r5 = z;
        r6 = 11;
        r5 = r5[r6];
        r2.<init>(r3, r5);
        r3 = z;
        r5 = 12;
        r3 = r3[r5];
        r0.<init>(r2, r3);
        r5 = b(r11);
        r2 = r0.exists();	 Catch:{ IOException -> 0x0027 }
        if (r2 != 0) goto L_0x0029;
    L_0x0026:
        return;
    L_0x0027:
        r0 = move-exception;
        throw r0;
    L_0x0029:
        r6 = new java.io.File;
        r2 = r11.getFilesDir();
        r3 = z;
        r7 = 9;
        r3 = r3[r7];
        r6.<init>(r2, r3);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r7 = 16;
        r3 = r3[r7];
        r2 = r2.append(r3);
        r3 = r0.getName();
        r2 = r2.append(r3);
        r3 = " ";
        r2 = r2.append(r3);
        r8 = r0.length();
        r2 = r2.append(r8);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r3 = 0;
        r2.<init>(r6, r3);	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r3 = java.nio.channels.Channels.newChannel(r2);	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0201, all -> 0x01f8 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0201, all -> 0x01f8 }
        r2 = r2.getChannel();	 Catch:{ IOException -> 0x0201, all -> 0x01f8 }
        com.whatsapp.util.ak.a(r2, r3);	 Catch:{ IOException -> 0x0205, all -> 0x01fb }
        r2.close();	 Catch:{ IOException -> 0x0205, all -> 0x01fb }
        r2 = 0;
        r3.close();	 Catch:{ IOException -> 0x0201, all -> 0x01f8 }
        r3 = 0;
        r0 = new android.graphics.BitmapFactory$Options;	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r0.<init>();	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r7 = 1;
        r0.inJustDecodeBounds = r7;	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r7 = r6.getAbsolutePath();	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        android.graphics.BitmapFactory.decodeFile(r7, r0);	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r7 = r0.outWidth;	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r0 = z;	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r8 = 15;
        r0 = r0[r8];	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r0 = r11.getSystemService(r0);	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r0 = (android.view.WindowManager) r0;	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r8 = r0.getDefaultDisplay();	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r0 = r11.getResources();	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r0 = r0.getConfiguration();	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        r0 = r0.orientation;	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        if (r0 != r10) goto L_0x00b6;
    L_0x00b0:
        r0 = r8.getWidth();	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
        if (r4 == 0) goto L_0x00ba;
    L_0x00b6:
        r0 = r8.getHeight();	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
    L_0x00ba:
        if (r0 == r7) goto L_0x00c6;
    L_0x00bc:
        r0 = z;	 Catch:{ IOException -> 0x010c, all -> 0x01a8 }
        r7 = 6;
        r0 = r0[r7];	 Catch:{ IOException -> 0x010c, all -> 0x01a8 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x010c, all -> 0x01a8 }
        if (r4 == 0) goto L_0x00df;
    L_0x00c6:
        r0 = r6.renameTo(r5);	 Catch:{ IOException -> 0x010e, all -> 0x01a8 }
        if (r0 != 0) goto L_0x00d6;
    L_0x00cc:
        r0 = z;	 Catch:{ IOException -> 0x0110, all -> 0x01a8 }
        r5 = 5;
        r0 = r0[r5];	 Catch:{ IOException -> 0x0110, all -> 0x01a8 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0110, all -> 0x01a8 }
        if (r4 == 0) goto L_0x00df;
    L_0x00d6:
        r0 = z;	 Catch:{ IOException -> 0x0112, all -> 0x01a8 }
        r4 = 14;
        r0 = r0[r4];	 Catch:{ IOException -> 0x0112, all -> 0x01a8 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0112, all -> 0x01a8 }
    L_0x00df:
        if (r1 == 0) goto L_0x00e4;
    L_0x00e1:
        r2.close();	 Catch:{ IOException -> 0x0163, RuntimeException -> 0x0161 }
    L_0x00e4:
        if (r1 == 0) goto L_0x0026;
    L_0x00e6:
        r3.close();	 Catch:{ IOException -> 0x00eb, RuntimeException -> 0x0184 }
        goto L_0x0026;
    L_0x00eb:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0026;
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010e, all -> 0x01a8 }
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0110, all -> 0x01a8 }
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0112, all -> 0x01a8 }
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0114, all -> 0x01a8 }
    L_0x0114:
        r0 = move-exception;
        r2 = r1;
    L_0x0116:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01ff }
        r3.<init>();	 Catch:{ all -> 0x01ff }
        r4 = z;	 Catch:{ all -> 0x01ff }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ all -> 0x01ff }
        r3 = r3.append(r4);	 Catch:{ all -> 0x01ff }
        r0 = r0.toString();	 Catch:{ all -> 0x01ff }
        r0 = r3.append(r0);	 Catch:{ all -> 0x01ff }
        r0 = r0.toString();	 Catch:{ all -> 0x01ff }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x01ff }
        if (r1 == 0) goto L_0x0139;
    L_0x0136:
        r1.close();	 Catch:{ IOException -> 0x0186 }
    L_0x0139:
        if (r2 == 0) goto L_0x0026;
    L_0x013b:
        r2.close();	 Catch:{ IOException -> 0x0140, RuntimeException -> 0x01a6 }
        goto L_0x0026;
    L_0x0140:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 13;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0026;
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 17;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r0.toString();
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x00e4;
    L_0x0184:
        r0 = move-exception;
        throw r0;
    L_0x0186:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 19;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0139;
    L_0x01a6:
        r0 = move-exception;
        throw r0;
    L_0x01a8:
        r0 = move-exception;
        r2 = r1;
    L_0x01aa:
        if (r1 == 0) goto L_0x01af;
    L_0x01ac:
        r1.close();	 Catch:{ IOException -> 0x01b7, RuntimeException -> 0x01b5 }
    L_0x01af:
        if (r2 == 0) goto L_0x01b4;
    L_0x01b1:
        r2.close();	 Catch:{ IOException -> 0x01d8, RuntimeException -> 0x01d6 }
    L_0x01b4:
        throw r0;
    L_0x01b5:
        r0 = move-exception;
        throw r0;
    L_0x01b7:
        r1 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r1 = r1.toString();
        r1 = r3.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x01af;
    L_0x01d6:
        r0 = move-exception;
        throw r0;
    L_0x01d8:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 18;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x01b4;
    L_0x01f8:
        r0 = move-exception;
        r2 = r3;
        goto L_0x01aa;
    L_0x01fb:
        r0 = move-exception;
        r1 = r2;
        r2 = r3;
        goto L_0x01aa;
    L_0x01ff:
        r0 = move-exception;
        goto L_0x01aa;
    L_0x0201:
        r0 = move-exception;
        r2 = r3;
        goto L_0x0116;
    L_0x0205:
        r0 = move-exception;
        r1 = r2;
        r2 = r3;
        goto L_0x0116;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.k.c(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable g(android.content.Context r15) {
        /*
        r3 = com.whatsapp.wallpaper.CropImage.c;
        r0 = a;
        if (r0 != 0) goto L_0x01a7;
    L_0x0006:
        r0 = z;
        r1 = 44;
        r0 = r0[r1];
        r4 = com.whatsapp.tp.a(r0);
        r4.e();
        r2 = b(r15);
        r0 = r2.exists();
        if (r0 == 0) goto L_0x0099;
    L_0x001d:
        r5 = d(r15);	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r6 = new android.graphics.BitmapFactory$Options;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r6.<init>();	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = 0;
        r6.inScaled = r0;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = 1;
        r6.inJustDecodeBounds = r0;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = r2.getAbsolutePath();	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        android.graphics.BitmapFactory.decodeFile(r0, r6);	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = 1;
        r6.inSampleSize = r0;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r1 = r6.outWidth;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = r6.outHeight;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
    L_0x003a:
        r7 = r5.x;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r7 = r7 * 2;
        if (r1 <= r7) goto L_0x004c;
    L_0x0040:
        r1 = r1 / 2;
        r0 = r0 / 2;
        r7 = r6.inSampleSize;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r7 = r7 * 2;
        r6.inSampleSize = r7;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        if (r3 == 0) goto L_0x003a;
    L_0x004c:
        r5 = java.lang.Runtime.getRuntime();	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r8 = r5.maxMemory();	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
    L_0x0054:
        r5 = r1 * r0;
        r5 = r5 * 2;
        r10 = (long) r5;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r12 = 16;
        r12 = r8 / r12;
        r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r5 <= 0) goto L_0x006d;
    L_0x0061:
        r1 = r1 / 2;
        r0 = r0 / 2;
        r5 = r6.inSampleSize;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r5 = r5 * 2;
        r6.inSampleSize = r5;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        if (r3 == 0) goto L_0x0054;
    L_0x006d:
        r0 = 0;
        r6.inJustDecodeBounds = r0;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r6.inPreferredConfig = r0;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = 1;
        r6.inDither = r0;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = 1;
        r6.inPurgeable = r0;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = 1;
        r6.inInputShareable = r0;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = com.whatsapp.qi.a(r2);	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r1 = 0;
        r2 = r0.length;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r2, r6);	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
        if (r0 == 0) goto L_0x0096;
    L_0x0089:
        r1 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ OutOfMemoryError -> 0x01aa, IOException -> 0x01b4 }
        r2 = r15.getResources();	 Catch:{ OutOfMemoryError -> 0x01aa, IOException -> 0x01b4 }
        r1.<init>(r2, r0);	 Catch:{ OutOfMemoryError -> 0x01aa, IOException -> 0x01b4 }
        a = r1;	 Catch:{ OutOfMemoryError -> 0x01aa, IOException -> 0x01b4 }
        if (r3 == 0) goto L_0x0099;
    L_0x0096:
        r0 = 0;
        a = r0;	 Catch:{ OutOfMemoryError -> 0x01ac, IOException -> 0x01b4 }
    L_0x0099:
        r0 = a;
        if (r0 != 0) goto L_0x014d;
    L_0x009d:
        r2 = 2;
        r0 = 0;
        r1 = z;	 Catch:{ IOException -> 0x01c7, OutOfMemoryError -> 0x01dd, all -> 0x01f7 }
        r5 = 46;
        r1 = r1[r5];	 Catch:{ IOException -> 0x01c7, OutOfMemoryError -> 0x01dd, all -> 0x01f7 }
        r0 = r15.openFileInput(r1);	 Catch:{ IOException -> 0x01c7, OutOfMemoryError -> 0x01dd, all -> 0x01f7 }
        r1 = r0.read();	 Catch:{ IOException -> 0x01c7, OutOfMemoryError -> 0x0229, all -> 0x0222 }
        if (r0 == 0) goto L_0x0231;
    L_0x00af:
        r0.close();	 Catch:{ IOException -> 0x01bc, OutOfMemoryError -> 0x01ba }
        r0 = r1;
    L_0x00b3:
        r1 = 2;
        if (r0 == r1) goto L_0x00b9;
    L_0x00b6:
        r1 = 1;
        if (r0 != r1) goto L_0x014d;
    L_0x00b9:
        r2 = d(r15);
        r5 = new android.graphics.BitmapFactory$Options;
        r5.<init>();
        r0 = 0;
        r5.inScaled = r0;
        r0 = 1;
        r5.inJustDecodeBounds = r0;
        r0 = r15.getResources();
        r1 = 2130837752; // 0x7f0200f8 float:1.7280467E38 double:1.05277373E-314;
        android.graphics.BitmapFactory.decodeResource(r0, r1, r5);
        r0 = 1;
        r5.inSampleSize = r0;
        r1 = r5.outWidth;
        r0 = r5.outHeight;
    L_0x00d9:
        r6 = r2.x;
        r6 = r6 * 2;
        if (r1 <= r6) goto L_0x00eb;
    L_0x00df:
        r1 = r1 / 2;
        r0 = r0 / 2;
        r6 = r5.inSampleSize;
        r6 = r6 * 2;
        r5.inSampleSize = r6;
        if (r3 == 0) goto L_0x00d9;
    L_0x00eb:
        r2 = java.lang.Runtime.getRuntime();
        r6 = r2.maxMemory();
    L_0x00f3:
        r2 = r1 * r0;
        r2 = r2 * 2;
        r8 = (long) r2;
        r10 = 16;
        r10 = r6 / r10;
        r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x010c;
    L_0x0100:
        r1 = r1 / 2;
        r0 = r0 / 2;
        r2 = r5.inSampleSize;
        r2 = r2 * 2;
        r5.inSampleSize = r2;
        if (r3 == 0) goto L_0x00f3;
    L_0x010c:
        r0 = 0;
        r5.inJustDecodeBounds = r0;
        r0 = android.graphics.Bitmap.Config.RGB_565;
        r5.inPreferredConfig = r0;
        r0 = 1;
        r5.inDither = r0;
        r0 = 1;
        r5.inInputShareable = r0;
        r0 = 1;
        r5.inPurgeable = r0;
        r0 = r15.getResources();
        r1 = 2130837752; // 0x7f0200f8 float:1.7280467E38 double:1.05277373E-314;
        r0 = r0.openRawResource(r1);
        r0 = com.whatsapp.qi.a(r0);	 Catch:{ IOException -> 0x020c }
        r1 = 0;
        r2 = r0.length;
        r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r2, r5);
        if (r0 == 0) goto L_0x0144;
    L_0x0133:
        r1 = 0;
        r0.setDensity(r1);	 Catch:{ OutOfMemoryError -> 0x021c }
        r1 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ OutOfMemoryError -> 0x021c }
        r2 = r15.getResources();	 Catch:{ OutOfMemoryError -> 0x021c }
        r1.<init>(r2, r0);	 Catch:{ OutOfMemoryError -> 0x021c }
        a = r1;	 Catch:{ OutOfMemoryError -> 0x021c }
        if (r3 == 0) goto L_0x014d;
    L_0x0144:
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x021c }
        r1 = 45;
        r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x021c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ OutOfMemoryError -> 0x021c }
    L_0x014d:
        r0 = a;	 Catch:{ OutOfMemoryError -> 0x021e }
        if (r0 == 0) goto L_0x019b;
    L_0x0151:
        r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x0220 }
        r1 = z;	 Catch:{ OutOfMemoryError -> 0x0220 }
        r2 = 47;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x0220 }
        r1 = a;	 Catch:{ OutOfMemoryError -> 0x0220 }
        r1 = r1.getIntrinsicWidth();	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x0220 }
        r1 = "x";
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x0220 }
        r1 = a;	 Catch:{ OutOfMemoryError -> 0x0220 }
        r1 = r1.getIntrinsicHeight();	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x0220 }
        r1 = " ";
        r1 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0 = a;	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0 = (android.graphics.drawable.BitmapDrawable) r0;	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0 = r0.getBitmap();	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0 = com.whatsapp.util.ao.a(r0);	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0 = r1.append(r0);	 Catch:{ OutOfMemoryError -> 0x0220 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0220 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0220 }
        if (r3 == 0) goto L_0x01a4;
    L_0x019b:
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0220 }
        r1 = 49;
        r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x0220 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0220 }
    L_0x01a4:
        r4.d();
    L_0x01a7:
        r0 = a;
    L_0x01a9:
        return r0;
    L_0x01aa:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x01ac, IOException -> 0x01b4 }
    L_0x01ac:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x01ae, IOException -> 0x01b4 }
    L_0x01ae:
        r0 = move-exception;
        com.whatsapp.util.Log.b(r0);
        goto L_0x0099;
    L_0x01b4:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x0099;
    L_0x01ba:
        r0 = move-exception;
        throw r0;
    L_0x01bc:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r1;
        goto L_0x00b3;
    L_0x01c7:
        r1 = move-exception;
        if (r0 == 0) goto L_0x022e;
    L_0x01ca:
        r0.close();	 Catch:{ IOException -> 0x01d2, OutOfMemoryError -> 0x01d0 }
        r0 = r2;
        goto L_0x00b3;
    L_0x01d0:
        r0 = move-exception;
        throw r0;
    L_0x01d2:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r2;
        goto L_0x00b3;
    L_0x01dd:
        r1 = move-exception;
        r14 = r1;
        r1 = r0;
        r0 = r14;
    L_0x01e1:
        com.whatsapp.util.Log.b(r0);	 Catch:{ all -> 0x0227 }
        if (r1 == 0) goto L_0x022e;
    L_0x01e6:
        r1.close();	 Catch:{ IOException -> 0x01ec }
        r0 = r2;
        goto L_0x00b3;
    L_0x01ec:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r2;
        goto L_0x00b3;
    L_0x01f7:
        r1 = move-exception;
        r14 = r1;
        r1 = r0;
        r0 = r14;
    L_0x01fb:
        if (r1 == 0) goto L_0x0200;
    L_0x01fd:
        r1.close();	 Catch:{ IOException -> 0x0203, OutOfMemoryError -> 0x0201 }
    L_0x0200:
        throw r0;
    L_0x0201:
        r0 = move-exception;
        throw r0;
    L_0x0203:
        r1 = move-exception;
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0200;
    L_0x020c:
        r0 = move-exception;
        r1 = z;
        r2 = 48;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
        com.whatsapp.util.Log.a(r0);
        r0 = a;
        goto L_0x01a9;
    L_0x021c:
        r0 = move-exception;
        throw r0;
    L_0x021e:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0220 }
    L_0x0220:
        r0 = move-exception;
        throw r0;
    L_0x0222:
        r1 = move-exception;
        r14 = r1;
        r1 = r0;
        r0 = r14;
        goto L_0x01fb;
    L_0x0227:
        r0 = move-exception;
        goto L_0x01fb;
    L_0x0229:
        r1 = move-exception;
        r14 = r1;
        r1 = r0;
        r0 = r14;
        goto L_0x01e1;
    L_0x022e:
        r0 = r2;
        goto L_0x00b3;
    L_0x0231:
        r0 = r1;
        goto L_0x00b3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.k.g(android.content.Context):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable a(android.content.Context r7, boolean r8, int r9, android.net.Uri r10, int r11, int r12) {
        /*
        r6 = 2131231109; // 0x7f080185 float:1.807829E38 double:1.0529680743E-314;
        r5 = 0;
        r1 = com.whatsapp.wallpaper.CropImage.c;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 34;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r8);
        r2 = " ";
        r0 = r0.append(r2);
        r0 = r0.append(r11);
        r2 = "x";
        r0 = r0.append(r2);
        r0 = r0.append(r12);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = 0;
        a = r0;
        if (r8 == 0) goto L_0x0109;
    L_0x003b:
        r0 = r7.getPackageManager();	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        r3 = 39;
        r2 = r2[r3];	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        r0 = r0.getResourcesForApplication(r2);	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        r0 = r0.getDrawable(r9);	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        a = r0;	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        r0 = a;	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        r0 = (android.graphics.drawable.BitmapDrawable) r0;	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        r0 = r0.getBitmap();	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        r0 = a(r0, r11, r12);	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        if (r0 == 0) goto L_0x0066;
    L_0x005d:
        r2 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ NameNotFoundException -> 0x009b, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        r2.<init>(r0);	 Catch:{ NameNotFoundException -> 0x009b, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        a = r2;	 Catch:{ NameNotFoundException -> 0x009b, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        if (r1 == 0) goto L_0x0071;
    L_0x0066:
        r0 = 2131231109; // 0x7f080185 float:1.807829E38 double:1.0529680743E-314;
        r0 = r7.getString(r0);	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
        r2 = 0;
        com.whatsapp.App.a(r7, r0, r2);	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
    L_0x0071:
        r0 = a;
        if (r0 == 0) goto L_0x0098;
    L_0x0075:
        r0 = z;	 Catch:{ IOException -> 0x013e }
        r1 = 38;
        r0 = r0[r1];	 Catch:{ IOException -> 0x013e }
        r1 = 0;
        r1 = r7.openFileOutput(r0, r1);	 Catch:{ IOException -> 0x013e }
        r0 = a;	 Catch:{ IOException -> 0x013e }
        r0 = (android.graphics.drawable.BitmapDrawable) r0;	 Catch:{ IOException -> 0x013e }
        r0 = r0.getBitmap();	 Catch:{ IOException -> 0x013e }
        r2 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ IOException -> 0x013e }
        r3 = 90;
        r0.compress(r2, r3, r1);	 Catch:{ IOException -> 0x013e }
        r1.flush();	 Catch:{ IOException -> 0x013e }
        r1.close();	 Catch:{ IOException -> 0x013e }
    L_0x0095:
        a(r7);
    L_0x0098:
        r0 = a;
        return r0;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x009f, RuntimeException -> 0x00c2, OutOfMemoryError -> 0x00e5 }
    L_0x009f:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 35;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r7.getString(r6);
        com.whatsapp.App.a(r7, r0, r5);
        goto L_0x0071;
    L_0x00c2:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 36;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r7.getString(r6);
        com.whatsapp.App.a(r7, r0, r5);
        goto L_0x0071;
    L_0x00e5:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 37;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r7.getString(r6);
        com.whatsapp.App.a(r7, r0, r5);
        if (r1 == 0) goto L_0x0071;
    L_0x0109:
        r0 = com.whatsapp.util.ag.c(r10);	 Catch:{ IOException -> 0x0130 }
        r0 = a(r0);	 Catch:{ IOException -> 0x0130 }
        if (r0 == 0) goto L_0x0120;
    L_0x0113:
        r2 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ NameNotFoundException -> 0x013a }
        r3 = r7.getResources();	 Catch:{ NameNotFoundException -> 0x013a }
        r2.<init>(r3, r0);	 Catch:{ NameNotFoundException -> 0x013a }
        a = r2;	 Catch:{ NameNotFoundException -> 0x013a }
        if (r1 == 0) goto L_0x012b;
    L_0x0120:
        r0 = 2131231109; // 0x7f080185 float:1.807829E38 double:1.0529680743E-314;
        r0 = r7.getString(r0);	 Catch:{ NameNotFoundException -> 0x013c }
        r1 = 0;
        com.whatsapp.App.a(r7, r0, r1);	 Catch:{ NameNotFoundException -> 0x013c }
    L_0x012b:
        r0 = 1;
        b = r0;	 Catch:{ IOException -> 0x0130 }
        goto L_0x0071;
    L_0x0130:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0071;
    L_0x013a:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x013c }
    L_0x013c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0130 }
    L_0x013e:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0095;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.k.a(android.content.Context, boolean, int, android.net.Uri, int, int):android.graphics.drawable.Drawable");
    }

    public static void e(Context context) {
        FileOutputStream fileOutputStream = null;
        Log.i(z[31]);
        a = null;
        try {
            fileOutputStream = context.openFileOutput(z[32], 0);
            fileOutputStream.write(3);
            fileOutputStream.flush();
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    Log.e(e.toString());
                }
            }
        } catch (IOException e2) {
            Log.e(e2.toString());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e22) {
                    Log.e(e22.toString());
                }
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    Log.e(e3.toString());
                } catch (RuntimeException e4) {
                    throw e4;
                }
            }
        }
        a(context);
    }

    public static Uri a() {
        return Uri.fromFile(App.B(ve.f(App.ay.jabber_id + Long.toString(System.currentTimeMillis())) + z[33]));
    }

    public static void a(android.content.Context r6) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.wallpaper.k.a(android.content.Context):void. bs: [B:19:0x0075, B:22:0x007a, B:35:0x00a5, B:38:0x00aa]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r1 = 0;
        r0 = new java.io.File;
        r2 = new java.io.File;
        r3 = com.whatsapp.App.a3;
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r2.<init>(r3, r4);
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r0.<init>(r2, r3);
        r3 = b(r6);
        r2 = r3.exists();	 Catch:{ Exception -> 0x0022 }
        if (r2 != 0) goto L_0x0024;
    L_0x0021:
        return;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r2 = r0.getParentFile();	 Catch:{ Exception -> 0x009f }
        r2 = r2.exists();	 Catch:{ Exception -> 0x009f }
        if (r2 != 0) goto L_0x0035;	 Catch:{ Exception -> 0x009f }
    L_0x002e:
        r2 = r0.getParentFile();	 Catch:{ Exception -> 0x009f }
        r2.mkdirs();	 Catch:{ Exception -> 0x009f }
    L_0x0035:
        r2 = android.os.Environment.getExternalStorageState();
        r2 = com.whatsapp.App.p(r2);
        if (r2 == 0) goto L_0x00b2;
    L_0x003f:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a1 }
        r2.<init>();	 Catch:{ all -> 0x00a1 }
        r4 = z;	 Catch:{ all -> 0x00a1 }
        r5 = 0;	 Catch:{ all -> 0x00a1 }
        r4 = r4[r5];	 Catch:{ all -> 0x00a1 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00a1 }
        r4 = r3.length();	 Catch:{ all -> 0x00a1 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00a1 }
        r2 = r2.toString();	 Catch:{ all -> 0x00a1 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ all -> 0x00a1 }
        r2 = new com.whatsapp.util.q;	 Catch:{ all -> 0x00a1 }
        r4 = com.whatsapp.App.e;	 Catch:{ all -> 0x00a1 }
        r2.<init>(r4, r0);	 Catch:{ all -> 0x00a1 }
        r2 = java.nio.channels.Channels.newChannel(r2);	 Catch:{ all -> 0x00a1 }
        r0 = new java.io.FileInputStream;	 Catch:{ all -> 0x00d1 }
        r0.<init>(r3);	 Catch:{ all -> 0x00d1 }
        r1 = r0.getChannel();	 Catch:{ all -> 0x00d1 }
        com.whatsapp.util.ak.a(r1, r2);	 Catch:{ all -> 0x00d1 }
        if (r1 == 0) goto L_0x0078;
    L_0x0075:
        r1.close();	 Catch:{ Exception -> 0x0080 }
    L_0x0078:
        if (r2 == 0) goto L_0x0021;
    L_0x007a:
        r2.close();	 Catch:{ Exception -> 0x007e }
        goto L_0x0021;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0021;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r0 = move-exception;
        r2 = r1;
    L_0x00a3:
        if (r1 == 0) goto L_0x00a8;
    L_0x00a5:
        r1.close();	 Catch:{ Exception -> 0x00ae }
    L_0x00a8:
        if (r2 == 0) goto L_0x00ad;
    L_0x00aa:
        r2.close();	 Catch:{ Exception -> 0x00b0 }
    L_0x00ad:
        throw r0;	 Catch:{ Exception -> 0x0080 }
    L_0x00ae:
        r0 = move-exception;	 Catch:{ Exception -> 0x0080 }
        throw r0;	 Catch:{ Exception -> 0x0080 }
    L_0x00b0:
        r0 = move-exception;	 Catch:{ Exception -> 0x0080 }
        throw r0;	 Catch:{ Exception -> 0x0080 }
    L_0x00b2:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = android.os.Environment.getExternalStorageState();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0021;
    L_0x00d1:
        r0 = move-exception;
        goto L_0x00a3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.k.a(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point d(android.content.Context r4) {
        /*
        r1 = new android.graphics.Point;
        r1.<init>();
        r0 = z;
        r2 = 22;
        r0 = r0[r2];
        r0 = r4.getSystemService(r0);
        r0 = (android.view.WindowManager) r0;
        r0 = r0.getDefaultDisplay();
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x005e }
        r3 = 13;
        if (r2 < r3) goto L_0x0022;
    L_0x001b:
        r0.getSize(r1);	 Catch:{ RuntimeException -> 0x0060 }
        r2 = com.whatsapp.wallpaper.CropImage.c;	 Catch:{ RuntimeException -> 0x0060 }
        if (r2 == 0) goto L_0x002e;
    L_0x0022:
        r2 = r0.getWidth();	 Catch:{ RuntimeException -> 0x0060 }
        r1.x = r2;	 Catch:{ RuntimeException -> 0x0060 }
        r0 = r0.getHeight();	 Catch:{ RuntimeException -> 0x0060 }
        r1.y = r0;	 Catch:{ RuntimeException -> 0x0060 }
    L_0x002e:
        r0 = r4.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        r2 = 2;
        if (r0 != r2) goto L_0x0043;
    L_0x003b:
        r0 = r1.y;
        r2 = r1.x;
        r1.y = r2;
        r1.x = r0;
    L_0x0043:
        r0 = r1.y;
        r2 = r4.getResources();
        r3 = 2131427329; // 0x7f0b0001 float:1.8476271E38 double:1.05306502E-314;
        r2 = r2.getDimension(r3);
        r2 = (int) r2;
        r3 = com.whatsapp.a4d.a();
        r3 = r3.c();
        r2 = r2 + r3;
        r0 = r0 - r2;
        r1.y = r0;
        return r1;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.k.d(android.content.Context):android.graphics.Point");
    }
}
