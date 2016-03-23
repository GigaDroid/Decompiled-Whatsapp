package com.whatsapp;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.MenuItemCompat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.util.at;
import com.whatsapp.util.bq;
import com.whatsapp.util.bz;
import java.util.ArrayList;
import java.util.Collection;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;

public class MediaView extends DialogToastActivity {
    private static final String[] R;
    private Uri A;
    private ArrayList B;
    private Handler C;
    private int D;
    private ImageButton E;
    private int F;
    private boolean G;
    private String H;
    private int I;
    private VoiceNoteSeekBar J;
    private float K;
    private boolean L;
    private TextView M;
    private c3 N;
    private int O;
    private int P;
    private at Q;
    private ai3 n;
    private tm o;
    private boolean p;
    private int q;
    private int r;
    private co s;
    private String t;
    private c8 u;
    private float v;
    private co w;
    private a_d x;
    private MediaViewPager y;
    private Drawable z;

    class 13 extends PhotoView {
        final MediaView R;

        public boolean onDoubleTap(MotionEvent motionEvent) {
            MediaView.b(this.R, e() != g());
            return super.onDoubleTap(motionEvent);
        }

        13(MediaView mediaView, Context context) {
            this.R = mediaView;
            super(context);
        }

        public boolean c(float f, float f2) {
            return super.c(f, f2);
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            MediaView.b(this.R, e() == g());
        }

        public boolean a(float f, float f2) {
            return super.a(f, f2);
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            MediaView.b(this.R, false);
            return super.onScaleBegin(scaleGestureDetector);
        }
    }

    class MediaViewPager extends PhotoViewPager {
        final MediaView f;

        public MediaViewPager(MediaView mediaView, Context context, AttributeSet attributeSet) {
            this.f = mediaView;
            super(context, attributeSet);
            setOnPageChangeListener(new fc(this, mediaView));
            setOnInterceptTouchListener(new qj(this, mediaView));
        }
    }

    static {
        String[] strArr = new String[63];
        String str = "m-\u0001";
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
                        i3 = 7;
                        break;
                    case org.whispersystems.at.g /*1*/:
                        i3 = 68;
                        break;
                    case org.whispersystems.at.i /*2*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case org.whispersystems.at.o /*3*/:
                        i3 = 31;
                        break;
                    default:
                        i3 = 91;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "j!\u0001v:q-\u0000htu+\u0011~/bk\u0017z8u!\u0004k>s,\u0010r9";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case org.whispersystems.at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "H6\fz5s%\u0011v4i";
                    obj = 2;
                    break;
                case org.whispersystems.at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "j!\u0001v:q-\u0000htu+\u0011~/bk\u0017z8u!\u0004k>s,\u0010r9";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "j!\u0001v:q-\u0000htu+\u0011~/b";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "H6\fz5s%\u0011v4i";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.at.m /*5*/:
                    strArr2[i] = str;
                    str = "f(\u0015w:";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "`-\u0001";
                    obj = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "d+\u000bk:d0:j)n";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "p-\u0001k3";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "l!\u001c";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "o!\fx3s";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "j!\u0001v:q-\u0000htd6\u0000~/b";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "'/'";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "'-\u0001%";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "j!\u0001v:q-\u0000hta+\u0010q?*/\u0000f{";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "j!\u0001v:q-\u0000hth*\u0006m>f0\u000004h)Jw>f4El2}!_";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "')\u0000%";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "j!\u0001v:q-\u0000htq-\u0000h{j!\u0016l:`!_";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "i+\u0002~7k!\u0017f";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "m-\u0001";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "o%\u0016@:i-\b~/n+\u000b";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "j!\u0001v:q-\u0000hta+\u0017h:u Jv5q%\tv?*)\u0000l(f#\u0000";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "d+\u000bk:d0";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "j!\u0001v:q-\u0000hta+\u0017h:u Jy:n(\u0000{";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "d+\u000bk:d0";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "m-\u0001";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "l!\u001c";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "o%\u0016@:i-\b~/n+\u000b";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "p-\u0001k3";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    str = "o!\fx3s";
                    obj = 30;
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    strArr2 = strArr3;
                    str = "j!\u0001v:q-\u0000htt0\u0004m/";
                    obj = 31;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "j!\u0001v:q-\u0000htc!\u0016k)h=";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "d+\u000bk:d0:j)n";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "`-\u0001";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "d6\no\u0019~\u000b\u0010k+r06v!b";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "f*\u0001m4n Kv5s!\u000bkuf'\u0011v4ij3V\u001eP";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "`%\ts>u=";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "t'\u0004s>R4,y\u0015b!\u0001z?";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "j!\u0001v:q-\u0000htp%\ts+f4\u0000mtd6\noto!\fx3s~";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "h1\u0011o.s\u001c";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "h1\u0011o.s\u0002\nm6f0";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "t!\u0011@<u+\u0010o\u0004n'\nq";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "n)\u0004x>(n";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "h1\u0011o.s";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "t'\u0004s>";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "m-\u0001";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "a+\u0017h:u ";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "h1\u0011o.s\u001d";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "d+\b1(h*\u001cz)n'\u0016l4ij\u0002~7k!\u0017f";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "f*\u0001m4n Kv5s!\u000bkuf'\u0011v4ij3V\u001eP";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "'8E";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "T+\u000bf";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "f*\u0001m4n Kv5s!\u000bkuf'\u0011v4ij3V\u001eP";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "T+\u000bf";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "d+\b1(h*\u001cz)n'\u0016l4ij\u0002~7k!\u0017fuJ+\u0013v>Q-\u0000h";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "d+\b1(h*\u001cz)n'\u0016l4ij\u0002~7k!\u0017fuJ+\u0013v>Q-\u0000h";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "q-\u0001z4(n";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "j!\u0001v:q-\u0000htt0\no";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "j!\u0001v:q-\u0000htw6\u0000o:u!\u0004j?n+\u0015s:~&\u0004|0(";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "j!\u0001v:q-\u0000htf1\u0001v4' \u0010m:s-\nqa";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "f(\u0015w:";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    R = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "l!\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 8, 0, 2131230800).setIcon(2130839424), 2);
        MenuItemCompat.setShowAsAction(menu.add(0, 10, 0, 2131230989).setIcon(2130839437), 2);
        menu.add(0, 11, 0, 2131230795).setIcon(2130839450);
        menu.add(0, 12, 0, 2131231829).setIcon(2130839451);
        menu.add(0, 9, 0, 2131232015).setIcon(2130839448);
        menu.add(1, 5, 0, 2131231878).setIcon(2130839508);
        menu.add(1, 6, 0, 2131231876).setIcon(2130839513);
        menu.add(1, 1, 0, 2131232191).setIcon(2130839524);
        menu.add(1, 2, 0, 2131232232).setIcon(2130839516);
        menu.add(1, 3, 0, 2131231839).setIcon(2130839518);
        menu.add(1, 4, 0, 2131231840).setIcon(2130839519);
        menu.add(0, 7, 0, 2131231020).setIcon(2130839512);
        return true;
    }

    public void onCreate(Bundle bundle) {
        co coVar = null;
        Log.i(R[13]);
        App.w(getApplicationContext());
        supportRequestWindowFeature(5);
        super.onCreate(bundle);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131624083)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(new a94(this));
        try {
            setContentView(getLayoutInflater().inflate(2130903220, null, false));
            Intent intent = getIntent();
            if (intent == null) {
                try {
                    finish();
                    return;
                } catch (OutOfMemoryError e) {
                    throw e;
                }
            }
            co coVar2;
            co coVar3;
            this.x = new a_d(this, null);
            this.x.start();
            this.t = intent.getStringExtra(R[21]);
            this.G = intent.getBooleanExtra(R[20], false);
            a4p com_whatsapp_a4p = (a4p) intent.getParcelableExtra(R[11]);
            if (com_whatsapp_a4p != null) {
                this.N = com_whatsapp_a4p.a;
                this.B = new ArrayList();
                Log.i(R[16] + this.N.c + R[18] + this.N.a + R[15] + this.N.b);
                co a = App.aK.a(this.N);
                if (a == null) {
                    try {
                        finish();
                        return;
                    } catch (OutOfMemoryError e2) {
                        throw e2;
                    }
                }
                try {
                    this.B.add(a);
                    if (a.c != 2) {
                        if (!(a.c == 3 || a.c == 9)) {
                            coVar2 = null;
                            getSupportActionBar().setDisplayShowTitleEnabled(false);
                            if (this.G) {
                                setSupportProgressBarIndeterminateVisibility(true);
                                this.n = new ai3(this);
                                bq.a(this.n, new Void[0]);
                                coVar3 = coVar2;
                                coVar2 = a;
                            } else {
                                coVar3 = coVar2;
                                coVar2 = a;
                            }
                        }
                    }
                    coVar2 = a;
                    try {
                        getSupportActionBar().setDisplayShowTitleEnabled(false);
                        if (this.G) {
                            coVar3 = coVar2;
                            coVar2 = a;
                        } else {
                            setSupportProgressBarIndeterminateVisibility(true);
                            this.n = new ai3(this);
                            bq.a(this.n, new Void[0]);
                            coVar3 = coVar2;
                            coVar2 = a;
                        }
                    } catch (OutOfMemoryError e22) {
                        throw e22;
                    }
                } catch (OutOfMemoryError e222) {
                    throw e222;
                } catch (OutOfMemoryError e2222) {
                    throw e2222;
                }
            }
            this.B = App.aK.G(this.t);
            coVar2 = null;
            coVar3 = null;
            Log.i(R[19] + this.N);
            this.r = 0;
            PhotoView.O = ((BitmapDrawable) getResources().getDrawable(2130839678)).getBitmap();
            this.C = new p3(this, Looper.getMainLooper());
            if (bundle == null) {
                coVar = coVar3;
            }
            try {
                this.w = coVar;
                this.u = new c8(this, coVar);
                this.y = new MediaViewPager(this, this, null);
                ((ViewGroup) findViewById(2131755766)).addView(this.y);
                this.y.setAdapter(this.u);
                d(this.r);
                if (VERSION.SDK_INT >= 11) {
                    this.y.setSystemUiVisibility(this.D);
                }
                View findViewById = findViewById(2131755766);
                try {
                    this.z = new ColorDrawable(-16777216);
                    findViewById.setBackgroundDrawable(this.z);
                    if (bundle == null && coVar2 != null) {
                        try {
                            if (coVar2.c == (byte) 1) {
                                try {
                                    if (c() && intent.getBooleanExtra(R[22], false)) {
                                        this.s = coVar2;
                                        this.p = true;
                                        View view = this.y;
                                        int intExtra = intent.getIntExtra("x", 0);
                                        int intExtra2 = intent.getIntExtra("y", 0);
                                        int intExtra3 = intent.getIntExtra(R[10], 0);
                                        int intExtra4 = intent.getIntExtra(R[12], 0);
                                        getSupportActionBar().hide();
                                        this.L = false;
                                        view.getViewTreeObserver().addOnPreDrawListener(new y(this, view, intExtra, intExtra2, intExtra3, intExtra4));
                                    }
                                } catch (OutOfMemoryError e22222) {
                                    throw e22222;
                                }
                            }
                        } catch (OutOfMemoryError e222222) {
                            throw e222222;
                        }
                    }
                    if (bundle != null) {
                        try {
                            this.A = (Uri) bundle.getParcelable(R[9]);
                            this.H = bundle.getString(R[8]);
                        } catch (OutOfMemoryError e2222222) {
                            throw e2222222;
                        }
                    }
                    App.b(this.o);
                } catch (OutOfMemoryError e22222222) {
                    throw e22222222;
                } catch (OutOfMemoryError e222222222) {
                    throw e222222222;
                }
            } catch (OutOfMemoryError e2222222222) {
                throw e2222222222;
            }
        } catch (OutOfMemoryError e3) {
            Log.e(R[17] + (Debug.getNativeHeapAllocatedSize() / 1024) + R[14]);
            ag.b();
            a(2131231110);
        }
    }

    private void d(co coVar) {
        View findViewWithTag = this.y.findViewWithTag(coVar.k);
        if (findViewWithTag != null) {
            int i;
            ImageView imageView = (ImageView) findViewWithTag.findViewById(2131755619);
            if (coVar.P) {
                i = 2130839632;
            } else {
                i = 2130839633;
            }
            imageView.setImageResource(i);
        }
    }

    static String d(MediaView mediaView) {
        return mediaView.H;
    }

    static co i(MediaView mediaView, int i) {
        return mediaView.i(i);
    }

    public static boolean c() {
        return VERSION.SDK_INT >= 12;
    }

    static int g(MediaView mediaView, int i) {
        mediaView.I = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.net.Uri r8, int r9, int r10, int r11) {
        /*
        r7 = this;
        r6 = 0;
        if (r8 != 0) goto L_0x0010;
    L_0x0003:
        r1 = 1;
        r3 = 0;
        r0 = r7;
        r2 = r9;
        r4 = r10;
        r5 = r11;
        com.whatsapp.wallpaper.k.a(r0, r1, r2, r3, r4, r5);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0019;
    L_0x0010:
        r2 = -1;
        r0 = r7;
        r1 = r6;
        r3 = r8;
        r4 = r6;
        r5 = r6;
        com.whatsapp.wallpaper.k.a(r0, r1, r2, r3, r4, r5);
    L_0x0019:
        com.whatsapp.util.ag.a(r7, r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.a(android.net.Uri, int, int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r11) {
        /*
        r10 = this;
        r2 = 2131427495; // 0x7f0b00a7 float:1.8476608E38 double:1.053065102E-314;
        r9 = 2;
        r8 = 0;
        r7 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.getItemId();
        switch(r0) {
            case 1: goto L_0x0010;
            case 2: goto L_0x0132;
            case 3: goto L_0x0157;
            case 4: goto L_0x015c;
            case 5: goto L_0x00fa;
            case 6: goto L_0x011d;
            case 7: goto L_0x0161;
            case 8: goto L_0x01ad;
            case 9: goto L_0x0166;
            case 10: goto L_0x016b;
            case 11: goto L_0x0181;
            case 12: goto L_0x0197;
            case 16908332: goto L_0x01f8;
            default: goto L_0x000f;
        };
    L_0x000f:
        return r7;
    L_0x0010:
        r0 = r10.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        if (r0 != r7) goto L_0x004a;
    L_0x001c:
        r0 = r10.getWindow();
        r0 = r0.getDecorView();
        r0 = r0.getHeight();
        r1 = r10.getResources();
        r1 = r1.getDimension(r2);
        r1 = (int) r1;
        r0 = r0 - r1;
        r1 = com.whatsapp.a4d.a();
        r1 = r1.c();
        r1 = r0 - r1;
        r0 = r10.getWindow();
        r0 = r0.getDecorView();
        r0 = r0.getWidth();
        if (r3 == 0) goto L_0x021c;
    L_0x004a:
        r0 = r10.getWindow();
        r0 = r0.getDecorView();
        r0 = r0.getWidth();
        r1 = r10.getResources();
        r1 = r1.getDimension(r2);
        r1 = (int) r1;
        r0 = r0 - r1;
        r1 = com.whatsapp.a4d.a();
        r1 = r1.c();
        r1 = r0 - r1;
        r0 = r10.getWindow();
        r0 = r0.getDecorView();
        r0 = r0.getHeight();
        r2 = r1;
        r1 = r0;
    L_0x0078:
        r0 = r10.r;
        r0 = r10.i(r0);
        r0 = r0.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = R;
        r6 = 40;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r2);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = new android.content.Intent;
        r5 = com.whatsapp.wallpaper.CropImage.class;
        r4.<init>(r10, r5);
        r5 = R;
        r6 = 41;
        r5 = r5[r6];
        r4.putExtra(r5, r1);
        r1 = R;
        r5 = 49;
        r1 = r1[r5];
        r4.putExtra(r1, r2);
        r1 = R;
        r2 = 46;
        r1 = r1[r2];
        r4.putExtra(r1, r7);
        r1 = R;
        r2 = 39;
        r1 = r1[r2];
        r4.putExtra(r1, r7);
        r1 = R;
        r2 = 36;
        r1 = r1[r2];
        r4.putExtra(r1, r7);
        r4.setData(r0);
        r0 = R;
        r1 = 45;
        r0 = r0[r1];
        r1 = com.whatsapp.wallpaper.k.a();
        r4.putExtra(r0, r1);
        r0 = R;
        r1 = 42;
        r0 = r0[r1];
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;
        r1 = r1.toString();
        r4.putExtra(r0, r1);
        r10.startActivityForResult(r4, r8);
        if (r3 == 0) goto L_0x000f;
    L_0x00fa:
        r1 = new android.content.Intent;
        r1.<init>();
        r0 = r10.r;
        r0 = r10.i(r0);
        r0 = r0.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r1.setData(r0);
        r0 = com.whatsapp.App.as;
        r0 = r0.e();
        com.whatsapp.r.a(r1, r0, r10, r7, r10);
        if (r3 == 0) goto L_0x000f;
    L_0x011d:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ContactPicker.class;
        r0.<init>(r10, r1);
        r1 = R;
        r2 = 43;
        r1 = r1[r2];
        r0.putExtra(r1, r7);
        r10.startActivityForResult(r0, r9);
        if (r3 == 0) goto L_0x000f;
    L_0x0132:
        r0 = r10.r;
        r1 = r10.i(r0);
        r0 = r1.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r2 = new android.content.Intent;
        r4 = R;
        r5 = 37;
        r4 = r4[r5];
        r2.<init>(r4);
        r1 = r1.c;
        switch(r1) {
            case 1: goto L_0x0211;
            default: goto L_0x0152;
        };
    L_0x0152:
        com.whatsapp.App.a(r10, r2);
        if (r3 == 0) goto L_0x000f;
    L_0x0157:
        r10.c(r8);
        if (r3 == 0) goto L_0x000f;
    L_0x015c:
        r10.c(r7);
        if (r3 == 0) goto L_0x000f;
    L_0x0161:
        r10.showDialog(r9);
        if (r3 == 0) goto L_0x000f;
    L_0x0166:
        r10.a();
        if (r3 == 0) goto L_0x000f;
    L_0x016b:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ContactPicker.class;
        r0.<init>(r10, r1);
        r1 = R;
        r2 = 48;
        r1 = r1[r2];
        r0.putExtra(r1, r7);
        r1 = 4;
        r10.startActivityForResult(r0, r1);
        if (r3 == 0) goto L_0x000f;
    L_0x0181:
        r0 = r10.r;
        r0 = r10.i(r0);
        r1 = com.whatsapp.App.p;
        r1 = com.whatsapp.App.aK;
        r2 = java.util.Collections.singleton(r0);
        r1.b(r2, r7, r7);
        r10.d(r0);
        if (r3 == 0) goto L_0x000f;
    L_0x0197:
        r0 = r10.r;
        r0 = r10.i(r0);
        r1 = com.whatsapp.App.p;
        r1 = com.whatsapp.App.aK;
        r2 = java.util.Collections.singleton(r0);
        r1.b(r2, r8, r7);
        r10.d(r0);
        if (r3 == 0) goto L_0x000f;
    L_0x01ad:
        r0 = c();
        if (r0 == 0) goto L_0x01d1;
    L_0x01b3:
        r0 = r10.getIntent();
        r1 = R;
        r2 = 38;
        r1 = r1[r2];
        r0 = r0.getBooleanExtra(r1, r8);
        if (r0 == 0) goto L_0x01d1;
    L_0x01c3:
        r0 = r10.s;
        if (r0 == 0) goto L_0x01d1;
    L_0x01c7:
        r0 = new com.whatsapp.kh;
        r0.<init>(r10);
        r10.a(r0);
        if (r3 == 0) goto L_0x000f;
    L_0x01d1:
        r0 = 0;
        r10.s = r0;
        r0 = new android.content.Intent;
        r1 = com.whatsapp.MediaGallery.class;
        r0.<init>(r10, r1);
        r1 = R;
        r2 = 47;
        r1 = r1[r2];
        r2 = r10.t;
        r0.putExtra(r1, r2);
        r1 = new android.support.v4.util.Pair[r8];
        r1 = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(r10, r1);
        r1 = r1.toBundle();
        android.support.v4.app.ActivityCompat.startActivity(r10, r0, r1);
        r10.finish();
        if (r3 == 0) goto L_0x000f;
    L_0x01f8:
        r0 = c();
        if (r0 == 0) goto L_0x020c;
    L_0x01fe:
        r0 = r10.s;
        if (r0 == 0) goto L_0x020c;
    L_0x0202:
        r0 = new com.whatsapp.aeo;
        r0.<init>(r10);
        r10.a(r0);
        if (r3 == 0) goto L_0x000f;
    L_0x020c:
        r10.finish();
        goto L_0x000f;
    L_0x0211:
        r1 = R;
        r4 = 44;
        r1 = r1[r4];
        r2.setDataAndType(r0, r1);
        goto L_0x0152;
    L_0x021c:
        r2 = r1;
        r1 = r0;
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (menu.size() == 0) {
            return false;
        }
        boolean z2;
        boolean z3;
        MenuItem findItem;
        MenuItem findItem2;
        if (this.y != null) {
            co i = i(this.y.getCurrentItem());
            if (i != null) {
                if (i.c == (byte) 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = i.P;
                z3 = z2;
                z2 = z4;
                menu.setGroupVisible(1, z3);
                findItem = menu.findItem(7);
                if (this.y == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                findItem.setVisible(z3);
                findItem = menu.findItem(9);
                if (this.y == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                findItem.setVisible(z3);
                findItem = menu.findItem(10);
                if (this.y == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                findItem.setVisible(z3);
                findItem = menu.findItem(8);
                if (this.y != null || this.G) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                findItem.setVisible(z3);
                findItem = menu.findItem(11);
                if (this.y != null || r0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                findItem.setVisible(z3);
                findItem2 = menu.findItem(12);
                if (this.y != null && r0) {
                    z = true;
                }
                findItem2.setVisible(z);
                return true;
            }
        }
        z2 = false;
        z3 = false;
        menu.setGroupVisible(1, z3);
        findItem = menu.findItem(7);
        if (this.y == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        findItem.setVisible(z3);
        findItem = menu.findItem(9);
        if (this.y == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        findItem.setVisible(z3);
        findItem = menu.findItem(10);
        if (this.y == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        findItem.setVisible(z3);
        findItem = menu.findItem(8);
        if (this.y != null) {
        }
        z3 = false;
        findItem.setVisible(z3);
        findItem = menu.findItem(11);
        if (this.y != null) {
        }
        z3 = false;
        findItem.setVisible(z3);
        findItem2 = menu.findItem(12);
        z = true;
        findItem2.setVisible(z);
        return true;
    }

    static void e(MediaView mediaView, int i) {
        mediaView.b(i);
    }

    static TextView k(MediaView mediaView) {
        return mediaView.M;
    }

    static int d(MediaView mediaView, int i) {
        mediaView.P = i;
        return i;
    }

    static String j(MediaView mediaView) {
        return mediaView.t;
    }

    static ArrayList a(MediaView mediaView, ArrayList arrayList) {
        mediaView.B = arrayList;
        return arrayList;
    }

    static void f(MediaView mediaView, int i) {
        mediaView.e(i);
    }

    static int p(MediaView mediaView) {
        return mediaView.O;
    }

    private co i(int i) {
        int size = this.B.size();
        if (i < size) {
            return (co) this.B.get((size - i) - 1);
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r11) {
        /*
        r10 = this;
        r3 = 8;
        r2 = 6;
        r4 = 3;
        r5 = 1;
        r6 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.r;	 Catch:{ IOException -> 0x00b0 }
        r7 = r10.i(r0);	 Catch:{ IOException -> 0x00b0 }
        r0 = r7.Q;	 Catch:{ IOException -> 0x00b0 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IOException -> 0x00b0 }
        r8 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x00b0 }
        r1 = r0.file;	 Catch:{ IOException -> 0x00b0 }
        r1 = r1.getAbsolutePath();	 Catch:{ IOException -> 0x00b0 }
        r8.<init>(r1);	 Catch:{ IOException -> 0x00b0 }
        r1 = R;	 Catch:{ IOException -> 0x00b0 }
        r9 = 3;
        r1 = r1[r9];	 Catch:{ IOException -> 0x00b0 }
        r9 = 1;
        r1 = r8.getAttributeInt(r1, r9);	 Catch:{ IOException -> 0x00b0 }
        switch(r1) {
            case 0: goto L_0x008c;
            case 1: goto L_0x008c;
            case 2: goto L_0x0029;
            case 3: goto L_0x0096;
            case 4: goto L_0x0029;
            case 5: goto L_0x0029;
            case 6: goto L_0x0091;
            case 7: goto L_0x0029;
            case 8: goto L_0x009a;
            default: goto L_0x0029;
        };	 Catch:{ IOException -> 0x00b0 }
    L_0x0029:
        r2 = R;	 Catch:{ IOException -> 0x00b0 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00b0 }
        r1 = java.lang.Integer.toString(r1);	 Catch:{ IOException -> 0x00b0 }
        r8.setAttribute(r2, r1);	 Catch:{ IOException -> 0x00b0 }
        r8.saveAttributes();	 Catch:{ IOException -> 0x00b0 }
        r1 = r0.file;	 Catch:{ OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
        r1 = android.net.Uri.fromFile(r1);	 Catch:{ OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
        r2 = 100;
        r3 = 100;
        r1 = com.whatsapp.util.ag.a(r1, r2, r3);	 Catch:{ OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
        r2 = new java.io.ByteArrayOutputStream;	 Catch:{ OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
        r2.<init>();	 Catch:{ OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
        r3 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
        r4 = 80;
        r1.compress(r3, r4, r2);	 Catch:{ OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
        r3 = r2.toByteArray();	 Catch:{ OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
        r7.a(r3);	 Catch:{ OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
        r2.close();	 Catch:{ IOException -> 0x00c8, OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
    L_0x005c:
        r1.recycle();	 Catch:{ OutOfMemoryError -> 0x00a6, c_ -> 0x00ba }
    L_0x005f:
        r1 = r0.file;	 Catch:{ IOException -> 0x00b0 }
        r2 = r1.length();	 Catch:{ IOException -> 0x00b0 }
        r0.fileSize = r2;	 Catch:{ IOException -> 0x00b0 }
        r1 = 0;
        r0.faceX = r1;	 Catch:{ IOException -> 0x00b0 }
        r1 = 0;
        r0.faceY = r1;	 Catch:{ IOException -> 0x00b0 }
        com.whatsapp.util.bd.b(r7);	 Catch:{ IOException -> 0x00b0 }
        r0 = com.whatsapp.App.aK;	 Catch:{ IOException -> 0x00b0 }
        r0.c(r7);	 Catch:{ IOException -> 0x00b0 }
        r0 = r10.b(r7);	 Catch:{ IOException -> 0x00b0 }
        if (r0 == 0) goto L_0x008b;
    L_0x007b:
        if (r11 == 0) goto L_0x0082;
    L_0x007d:
        r0.f();	 Catch:{ IOException -> 0x00c4 }
        if (r6 == 0) goto L_0x0085;
    L_0x0082:
        r0.h();	 Catch:{ IOException -> 0x00c6 }
    L_0x0085:
        r0.requestLayout();	 Catch:{ IOException -> 0x00b0 }
        r0.invalidate();	 Catch:{ IOException -> 0x00b0 }
    L_0x008b:
        return;
    L_0x008c:
        if (r11 == 0) goto L_0x009e;
    L_0x008e:
        r1 = r2;
    L_0x008f:
        if (r6 == 0) goto L_0x0029;
    L_0x0091:
        if (r11 == 0) goto L_0x00a0;
    L_0x0093:
        r1 = r4;
    L_0x0094:
        if (r6 == 0) goto L_0x0029;
    L_0x0096:
        if (r11 == 0) goto L_0x00a2;
    L_0x0098:
        if (r6 == 0) goto L_0x00ca;
    L_0x009a:
        if (r11 == 0) goto L_0x00a4;
    L_0x009c:
        r1 = r5;
        goto L_0x0029;
    L_0x009e:
        r1 = r3;
        goto L_0x008f;
    L_0x00a0:
        r1 = r5;
        goto L_0x0094;
    L_0x00a2:
        r3 = r2;
        goto L_0x0098;
    L_0x00a4:
        r5 = r4;
        goto L_0x009c;
    L_0x00a6:
        r1 = move-exception;
        r2 = R;	 Catch:{ IOException -> 0x00b0 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00b0 }
        com.whatsapp.util.Log.b(r2, r1);	 Catch:{ IOException -> 0x00b0 }
        goto L_0x005f;
    L_0x00b0:
        r0 = move-exception;
        r1 = R;
        r2 = 5;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x008b;
    L_0x00ba:
        r1 = move-exception;
        r2 = R;	 Catch:{ IOException -> 0x00b0 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00b0 }
        com.whatsapp.util.Log.b(r2, r1);	 Catch:{ IOException -> 0x00b0 }
        goto L_0x005f;
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00b0 }
    L_0x00c8:
        r2 = move-exception;
        goto L_0x005c;
    L_0x00ca:
        r1 = r3;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.c(boolean):void");
    }

    static void b(MediaView mediaView, co coVar) {
        mediaView.d(coVar);
    }

    static int h(MediaView mediaView, int i) {
        mediaView.F = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r5) {
        /*
        r4 = this;
        r3 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = R;
        r2 = 60;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r5.k;
        r1 = r1.b;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r4.y;
        r1 = r5.k;
        r1 = r0.findViewWithTag(r1);
        r0 = 2131755769; // 0x7f1002f9 float:1.9142427E38 double:1.053227291E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r4.M = r0;
        r0 = 2131755527; // 0x7f100207 float:1.9141936E38 double:1.053227171E-314;
        r0 = r1.findViewById(r0);
        r0 = (com.whatsapp.VoiceNoteSeekBar) r0;
        r4.J = r0;
        r0 = r4.J;
        r2 = new com.whatsapp.ae0;
        r2.<init>(r4, r3);
        r0.setOnSeekBarChangeListener(r2);
        r0 = 2131755768; // 0x7f1002f8 float:1.9142425E38 double:1.0532272903E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r4.E = r0;
        r0 = new com.whatsapp.a3c;
        r2 = r4.J;
        r3 = r4.E;
        r0.<init>(r4, r2, r3);
        r2 = r4.E;
        r2.setOnClickListener(r0);
        r2 = 2131755770; // 0x7f1002fa float:1.9142429E38 double:1.0532272913E-314;
        r1 = r1.findViewById(r2);
        r2 = r4.L;	 Catch:{ IOException -> 0x0107 }
        if (r2 == 0) goto L_0x0072;
    L_0x006b:
        r1.setOnClickListener(r0);	 Catch:{ IOException -> 0x0107 }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IOException -> 0x0107 }
        if (r2 == 0) goto L_0x007a;
    L_0x0072:
        r2 = new com.whatsapp.ad9;	 Catch:{ IOException -> 0x0109 }
        r2.<init>(r4, r0);	 Catch:{ IOException -> 0x0109 }
        r1.setOnClickListener(r2);	 Catch:{ IOException -> 0x0109 }
    L_0x007a:
        r0 = r4.Q;	 Catch:{ IOException -> 0x010b }
        if (r0 == 0) goto L_0x008b;
    L_0x007e:
        r0 = r4.Q;	 Catch:{ IOException -> 0x010b }
        r0.b();	 Catch:{ IOException -> 0x010b }
        r0 = r4.Q;	 Catch:{ IOException -> 0x010b }
        r0.h();	 Catch:{ IOException -> 0x010b }
        r0 = 0;
        r4.Q = r0;	 Catch:{ IOException -> 0x010b }
    L_0x008b:
        r0 = r5.Q;	 Catch:{ IOException -> 0x010d }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IOException -> 0x010d }
        r0 = r0.file;	 Catch:{ IOException -> 0x010d }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x010d }
        r1 = 3;
        r0 = com.whatsapp.util.at.a(r0, r1);	 Catch:{ IOException -> 0x010d }
        r4.Q = r0;	 Catch:{ IOException -> 0x010d }
        r0 = r4.Q;	 Catch:{ IOException -> 0x010d }
        r1 = new com.whatsapp.vs;	 Catch:{ IOException -> 0x010d }
        r1.<init>(r4);	 Catch:{ IOException -> 0x010d }
        r0.a(r1);	 Catch:{ IOException -> 0x010d }
        r0 = r4.Q;	 Catch:{ IOException -> 0x010d }
        r0.g();	 Catch:{ IOException -> 0x010d }
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x010d }
        r0.<init>();	 Catch:{ IOException -> 0x010d }
        r1 = R;	 Catch:{ IOException -> 0x010d }
        r2 = 61;
        r1 = r1[r2];	 Catch:{ IOException -> 0x010d }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x010d }
        r1 = r4.Q;	 Catch:{ IOException -> 0x010d }
        r1 = r1.d();	 Catch:{ IOException -> 0x010d }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x010d }
        r0 = r0.toString();	 Catch:{ IOException -> 0x010d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x010d }
        r0 = 5;
        r4.O = r0;	 Catch:{ IOException -> 0x010d }
        r0 = r4.M;	 Catch:{ IOException -> 0x010d }
        r1 = r4.Q;	 Catch:{ IOException -> 0x010d }
        r1 = r1.d();	 Catch:{ IOException -> 0x010d }
        r1 = r1 / 1000;
        r2 = (long) r1;	 Catch:{ IOException -> 0x010d }
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);	 Catch:{ IOException -> 0x010d }
        r0.setText(r1);	 Catch:{ IOException -> 0x010d }
        r0 = r4.J;	 Catch:{ IOException -> 0x010d }
        r1 = r4.Q;	 Catch:{ IOException -> 0x010d }
        r1 = r1.d();	 Catch:{ IOException -> 0x010d }
        r0.setMax(r1);	 Catch:{ IOException -> 0x010d }
    L_0x00eb:
        r0 = r4.J;
        r1 = 0;
        r0.setProgress(r1);
        r0 = r4.E;
        r1 = new com.whatsapp.util.bz;
        r2 = r4.getResources();
        r3 = 2130839676; // 0x7f02087c float:1.728437E38 double:1.0527746807E-314;
        r2 = r2.getDrawable(r3);
        r1.<init>(r2);
        r0.setImageDrawable(r1);
        return;
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0109 }
    L_0x0109:
        r0 = move-exception;
        throw r0;
    L_0x010b:
        r0 = move-exception;
        throw r0;
    L_0x010d:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = 2131231156; // 0x7f0801b4 float:1.8078385E38 double:1.0529680975E-314;
        r4.a(r0);
        goto L_0x00eb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.a(com.whatsapp.protocol.co):void");
    }

    public void f() {
        System.gc();
    }

    static int f(MediaView mediaView) {
        return mediaView.F;
    }

    public static int c(int i) {
        switch (i) {
            case org.whispersystems.at.g /*1*/:
                return 2131231162;
            case org.whispersystems.at.i /*2*/:
                return 2131231157;
            case org.whispersystems.at.o /*3*/:
                return 2131231173;
            case Y.l /*9*/:
                return 2131231161;
            default:
                return 2131231166;
        }
    }

    static at r(MediaView mediaView) {
        return mediaView.Q;
    }

    static float b(MediaView mediaView, float f) {
        mediaView.v = f;
        return f;
    }

    public static Intent a(co coVar, String str, Context context, View view) {
        Intent intent = new Intent(context, MediaView.class);
        intent.putExtra(R[27], str);
        intent.putExtra(R[28], new a4p(coVar.k));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        intent.putExtra("x", iArr[0]);
        intent.putExtra("y", iArr[1]);
        intent.putExtra(R[30], view.getWidth());
        intent.putExtra(R[31], view.getHeight());
        intent.putExtra(R[29], true);
        return intent;
    }

    static int a(MediaView mediaView) {
        return mediaView.r;
    }

    private void a(Runnable runnable) {
        if (c()) {
            View view = this.y;
            co i = i(this.y.getCurrentItem());
            if (!(getResources().getConfiguration().orientation == this.q && i != null && i.k.equals(this.N))) {
                view.setPivotX((float) (view.getWidth() / 2));
                view.setPivotY((float) (view.getHeight() / 2));
                this.F = 0;
                this.P = 0;
            }
            view.animate().setDuration(240).scaleX(this.K).scaleY(this.v).translationX((float) this.F).translationY((float) this.P).alpha(0.0f).setListener(new as1(this, runnable));
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.z, R[62], new int[]{255, 0});
            ofInt.setDuration(240);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.start();
        }
    }

    static int e(MediaView mediaView) {
        return mediaView.I;
    }

    public static Intent a(co coVar, String str, Context context) {
        Intent intent = new Intent(context, MediaView.class);
        intent.putExtra(R[0], str);
        intent.putExtra(R[1], new a4p(coVar.k));
        return intent;
    }

    private void i() {
        if (this.Q != null) {
            this.Q.b();
            this.Q.h();
            this.Q = null;
            this.O = 0;
        }
        if (this.J != null) {
            this.J.setProgress(0);
        }
        if (this.E != null) {
            this.E.setImageDrawable(new bz(getResources().getDrawable(2130839676)));
        }
        if (this.M != null) {
            this.M.setText(DateUtils.formatElapsedTime(0));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(boolean r11) {
        /*
        r10 = this;
        r2 = 0;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.p;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r0 = r10.L;
        if (r0 == r11) goto L_0x000a;
    L_0x000f:
        r10.L = r11;
        r0 = r10.y;
        r4 = r0.getChildCount();
        r1 = r2;
    L_0x0018:
        if (r1 >= r4) goto L_0x003d;
    L_0x001a:
        r0 = r10.y;
        r0 = r0.getChildAt(r1);
        r5 = 2131755481; // 0x7f1001d9 float:1.9141842E38 double:1.0532271485E-314;
        r5 = r0.findViewById(r5);
        if (r11 == 0) goto L_0x0061;
    L_0x0029:
        r0 = new android.view.animation.AlphaAnimation;
        r0.<init>(r8, r9);
        r5.setVisibility(r2);
    L_0x0031:
        r6 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r0.setDuration(r6);
        r5.setAnimation(r0);
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x006b;
    L_0x003d:
        if (r11 == 0) goto L_0x0048;
    L_0x003f:
        r0 = r10.getSupportActionBar();
        r0.show();
        if (r3 == 0) goto L_0x004f;
    L_0x0048:
        r0 = r10.getSupportActionBar();
        r0.hide();
    L_0x004f:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x000a;
    L_0x0055:
        r0 = r10.D;
        if (r11 != 0) goto L_0x005b;
    L_0x0059:
        r0 = r0 | 5;
    L_0x005b:
        r1 = r10.y;
        r1.setSystemUiVisibility(r0);
        goto L_0x000a;
    L_0x0061:
        r0 = new android.view.animation.AlphaAnimation;
        r0.<init>(r9, r8);
        r6 = 4;
        r5.setVisibility(r6);
        goto L_0x0031;
    L_0x006b:
        r1 = r0;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.d(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r4) {
        /*
        r3 = this;
        r0 = r3.i(r4);
        if (r0 == 0) goto L_0x0022;
    L_0x0006:
        r1 = r0.c;
        r2 = 2;
        if (r1 != r2) goto L_0x0022;
    L_0x000b:
        r1 = r3.w;
        if (r1 == 0) goto L_0x001b;
    L_0x000f:
        r1 = r3.w;
        r1 = r1.k;
        r2 = r0.k;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0025;
    L_0x001b:
        r3.a(r0);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0025;
    L_0x0022:
        r3.i();
    L_0x0025:
        r1 = r3.r;
        if (r1 == r4) goto L_0x003c;
    L_0x0029:
        r1 = r3.w;
        if (r1 == 0) goto L_0x003c;
    L_0x002d:
        r1 = r3.w;
        r1 = r1.k;
        if (r1 == 0) goto L_0x003c;
    L_0x0033:
        r1 = r3.b(r0);
        if (r1 == 0) goto L_0x003c;
    L_0x0039:
        r1.a();
    L_0x003c:
        r3.w = r0;
        r3.r = r4;
        r3.d(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.b(int):void");
    }

    static PhotoView a(MediaView mediaView, co coVar) {
        return mediaView.b(coVar);
    }

    static boolean q(MediaView mediaView) {
        return mediaView.L;
    }

    protected void onStart() {
        super.onStart();
        Log.i(R[32]);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.A != null) {
            bundle.putParcelable(R[34], this.A);
        }
        if (this.H != null) {
            bundle.putString(R[35], this.H);
        }
    }

    static void c(MediaView mediaView, co coVar) {
        mediaView.a(coVar);
    }

    static ImageButton s(MediaView mediaView) {
        return mediaView.E;
    }

    public void finish() {
        super.finish();
        if (c() && this.s != null) {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r9, int r10) {
        /*
        r8 = this;
        r6 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = R;
        r1 = 55;
        r0 = r0[r1];
        com.whatsapp.i8.m();
        r0 = r9.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r9.c;
        r3 = 3;
        if (r1 != r3) goto L_0x00a7;
    L_0x0015:
        r3 = new android.content.Intent;
        r1 = R;
        r4 = 54;
        r1 = r1[r4];
        r3.<init>(r1);
        r1 = r0.file;
        r1 = android.net.Uri.fromFile(r1);
        r4 = R;
        r5 = 58;
        r4 = r4[r5];
        r3.setDataAndType(r1, r4);
        r1 = android.os.Build.MANUFACTURER;
        r4 = R;
        r5 = 53;
        r4 = r4[r5];
        r1 = r1.startsWith(r4);
        if (r1 == 0) goto L_0x00a2;
    L_0x003d:
        r1 = com.whatsapp.App.z();
        r1 = r1.getPackageManager();
        r1 = r1.queryIntentActivities(r3, r6);
        if (r1 == 0) goto L_0x00a2;
    L_0x004b:
        r4 = r1.iterator();
    L_0x004f:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x00a2;
    L_0x0055:
        r1 = r4.next();
        r1 = (android.content.pm.ResolveInfo) r1;
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00df }
        r5.<init>();	 Catch:{ IOException -> 0x00df }
        r6 = r1.activityInfo;	 Catch:{ IOException -> 0x00df }
        r6 = r6.packageName;	 Catch:{ IOException -> 0x00df }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x00df }
        r6 = R;	 Catch:{ IOException -> 0x00df }
        r7 = 52;
        r6 = r6[r7];	 Catch:{ IOException -> 0x00df }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x00df }
        r6 = r1.activityInfo;	 Catch:{ IOException -> 0x00df }
        r6 = r6.name;	 Catch:{ IOException -> 0x00df }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x00df }
        r5 = r5.toString();	 Catch:{ IOException -> 0x00df }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IOException -> 0x00df }
        r1 = r1.activityInfo;	 Catch:{ IOException -> 0x00df }
        r1 = r1.name;	 Catch:{ IOException -> 0x00df }
        r5 = R;	 Catch:{ IOException -> 0x00df }
        r6 = 56;
        r5 = r5[r6];	 Catch:{ IOException -> 0x00df }
        r1 = r1.equals(r5);	 Catch:{ IOException -> 0x00df }
        if (r1 == 0) goto L_0x00a0;
    L_0x0091:
        r1 = R;	 Catch:{ IOException -> 0x00df }
        r5 = 50;
        r1 = r1[r5];	 Catch:{ IOException -> 0x00df }
        r5 = R;	 Catch:{ IOException -> 0x00df }
        r6 = 57;
        r5 = r5[r6];	 Catch:{ IOException -> 0x00df }
        r3.setClassName(r1, r5);	 Catch:{ IOException -> 0x00df }
    L_0x00a0:
        if (r2 == 0) goto L_0x004f;
    L_0x00a2:
        com.whatsapp.App.a(r8, r3);	 Catch:{ IOException -> 0x00e1 }
        if (r2 == 0) goto L_0x00de;
    L_0x00a7:
        r1 = r9.c;	 Catch:{ IOException -> 0x00e1 }
        r3 = 2;
        if (r1 != r3) goto L_0x00f1;
    L_0x00ac:
        r8.a(r9);	 Catch:{ IOException -> 0x00e3 }
        r1 = r8.Q;	 Catch:{ IOException -> 0x00e3 }
        if (r1 == 0) goto L_0x00de;
    L_0x00b3:
        com.whatsapp.App.y(r8);
        r1 = r8.Q;	 Catch:{ IOException -> 0x00e5 }
        r1.c();	 Catch:{ IOException -> 0x00e5 }
        if (r10 <= 0) goto L_0x00cd;
    L_0x00bd:
        r1 = r8.Q;	 Catch:{ IOException -> 0x00e5 }
        r1.a(r10);	 Catch:{ IOException -> 0x00e5 }
        r1 = r8.J;	 Catch:{ IOException -> 0x00e5 }
        r3 = r8.Q;	 Catch:{ IOException -> 0x00e5 }
        r3 = r3.a();	 Catch:{ IOException -> 0x00e5 }
        r1.setProgress(r3);	 Catch:{ IOException -> 0x00e5 }
    L_0x00cd:
        r1 = 4;
        r8.O = r1;	 Catch:{ IOException -> 0x00e5 }
        r1 = r8.C;	 Catch:{ IOException -> 0x00e5 }
        r3 = 0;
        r1.sendEmptyMessage(r3);	 Catch:{ IOException -> 0x00e5 }
        r1 = r8.E;	 Catch:{ IOException -> 0x00e5 }
        r3 = 2130839675; // 0x7f02087b float:1.7284367E38 double:1.05277468E-314;
        r1.setImageResource(r3);	 Catch:{ IOException -> 0x00e5 }
    L_0x00de:
        return;
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r1 = move-exception;
        com.whatsapp.util.Log.a(r1);	 Catch:{ IOException -> 0x0111 }
        r1 = 2131231156; // 0x7f0801b4 float:1.8078385E38 double:1.0529680975E-314;
        r8.a(r1);	 Catch:{ IOException -> 0x0111 }
        if (r2 == 0) goto L_0x00de;
    L_0x00f1:
        r1 = r9.c;	 Catch:{ IOException -> 0x0111 }
        r2 = 9;
        if (r1 != r2) goto L_0x00de;
    L_0x00f7:
        r1 = new android.content.Intent;
        r2 = R;
        r3 = 51;
        r2 = r2[r3];
        r1.<init>(r2);
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r2 = r9.n;
        r1.setDataAndType(r0, r2);
        com.whatsapp.App.a(r8, r1);
        goto L_0x00de;
    L_0x0111:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.a(com.whatsapp.protocol.co, int):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d(true);
    }

    public void onDestroy() {
        boolean z = DialogToastActivity.f;
        Log.i(R[33]);
        if (this.y != null) {
            int i = 0;
            while (i < this.y.getChildCount()) {
                int i2;
                View childAt = this.y.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    int i3 = 0;
                    while (i3 < ((FrameLayout) childAt).getChildCount()) {
                        View childAt2 = ((FrameLayout) childAt).getChildAt(i3);
                        if (childAt2 instanceof PhotoView) {
                            ((PhotoView) childAt2).b();
                        }
                        i2 = i3 + 1;
                        if (z) {
                            break;
                        }
                        i3 = i2;
                    }
                }
                i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
        }
        if (this.x != null) {
            this.x.interrupt();
            this.x = null;
        }
        if (this.n != null) {
            this.n.a();
            this.n = null;
        }
        this.w = null;
        App.a(this.o);
        this.B.clear();
        App.w(getApplicationContext());
        super.onDestroy();
    }

    static void c(MediaView mediaView, int i) {
        mediaView.h(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
        r6 = this;
        r5 = 0;
        r4 = -1;
        r1 = com.whatsapp.DialogToastActivity.f;
        switch(r7) {
            case 0: goto L_0x0008;
            case 1: goto L_0x001b;
            case 2: goto L_0x0037;
            case 3: goto L_0x006d;
            case 4: goto L_0x0090;
            default: goto L_0x0007;
        };
    L_0x0007:
        return;
    L_0x0008:
        if (r8 != r4) goto L_0x0007;
    L_0x000a:
        if (r9 == 0) goto L_0x0007;
    L_0x000c:
        r0 = r9.getData();
        if (r0 == 0) goto L_0x0007;
    L_0x0012:
        r0 = r9.getData();
        r6.a(r0, r4, r5, r5);
        if (r1 == 0) goto L_0x0007;
    L_0x001b:
        if (r8 != r4) goto L_0x002e;
    L_0x001d:
        r0 = com.whatsapp.App.as;
        r0 = r0.e();
        r0 = com.whatsapp.r.b(r0, r6);
        if (r0 == 0) goto L_0x0007;
    L_0x0029:
        r6.showDialog(r5);
        if (r1 == 0) goto L_0x0007;
    L_0x002e:
        if (r8 != 0) goto L_0x0007;
    L_0x0030:
        if (r9 == 0) goto L_0x0007;
    L_0x0032:
        com.whatsapp.r.a(r9, r6);
        if (r1 == 0) goto L_0x0007;
    L_0x0037:
        if (r8 != r4) goto L_0x0007;
    L_0x0039:
        if (r9 == 0) goto L_0x0007;
    L_0x003b:
        r0 = R;
        r2 = 24;
        r0 = r0[r2];
        r0 = r9.getStringExtra(r0);
        r6.H = r0;
        r2 = new android.content.Intent;
        r2.<init>();
        r0 = r6.r;
        r0 = r6.i(r0);
        r0 = r0.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r2.setData(r0);
        r0 = com.whatsapp.App.as;
        r3 = r6.H;
        r0 = r0.c(r3);
        r3 = 3;
        com.whatsapp.r.a(r2, r0, r6, r3, r6);
        if (r1 == 0) goto L_0x0007;
    L_0x006d:
        if (r8 != r4) goto L_0x0087;
    L_0x006f:
        r0 = r6.H;
        if (r0 == 0) goto L_0x0087;
    L_0x0073:
        r0 = com.whatsapp.App.as;
        r2 = r6.H;
        r0 = r0.c(r2);
        r0 = com.whatsapp.r.b(r0, r6);
        if (r0 == 0) goto L_0x0007;
    L_0x0081:
        r0 = 1;
        r6.showDialog(r0);
        if (r1 == 0) goto L_0x0007;
    L_0x0087:
        if (r8 != 0) goto L_0x0007;
    L_0x0089:
        if (r9 == 0) goto L_0x0007;
    L_0x008b:
        com.whatsapp.r.a(r9, r6);
        if (r1 == 0) goto L_0x0007;
    L_0x0090:
        if (r8 != r4) goto L_0x0007;
    L_0x0092:
        if (r9 == 0) goto L_0x0007;
    L_0x0094:
        r0 = r6.r;
        r0 = r6.i(r0);
        if (r0 == 0) goto L_0x00cb;
    L_0x009c:
        r2 = com.whatsapp.App.as;
        r3 = R;
        r4 = 26;
        r3 = r3[r4];
        r3 = r9.getStringExtra(r3);
        r2 = r2.b(r3);
        if (r2 == 0) goto L_0x00ba;
    L_0x00ae:
        com.whatsapp.App.a(r0, r2);
        r0 = com.whatsapp.Conversation.a(r2);
        r6.startActivity(r0);
        if (r1 == 0) goto L_0x00c9;
    L_0x00ba:
        r0 = R;
        r2 = 23;
        r0 = r0[r2];
        com.whatsapp.util.Log.w(r0);
        r0 = 2131231380; // 0x7f080294 float:1.807884E38 double:1.052968208E-314;
        com.whatsapp.App.a(r6, r0, r5);
    L_0x00c9:
        if (r1 == 0) goto L_0x0007;
    L_0x00cb:
        r0 = R;
        r1 = 25;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = 2131231451; // 0x7f0802db float:1.8078983E38 double:1.0529682433E-314;
        com.whatsapp.App.a(r6, r0, r5);
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.onActivityResult(int, int, android.content.Intent):void");
    }

    static float a(MediaView mediaView, float f) {
        mediaView.K = f;
        return f;
    }

    private void h(int i) {
        i();
        if (i == 1) {
            if (this.r > 0) {
                this.r--;
                this.y.setCurrentItem(this.r);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            return;
        }
        if (this.r < this.B.size() - 1) {
            this.r++;
            this.y.setCurrentItem(this.r);
        }
    }

    protected void onStop() {
        super.onStop();
        i();
        d(true);
        Log.i(R[59]);
    }

    static VoiceNoteSeekBar h(MediaView mediaView) {
        return mediaView.J;
    }

    static boolean a(MediaView mediaView, boolean z) {
        mediaView.p = z;
        return z;
    }

    private void a() {
        App.b((Context) this, i(this.r));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View c(com.whatsapp.protocol.co r10) {
        /*
        r9 = this;
        r6 = 0;
        r4 = 8;
        r8 = 3;
        r2 = 1;
        r3 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.c;
        r1 = 2;
        if (r0 != r1) goto L_0x001c;
    L_0x000d:
        r0 = r9.getLayoutInflater();
        r1 = 2130903221; // 0x7f0300b5 float:1.7413254E38 double:1.052806076E-314;
        r0 = r0.inflate(r1, r6);
        r0 = (android.view.ViewGroup) r0;
        if (r5 == 0) goto L_0x00de;
    L_0x001c:
        r0 = r9.getLayoutInflater();
        r1 = 2130903223; // 0x7f0300b7 float:1.7413258E38 double:1.052806077E-314;
        r0 = r0.inflate(r1, r6);
        r0 = (android.view.ViewGroup) r0;
        r6 = new com.whatsapp.MediaView$13;
        r6.<init>(r9, r9);
        r0.addView(r6, r3);
        r1 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r6.setInitialFitTolerance(r1);
        r1 = r10.c;
        if (r1 != r2) goto L_0x01e5;
    L_0x003b:
        r1 = r2;
    L_0x003c:
        r6.b(r1);
        r1 = r10.c;
        if (r1 != r8) goto L_0x01e8;
    L_0x0043:
        r1 = r2;
    L_0x0044:
        r6.setIsVideo(r1);
        r1 = r10.Q;
        r1 = (com.whatsapp.MediaData) r1;
        r7 = r10.k;
        r7 = r7.a;
        if (r7 != 0) goto L_0x0062;
    L_0x0051:
        r1 = r1.transferred;
        if (r1 != 0) goto L_0x0062;
    L_0x0055:
        r1 = r10.c;
        r1 = c(r1);
        r1 = r9.getString(r1);
        com.whatsapp.App.a(r9, r1);
    L_0x0062:
        r7 = com.whatsapp.util.bd.a(r10);
        r6.a(r7);
        r1 = r9.x;
        if (r1 == 0) goto L_0x0072;
    L_0x006d:
        r1 = r9.x;
        r1.a(r10, r6);
    L_0x0072:
        r1 = r10.c;
        if (r1 != r2) goto L_0x0096;
    L_0x0076:
        if (r7 != 0) goto L_0x008c;
    L_0x0078:
        r1 = r9.getResources();
        r2 = 2130837596; // 0x7f02005c float:1.728015E38 double:1.052773653E-314;
        r1 = r1.getDrawable(r2);
        r1 = (android.graphics.drawable.BitmapDrawable) r1;
        r1 = r1.getBitmap();
        r6.a(r1);
    L_0x008c:
        r1 = new com.whatsapp.pc;
        r1.<init>(r9);
        r6.setOnClickListener(r1);
        if (r5 == 0) goto L_0x00de;
    L_0x0096:
        r1 = r10.c;
        if (r1 != r8) goto L_0x00ba;
    L_0x009a:
        if (r7 != 0) goto L_0x00b0;
    L_0x009c:
        r1 = r9.getResources();
        r2 = 2130837599; // 0x7f02005f float:1.7280157E38 double:1.0527736545E-314;
        r1 = r1.getDrawable(r2);
        r1 = (android.graphics.drawable.BitmapDrawable) r1;
        r1 = r1.getBitmap();
        r6.a(r1);
    L_0x00b0:
        r1 = new com.whatsapp.iz;
        r1.<init>(r9, r10);
        r6.setOnClickListener(r1);
        if (r5 == 0) goto L_0x00de;
    L_0x00ba:
        r1 = r10.c;
        r2 = 9;
        if (r1 != r2) goto L_0x00de;
    L_0x00c0:
        if (r7 != 0) goto L_0x00d6;
    L_0x00c2:
        r1 = r9.getResources();
        r2 = 2130839568; // 0x7f020810 float:1.728415E38 double:1.0527746273E-314;
        r1 = r1.getDrawable(r2);
        r1 = (android.graphics.drawable.BitmapDrawable) r1;
        r1 = r1.getBitmap();
        r6.a(r1);
    L_0x00d6:
        r1 = new com.whatsapp.ai;
        r1.<init>(r9, r10);
        r6.setOnClickListener(r1);
    L_0x00de:
        r1 = r0;
        r0 = 2131755554; // 0x7f100222 float:1.914199E38 double:1.0532271846E-314;
        r0 = r1.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        com.whatsapp.a4d.b(r0);
        r2 = r10.a;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 == 0) goto L_0x00f9;
    L_0x00f3:
        r2 = 4;
        r0.setVisibility(r2);
        if (r5 == 0) goto L_0x0101;
    L_0x00f9:
        r2 = r10.a;
        r0.a(r2);
        r0.setVisibility(r3);
    L_0x0101:
        r0 = 2131755771; // 0x7f1002fb float:1.914243E38 double:1.053227292E-314;
        r0 = r1.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r2 = r10.k;
        r2 = r2.a;
        if (r2 == 0) goto L_0x0144;
    L_0x0110:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = 2131232301; // 0x7f08062d float:1.8080707E38 double:1.052968663E-314;
        r6 = r9.getString(r6);
        r2 = r2.append(r6);
        r6 = com.whatsapp.aam.b();
        r2 = r2.append(r6);
        r6 = " ";
        r2 = r2.append(r6);
        r6 = com.whatsapp.App.o(r10);
        r6 = com.whatsapp.util.cs.k(r9, r6);
        r2 = r2.append(r6);
        r2 = r2.toString();
        r0.setText(r2);
        if (r5 == 0) goto L_0x0197;
    L_0x0144:
        r2 = r10.k;
        r2 = r2.c;
        r2 = com.whatsapp.qm.i(r2);
        if (r2 == 0) goto L_0x0160;
    L_0x014e:
        r2 = r10.t;
        if (r2 == 0) goto L_0x0160;
    L_0x0152:
        r2 = com.whatsapp.App.as;
        r6 = r10.t;
        r2 = r2.b(r6);
        r2 = r2.a(r9);
        if (r5 == 0) goto L_0x016c;
    L_0x0160:
        r2 = com.whatsapp.App.as;
        r6 = r9.t;
        r2 = r2.b(r6);
        r2 = r2.a(r9);
    L_0x016c:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r2 = r6.append(r2);
        r6 = com.whatsapp.aam.b();
        r2 = r2.append(r6);
        r6 = " ";
        r2 = r2.append(r6);
        r6 = com.whatsapp.App.o(r10);
        r6 = com.whatsapp.util.cs.k(r9, r6);
        r2 = r2.append(r6);
        r2 = r2.toString();
        r0.a(r2);
    L_0x0197:
        r0 = 2131755772; // 0x7f1002fc float:1.9142433E38 double:1.0532272923E-314;
        r0 = r1.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r2 = r9.t;
        r2 = com.whatsapp.qm.i(r2);
        if (r2 == 0) goto L_0x01b8;
    L_0x01a8:
        r0.setVisibility(r3);
        r2 = com.whatsapp.App.as;
        r6 = r9.t;
        r2 = r2.b(r6);
        r0.setContact(r2);
        if (r5 == 0) goto L_0x01bb;
    L_0x01b8:
        r0.setVisibility(r4);
    L_0x01bb:
        r0 = 2131755619; // 0x7f100263 float:1.9142122E38 double:1.0532272167E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r2 = r10.P;
        if (r2 == 0) goto L_0x01eb;
    L_0x01c8:
        r2 = 2130839632; // 0x7f020850 float:1.728428E38 double:1.052774659E-314;
    L_0x01cb:
        r0.setImageResource(r2);
        r2 = new com.whatsapp.wi;
        r2.<init>(r9, r10);
        r0.setOnClickListener(r2);
        r0 = 2131755481; // 0x7f1001d9 float:1.9141842E38 double:1.0532271485E-314;
        r0 = r1.findViewById(r0);
        r2 = r9.L;
        if (r2 == 0) goto L_0x01ef;
    L_0x01e1:
        r0.setVisibility(r3);
        return r1;
    L_0x01e5:
        r1 = r3;
        goto L_0x003c;
    L_0x01e8:
        r1 = r3;
        goto L_0x0044;
    L_0x01eb:
        r2 = 2130839633; // 0x7f020851 float:1.7284282E38 double:1.0527746595E-314;
        goto L_0x01cb;
    L_0x01ef:
        r3 = r4;
        goto L_0x01e1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.c(com.whatsapp.protocol.co):android.view.View");
    }

    static MediaViewPager b(MediaView mediaView) {
        return mediaView.y;
    }

    static int t(MediaView mediaView) {
        return mediaView.P;
    }

    private void e(int i) {
        co i2 = i(this.r);
        if (i2 != null) {
            a(i2, i);
        }
    }

    static ArrayList g(MediaView mediaView) {
        return mediaView.B;
    }

    protected void onPause() {
        super.onPause();
        if (isFinishing() && this.n != null) {
            this.n.a();
            this.n = null;
        }
    }

    static Handler u(MediaView mediaView) {
        return mediaView.C;
    }

    private void d() {
        if (c()) {
            this.q = getResources().getConfiguration().orientation;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.z, R[7], new int[]{0, 255});
            ofInt.setDuration(240);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.start();
            View view = this.y;
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(this.K);
            view.setScaleY(this.v);
            view.setTranslationX((float) this.F);
            view.setTranslationY((float) this.P);
            View findViewWithTag = this.y.findViewWithTag(this.s.k);
            if (findViewWithTag != null) {
                findViewWithTag.setAlpha(0.0f);
                findViewWithTag.animate().setDuration(120).alpha(1.0f).setInterpolator(new DecelerateInterpolator(2.0f));
            }
            view.animate().setDuration(240).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener(new wd(this));
        }
    }

    protected Dialog onCreateDialog(int i) {
        boolean z = true;
        Dialog progressDialog;
        switch (i) {
            case v.m /*0*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131232187));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case org.whispersystems.at.g /*1*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131232186));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case org.whispersystems.at.i /*2*/:
                co i2 = i(this.r);
                Collection arrayList = new ArrayList();
                arrayList.add(i2);
                if (this.r != this.B.size() - 1) {
                    z = false;
                }
                return aea.a(this, arrayList, this.t, 2, new jo(this, i2, z));
            default:
                return super.onCreateDialog(i);
        }
    }

    static void a(MediaView mediaView, co coVar, int i) {
        mediaView.a(coVar, i);
    }

    static float i(MediaView mediaView) {
        return mediaView.v;
    }

    static void m(MediaView mediaView) {
        mediaView.d();
    }

    static void b(MediaView mediaView, boolean z) {
        mediaView.d(z);
    }

    public void g(int i) {
        if (i == 2131231110) {
            finish();
        }
    }

    public void onBackPressed() {
        if (c() && this.s != null) {
            if (this.x != null) {
                this.x.interrupt();
                this.x = null;
            }
            if (this.n != null) {
                this.n.a();
                this.n = null;
            }
            a(new kx(this));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        super.onBackPressed();
    }

    private void d(int i) {
        if (i(i) != null) {
            getSupportActionBar().setTitle(getString(2131231425, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(this.B.size())}));
            invalidateOptionsMenu();
        }
    }

    static int b(MediaView mediaView, int i) {
        mediaView.O = i;
        return i;
    }

    static float l(MediaView mediaView) {
        return mediaView.K;
    }

    public void onResume() {
        super.onResume();
        d(true);
    }

    public MediaView() {
        this.O = 0;
        this.L = true;
        this.D = 1280;
        this.o = new ao_(this);
    }

    static c3 c(MediaView mediaView) {
        return mediaView.N;
    }

    static int a(MediaView mediaView, int i) {
        mediaView.r = i;
        return i;
    }

    static void n(MediaView mediaView) {
        mediaView.i();
    }

    private PhotoView b(co coVar) {
        View findViewWithTag = this.y.findViewWithTag(coVar.k);
        if (findViewWithTag != null && (findViewWithTag instanceof ViewGroup)) {
            findViewWithTag = ((ViewGroup) findViewWithTag).getChildAt(0);
            if (findViewWithTag != null && (findViewWithTag instanceof PhotoView)) {
                return (PhotoView) findViewWithTag;
            }
        }
        return null;
    }

    static View d(MediaView mediaView, co coVar) {
        return mediaView.c(coVar);
    }

    static c8 o(MediaView mediaView) {
        return mediaView.u;
    }
}
