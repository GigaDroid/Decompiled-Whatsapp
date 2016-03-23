package com.whatsapp.gallerypicker;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore.Images.Media;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import com.whatsapp.App;
import com.whatsapp.aam;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class GalleryPickerFragment extends Fragment {
    private static final bk[] i;
    private static boolean j;
    private static final String q;
    private static final String[] z;
    private boolean b;
    private int c;
    ArrayList d;
    volatile boolean e;
    private int f;
    private ba g;
    private int h;
    private boolean k;
    private Drawable l;
    private GridView m;
    private Thread n;
    private ContentObserver o;
    private BroadcastReceiver p;
    private View r;
    private Handler s;
    private at t;

    class 3 extends BroadcastReceiver {
        final GalleryPickerFragment a;

        3(GalleryPickerFragment galleryPickerFragment) {
            this.a = galleryPickerFragment;
        }

        public void onReceive(Context context, Intent intent) {
            GalleryPickerFragment.a(this.a, intent);
        }
    }

    static ba d(GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.g;
    }

    static void a(GalleryPickerFragment galleryPickerFragment, boolean z, boolean z2) {
        galleryPickerFragment.a(z, z2);
    }

    static void a(GalleryPickerFragment galleryPickerFragment, int i, View view) {
        galleryPickerFragment.a(i, view);
    }

    private void a(boolean z, boolean z2, boolean z3) {
        Log.i(z[17] + this.h + z[14] + z + z[15] + z2 + z[16] + this.b + z[13] + this.k);
        if (z != this.b || z2 != this.k || z3) {
            l();
            this.b = z;
            this.k = z2;
            a(this.k);
            if (this.b) {
                f();
                if (MediaGalleryFragmentBase.e == 0) {
                    return;
                }
            }
            k();
            g();
        }
    }

    private void n() {
        m();
        if (!this.e) {
            c();
            if (!this.e) {
                e();
                if (!this.e) {
                    b();
                    if (!this.e) {
                        this.s.post(new b_(this));
                    }
                }
            }
        }
    }

    private e a(int i, String str, ContentResolver contentResolver) {
        e a = b3.a(contentResolver, ar.EXTERNAL, i, 2, str);
        this.d.add(a);
        return a;
    }

    private void h() {
        int i = MediaGalleryFragmentBase.e;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a();
            if (i != 0) {
                break;
            }
        }
        this.d.clear();
    }

    static ContentResolver g(GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.d();
    }

    private ContentResolver d() {
        Activity activity = getActivity();
        return activity == null ? null : activity.getContentResolver();
    }

    static void a(GalleryPickerFragment galleryPickerFragment, bt btVar) {
        galleryPickerFragment.a(btVar);
    }

    static int c(GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.h;
    }

    private void o() {
        int i = MediaGalleryFragmentBase.e;
        if (this.g != null) {
            l();
            this.g.b();
            this.g = null;
            getActivity().unregisterReceiver(this.p);
            d().unregisterContentObserver(this.o);
            int i2 = 0;
            while (i2 < this.m.getChildCount()) {
                View childAt = this.m.getChildAt(i2);
                if (childAt instanceof FrameLayout) {
                    FrameLayout frameLayout = (FrameLayout) childAt;
                    int i3 = 0;
                    while (i3 < frameLayout.getChildCount()) {
                        View childAt2 = frameLayout.getChildAt(i3);
                        if (childAt2 instanceof SquareImageView) {
                            ((SquareImageView) childAt2).setImageDrawable(null);
                        }
                        int i4 = i3 + 1;
                        if (i != 0) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                int i5 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i5;
            }
            this.t = null;
            this.m.setAdapter(null);
        }
    }

    private void a(Intent intent) {
        int i = MediaGalleryFragmentBase.e;
        String action = intent.getAction();
        if (action.equals(z[3])) {
            Log.i(z[10]);
            if (i == 0) {
                return;
            }
        }
        if (action.equals(z[4])) {
            Log.i(z[11]);
            a(true, false);
            if (i == 0) {
                return;
            }
        }
        if (action.equals(z[6])) {
            Log.i(z[8]);
            a(false, true);
            if (i == 0) {
                return;
            }
        }
        if (action.equals(z[2])) {
            Log.i(z[7]);
            a(false, false);
            if (i == 0) {
                return;
            }
        }
        if (action.equals(z[5])) {
            Log.i(z[9]);
            a(true, false);
        }
    }

    private void a(ContextMenu contextMenu, ContextMenuInfo contextMenuInfo) {
    }

    private void i() {
        this.t = new at(this, getActivity().getLayoutInflater());
        this.m.setAdapter(this.t);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(z[25]);
        intentFilter.addAction(z[21]);
        intentFilter.addAction(z[24]);
        intentFilter.addAction(z[22]);
        intentFilter.addAction(z[23]);
        intentFilter.addDataScheme(z[26]);
        getActivity().registerReceiver(this.p, intentFilter);
        d().registerContentObserver(Media.EXTERNAL_CONTENT_URI, true, this.o);
        this.g = new ba(d(), this.s);
        this.b = false;
        this.k = false;
        g();
    }

    static void a(GalleryPickerFragment galleryPickerFragment, boolean z) {
        galleryPickerFragment.a(z);
    }

    static int b(GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r15 = this;
        r14 = 3;
        r13 = 2;
        r9 = 0;
        r10 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = i;
        r11 = r0.length;
        r12 = new com.whatsapp.gallerypicker.e[r11];
        r8 = r9;
    L_0x000b:
        if (r8 >= r11) goto L_0x001e;
    L_0x000d:
        r0 = i;
        r1 = r0[r8];
        r0 = r1.c;
        r2 = r15.h;
        r0 = r0 & r2;
        if (r0 != 0) goto L_0x001a;
    L_0x0018:
        if (r10 == 0) goto L_0x009f;
    L_0x001a:
        r0 = r15.e;
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return;
    L_0x001f:
        r0 = r1.c;
        r2 = r15.h;
        r0 = r0 & r2;
        r2 = r1.b;
        r3 = r15.d();
        r0 = r15.a(r0, r2, r3);
        r12[r8] = r0;
        r0 = r12[r8];
        r0 = r0.b();
        if (r0 == 0) goto L_0x003f;
    L_0x0038:
        r0 = r12[r8];
        r0.a();
        if (r10 == 0) goto L_0x009f;
    L_0x003f:
        if (r8 != r13) goto L_0x0056;
    L_0x0041:
        r0 = r12[r9];
        r0 = r0.e();
        r2 = r12[r13];
        r2 = r2.e();
        if (r0 != r2) goto L_0x0056;
    L_0x004f:
        r0 = r12[r8];
        r0.a();
        if (r10 == 0) goto L_0x009f;
    L_0x0056:
        if (r8 != r14) goto L_0x006e;
    L_0x0058:
        r0 = 1;
        r0 = r12[r0];
        r0 = r0.e();
        r2 = r12[r14];
        r2 = r2.e();
        if (r0 != r2) goto L_0x006e;
    L_0x0067:
        r0 = r12[r8];
        r0.a();
        if (r10 == 0) goto L_0x009f;
    L_0x006e:
        r0 = new com.whatsapp.gallerypicker.bt;
        r2 = r1.d;
        r3 = r15.h;
        r4 = r1.b;
        r5 = r15.getResources();
        r1 = r1.a;
        r5 = r5.getString(r1);
        r1 = r12[r8];
        r6 = r1.a(r9);
        r1 = r12[r8];
        r7 = r1.e();
        r1 = r15;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r12[r8];
        r1.a();
        r1 = r15.s;
        r2 = new com.whatsapp.gallerypicker.g;
        r2.<init>(r15, r0);
        r1.post(r2);
    L_0x009f:
        r0 = r8 + 1;
        if (r10 != 0) goto L_0x001e;
    L_0x00a3:
        r8 = r0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.GalleryPickerFragment.c():void");
    }

    private void a() {
        if (!this.k && getActivity() != null && this.t.c.size() == 0) {
            f();
        }
    }

    static void a(GalleryPickerFragment galleryPickerFragment, Intent intent) {
        galleryPickerFragment.a(intent);
    }

    static boolean j() {
        return j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
        r11 = this;
        r8 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = r11.b;
        if (r0 != 0) goto L_0x0016;
    L_0x0006:
        r0 = r11.d();
        r1 = com.whatsapp.gallerypicker.ar.EXTERNAL;
        r2 = r11.h;
        r3 = 2;
        r4 = 0;
        r0 = com.whatsapp.gallerypicker.b3.a(r0, r1, r2, r3, r4);
        if (r8 == 0) goto L_0x001a;
    L_0x0016:
        r0 = com.whatsapp.gallerypicker.b3.c();
    L_0x001a:
        r1 = r11.e;
        if (r1 == 0) goto L_0x0022;
    L_0x001e:
        r0.a();
    L_0x0021:
        return;
    L_0x0022:
        r1 = r0.c();
        r2 = new java.util.ArrayList;
        r1 = r1.entrySet();
        r2.<init>(r1);
        r1 = new com.whatsapp.gallerypicker.ay;
        r1.<init>(r11);
        java.util.Collections.sort(r2, r1);
        r0.a();
        r0 = r11.e;
        if (r0 != 0) goto L_0x0021;
    L_0x003e:
        r9 = r2.iterator();
    L_0x0042:
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x0021;
    L_0x0048:
        r0 = r9.next();
        r1 = r0;
        r1 = (java.util.Map.Entry) r1;
        r4 = r1.getKey();
        r4 = (java.lang.String) r4;
        if (r4 != 0) goto L_0x0059;
    L_0x0057:
        if (r8 == 0) goto L_0x0042;
    L_0x0059:
        r0 = r11.e;
        if (r0 != 0) goto L_0x0021;
    L_0x005d:
        r0 = q;
        r0 = r4.equals(r0);
        if (r0 != 0) goto L_0x009a;
    L_0x0065:
        r0 = r11.h;
        r2 = r11.d();
        r10 = r11.a(r0, r4, r2);
        r0 = r10.b();
        if (r0 != 0) goto L_0x0097;
    L_0x0075:
        r0 = new com.whatsapp.gallerypicker.bt;
        r2 = 5;
        r3 = r11.h;
        r5 = r1.getValue();
        r5 = (java.lang.String) r5;
        r1 = 0;
        r6 = r10.a(r1);
        r7 = r10.e();
        r1 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.s;
        r2 = new com.whatsapp.gallerypicker.bj;
        r2.<init>(r11, r0);
        r1.post(r2);
    L_0x0097:
        r10.a();
    L_0x009a:
        if (r8 == 0) goto L_0x0042;
    L_0x009c:
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.GalleryPickerFragment.e():void");
    }

    static int f(GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.f;
    }

    public GalleryPickerFragment() {
        this.h = 1;
        this.s = new Handler(Looper.getMainLooper());
        this.e = false;
        this.d = new ArrayList();
    }

    private void m() {
        this.s.post(new a(this, b3.a(d())));
    }

    private void a(boolean z) {
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.h = getArguments().getInt(z[19]);
        this.c = getResources().getColor(2131624017);
        this.l = new ColorDrawable(this.c);
        this.f = getResources().getDimensionPixelSize(2131427487);
        this.m = (GridView) getView().findViewById(2131755669);
        if (j && !App.a1()) {
            this.m.setHorizontalSpacing(0);
        }
        this.m.setOnItemClickListener(new a1(this));
        this.m.setOnCreateContextMenuListener(new au(this));
        this.p = new 3(this);
        this.o = new aj(this, this.s);
        i();
    }

    static void a(GalleryPickerFragment galleryPickerFragment, ContextMenu contextMenu, ContextMenuInfo contextMenuInfo) {
        galleryPickerFragment.a(contextMenu, contextMenuInfo);
    }

    private void a(int i, View view) {
        ((bt) this.t.c.get(i)).a(getActivity(), view);
    }

    private void a(bt btVar) {
        if (getActivity() != null) {
            if (this.t.getCount() == 0) {
                k();
            }
            this.t.a(btVar);
            this.t.a();
        }
    }

    private void a(boolean z, boolean z2) {
        a(z, z2, false);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2130903185, viewGroup, false);
    }

    static void h(GalleryPickerFragment galleryPickerFragment) {
        galleryPickerFragment.n();
    }

    public void onDestroy() {
        Log.i(z[0] + this.h + z[1]);
        super.onDestroy();
        o();
        ba.c();
    }

    static Drawable a(GalleryPickerFragment galleryPickerFragment) {
        return galleryPickerFragment.l;
    }

    static {
        String[] strArr = new String[27];
        String str = "=d1gq(|-bw1`/$";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
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
                        i4 = 5;
                        break;
                    case at.i /*2*/:
                        i4 = 93;
                        break;
                    case at.o /*3*/:
                        i4 = 11;
                        break;
                    default:
                        i4 = 20;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = ";k9y{3asbz.`3\u007f:;f)b{4+\u0010NP\u0013D\u0002XW\u001bK\u0013NF\u0005C\u0014E]\tM\u0018O";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = ";k9y{3asbz.`3\u007f:;f)b{4+\u0010NP\u0013D\u0002F[\u000fK\tNP";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = ";k9y{3asbz.`3\u007f:;f)b{4+\u0010NP\u0013D\u0002^Z\u0017J\bE@\u001fA";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = ";k9y{3asbz.`3\u007f:;f)b{4+\u0010NP\u0013D\u0002N^\u001fF\t";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = ";k9y{3asbz.`3\u007f:;f)b{4+\u0010NP\u0013D\u0002XW\u001bK\u0013NF\u0005V\tJF\u000e@\u0019";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "=d1gq(|-bw1`/$f?f8bb?h8o};g/du>f<x`uD\u001e_]\u0015K\u0002FQ\u001eL\u001cTG\u0019D\u0013EQ\bZ\u001bBZ\u0013V\u0015NP";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "=d1gq(|-bw1`/$f?f8bb?h8o};g/du>f<x`uD\u001e_]\u0015K\u0002FQ\u001eL\u001cTG\u0019D\u0013EQ\bZ\u000e_U\bQ\u0018O";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "=d1gq(|-bw1`/$f?f8bb?h8o};g/du>f<x`uD\u001e_]\u0015K\u0002FQ\u001eL\u001cTQ\u0010@\u001e_";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "=d1gq(|-bw1`/$f?f8bb?h8o};g/du>f<x`uD\u001e_]\u0015K\u0002FQ\u001eL\u001cTY\u0015P\u0013_Q\u001e";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "=d1gq(|-bw1`/$f?f8bb?h8o};g/du>f<x`uD\u001e_]\u0015K\u0002FQ\u001eL\u001cTA\u0014H\u0012^Z\u000e@\u0019";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u001dd1gq(|\rbw1`/+C5w6nf";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "zj1og9d3e}4bg";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "uw8iu1`}~z7j(e`?ag";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "zv>jz4l3l.";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "zj1oa4h2~z.`91";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "=d1gq(|-bw1`/$";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "=d1gq(|-bw1`/$~5l3+}4q8yf/u)np";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "3k>ga>`";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "9j3\u007fq4qg$;9j0%c2d)xu*us{f5s4oq(+0np3dria9n8\u007fg";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = ";k9y{3asbz.`3\u007f:;f)b{4+\u0010NP\u0013D\u0002^Z\u0017J\bE@\u001fA";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = ";k9y{3asbz.`3\u007f:;f)b{4+\u0010NP\u0013D\u0002XW\u001bK\u0013NF\u0005C\u0014E]\tM\u0018O";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = ";k9y{3asbz.`3\u007f:;f)b{4+\u0010NP\u0013D\u0002N^\u001fF\t";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = ";k9y{3asbz.`3\u007f:;f)b{4+\u0010NP\u0013D\u0002XW\u001bK\u0013NF\u0005V\tJF\u000e@\u0019";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = ";k9y{3asbz.`3\u007f:;f)b{4+\u0010NP\u0013D\u0002F[\u000fK\tNP";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "<l1n";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    boolean z;
                    strArr2[i2] = str;
                    z = strArr3;
                    if (!aam.a || VERSION.SDK_INT >= 21) {
                        z = false;
                    } else {
                        z = true;
                    }
                    j = z;
                    q = b3.a;
                    i = new bk[]{new bk(2, 1, b3.a, 2131231158), new bk(3, 4, b3.a, 2131231160), new bk(0, 1, null, 2131230799), new bk(1, 4, null, 2131230801)};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "ua8x`(j$";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private void k() {
        if (this.r != null) {
            this.r.setVisibility(8);
        }
    }

    static boolean b(GalleryPickerFragment galleryPickerFragment, boolean z) {
        galleryPickerFragment.k = z;
        return z;
    }

    private void g() {
        this.e = false;
        this.n = new bi(this, z[12]);
        m.a().b(this.n);
        this.n.start();
    }

    private void l() {
        if (this.n != null) {
            m.a().a(this.n, d());
            this.e = true;
            try {
                this.n.join();
            } catch (InterruptedException e) {
                Log.i(z[18]);
            }
            this.n = null;
            this.s.removeMessages(0);
            this.t.b();
            this.t.a();
            h();
        }
    }

    static void e(GalleryPickerFragment galleryPickerFragment) {
        galleryPickerFragment.a();
    }

    private void f() {
        if (this.r == null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(2131755624);
            getActivity().getLayoutInflater().inflate(2130903187, viewGroup);
            this.r = viewGroup.findViewById(2131755671);
        }
        this.r.setVisibility(0);
    }

    private void b() {
        int i = MediaGalleryFragmentBase.e;
        Cursor query = d().query(Uri.parse(z[20]), null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!this.e || i != 0) {
                    h lVar;
                    if (this.h == 4) {
                        lVar = new l(d(), 2, string);
                    } else {
                        lVar = new k(d(), 2, string);
                    }
                    if (!lVar.b()) {
                        this.s.post(new b1(this, new bt(this, 6, this.h, string, string2, lVar.a(0), lVar.e())));
                    }
                    lVar.a();
                    if (i != 0) {
                        break;
                    }
                }
                break;
            }
            query.close();
        }
    }
}
