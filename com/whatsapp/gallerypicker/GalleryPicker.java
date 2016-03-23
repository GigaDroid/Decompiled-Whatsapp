package com.whatsapp.gallerypicker;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Media;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.u;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class GalleryPicker extends DialogToastActivity {
    private static final String[] z;
    private int n;
    private int o;

    static {
        String[] strArr = new String[27];
        String str = "\u0006\u00149'L";
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
                        i3 = 112;
                        break;
                    case at.g /*1*/:
                        i3 = 125;
                        break;
                    case at.i /*2*/:
                        i3 = 93;
                        break;
                    case at.o /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 35;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0011\u001390L\u0019\u0019s+M\u0004\u001836\r\u0011\u001e)+L\u001eS\r\u000b`;";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0011\u001390L\u0019\u0019s+M\u0004\u001836\r\u0011\u001e)+L\u001eS\r\u000b`;";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0006\u00149'L_W";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0019\u0010<%F_W";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0013\u00120lT\u0018\u001c)1B\u0000\r\u00022Q\u0015\u001b80F\u001e\u001e81";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0017\u001c1.F\u0002\u0004-+@\u001b\u0018/mG\u0015\u000e)0L\t";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0017\u001c1.F\u0002\u0004-+@\u001b\u0018/+M\u0013\u0011(&F";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001a\u00149";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0011\u001390L\u0019\u0019s+M\u0004\u001836\r\u0011\u001e)+L\u001eS\u000b\u000bf'";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0000\u000f84J\u0015\n";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0017\u001c1.F\u0002\u0004-+@\u001b\u0018/m@\u0002\u0018<6F";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001a\u00149";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0011\u001390L\u0019\u0019s+M\u0004\u001836\r\u0015\u0005)0B^.\t\u0010f10";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0013\u00120lT\u0018\u001c)1B\u0000\r\u00022Q\u0015\u001b80F\u001e\u001e81";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u001d\u001c%\u001dU\u0019\u00198-|\u0003\u0014''";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001d\u001c%\u001dJ\u0004\u001801";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0019\u0013>.V\u0014\u0018\u0002/F\u0014\u0014<";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0012\b>)F\u0004\"(0J";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0000\u000f84J\u0015\n";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001d\u001c%\u001dU\u0019\u00198-|\u0003\u0014''";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001a\u00149";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0017\u001c1.F\u0002\u0004-+@\u001b\u0018/+M\u0013\u0011(&F";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0011\u001390L\u0019\u0019s+M\u0004\u001836\r\u0015\u0005)0B^.\t\u0010f10";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0019\u0013>.V\u0014\u0018\u0002/F\u0014\u0014<";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u001d\u001c%\u001dJ\u0004\u001801";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0006\u00149'L";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public GalleryPicker() {
        this.n = 5;
        this.o = 1;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Intent intent;
        Intent intent2;
        PackageManager packageManager;
        List queryIntentActivities;
        int size;
        SubMenu subMenu;
        int i;
        int i2 = 0;
        int i3 = MediaGalleryFragmentBase.e;
        if (this.o == 4) {
            intent = new Intent(z[2], Media.INTERNAL_CONTENT_URI);
            intent.setType(z[4]);
            if (i3 == 0) {
                intent2 = intent;
                packageManager = getPackageManager();
                queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                size = queryIntentActivities.size();
                if (size > 0) {
                    getMenuInflater().inflate(2131820545, menu);
                    subMenu = menu.findItem(2131755981).getSubMenu();
                    subMenu.clear();
                    menu.findItem(2131756003).setVisible(false);
                    while (i2 < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivities.get(i2);
                        Drawable loadIcon = resolveInfo.loadIcon(packageManager);
                        MenuItem add = subMenu.add(resolveInfo.loadLabel(packageManager));
                        add.setIcon(loadIcon);
                        add.setOnMenuItemClickListener(new n(this, resolveInfo, intent2));
                        i = i2 + 1;
                        if (i3 != 0) {
                            break;
                        }
                        i2 = i;
                    }
                }
                return true;
            }
        }
        intent = new Intent(z[3], Images.Media.INTERNAL_CONTENT_URI);
        intent.setType(z[5]);
        intent2 = intent;
        packageManager = getPackageManager();
        queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
        size = queryIntentActivities.size();
        if (size > 0) {
            getMenuInflater().inflate(2131820545, menu);
            subMenu = menu.findItem(2131755981).getSubMenu();
            subMenu.clear();
            menu.findItem(2131756003).setVisible(false);
            while (i2 < size) {
                ResolveInfo resolveInfo2 = (ResolveInfo) queryIntentActivities.get(i2);
                Drawable loadIcon2 = resolveInfo2.loadIcon(packageManager);
                MenuItem add2 = subMenu.add(resolveInfo2.loadLabel(packageManager));
                add2.setIcon(loadIcon2);
                add2.setOnMenuItemClickListener(new n(this, resolveInfo2, intent2));
                i = i2 + 1;
                if (i3 != 0) {
                    break;
                }
                i2 = i;
            }
        }
        return true;
    }

    static int a(GalleryPicker galleryPicker) {
        return galleryPicker.n;
    }

    static int a(GalleryPicker galleryPicker, int i) {
        galleryPicker.o = i;
        return i;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.j != 3 || i != 84) {
            return super.onKeyDown(i, keyEvent);
        }
        u.a((Activity) this, false);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        r7 = 13;
        r3 = 12;
        r5 = 5;
        r8 = 0;
        r6 = 1;
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = z;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r9.supportRequestWindowFeature(r5);
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x0057;
    L_0x0019:
        r0 = r9.getWindow();
        r0.requestFeature(r7);
        r0.requestFeature(r3);
        r1 = android.transition.TransitionInflater.from(r9);
        r3 = 17760258; // 0x10f0002 float:2.6264958E-38 double:8.7747333E-317;
        r1 = r1.inflateTransition(r3);
        r3 = 16908335; // 0x102002f float:2.387736E-38 double:8.3538275E-317;
        r1.excludeTarget(r3, r6);
        r3 = 16908336; // 0x1020030 float:2.3877364E-38 double:8.353828E-317;
        r1.excludeTarget(r3, r6);
        r0.setExitTransition(r1);
        r1 = android.transition.TransitionInflater.from(r9);
        r3 = 17760259; // 0x10f0003 float:2.626496E-38 double:8.774734E-317;
        r1 = r1.inflateTransition(r3);
        r3 = 16908335; // 0x102002f float:2.387736E-38 double:8.3538275E-317;
        r1.excludeTarget(r3, r6);
        r3 = 16908336; // 0x1020030 float:2.3877364E-38 double:8.353828E-317;
        r1.excludeTarget(r3, r6);
        r0.setReenterTransition(r1);
    L_0x0057:
        super.onCreate(r10);
        r0 = r9.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r6);
        r0 = com.whatsapp.App.a1();
        if (r0 != 0) goto L_0x007e;
    L_0x0067:
        r0 = r9.getSupportActionBar();
        r1 = new com.whatsapp.util.bz;
        r3 = r9.getResources();
        r4 = 2130839457; // 0x7f0207a1 float:1.7283925E38 double:1.0527745725E-314;
        r3 = r3.getDrawable(r4);
        r1.<init>(r3);
        r0.setHomeAsUpIndicator(r1);
    L_0x007e:
        r0 = r9.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r6);
        r0 = r9.getIntent();
        r1 = z;
        r3 = 9;
        r1 = r1[r3];
        r0 = r0.getStringExtra(r1);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x00ce;
    L_0x0099:
        r1 = com.whatsapp.App.as;
        r1 = r1.b(r0);
        r0 = r1.c();
        if (r0 == 0) goto L_0x00bc;
    L_0x00a5:
        r0 = 2131231874; // 0x7f080482 float:1.8079841E38 double:1.0529684523E-314;
        r3 = new java.lang.Object[r6];
        r4 = r1.a(r9);
        r3[r8] = r4;
        r0 = r9.getString(r0, r3);
        if (r2 == 0) goto L_0x00cb;
    L_0x00b6:
        r0 = com.whatsapp.WAAppCompatActivity.c;
        r0 = r0 + 1;
        com.whatsapp.WAAppCompatActivity.c = r0;
    L_0x00bc:
        r0 = 2131231875; // 0x7f080483 float:1.8079843E38 double:1.052968453E-314;
        r3 = new java.lang.Object[r6];
        r1 = r1.a(r9);
        r3[r8] = r1;
        r0 = r9.getString(r0, r3);
    L_0x00cb:
        r9.i(r0);
    L_0x00ce:
        r0 = r9.getIntent();
        r1 = z;
        r3 = 18;
        r1 = r1[r3];
        r0 = r0.getIntExtra(r1, r5);
        r9.n = r0;
        r0 = r9.n;
        if (r0 != r5) goto L_0x00fa;
    L_0x00e2:
        r0 = z;
        r1 = 15;
        r0 = r0[r1];
        r0 = r9.getSharedPreferences(r0, r8);
        r1 = z;
        r3 = 23;
        r1 = r1[r3];
        r0 = r0.getInt(r1, r6);
        r9.o = r0;
        if (r2 == 0) goto L_0x00fe;
    L_0x00fa:
        r0 = r9.n;
        r9.o = r0;
    L_0x00fe:
        r0 = 2130903184; // 0x7f030090 float:1.7413179E38 double:1.052806058E-314;
        r9.setContentView(r0);
        r0 = 2131755457; // 0x7f1001c1 float:1.9141794E38 double:1.0532271366E-314;
        r0 = r9.findViewById(r0);
        r0 = (com.whatsapp.PagerSlidingTabStrip) r0;
        r1 = r9.n;
        if (r1 == r5) goto L_0x0116;
    L_0x0111:
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0116:
        r1 = 2131755458; // 0x7f1001c2 float:1.9141796E38 double:1.053227137E-314;
        r1 = r9.findViewById(r1);
        r1 = (android.support.v4.view.ViewPager) r1;
        r1.setOffscreenPageLimit(r8);
        r3 = new com.whatsapp.gallerypicker.p;
        r4 = r9.getSupportFragmentManager();
        r3.<init>(r9, r4);
        r1.setAdapter(r3);
        r0.setViewPager(r1);
        r4 = new com.whatsapp.gallerypicker.bp;
        r4.<init>(r9, r3);
        r0.setOnPageChangeListener(r4);
        r4 = 2131623943; // 0x7f0e0007 float:1.8875052E38 double:1.05316216E-314;
        r0.setTextColorResource(r4);
        r4 = r9.n;
        if (r4 != r5) goto L_0x015c;
    L_0x0143:
        r4 = r9.o;
        if (r4 != r6) goto L_0x014f;
    L_0x0147:
        r1.setCurrentItem(r8, r8);
        r3.a(r8);
        if (r2 == 0) goto L_0x0162;
    L_0x014f:
        r4 = r9.o;
        r5 = 4;
        if (r4 != r5) goto L_0x0162;
    L_0x0154:
        r1.setCurrentItem(r6, r8);
        r3.a(r6);
        if (r2 == 0) goto L_0x0162;
    L_0x015c:
        r1.setCurrentItem(r8, r8);
        r3.a(r8);
    L_0x0162:
        r1 = r9.getResources();
        r2 = 2131427411; // 0x7f0b0053 float:1.8476437E38 double:1.0530650604E-314;
        r1 = r1.getDimension(r2);
        android.support.v4.view.ViewCompat.setElevation(r0, r1);
        r0 = r9.getIntent();
        r1 = z;
        r2 = 24;
        r1 = r1[r2];
        r1 = r0.getParcelableArrayListExtra(r1);
        r0 = r9.getIntent();
        r2 = z;
        r3 = 19;
        r2 = r2[r3];
        r0 = r0.getParcelableExtra(r2);
        r0 = (android.net.Uri) r0;
        if (r0 == 0) goto L_0x0219;
    L_0x0190:
        r2 = new android.content.Intent;
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r2.<init>(r3, r0);
        r0 = z;
        r3 = 25;
        r0 = r0[r3];
        r3 = r9.o;
        r2.putExtra(r0, r3);
        r0 = z;
        r3 = 11;
        r0 = r0[r3];
        r3 = r9.getIntent();
        r4 = z;
        r5 = 20;
        r4 = r4[r5];
        r3 = r3.getBooleanExtra(r4, r6);
        r2.putExtra(r0, r3);
        r0 = z;
        r0 = r0[r7];
        r3 = r9.getIntent();
        r4 = z;
        r5 = 22;
        r4 = r4[r5];
        r3 = r3.getStringExtra(r4);
        r2.putExtra(r0, r3);
        r0 = z;
        r3 = 16;
        r0 = r0[r3];
        r3 = r9.getIntent();
        r4 = z;
        r5 = 21;
        r4 = r4[r5];
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r4 = r3.getLongExtra(r4, r6);
        r2.putExtra(r0, r4);
        r0 = z;
        r3 = 17;
        r0 = r0[r3];
        r3 = r9.getIntent();
        r4 = z;
        r5 = 26;
        r4 = r4[r5];
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = r3.getIntExtra(r4, r5);
        r2.putExtra(r0, r3);
        r0 = z;
        r3 = 14;
        r0 = r0[r3];
        r2.putExtra(r0, r1);
        r0 = com.whatsapp.gallerypicker.MediaPicker.class;
        r2.setClass(r9, r0);
        r9.startActivityForResult(r2, r8);
    L_0x0219:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.GalleryPicker.onCreate(android.os.Bundle):void");
    }

    static int b(GalleryPicker galleryPicker) {
        return galleryPicker.o;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public void onDestroy() {
        Log.i(z[7]);
        super.onDestroy();
        ba.c();
        getSharedPreferences(z[6], 0).edit().putInt(z[8], this.o).commit();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = MediaGalleryFragmentBase.e;
        switch (i) {
            case v.m /*0*/:
                if (i2 == -1) {
                    if (this.o == 4) {
                        intent.putExtra(z[0], true);
                    }
                    setResult(-1, intent);
                    finish();
                    if (i3 == 0) {
                        return;
                    }
                }
                if (i2 == 2) {
                    setResult(2);
                    finish();
                    if (i3 == 0) {
                        return;
                    }
                }
                return;
                break;
            case at.g /*1*/:
                break;
            default:
                return;
        }
        if (i2 == -1) {
            if (this.o == 4) {
                intent.putExtra(z[1], true);
            }
            setResult(-1, intent);
        }
        finish();
    }

    public void onStop() {
        super.onStop();
    }

    public void onStart() {
        super.onStart();
    }
}
