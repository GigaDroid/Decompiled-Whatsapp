package com.whatsapp.gallerypicker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.arj;
import com.whatsapp.gallerypicker.MediaGalleryFragmentBase.MediaItemView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class MediaPickerFragment extends MediaGalleryFragmentBase {
    private static final String[] I;
    private ActionMode A;
    private long B;
    private int C;
    private View D;
    private Callback E;
    private HashMap F;
    private HashMap G;
    private boolean H;
    private HashMap t;
    private String u;
    private HashMap v;
    private boolean w;
    private HashSet x;
    private BroadcastReceiver y;
    private int z;

    class 3 extends BroadcastReceiver {
        private static final String[] z;
        final MediaPickerFragment a;

        static {
            String[] strArr = new String[10];
            String str = "A6\u0000\u0007\u0004I<J\u001c\u0005T=\n\u0001EA;\u0010\u001c\u0004Nv)0/i\u0019;8$u\u001600/";
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
                            i3 = 32;
                            break;
                        case at.g /*1*/:
                            i3 = 88;
                            break;
                        case at.i /*2*/:
                            i3 = 100;
                            break;
                        case at.o /*3*/:
                            i3 = 117;
                            break;
                        default:
                            i3 = arj.Theme_seekBarStyle;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "M=\u0000\u001c\nP1\u0007\u001e\u000eR>\u0016\u0014\fM=\n\u0001DR=\u0007\u0010\u0002V=\t\u0010\u000fI9\u0006\u0007\u0004A<\u0007\u0014\u0018Tw%6?i\u0017**&e\u001c-44e\u0012!6?";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "M=\u0000\u001c\nP1\u0007\u001e\u000eR>\u0016\u0014\fM=\n\u0001DR=\u0007\u0010\u0002V=\t\u0010\u000fI9\u0006\u0007\u0004A<\u0007\u0014\u0018Tw%6?i\u0017**&e\u001c-44m\u00171;?e\u001c";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "A6\u0000\u0007\u0004I<J\u001c\u0005T=\n\u0001EA;\u0010\u001c\u0004Nv)0/i\u0019;&(a\u0016*09\u007f\u001e-;\"s\u0010!1";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "M=\u0000\u001c\nP1\u0007\u001e\u000eR>\u0016\u0014\fM=\n\u0001DR=\u0007\u0010\u0002V=\t\u0010\u000fI9\u0006\u0007\u0004A<\u0007\u0014\u0018Tw%6?i\u0017**&e\u001c-44u\u0016):>n\f!1";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "M=\u0000\u001c\nP1\u0007\u001e\u000eR>\u0016\u0014\fM=\n\u0001DR=\u0007\u0010\u0002V=\t\u0010\u000fI9\u0006\u0007\u0004A<\u0007\u0014\u0018Tw%6?i\u0017**&e\u001c-44s\u001b%;%e\n;&?a\n00/";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "M=\u0000\u001c\nP1\u0007\u001e\u000eR>\u0016\u0014\fM=\n\u0001DR=\u0007\u0010\u0002V=\t\u0010\u000fI9\u0006\u0007\u0004A<\u0007\u0014\u0018Tw%6?i\u0017**&e\u001c-44s\u001b%;%e\n;3\"n\u00117=.d";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "A6\u0000\u0007\u0004I<J\u001c\u0005T=\n\u0001EA;\u0010\u001c\u0004Nv)0/i\u0019; %m\u00171;?e\u001c";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "A6\u0000\u0007\u0004I<J\u001c\u0005T=\n\u0001EA;\u0010\u001c\u0004Nv)0/i\u0019;0!e\u001b0";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "A6\u0000\u0007\u0004I<J\u001c\u0005T=\n\u0001EA;\u0010\u001c\u0004Nv)0/i\u0019;&(a\u0016*09\u007f\u000b049t\u001d ";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        3(MediaPickerFragment mediaPickerFragment) {
            this.a = mediaPickerFragment;
        }

        public void onReceive(Context context, Intent intent) {
            int i = MediaGalleryFragmentBase.e;
            String action = intent.getAction();
            if (action.equals(z[0])) {
                Log.i(z[3]);
                if (i == 0) {
                    return;
                }
            }
            if (action.equals(z[8])) {
                Log.i(z[5]);
                this.a.a(true, false);
                if (i == 0) {
                    return;
                }
            }
            if (action.equals(z[1])) {
                Log.i(z[6]);
                this.a.a(false, true);
                if (i == 0) {
                    return;
                }
            }
            if (action.equals(z[4])) {
                Log.i(z[7]);
                this.a.a(false, false);
                if (i == 0) {
                    return;
                }
            }
            if (action.equals(z[9])) {
                Log.i(z[2]);
                this.a.a(true, false);
            }
        }
    }

    public class MediaItemPickerView extends MediaItemView {
        protected Paint d;

        public MediaItemPickerView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public MediaItemPickerView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public MediaItemPickerView(Context context) {
            super(context);
        }

        public MediaItemPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }

        public void a(Canvas canvas) {
            int i = MediaGalleryFragmentBase.e;
            super.a(canvas);
            if (this.c != null && ag.c(this.c)) {
                if (this.d == null) {
                    this.d = new Paint();
                    this.d.setAntiAlias(true);
                    this.d.setColor(-1442840576);
                }
                int height = getHeight();
                int i2 = height / 7;
                int i3 = 0;
                while (i3 < height) {
                    canvas.drawRect((float) (i2 / 4), (float) ((i2 / 4) + i3), (float) ((i2 * 3) / 4), (float) (((i2 * 3) / 4) + i3), this.d);
                    int i4 = i3 + i2;
                    if (i == 0) {
                        i3 = i4;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    static {
        String[] strArr = new String[43];
        String str = ",D\u001d10,y\u001a!3>";
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
                        i3 = 91;
                        break;
                    case at.g /*1*/:
                        i3 = 45;
                        break;
                    case at.i /*2*/:
                        i3 = 115;
                        break;
                    case at.o /*3*/:
                        i3 = 85;
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
                    str = "6H\u0017<>+D\u0010>:)K\u0001486H\u001d!p+L\u0006&:";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "-C\u0017{>5I\u0001:6?\u0003\u0010 -(B\u0001{;2_\\#6?H\u001c";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "-D\u001700t\u0007";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "8L\u0003!64C\u0000";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "8_\u001c%->N\u0007&";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ":C\u0017'02I]<1/H\u001d!q>U\u0007'>u~'\u0007\u001a\u001a`";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ")B\u00074+2B\u001d&";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "8_\u001c%*)D\u0000";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "9X\u0010>:/d\u0017";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "9X\u0010>:/d\u0017";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "9X\u0010>:/d\u0017";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "1D\u0017";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "8_\u001c%->N\u0007&";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ")B\u00074+2B\u001d&";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "8_\u001c%*)D\u0000";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "9X\u0010>:/r\u0006'6";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ":C\u0017'02I]<1/H\u001d!q>U\u0007'>u~'\u0007\u001a\u001a`";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ":C\u0017'02I]<1/H\u001d!q>U\u0007'>u~'\u0007\u001a\u001a`";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "9X\u0010>:/r\u0006'6";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "6L\u000b\n6/H\u001e&";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ":C\u0017'02I]<1/H\u001d!q>U\u0007'>u~'\u0007\u001a\u001a`";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "8L\u0003!64C\u0000";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "2@\u00122:t\u0007";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "-C\u0017{>5I\u0001:6?\u0003\u0010 -(B\u0001{;2_\\<2:J\u0016";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "6L\u000b\n6/H\u001e&";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "1D\u0017";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = ":C\u0017'02I]<1/H\u001d!q>U\u0007'>u~'\u0007\u001a\u001a`";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = ":C\u0017'02I]<1/H\u001d!q>U\u0007'>u^\u001a/:\u0017D\u001e<+";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = ":C\u0017'02I]<1/H\u001d!q>U\u0007'>u~'\u0007\u001a\u001a`";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "6H\u0017<>+D\u0010>:)K\u0001486H\u001d!p8_\u00164+>\u0002";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "6H\u0017<>+D\u0010>:)K\u0001486H\u001d!p8_\u00164+>";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "+_\u0016#6>Z";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ":C\u0017'02I]<1/H\u001d!q:N\u0007<05\u0003>\u0010\u001b\u0012l,\u0000\u0011\u0016b&\u001b\u000b\u001ei";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = ":C\u0017'02I]<1/H\u001d!q:N\u0007<05\u0003>\u0010\u001b\u0012l,\u0006\u001c\u001ac=\u0010\r\u0004~'\u0014\r\u000fh7";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = ":C\u0017'02I]<1/H\u001d!q:N\u0007<05\u0003>\u0010\u001b\u0012l,\u0006\u001c\u001ac=\u0010\r\u0004k:\u001b\u0016\be6\u0011";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "6H\u0017<>+D\u0010>:)K\u0001486H\u001d!p)H\u0000 2>";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "=D\u001f0";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = ":C\u0017'02I]<1/H\u001d!q:N\u0007<05\u0003>\u0010\u001b\u0012l,\u0018\u0010\u000ec'\u0010\u001b";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = ":C\u0017'02I]<1/H\u001d!q:N\u0007<05\u0003>\u0010\u001b\u0012l,\u0010\u0015\u001en'";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = ":C\u0017'02I]<1/H\u001d!q>U\u0007'>u~'\u0007\u001a\u001a`";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "6H\u0017<>+D\u0010>:)K\u0001486H\u001d!p?H\u0000!-4T";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    I = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "2C\u00109*?H,8:?D\u0012";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public MediaPickerFragment() {
        this.w = true;
        this.H = false;
        this.B = Long.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.y = null;
        this.x = new HashSet();
        this.G = new HashMap();
        this.v = new HashMap();
        this.t = new HashMap();
        this.F = new HashMap();
        this.E = new a6(this);
    }

    public MediaItemView c() {
        return new MediaItemPickerView(getActivity());
    }

    static void a(MediaPickerFragment mediaPickerFragment, f fVar) {
        mediaPickerFragment.a(fVar);
    }

    static ActionMode a(MediaPickerFragment mediaPickerFragment, ActionMode actionMode) {
        mediaPickerFragment.A = actionMode;
        return actionMode;
    }

    static String c(MediaPickerFragment mediaPickerFragment) {
        return mediaPickerFragment.u;
    }

    public void onDestroy() {
        int i = MediaGalleryFragmentBase.e;
        Log.i(I[42]);
        super.onDestroy();
        this.E = null;
        this.A = null;
        int childCount = this.o.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = ((FrameLayout) this.o.getChildAt(i2)).getChildAt(0);
            if (childAt instanceof MediaItemPickerView) {
                ((MediaItemPickerView) childAt).setImageDrawable(null);
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    protected boolean a(int i) {
        return this.x.contains(this.f.a(i).c());
    }

    static View a(MediaPickerFragment mediaPickerFragment, View view) {
        mediaPickerFragment.D = view;
        return view;
    }

    static Callback d(MediaPickerFragment mediaPickerFragment) {
        return mediaPickerFragment.E;
    }

    public void onPause() {
        Log.i(I[2]);
        super.onPause();
        if (this.y != null) {
            getActivity().unregisterReceiver(this.y);
            this.y = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r8) {
        /*
        r7 = this;
        r6 = 1;
        super.onActivityCreated(r8);
        r0 = I;
        r1 = 32;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        super.onActivityCreated(r8);
        r0 = r7.getActivity();
        r0 = (android.support.v7.app.AppCompatActivity) r0;
        r2 = r0.getIntent();
        r1 = I;
        r3 = 29;
        r1 = r1[r3];
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r4 = r2.getLongExtra(r1, r4);
        r7.B = r4;
        r1 = I;
        r3 = 26;
        r1 = r1[r3];
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = r2.getIntExtra(r1, r3);
        r7.z = r1;
        r1 = I;
        r3 = 33;
        r1 = r1[r3];
        r1 = r2.getBooleanExtra(r1, r6);
        r7.w = r1;
        r1 = I;
        r3 = 27;
        r1 = r1[r3];
        r1 = r2.getStringExtra(r1);
        r7.u = r1;
        r1 = r7.o;
        r3 = new com.whatsapp.gallerypicker.w;
        r3.<init>(r7);
        r1.setOnItemClickListener(r3);
        r1 = r7.z;
        if (r1 <= r6) goto L_0x006a;
    L_0x0060:
        r1 = r7.o;
        r3 = new com.whatsapp.gallerypicker.ac;
        r3.<init>(r7, r0);
        r1.setOnItemLongClickListener(r3);
    L_0x006a:
        r7.a();
        if (r8 == 0) goto L_0x007d;
    L_0x006f:
        r1 = I;
        r3 = 30;
        r1 = r1[r3];
        r1 = r8.getParcelableArrayList(r1);
        r3 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r3 == 0) goto L_0x0087;
    L_0x007d:
        r1 = I;
        r3 = 28;
        r1 = r1[r3];
        r1 = r2.getParcelableArrayListExtra(r1);
    L_0x0087:
        if (r1 == 0) goto L_0x00a6;
    L_0x0089:
        r3 = r1.isEmpty();
        if (r3 != 0) goto L_0x00a6;
    L_0x008f:
        r3 = r7.x;
        r3.clear();
        r3 = r7.x;
        r3.addAll(r1);
        r1 = r7.E;
        r0 = r0.startSupportActionMode(r1);
        r7.A = r0;
        r0 = r7.k;
        r0.notifyDataSetChanged();
    L_0x00a6:
        r0 = r2.getData();
        if (r0 == 0) goto L_0x00da;
    L_0x00ac:
        r0 = r0.toString();
    L_0x00b0:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = I;
        r3 = 31;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r7.setHasOptionsMenu(r6);
        r0 = 0;
        r1 = r7.a();
        r1 = com.whatsapp.gallerypicker.b3.a(r1);
        r7.a(r0, r1);
        return;
    L_0x00da:
        r0 = "";
        goto L_0x00b0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.onActivityCreated(android.os.Bundle):void");
    }

    private void a() {
        this.C = 5;
        DialogToastActivity dialogToastActivity = (DialogToastActivity) getActivity();
        Intent intent = dialogToastActivity.getIntent();
        if (intent != null) {
            Object string;
            String resolveType = intent.resolveType(dialogToastActivity);
            if (resolveType != null) {
                if (a(resolveType)) {
                    this.C = 1;
                    dialogToastActivity.setTitle(2131231693);
                }
                if (b(resolveType)) {
                    this.C = 4;
                    dialogToastActivity.setTitle(2131231694);
                }
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                string = extras.getString(I[0]);
            } else {
                string = null;
            }
            if (!TextUtils.isEmpty(string)) {
                dialogToastActivity.i(string);
            }
            if (extras != null) {
                this.C = extras.getInt(I[1], this.C) & 5;
            }
        }
    }

    private boolean a(String str) {
        return str.equals(I[25]) || str.equals(I[24]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.gallerypicker.f r5) {
        /*
        r4 = this;
        r0 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r5 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r1 = r4.A;
        if (r1 == 0) goto L_0x005f;
    L_0x0009:
        r1 = r4.x;
        r2 = r5.c();
        r1 = r1.contains(r2);
        if (r1 == 0) goto L_0x0020;
    L_0x0015:
        r1 = r4.x;
        r2 = r5.c();
        r1.remove(r2);
        if (r0 == 0) goto L_0x0044;
    L_0x0020:
        r1 = r4.x;
        r1 = r1.size();
        r2 = r4.z;
        if (r1 >= r2) goto L_0x0035;
    L_0x002a:
        r1 = r4.x;
        r2 = r5.c();
        r1.add(r2);
        if (r0 == 0) goto L_0x0044;
    L_0x0035:
        r1 = r4.getActivity();
        r2 = 2131232024; // 0x7f080518 float:1.8080146E38 double:1.0529685264E-314;
        r3 = 0;
        r1 = android.widget.Toast.makeText(r1, r2, r3);
        r1.show();
    L_0x0044:
        r1 = r4.x;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0053;
    L_0x004c:
        r1 = r4.A;
        r1.finish();
        if (r0 == 0) goto L_0x0058;
    L_0x0053:
        r1 = r4.A;
        r1.invalidate();
    L_0x0058:
        r1 = r4.k;
        r1.notifyDataSetChanged();
        if (r0 == 0) goto L_0x0004;
    L_0x005f:
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = r5.c();
        r0.add(r1);
        r4.a(r0);
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.a(com.whatsapp.gallerypicker.f):void");
    }

    static void a(MediaPickerFragment mediaPickerFragment, HashSet hashSet) {
        mediaPickerFragment.a(hashSet);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.x != null) {
            bundle.putParcelableArrayList(I[41], new ArrayList(this.x));
        }
    }

    static HashSet b(MediaPickerFragment mediaPickerFragment) {
        return mediaPickerFragment.x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.whatsapp.gallerypicker.e b(boolean r11) {
        /*
        r10 = this;
        r3 = 0;
        r2 = 2;
        r1 = 1;
        r5 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = r10.getActivity();
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r3;
    L_0x000c:
        r0 = r0.getIntent();
        r6 = r0.getData();
        if (r6 == 0) goto L_0x0089;
    L_0x0016:
        r0 = r6.toString();
    L_0x001a:
        r4 = com.whatsapp.gallerypicker.k.i;
        r4 = r4.toString();
        r0 = r0.startsWith(r4);
        if (r0 == 0) goto L_0x005f;
    L_0x0026:
        r0 = r10.C;
        r4 = 4;
        if (r0 != r4) goto L_0x0045;
    L_0x002b:
        r4 = new com.whatsapp.gallerypicker.l;
        r7 = r10.a();
        r0 = r10.H;
        if (r0 == 0) goto L_0x008d;
    L_0x0035:
        r0 = r1;
    L_0x0036:
        r8 = I;
        r9 = 12;
        r8 = r8[r9];
        r8 = r6.getQueryParameter(r8);
        r4.<init>(r7, r0, r8);
        if (r5 == 0) goto L_0x0097;
    L_0x0045:
        r4 = new com.whatsapp.gallerypicker.k;
        r7 = r10.a();
        r0 = r10.H;
        if (r0 == 0) goto L_0x008f;
    L_0x004f:
        r0 = r1;
    L_0x0050:
        r8 = I;
        r9 = 11;
        r8 = r8[r9];
        r8 = r6.getQueryParameter(r8);
        r4.<init>(r7, r0, r8);
        if (r5 == 0) goto L_0x0095;
    L_0x005f:
        if (r11 != 0) goto L_0x0067;
    L_0x0061:
        r0 = com.whatsapp.gallerypicker.b3.b();
        if (r5 == 0) goto L_0x007f;
    L_0x0067:
        r4 = com.whatsapp.gallerypicker.ar.EXTERNAL;
        r5 = r10.C;
        r0 = r10.H;
        if (r0 == 0) goto L_0x0091;
    L_0x006f:
        if (r6 == 0) goto L_0x0093;
    L_0x0071:
        r0 = I;
        r2 = 10;
        r0 = r0[r2];
        r0 = r6.getQueryParameter(r0);
    L_0x007b:
        r0 = com.whatsapp.gallerypicker.b3.a(r4, r5, r1, r0);
    L_0x007f:
        r1 = r10.a();
        r0 = com.whatsapp.gallerypicker.b3.a(r1, r0);
    L_0x0087:
        r3 = r0;
        goto L_0x000b;
    L_0x0089:
        r0 = "";
        goto L_0x001a;
    L_0x008d:
        r0 = r2;
        goto L_0x0036;
    L_0x008f:
        r0 = r2;
        goto L_0x0050;
    L_0x0091:
        r1 = r2;
        goto L_0x006f;
    L_0x0093:
        r0 = r3;
        goto L_0x007b;
    L_0x0095:
        r0 = r4;
        goto L_0x0087;
    L_0x0097:
        r0 = r4;
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.b(boolean):com.whatsapp.gallerypicker.e");
    }

    public void onResume() {
        Log.i(I[37]);
        super.onResume();
        IntentFilter intentFilter = new IntentFilter(I[39]);
        intentFilter.addAction(I[34]);
        intentFilter.addAction(I[35]);
        intentFilter.addAction(I[36]);
        intentFilter.addAction(I[40]);
        intentFilter.addDataScheme(I[38]);
        this.y = new 3(this);
        getActivity().registerReceiver(this.y, intentFilter);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.z > 1) {
            MenuItemCompat.setShowAsAction(menu.add(0, 2131755048, 0, 2131231858).setIcon(2130839447), 2);
        }
    }

    static ActionMode a(MediaPickerFragment mediaPickerFragment) {
        return mediaPickerFragment.A;
    }

    private boolean b(String str) {
        return str.equals(I[3]) || str.equals(I[4]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.HashSet r13) {
        /*
        r12 = this;
        r11 = 0;
        r10 = -1;
        r9 = 1;
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r13 == 0) goto L_0x000d;
    L_0x0007:
        r0 = r13.isEmpty();
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3.addAll(r13);
        r0 = r12.getActivity();
        r0 = (com.whatsapp.DialogToastActivity) r0;
        r1 = r12.w;
        if (r1 == 0) goto L_0x00e6;
    L_0x0020:
        r1 = r12.C;
        if (r1 != r9) goto L_0x00aa;
    L_0x0024:
        r1 = new android.content.Intent;
        r4 = com.whatsapp.gallerypicker.ImagePreview.class;
        r1.<init>(r0, r4);
        r4 = I;
        r5 = 13;
        r4 = r4[r5];
        r5 = r12.u;
        r1.putExtra(r4, r5);
        r4 = I;
        r5 = 21;
        r4 = r4[r5];
        r5 = r12.z;
        r1.putExtra(r4, r5);
        r4 = I;
        r5 = 19;
        r4 = r4[r5];
        r1.putExtra(r4, r3);
        r4 = I;
        r5 = 15;
        r4 = r4[r5];
        r5 = r12.G;
        r1.putExtra(r4, r5);
        r4 = I;
        r5 = 16;
        r4 = r4[r5];
        r5 = r12.v;
        r1.putExtra(r4, r5);
        r4 = I;
        r5 = 14;
        r4 = r4[r5];
        r5 = r12.t;
        r1.putExtra(r4, r5);
        r4 = I;
        r5 = 23;
        r4 = r4[r5];
        r5 = r12.F;
        r1.putExtra(r4, r5);
        r4 = r12.D;
        if (r4 == 0) goto L_0x00a1;
    L_0x007a:
        r4 = r12.D;
        r5 = r12.D;
        r5 = r5.getLeft();
        r6 = r12.D;
        r6 = r6.getTop();
        r7 = r12.D;
        r7 = r7.getWidth();
        r8 = r12.D;
        r8 = r8.getHeight();
        r4 = android.support.v4.app.ActivityOptionsCompat.makeScaleUpAnimation(r4, r5, r6, r7, r8);
        r4 = r4.toBundle();
        android.support.v4.app.ActivityCompat.startActivityForResult(r0, r1, r9, r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x00a1:
        r4 = r12.getActivity();
        r4.startActivityForResult(r1, r9);
    L_0x00a8:
        if (r2 == 0) goto L_0x000d;
    L_0x00aa:
        r1 = r12.C;
        r4 = 4;
        if (r1 != r4) goto L_0x00bf;
    L_0x00af:
        r1 = r3.get(r11);
        r1 = (android.net.Uri) r1;
        r4 = new com.whatsapp.gallerypicker.o;
        r4.<init>(r12, r0);
        com.whatsapp.util.ag.a(r1, r0, r4);
        if (r2 == 0) goto L_0x000d;
    L_0x00bf:
        r1 = new android.content.Intent;
        r1.<init>();
        r4 = I;
        r5 = 17;
        r4 = r4[r5];
        r5 = r0.getIntent();
        r5 = r5.getData();
        r1.putExtra(r4, r5);
        r4 = I;
        r5 = 18;
        r4 = r4[r5];
        r1.putParcelableArrayListExtra(r4, r3);
        r0.setResult(r10, r1);
        r0.finish();
        if (r2 == 0) goto L_0x000d;
    L_0x00e6:
        r2 = new android.content.Intent;
        r2.<init>();
        r1 = I;
        r4 = 20;
        r1 = r1[r4];
        r4 = r0.getIntent();
        r4 = r4.getData();
        r2.putExtra(r1, r4);
        r1 = I;
        r4 = 22;
        r1 = r1[r4];
        r2.putParcelableArrayListExtra(r1, r3);
        r1 = r3.size();
        if (r1 != r9) goto L_0x011c;
    L_0x010b:
        r1 = r3.get(r11);
        r1 = (android.net.Uri) r1;
    L_0x0111:
        r2.setData(r1);
        r0.setResult(r10, r2);
        r0.finish();
        goto L_0x000d;
    L_0x011c:
        r1 = 0;
        goto L_0x0111;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.a(java.util.HashSet):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
        r7 = this;
        r6 = 1;
        r5 = 2;
        r4 = -1;
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = r7.getActivity();
        r0 = (android.support.v7.app.AppCompatActivity) r0;
        switch(r8) {
            case 1: goto L_0x000f;
            case 2: goto L_0x00b6;
            default: goto L_0x000e;
        };
    L_0x000e:
        return;
    L_0x000f:
        if (r9 != r4) goto L_0x0019;
    L_0x0011:
        r0.setResult(r4, r10);
        r0.finish();
        if (r2 == 0) goto L_0x000e;
    L_0x0019:
        if (r9 != r5) goto L_0x0023;
    L_0x001b:
        r0.setResult(r5);
        r0.finish();
        if (r2 == 0) goto L_0x000e;
    L_0x0023:
        if (r9 != r6) goto L_0x000e;
    L_0x0025:
        r1 = I;
        r3 = 7;
        r1 = r1[r3];
        r1 = r10.getParcelableArrayListExtra(r1);
        r3 = r7.x;
        r3.clear();
        if (r1 == 0) goto L_0x003a;
    L_0x0035:
        r3 = r7.x;
        r3.addAll(r1);
    L_0x003a:
        r1 = r7.A;
        if (r1 != 0) goto L_0x0048;
    L_0x003e:
        r1 = r7.E;
        r1 = r0.startSupportActionMode(r1);
        r7.A = r1;
        if (r2 == 0) goto L_0x004d;
    L_0x0048:
        r1 = r7.A;
        r1.invalidate();
    L_0x004d:
        r1 = I;
        r3 = 8;
        r1 = r1[r3];
        r1 = r10.getSerializableExtra(r1);
        r1 = (java.util.HashMap) r1;
        r7.G = r1;
        r1 = r7.G;
        if (r1 != 0) goto L_0x0066;
    L_0x005f:
        r1 = new java.util.HashMap;
        r1.<init>();
        r7.G = r1;
    L_0x0066:
        r1 = I;
        r3 = 9;
        r1 = r1[r3];
        r1 = r10.getSerializableExtra(r1);
        r1 = (java.util.HashMap) r1;
        r7.v = r1;
        r1 = r7.v;
        if (r1 != 0) goto L_0x007f;
    L_0x0078:
        r1 = new java.util.HashMap;
        r1.<init>();
        r7.v = r1;
    L_0x007f:
        r1 = I;
        r3 = 6;
        r1 = r1[r3];
        r1 = r10.getSerializableExtra(r1);
        r1 = (java.util.HashMap) r1;
        r7.t = r1;
        r1 = r7.t;
        if (r1 != 0) goto L_0x0097;
    L_0x0090:
        r1 = new java.util.HashMap;
        r1.<init>();
        r7.t = r1;
    L_0x0097:
        r1 = I;
        r3 = 5;
        r1 = r1[r3];
        r1 = r10.getSerializableExtra(r1);
        r1 = (java.util.HashMap) r1;
        r7.F = r1;
        r1 = r7.F;
        if (r1 != 0) goto L_0x00af;
    L_0x00a8:
        r1 = new java.util.HashMap;
        r1.<init>();
        r7.F = r1;
    L_0x00af:
        r1 = r7.k;
        r1.notifyDataSetChanged();
        if (r2 == 0) goto L_0x000e;
    L_0x00b6:
        if (r9 == r4) goto L_0x00ba;
    L_0x00b8:
        if (r9 != r6) goto L_0x00c2;
    L_0x00ba:
        r0.setResult(r4, r10);
        r0.finish();
        if (r2 == 0) goto L_0x000e;
    L_0x00c2:
        if (r9 != r5) goto L_0x000e;
    L_0x00c4:
        r0.setResult(r5);
        r0.finish();
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131755048) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A = ((AppCompatActivity) getActivity()).startSupportActionMode(this.E);
        this.k.notifyDataSetChanged();
        return true;
    }
}
