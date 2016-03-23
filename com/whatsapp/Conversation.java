package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.app.WallpaperManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.StaleDataException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.appcompat.R;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.text.method.TextKeyListener;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView.OnScrollListener;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.fieldstats.cd;
import com.whatsapp.gallerypicker.ImagePreview;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.util.bq;
import com.whatsapp.util.c_;
import com.whatsapp.wallpaper.WallPaperView;
import de.greenrobot.event.h;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class Conversation extends ConversationRowsActivity implements tm, aau, b2 {
    public static boolean G;
    public static HashMap U;
    static ArrayList aC;
    public static boolean ad;
    private static AtomicReference ak;
    private static Set ap;
    static boolean bh;
    private static boolean bm;
    public static boolean bz;
    private static final String[] cb;
    private static final String[] y;
    private static boolean z;
    private final akc A;
    boolean B;
    private ViewGroup C;
    private String D;
    private a9t E;
    private ImageButton F;
    private c3 H;
    final InputMethodManager I;
    private boolean J;
    private ce K;
    String L;
    private final TextWatcher M;
    private String N;
    private String O;
    private final as8 P;
    final OnScrollListener Q;
    private boolean R;
    private final DataSetObserver S;
    private String T;
    private final TextWatcher V;
    private int W;
    private int X;
    boolean Y;
    private ConversationTextEntry Z;
    private pi a0;
    private boolean a1;
    boolean a2;
    private TextView a3;
    private a9z a4;
    private Handler a5;
    private final Runnable a6;
    private TextView a7;
    private Callback a8;
    private c3 a9;
    private TextView aA;
    private ViewGroup aB;
    private final nt aD;
    private WallPaperView aE;
    private int aF;
    private ArrayList aG;
    private String aH;
    public l5 aI;
    final OnEditorActionListener aJ;
    private Handler aK;
    private HashSet aL;
    private pz aM;
    private boolean aN;
    private awj aO;
    private View aP;
    private Runnable aQ;
    private int aR;
    private boolean aS;
    private Handler aT;
    private boolean aU;
    private HashSet aV;
    private int aW;
    private HashMap aX;
    boolean aY;
    private ImageButton aZ;
    private ImageButton a_;
    private int aa;
    private int ab;
    private ArrayList ac;
    public String ae;
    private int af;
    private a4d ag;
    private ArrayList ah;
    private ImageView ai;
    private ActionMode aj;
    private Handler al;
    private ImageButton am;
    private View an;
    private long ao;
    private boolean aq;
    private boolean ar;
    private hp as;
    private boolean at;
    private a_p au;
    private boolean av;
    public boolean aw;
    private TextView ax;
    private String ay;
    private boolean az;
    final OnClickListener bA;
    private ViewStub ba;
    private TextEmojiLabel bb;
    public ListView bc;
    public a4l bd;
    private boolean be;
    private boolean bf;
    private MenuItem bg;
    private boolean bi;
    private View bj;
    a23 bk;
    private View bl;
    private View bn;
    private boolean bo;
    private View bp;
    private View bq;
    private int br;
    private View bs;
    private ProgressBar bt;
    private boolean bu;
    private boolean bv;
    private ConversationContentLayout bw;
    private boolean bx;
    private View by;
    private MenuItem w;
    private WallpaperManager x;

    class 60 extends BroadcastReceiver {
        private static final String[] z;
        final Conversation a;

        static {
            String[] strArr = new String[2];
            String str = "\"83H*3$<J&.9rL*22)\u0013&,2";
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
                            i3 = 65;
                            break;
                        case at.g /*1*/:
                            i3 = 87;
                            break;
                        case at.i /*2*/:
                            i3 = 93;
                            break;
                        case at.o /*3*/:
                            i3 = 62;
                            break;
                        default:
                            i3 = 79;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "\"83H*3$<J&.9rK!32:W<52/\u001e:22/\u001e?32.[!5w/[,$>+[=a";
                        obj = null;
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            try {
                this.a.unregisterReceiver(this);
                Log.i(z[0]);
                this.a.I.restartInput(Conversation.o(this.a));
            } catch (Throwable e) {
                Log.b(z[1], e);
            }
        }

        60(Conversation conversation) {
            this.a = conversation;
        }
    }

    public class CapturePictureOrVideoDialogFragment extends DialogFragment {
        public Dialog onCreateDialog(Bundle bundle) {
            Builder builder = new Builder(getActivity());
            builder.setItems(getResources().getStringArray(2131689478), new su(this));
            Dialog create = builder.create();
            create.setCanceledOnTouchOutside(true);
            return create;
        }
    }

    private void J() {
        boolean z = DialogToastActivity.f;
        try {
            if (this.R) {
                x();
                this.R = false;
                if (!z) {
                    return;
                }
            }
            try {
                if (VERSION.SDK_INT >= 8) {
                    try {
                        if (this.bc.getLastVisiblePosition() >= this.bc.getCount() - 2) {
                            try {
                                x();
                                if (!z) {
                                    return;
                                }
                            } catch (ActivityNotFoundException e) {
                                throw e;
                            }
                        }
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                    try {
                        this.bc.smoothScrollBy((int) getResources().getDimension(2131427448), 100);
                        if (!z) {
                            return;
                        }
                    } catch (ActivityNotFoundException e22) {
                        throw e22;
                    }
                }
                x();
            } catch (ActivityNotFoundException e222) {
                throw e222;
            }
        } catch (ActivityNotFoundException e2222) {
            throw e2222;
        } catch (ActivityNotFoundException e22222) {
            throw e22222;
        }
    }

    private void b(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(new gf(this, view));
    }

    static TextView az(Conversation conversation) {
        return conversation.a7;
    }

    static void O(Conversation conversation) {
        conversation.u();
    }

    static String g(Conversation conversation, String str) {
        conversation.T = str;
        return str;
    }

    static String ap(Conversation conversation) {
        return conversation.aH;
    }

    static int au(Conversation conversation) {
        return conversation.W;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r7) {
        /*
        r6 = this;
        r5 = 1;
        r0 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0029 }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x0029 }
        r3 = cb;	 Catch:{ ActivityNotFoundException -> 0x0029 }
        r4 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0029 }
        r2 = r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x0029 }
        r3 = r7.size();	 Catch:{ ActivityNotFoundException -> 0x0029 }
        r2 = r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x0029 }
        r2 = r2.toString();	 Catch:{ ActivityNotFoundException -> 0x0029 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ ActivityNotFoundException -> 0x0029 }
        r2 = r7.size();	 Catch:{ ActivityNotFoundException -> 0x0029 }
        if (r2 != 0) goto L_0x002b;
    L_0x0028:
        return r0;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r2 = r6.aI;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        if (r2 == 0) goto L_0x00ee;
    L_0x002f:
        r2 = r6.bx;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        if (r2 != 0) goto L_0x0040;
    L_0x0033:
        r2 = 10;
        r2 = r7.findItem(r2);	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r3 = r6.U();	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r2.setTitle(r3);	 Catch:{ ActivityNotFoundException -> 0x00f6 }
    L_0x0040:
        r2 = r6.ar;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        if (r2 != 0) goto L_0x008f;
    L_0x0044:
        r2 = r6.bx;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        if (r2 != 0) goto L_0x008f;
    L_0x0048:
        r2 = r7.findItem(r5);
        r3 = r6.aI;	 Catch:{ ActivityNotFoundException -> 0x00fa }
        r3 = r3.l;	 Catch:{ ActivityNotFoundException -> 0x00fa }
        if (r3 == 0) goto L_0x005d;
    L_0x0052:
        r3 = 0;
        r6.aY = r3;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r3 = 2131232226; // 0x7f0805e2 float:1.8080555E38 double:1.052968626E-314;
        r2.setTitle(r3);	 Catch:{ ActivityNotFoundException -> 0x00fc }
        if (r1 == 0) goto L_0x0066;
    L_0x005d:
        r3 = 1;
        r6.aY = r3;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r3 = 2131230786; // 0x7f080042 float:1.8077635E38 double:1.0529679147E-314;
        r2.setTitle(r3);	 Catch:{ ActivityNotFoundException -> 0x00fc }
    L_0x0066:
        r2 = 4;
        r2 = r7.findItem(r2);
        r3 = r6.aI;
        r3 = r3.p;
        r3 = com.whatsapp.aup.a(r3);
        if (r3 == 0) goto L_0x0083;
    L_0x0075:
        r6.Y = r0;
        r0 = 2131232177; // 0x7f0805b1 float:1.8080456E38 double:1.052968602E-314;
        r0 = r6.getString(r0);
        r2.setTitle(r0);
        if (r1 == 0) goto L_0x008f;
    L_0x0083:
        r6.Y = r5;
        r0 = 2131230839; // 0x7f080077 float:1.8077742E38 double:1.052967941E-314;
        r0 = r6.getString(r0);
        r2.setTitle(r0);
    L_0x008f:
        r0 = r6.bd;	 Catch:{ ActivityNotFoundException -> 0x00fe }
        r0 = r0.getCount();	 Catch:{ ActivityNotFoundException -> 0x00fe }
        if (r0 <= 0) goto L_0x00b7;
    L_0x0097:
        r0 = 17;
        r0 = r7.findItem(r0);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r2 = 1;
        r0.setVisible(r2);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r0 = 8;
        r0 = r7.findItem(r0);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r2 = 1;
        r0.setVisible(r2);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r0 = 14;
        r0 = r7.findItem(r0);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r2 = 1;
        r0.setVisible(r2);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        if (r1 == 0) goto L_0x00d5;
    L_0x00b7:
        r0 = 17;
        r0 = r7.findItem(r0);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r2 = 0;
        r0.setVisible(r2);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r0 = 8;
        r0 = r7.findItem(r0);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r2 = 0;
        r0.setVisible(r2);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r0 = 14;
        r0 = r7.findItem(r0);	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r2 = 0;
        r0.setVisible(r2);	 Catch:{ ActivityNotFoundException -> 0x0100 }
    L_0x00d5:
        r0 = 3;
        r0 = r7.findItem(r0);
        r2 = r0.getSubMenu();
        r2 = r2.hasVisibleItems();	 Catch:{ ActivityNotFoundException -> 0x0102 }
        if (r2 == 0) goto L_0x00ea;
    L_0x00e4:
        r2 = 1;
        r0.setVisible(r2);	 Catch:{ ActivityNotFoundException -> 0x0104 }
        if (r1 == 0) goto L_0x00ee;
    L_0x00ea:
        r1 = 0;
        r0.setVisible(r1);	 Catch:{ ActivityNotFoundException -> 0x0104 }
    L_0x00ee:
        r0 = super.onPrepareOptionsMenu(r7);
        goto L_0x0028;
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;
    L_0x00f8:
        r0 = move-exception;
        throw r0;
    L_0x00fa:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00fc }
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0100 }
    L_0x0100:
        r0 = move-exception;
        throw r0;
    L_0x0102:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0104 }
    L_0x0104:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    private void j() {
        this.bn.setVisibility(0);
        this.aA.setText("");
    }

    static View a(Conversation conversation, View view) {
        conversation.bl = view;
        return view;
    }

    static void a(Conversation conversation, File file) {
        conversation.a(file);
    }

    public void e(String str) {
        try {
            if (((ana) h.b().b(ana.class)).a) {
                this.bo = true;
                if (str != null) {
                    try {
                        if (str.equals(this.ae)) {
                            return;
                        }
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                }
                this.bi = false;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    static void ad(Conversation conversation) {
        conversation.n();
    }

    static Runnable aA(Conversation conversation) {
        return conversation.aQ;
    }

    static int d(Conversation conversation, int i) {
        conversation.br = i;
        return i;
    }

    static void ai(Conversation conversation) {
        conversation.J();
    }

    static ConversationTextEntry o(Conversation conversation) {
        return conversation.Z;
    }

    public void d(String str) {
        try {
            if (str.equals(this.ae)) {
                L().setVisibility(8);
                this.ai.setVisibility(0);
                D();
            }
            this.bc.post(new mc(this, str));
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r13) {
        /*
        r12 = this;
        r11 = 0;
        r2 = 0;
        r1 = 1;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r13.getItemId();	 Catch:{ ActivityNotFoundException -> 0x0013 }
        switch(r0) {
            case 0: goto L_0x0015;
            case 1: goto L_0x0035;
            case 4: goto L_0x0060;
            case 6: goto L_0x0108;
            case 8: goto L_0x00bd;
            case 9: goto L_0x0112;
            case 10: goto L_0x014d;
            case 11: goto L_0x0181;
            case 12: goto L_0x02c3;
            case 14: goto L_0x0090;
            case 15: goto L_0x0096;
            case 16: goto L_0x02df;
            case 17: goto L_0x008a;
            case 16908332: goto L_0x000e;
            default: goto L_0x000c;
        };	 Catch:{ ActivityNotFoundException -> 0x0013 }
    L_0x000c:
        r0 = r2;
    L_0x000d:
        return r0;
    L_0x000e:
        r12.finish();	 Catch:{ ActivityNotFoundException -> 0x0013 }
        r0 = r1;
        goto L_0x000d;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r0 = r12.m();	 Catch:{ ActivityNotFoundException -> 0x0031 }
        if (r0 == 0) goto L_0x0026;
    L_0x001b:
        r0 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x0033 }
        r0 = r0.s();	 Catch:{ ActivityNotFoundException -> 0x0033 }
        r12.m(r0);	 Catch:{ ActivityNotFoundException -> 0x0033 }
        if (r4 == 0) goto L_0x002f;
    L_0x0026:
        r0 = 1;
        r12.c(r0);	 Catch:{ ActivityNotFoundException -> 0x0033 }
        r0 = 9;
        r12.showDialog(r0);	 Catch:{ ActivityNotFoundException -> 0x0033 }
    L_0x002f:
        r0 = r1;
        goto L_0x000d;
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r0 = r12.aY;	 Catch:{ ActivityNotFoundException -> 0x005c }
        if (r0 == 0) goto L_0x0043;
    L_0x0039:
        r0 = 0;
        r12.bu = r0;	 Catch:{ ActivityNotFoundException -> 0x005e }
        r0 = 11;
        r12.showDialog(r0);	 Catch:{ ActivityNotFoundException -> 0x005e }
        if (r4 == 0) goto L_0x005a;
    L_0x0043:
        r0 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x005e }
        r2 = 2131755492; // 0x7f1001e4 float:1.9141865E38 double:1.053227154E-314;
        r2 = r12.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x005e }
        r3 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r3 = r12.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x005e }
        r2 = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(r12, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x005e }
        com.whatsapp.ContactInfo.a(r0, r12, r2);	 Catch:{ ActivityNotFoundException -> 0x005e }
    L_0x005a:
        r0 = r1;
        goto L_0x000d;
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = r12.Y;	 Catch:{ ActivityNotFoundException -> 0x0082 }
        if (r0 == 0) goto L_0x006a;
    L_0x0064:
        r0 = 1;
        r12.showDialog(r0);	 Catch:{ ActivityNotFoundException -> 0x0084 }
        if (r4 == 0) goto L_0x0080;
    L_0x006a:
        r0 = com.whatsapp.App.Q();	 Catch:{ ActivityNotFoundException -> 0x0086 }
        if (r0 != 0) goto L_0x007d;
    L_0x0070:
        r0 = r12.getBaseContext();	 Catch:{ ActivityNotFoundException -> 0x0088 }
        r2 = 2131231560; // 0x7f080348 float:1.8079204E38 double:1.052968297E-314;
        r3 = 0;
        com.whatsapp.App.a(r0, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0088 }
        if (r4 == 0) goto L_0x0080;
    L_0x007d:
        r12.Z();	 Catch:{ ActivityNotFoundException -> 0x0088 }
    L_0x0080:
        r0 = r1;
        goto L_0x000d;
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0084 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r12.showDialog(r2);
        r0 = r1;
        goto L_0x000d;
    L_0x0090:
        r12.onSearchRequested();
        r0 = r1;
        goto L_0x000d;
    L_0x0096:
        r0 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x00b9 }
        r0 = r0.p;	 Catch:{ ActivityNotFoundException -> 0x00b9 }
        r0 = com.whatsapp.aup.a(r0);	 Catch:{ ActivityNotFoundException -> 0x00b9 }
        if (r0 == 0) goto L_0x00a7;
    L_0x00a0:
        r0 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r12.showDialog(r0);	 Catch:{ ActivityNotFoundException -> 0x00bb }
        if (r4 == 0) goto L_0x00b6;
    L_0x00a7:
        r12.y();	 Catch:{ ActivityNotFoundException -> 0x00bb }
        r0 = r12.au;	 Catch:{ ActivityNotFoundException -> 0x00bb }
        r2 = 2131755479; // 0x7f1001d7 float:1.9141838E38 double:1.0532271475E-314;
        r2 = r12.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x00bb }
        r0.a(r2);	 Catch:{ ActivityNotFoundException -> 0x00bb }
    L_0x00b6:
        r0 = r1;
        goto L_0x000d;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;
    L_0x00bd:
        r0 = com.whatsapp.App.aX;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        if (r0 != 0) goto L_0x00c5;
    L_0x00c1:
        r0 = com.whatsapp.App.E;	 Catch:{ ActivityNotFoundException -> 0x00fa }
        if (r0 == 0) goto L_0x00dc;
    L_0x00c5:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r2 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r0 = r0[r2];	 Catch:{ ActivityNotFoundException -> 0x00fc }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r0 = com.whatsapp.App.V();	 Catch:{ ActivityNotFoundException -> 0x00fc }
        if (r0 == 0) goto L_0x00fe;
    L_0x00d4:
        r0 = 2131231516; // 0x7f08031c float:1.8079115E38 double:1.0529682754E-314;
    L_0x00d7:
        r12.a(r0);	 Catch:{ ActivityNotFoundException -> 0x0102 }
        if (r4 == 0) goto L_0x00f5;
    L_0x00dc:
        r0 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x0104 }
        r2 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x0104 }
        r2 = r2.p;	 Catch:{ ActivityNotFoundException -> 0x0104 }
        r0 = r0.j(r2);	 Catch:{ ActivityNotFoundException -> 0x0104 }
        if (r0 == 0) goto L_0x00ef;
    L_0x00e8:
        r0 = 10;
        r12.showDialog(r0);	 Catch:{ ActivityNotFoundException -> 0x0106 }
        if (r4 == 0) goto L_0x00f5;
    L_0x00ef:
        r0 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x0106 }
        r2 = 0;
        a(r12, r12, r0, r2);	 Catch:{ ActivityNotFoundException -> 0x0106 }
    L_0x00f5:
        r0 = r1;
        goto L_0x000d;
    L_0x00f8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00fa }
    L_0x00fa:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00fc }
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r0 = 2131231517; // 0x7f08031d float:1.8079117E38 double:1.052968276E-314;
        goto L_0x00d7;
    L_0x0102:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0104 }
    L_0x0104:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0106 }
    L_0x0106:
        r0 = move-exception;
        throw r0;
    L_0x0108:
        r0 = com.whatsapp.App.as;
        r2 = r12.aI;
        r0.f(r2);
        r0 = r1;
        goto L_0x000d;
    L_0x0112:
        r0 = r12.bx;	 Catch:{ ActivityNotFoundException -> 0x0149 }
        if (r0 == 0) goto L_0x012f;
    L_0x0116:
        r0 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x014b }
        r2 = 2131755492; // 0x7f1001e4 float:1.9141865E38 double:1.053227154E-314;
        r2 = r12.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x014b }
        r3 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r3 = r12.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x014b }
        r2 = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(r12, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x014b }
        com.whatsapp.ListChatInfo.a(r0, r12, r2);	 Catch:{ ActivityNotFoundException -> 0x014b }
        if (r4 == 0) goto L_0x0146;
    L_0x012f:
        r0 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x014b }
        r2 = 2131755492; // 0x7f1001e4 float:1.9141865E38 double:1.053227154E-314;
        r2 = r12.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x014b }
        r3 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r3 = r12.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x014b }
        r2 = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(r12, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x014b }
        com.whatsapp.GroupChatInfo.a(r0, r12, r2);	 Catch:{ ActivityNotFoundException -> 0x014b }
    L_0x0146:
        r0 = r1;
        goto L_0x000d;
    L_0x0149:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x014b }
    L_0x014b:
        r0 = move-exception;
        throw r0;
    L_0x014d:
        r0 = com.whatsapp.App.z();	 Catch:{ ActivityNotFoundException -> 0x017d }
        r0 = com.whatsapp.a3b.a(r0);	 Catch:{ ActivityNotFoundException -> 0x017d }
        r2 = r12.ae;	 Catch:{ ActivityNotFoundException -> 0x017d }
        r0 = r0.e(r2);	 Catch:{ ActivityNotFoundException -> 0x017d }
        if (r0 == 0) goto L_0x016c;
    L_0x015d:
        r0 = com.whatsapp.App.z();	 Catch:{ ActivityNotFoundException -> 0x017f }
        r0 = com.whatsapp.a3b.a(r0);	 Catch:{ ActivityNotFoundException -> 0x017f }
        r2 = r12.ae;	 Catch:{ ActivityNotFoundException -> 0x017f }
        r0.a(r2);	 Catch:{ ActivityNotFoundException -> 0x017f }
        if (r4 == 0) goto L_0x017a;
    L_0x016c:
        r0 = r12.ae;	 Catch:{ ActivityNotFoundException -> 0x017f }
        r0 = com.whatsapp.MuteDialogFragment.a(r0);	 Catch:{ ActivityNotFoundException -> 0x017f }
        r2 = r12.getSupportFragmentManager();	 Catch:{ ActivityNotFoundException -> 0x017f }
        r3 = 0;
        r0.show(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x017f }
    L_0x017a:
        r0 = r1;
        goto L_0x000d;
    L_0x017d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x017f }
    L_0x017f:
        r0 = move-exception;
        throw r0;
    L_0x0181:
        r0 = r12.x;	 Catch:{ ActivityNotFoundException -> 0x02b9 }
        if (r0 != 0) goto L_0x018b;
    L_0x0185:
        r0 = android.app.WallpaperManager.getInstance(r12);	 Catch:{ ActivityNotFoundException -> 0x02b9 }
        r12.x = r0;	 Catch:{ ActivityNotFoundException -> 0x02b9 }
    L_0x018b:
        r0 = new android.graphics.Rect;
        r0.<init>();
        r3 = r12.bc;
        r3.getDrawingRect(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = r12.aE;
        r3 = r3.getWidth();
        r0 = r0.append(r3);
        r3 = cb;
        r5 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r3 = r3[r5];
        r0 = r0.append(r3);
        r3 = r12.aE;
        r3 = r3.getHeight();
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r5 = new android.content.Intent;
        r0 = cb;
        r3 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r0 = r0[r3];
        r5.<init>(r0, r11);
        r0 = cb;
        r3 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r0 = r0[r3];
        r5.setType(r0);
        r0 = r12.getPackageManager();
        r6 = r0.queryIntentActivities(r5, r2);
        r7 = r6.size();
        r3 = r2;
    L_0x01e0:
        if (r3 >= r7) goto L_0x025f;
    L_0x01e2:
        r0 = r6.get(r3);
        r0 = (android.content.pm.ResolveInfo) r0;
        r0 = r0.activityInfo;
        r8 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r8.<init>();	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r9 = r0.applicationInfo;	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r9 = r9.packageName;	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r8 = r8.append(r9);	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r9 = cb;	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r10 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r9 = r9[r10];	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r8 = r8.append(r9);	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r9 = r0.name;	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r8 = r8.append(r9);	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r8 = r8.toString();	 Catch:{ ActivityNotFoundException -> 0x02bb }
        com.whatsapp.util.Log.i(r8);	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r8 = r0.name;	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r9 = cb;	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r10 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r9 = r9[r10];	 Catch:{ ActivityNotFoundException -> 0x02bb }
        r8 = r8.contains(r9);	 Catch:{ ActivityNotFoundException -> 0x02bb }
        if (r8 == 0) goto L_0x022a;
    L_0x021c:
        r8 = r0.name;	 Catch:{ ActivityNotFoundException -> 0x02bd }
        r9 = cb;	 Catch:{ ActivityNotFoundException -> 0x02bd }
        r10 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r9 = r9[r10];	 Catch:{ ActivityNotFoundException -> 0x02bd }
        r8 = r8.contains(r9);	 Catch:{ ActivityNotFoundException -> 0x02bd }
        if (r8 != 0) goto L_0x0238;
    L_0x022a:
        r8 = r0.name;	 Catch:{ ActivityNotFoundException -> 0x02bf }
        r9 = cb;	 Catch:{ ActivityNotFoundException -> 0x02bf }
        r10 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r9 = r9[r10];	 Catch:{ ActivityNotFoundException -> 0x02bf }
        r8 = r8.contains(r9);	 Catch:{ ActivityNotFoundException -> 0x02bf }
        if (r8 == 0) goto L_0x025b;
    L_0x0238:
        r8 = new android.content.ComponentName;	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r9 = r0.applicationInfo;	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r9 = r9.packageName;	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r0 = r0.name;	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r8.<init>(r9, r0);	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r5.setComponent(r8);	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r8 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r0 = r0[r8];	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r8 = r12.getResources();	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r8 = r8.getConfiguration();	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r8 = r8.orientation;	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        r5.putExtra(r0, r8);	 Catch:{ ActivityNotFoundException -> 0x02c1 }
        if (r4 == 0) goto L_0x025f;
    L_0x025b:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x02eb;
    L_0x025f:
        r0 = new android.content.Intent;
        r3 = cb;
        r4 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r3 = r3[r4];
        r0.<init>(r3, r11);
        r3 = cb;
        r4 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r3 = r3[r4];
        r4 = r12.getResources();
        r4 = r4.getConfiguration();
        r4 = r4.orientation;
        r0.putExtra(r3, r4);
        r3 = new android.content.Intent;
        r4 = cb;
        r6 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r4 = r4[r6];
        r3.<init>(r4, r11);
        r4 = 3;
        r4 = new android.os.Parcelable[r4];
        r4[r2] = r5;
        r4[r1] = r0;
        r0 = 2;
        r4[r0] = r3;
        r0 = new android.content.Intent;
        r2 = cb;
        r3 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r2 = r2[r3];
        r0.<init>(r2, r11);
        r2 = 2131231695; // 0x7f0803cf float:1.8079478E38 double:1.052968364E-314;
        r2 = r12.getString(r2);
        r0 = android.content.Intent.createChooser(r0, r2);
        r2 = cb;
        r3 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r2 = r2[r3];
        r0.putExtra(r2, r4);
        r2 = 17;
        r12.startActivityForResult(r0, r2);
        r0 = r1;
        goto L_0x000d;
    L_0x02b9:
        r0 = move-exception;
        throw r0;
    L_0x02bb:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02bd }
    L_0x02bd:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02bf }
    L_0x02bf:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02c1 }
    L_0x02c1:
        r0 = move-exception;
        throw r0;
    L_0x02c3:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.MediaGallery.class;
        r0.<init>(r12, r2);
        r2 = cb;
        r3 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r2 = r2[r3];
        r3 = r12.aI;
        r3 = r3.p;
        r0.putExtra(r2, r3);
        r12.startActivity(r0);
        bh = r1;
        r0 = r1;
        goto L_0x000d;
    L_0x02df:
        r0 = r12.aI;
        r2 = com.whatsapp.fieldstats.cd.CONVERSATION;
        r3 = r12.bf;
        com.whatsapp.App.a(r0, r12, r2, r3);
        r0 = r1;
        goto L_0x000d;
    L_0x02eb:
        r3 = r0;
        goto L_0x01e0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    static ImageView p(Conversation conversation) {
        return conversation.ai;
    }

    static void e(Conversation conversation, boolean z) {
        conversation.e(z);
    }

    private void p() {
        int i;
        int i2 = 0;
        boolean z = DialogToastActivity.f;
        Cursor cursor = this.bd.getCursor();
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    i = 0;
                    do {
                        co a = App.aK.a(cursor, this.ae);
                        if (a.k.a) {
                            try {
                                if (a.d == 6) {
                                    if (!qm.a(a)) {
                                        i++;
                                    }
                                }
                            } catch (ActivityNotFoundException e) {
                                throw e;
                            } catch (ActivityNotFoundException e2) {
                                throw e2;
                            }
                        }
                        i2++;
                        try {
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        } catch (ActivityNotFoundException e22) {
                            throw e22;
                        }
                    } while (i2 < this.aa + i);
                    i2 = cursor.getCount();
                    if (this.aa + i >= i2) {
                        if (this.aa + i > i2) {
                            Log.e(cb[arj.Theme_seekBarStyle] + this.aa + cb[arj.Theme_spinnerStyle] + i + cb[arj.Theme_radioButtonStyle] + i2 + cb[arj.Theme_ratingBarStyle] + this.af);
                        }
                        try {
                            this.aa = 0;
                            if (!z) {
                                return;
                            }
                        } catch (ActivityNotFoundException e222) {
                            throw e222;
                        }
                    }
                    this.aa += i;
                }
            } catch (ActivityNotFoundException e2222) {
                throw e2222;
            }
        }
        i = 0;
        i2 = cursor.getCount();
        try {
            if (this.aa + i >= i2) {
                if (this.aa + i > i2) {
                    Log.e(cb[arj.Theme_seekBarStyle] + this.aa + cb[arj.Theme_spinnerStyle] + i + cb[arj.Theme_radioButtonStyle] + i2 + cb[arj.Theme_ratingBarStyle] + this.af);
                }
                this.aa = 0;
                if (z) {
                    return;
                }
            }
            this.aa += i;
        } catch (ActivityNotFoundException e22222) {
            throw e22222;
        } catch (ActivityNotFoundException e222222) {
            throw e222222;
        }
    }

    public static Intent a(Context context, l5 l5Var) {
        return new Intent(null, l5Var.q(), context, Conversation.class).addFlags(335544320);
    }

    private void T() {
        this.bc.post(new i(this));
    }

    static void aB(Conversation conversation) {
        conversation.Y();
    }

    private void H() {
        try {
            if (this.aP == null) {
                P();
                this.bc.addFooterView(this.aP);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void f(co coVar) {
        try {
            boolean z;
            if (coVar.I != -1) {
                z = true;
            } else {
                z = false;
            }
            auv.a(z, cb[3]);
            try {
                int count = this.bd.getCursor().getCount();
                if (count > 0) {
                    try {
                        if (this.bd.b(count - 1).I >= coVar.I) {
                            Log.i(cb[4] + Log.a(coVar));
                            if (!DialogToastActivity.f) {
                                return;
                            }
                        }
                    } catch (StaleDataException e) {
                        throw e;
                    } catch (StaleDataException e2) {
                        throw e2;
                    }
                }
                try {
                    this.ah.add(coVar);
                } catch (StaleDataException e22) {
                    throw e22;
                }
            } catch (StaleDataException e222) {
                Log.i(cb[2] + e222.toString());
                this.ah.add(coVar);
            }
        } catch (StaleDataException e2222) {
            throw e2222;
        }
    }

    public void a(String str) {
        try {
            if (str.equals(this.ae)) {
                D();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private MenuItem a(Menu menu, int i, int i2) {
        return menu.add(0, i, 0, i2);
    }

    public boolean c() {
        return false;
    }

    static boolean an(Conversation conversation) {
        return conversation.aU;
    }

    static String f(Conversation conversation, String str) {
        conversation.ay = str;
        return str;
    }

    static boolean ag(Conversation conversation) {
        return conversation.a1;
    }

    public void a(Collection collection) {
        try {
            if (this.by != null) {
                n();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r6 = this;
        r4 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r6.K;
        r2 = com.whatsapp.t4.ON_RESUME;
        r0.b(r2);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = cb;
        r3 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r6.aI;
        r2 = r2.p;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r2 = new com.whatsapp.util.ab;
        r0 = cb;
        r3 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r0 = r0[r3];
        r2.<init>(r0);
        super.onResume();	 Catch:{ IllegalStateException -> 0x0194 }
        com.whatsapp.notification.d.a();	 Catch:{ IllegalStateException -> 0x0194 }
        r0 = com.whatsapp.wallpaper.k.b;	 Catch:{ IllegalStateException -> 0x0194 }
        if (r0 == 0) goto L_0x0056;
    L_0x003d:
        r0 = r6.aq;	 Catch:{ IllegalStateException -> 0x0194 }
        if (r0 == 0) goto L_0x0047;
    L_0x0041:
        r0 = com.whatsapp.wallpaper.k.g(r6);
        if (r1 == 0) goto L_0x004f;
    L_0x0047:
        r0 = r6.aI;
        r0 = r0.p;
        r0 = com.whatsapp.wallpaper.k.a(r6, r0);
    L_0x004f:
        if (r0 == 0) goto L_0x0054;
    L_0x0051:
        r6.a(r0);	 Catch:{ IllegalStateException -> 0x0196 }
    L_0x0054:
        com.whatsapp.wallpaper.k.b = r4;
    L_0x0056:
        r0 = r6.aI;	 Catch:{ IllegalStateException -> 0x0198 }
        r0 = r0.p;	 Catch:{ IllegalStateException -> 0x0198 }
        r0 = com.whatsapp.qa.d(r0);	 Catch:{ IllegalStateException -> 0x0198 }
        r6.aI = r0;	 Catch:{ IllegalStateException -> 0x0198 }
        r0 = com.whatsapp.vh.f(r6);	 Catch:{ IllegalStateException -> 0x0198 }
        if (r0 != 0) goto L_0x006d;
    L_0x0066:
        r0 = r6.aI;	 Catch:{ IllegalStateException -> 0x0198 }
        r3 = 0;
        r4 = 1;
        com.whatsapp.App.a(r0, r3, r4);	 Catch:{ IllegalStateException -> 0x0198 }
    L_0x006d:
        r6.D();	 Catch:{ IllegalStateException -> 0x019a }
        r0 = r6.aI;	 Catch:{ IllegalStateException -> 0x019a }
        r0 = r0.c();	 Catch:{ IllegalStateException -> 0x019a }
        if (r0 != 0) goto L_0x007d;
    L_0x0078:
        r0 = r6.aI;	 Catch:{ IllegalStateException -> 0x019a }
        com.whatsapp.App.a(r0);	 Catch:{ IllegalStateException -> 0x019a }
    L_0x007d:
        r0 = r6.by;	 Catch:{ IllegalStateException -> 0x019c }
        if (r0 == 0) goto L_0x0084;
    L_0x0081:
        r6.n();	 Catch:{ IllegalStateException -> 0x019c }
    L_0x0084:
        r0 = z;	 Catch:{ IllegalStateException -> 0x019e }
        if (r0 == 0) goto L_0x0097;
    L_0x0088:
        r0 = r6.a2;	 Catch:{ IllegalStateException -> 0x019e }
        if (r0 != 0) goto L_0x0097;
    L_0x008c:
        r0 = r6.bo;	 Catch:{ IllegalStateException -> 0x01a0 }
        if (r0 != 0) goto L_0x0097;
    L_0x0090:
        r0 = com.whatsapp.notification.ao.c();	 Catch:{ IllegalStateException -> 0x01a2 }
        r0.a();	 Catch:{ IllegalStateException -> 0x01a2 }
    L_0x0097:
        r0 = 0;
        z = r0;	 Catch:{ IllegalStateException -> 0x01a4 }
        r0 = aC;	 Catch:{ IllegalStateException -> 0x01a4 }
        r3 = r6.aI;	 Catch:{ IllegalStateException -> 0x01a4 }
        r3 = r3.p;	 Catch:{ IllegalStateException -> 0x01a4 }
        r0 = r0.remove(r3);	 Catch:{ IllegalStateException -> 0x01a4 }
        if (r0 == 0) goto L_0x00b3;
    L_0x00a6:
        r0 = cb;	 Catch:{ IllegalStateException -> 0x01a4 }
        r3 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r0 = r0[r3];	 Catch:{ IllegalStateException -> 0x01a4 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x01a4 }
        r0 = 2;
        r6.showDialog(r0);	 Catch:{ IllegalStateException -> 0x01a4 }
    L_0x00b3:
        r0 = com.whatsapp.App.g;	 Catch:{ IllegalStateException -> 0x01a6 }
        r0.stop();	 Catch:{ IllegalStateException -> 0x01a6 }
    L_0x00b8:
        r0 = r6.bc;	 Catch:{ IllegalStateException -> 0x01b2 }
        r3 = 0;
        r0.setFastScrollEnabled(r3);	 Catch:{ IllegalStateException -> 0x01b2 }
        r0 = r6.a2;	 Catch:{ IllegalStateException -> 0x01b2 }
        if (r0 == 0) goto L_0x00c7;
    L_0x00c2:
        r0 = 0;
        r6.a2 = r0;	 Catch:{ IllegalStateException -> 0x01b4 }
        if (r1 == 0) goto L_0x00de;
    L_0x00c7:
        r0 = r6.bo;	 Catch:{ IllegalStateException -> 0x01b6 }
        if (r0 == 0) goto L_0x00de;
    L_0x00cb:
        r0 = new com.whatsapp.uv;	 Catch:{ IllegalStateException -> 0x01b6 }
        r3 = android.os.Looper.getMainLooper();	 Catch:{ IllegalStateException -> 0x01b6 }
        r0.<init>(r6, r3);	 Catch:{ IllegalStateException -> 0x01b6 }
        r6.aT = r0;	 Catch:{ IllegalStateException -> 0x01b6 }
        r0 = r6.aT;	 Catch:{ IllegalStateException -> 0x01b6 }
        r3 = 0;
        r4 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r0.sendEmptyMessageDelayed(r3, r4);	 Catch:{ IllegalStateException -> 0x01b6 }
    L_0x00de:
        r0 = r6.aU;
        if (r0 == 0) goto L_0x010d;
    L_0x00e2:
        r0 = r6.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getHeight();
        r3 = r6.getResources();
        r4 = 2131427495; // 0x7f0b00a7 float:1.8476608E38 double:1.053065102E-314;
        r3 = r3.getDimensionPixelSize(r4);
        r3 = r3 * 2;
        r0 = r0 - r3;
        r0 = r0 / 4;
        r3 = r6.bc;	 Catch:{ IllegalStateException -> 0x01b8 }
        r4 = new com.whatsapp.aaf;	 Catch:{ IllegalStateException -> 0x01b8 }
        r4.<init>(r6, r0);	 Catch:{ IllegalStateException -> 0x01b8 }
        r3.post(r4);	 Catch:{ IllegalStateException -> 0x01b8 }
        r0 = 1;
        r6.J = r0;	 Catch:{ IllegalStateException -> 0x01b8 }
        if (r1 == 0) goto L_0x0131;
    L_0x010d:
        r0 = r6.at;	 Catch:{ IllegalStateException -> 0x01ba }
        if (r0 == 0) goto L_0x011f;
    L_0x0111:
        r0 = r6.bc;	 Catch:{ IllegalStateException -> 0x01bc }
        r3 = 0;
        r0.setSelection(r3);	 Catch:{ IllegalStateException -> 0x01bc }
        r0 = 1;
        r6.J = r0;	 Catch:{ IllegalStateException -> 0x01bc }
        r0 = 1;
        r6.aU = r0;	 Catch:{ IllegalStateException -> 0x01bc }
        if (r1 == 0) goto L_0x0131;
    L_0x011f:
        r0 = r6.aw;	 Catch:{ IllegalStateException -> 0x01be }
        if (r0 == 0) goto L_0x0128;
    L_0x0123:
        r6.x();	 Catch:{ IllegalStateException -> 0x01c0 }
        if (r1 == 0) goto L_0x0131;
    L_0x0128:
        r0 = r6.bc;	 Catch:{ IllegalStateException -> 0x01c0 }
        r3 = r6.X;	 Catch:{ IllegalStateException -> 0x01c0 }
        r4 = r6.aW;	 Catch:{ IllegalStateException -> 0x01c0 }
        r0.setSelectionFromTop(r3, r4);	 Catch:{ IllegalStateException -> 0x01c0 }
    L_0x0131:
        r0 = r6.ax;	 Catch:{ IllegalStateException -> 0x01c2 }
        r3 = 1;
        r0.setSelected(r3);	 Catch:{ IllegalStateException -> 0x01c2 }
        r0 = r6.bd;	 Catch:{ IllegalStateException -> 0x01c2 }
        r0 = r0.getCount();	 Catch:{ IllegalStateException -> 0x01c2 }
        if (r0 != 0) goto L_0x0149;
    L_0x013f:
        r0 = r6.aK;	 Catch:{ IllegalStateException -> 0x01c4 }
        r3 = 0;
        r4 = 100;
        r0.sendEmptyMessageDelayed(r3, r4);	 Catch:{ IllegalStateException -> 0x01c4 }
        if (r1 == 0) goto L_0x0151;
    L_0x0149:
        r0 = r6.aK;	 Catch:{ IllegalStateException -> 0x01c4 }
        r1 = 1;
        r4 = 100;
        r0.sendEmptyMessageDelayed(r1, r4);	 Catch:{ IllegalStateException -> 0x01c4 }
    L_0x0151:
        r0 = com.whatsapp.App.aC();	 Catch:{ IllegalStateException -> 0x01c6 }
        if (r0 == 0) goto L_0x0165;
    L_0x0157:
        r0 = cb;	 Catch:{ IllegalStateException -> 0x01c6 }
        r1 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x01c6 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x01c6 }
        r0 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r6.showDialog(r0);	 Catch:{ IllegalStateException -> 0x01c6 }
    L_0x0165:
        r0 = com.whatsapp.App.aI();	 Catch:{ IllegalStateException -> 0x01c8 }
        if (r0 == 0) goto L_0x0177;
    L_0x016b:
        r0 = cb;	 Catch:{ IllegalStateException -> 0x01c8 }
        r1 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x01c8 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x01c8 }
        r6.b();	 Catch:{ IllegalStateException -> 0x01c8 }
    L_0x0177:
        r0 = com.whatsapp.Voip.d();	 Catch:{ IllegalStateException -> 0x01ca }
        if (r0 == 0) goto L_0x0189;
    L_0x017d:
        r0 = cb;	 Catch:{ IllegalStateException -> 0x01ca }
        r1 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x01ca }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x01ca }
        r6.j();	 Catch:{ IllegalStateException -> 0x01ca }
    L_0x0189:
        r2.b();
        r0 = r6.K;
        r1 = com.whatsapp.t4.ON_RESUME;
        r0.a(r1);
        return;
    L_0x0194:
        r0 = move-exception;
        throw r0;
    L_0x0196:
        r0 = move-exception;
        throw r0;
    L_0x0198:
        r0 = move-exception;
        throw r0;
    L_0x019a:
        r0 = move-exception;
        throw r0;
    L_0x019c:
        r0 = move-exception;
        throw r0;
    L_0x019e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01a0 }
    L_0x01a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01a2 }
    L_0x01a2:
        r0 = move-exception;
        throw r0;
    L_0x01a4:
        r0 = move-exception;
        throw r0;
    L_0x01a6:
        r0 = move-exception;
        r0 = cb;
        r3 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r0 = r0[r3];
        com.whatsapp.util.Log.e(r0);
        goto L_0x00b8;
    L_0x01b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01b4 }
    L_0x01b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01b6 }
    L_0x01b6:
        r0 = move-exception;
        throw r0;
    L_0x01b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01ba }
    L_0x01ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01bc }
    L_0x01bc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01be }
    L_0x01be:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01c0 }
    L_0x01c0:
        r0 = move-exception;
        throw r0;
    L_0x01c2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01c4 }
    L_0x01c4:
        r0 = move-exception;
        throw r0;
    L_0x01c6:
        r0 = move-exception;
        throw r0;
    L_0x01c8:
        r0 = move-exception;
        throw r0;
    L_0x01ca:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onResume():void");
    }

    private void x() {
        try {
            if (this.J) {
                this.aU = false;
                this.at = false;
            }
            try {
                if (!this.at) {
                    this.aN = true;
                    this.bc.post(new a6(this));
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public void b(String str) {
        try {
            if (str.equals(this.ae)) {
                o();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void Y() {
        try {
            if (!a(35)) {
                return;
            }
            if (App.a(this.P)) {
                ag.b(this, this.aI.p);
                bh = false;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static void b(Conversation conversation, co coVar) {
        conversation.e(coVar);
    }

    static Set E() {
        return ap;
    }

    public boolean onSearchRequested() {
        try {
            if (this.aj == null) {
                try {
                    if (this.v != null) {
                        this.v.finish();
                    }
                    try {
                        if (this.a8 == null) {
                            this.a8 = new aqx(this);
                        }
                        this.bs.setVisibility(8);
                        this.aj = startSupportActionMode(this.a8);
                        int[] iArr = new int[2];
                        this.bs.getLocationOnScreen(iArr);
                        try {
                            if (((float) (getWindowManager().getDefaultDisplay().getHeight() - (iArr[1] + this.bs.getHeight()))) < 128.0f * this.ag.g) {
                                this.I.toggleSoftInput(0, 0);
                            }
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                } catch (ActivityNotFoundException e22) {
                    throw e22;
                }
            }
            return false;
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
        r4 = this;
        r3 = 0;
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x009f }
        r1 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x009f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x009f }
        super.onPause();	 Catch:{ ActivityNotFoundException -> 0x009f }
        r0 = r4.K;	 Catch:{ ActivityNotFoundException -> 0x009f }
        r0.b();	 Catch:{ ActivityNotFoundException -> 0x009f }
        r0 = r4.a4;	 Catch:{ ActivityNotFoundException -> 0x009f }
        if (r0 == 0) goto L_0x001c;
    L_0x0016:
        r0 = r4.a4;	 Catch:{ ActivityNotFoundException -> 0x009f }
        r1 = 0;
        r0.b(r1);	 Catch:{ ActivityNotFoundException -> 0x009f }
    L_0x001c:
        r0 = U;	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r1 = r4.aI;	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r1 = r1.p;	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r2 = r4.Z;	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r2 = r2.getText();	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r2 = r2.toString();	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r2 = com.whatsapp.a28.a(r2);	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r0.put(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r0 = 1;
        r4.aS = r0;	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r0 = r4.aT;	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        if (r0 == 0) goto L_0x0061;
    L_0x003a:
        r0 = r4.aT;	 Catch:{ ActivityNotFoundException -> 0x00a3 }
        r1 = 0;
        r0 = r0.hasMessages(r1);	 Catch:{ ActivityNotFoundException -> 0x00a3 }
        if (r0 == 0) goto L_0x0061;
    L_0x0043:
        r0 = r4.aT;	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r1 = 0;
        r0.removeMessages(r1);	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r1 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r0 = r4.getSystemService(r0);	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r0 = (android.os.PowerManager) r0;	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r0 = r0.isScreenOn();	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        if (r0 == 0) goto L_0x0061;
    L_0x005b:
        r0 = r4.aT;	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        r1 = 0;
        r0.sendEmptyMessage(r1);	 Catch:{ ActivityNotFoundException -> 0x00a5 }
    L_0x0061:
        r0 = r4.bc;	 Catch:{ ActivityNotFoundException -> 0x00a7 }
        r0 = r0.getHeight();	 Catch:{ ActivityNotFoundException -> 0x00a7 }
        if (r0 == 0) goto L_0x009b;
    L_0x0069:
        r0 = r4.bc;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        r0 = r0.getLastVisiblePosition();	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        r1 = r4.bc;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        r1 = r1.getCount();	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        r1 = r1 + -1;
        if (r0 != r1) goto L_0x0080;
    L_0x0079:
        r0 = 1;
        r4.aw = r0;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        if (r0 == 0) goto L_0x009b;
    L_0x0080:
        r0 = r4.bc;
        r0 = r0.getFirstVisiblePosition();
        r4.X = r0;
        r0 = r4.bc;
        r0 = r0.getChildAt(r3);
        r1 = 0;
        r4.aW = r1;	 Catch:{ ActivityNotFoundException -> 0x00ab }
        if (r0 == 0) goto L_0x0099;
    L_0x0093:
        r0 = r0.getTop();	 Catch:{ ActivityNotFoundException -> 0x00ab }
        r4.aW = r0;	 Catch:{ ActivityNotFoundException -> 0x00ab }
    L_0x0099:
        r4.aw = r3;
    L_0x009b:
        r4.I();
        return;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onPause():void");
    }

    static void S(Conversation conversation) {
        conversation.v();
    }

    static HashSet B(Conversation conversation) {
        return conversation.aV;
    }

    private static void e(Conversation conversation) {
        ak.set(new a4r(conversation, true));
    }

    private static void u(Conversation conversation) {
        a4r com_whatsapp_a4r = (a4r) ak.get();
        try {
            if (a4r.a(com_whatsapp_a4r) == conversation) {
                ak.compareAndSet(com_whatsapp_a4r, new a4r(conversation, false));
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void q(Conversation conversation) {
        conversation.I();
    }

    static boolean c(Conversation conversation, boolean z) {
        conversation.a1 = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean W() {
        /*
        r14 = this;
        r5 = com.whatsapp.DialogToastActivity.f;
        r6 = new com.whatsapp.util.ab;
        r0 = cb;
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r0 = r0[r1];
        r6.<init>(r0);
        r0 = r14.getIntent();	 Catch:{ ActivityNotFoundException -> 0x0082 }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x0082 }
        r2 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0082 }
        r0 = r0.getStringExtra(r1);	 Catch:{ ActivityNotFoundException -> 0x0082 }
        r14.ae = r0;	 Catch:{ ActivityNotFoundException -> 0x0082 }
        r0 = r14.ae;	 Catch:{ ActivityNotFoundException -> 0x0082 }
        if (r0 != 0) goto L_0x0031;
    L_0x0021:
        r0 = r14.getIntent();	 Catch:{ ActivityNotFoundException -> 0x0082 }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x0082 }
        r2 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0082 }
        r0 = r0.getStringExtra(r1);	 Catch:{ ActivityNotFoundException -> 0x0082 }
        r14.ae = r0;	 Catch:{ ActivityNotFoundException -> 0x0082 }
    L_0x0031:
        r0 = 1;
        r1 = r14.ae;
        if (r1 != 0) goto L_0x0171;
    L_0x0036:
        r0 = r14.getIntent();
        r1 = r0.getData();	 Catch:{ ActivityNotFoundException -> 0x0084 }
        if (r1 == 0) goto L_0x0162;
    L_0x0040:
        r1 = r0.getData();	 Catch:{ ActivityNotFoundException -> 0x0086 }
        r1 = r1.getScheme();	 Catch:{ ActivityNotFoundException -> 0x0086 }
        if (r1 == 0) goto L_0x0162;
    L_0x004a:
        r1 = r0.getData();	 Catch:{ ActivityNotFoundException -> 0x0088 }
        r1 = r1.getScheme();	 Catch:{ ActivityNotFoundException -> 0x0088 }
        r2 = cb;	 Catch:{ ActivityNotFoundException -> 0x0088 }
        r3 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0088 }
        r1 = r1.equals(r2);	 Catch:{ ActivityNotFoundException -> 0x0088 }
        if (r1 != 0) goto L_0x0072;
    L_0x005e:
        r0 = r0.getData();	 Catch:{ ActivityNotFoundException -> 0x0088 }
        r0 = r0.getScheme();	 Catch:{ ActivityNotFoundException -> 0x0088 }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x0088 }
        r2 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0088 }
        r0 = r0.equals(r1);	 Catch:{ ActivityNotFoundException -> 0x0088 }
        if (r0 == 0) goto L_0x0162;
    L_0x0072:
        r0 = r14.getIntent();
        r0 = r0.getData();
        r2 = r0.toString();
        if (r2 != 0) goto L_0x008a;
    L_0x0080:
        r0 = 0;
    L_0x0081:
        return r0;
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = ":";
        r0 = r2.split(r0);
        if (r0 == 0) goto L_0x0152;
    L_0x0093:
        r1 = r0.length;	 Catch:{ ActivityNotFoundException -> 0x0148 }
        r3 = 2;
        if (r1 != r3) goto L_0x0152;
    L_0x0097:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = cb;
        r4 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r3 = 1;
        r3 = r0[r3];
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = 1;
        r0 = r0[r1];
        r0 = java.net.URLDecoder.decode(r0);
        r0 = android.telephony.PhoneNumberUtils.stripSeparators(r0);
        r1 = r0.length();	 Catch:{ ActivityNotFoundException -> 0x014a }
        if (r1 <= 0) goto L_0x00d5;
    L_0x00c5:
        r1 = 0;
        r1 = r0.charAt(r1);	 Catch:{ ActivityNotFoundException -> 0x014a }
        r1 = java.lang.Character.isDigit(r1);	 Catch:{ ActivityNotFoundException -> 0x014a }
        if (r1 != 0) goto L_0x00d5;
    L_0x00d0:
        r1 = 1;
        r0 = r0.substring(r1);
    L_0x00d5:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = cb;
        r3 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r0 = r0.toString();
        r1 = 0;
        r3 = com.whatsapp.App.as;
        r3 = r3.i(r0);
        r0 = r3.size();	 Catch:{ ActivityNotFoundException -> 0x014c }
        if (r0 <= 0) goto L_0x0131;
    L_0x00f9:
        r0 = 0;
        r0 = r3.get(r0);	 Catch:{ ActivityNotFoundException -> 0x014e }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ ActivityNotFoundException -> 0x014e }
        r0 = r0.m;	 Catch:{ ActivityNotFoundException -> 0x014e }
        if (r0 == 0) goto L_0x0131;
    L_0x0104:
        r0 = 0;
        r0 = r3.get(r0);	 Catch:{ ActivityNotFoundException -> 0x014e }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ ActivityNotFoundException -> 0x014e }
        r14.aI = r0;	 Catch:{ ActivityNotFoundException -> 0x014e }
        r0 = r14.aI;	 Catch:{ ActivityNotFoundException -> 0x014e }
        r0 = r0.p;	 Catch:{ ActivityNotFoundException -> 0x014e }
        r14.ae = r0;	 Catch:{ ActivityNotFoundException -> 0x014e }
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x014e }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x014e }
        r3 = cb;	 Catch:{ ActivityNotFoundException -> 0x014e }
        r4 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x014e }
        r0 = r0.append(r3);	 Catch:{ ActivityNotFoundException -> 0x014e }
        r3 = r14.ae;	 Catch:{ ActivityNotFoundException -> 0x014e }
        r0 = r0.append(r3);	 Catch:{ ActivityNotFoundException -> 0x014e }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x014e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x014e }
        if (r5 == 0) goto L_0x0150;
    L_0x0131:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.SmsDefaultAppWarning.class;
        r0.<init>(r14, r1);
        r1 = android.net.Uri.parse(r2);
        r0.setData(r1);
        r14.startActivity(r0);
        r14.finish();
        r0 = 0;
        goto L_0x0081;
    L_0x0148:
        r0 = move-exception;
        throw r0;
    L_0x014a:
        r0 = move-exception;
        throw r0;
    L_0x014c:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x014e }
    L_0x014e:
        r0 = move-exception;
        throw r0;
    L_0x0150:
        if (r5 == 0) goto L_0x0160;
    L_0x0152:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x015e }
        r1 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x015e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ActivityNotFoundException -> 0x015e }
        r0 = 0;
        goto L_0x0081;
    L_0x015e:
        r0 = move-exception;
        throw r0;
    L_0x0160:
        if (r5 == 0) goto L_0x0170;
    L_0x0162:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x016e }
        r1 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x016e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ActivityNotFoundException -> 0x016e }
        r0 = 0;
        goto L_0x0081;
    L_0x016e:
        r0 = move-exception;
        throw r0;
    L_0x0170:
        r0 = r1;
    L_0x0171:
        if (r0 == 0) goto L_0x017b;
    L_0x0173:
        r0 = r14.ae;	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        r0 = com.whatsapp.qa.d(r0);	 Catch:{ ActivityNotFoundException -> 0x01b1 }
        r14.aI = r0;	 Catch:{ ActivityNotFoundException -> 0x01b1 }
    L_0x017b:
        r0 = r14.aI;	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = r0.c();	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r14.ar = r0;	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = r14.aI;	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = r0.m();	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r14.bx = r0;	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        e(r14);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = r14.aI;	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        if (r0 != 0) goto L_0x01b5;
    L_0x0192:
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r2 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r1 = r14.ae;	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ActivityNotFoundException -> 0x01b3 }
        r0 = 0;
        goto L_0x0081;
    L_0x01b1:
        r0 = move-exception;
        throw r0;
    L_0x01b3:
        r0 = move-exception;
        throw r0;
    L_0x01b5:
        r0 = 0;
        r1 = r14.aI;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r1 = r1.d;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0 = java.lang.Math.max(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r14.af = r0;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0 = new java.util.HashMap;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r14.aX = r0;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0 = new java.util.ArrayList;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r14.ah = r0;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0 = new java.util.HashSet;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r14.aL = r0;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0 = new com.whatsapp.a4l;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r1 = 0;
        r2 = 0;
        r0.<init>(r14, r14, r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r14.bd = r0;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0 = r14.bd;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r1 = r14.S;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0.registerDataSetObserver(r1);	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r1 = 13;
        if (r0 > r1) goto L_0x01f8;
    L_0x01eb:
        r14.G();	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0 = r14.bc;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r1 = r14.by;	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r0.addHeaderView(r1);	 Catch:{ ActivityNotFoundException -> 0x0437 }
        r14.H();	 Catch:{ ActivityNotFoundException -> 0x0437 }
    L_0x01f8:
        r0 = r14.bc;	 Catch:{ ActivityNotFoundException -> 0x0439 }
        r1 = r14.bd;	 Catch:{ ActivityNotFoundException -> 0x0439 }
        r0.setAdapter(r1);	 Catch:{ ActivityNotFoundException -> 0x0439 }
        r0 = com.whatsapp.vh.f(r14);	 Catch:{ ActivityNotFoundException -> 0x0439 }
        if (r0 != 0) goto L_0x020c;
    L_0x0205:
        r0 = r14.aI;	 Catch:{ ActivityNotFoundException -> 0x0439 }
        r1 = 0;
        r2 = 1;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0439 }
    L_0x020c:
        r0 = com.whatsapp.notification.ao.c();
        r0.a();
        r0 = com.whatsapp.notification.AndroidWear.a();
        if (r0 == 0) goto L_0x0240;
    L_0x0219:
        r0 = com.whatsapp.qa.g();
        r1 = r0.iterator();
    L_0x0221:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0240;
    L_0x0227:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r2 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x043b }
        r2 = r2.b(r0);	 Catch:{ ActivityNotFoundException -> 0x043b }
        r2 = r2.d;	 Catch:{ ActivityNotFoundException -> 0x043b }
        if (r2 <= 0) goto L_0x023e;
    L_0x0237:
        r2 = com.whatsapp.notification.ao.c();	 Catch:{ ActivityNotFoundException -> 0x043b }
        r2.b(r0);	 Catch:{ ActivityNotFoundException -> 0x043b }
    L_0x023e:
        if (r5 == 0) goto L_0x0221;
    L_0x0240:
        r0 = 0;
        r14.bo = r0;	 Catch:{ ActivityNotFoundException -> 0x043d }
        r0 = r14.av;	 Catch:{ ActivityNotFoundException -> 0x043d }
        if (r0 != 0) goto L_0x0251;
    L_0x0247:
        r0 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x043d }
        r1 = r14.A;	 Catch:{ ActivityNotFoundException -> 0x043d }
        r0.b(r1);	 Catch:{ ActivityNotFoundException -> 0x043d }
        r0 = 1;
        r14.av = r0;	 Catch:{ ActivityNotFoundException -> 0x043d }
    L_0x0251:
        r7 = r14.getIntent();
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x043f }
        r1 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x043f }
        r1 = 0;
        r0 = r7.getBooleanExtra(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x043f }
        if (r0 == 0) goto L_0x039b;
    L_0x0262:
        r0 = r14.az;	 Catch:{ ActivityNotFoundException -> 0x0441 }
        if (r0 != 0) goto L_0x039b;
    L_0x0266:
        r0 = ad;	 Catch:{ ActivityNotFoundException -> 0x0441 }
        if (r0 == 0) goto L_0x039b;
    L_0x026a:
        r0 = cb;
        r1 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r0 = r0[r1];
        r1 = 0;
        r7.putExtra(r0, r1);
        r0 = 0;
        ad = r0;
        r8 = com.whatsapp.vh.j(r14);
        r0 = 1;
        r14.R = r0;
        r0 = r7.getExtras();
        r1 = cb;
        r2 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r1 = r1[r2];
        r2 = r0.getByte(r1);
        r0 = cb;
        r1 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r0 = r0[r1];
        r4 = r7.getStringExtra(r0);
        r0 = cb;
        r1 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r0 = r0[r1];
        r0 = r7.getParcelableArrayListExtra(r0);
        if (r0 == 0) goto L_0x033e;
    L_0x02a2:
        r9 = new java.util.ArrayList;
        r9.<init>();
        r10 = r0.iterator();
    L_0x02ab:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x02f8;
    L_0x02b1:
        r0 = r10.next();
        r0 = (android.net.Uri) r0;
        r1 = -1;
        if (r2 != r1) goto L_0x0445;
    L_0x02ba:
        r1 = com.whatsapp.util.ag.e(r0);	 Catch:{ ActivityNotFoundException -> 0x0443 }
    L_0x02be:
        r3 = android.text.TextUtils.isEmpty(r4);	 Catch:{ ActivityNotFoundException -> 0x0448 }
        if (r3 == 0) goto L_0x044a;
    L_0x02c4:
        r3 = com.whatsapp.util.ag.h(r0);	 Catch:{ ActivityNotFoundException -> 0x0448 }
    L_0x02c8:
        r11 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        r11.<init>();	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        r12 = cb;	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        r13 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r12 = r12[r13];	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        r11 = r11.append(r12);	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        r11 = r11.append(r1);	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        r12 = cb;	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        r13 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r12 = r12[r13];	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        r11 = r11.append(r12);	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        r11 = r11.append(r0);	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        r11 = r11.toString();	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        com.whatsapp.util.Log.i(r11);	 Catch:{ ActivityNotFoundException -> 0x04a9 }
        switch(r1) {
            case 1: goto L_0x0481;
            case 2: goto L_0x044d;
            case 3: goto L_0x0462;
            case 4: goto L_0x0486;
            case 5: goto L_0x02f3;
            case 6: goto L_0x02f3;
            case 7: goto L_0x02f3;
            case 8: goto L_0x02f3;
            case 9: goto L_0x0459;
            default: goto L_0x02f3;
        };
    L_0x02f3:
        r14.finish();	 Catch:{ ActivityNotFoundException -> 0x04b5 }
    L_0x02f6:
        if (r5 == 0) goto L_0x02ab;
    L_0x02f8:
        r0 = r9.isEmpty();	 Catch:{ ActivityNotFoundException -> 0x04b7 }
        if (r0 != 0) goto L_0x033c;
    L_0x02fe:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x04b9 }
        r1 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x04b9 }
        r1 = 0;
        r0 = r7.getBooleanExtra(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x04b9 }
        if (r0 == 0) goto L_0x0310;
    L_0x030b:
        r14.a(r9);	 Catch:{ ActivityNotFoundException -> 0x04b9 }
        if (r5 == 0) goto L_0x033c;
    L_0x0310:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.gallerypicker.ImagePreview.class;
        r0.<init>(r14, r1);
        r1 = cb;
        r3 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r1 = r1[r3];
        r3 = r14.aI;
        r3 = r3.p;
        r0.putExtra(r1, r3);
        r1 = cb;
        r3 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r1 = r1[r3];
        r3 = 0;
        r0.putExtra(r1, r3);
        r1 = cb;
        r3 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r1 = r1[r3];
        r0.putExtra(r1, r9);
        r1 = 14;
        r14.startActivityForResult(r0, r1);
    L_0x033c:
        if (r5 == 0) goto L_0x039b;
    L_0x033e:
        r0 = 4;
        if (r2 != r0) goto L_0x0362;
    L_0x0341:
        if (r8 == 0) goto L_0x039b;
    L_0x0343:
        r0 = cb;
        r1 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r0 = r0[r1];
        r0 = r7.getStringExtra(r0);
        r0 = r14.f(r0);
        r1 = r14.ae;
        r2 = cb;
        r3 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r2 = r2[r3];
        r2 = r7.getStringExtra(r2);
        com.whatsapp.App.e(r1, r2, r0);
        if (r5 == 0) goto L_0x039b;
    L_0x0362:
        r0 = cb;
        r1 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r0 = r0[r1];
        r0 = r7.getStringExtra(r0);
        if (r0 == 0) goto L_0x039b;
    L_0x036e:
        r1 = r0.length();	 Catch:{ ActivityNotFoundException -> 0x04bb }
        if (r1 <= 0) goto L_0x039b;
    L_0x0374:
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x04bd }
        r2 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x04bd }
        r2 = 0;
        r1 = r7.getBooleanExtra(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x04bd }
        if (r1 != 0) goto L_0x0383;
    L_0x0381:
        if (r8 != 0) goto L_0x038e;
    L_0x0383:
        r1 = U;	 Catch:{ ActivityNotFoundException -> 0x04c1 }
        r2 = r14.aI;	 Catch:{ ActivityNotFoundException -> 0x04c1 }
        r2 = r2.p;	 Catch:{ ActivityNotFoundException -> 0x04c1 }
        r1.put(r2, r0);	 Catch:{ ActivityNotFoundException -> 0x04c1 }
        if (r5 == 0) goto L_0x039b;
    L_0x038e:
        r1 = r14.aI;	 Catch:{ ActivityNotFoundException -> 0x04c1 }
        r2 = com.whatsapp.util.ac.d(r0);	 Catch:{ ActivityNotFoundException -> 0x04c1 }
        r2 = com.whatsapp.ae2.a(r2);	 Catch:{ ActivityNotFoundException -> 0x04c1 }
        com.whatsapp.App.a(r1, r0, r2);	 Catch:{ ActivityNotFoundException -> 0x04c1 }
    L_0x039b:
        r0 = U;
        r1 = r14.aI;
        r1 = r1.p;
        r0 = r0.get(r1);
        r0 = (java.lang.String) r0;
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x03df;
    L_0x03ad:
        r1 = r14.Z;
        r2 = r14.getBaseContext();
        r2 = com.whatsapp.a28.b(r0, r2);
        r1.setText(r2);
        r1 = r14.Z;
        r1 = r1.getEditableText();
        r2 = r14.Z;
        r2 = r2.getPaint();
        com.whatsapp.a28.a(r1, r14, r2);
        r1 = com.whatsapp.util.ac.d(r0);
        r14.ay = r1;
        if (r1 == 0) goto L_0x03dd;
    L_0x03d1:
        r2 = android.os.SystemClock.elapsedRealtime();
        r4 = new com.whatsapp.ank;
        r4.<init>(r14, r2);
        com.whatsapp.ae2.a(r1, r4);
    L_0x03dd:
        if (r5 == 0) goto L_0x03e5;
    L_0x03df:
        r1 = r14.Z;	 Catch:{ ActivityNotFoundException -> 0x04c3 }
        r2 = 0;
        r1.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x04c3 }
    L_0x03e5:
        r0 = n(r0);	 Catch:{ ActivityNotFoundException -> 0x04c5 }
        if (r0 == 0) goto L_0x0400;
    L_0x03eb:
        r0 = r14.F;	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        r0 = r14.am;	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        r0 = r14.aZ;	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        if (r5 == 0) goto L_0x0414;
    L_0x0400:
        r0 = r14.F;	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        r0 = r14.am;	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        r0 = r14.aZ;	 Catch:{ ActivityNotFoundException -> 0x04c7 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x04c7 }
    L_0x0414:
        r14.r();	 Catch:{ ActivityNotFoundException -> 0x04c9 }
        r14.I();	 Catch:{ ActivityNotFoundException -> 0x04c9 }
        r0 = r14.Z;	 Catch:{ ActivityNotFoundException -> 0x04c9 }
        r0.requestFocus();	 Catch:{ ActivityNotFoundException -> 0x04c9 }
        r0 = com.whatsapp.Voip.d();	 Catch:{ ActivityNotFoundException -> 0x04c9 }
        if (r0 == 0) goto L_0x042a;
    L_0x0425:
        r14.j();	 Catch:{ ActivityNotFoundException -> 0x04cb }
        if (r5 == 0) goto L_0x0431;
    L_0x042a:
        r0 = r14.bn;	 Catch:{ ActivityNotFoundException -> 0x04cb }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x04cb }
    L_0x0431:
        r6.b();
        r0 = 1;
        goto L_0x0081;
    L_0x0437:
        r0 = move-exception;
        throw r0;
    L_0x0439:
        r0 = move-exception;
        throw r0;
    L_0x043b:
        r0 = move-exception;
        throw r0;
    L_0x043d:
        r0 = move-exception;
        throw r0;
    L_0x043f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0441 }
    L_0x0441:
        r0 = move-exception;
        throw r0;
    L_0x0443:
        r0 = move-exception;
        throw r0;
    L_0x0445:
        r1 = r2;
        goto L_0x02be;
    L_0x0448:
        r0 = move-exception;
        throw r0;
    L_0x044a:
        r3 = r4;
        goto L_0x02c8;
    L_0x044d:
        if (r8 == 0) goto L_0x02f6;
    L_0x044f:
        r1 = new com.whatsapp.a9b;	 Catch:{ ActivityNotFoundException -> 0x04ad }
        r1.<init>(r14);	 Catch:{ ActivityNotFoundException -> 0x04ad }
        com.whatsapp.util.ag.a(r0, r14, r1);	 Catch:{ ActivityNotFoundException -> 0x04ad }
        if (r5 == 0) goto L_0x02f6;
    L_0x0459:
        if (r8 == 0) goto L_0x02f6;
    L_0x045b:
        r1 = r14.ae;	 Catch:{ ActivityNotFoundException -> 0x04af }
        com.whatsapp.util.ag.a(r1, r0, r3, r14);	 Catch:{ ActivityNotFoundException -> 0x04af }
        if (r5 == 0) goto L_0x02f6;
    L_0x0462:
        r1 = cb;
        r3 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r1 = r1[r3];
        r1 = r0.getQueryParameter(r1);
        r3 = cb;
        r11 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r3 = r3[r11];
        r11 = 0;
        r3 = r7.getBooleanExtra(r3, r11);
        r11 = new com.whatsapp.mm;	 Catch:{ ActivityNotFoundException -> 0x04b1 }
        r11.<init>(r14, r3, r8, r1);	 Catch:{ ActivityNotFoundException -> 0x04b1 }
        com.whatsapp.util.ag.a(r0, r14, r11);	 Catch:{ ActivityNotFoundException -> 0x04b1 }
        if (r5 == 0) goto L_0x02f6;
    L_0x0481:
        r9.add(r0);	 Catch:{ ActivityNotFoundException -> 0x04b3 }
        if (r5 == 0) goto L_0x02f6;
    L_0x0486:
        if (r8 == 0) goto L_0x02f6;
    L_0x0488:
        r0 = cb;
        r1 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r0 = r0[r1];
        r0 = r7.getStringExtra(r0);
        r0 = r14.f(r0);
        r1 = r14.ae;	 Catch:{ ActivityNotFoundException -> 0x04b5 }
        r3 = cb;	 Catch:{ ActivityNotFoundException -> 0x04b5 }
        r11 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r3 = r3[r11];	 Catch:{ ActivityNotFoundException -> 0x04b5 }
        r3 = r7.getStringExtra(r3);	 Catch:{ ActivityNotFoundException -> 0x04b5 }
        com.whatsapp.App.e(r1, r3, r0);	 Catch:{ ActivityNotFoundException -> 0x04b5 }
        if (r5 == 0) goto L_0x02f6;
    L_0x04a7:
        goto L_0x02f3;
    L_0x04a9:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x04ab }
    L_0x04ab:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x04ad }
    L_0x04ad:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x04af }
    L_0x04af:
        r0 = move-exception;
        throw r0;
    L_0x04b1:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x04b3 }
    L_0x04b3:
        r0 = move-exception;
        throw r0;
    L_0x04b5:
        r0 = move-exception;
        throw r0;
    L_0x04b7:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x04b9 }
    L_0x04b9:
        r0 = move-exception;
        throw r0;
    L_0x04bb:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x04bd }
    L_0x04bd:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x04bf }
    L_0x04bf:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x04c1 }
    L_0x04c1:
        r0 = move-exception;
        throw r0;
    L_0x04c3:
        r0 = move-exception;
        throw r0;
    L_0x04c5:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x04c7 }
    L_0x04c7:
        r0 = move-exception;
        throw r0;
    L_0x04c9:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x04cb }
    L_0x04cb:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.W():boolean");
    }

    static boolean ax(Conversation conversation) {
        return conversation.J;
    }

    public ArrayList d() {
        return this.ac;
    }

    static boolean L(Conversation conversation) {
        return conversation.w();
    }

    static MenuItem ae(Conversation conversation) {
        return conversation.bg;
    }

    static void y(Conversation conversation) {
        conversation.R();
    }

    static void T(Conversation conversation) {
        conversation.O();
    }

    static ConversationContentLayout n(Conversation conversation) {
        return conversation.bw;
    }

    static String R(Conversation conversation) {
        return conversation.O;
    }

    static View D(Conversation conversation) {
        return conversation.bq;
    }

    private void Z() {
        aup.a(this, false, this.aI.p);
    }

    static int aa(Conversation conversation) {
        int i = conversation.W;
        conversation.W = i + 1;
        return i;
    }

    boolean a(int i, String str) {
        boolean z = DialogToastActivity.f;
        if (i == 2131755014) {
            if (str != null) {
                try {
                    this.N = str.substring(0, str.indexOf("@"));
                    j("+" + this.N);
                    this.bu = true;
                    if (!z) {
                        return true;
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
            Log.w(cb[168]);
            App.a((Context) this, 2131231272, 0);
            return true;
        } else if (i == 2131755015) {
            if (str != null) {
                try {
                    this.N = str.substring(0, str.indexOf("@"));
                    k("+" + this.N);
                    this.bu = true;
                    if (!z) {
                        return true;
                    }
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            }
            Log.w(cb[169]);
            App.a((Context) this, 2131231272, 0);
            return true;
        } else if (i == 2131755038) {
            if (str != null) {
                try {
                    startActivity(a(App.as.b(str)));
                    finish();
                    if (!z) {
                        return true;
                    }
                } catch (ActivityNotFoundException e22) {
                    throw e22;
                }
            }
            Log.e(cb[167]);
            return true;
        } else if (i != 2131755017) {
            return false;
        } else {
            if (str != null) {
                try {
                    App.a(App.as.b(str), (Activity) this, cd.CONVERSATION, false);
                    if (!z) {
                        return true;
                    }
                } catch (ActivityNotFoundException e222) {
                    throw e222;
                }
            }
            Log.e(cb[170]);
            return true;
        }
    }

    static boolean m(Conversation conversation, boolean z) {
        conversation.bv = z;
        return z;
    }

    private boolean w() {
        return this.aM.isShowing();
    }

    public void onBackPressed() {
        try {
            bh = true;
            if (isTaskRoot()) {
                startActivity(new Intent(this, Main.e()));
            }
            super.onBackPressed();
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void af(Conversation conversation) {
        conversation.k();
    }

    static boolean i(Conversation conversation, boolean z) {
        conversation.aU = z;
        return z;
    }

    static void V(Conversation conversation) {
        conversation.X();
    }

    static HashSet m(Conversation conversation) {
        return conversation.aL;
    }

    private static void v(Conversation conversation) {
        a4r com_whatsapp_a4r = (a4r) ak.get();
        try {
            if (a4r.a(com_whatsapp_a4r) == conversation) {
                ak.compareAndSet(com_whatsapp_a4r, new a4r(null, false));
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void v() {
        try {
            if (!a(37)) {
                return;
            }
            if (App.a(this.P)) {
                ag.a(5, (Activity) this);
                bh = false;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    private boolean m() {
        return getSharedPreferences(cb[135], 0).getBoolean(cb[136], false);
    }

    boolean g() {
        try {
            if (this.v != null) {
                return false;
            }
            try {
                if (this.aj != null) {
                    this.aj.finish();
                }
                Log.i(cb[158]);
                this.bc.setTranscriptMode(0);
                this.bd.notifyDataSetChanged();
                this.v = startSupportActionMode(new adb(this, this));
                return true;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static View ac(Conversation conversation) {
        return conversation.bj;
    }

    static void a(Conversation conversation, co coVar) {
        conversation.f(coVar);
    }

    protected void onStop() {
        try {
            super.onStop();
            if (this.a4 != null) {
                this.a4.b(false);
            }
            try {
                if (bh) {
                    u(this);
                }
                try {
                    Log.i(cb[86] + SQLiteDatabase.releaseMemory() + cb[85] + this.ae);
                    if (this.bd.getCursor() != null) {
                        this.bd.getCursor().deactivate();
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    private void I() {
        this.I.hideSoftInputFromWindow(this.Z.getWindowToken(), 0);
    }

    static Handler x(Conversation conversation) {
        return conversation.a5;
    }

    private static boolean n(@Nullable String str) {
        if (str != null) {
            try {
                if (TextUtils.getTrimmedLength(str) != 0) {
                    return false;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        return true;
    }

    static String h(Conversation conversation, String str) {
        conversation.D = str;
        return str;
    }

    static void C(Conversation conversation) {
        conversation.s();
    }

    private ProgressBar L() {
        try {
            if (this.bt == null) {
                this.bt = (ProgressBar) this.ba.inflate();
            }
            return this.bt;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j(java.lang.String r4) {
        /*
        r3 = this;
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x001f, SecurityException -> 0x002f }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x001f, SecurityException -> 0x002f }
        r2 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x001f, SecurityException -> 0x002f }
        r2 = android.provider.ContactsContract.Contacts.CONTENT_URI;	 Catch:{ ActivityNotFoundException -> 0x001f, SecurityException -> 0x002f }
        r0.<init>(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x001f, SecurityException -> 0x002f }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x001f, SecurityException -> 0x002f }
        r2 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x001f, SecurityException -> 0x002f }
        r0.putExtra(r1, r4);	 Catch:{ ActivityNotFoundException -> 0x001f, SecurityException -> 0x002f }
        r1 = 11;
        r3.startActivityForResult(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x001f, SecurityException -> 0x002f }
        r0 = 0;
        bh = r0;	 Catch:{ ActivityNotFoundException -> 0x001f, SecurityException -> 0x002f }
    L_0x001e:
        return;
    L_0x001f:
        r0 = move-exception;
    L_0x0020:
        r1 = cb;
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r1 = r1[r2];
        com.whatsapp.util.Log.c(r1, r0);
        r0 = 12;
        r3.showDialog(r0);
        goto L_0x001e;
    L_0x002f:
        r0 = move-exception;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.j(java.lang.String):void");
    }

    public void a(co coVar) {
    }

    static boolean g(Conversation conversation) {
        return conversation.ar;
    }

    public void c(String str) {
        try {
            if (str.equals(this.ae)) {
                D();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static ArrayList al(Conversation conversation) {
        return conversation.aG;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void K() {
        /*
        r1 = 0;
        r0 = ak;
        r0 = r0.get();
        r0 = (com.whatsapp.a4r) r0;
        r2 = r0.a();
        if (r2 == 0) goto L_0x0033;
    L_0x000f:
        r0 = r0.b();
    L_0x0013:
        if (r0 == 0) goto L_0x0032;
    L_0x0015:
        r1 = com.whatsapp.App.aK;
        r2 = r0.ae;
        r3 = 0;
        r3 = r0.a(r3);
        r4 = r0.aD;
        r1 = r1.a(r2, r3, r4);
        r2 = r0.bd;
        r2.changeCursor(r1);
        r0 = r0.bd;
        r0 = r0.getCursor();
        r0.requery();
    L_0x0032:
        return;
    L_0x0033:
        r0 = com.whatsapp.a4r.a(r0);
        if (r0 == 0) goto L_0x003f;
    L_0x0039:
        r2 = r0.isFinishing();	 Catch:{ ActivityNotFoundException -> 0x0041 }
        if (r2 == 0) goto L_0x0013;
    L_0x003f:
        r0 = r1;
        goto L_0x0013;
    L_0x0041:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.K():void");
    }

    static void Y(Conversation conversation) {
        conversation.x();
    }

    static hp a(Conversation conversation, hp hpVar) {
        conversation.as = hpVar;
        return hpVar;
    }

    private void aa() {
        try {
            if (!RequestPermissionActivity.a((Activity) this, 32)) {
                return;
            }
            if (App.a(this.P)) {
                ag.a(4, (Activity) this);
                bh = false;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static void b(Conversation conversation, String str) {
        conversation.j(str);
    }

    private SubMenu b(Menu menu, int i, int i2) {
        SubMenu addSubMenu = menu.addSubMenu(0, i, 0, i2);
        addSubMenu.clearHeader();
        return addSubMenu;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void n() {
        /*
        r9 = this;
        r8 = 2131755499; // 0x7f1001eb float:1.914188E38 double:1.0532271574E-314;
        r1 = 1;
        r7 = 8;
        r2 = 0;
        r6 = 2131755310; // 0x7f10012e float:1.9141496E38 double:1.053227064E-314;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.aI;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0071;
    L_0x0014:
        r0 = com.whatsapp.App.as;
        r4 = r9.aI;
        r4 = r4.a();
        r0 = r0.b(r4);
        r4 = com.whatsapp.App.as;	 Catch:{ ActivityNotFoundException -> 0x0175 }
        r5 = r0.p;	 Catch:{ ActivityNotFoundException -> 0x0175 }
        r4 = r4.d(r5);	 Catch:{ ActivityNotFoundException -> 0x0175 }
        if (r4 != 0) goto L_0x005c;
    L_0x002a:
        r0 = r0.l;	 Catch:{ ActivityNotFoundException -> 0x0177 }
        if (r0 != 0) goto L_0x005c;
    L_0x002e:
        r0 = r9.aI;	 Catch:{ ActivityNotFoundException -> 0x0179 }
        r0 = r0.p;	 Catch:{ ActivityNotFoundException -> 0x0179 }
        r0 = com.whatsapp.qm.f(r0);	 Catch:{ ActivityNotFoundException -> 0x0179 }
        if (r0 != 0) goto L_0x005c;
    L_0x0038:
        r0 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x0179 }
        r4 = r9.aI;	 Catch:{ ActivityNotFoundException -> 0x0179 }
        r4 = r4.p;	 Catch:{ ActivityNotFoundException -> 0x0179 }
        r0 = r0.k(r4);	 Catch:{ ActivityNotFoundException -> 0x0179 }
        r4 = -1;
        if (r0 != r4) goto L_0x005c;
    L_0x0045:
        r9.H();
        r0 = r9.aP;
        r0 = r0.findViewById(r8);
        r0.setVisibility(r7);
        r0 = r9.aP;
        r0 = r0.findViewById(r6);
        r0.setVisibility(r2);
        if (r3 == 0) goto L_0x01a4;
    L_0x005c:
        r0 = r9.aP;	 Catch:{ ActivityNotFoundException -> 0x017b }
        if (r0 == 0) goto L_0x01a1;
    L_0x0060:
        r0 = r9.aP;	 Catch:{ ActivityNotFoundException -> 0x017b }
        r4 = 2131755310; // 0x7f10012e float:1.9141496E38 double:1.053227064E-314;
        r0 = r0.findViewById(r4);	 Catch:{ ActivityNotFoundException -> 0x017b }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ ActivityNotFoundException -> 0x017b }
        r0 = r2;
    L_0x006f:
        if (r3 == 0) goto L_0x019f;
    L_0x0071:
        r0 = r9.aI;	 Catch:{ ActivityNotFoundException -> 0x017d }
        r0 = r0.m();	 Catch:{ ActivityNotFoundException -> 0x017d }
        if (r0 != 0) goto L_0x0101;
    L_0x0079:
        r0 = r9.aI;	 Catch:{ ActivityNotFoundException -> 0x017f }
        r0 = r0.l;	 Catch:{ ActivityNotFoundException -> 0x017f }
        if (r0 != 0) goto L_0x0101;
    L_0x007f:
        r0 = r9.aI;	 Catch:{ ActivityNotFoundException -> 0x0181 }
        r0 = r0.p;	 Catch:{ ActivityNotFoundException -> 0x0181 }
        r0 = com.whatsapp.aup.a(r0);	 Catch:{ ActivityNotFoundException -> 0x0181 }
        if (r0 == 0) goto L_0x0183;
    L_0x0089:
        r0 = 2131232177; // 0x7f0805b1 float:1.8080456E38 double:1.052968602E-314;
    L_0x008c:
        r4 = r9.getString(r0);
        r0 = r9.by;
        if (r0 == 0) goto L_0x009f;
    L_0x0094:
        r0 = r9.by;
        r0 = r0.findViewById(r8);
        r0 = (android.widget.Button) r0;
        r0.setText(r4);
    L_0x009f:
        r0 = com.whatsapp.App.aK;
        r5 = r9.aI;
        r5 = r5.p;
        r0 = r0.k(r5);
        r5 = -1;
        if (r0 != r5) goto L_0x00cc;
    L_0x00ac:
        r0 = r9.by;	 Catch:{ ActivityNotFoundException -> 0x0188 }
        if (r0 == 0) goto L_0x00be;
    L_0x00b0:
        r0 = r9.by;	 Catch:{ ActivityNotFoundException -> 0x0188 }
        r5 = 2131755310; // 0x7f10012e float:1.9141496E38 double:1.053227064E-314;
        r0 = r0.findViewById(r5);	 Catch:{ ActivityNotFoundException -> 0x0188 }
        r5 = 8;
        r0.setVisibility(r5);	 Catch:{ ActivityNotFoundException -> 0x0188 }
    L_0x00be:
        r9.H();
        r0 = r9.aP;
        r0 = r0.findViewById(r6);
        r0.setVisibility(r2);
        if (r3 == 0) goto L_0x00f0;
    L_0x00cc:
        r0 = r9.by;	 Catch:{ ActivityNotFoundException -> 0x018a }
        if (r0 == 0) goto L_0x00dd;
    L_0x00d0:
        r0 = r9.by;	 Catch:{ ActivityNotFoundException -> 0x018a }
        r1 = 2131755310; // 0x7f10012e float:1.9141496E38 double:1.053227064E-314;
        r0 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x018a }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x018a }
    L_0x00dd:
        r0 = r9.aP;	 Catch:{ ActivityNotFoundException -> 0x018c }
        if (r0 == 0) goto L_0x019c;
    L_0x00e1:
        r0 = r9.aP;	 Catch:{ ActivityNotFoundException -> 0x018c }
        r1 = 2131755310; // 0x7f10012e float:1.9141496E38 double:1.053227064E-314;
        r0 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x018c }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x018c }
        r1 = r2;
    L_0x00f0:
        r0 = r9.aP;
        if (r0 == 0) goto L_0x00ff;
    L_0x00f4:
        r0 = r9.aP;
        r0 = r0.findViewById(r8);
        r0 = (android.widget.Button) r0;
        r0.setText(r4);
    L_0x00ff:
        if (r3 == 0) goto L_0x019a;
    L_0x0101:
        r0 = r9.by;	 Catch:{ ActivityNotFoundException -> 0x018e }
        if (r0 == 0) goto L_0x0113;
    L_0x0105:
        r0 = r9.by;	 Catch:{ ActivityNotFoundException -> 0x018e }
        r1 = 2131755310; // 0x7f10012e float:1.9141496E38 double:1.053227064E-314;
        r0 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x018e }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x018e }
    L_0x0113:
        r0 = r9.aP;	 Catch:{ ActivityNotFoundException -> 0x0190 }
        if (r0 == 0) goto L_0x0125;
    L_0x0117:
        r0 = r9.aP;	 Catch:{ ActivityNotFoundException -> 0x0190 }
        r1 = 2131755310; // 0x7f10012e float:1.9141496E38 double:1.053227064E-314;
        r0 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x0190 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x0190 }
    L_0x0125:
        r0 = r9.a1;	 Catch:{ ActivityNotFoundException -> 0x0192 }
        if (r2 == r0) goto L_0x0174;
    L_0x0129:
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0194 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x0194 }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x0194 }
        r4 = 9;
        r1 = r1[r4];	 Catch:{ ActivityNotFoundException -> 0x0194 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0194 }
        r0 = r0.append(r2);	 Catch:{ ActivityNotFoundException -> 0x0194 }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x0194 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x0194 }
        r9.a1 = r2;	 Catch:{ ActivityNotFoundException -> 0x0194 }
        r0 = r9.a1;	 Catch:{ ActivityNotFoundException -> 0x0194 }
        if (r0 == 0) goto L_0x014f;
    L_0x0149:
        r0 = 0;
        r9.a(r0);	 Catch:{ ActivityNotFoundException -> 0x0196 }
        if (r3 == 0) goto L_0x0174;
    L_0x014f:
        r0 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x0196 }
        r1 = r9.aI;	 Catch:{ ActivityNotFoundException -> 0x0196 }
        r1 = r1.p;	 Catch:{ ActivityNotFoundException -> 0x0196 }
        r2 = 1;
        r4 = 1;
        r0.a(r1, r2, r4);	 Catch:{ ActivityNotFoundException -> 0x0196 }
        r0 = r9.aq;	 Catch:{ ActivityNotFoundException -> 0x0196 }
        if (r0 == 0) goto L_0x0164;
    L_0x015e:
        r0 = com.whatsapp.wallpaper.k.g(r9);
        if (r3 == 0) goto L_0x016c;
    L_0x0164:
        r0 = r9.aI;
        r0 = r0.p;
        r0 = com.whatsapp.wallpaper.k.a(r9, r0);
    L_0x016c:
        if (r0 == 0) goto L_0x0171;
    L_0x016e:
        r9.a(r0);	 Catch:{ ActivityNotFoundException -> 0x0198 }
    L_0x0171:
        r9.T();
    L_0x0174:
        return;
    L_0x0175:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0177 }
    L_0x0177:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0179 }
    L_0x0179:
        r0 = move-exception;
        throw r0;
    L_0x017b:
        r0 = move-exception;
        throw r0;
    L_0x017d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x017f }
    L_0x017f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0181 }
    L_0x0181:
        r0 = move-exception;
        throw r0;
    L_0x0183:
        r0 = 2131230839; // 0x7f080077 float:1.8077742E38 double:1.052967941E-314;
        goto L_0x008c;
    L_0x0188:
        r0 = move-exception;
        throw r0;
    L_0x018a:
        r0 = move-exception;
        throw r0;
    L_0x018c:
        r0 = move-exception;
        throw r0;
    L_0x018e:
        r0 = move-exception;
        throw r0;
    L_0x0190:
        r0 = move-exception;
        throw r0;
    L_0x0192:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0194 }
    L_0x0194:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0196 }
    L_0x0196:
        r0 = move-exception;
        throw r0;
    L_0x0198:
        r0 = move-exception;
        throw r0;
    L_0x019a:
        r2 = r1;
        goto L_0x0125;
    L_0x019c:
        r1 = r2;
        goto L_0x00f0;
    L_0x019f:
        r2 = r0;
        goto L_0x0125;
    L_0x01a1:
        r0 = r2;
        goto L_0x006f;
    L_0x01a4:
        r0 = r1;
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.n():void");
    }

    private void z() {
        try {
            if (RequestPermissionActivity.a((Activity) this, 30)) {
                try {
                    if (App.a(this.P)) {
                        try {
                            if (App.T() < ((long) ((a59.e * 1024) * 1024))) {
                                a(2131231112);
                                return;
                            }
                            try {
                                if (aup.a(this.ae)) {
                                    showDialog(arj.Theme_ratingBarStyle);
                                    return;
                                }
                                Intent intent = new Intent(this, CameraActivity.class);
                                intent.putExtra(cb[151], this.ae);
                                startActivity(intent);
                            } catch (ActivityNotFoundException e) {
                                throw e;
                            }
                        } catch (ActivityNotFoundException e2) {
                            throw e2;
                        }
                    }
                } catch (ActivityNotFoundException e22) {
                    throw e22;
                }
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    public static a4r F() {
        return (a4r) ak.get();
    }

    static int h(Conversation conversation, boolean z) {
        return conversation.a(z);
    }

    static Runnable h(Conversation conversation) {
        return conversation.a6;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void y() {
        /*
        r3 = this;
        r0 = r3.au;	 Catch:{ ActivityNotFoundException -> 0x0005 }
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        return;
    L_0x0005:
        r0 = move-exception;
        throw r0;
    L_0x0007:
        r0 = com.whatsapp.a59.d();
        r1 = new com.whatsapp.a_p;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1.<init>(r3, r0);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r3.au = r1;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1 = r3.au;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1 = r1.getContentView();	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r2 = 2131755312; // 0x7f100130 float:1.91415E38 double:1.053227065E-314;
        r1 = r1.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r2 = new com.whatsapp.a26;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r2.<init>(r3);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1.setOnClickListener(r2);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1 = r3.au;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1 = r1.getContentView();	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r2 = 2131755312; // 0x7f100130 float:1.91415E38 double:1.053227065E-314;
        r1 = r1.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r2 = new com.whatsapp.rz;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r2.<init>(r3);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1.setOnLongClickListener(r2);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1 = r3.au;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1 = r1.getContentView();	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r2 = 2131755314; // 0x7f100132 float:1.9141504E38 double:1.053227066E-314;
        r1 = r1.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r2 = new com.whatsapp.ko;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r2.<init>(r3, r0);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1.setOnClickListener(r2);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        if (r0 == 0) goto L_0x006c;
    L_0x0053:
        r0 = r3.au;	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r0 = r0.getContentView();	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r1 = 2131755324; // 0x7f10013c float:1.9141524E38 double:1.053227071E-314;
        r0 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r1 = new com.whatsapp.b8;	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r1.<init>(r3);	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        if (r0 == 0) goto L_0x0081;
    L_0x006c:
        r0 = r3.au;	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r0 = r0.getContentView();	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r1 = 2131755316; // 0x7f100134 float:1.9141508E38 double:1.053227067E-314;
        r0 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r1 = new com.whatsapp.a5t;	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r1.<init>(r3);	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x00c4 }
    L_0x0081:
        r0 = r3.au;
        r0 = r0.getContentView();
        r1 = 2131755318; // 0x7f100136 float:1.9141512E38 double:1.053227068E-314;
        r0 = r0.findViewById(r1);
        r1 = new com.whatsapp.ark;
        r1.<init>(r3);
        r0.setOnClickListener(r1);
        r0 = r3.au;
        r0 = r0.getContentView();
        r1 = 2131755320; // 0x7f100138 float:1.9141516E38 double:1.053227069E-314;
        r0 = r0.findViewById(r1);
        r1 = new com.whatsapp.tr;
        r1.<init>(r3);
        r0.setOnClickListener(r1);
        r0 = r3.au;
        r0 = r0.getContentView();
        r1 = 2131755322; // 0x7f10013a float:1.914152E38 double:1.05322707E-314;
        r0 = r0.findViewById(r1);
        r1 = new com.whatsapp.ade;
        r1.<init>(r3);
        r0.setOnClickListener(r1);
        goto L_0x0004;
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.y():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r() {
        /*
        r5 = this;
        r4 = 0;
        r3 = 1;
        r0 = r5.getSupportActionBar();
        r0 = r0.getThemedContext();
        r0 = android.view.LayoutInflater.from(r0);
        r1 = 2130903112; // 0x7f030048 float:1.7413033E38 double:1.0528060223E-314;
        r2 = 0;
        r0 = com.whatsapp.aam.a(r0, r1, r4, r2);
        r0 = (android.view.ViewGroup) r0;
        r1 = 2131755494; // 0x7f1001e6 float:1.9141869E38 double:1.053227155E-314;
        r1 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = (android.view.ViewGroup) r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r5.C = r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = r5.C;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = r1.getViewTreeObserver();	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r2 = new com.whatsapp.sp;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r2.<init>(r5);	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1.addOnGlobalLayoutListener(r2);	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = r5.C;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r2 = 2131755428; // 0x7f1001a4 float:1.9141735E38 double:1.0532271223E-314;
        r1 = r1.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = (com.whatsapp.TextEmojiLabel) r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r5.bb = r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = r5.C;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r2 = 2131755495; // 0x7f1001e7 float:1.914187E38 double:1.0532271554E-314;
        r1 = r1.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r5.bp = r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = r5.C;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r2 = 2131755429; // 0x7f1001a5 float:1.9141737E38 double:1.053227123E-314;
        r1 = r1.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = (android.widget.TextView) r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r5.ax = r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = r5.C;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r2 = 2131755496; // 0x7f1001e8 float:1.9141873E38 double:1.053227156E-314;
        r1 = r1.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = (android.widget.TextView) r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r5.a3 = r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = 2131755491; // 0x7f1001e3 float:1.9141863E38 double:1.0532271534E-314;
        r1 = r0.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = (android.widget.ImageView) r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r5.ai = r1;	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        r1 = com.whatsapp.App.a1();	 Catch:{ ActivityNotFoundException -> 0x00d7 }
        if (r1 != 0) goto L_0x0086;
    L_0x0074:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x00d9 }
        r2 = 11;
        if (r1 < r2) goto L_0x0086;
    L_0x007a:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x00db }
        r2 = 19;
        if (r1 >= r2) goto L_0x0086;
    L_0x0080:
        r1 = r5.C;	 Catch:{ ActivityNotFoundException -> 0x00db }
        r2 = 0;
        r1.setLayoutTransition(r2);	 Catch:{ ActivityNotFoundException -> 0x00db }
    L_0x0086:
        r1 = r5.C;	 Catch:{ ActivityNotFoundException -> 0x00dd }
        r2 = 1;
        r1.setClickable(r2);	 Catch:{ ActivityNotFoundException -> 0x00dd }
        r1 = r5.ar;	 Catch:{ ActivityNotFoundException -> 0x00dd }
        if (r1 != 0) goto L_0x0094;
    L_0x0090:
        r1 = r5.bx;	 Catch:{ ActivityNotFoundException -> 0x00df }
        if (r1 == 0) goto L_0x00a4;
    L_0x0094:
        r2 = r5.ax;	 Catch:{ ActivityNotFoundException -> 0x00e1 }
        r1 = r5.ar;	 Catch:{ ActivityNotFoundException -> 0x00e1 }
        if (r1 == 0) goto L_0x00e3;
    L_0x009a:
        r1 = 2131232132; // 0x7f080584 float:1.8080365E38 double:1.0529685797E-314;
    L_0x009d:
        r1 = r5.getString(r1);
        r2.setText(r1);
    L_0x00a4:
        r1 = 2131755489; // 0x7f1001e1 float:1.9141859E38 double:1.0532271524E-314;
        r1 = r0.findViewById(r1);
        r2 = new com.whatsapp.nx;
        r2.<init>(r5);
        r1.setOnClickListener(r2);
        r1 = 2131755493; // 0x7f1001e5 float:1.9141867E38 double:1.0532271544E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.view.ViewStub) r1;
        r5.ba = r1;
        r1 = r5.C;
        r2 = new com.whatsapp.ak5;
        r2.<init>(r5);
        r1.setOnClickListener(r2);
        r1 = r5.getSupportActionBar();
        r1.setDisplayShowCustomEnabled(r3);
        r1 = r5.getSupportActionBar();
        r1.setCustomView(r0);
        return;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00d9 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00db }
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00e1 }
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r1 = 2131232133; // 0x7f080585 float:1.8080367E38 double:1.05296858E-314;
        goto L_0x009d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.r():void");
    }

    private boolean a(int i) {
        try {
            if (App.aO()) {
                return true;
            }
            RequestPermissionActivity.a((Activity) this, 2131231672, 2131231671, i);
            return false;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void u() {
        try {
            if (this.aM.isShowing()) {
                this.aM.dismiss();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void b(co coVar) {
        this.bn.setVisibility(8);
    }

    public static void B() {
        o(null);
    }

    static void G(Conversation conversation) {
        conversation.q();
    }

    static pi r(Conversation conversation) {
        return conversation.a0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
        r10 = this;
        r8 = com.whatsapp.DialogToastActivity.f;
        if (r12 != 0) goto L_0x0072;
    L_0x0004:
        if (r13 == 0) goto L_0x0072;
    L_0x0006:
        r0 = cb;	 Catch:{ IOException -> 0x007d }
        r1 = 67;
        r0 = r0[r1];	 Catch:{ IOException -> 0x007d }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x007d }
        if (r0 == 0) goto L_0x002a;
    L_0x0013:
        r0 = cb;	 Catch:{ IOException -> 0x007f }
        r1 = 46;
        r0 = r0[r1];	 Catch:{ IOException -> 0x007f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x007f }
        r0 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x007f }
        r1 = 2131231116; // 0x7f08018c float:1.8078304E38 double:1.052968078E-314;
        r0 = r0.getString(r1);	 Catch:{ IOException -> 0x007f }
        com.whatsapp.App.a(r10, r0);	 Catch:{ IOException -> 0x007f }
    L_0x002a:
        r0 = cb;	 Catch:{ IOException -> 0x0081 }
        r1 = 68;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0081 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x0081 }
        if (r0 == 0) goto L_0x004e;
    L_0x0037:
        r0 = cb;	 Catch:{ IOException -> 0x0081 }
        r1 = 61;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0081 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0081 }
        r0 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0081 }
        r1 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r0 = r0.getString(r1);	 Catch:{ IOException -> 0x0081 }
        com.whatsapp.App.a(r10, r0);	 Catch:{ IOException -> 0x0081 }
    L_0x004e:
        r0 = cb;	 Catch:{ IOException -> 0x0083 }
        r1 = 44;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0083 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x0083 }
        if (r0 == 0) goto L_0x0072;
    L_0x005b:
        r0 = cb;	 Catch:{ IOException -> 0x0083 }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0083 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0083 }
        r0 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0083 }
        r1 = 2131231107; // 0x7f080183 float:1.8078286E38 double:1.0529680733E-314;
        r0 = r0.getString(r1);	 Catch:{ IOException -> 0x0083 }
        com.whatsapp.App.a(r10, r0);	 Catch:{ IOException -> 0x0083 }
    L_0x0072:
        r0 = -1;
        if (r12 == r0) goto L_0x0087;
    L_0x0075:
        r0 = 14;
        if (r11 != r0) goto L_0x0087;
    L_0x0079:
        r10.finish();	 Catch:{ IOException -> 0x0085 }
    L_0x007c:
        return;
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r0 = move-exception;
        throw r0;
    L_0x0087:
        switch(r11) {
            case 2: goto L_0x008e;
            case 4: goto L_0x0387;
            case 5: goto L_0x0283;
            case 6: goto L_0x034a;
            case 7: goto L_0x0404;
            case 8: goto L_0x03fc;
            case 11: goto L_0x0100;
            case 13: goto L_0x0155;
            case 14: goto L_0x01af;
            case 17: goto L_0x0680;
            case 18: goto L_0x0646;
            case 19: goto L_0x08b0;
            case 20: goto L_0x08e0;
            case 21: goto L_0x01af;
            case 22: goto L_0x01af;
            case 23: goto L_0x0195;
            case 24: goto L_0x02ba;
            case 30: goto L_0x0902;
            case 31: goto L_0x090a;
            case 32: goto L_0x0912;
            case 34: goto L_0x0922;
            case 35: goto L_0x0927;
            case 36: goto L_0x092f;
            case 37: goto L_0x0937;
            case 38: goto L_0x093f;
            case 150: goto L_0x091a;
            default: goto L_0x008a;
        };
    L_0x008a:
        r0 = 1;
        bh = r0;
        goto L_0x007c;
    L_0x008e:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x0091:
        r0 = r10.u;	 Catch:{ IOException -> 0x0420 }
        if (r0 == 0) goto L_0x00eb;
    L_0x0095:
        r0 = cb;
        r1 = 64;
        r0 = r0[r1];
        r0 = r13.getStringExtra(r0);
        r1 = com.whatsapp.App.as;
        r1 = r1.b(r0);
        if (r1 == 0) goto L_0x00d9;
    L_0x00a7:
        r0 = r10.u;
        r0 = r0.values();
        r0 = com.whatsapp.qa.a(r0);
        r2 = r0.iterator();
    L_0x00b5:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00c6;
    L_0x00bb:
        r0 = r2.next();
        r0 = (com.whatsapp.protocol.co) r0;
        com.whatsapp.App.a(r0, r1);
        if (r8 == 0) goto L_0x00b5;
    L_0x00c6:
        r0 = r10.ae;	 Catch:{ IOException -> 0x0422 }
        r2 = r1.p;	 Catch:{ IOException -> 0x0422 }
        r0 = r0.equals(r2);	 Catch:{ IOException -> 0x0422 }
        if (r0 != 0) goto L_0x00e9;
    L_0x00d0:
        r0 = a(r1);	 Catch:{ IOException -> 0x0422 }
        r10.startActivity(r0);	 Catch:{ IOException -> 0x0422 }
        if (r8 == 0) goto L_0x00e9;
    L_0x00d9:
        r0 = cb;	 Catch:{ IOException -> 0x0424 }
        r1 = 75;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0424 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0424 }
        r0 = 2131231380; // 0x7f080294 float:1.807884E38 double:1.052968208E-314;
        r1 = 0;
        com.whatsapp.App.a(r10, r0, r1);	 Catch:{ IOException -> 0x0424 }
    L_0x00e9:
        if (r8 == 0) goto L_0x00fb;
    L_0x00eb:
        r0 = cb;	 Catch:{ IOException -> 0x0426 }
        r1 = 81;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0426 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0426 }
        r0 = 2131231451; // 0x7f0802db float:1.8078983E38 double:1.0529682433E-314;
        r1 = 0;
        com.whatsapp.App.a(r10, r0, r1);	 Catch:{ IOException -> 0x0426 }
    L_0x00fb:
        r10.b();	 Catch:{ IOException -> 0x0428 }
        if (r8 == 0) goto L_0x008a;
    L_0x0100:
        r0 = -1;
        if (r12 != r0) goto L_0x014a;
    L_0x0103:
        r0 = r10.bu;	 Catch:{ IOException -> 0x042a }
        if (r0 == 0) goto L_0x012c;
    L_0x0107:
        r0 = new com.whatsapp.l5;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r10.N;
        r1 = r1.append(r2);
        r2 = cb;
        r3 = 55;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r1 = com.whatsapp.App.as;	 Catch:{ IOException -> 0x042c }
        r1.n(r0);	 Catch:{ IOException -> 0x042c }
        if (r8 == 0) goto L_0x008a;
    L_0x012c:
        if (r13 == 0) goto L_0x0141;
    L_0x012e:
        r0 = r13.getData();	 Catch:{ IOException -> 0x042e }
        if (r0 == 0) goto L_0x0141;
    L_0x0134:
        r0 = com.whatsapp.App.as;	 Catch:{ IOException -> 0x0430 }
        r1 = r13.getData();	 Catch:{ IOException -> 0x0430 }
        r2 = r10.aI;	 Catch:{ IOException -> 0x0430 }
        r0.a(r1, r2);	 Catch:{ IOException -> 0x0430 }
        if (r8 == 0) goto L_0x008a;
    L_0x0141:
        r0 = com.whatsapp.App.as;	 Catch:{ IOException -> 0x0432 }
        r1 = r10.aI;	 Catch:{ IOException -> 0x0432 }
        r0.n(r1);	 Catch:{ IOException -> 0x0432 }
        if (r8 == 0) goto L_0x008a;
    L_0x014a:
        r0 = cb;	 Catch:{ IOException -> 0x0434 }
        r1 = 14;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0434 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0434 }
        if (r8 == 0) goto L_0x008a;
    L_0x0155:
        r0 = -1;
        if (r12 != r0) goto L_0x018a;
    L_0x0158:
        r0 = r10.bu;	 Catch:{ IOException -> 0x0438 }
        if (r0 == 0) goto L_0x0181;
    L_0x015c:
        r0 = new com.whatsapp.l5;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r10.N;
        r1 = r1.append(r2);
        r2 = cb;
        r3 = 72;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r1 = com.whatsapp.App.as;	 Catch:{ IOException -> 0x043a }
        r1.n(r0);	 Catch:{ IOException -> 0x043a }
        if (r8 == 0) goto L_0x008a;
    L_0x0181:
        r0 = com.whatsapp.App.as;	 Catch:{ IOException -> 0x043a }
        r1 = r10.aI;	 Catch:{ IOException -> 0x043a }
        r0.n(r1);	 Catch:{ IOException -> 0x043a }
        if (r8 == 0) goto L_0x008a;
    L_0x018a:
        r0 = cb;	 Catch:{ IOException -> 0x043c }
        r1 = 77;
        r0 = r0[r1];	 Catch:{ IOException -> 0x043c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x043c }
        if (r8 == 0) goto L_0x008a;
    L_0x0195:
        r0 = -1;
        if (r12 != r0) goto L_0x01a8;
    L_0x0198:
        r0 = com.whatsapp.util.ag.c(r10);
        r0 = android.net.Uri.fromFile(r0);
        com.whatsapp.util.ag.a(r10, r0);	 Catch:{ IOException -> 0x0440 }
        r10.a(r0);	 Catch:{ IOException -> 0x0440 }
        if (r8 == 0) goto L_0x008a;
    L_0x01a8:
        if (r12 != 0) goto L_0x008a;
    L_0x01aa:
        com.whatsapp.util.ag.a(r10);	 Catch:{ IOException -> 0x0442 }
        if (r8 == 0) goto L_0x008a;
    L_0x01af:
        if (r13 == 0) goto L_0x008a;
    L_0x01b1:
        r0 = cb;
        r1 = 59;
        r0 = r0[r1];
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);
        if (r0 == 0) goto L_0x0461;
    L_0x01be:
        r0 = -1;
        if (r12 != r0) goto L_0x025f;
    L_0x01c1:
        r0 = r13.getData();
        if (r0 == 0) goto L_0x0207;
    L_0x01c7:
        r1 = r0.toString();	 Catch:{ IOException -> 0x0446 }
        r2 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;	 Catch:{ IOException -> 0x0446 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0446 }
        r1 = r1.startsWith(r2);	 Catch:{ IOException -> 0x0446 }
        if (r1 != 0) goto L_0x01e7;
    L_0x01d7:
        r1 = r0.toString();	 Catch:{ IOException -> 0x0448 }
        r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;	 Catch:{ IOException -> 0x0448 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0448 }
        r1 = r1.startsWith(r2);	 Catch:{ IOException -> 0x0448 }
        if (r1 == 0) goto L_0x01fd;
    L_0x01e7:
        r1 = cb;	 Catch:{ IOException -> 0x044a }
        r2 = 30;
        r1 = r1[r2];	 Catch:{ IOException -> 0x044a }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x044a }
        r1 = r10.getBaseContext();	 Catch:{ IOException -> 0x044a }
        r2 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ IOException -> 0x044a }
        if (r8 == 0) goto L_0x025d;
    L_0x01fd:
        r1 = new com.whatsapp.asr;	 Catch:{ IOException -> 0x044c }
        r1.<init>(r10);	 Catch:{ IOException -> 0x044c }
        com.whatsapp.util.ag.a(r0, r10, r1);	 Catch:{ IOException -> 0x044c }
        if (r8 == 0) goto L_0x025d;
    L_0x0207:
        r2 = new com.whatsapp.MediaData;
        r2.<init>();
        r0 = new java.io.File;
        r1 = cb;
        r3 = 69;
        r1 = r1[r3];
        r1 = r13.getStringExtra(r1);
        r0.<init>(r1);
        r2.file = r0;
        r0 = cb;
        r1 = 56;
        r0 = r0[r1];
        r4 = 0;
        r0 = r13.getLongExtra(r0, r4);
        r2.trimFrom = r0;
        r0 = cb;
        r1 = 15;
        r0 = r0[r1];
        r4 = 0;
        r0 = r13.getLongExtra(r0, r4);
        r2.trimTo = r0;
        r0 = r10.ae;
        r1 = r2.file;
        r1 = r1.getAbsolutePath();
        r4 = r2.trimFrom;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r1 = com.whatsapp.util.ag.a(r1, r4);
        r3 = 3;
        r4 = 0;
        r5 = cb;
        r6 = 41;
        r5 = r5[r6];
        r5 = r13.getStringExtra(r5);
        r6 = 0;
        com.whatsapp.App.a(r0, r1, r2, r3, r4, r5, r6);
        r0 = 1;
        r10.R = r0;
    L_0x025d:
        if (r8 == 0) goto L_0x0281;
    L_0x025f:
        r0 = 1;
        if (r12 != r0) goto L_0x0281;
    L_0x0262:
        r0 = 1;
        r10.R = r0;	 Catch:{ d -> 0x044e }
        r0 = r10.aI;	 Catch:{ IOException -> 0x0450 }
        r2 = r0.p;	 Catch:{ IOException -> 0x0450 }
        r3 = new java.io.File;	 Catch:{ IOException -> 0x0450 }
        r0 = cb;	 Catch:{ IOException -> 0x0450 }
        r1 = 38;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0450 }
        r0 = r13.getStringExtra(r0);	 Catch:{ IOException -> 0x0450 }
        r3.<init>(r0);	 Catch:{ IOException -> 0x0450 }
        r4 = 3;
        r5 = 0;
        r6 = 1;
        r7 = 0;
        r0 = r10;
        r1 = r10;
        com.whatsapp.util.ag.a(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x0450 }
    L_0x0281:
        if (r8 == 0) goto L_0x008a;
    L_0x0283:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x0286:
        r0 = r13.getData();
        if (r0 != 0) goto L_0x02a2;
    L_0x028c:
        r1 = cb;	 Catch:{ IOException -> 0x04b6 }
        r2 = 76;
        r1 = r1[r2];	 Catch:{ IOException -> 0x04b6 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x04b6 }
        r1 = r10.getBaseContext();	 Catch:{ IOException -> 0x04b6 }
        r2 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ IOException -> 0x04b6 }
        if (r8 == 0) goto L_0x02b8;
    L_0x02a2:
        r1 = cb;
        r2 = 70;
        r1 = r1[r2];
        r2 = 1;
        r1 = r13.getBooleanExtra(r1, r2);
        r2 = new com.whatsapp.ash;
        r2.<init>(r10, r1);
        com.whatsapp.util.ag.a(r0, r10, r2);
        r0 = 1;
        r10.R = r0;
    L_0x02b8:
        if (r8 == 0) goto L_0x008a;
    L_0x02ba:
        r0 = -1;
        if (r12 != r0) goto L_0x0315;
    L_0x02bd:
        r2 = new com.whatsapp.MediaData;
        r2.<init>();
        r0 = new java.io.File;	 Catch:{ IOException -> 0x04b8 }
        r1 = cb;	 Catch:{ IOException -> 0x04b8 }
        r3 = 80;
        r1 = r1[r3];	 Catch:{ IOException -> 0x04b8 }
        r1 = r13.getStringExtra(r1);	 Catch:{ IOException -> 0x04b8 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x04b8 }
        r2.file = r0;	 Catch:{ IOException -> 0x04b8 }
        r0 = cb;	 Catch:{ IOException -> 0x04b8 }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ IOException -> 0x04b8 }
        r4 = 0;
        r0 = r13.getLongExtra(r0, r4);	 Catch:{ IOException -> 0x04b8 }
        r2.trimFrom = r0;	 Catch:{ IOException -> 0x04b8 }
        r0 = cb;	 Catch:{ IOException -> 0x04b8 }
        r1 = 27;
        r0 = r0[r1];	 Catch:{ IOException -> 0x04b8 }
        r4 = 0;
        r0 = r13.getLongExtra(r0, r4);	 Catch:{ IOException -> 0x04b8 }
        r2.trimTo = r0;	 Catch:{ IOException -> 0x04b8 }
        r0 = r10.ae;	 Catch:{ IOException -> 0x04b8 }
        r1 = r2.file;	 Catch:{ IOException -> 0x04b8 }
        r1 = r1.getAbsolutePath();	 Catch:{ IOException -> 0x04b8 }
        r4 = r2.trimFrom;	 Catch:{ IOException -> 0x04b8 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r1 = com.whatsapp.util.ag.a(r1, r4);	 Catch:{ IOException -> 0x04b8 }
        r3 = 3;
        r4 = 0;
        r5 = cb;	 Catch:{ IOException -> 0x04b8 }
        r6 = 74;
        r5 = r5[r6];	 Catch:{ IOException -> 0x04b8 }
        r5 = r13.getStringExtra(r5);	 Catch:{ IOException -> 0x04b8 }
        r6 = 0;
        com.whatsapp.App.a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x04b8 }
        r0 = 1;
        r10.R = r0;	 Catch:{ IOException -> 0x04b8 }
        if (r8 == 0) goto L_0x008a;
    L_0x0315:
        r0 = 1;
        if (r12 != r0) goto L_0x008a;
    L_0x0318:
        r0 = 1;
        r10.R = r0;	 Catch:{ d -> 0x04ba }
        r0 = r10.aI;	 Catch:{ IOException -> 0x0339 }
        r2 = r0.p;	 Catch:{ IOException -> 0x0339 }
        r3 = new java.io.File;	 Catch:{ IOException -> 0x0339 }
        r0 = cb;	 Catch:{ IOException -> 0x0339 }
        r1 = 78;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0339 }
        r0 = r13.getStringExtra(r0);	 Catch:{ IOException -> 0x0339 }
        r3.<init>(r0);	 Catch:{ IOException -> 0x0339 }
        r4 = 3;
        r5 = 0;
        r6 = 1;
        r7 = 0;
        r0 = r10;
        r1 = r10;
        com.whatsapp.util.ag.a(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x0339 }
        goto L_0x008a;
    L_0x0339:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);	 Catch:{ IOException -> 0x04bc }
        r0 = r10.getBaseContext();	 Catch:{ IOException -> 0x04bc }
        r1 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ IOException -> 0x04bc }
        if (r8 == 0) goto L_0x008a;
    L_0x034a:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x034d:
        r0 = r13.getData();
        if (r0 == 0) goto L_0x035e;
    L_0x0353:
        r1 = r10.ae;	 Catch:{ IOException -> 0x04be }
        r2 = com.whatsapp.util.ag.h(r0);	 Catch:{ IOException -> 0x04be }
        com.whatsapp.util.ag.a(r1, r0, r2, r10);	 Catch:{ IOException -> 0x04be }
        if (r8 == 0) goto L_0x0385;
    L_0x035e:
        r0 = cb;
        r1 = 17;
        r0 = r0[r1];
        r0 = r13.getParcelableArrayListExtra(r0);
        if (r0 == 0) goto L_0x0385;
    L_0x036a:
        r1 = r0.iterator();
    L_0x036e:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0385;
    L_0x0374:
        r0 = r1.next();
        r0 = (android.net.Uri) r0;
        r2 = r10.ae;
        r3 = com.whatsapp.util.ag.h(r0);
        com.whatsapp.util.ag.a(r2, r0, r3, r10);
        if (r8 == 0) goto L_0x036e;
    L_0x0385:
        if (r8 == 0) goto L_0x008a;
    L_0x0387:
        r0 = -1;
        if (r12 != r0) goto L_0x03ef;
    L_0x038a:
        r0 = 0;
        if (r13 == 0) goto L_0x04c2;
    L_0x038d:
        r1 = r13.getData();	 Catch:{ IOException -> 0x04c0 }
        if (r1 == 0) goto L_0x04c2;
    L_0x0393:
        r0 = r13.getData();
    L_0x0397:
        if (r0 != 0) goto L_0x03af;
    L_0x0399:
        r1 = cb;	 Catch:{ IOException -> 0x04f1 }
        r2 = 48;
        r1 = r1[r2];	 Catch:{ IOException -> 0x04f1 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x04f1 }
        r1 = r10.getBaseContext();	 Catch:{ IOException -> 0x04f1 }
        r2 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ IOException -> 0x04f1 }
        if (r8 == 0) goto L_0x03ed;
    L_0x03af:
        r1 = r0.toString();	 Catch:{ IOException -> 0x04f3 }
        r2 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;	 Catch:{ IOException -> 0x04f3 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x04f3 }
        r1 = r1.startsWith(r2);	 Catch:{ IOException -> 0x04f3 }
        if (r1 != 0) goto L_0x03cf;
    L_0x03bf:
        r1 = r0.toString();	 Catch:{ IOException -> 0x04f5 }
        r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;	 Catch:{ IOException -> 0x04f5 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x04f5 }
        r1 = r1.startsWith(r2);	 Catch:{ IOException -> 0x04f5 }
        if (r1 == 0) goto L_0x03e5;
    L_0x03cf:
        r1 = cb;	 Catch:{ IOException -> 0x04f7 }
        r2 = 60;
        r1 = r1[r2];	 Catch:{ IOException -> 0x04f7 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x04f7 }
        r1 = r10.getBaseContext();	 Catch:{ IOException -> 0x04f7 }
        r2 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ IOException -> 0x04f7 }
        if (r8 == 0) goto L_0x03ed;
    L_0x03e5:
        r1 = new com.whatsapp.sa;	 Catch:{ IOException -> 0x04f9 }
        r1.<init>(r10);	 Catch:{ IOException -> 0x04f9 }
        com.whatsapp.util.ag.a(r0, r10, r1);	 Catch:{ IOException -> 0x04f9 }
    L_0x03ed:
        if (r8 == 0) goto L_0x008a;
    L_0x03ef:
        if (r12 != 0) goto L_0x008a;
    L_0x03f1:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x04fb }
        r1 = 18;
        if (r0 < r1) goto L_0x008a;
    L_0x03f7:
        com.whatsapp.util.ag.a(r10);	 Catch:{ IOException -> 0x04fd }
        if (r8 == 0) goto L_0x008a;
    L_0x03fc:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x03ff:
        r0 = 1;
        r10.R = r0;	 Catch:{ IOException -> 0x0501 }
        if (r8 == 0) goto L_0x008a;
    L_0x0404:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x0407:
        r0 = cb;	 Catch:{ IOException -> 0x0505 }
        r1 = 35;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0505 }
        r0 = com.whatsapp.App.h(r10, r0);	 Catch:{ IOException -> 0x0505 }
        if (r0 == 0) goto L_0x0507;
    L_0x0413:
        r0 = cb;	 Catch:{ IOException -> 0x041e }
        r1 = 53;
        r0 = r0[r1];	 Catch:{ IOException -> 0x041e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x041e }
        goto L_0x007c;
    L_0x041e:
        r0 = move-exception;
        throw r0;
    L_0x0420:
        r0 = move-exception;
        throw r0;
    L_0x0422:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0424 }
    L_0x0424:
        r0 = move-exception;
        throw r0;
    L_0x0426:
        r0 = move-exception;
        throw r0;
    L_0x0428:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x042a }
    L_0x042a:
        r0 = move-exception;
        throw r0;
    L_0x042c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x042e }
    L_0x042e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0430 }
    L_0x0430:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0432 }
    L_0x0432:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0434 }
    L_0x0434:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0436 }
    L_0x0436:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0438 }
    L_0x0438:
        r0 = move-exception;
        throw r0;
    L_0x043a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x043c }
    L_0x043c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x043e }
    L_0x043e:
        r0 = move-exception;
        throw r0;
    L_0x0440:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0442 }
    L_0x0442:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0444 }
    L_0x0444:
        r0 = move-exception;
        throw r0;
    L_0x0446:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0448 }
    L_0x0448:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x044a }
    L_0x044a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x044c }
    L_0x044c:
        r0 = move-exception;
        throw r0;
    L_0x044e:
        r0 = move-exception;
        throw r0;
    L_0x0450:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);	 Catch:{ IOException -> 0x04ae }
        r0 = r10.getBaseContext();	 Catch:{ IOException -> 0x04ae }
        r1 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ IOException -> 0x04ae }
        if (r8 == 0) goto L_0x0281;
    L_0x0461:
        r0 = -1;
        if (r12 != r0) goto L_0x0496;
    L_0x0464:
        r0 = r13.getData();
        if (r0 == 0) goto L_0x046f;
    L_0x046a:
        r10.a(r0);	 Catch:{ IOException -> 0x04b0 }
        if (r8 == 0) goto L_0x0494;
    L_0x046f:
        r0 = cb;
        r1 = 33;
        r0 = r0[r1];
        r0 = r13.getParcelableArrayListExtra(r0);
        if (r0 == 0) goto L_0x0480;
    L_0x047b:
        r10.a(r0);	 Catch:{ IOException -> 0x04b2 }
        if (r8 == 0) goto L_0x0494;
    L_0x0480:
        r0 = cb;	 Catch:{ IOException -> 0x04b4 }
        r1 = 51;
        r0 = r0[r1];	 Catch:{ IOException -> 0x04b4 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x04b4 }
        r0 = r10.getBaseContext();	 Catch:{ IOException -> 0x04b4 }
        r1 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ IOException -> 0x04b4 }
    L_0x0494:
        if (r8 == 0) goto L_0x0281;
    L_0x0496:
        r0 = cb;	 Catch:{ IOException -> 0x04ac }
        r1 = 37;
        r0 = r0[r1];	 Catch:{ IOException -> 0x04ac }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x04ac }
        r0 = r10.getBaseContext();	 Catch:{ IOException -> 0x04ac }
        r1 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ IOException -> 0x04ac }
        goto L_0x0281;
    L_0x04ac:
        r0 = move-exception;
        throw r0;
    L_0x04ae:
        r0 = move-exception;
        throw r0;
    L_0x04b0:
        r0 = move-exception;
        throw r0;
    L_0x04b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04b4 }
    L_0x04b4:
        r0 = move-exception;
        throw r0;
    L_0x04b6:
        r0 = move-exception;
        throw r0;
    L_0x04b8:
        r0 = move-exception;
        throw r0;	 Catch:{ d -> 0x04ba }
    L_0x04ba:
        r0 = move-exception;
        throw r0;
    L_0x04bc:
        r0 = move-exception;
        throw r0;
    L_0x04be:
        r0 = move-exception;
        throw r0;
    L_0x04c0:
        r0 = move-exception;
        throw r0;
    L_0x04c2:
        r1 = com.whatsapp.util.ag.c(r10);
        r2 = r1.exists();
        if (r2 == 0) goto L_0x04d5;
    L_0x04cc:
        r0 = android.net.Uri.fromFile(r1);
        com.whatsapp.util.ag.a(r10, r0);
        goto L_0x0397;
    L_0x04d5:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = cb;
        r4 = 40;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0397;
    L_0x04f1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04f3 }
    L_0x04f3:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04f5 }
    L_0x04f5:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04f7 }
    L_0x04f7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04f9 }
    L_0x04f9:
        r0 = move-exception;
        throw r0;
    L_0x04fb:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04fd }
    L_0x04fd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04ff }
    L_0x04ff:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0501 }
    L_0x0501:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0503 }
    L_0x0503:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0505 }
    L_0x0505:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x041e }
    L_0x0507:
        r1 = r13.getData();
        r0 = 3;
        r2 = new java.lang.String[r0];
        r0 = 0;
        r3 = cb;
        r4 = 43;
        r3 = r3[r4];
        r2[r0] = r3;
        r0 = 1;
        r3 = cb;
        r4 = 24;
        r3 = r3[r4];
        r2[r0] = r3;
        r0 = 2;
        r3 = cb;
        r4 = 65;
        r3 = r3[r4];
        r2[r0] = r3;
        r6 = 0;
        r7 = 0;
        r0 = com.whatsapp.App.at;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r2 = r0.query(r1, r2, r3, r4, r5);
        r3 = new q;
        r3.<init>(r10);
        r0 = r2.moveToNext();
        if (r0 == 0) goto L_0x0991;
    L_0x053f:
        r0 = cb;
        r1 = 31;
        r0 = r0[r1];
        r0 = r2.getColumnIndex(r0);
        r0 = r2.getString(r0);
        r1 = r3.j;	 Catch:{ IOException -> 0x0717 }
        r4 = cb;	 Catch:{ IOException -> 0x0717 }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0717 }
        r4 = r2.getColumnIndex(r4);	 Catch:{ IOException -> 0x0717 }
        r4 = r2.getString(r4);	 Catch:{ IOException -> 0x0717 }
        r1.e = r4;	 Catch:{ IOException -> 0x0717 }
        r3.h(r0);	 Catch:{ IOException -> 0x0717 }
        r1 = cb;	 Catch:{ IOException -> 0x0717 }
        r4 = 25;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0717 }
        r1 = r2.getColumnIndex(r1);	 Catch:{ IOException -> 0x0717 }
        r1 = r2.getString(r1);	 Catch:{ IOException -> 0x0717 }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ IOException -> 0x0717 }
        if (r1 <= 0) goto L_0x0579;
    L_0x0576:
        r3.c(r0);	 Catch:{ IOException -> 0x0717 }
    L_0x0579:
        r3.l(r0);
        r3.g(r0);
        r3.a(r0);
        r3.b(r0);
        r3.d(r0);
        r3.f(r0);
        r1 = r0;
    L_0x058c:
        r2.close();
        r0 = new p;
        r0.<init>();
        r2 = 2;
        r0 = r0.a(r10, r3, r2);	 Catch:{ d -> 0x0719 }
        r2 = r0;
    L_0x059a:
        if (r2 != 0) goto L_0x05ae;
    L_0x059c:
        r0 = cb;	 Catch:{ IOException -> 0x0727 }
        r4 = 36;
        r0 = r0[r4];	 Catch:{ IOException -> 0x0727 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0727 }
        r0 = 2131232171; // 0x7f0805ab float:1.8080444E38 double:1.052968599E-314;
        r4 = 0;
        com.whatsapp.App.a(r10, r0, r4);	 Catch:{ IOException -> 0x0727 }
        if (r8 == 0) goto L_0x0644;
    L_0x05ae:
        r4 = new android.content.Intent;
        r0 = com.whatsapp.ViewSharedContactActivity.class;
        r4.<init>(r10, r0);
        r5 = new java.util.ArrayList;
        r5.<init>();
        r6 = new java.util.ArrayList;
        r6.<init>();
        if (r3 == 0) goto L_0x0604;
    L_0x05c1:
        r0 = r3.k;	 Catch:{ IOException -> 0x0729 }
        if (r0 == 0) goto L_0x0604;
    L_0x05c5:
        r0 = r3.k;
        r3 = r0.iterator();
    L_0x05cb:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0604;
    L_0x05d1:
        r0 = r3.next();
        r0 = (g) r0;
        r7 = r0.c;
        r5.add(r7);
        r7 = r0.b;
        if (r7 == 0) goto L_0x05fe;
    L_0x05e0:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r0 = r0.b;
        r0 = r7.append(r0);
        r7 = cb;
        r9 = 12;
        r7 = r7[r9];
        r0 = r0.append(r7);
        r0 = r0.toString();
        r6.add(r0);	 Catch:{ IOException -> 0x072b }
        if (r8 == 0) goto L_0x0602;
    L_0x05fe:
        r0 = 0;
        r6.add(r0);	 Catch:{ IOException -> 0x072b }
    L_0x0602:
        if (r8 == 0) goto L_0x05cb;
    L_0x0604:
        r0 = cb;
        r3 = 23;
        r0 = r0[r3];
        r4.putStringArrayListExtra(r0, r5);
        r0 = cb;
        r3 = 57;
        r0 = r0[r3];
        r4.putStringArrayListExtra(r0, r6);
        r0 = cb;
        r3 = 49;
        r0 = r0[r3];
        r3 = 1;
        r4.putExtra(r0, r3);
        r0 = cb;
        r3 = 26;
        r0 = r0[r3];
        r3 = r10.aI;
        r3 = r3.p;
        r4.putExtra(r0, r3);
        r0 = cb;
        r3 = 79;
        r0 = r0[r3];
        r4.putExtra(r0, r2);
        r0 = cb;
        r2 = 54;
        r0 = r0[r2];
        r4.putExtra(r0, r1);
        r0 = 8;
        r10.startActivityForResult(r4, r0);
    L_0x0644:
        if (r8 == 0) goto L_0x008a;
    L_0x0646:
        r0 = -1;
        if (r12 != r0) goto L_0x0662;
    L_0x0649:
        if (r13 == 0) goto L_0x008a;
    L_0x064b:
        r0 = r13.getData();	 Catch:{ IOException -> 0x072d }
        if (r0 == 0) goto L_0x008a;
    L_0x0651:
        r0 = r10.aE;	 Catch:{ IOException -> 0x072f }
        r0.a();	 Catch:{ IOException -> 0x072f }
        r0 = r13.getData();	 Catch:{ IOException -> 0x072f }
        r1 = -1;
        r2 = 0;
        r3 = 0;
        r10.a(r0, r1, r2, r3);	 Catch:{ IOException -> 0x072f }
        if (r8 == 0) goto L_0x008a;
    L_0x0662:
        if (r13 == 0) goto L_0x008a;
    L_0x0664:
        r0 = cb;	 Catch:{ IOException -> 0x0733 }
        r1 = 82;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0733 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x0733 }
        if (r0 == 0) goto L_0x008a;
    L_0x0671:
        r0 = cb;	 Catch:{ IOException -> 0x0735 }
        r1 = 50;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0735 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0735 }
        r0 = 7;
        r10.showDialog(r0);	 Catch:{ IOException -> 0x0735 }
        if (r8 == 0) goto L_0x008a;
    L_0x0680:
        r0 = -1;
        if (r12 != r0) goto L_0x08ab;
    L_0x0683:
        if (r13 == 0) goto L_0x08ab;
    L_0x0685:
        r6 = com.whatsapp.wallpaper.k.d(r10);
        r0 = r13.getData();
        if (r0 == 0) goto L_0x07e3;
    L_0x068f:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = cb;
        r2 = 32;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r13.getData();
        r1 = r1.toString();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.at;
        r1 = r13.getData();
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r2 = r0.query(r1, r2, r3, r4, r5);
        if (r2 == 0) goto L_0x074d;
    L_0x06c1:
        r2.moveToFirst();	 Catch:{ all -> 0x073d }
        r0 = cb;	 Catch:{ all -> 0x073d }
        r1 = 21;
        r0 = r0[r1];	 Catch:{ all -> 0x073d }
        r0 = r2.getColumnIndex(r0);	 Catch:{ all -> 0x073d }
        if (r0 < 0) goto L_0x074d;
    L_0x06d0:
        r0 = r2.getString(r0);	 Catch:{ IOException -> 0x073b }
        r1 = cb;	 Catch:{ IOException -> 0x073b }
        r3 = 45;
        r1 = r1[r3];	 Catch:{ IOException -> 0x073b }
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x073b }
        if (r0 == 0) goto L_0x074d;
    L_0x06e0:
        r0 = new android.graphics.BitmapFactory$Options;	 Catch:{ all -> 0x073d }
        r0.<init>();	 Catch:{ all -> 0x073d }
        r1 = 1;
        r0.inJustDecodeBounds = r1;	 Catch:{ all -> 0x073d }
        r1 = 0;
        r3 = com.whatsapp.App.at;	 Catch:{ FileNotFoundException -> 0x0746 }
        r4 = r13.getData();	 Catch:{ FileNotFoundException -> 0x0746 }
        r1 = r3.openInputStream(r4);	 Catch:{ FileNotFoundException -> 0x0746 }
        r3 = 0;
        android.graphics.BitmapFactory.decodeStream(r1, r3, r0);	 Catch:{ IOException -> 0x0744 }
        r3 = r0.outWidth;	 Catch:{ IOException -> 0x0744 }
        r4 = r6.x;	 Catch:{ IOException -> 0x0744 }
        if (r3 != r4) goto L_0x0949;
    L_0x06fd:
        r0 = r0.outHeight;	 Catch:{ IOException -> 0x0744 }
        r3 = r6.y;	 Catch:{ IOException -> 0x0744 }
        if (r0 != r3) goto L_0x0949;
    L_0x0703:
        r0 = r13.getData();	 Catch:{ FileNotFoundException -> 0x0746 }
        r3 = -1;
        r4 = 0;
        r5 = 0;
        r10.a(r0, r3, r4, r5);	 Catch:{ FileNotFoundException -> 0x0746 }
        com.whatsapp.util.ao.a(r1);	 Catch:{ all -> 0x073d }
        if (r2 == 0) goto L_0x007c;
    L_0x0712:
        r2.close();
        goto L_0x007c;
    L_0x0717:
        r0 = move-exception;
        throw r0;
    L_0x0719:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = 2131231503; // 0x7f08030f float:1.8079089E38 double:1.052968269E-314;
        r2 = 0;
        com.whatsapp.App.a(r10, r0, r2);
        r2 = r7;
        goto L_0x059a;
    L_0x0727:
        r0 = move-exception;
        throw r0;
    L_0x0729:
        r0 = move-exception;
        throw r0;
    L_0x072b:
        r0 = move-exception;
        throw r0;
    L_0x072d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x072f }
    L_0x072f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0731 }
    L_0x0731:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0733 }
    L_0x0733:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0735 }
    L_0x0735:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0737 }
    L_0x0737:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0739 }
    L_0x0739:
        r0 = move-exception;
        throw r0;
    L_0x073b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x073d }
    L_0x073d:
        r0 = move-exception;
        if (r2 == 0) goto L_0x0743;
    L_0x0740:
        r2.close();	 Catch:{ IOException -> 0x0955 }
    L_0x0743:
        throw r0;
    L_0x0744:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0746 }
    L_0x0746:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);	 Catch:{ all -> 0x094e }
        com.whatsapp.util.ao.a(r1);	 Catch:{ all -> 0x073d }
    L_0x074d:
        if (r2 == 0) goto L_0x0752;
    L_0x074f:
        r2.close();	 Catch:{ IOException -> 0x0953 }
    L_0x0752:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = cb;
        r2 = 62;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r6.x;
        r0 = r0.append(r1);
        r1 = cb;
        r2 = 28;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r6.y;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.wallpaper.CropImage.class;
        r0.<init>(r10, r1);
        r1 = cb;
        r2 = 11;
        r1 = r1[r2];
        r2 = r6.x;
        r0.putExtra(r1, r2);
        r1 = cb;
        r2 = 63;
        r1 = r1[r2];
        r2 = r6.y;
        r0.putExtra(r1, r2);
        r1 = cb;
        r2 = 58;
        r1 = r1[r2];
        r2 = 1;
        r0.putExtra(r1, r2);
        r1 = cb;
        r2 = 66;
        r1 = r1[r2];
        r2 = 1;
        r0.putExtra(r1, r2);
        r1 = cb;
        r2 = 42;
        r1 = r1[r2];
        r2 = 1;
        r0.putExtra(r1, r2);
        r1 = r13.getData();
        r0.setData(r1);
        r1 = cb;
        r2 = 39;
        r1 = r1[r2];
        r2 = com.whatsapp.wallpaper.k.a();
        r0.putExtra(r1, r2);
        r1 = cb;
        r2 = 10;
        r1 = r1[r2];
        r2 = android.graphics.Bitmap.CompressFormat.JPEG;
        r2 = r2.toString();
        r0.putExtra(r1, r2);
        r1 = 18;
        r10.startActivityForResult(r0, r1);
        if (r8 == 0) goto L_0x08ab;
    L_0x07e3:
        r0 = r10.aE;
        r0.a();
        r0 = cb;
        r1 = 73;
        r0 = r0[r1];
        r1 = 0;
        r0 = r13.getIntExtra(r0, r1);
        if (r0 == 0) goto L_0x083d;
    L_0x07f5:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0957 }
        r1.<init>();	 Catch:{ IOException -> 0x0957 }
        r2 = cb;	 Catch:{ IOException -> 0x0957 }
        r3 = 29;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0957 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0957 }
        r1 = r1.append(r0);	 Catch:{ IOException -> 0x0957 }
        r2 = cb;	 Catch:{ IOException -> 0x0957 }
        r3 = 52;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0957 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0957 }
        r2 = r6.x;	 Catch:{ IOException -> 0x0957 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0957 }
        r2 = ",";
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0957 }
        r2 = r6.y;	 Catch:{ IOException -> 0x0957 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0957 }
        r2 = "]";
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0957 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0957 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x0957 }
        r1 = 0;
        r2 = r6.x;	 Catch:{ IOException -> 0x0957 }
        r3 = r6.y;	 Catch:{ IOException -> 0x0957 }
        r10.a(r1, r0, r2, r3);	 Catch:{ IOException -> 0x0957 }
        if (r8 == 0) goto L_0x08ab;
    L_0x083d:
        r0 = cb;	 Catch:{ IOException -> 0x0959 }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0959 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x0959 }
        if (r0 == 0) goto L_0x085c;
    L_0x084a:
        com.whatsapp.wallpaper.k.e(r10);	 Catch:{ IOException -> 0x095b }
        r0 = 0;
        r10.a(r0);	 Catch:{ IOException -> 0x095b }
        r0 = cb;	 Catch:{ IOException -> 0x095b }
        r1 = 34;
        r0 = r0[r1];	 Catch:{ IOException -> 0x095b }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x095b }
        if (r8 == 0) goto L_0x08ab;
    L_0x085c:
        r0 = cb;	 Catch:{ IOException -> 0x095d }
        r1 = 22;
        r0 = r0[r1];	 Catch:{ IOException -> 0x095d }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x095d }
        if (r0 == 0) goto L_0x087e;
    L_0x0869:
        com.whatsapp.wallpaper.k.f(r10);	 Catch:{ IOException -> 0x095f }
        r0 = com.whatsapp.wallpaper.k.g(r10);	 Catch:{ IOException -> 0x095f }
        r10.a(r0);	 Catch:{ IOException -> 0x095f }
        r0 = cb;	 Catch:{ IOException -> 0x095f }
        r1 = 47;
        r0 = r0[r1];	 Catch:{ IOException -> 0x095f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x095f }
        if (r8 == 0) goto L_0x08ab;
    L_0x087e:
        r0 = r10.getBaseContext();	 Catch:{ IOException -> 0x095f }
        r1 = 2131231129; // 0x7f080199 float:1.807833E38 double:1.052968084E-314;
        r1 = r10.getString(r1);	 Catch:{ IOException -> 0x095f }
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ IOException -> 0x095f }
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x095f }
        r0.<init>();	 Catch:{ IOException -> 0x095f }
        r1 = cb;	 Catch:{ IOException -> 0x095f }
        r2 = 19;
        r1 = r1[r2];	 Catch:{ IOException -> 0x095f }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x095f }
        r1 = r13.toString();	 Catch:{ IOException -> 0x095f }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x095f }
        r0 = r0.toString();	 Catch:{ IOException -> 0x095f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x095f }
    L_0x08ab:
        r10.x();	 Catch:{ IOException -> 0x0961 }
        if (r8 == 0) goto L_0x008a;
    L_0x08b0:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x08b3:
        if (r13 == 0) goto L_0x08d7;
    L_0x08b5:
        r0 = cb;	 Catch:{ IOException -> 0x0967 }
        r1 = 71;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0967 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x0967 }
        if (r0 == 0) goto L_0x08d7;
    L_0x08c2:
        r0 = r10.L();	 Catch:{ IOException -> 0x0969 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IOException -> 0x0969 }
        r0 = r10.ai;	 Catch:{ IOException -> 0x0969 }
        r1 = 4;
        r0.setVisibility(r1);	 Catch:{ IOException -> 0x0969 }
        r0 = r10.aI;	 Catch:{ IOException -> 0x0969 }
        com.whatsapp.r.a(r0, r10);	 Catch:{ IOException -> 0x0969 }
        if (r8 == 0) goto L_0x008a;
    L_0x08d7:
        r0 = r10.aI;	 Catch:{ IOException -> 0x096b }
        r1 = 20;
        com.whatsapp.r.a(r13, r0, r10, r1, r10);	 Catch:{ IOException -> 0x096b }
        if (r8 == 0) goto L_0x008a;
    L_0x08e0:
        r0 = com.whatsapp.r.a();	 Catch:{ IOException -> 0x096d }
        r0.delete();	 Catch:{ IOException -> 0x096d }
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x08ea:
        r0 = r10.aI;	 Catch:{ IOException -> 0x096f }
        r0 = com.whatsapp.r.b(r0, r10);	 Catch:{ IOException -> 0x096f }
        if (r0 == 0) goto L_0x008a;
    L_0x08f2:
        r0 = r10.L();	 Catch:{ IOException -> 0x0971 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IOException -> 0x0971 }
        r0 = r10.ai;	 Catch:{ IOException -> 0x0971 }
        r1 = 4;
        r0.setVisibility(r1);	 Catch:{ IOException -> 0x0971 }
        if (r8 == 0) goto L_0x008a;
    L_0x0902:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x0905:
        r10.z();	 Catch:{ IOException -> 0x0975 }
        if (r8 == 0) goto L_0x008a;
    L_0x090a:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x090d:
        r10.O();	 Catch:{ IOException -> 0x0979 }
        if (r8 == 0) goto L_0x008a;
    L_0x0912:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x0915:
        r10.aa();	 Catch:{ IOException -> 0x097d }
        if (r8 == 0) goto L_0x008a;
    L_0x091a:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x091d:
        r10.C();	 Catch:{ IOException -> 0x0981 }
        if (r8 == 0) goto L_0x008a;
    L_0x0922:
        r10.X();	 Catch:{ IOException -> 0x0983 }
        if (r8 == 0) goto L_0x008a;
    L_0x0927:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x092a:
        r10.Y();	 Catch:{ IOException -> 0x0987 }
        if (r8 == 0) goto L_0x008a;
    L_0x092f:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x0932:
        r10.R();	 Catch:{ IOException -> 0x098b }
        if (r8 == 0) goto L_0x008a;
    L_0x0937:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x093a:
        r10.v();	 Catch:{ IOException -> 0x098f }
        if (r8 == 0) goto L_0x008a;
    L_0x093f:
        r0 = -1;
        if (r12 != r0) goto L_0x008a;
    L_0x0942:
        r10.k();	 Catch:{ IOException -> 0x0947 }
        goto L_0x008a;
    L_0x0947:
        r0 = move-exception;
        throw r0;
    L_0x0949:
        com.whatsapp.util.ao.a(r1);	 Catch:{ all -> 0x073d }
        goto L_0x074d;
    L_0x094e:
        r0 = move-exception;
        com.whatsapp.util.ao.a(r1);	 Catch:{ all -> 0x073d }
        throw r0;	 Catch:{ all -> 0x073d }
    L_0x0953:
        r0 = move-exception;
        throw r0;
    L_0x0955:
        r0 = move-exception;
        throw r0;
    L_0x0957:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0959 }
    L_0x0959:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x095b }
    L_0x095b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x095d }
    L_0x095d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x095f }
    L_0x095f:
        r0 = move-exception;
        throw r0;
    L_0x0961:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0963 }
    L_0x0963:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0965 }
    L_0x0965:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0967 }
    L_0x0967:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0969 }
    L_0x0969:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x096b }
    L_0x096b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x096d }
    L_0x096d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x096f }
    L_0x096f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0971 }
    L_0x0971:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0973 }
    L_0x0973:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0975 }
    L_0x0975:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0977 }
    L_0x0977:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0979 }
    L_0x0979:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x097b }
    L_0x097b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x097d }
    L_0x097d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x097f }
    L_0x097f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0981 }
    L_0x0981:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0983 }
    L_0x0983:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0985 }
    L_0x0985:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0987 }
    L_0x0987:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0989 }
    L_0x0989:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x098b }
    L_0x098b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x098d }
    L_0x098d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x098f }
    L_0x098f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0947 }
    L_0x0991:
        r1 = r6;
        goto L_0x058c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.net.Uri r9, int r10, int r11, int r12) {
        /*
        r8 = this;
        r3 = 0;
        r1 = 1;
        r7 = 0;
        r6 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.aq;	 Catch:{ ActivityNotFoundException -> 0x0046 }
        if (r0 == 0) goto L_0x0021;
    L_0x0009:
        if (r9 != 0) goto L_0x0015;
    L_0x000b:
        r0 = r8;
        r2 = r10;
        r4 = r11;
        r5 = r12;
        r0 = com.whatsapp.wallpaper.k.a(r0, r1, r2, r3, r4, r5);
        if (r6 == 0) goto L_0x003f;
    L_0x0015:
        r2 = -1;
        r0 = r8;
        r1 = r7;
        r3 = r9;
        r4 = r7;
        r5 = r7;
        r0 = com.whatsapp.wallpaper.k.a(r0, r1, r2, r3, r4, r5);
        if (r6 == 0) goto L_0x003f;
    L_0x0021:
        if (r9 != 0) goto L_0x002e;
    L_0x0023:
        r0 = r8.aI;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r0 = r0.p;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r1 = 1;
        r2 = 0;
        com.whatsapp.wallpaper.k.a(r8, r0, r1, r10, r2);	 Catch:{ ActivityNotFoundException -> 0x0048 }
        if (r6 == 0) goto L_0x0037;
    L_0x002e:
        r0 = r8.aI;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r0 = r0.p;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r1 = 0;
        r2 = 0;
        com.whatsapp.wallpaper.k.a(r8, r0, r1, r2, r9);	 Catch:{ ActivityNotFoundException -> 0x0048 }
    L_0x0037:
        r0 = r8.aI;
        r0 = r0.p;
        r0 = com.whatsapp.wallpaper.k.a(r8, r0);
    L_0x003f:
        r8.a(r0);
        com.whatsapp.util.ag.a(r8, r9);
        return;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.a(android.net.Uri, int, int, int):void");
    }

    private void e(boolean z) {
        try {
            if (TextUtils.isEmpty(this.aH)) {
                this.aH = null;
                this.ac = null;
                return;
            }
            this.D = this.aH;
            I();
            int firstVisiblePosition = this.bc.getFirstVisiblePosition();
            co b = this.bd.b(firstVisiblePosition);
            if (b != null) {
                try {
                    if (b.k.c == null) {
                        b = this.bd.b(firstVisiblePosition + 1);
                    }
                    if (b != null) {
                        try {
                            if (this.as != null) {
                                this.as.cancel(true);
                            }
                            this.as = new hp(this, this.aH, z, b);
                            bq.a(this.as, new Void[0]);
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    }
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    private boolean h() {
        try {
            if (this.bc.getLastVisiblePosition() < (this.bc.getHeaderViewsCount() + this.bd.getCount()) - 1) {
                return false;
            }
            if (this.bc.getChildCount() == 0) {
                return false;
            }
            try {
                if (this.bc.getChildAt(this.bc.getChildCount() - 1).getBottom() == this.bc.getHeight()) {
                    return true;
                }
                return false;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    private void V() {
        try {
            if (this.aB.getVisibility() == 0 && this.br >= 0) {
                Log.i(cb[189] + this.br);
                this.br = -1;
                this.bw.setClipChildren(false);
                int height = this.aB.getHeight();
                Animation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height);
                translateAnimation.setDuration(250);
                translateAnimation.setFillBefore(true);
                translateAnimation.setFillAfter(true);
                this.bj.startAnimation(translateAnimation);
                boolean h = h();
                if (h) {
                    try {
                        this.bc.setTranscriptMode(2);
                        this.bc.startAnimation(translateAnimation);
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                }
                View findViewById = findViewById(2131755505);
                Drawable background = findViewById.getBackground();
                try {
                    if (!(background instanceof x1)) {
                        findViewById.setBackgroundDrawable(new x1(background));
                    }
                    Animation com_whatsapp_atg = new atg(this, height, findViewById);
                    com_whatsapp_atg.setDuration(250);
                    findViewById.startAnimation(com_whatsapp_atg);
                    com_whatsapp_atg.setAnimationListener(new n7(this, findViewById, h));
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    static boolean g(Conversation conversation, boolean z) {
        conversation.aS = z;
        return z;
    }

    private void e(co coVar) {
        this.bc.post(new anf(this, coVar));
    }

    static a_p k(Conversation conversation) {
        return conversation.au;
    }

    static int c(Conversation conversation, int i) {
        conversation.ab = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o() {
        /*
        r9 = this;
        r3 = 0;
        r8 = 8;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r9.ar;
        if (r1 == 0) goto L_0x0029;
    L_0x0009:
        r1 = r9.aI;
        r1 = r1.l();
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ActivityNotFoundException -> 0x00f2 }
        if (r2 != 0) goto L_0x001c;
    L_0x0015:
        r2 = r9.ax;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        r2.setText(r1);	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r1 = r9.T;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        if (r1 == 0) goto L_0x0027;
    L_0x0020:
        r1 = r9.ax;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r2 = r9.T;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r1.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x00f6 }
    L_0x0027:
        if (r0 == 0) goto L_0x00f1;
    L_0x0029:
        r1 = r9.bx;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        if (r1 != 0) goto L_0x00f1;
    L_0x002d:
        r1 = r9.aI;
        r1 = r1.d();
        r2 = android.text.TextUtils.isEmpty(r1);
        if (r2 != 0) goto L_0x00d8;
    L_0x0039:
        r2 = r9.bp;
        r2.setVisibility(r3);
        r2 = r9.aI;
        r2 = r2.e();
        if (r2 == 0) goto L_0x00bd;
    L_0x0046:
        r3 = r9.C;
        r3 = r3.getWidth();
        if (r3 == 0) goto L_0x00bb;
    L_0x004e:
        r4 = r9.ax;	 Catch:{ ActivityNotFoundException -> 0x00fa }
        r4 = r4.getPaint();	 Catch:{ ActivityNotFoundException -> 0x00fa }
        r4 = r4.measureText(r1);	 Catch:{ ActivityNotFoundException -> 0x00fa }
        r5 = r9.C;	 Catch:{ ActivityNotFoundException -> 0x00fa }
        r5 = r5.getPaddingLeft();	 Catch:{ ActivityNotFoundException -> 0x00fa }
        r3 = r3 - r5;
        r5 = r9.C;	 Catch:{ ActivityNotFoundException -> 0x00fa }
        r5 = r5.getPaddingRight();	 Catch:{ ActivityNotFoundException -> 0x00fa }
        r3 = r3 - r5;
        r3 = (float) r3;
        r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
        if (r3 < 0) goto L_0x00a2;
    L_0x006b:
        r3 = r9.E;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        if (r3 != 0) goto L_0x009b;
    L_0x006f:
        r3 = r9.a3;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r4 = r9.aI;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r5 = 2131230988; // 0x7f08010c float:1.8078044E38 double:1.0529680145E-314;
        r6 = 0;
        r6 = new java.lang.Object[r6];	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r4 = r4.a(r9, r5, r6);	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r3.setText(r4);	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r3 = r9.a3;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r4 = 0;
        r3.setVisibility(r4);	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r3 = new com.whatsapp.a9t;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r4 = 0;
        r3.<init>(r9, r4);	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r9.E = r3;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r3 = com.whatsapp.App.p;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r3 = r3.M();	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r4 = r9.E;	 Catch:{ ActivityNotFoundException -> 0x00fc }
        r6 = 1500; // 0x5dc float:2.102E-42 double:7.41E-321;
        r3.postDelayed(r4, r6);	 Catch:{ ActivityNotFoundException -> 0x00fc }
    L_0x009b:
        r3 = r9.ax;	 Catch:{ ActivityNotFoundException -> 0x00fe }
        r3.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x00fe }
        if (r0 == 0) goto L_0x00bb;
    L_0x00a2:
        r2 = r9.E;	 Catch:{ ActivityNotFoundException -> 0x0100 }
        if (r2 == 0) goto L_0x00b1;
    L_0x00a6:
        r2 = com.whatsapp.App.p;	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r2 = r2.M();	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r3 = r9.E;	 Catch:{ ActivityNotFoundException -> 0x0100 }
        r2.removeCallbacks(r3);	 Catch:{ ActivityNotFoundException -> 0x0100 }
    L_0x00b1:
        r2 = r9.a3;
        r2.setVisibility(r8);
        r2 = r9.ax;
        r2.setText(r1);
    L_0x00bb:
        if (r0 == 0) goto L_0x00d6;
    L_0x00bd:
        r2 = r9.E;	 Catch:{ ActivityNotFoundException -> 0x0102 }
        if (r2 == 0) goto L_0x00cc;
    L_0x00c1:
        r2 = com.whatsapp.App.p;	 Catch:{ ActivityNotFoundException -> 0x0102 }
        r2 = r2.M();	 Catch:{ ActivityNotFoundException -> 0x0102 }
        r3 = r9.E;	 Catch:{ ActivityNotFoundException -> 0x0102 }
        r2.removeCallbacks(r3);	 Catch:{ ActivityNotFoundException -> 0x0102 }
    L_0x00cc:
        r2 = r9.a3;
        r2.setVisibility(r8);
        r2 = r9.ax;
        r2.setText(r1);
    L_0x00d6:
        if (r0 == 0) goto L_0x00f1;
    L_0x00d8:
        r0 = r9.E;	 Catch:{ ActivityNotFoundException -> 0x0104 }
        if (r0 == 0) goto L_0x00e7;
    L_0x00dc:
        r0 = com.whatsapp.App.p;	 Catch:{ ActivityNotFoundException -> 0x0104 }
        r0 = r0.M();	 Catch:{ ActivityNotFoundException -> 0x0104 }
        r1 = r9.E;	 Catch:{ ActivityNotFoundException -> 0x0104 }
        r0.removeCallbacks(r1);	 Catch:{ ActivityNotFoundException -> 0x0104 }
    L_0x00e7:
        r0 = r9.a3;
        r0.setVisibility(r8);
        r0 = r9.bp;
        r0.setVisibility(r8);
    L_0x00f1:
        return;
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;
    L_0x00f8:
        r0 = move-exception;
        throw r0;
    L_0x00fa:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00fc }
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0100 }
    L_0x0100:
        r0 = move-exception;
        throw r0;
    L_0x0102:
        r0 = move-exception;
        throw r0;
    L_0x0104:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.o():void");
    }

    static void U(Conversation conversation) {
        conversation.z();
    }

    private void a(Uri uri) {
        if (uri != null) {
            Intent intent = new Intent(this, ImagePreview.class);
            intent.putExtra(cb[8], this.aI.p);
            intent.putExtra(cb[5], 0);
            Serializable arrayList = new ArrayList();
            try {
                arrayList.add(uri);
                intent.putExtra(cb[6], arrayList);
                startActivityForResult(intent, 22);
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        Log.e(cb[7]);
        App.a(getBaseContext(), 2131232022, 0);
    }

    static boolean ay(Conversation conversation) {
        return conversation.bx;
    }

    private boolean Q() {
        Cursor cursor = this.bd.getCursor();
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    do {
                        co a = App.aK.a(cursor, this.ae);
                        if (a.k.a) {
                            try {
                                if (a.d != 6) {
                                }
                            } catch (ActivityNotFoundException e) {
                                throw e;
                            }
                        }
                        return false;
                    } while (cursor.moveToNext());
                }
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        }
        return true;
    }

    static ImageButton s(Conversation conversation) {
        return conversation.aZ;
    }

    private void a(Drawable drawable) {
        if (drawable != null) {
            try {
                this.aE.setDrawable(drawable);
                this.bw.setBackgroundResource(0);
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        this.aE.a();
        this.bw.setBackgroundResource(2131623988);
    }

    private void m(String str) {
        try {
            startActivity(new Intent(cb[83], Uri.parse(cb[84] + str)));
        } catch (ActivityNotFoundException e) {
            App.a((Context) this, 2131230782, 0);
        }
    }

    public void a(pi piVar) {
        boolean z = DialogToastActivity.f;
        if (piVar != null) {
            try {
                if (TextUtils.equals(this.ay, piVar.b)) {
                    if (piVar.d()) {
                        try {
                            String str;
                            this.a0 = piVar;
                            N();
                            View view = this.bj;
                            String str2 = piVar.j;
                            String str3 = piVar.c;
                            if (TextUtils.isEmpty(piVar.n)) {
                                str = piVar.b;
                            } else {
                                str = piVar.n;
                            }
                            try {
                                ConversationRowText.a(view, str2, str3, str, piVar.f, null, null);
                                if (!z) {
                                    return;
                                }
                            } catch (ActivityNotFoundException e) {
                                throw e;
                            } catch (ActivityNotFoundException e2) {
                                throw e2;
                            }
                        } catch (ActivityNotFoundException e22) {
                            throw e22;
                        }
                    }
                    this.a0 = null;
                    V();
                    if (!z) {
                        return;
                    }
                }
                return;
            } catch (ActivityNotFoundException e222) {
                throw e222;
            } catch (ActivityNotFoundException e2222) {
                throw e2222;
            }
        }
        this.a0 = null;
        V();
    }

    static int P(Conversation conversation) {
        return conversation.ab;
    }

    static ce ab(Conversation conversation) {
        return conversation.K;
    }

    public String b() {
        return this.aH;
    }

    static a9z t(Conversation conversation) {
        return conversation.a4;
    }

    private MenuItem a(Menu menu, int i, int i2, int i3) {
        MenuItem add = menu.add(0, i, 0, i2);
        add.setIcon(i3);
        return add;
    }

    static int a(Conversation conversation, int i) {
        conversation.aR = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r7) {
        /*
        r6 = this;
        r3 = 1;
        r2 = com.whatsapp.DialogToastActivity.f;
        super.onConfigurationChanged(r7);	 Catch:{ ActivityNotFoundException -> 0x007f }
        r0 = r6.aN;	 Catch:{ ActivityNotFoundException -> 0x007f }
        if (r0 == 0) goto L_0x001a;
    L_0x000a:
        r0 = r6.bc;	 Catch:{ ActivityNotFoundException -> 0x0081 }
        r1 = 2;
        r0.setTranscriptMode(r1);	 Catch:{ ActivityNotFoundException -> 0x0081 }
        r0 = r6.al;	 Catch:{ ActivityNotFoundException -> 0x0081 }
        r1 = 1;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.sendEmptyMessageDelayed(r1, r4);	 Catch:{ ActivityNotFoundException -> 0x0081 }
        if (r2 == 0) goto L_0x0021;
    L_0x001a:
        r0 = r6.bc;	 Catch:{ ActivityNotFoundException -> 0x0081 }
        r1 = r6.ab;	 Catch:{ ActivityNotFoundException -> 0x0081 }
        r0.setSelection(r1);	 Catch:{ ActivityNotFoundException -> 0x0081 }
    L_0x0021:
        r0 = r7.orientation;	 Catch:{ ActivityNotFoundException -> 0x0083 }
        if (r0 != r3) goto L_0x002e;
    L_0x0025:
        r0 = r6.ag;	 Catch:{ ActivityNotFoundException -> 0x0085 }
        r1 = r6.Z;	 Catch:{ ActivityNotFoundException -> 0x0085 }
        r0.a(r1);	 Catch:{ ActivityNotFoundException -> 0x0085 }
        if (r2 == 0) goto L_0x0034;
    L_0x002e:
        r0 = r6.Z;	 Catch:{ ActivityNotFoundException -> 0x0085 }
        r1 = 2;
        r0.setMaxLines(r1);	 Catch:{ ActivityNotFoundException -> 0x0085 }
    L_0x0034:
        r0 = r6.aM;
        r0 = r0.isShowing();
        if (r0 == 0) goto L_0x007e;
    L_0x003c:
        r0 = r6.aM;
        r0.a(r7);
        r0 = r6.aM;
        r0 = r0.b();
        r1 = r6.getWindowManager();
        r1 = r1.getDefaultDisplay();
        r1 = r1.getHeight();
        r1 = r1 * 2;
        r1 = r1 / 5;
        if (r0 != 0) goto L_0x005c;
    L_0x0059:
        if (r2 == 0) goto L_0x0060;
    L_0x005b:
        r0 = r1;
    L_0x005c:
        r1 = java.lang.Math.min(r0, r1);
    L_0x0060:
        r0 = r6.getResources();
        r2 = 2131427483; // 0x7f0b009b float:1.8476584E38 double:1.053065096E-314;
        r0 = r0.getDimensionPixelSize(r2);
        r0 = r0 * 4;
        r0 = java.lang.Math.max(r1, r0);
        r1 = r6.bw;
        r2 = r6.bw;
        r2 = r2.getHeight();
        r0 = r2 - r0;
        r1.setFreezeHeight(r0);
    L_0x007e:
        return;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onConfigurationChanged(android.content.res.Configuration):void");
    }

    static boolean a(Conversation conversation) {
        return conversation.bi;
    }

    static void e(Conversation conversation, String str) {
        conversation.m(str);
    }

    public static void l() {
        z = true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            try {
                if (this.aM.isShowing()) {
                    this.aM.a(false);
                    this.aM.dismiss();
                    return false;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        r9 = 3;
        r8 = 21;
        r1 = 1;
        r2 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r3 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r0 = r0[r3];	 Catch:{ ActivityNotFoundException -> 0x00cc }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0 = r10.getApplicationContext();	 Catch:{ ActivityNotFoundException -> 0x00cc }
        com.whatsapp.App.w(r0);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r3 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r0 = r0[r3];	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0 = com.whatsapp.tp.a(r0);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r10.K = r0;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0 = r10.K;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r6 = r10.ao;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0.b(r6);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0 = r10.K;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r3 = com.whatsapp.t4.PRE_CREATE;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r6 = r10.ao;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0.a(r3, r6);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0 = r10.K;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r3 = com.whatsapp.t4.PRE_CREATE;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0.a(r3);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0 = r10.K;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r3 = com.whatsapp.t4.ON_CREATE;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r0.b(r3);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r3 = r10.K;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r5 = com.whatsapp.tb.FROM_SAVED_STATE;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        if (r11 == 0) goto L_0x00ce;
    L_0x0047:
        r0 = r1;
    L_0x0048:
        r3.a(r5, r0);
        r0 = r10.K;
        r3 = com.whatsapp.tb.FIRST_INIT;
        r5 = bm;
        r0.a(r3, r5);
        bm = r2;
        r5 = new com.whatsapp.util.ab;
        r0 = cb;
        r3 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r0 = r0[r3];
        r5.<init>(r0);
        r0 = com.whatsapp.App.j;	 Catch:{ ActivityNotFoundException -> 0x00d1 }
        if (r0 != r9) goto L_0x0068;
    L_0x0065:
        com.whatsapp.util.u.a(r10);	 Catch:{ ActivityNotFoundException -> 0x00d1 }
    L_0x0068:
        r0 = r10.getWindow();	 Catch:{ ActivityNotFoundException -> 0x00d3 }
        r3 = 13;
        r0.requestFeature(r3);	 Catch:{ ActivityNotFoundException -> 0x00d3 }
        r0 = r10.getWindow();	 Catch:{ ActivityNotFoundException -> 0x00d3 }
        r3 = 12;
        r0.requestFeature(r3);	 Catch:{ ActivityNotFoundException -> 0x00d3 }
        r0 = r10.getWindow();	 Catch:{ ActivityNotFoundException -> 0x00d3 }
        r3 = new android.graphics.drawable.ColorDrawable;	 Catch:{ ActivityNotFoundException -> 0x00d3 }
        r6 = 0;
        r3.<init>(r6);	 Catch:{ ActivityNotFoundException -> 0x00d3 }
        r0.setBackgroundDrawable(r3);	 Catch:{ ActivityNotFoundException -> 0x00d3 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x00d3 }
        if (r0 < r8) goto L_0x0094;
    L_0x008b:
        r0 = r10.getWindow();	 Catch:{ ActivityNotFoundException -> 0x00d3 }
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0.addFlags(r3);	 Catch:{ ActivityNotFoundException -> 0x00d3 }
    L_0x0094:
        super.onCreate(r11);	 Catch:{ ActivityNotFoundException -> 0x00d5 }
        r10.h();	 Catch:{ ActivityNotFoundException -> 0x00d5 }
        r0 = r10.getSupportActionBar();	 Catch:{ ActivityNotFoundException -> 0x00d5 }
        r3 = r10.getResources();	 Catch:{ ActivityNotFoundException -> 0x00d5 }
        r6 = 2131427411; // 0x7f0b0053 float:1.8476437E38 double:1.0530650604E-314;
        r3 = r3.getDimension(r6);	 Catch:{ ActivityNotFoundException -> 0x00d5 }
        r0.setElevation(r3);	 Catch:{ ActivityNotFoundException -> 0x00d5 }
        if (r11 == 0) goto L_0x00d7;
    L_0x00ae:
        r0 = r1;
    L_0x00af:
        r10.az = r0;	 Catch:{ ActivityNotFoundException -> 0x00d9 }
        r0 = r10.az;	 Catch:{ ActivityNotFoundException -> 0x00d9 }
        if (r0 != 0) goto L_0x00b8;
    L_0x00b5:
        com.whatsapp.ConversationRowAudio.a();	 Catch:{ ActivityNotFoundException -> 0x00d9 }
    L_0x00b8:
        r0 = 0;
        r0 = com.whatsapp.util.WhatsAppLibLoader.a(r0);	 Catch:{ ActivityNotFoundException -> 0x00db }
        if (r0 != 0) goto L_0x00dd;
    L_0x00bf:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x00db }
        r1 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x00db }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x00db }
        r10.finish();	 Catch:{ ActivityNotFoundException -> 0x00db }
    L_0x00cb:
        return;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = r2;
        goto L_0x0048;
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = r2;
        goto L_0x00af;
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        r0 = com.whatsapp.App.ay;	 Catch:{ ActivityNotFoundException -> 0x010f }
        if (r0 == 0) goto L_0x00ef;
    L_0x00e1:
        r0 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x0111 }
        r0 = r0.E();	 Catch:{ ActivityNotFoundException -> 0x0111 }
        if (r0 == 0) goto L_0x00ef;
    L_0x00e9:
        r0 = com.whatsapp.App.t(r10);	 Catch:{ ActivityNotFoundException -> 0x0111 }
        if (r0 == r9) goto L_0x0113;
    L_0x00ef:
        r0 = cb;
        r1 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = cb;
        r1 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r10, r1);
        r10.startActivity(r0);
        r10.finish();
        goto L_0x00cb;
    L_0x010f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0111 }
    L_0x0111:
        r0 = move-exception;
        throw r0;
    L_0x0113:
        r0 = r10.getIntent();
        r3 = cb;
        r6 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r3 = r3[r6];
        r0 = r0.getStringExtra(r3);
        r3 = android.text.TextUtils.isEmpty(r0);	 Catch:{ ActivityNotFoundException -> 0x01b6 }
        if (r3 == 0) goto L_0x0154;
    L_0x0127:
        r3 = r10.getIntent();	 Catch:{ ActivityNotFoundException -> 0x01b6 }
        r3 = r3.getData();	 Catch:{ ActivityNotFoundException -> 0x01b6 }
        r3 = com.whatsapp.contact.ContactProvider.a(r3);	 Catch:{ ActivityNotFoundException -> 0x01b6 }
        if (r3 == 0) goto L_0x0154;
    L_0x0135:
        r3 = com.whatsapp.App.as;
        r6 = r10.getIntent();
        r6 = r6.getData();
        r3 = r3.a(r6);
        if (r3 == 0) goto L_0x0154;
    L_0x0145:
        r0 = r3.p;
        r3 = r10.getIntent();
        r6 = cb;
        r7 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r6 = r6[r7];
        r3.putExtra(r6, r0);
    L_0x0154:
        r3 = android.text.TextUtils.isEmpty(r0);
        if (r3 != 0) goto L_0x01c0;
    L_0x015a:
        r3 = com.whatsapp.App.as;
        r0 = r3.b(r0);
        if (r0 == 0) goto L_0x0172;
    L_0x0162:
        r3 = r0.c();	 Catch:{ ActivityNotFoundException -> 0x01b8 }
        if (r3 != 0) goto L_0x016e;
    L_0x0168:
        r3 = r0.A();	 Catch:{ ActivityNotFoundException -> 0x01ba }
        if (r3 == 0) goto L_0x01c0;
    L_0x016e:
        r3 = r0.q;	 Catch:{ ActivityNotFoundException -> 0x01bc }
        if (r3 != 0) goto L_0x01c0;
    L_0x0172:
        if (r0 == 0) goto L_0x0179;
    L_0x0174:
        r3 = 0;
        r6 = 1;
        com.whatsapp.App.a(r0, r3, r6);	 Catch:{ ActivityNotFoundException -> 0x01be }
    L_0x0179:
        r0 = r10.getIntent();
        r3 = cb;
        r6 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r3 = r3[r6];
        r0 = r0.getStringExtra(r3);
        if (r0 == 0) goto L_0x01c0;
    L_0x0189:
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r1 = 2131231325; // 0x7f08025d float:1.8078728E38 double:1.052968181E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r3 = 0;
        r2[r3] = r0;	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r0 = r10.getString(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r1 = 1;
        com.whatsapp.App.b(r10, r0, r1);	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r1 = com.whatsapp.Main.e();	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r0.<init>(r10, r1);	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r10.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r10.finish();	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        goto L_0x00cb;
    L_0x01b4:
        r0 = move-exception;
        throw r0;
    L_0x01b6:
        r0 = move-exception;
        throw r0;
    L_0x01b8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01ba }
    L_0x01ba:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01bc }
    L_0x01bc:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01be }
    L_0x01be:
        r0 = move-exception;
        throw r0;
    L_0x01c0:
        r0 = r10.getIntent();	 Catch:{ ActivityNotFoundException -> 0x0393 }
        r3 = cb;	 Catch:{ ActivityNotFoundException -> 0x0393 }
        r6 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r3 = r3[r6];	 Catch:{ ActivityNotFoundException -> 0x0393 }
        r6 = 0;
        r0 = r0.getBooleanExtra(r3, r6);	 Catch:{ ActivityNotFoundException -> 0x0393 }
        if (r0 == 0) goto L_0x01d8;
    L_0x01d1:
        r0 = com.whatsapp.notification.aw.a();	 Catch:{ ActivityNotFoundException -> 0x0393 }
        r0.b();	 Catch:{ ActivityNotFoundException -> 0x0393 }
    L_0x01d8:
        r10.a2 = r1;
        r0 = r10.K;
        r3 = com.whatsapp.t4.INFLATE;
        r0.b(r3);
        r0 = 2130903111; // 0x7f030047 float:1.741303E38 double:1.052806022E-314;
        r10.setContentView(r0);
        r0 = r10.K;
        r3 = com.whatsapp.t4.INFLATE;
        r0.a(r3);
        r0 = r10.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r2);
        r0 = 2131755438; // 0x7f1001ae float:1.9141755E38 double:1.0532271273E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r0.setContentInsetsAbsolute(r2, r2);
        r0 = 2131755487; // 0x7f1001df float:1.9141855E38 double:1.0532271515E-314;
        r0 = r10.findViewById(r0);
        r10.bn = r0;
        r0 = r10.bn;
        r3 = new com.whatsapp.axl;
        r3.<init>(r10);
        r0.setOnClickListener(r3);
        r0 = 2131755488; // 0x7f1001e0 float:1.9141857E38 double:1.053227152E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.aA = r0;
        r0 = 2131755478; // 0x7f1001d6 float:1.9141836E38 double:1.053227147E-314;
        r0 = r10.findViewById(r0);
        r0 = (com.whatsapp.ConversationContentLayout) r0;
        r10.bw = r0;
        r0 = 2131755502; // 0x7f1001ee float:1.9141885E38 double:1.053227159E-314;
        r0 = r10.findViewById(r0);
        r10.bs = r0;
        r0 = com.whatsapp.a4d.a();
        r10.ag = r0;
        r0 = 2131755482; // 0x7f1001da float:1.9141845E38 double:1.053227149E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.a7 = r0;
        r0 = 2131755506; // 0x7f1001f2 float:1.9141893E38 double:1.053227161E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r10.aB = r0;
        r0 = r10.aq;
        if (r0 == 0) goto L_0x0259;
    L_0x0253:
        r0 = com.whatsapp.wallpaper.k.g(r10);
        if (r4 == 0) goto L_0x0581;
    L_0x0259:
        r0 = r10.aI;
        r0 = r0.p;
        r0 = com.whatsapp.wallpaper.k.a(r10, r0);
        r3 = r0;
    L_0x0262:
        r0 = 2131755480; // 0x7f1001d8 float:1.914184E38 double:1.053227148E-314;
        r0 = r10.findViewById(r0);
        r0 = (com.whatsapp.wallpaper.WallPaperView) r0;
        r10.aE = r0;
        r0 = r10.aE;
        r6 = new com.whatsapp.pf;
        r6.<init>(r10);
        r0.setOnSizeChangedListener(r6);
        r10.a(r3);
        r0 = cb;
        r3 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r0 = r0[r3];
        r3 = com.whatsapp.App.z();
        r0 = r3.getSharedPreferences(r0, r2);
        r3 = cb;
        r6 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r3 = r3[r6];
        r3 = r0.getBoolean(r3, r1);
        G = r3;
        r3 = cb;
        r6 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r3 = r3[r6];
        r0 = r0.getBoolean(r3, r1);
        bz = r0;
        r0 = r10.a();
        r10.bc = r0;
        r0 = r10.bc;
        r0.setDividerHeight(r2);
        r0 = 2131755509; // 0x7f1001f5 float:1.91419E38 double:1.0532271623E-314;
        r0 = r10.findViewById(r0);
        r0 = (com.whatsapp.ConversationTextEntry) r0;
        r10.Z = r0;
        r0 = r10.Z;
        r3 = 2131232168; // 0x7f0805a8 float:1.8080438E38 double:1.0529685975E-314;
        r3 = r10.getString(r3);
        r0.setHint(r3);
        r0 = 2131755512; // 0x7f1001f8 float:1.9141905E38 double:1.053227164E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r10.aZ = r0;
        r0 = r10.aZ;
        r3 = new com.whatsapp.util.bz;
        r6 = r10.getResources();
        r7 = 2130839610; // 0x7f02083a float:1.7284235E38 double:1.052774648E-314;
        r6 = r6.getDrawable(r7);
        r3.<init>(r6);
        r0.setImageDrawable(r3);
        r0 = 2131755505; // 0x7f1001f1 float:1.9141891E38 double:1.0532271604E-314;
        r0 = r10.findViewById(r0);
        r3 = new com.whatsapp.util.bz;
        r6 = r10.getResources();
        r7 = 2130839596; // 0x7f02082c float:1.7284207E38 double:1.052774641E-314;
        r6 = r6.getDrawable(r7);
        r3.<init>(r6);
        r0.setBackgroundDrawable(r3);
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r8) goto L_0x030a;
    L_0x0300:
        r0 = new com.whatsapp.wp;
        r0.<init>(r10);
        r3 = r10.aZ;
        r3.setOutlineProvider(r0);
    L_0x030a:
        r0 = 2131755508; // 0x7f1001f4 float:1.9141897E38 double:1.053227162E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r10.a_ = r0;
        r0 = 2131755513; // 0x7f1001f9 float:1.9141907E38 double:1.0532271643E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r10.F = r0;
        r0 = r10.F;
        r3 = new com.whatsapp.an;
        r3.<init>(r10);
        r0.setOnTouchListener(r3);
        r0 = 2131755510; // 0x7f1001f6 float:1.9141901E38 double:1.053227163E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r10.am = r0;
        r0 = r10.am;
        r3 = new com.whatsapp.aq5;
        r3.<init>(r10);
        r0.setOnClickListener(r3);
        r0 = r10.am;
        r3 = new com.whatsapp.gu;
        r3.<init>(r10);
        r0.setOnLongClickListener(r3);
        r0 = r10.getBaseContext();
        r3 = cb;
        r6 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r3 = r3[r6];
        r0 = r0.getSystemService(r3);
        r0 = (android.view.LayoutInflater) r0;
        r3 = 2130903117; // 0x7f03004d float:1.7413043E38 double:1.0528060247E-314;
        r6 = r10.bc;	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r7 = 0;
        r0 = com.whatsapp.aam.a(r0, r3, r6, r7);	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r10.bl = r0;	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r0 = r10.bc;	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r3 = r10.bl;	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r0.addHeaderView(r3);	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r0 = r10.bl;	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r3 = 2131755519; // 0x7f1001ff float:1.914192E38 double:1.0532271673E-314;
        r0 = r0.findViewById(r3);	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r3 = new com.whatsapp.we;	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r3.<init>(r10);	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r0.setOnClickListener(r3);	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r0 = r10.W();	 Catch:{ ActivityNotFoundException -> 0x0391 }
        if (r0 != 0) goto L_0x0395;
    L_0x0383:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x0391 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ActivityNotFoundException -> 0x0391 }
        r10.finish();	 Catch:{ ActivityNotFoundException -> 0x0391 }
        goto L_0x00cb;
    L_0x0391:
        r0 = move-exception;
        throw r0;
    L_0x0393:
        r0 = move-exception;
        throw r0;
    L_0x0395:
        r0 = r10.bc;
        r0.setScrollbarFadingEnabled(r1);
        r0 = r10.bc;
        r3 = r10.Q;
        r0.setOnScrollListener(r3);
        r0 = r10.bc;
        r3 = new com.whatsapp.wk;
        r3.<init>(r10);
        r0.setOnTouchListener(r3);
        r0 = r10.bc;
        r10.registerForContextMenu(r0);
        r0 = r10.Z;
        r0.setScrollbarFadingEnabled(r1);
        r0 = r10.Z;
        r3 = r10.V;
        r0.addTextChangedListener(r3);
        r0 = r10.Z;
        r3 = r10.M;
        r0.addTextChangedListener(r3);
        r0 = r10.Z;
        r3 = r10.aJ;
        r0.setOnEditorActionListener(r3);
        r0 = r10.Z;
        r3 = r10.bA;
        r0.setOnClickListener(r3);
        r0 = r10.Z;
        r3 = G;
        r0.setInputEnterSend(r3);
        r0 = r10.Z;
        com.whatsapp.aam.a(r0);
        r0 = r10.Z;
        r3 = new com.whatsapp.aqr;
        r3.<init>(r10);
        r0.setOnKeyListener(r3);
        r0 = r10.aZ;
        r3 = new com.whatsapp.ek;
        r3.<init>(r10);
        r0.setOnClickListener(r3);
        r0 = r10.Z;
        r0 = r0.getText();
        r0 = r0.toString();
        r3 = r10.aZ;	 Catch:{ ActivityNotFoundException -> 0x0566 }
        r0 = n(r0);	 Catch:{ ActivityNotFoundException -> 0x0566 }
        if (r0 != 0) goto L_0x0568;
    L_0x0403:
        r3.setEnabled(r1);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0 = r10.a_;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r1 = new com.whatsapp.aii;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r1.<init>(r10);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0 = new com.whatsapp.pz;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0.<init>(r10);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r10.aM = r0;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0 = r10.aM;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r1 = r10.bk;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0.a(r1);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0 = r10.aM;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r1 = new com.whatsapp.am8;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r1.<init>(r10);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0.setOnDismissListener(r1);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0 = r10.ag;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r1 = r10.Z;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0.a(r1);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0 = 2131755485; // 0x7f1001dd float:1.914185E38 double:1.0532271505E-314;
        r0 = r10.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r10.an = r0;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0 = r10.an;	 Catch:{ ActivityNotFoundException -> 0x056b }
        if (r0 == 0) goto L_0x044d;
    L_0x043c:
        r0 = r10.an;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0 = r10.an;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r1 = new com.whatsapp.a5b;	 Catch:{ ActivityNotFoundException -> 0x056b }
        r1.<init>(r10);	 Catch:{ ActivityNotFoundException -> 0x056b }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x056b }
    L_0x044d:
        r0 = 2131755484; // 0x7f1001dc float:1.9141849E38 double:1.05322715E-314;
        r0 = r10.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x056d }
        r10.bq = r0;	 Catch:{ ActivityNotFoundException -> 0x056d }
        r0 = r10.bq;	 Catch:{ ActivityNotFoundException -> 0x056d }
        if (r0 == 0) goto L_0x046b;
    L_0x045a:
        r0 = r10.bq;	 Catch:{ ActivityNotFoundException -> 0x056d }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x056d }
        r0 = r10.bq;	 Catch:{ ActivityNotFoundException -> 0x056d }
        r1 = new com.whatsapp._c;	 Catch:{ ActivityNotFoundException -> 0x056d }
        r1.<init>(r10);	 Catch:{ ActivityNotFoundException -> 0x056d }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x056d }
    L_0x046b:
        com.whatsapp.App.b(r10);	 Catch:{ ActivityNotFoundException -> 0x056f }
        com.whatsapp.App.b(r10);	 Catch:{ ActivityNotFoundException -> 0x056f }
        r0 = com.whatsapp.App.U();	 Catch:{ ActivityNotFoundException -> 0x056f }
        if (r0 == 0) goto L_0x048a;
    L_0x0477:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x0571 }
        r1 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x0571 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x0571 }
        r0 = new com.whatsapp.DialogToastActivity$UnsupportedDeviceDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x0571 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x0571 }
        r10.b(r0);	 Catch:{ ActivityNotFoundException -> 0x0571 }
        if (r4 == 0) goto L_0x04c8;
    L_0x048a:
        r0 = com.whatsapp.App.p;	 Catch:{ ActivityNotFoundException -> 0x0573 }
        r0 = r0.F();	 Catch:{ ActivityNotFoundException -> 0x0573 }
        if (r0 == 0) goto L_0x04a0;
    L_0x0492:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x0575 }
        r1 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x0575 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x0575 }
        r10.d();	 Catch:{ ActivityNotFoundException -> 0x0575 }
        if (r4 == 0) goto L_0x04c8;
    L_0x04a0:
        r0 = com.whatsapp.App.a4();	 Catch:{ ActivityNotFoundException -> 0x0577 }
        if (r0 == 0) goto L_0x04b4;
    L_0x04a6:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x0579 }
        r1 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x0579 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x0579 }
        r10.f();	 Catch:{ ActivityNotFoundException -> 0x0579 }
        if (r4 == 0) goto L_0x04c8;
    L_0x04b4:
        r0 = com.whatsapp.App.aC();	 Catch:{ ActivityNotFoundException -> 0x057b }
        if (r0 == 0) goto L_0x04c8;
    L_0x04ba:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x057b }
        r1 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x057b }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x057b }
        r0 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r10.showDialog(r0);	 Catch:{ ActivityNotFoundException -> 0x057b }
    L_0x04c8:
        if (r11 == 0) goto L_0x0506;
    L_0x04ca:
        r0 = cb;
        r1 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r0 = r0[r1];
        r0 = r11.getParcelableArrayList(r0);
        if (r0 == 0) goto L_0x0506;
    L_0x04d6:
        r1 = new java.util.HashMap;
        r1.<init>();
        r10.u = r1;
        r1 = r0.iterator();
    L_0x04e1:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0500;
    L_0x04e7:
        r0 = r1.next();
        r0 = (android.os.Parcelable) r0;
        r0 = (com.whatsapp.a4p) r0;
        r2 = r10.u;
        r3 = r0.a;
        r6 = com.whatsapp.App.aK;
        r0 = r0.a;
        r0 = r6.a(r0);
        r2.put(r3, r0);
        if (r4 == 0) goto L_0x04e1;
    L_0x0500:
        r10.g();
        r10.i();
    L_0x0506:
        r5.b();	 Catch:{ ActivityNotFoundException -> 0x057d }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x057d }
        r1 = 23;
        if (r0 >= r1) goto L_0x0521;
    L_0x050f:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x057f }
        if (r0 != r8) goto L_0x054f;
    L_0x0513:
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x057f }
        r1 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x057f }
        r1 = android.os.Build.MANUFACTURER;	 Catch:{ ActivityNotFoundException -> 0x057f }
        r0 = r0.equalsIgnoreCase(r1);	 Catch:{ ActivityNotFoundException -> 0x057f }
        if (r0 == 0) goto L_0x054f;
    L_0x0521:
        r0 = cb;
        r1 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r0 = r0[r1];
        r0 = r10.getSystemService(r0);
        r0 = (android.app.KeyguardManager) r0;
        r0 = r0.isKeyguardLocked();
        if (r0 == 0) goto L_0x054f;
    L_0x0533:
        r0 = cb;
        r1 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = new com.whatsapp.Conversation$60;
        r0.<init>(r10);
        r1 = new android.content.IntentFilter;
        r2 = cb;
        r3 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r2 = r2[r3];
        r1.<init>(r2);
        r10.registerReceiver(r0, r1);
    L_0x054f:
        r0 = r10.bw;
        r10.b(r0);
        r0 = r10.a();
        r1 = r10.K;
        com.whatsapp.a2c.b(r0, r1);
        r0 = r10.K;
        r1 = com.whatsapp.t4.ON_CREATE;
        r0.a(r1);
        goto L_0x00cb;
    L_0x0566:
        r0 = move-exception;
        throw r0;
    L_0x0568:
        r1 = r2;
        goto L_0x0403;
    L_0x056b:
        r0 = move-exception;
        throw r0;
    L_0x056d:
        r0 = move-exception;
        throw r0;
    L_0x056f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0571 }
    L_0x0571:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0573 }
    L_0x0573:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0575 }
    L_0x0575:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0577 }
    L_0x0577:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0579 }
    L_0x0579:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x057b }
    L_0x057b:
        r0 = move-exception;
        throw r0;
    L_0x057d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x057f }
    L_0x057f:
        r0 = move-exception;
        throw r0;
    L_0x0581:
        r3 = r0;
        goto L_0x0262;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onCreate(android.os.Bundle):void");
    }

    private void q() {
        try {
            if (aup.a(this.aI.p)) {
                showDialog(arj.Theme_ratingBarStyle);
                return;
            }
            this.O = null;
            this.aB.setVisibility(8);
            String trim = new StringBuilder(this.Z.getText()).toString().trim();
            if (trim.length() > 0) {
                App.a(this.aI, a28.a(trim), this.a0);
                this.Z.removeTextChangedListener(this.M);
                try {
                    this.Z.setText("");
                    TextKeyListener.clear(this.Z.getText());
                    u();
                    this.bc.setFastScrollEnabled(false);
                } finally {
                    this.Z.addTextChangedListener(this.M);
                }
            }
            try {
                this.a0 = null;
                if (!this.I.isFullscreenMode()) {
                    if ((this.Z.getHeight() + this.bc.getHeight()) * 4 < getWindow().getDecorView().getHeight()) {
                        try {
                            if (getResources().getConfiguration().orientation != 2) {
                                return;
                            }
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    } else {
                        return;
                    }
                }
                try {
                    I();
                    if (this.aM.isShowing()) {
                        this.aM.dismiss();
                    }
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            } catch (ActivityNotFoundException e22) {
                throw e22;
            } catch (ActivityNotFoundException e222) {
                throw e222;
            }
        } catch (ActivityNotFoundException e2222) {
            throw e2222;
        }
    }

    static pi a(Conversation conversation, pi piVar) {
        conversation.a0 = piVar;
        return piVar;
    }

    static TextView ao(Conversation conversation) {
        return conversation.a3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onStart() {
        /*
        r12 = this;
        r4 = 0;
        r10 = 90;
        r6 = 1;
        r7 = 0;
        r8 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.K;
        r1 = com.whatsapp.t4.ON_START;
        r0.b(r1);
        r9 = new com.whatsapp.util.ab;
        r0 = cb;
        r1 = 88;
        r0 = r0[r1];
        r9.<init>(r0);
        super.onStart();
        r0 = cb;
        r0 = r0[r10];
        r1 = com.whatsapp.App.z();
        r0 = r1.getSharedPreferences(r0, r7);
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x02b5 }
        r2 = 92;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x02b5 }
        r2 = "0";
        r0 = r0.getString(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x02b5 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ ActivityNotFoundException -> 0x02b5 }
        com.whatsapp.preference.WaFontListPreference.b = r0;	 Catch:{ ActivityNotFoundException -> 0x02b5 }
        r0 = bh;	 Catch:{ ActivityNotFoundException -> 0x02b5 }
        if (r0 == 0) goto L_0x0043;
    L_0x0040:
        e(r12);	 Catch:{ ActivityNotFoundException -> 0x02b5 }
    L_0x0043:
        r0 = r12.ah;
        r0.clear();
        r0 = r12.aX;
        r0.clear();
        r0 = r12.getIntent();
        r1 = cb;
        r2 = 89;
        r1 = r1[r2];
        r2 = r0.getLongExtra(r1, r4);
        r1 = -1;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c7;
    L_0x0060:
        r0 = r12.getIntent();
        r1 = cb;
        r4 = 93;
        r1 = r1[r4];
        r0.putExtra(r1, r7);
        r0 = r12.getIntent();
        r1 = cb;
        r4 = 94;
        r1 = r1[r4];
        r0 = r0.getParcelableExtra(r1);
        r0 = (com.whatsapp.a4p) r0;
        if (r0 == 0) goto L_0x0083;
    L_0x007f:
        r0 = r0.a;	 Catch:{ ActivityNotFoundException -> 0x02b7 }
        r12.a9 = r0;	 Catch:{ ActivityNotFoundException -> 0x02b7 }
    L_0x0083:
        r0 = r12.getIntent();
        r1 = cb;
        r4 = 95;
        r1 = r1[r4];
        r0 = r0.getStringExtra(r1);
        r12.aH = r0;
        r0 = r12.aH;
        r0 = com.whatsapp.ael.h(r0);
        r12.ac = r0;
        r0 = r12.aH;
        r12.D = r0;
        r0 = com.whatsapp.App.aK;
        r1 = r12.ae;
        r4 = r12.a(r7);
        r5 = r12.aD;
        r1 = r0.a(r1, r2, r4, r5);
        r0 = r1.a;
        if (r0 != 0) goto L_0x00c1;
    L_0x00b1:
        r0 = com.whatsapp.App.aK;
        r2 = r12.ae;
        r3 = r12.a(r7);
        r4 = r12.aD;
        r0 = r0.a(r2, r3, r4);
        if (r8 == 0) goto L_0x00c3;
    L_0x00c1:
        r0 = r1.a;
    L_0x00c3:
        r1 = r1.b;
        if (r8 == 0) goto L_0x02fb;
    L_0x00c7:
        r0 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02b9 }
        r0 = r0.getCursor();	 Catch:{ ActivityNotFoundException -> 0x02b9 }
        if (r0 != 0) goto L_0x02bb;
    L_0x00cf:
        r0 = r6;
    L_0x00d0:
        if (r0 == 0) goto L_0x00e6;
    L_0x00d2:
        r2 = r12.af;	 Catch:{ ActivityNotFoundException -> 0x02be }
        if (r2 <= r10) goto L_0x00e6;
    L_0x00d6:
        r2 = com.whatsapp.App.aK;
        r3 = r12.ae;
        r4 = r12.af;
        r4 = r4 + 10;
        r5 = r12.aD;
        r2 = r2.a(r3, r4, r5);
        if (r8 == 0) goto L_0x02f6;
    L_0x00e6:
        r2 = com.whatsapp.App.aK;
        r3 = r12.ae;
        r4 = r12.a(r7);
        r5 = r12.aD;
        r2 = r2.a(r3, r4, r5);
        r11 = r2;
        r2 = r0;
        r0 = r11;
    L_0x00f7:
        r3 = 1;
        r12.bv = r3;	 Catch:{ ActivityNotFoundException -> 0x02c0 }
        r3 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02c0 }
        r3.changeCursor(r0);	 Catch:{ ActivityNotFoundException -> 0x02c0 }
        if (r2 == 0) goto L_0x02a1;
    L_0x0101:
        r0 = r12.ar;	 Catch:{ ActivityNotFoundException -> 0x02c2 }
        if (r0 == 0) goto L_0x0129;
    L_0x0105:
        r0 = r12.af;	 Catch:{ ActivityNotFoundException -> 0x02c4 }
        r2 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02c4 }
        r2 = r2.getCursor();	 Catch:{ ActivityNotFoundException -> 0x02c4 }
        r2 = r2.getCount();	 Catch:{ ActivityNotFoundException -> 0x02c4 }
        if (r0 == r2) goto L_0x0129;
    L_0x0113:
        r0 = r12.Q();	 Catch:{ ActivityNotFoundException -> 0x02c6 }
        if (r0 != 0) goto L_0x0129;
    L_0x0119:
        r0 = r12.af;	 Catch:{ ActivityNotFoundException -> 0x02c8 }
        r12.aa = r0;	 Catch:{ ActivityNotFoundException -> 0x02c8 }
        r0 = r12.aa;	 Catch:{ ActivityNotFoundException -> 0x02c8 }
        if (r0 <= 0) goto L_0x015f;
    L_0x0121:
        r12.p();	 Catch:{ ActivityNotFoundException -> 0x02ca }
        r0 = 1;
        r12.aU = r0;	 Catch:{ ActivityNotFoundException -> 0x02ca }
        if (r8 == 0) goto L_0x015f;
    L_0x0129:
        r0 = r12.af;	 Catch:{ ActivityNotFoundException -> 0x02cc }
        r2 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02cc }
        r2 = r2.getCursor();	 Catch:{ ActivityNotFoundException -> 0x02cc }
        r2 = r2.getCount();	 Catch:{ ActivityNotFoundException -> 0x02cc }
        if (r0 != r2) goto L_0x015f;
    L_0x0137:
        r0 = r12.af;	 Catch:{ ActivityNotFoundException -> 0x02ce }
        r2 = 100;
        if (r0 <= r2) goto L_0x015d;
    L_0x013d:
        r0 = r12.af;	 Catch:{ ActivityNotFoundException -> 0x02ce }
        r12.aF = r0;	 Catch:{ ActivityNotFoundException -> 0x02ce }
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x02ce }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x02ce }
        r2 = cb;	 Catch:{ ActivityNotFoundException -> 0x02ce }
        r3 = 91;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x02ce }
        r0 = r0.append(r2);	 Catch:{ ActivityNotFoundException -> 0x02ce }
        r2 = r12.aF;	 Catch:{ ActivityNotFoundException -> 0x02ce }
        r0 = r0.append(r2);	 Catch:{ ActivityNotFoundException -> 0x02ce }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x02ce }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x02ce }
    L_0x015d:
        r12.at = r6;
    L_0x015f:
        r0 = com.whatsapp.App.aK;
        r2 = r12.ae;
        r0 = r0.O(r2);
        if (r0 != 0) goto L_0x0183;
    L_0x0169:
        r0 = r12.bl;	 Catch:{ ActivityNotFoundException -> 0x02d0 }
        if (r0 == 0) goto L_0x0183;
    L_0x016d:
        r0 = r12.bl;	 Catch:{ ActivityNotFoundException -> 0x02d0 }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x02d0 }
        r0 = r12.bc;	 Catch:{ ActivityNotFoundException -> 0x02d0 }
        r2 = r12.bl;	 Catch:{ ActivityNotFoundException -> 0x02d0 }
        r0.removeHeaderView(r2);	 Catch:{ ActivityNotFoundException -> 0x02d0 }
        r0 = 0;
        r12.bl = r0;	 Catch:{ ActivityNotFoundException -> 0x02d0 }
        r0 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02d0 }
        r0.notifyDataSetChanged();	 Catch:{ ActivityNotFoundException -> 0x02d0 }
    L_0x0183:
        r0 = r12.bl;	 Catch:{ ActivityNotFoundException -> 0x02d2 }
        if (r0 != 0) goto L_0x019d;
    L_0x0187:
        r0 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x02d4 }
        r0 = r0.c();	 Catch:{ ActivityNotFoundException -> 0x02d4 }
        if (r0 != 0) goto L_0x019d;
    L_0x018f:
        r0 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x02d6 }
        r0 = r0.m();	 Catch:{ ActivityNotFoundException -> 0x02d6 }
        if (r0 != 0) goto L_0x019d;
    L_0x0197:
        r0 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x02d8 }
        r0 = r0.l;	 Catch:{ ActivityNotFoundException -> 0x02d8 }
        if (r0 == 0) goto L_0x01b2;
    L_0x019d:
        r0 = r12.by;	 Catch:{ ActivityNotFoundException -> 0x02da }
        if (r0 == 0) goto L_0x01c5;
    L_0x01a1:
        r0 = r12.bc;	 Catch:{ ActivityNotFoundException -> 0x02dc }
        r2 = r12.by;	 Catch:{ ActivityNotFoundException -> 0x02dc }
        r0.removeHeaderView(r2);	 Catch:{ ActivityNotFoundException -> 0x02dc }
        r0 = 0;
        r12.by = r0;	 Catch:{ ActivityNotFoundException -> 0x02dc }
        r0 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02dc }
        r0.notifyDataSetChanged();	 Catch:{ ActivityNotFoundException -> 0x02dc }
        if (r8 == 0) goto L_0x01c5;
    L_0x01b2:
        r0 = r12.by;	 Catch:{ ActivityNotFoundException -> 0x02de }
        if (r0 != 0) goto L_0x01c5;
    L_0x01b6:
        r12.G();	 Catch:{ ActivityNotFoundException -> 0x02de }
        r0 = r12.bc;	 Catch:{ ActivityNotFoundException -> 0x02de }
        r2 = r12.by;	 Catch:{ ActivityNotFoundException -> 0x02de }
        r0.addHeaderView(r2);	 Catch:{ ActivityNotFoundException -> 0x02de }
        r0 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02de }
        r0.notifyDataSetChanged();	 Catch:{ ActivityNotFoundException -> 0x02de }
    L_0x01c5:
        r12.n();	 Catch:{ ActivityNotFoundException -> 0x02e0 }
        r0 = r12.aP;	 Catch:{ ActivityNotFoundException -> 0x02e0 }
        if (r0 == 0) goto L_0x0207;
    L_0x01cc:
        r0 = r12.aI;	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r0 = r0.c();	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        if (r0 == 0) goto L_0x0207;
    L_0x01d4:
        r0 = r12.aP;	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r2 = 2131755498; // 0x7f1001ea float:1.9141877E38 double:1.053227157E-314;
        r0 = r0.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r0 = (android.widget.TextView) r0;	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r2 = 2131231832; // 0x7f080458 float:1.8079756E38 double:1.0529684315E-314;
        r0.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r0 = r12.aP;	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r2 = 2131755500; // 0x7f1001ec float:1.9141881E38 double:1.053227158E-314;
        r0 = r0.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r0 = (android.widget.TextView) r0;	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r2 = 2131231577; // 0x7f080359 float:1.8079239E38 double:1.0529683055E-314;
        r0.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r0 = r12.aP;	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r2 = 2131755330; // 0x7f100142 float:1.9141536E38 double:1.053227074E-314;
        r0 = r0.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r0 = (android.widget.TextView) r0;	 Catch:{ ActivityNotFoundException -> 0x02e2 }
        r2 = 2131231274; // 0x7f08022a float:1.8078624E38 double:1.052968156E-314;
        r0.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x02e2 }
    L_0x0207:
        if (r1 < 0) goto L_0x022f;
    L_0x0209:
        r0 = r12.bc;	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        r0.setSelection(r1);	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        r0 = 0;
        r12.aU = r0;	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        r0 = 0;
        r12.at = r0;	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        r0 = 0;
        r12.aw = r0;	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        r0 = r12.bc;	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        r0 = r0.getHeaderViewsCount();	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        r0 = r0 + r1;
        r12.X = r0;	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        r0 = r12.getResources();	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        r1 = 2131427329; // 0x7f0b0001 float:1.8476271E38 double:1.05306502E-314;
        r0 = r0.getDimensionPixelSize(r1);	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        r12.aW = r0;	 Catch:{ ActivityNotFoundException -> 0x02e4 }
        if (r8 == 0) goto L_0x0251;
    L_0x022f:
        r0 = r12.aU;	 Catch:{ ActivityNotFoundException -> 0x02e6 }
        if (r0 == 0) goto L_0x0240;
    L_0x0233:
        r0 = r12.bc;	 Catch:{ ActivityNotFoundException -> 0x02e8 }
        r1 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02e8 }
        r1 = com.whatsapp.a4l.a(r1);	 Catch:{ ActivityNotFoundException -> 0x02e8 }
        r0.setSelection(r1);	 Catch:{ ActivityNotFoundException -> 0x02e8 }
        if (r8 == 0) goto L_0x0251;
    L_0x0240:
        r0 = r12.at;	 Catch:{ ActivityNotFoundException -> 0x02ea }
        if (r0 != 0) goto L_0x0251;
    L_0x0244:
        r0 = r12.bc;	 Catch:{ ActivityNotFoundException -> 0x02ea }
        r1 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02ea }
        r1 = r1.getCount();	 Catch:{ ActivityNotFoundException -> 0x02ea }
        r1 = r1 + -1;
        r0.setSelection(r1);	 Catch:{ ActivityNotFoundException -> 0x02ea }
    L_0x0251:
        r0 = r12.getIntent();
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x02ec }
        r2 = 96;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x02ec }
        r2 = r0.getAction();	 Catch:{ ActivityNotFoundException -> 0x02ec }
        r1 = r1.equals(r2);	 Catch:{ ActivityNotFoundException -> 0x02ec }
        if (r1 == 0) goto L_0x029f;
    L_0x0265:
        r1 = r12.az;	 Catch:{ ActivityNotFoundException -> 0x02ee }
        if (r1 != 0) goto L_0x029f;
    L_0x0269:
        r1 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02ee }
        r1 = r1.getCount();	 Catch:{ ActivityNotFoundException -> 0x02ee }
        if (r1 <= 0) goto L_0x029f;
    L_0x0271:
        r1 = cb;
        r2 = 87;
        r1 = r1[r2];
        r0 = r0.getParcelableExtra(r1);
        r0 = (com.whatsapp.a4p) r0;
        if (r0 == 0) goto L_0x029f;
    L_0x027f:
        r1 = com.whatsapp.App.aK;
        r0 = r0.a;
        r0 = r1.a(r0);
        if (r0 == 0) goto L_0x029f;
    L_0x0289:
        r1 = r0.c;	 Catch:{ ActivityNotFoundException -> 0x02f0 }
        r2 = 2;
        if (r1 != r2) goto L_0x0294;
    L_0x028e:
        r1 = r0.k;	 Catch:{ ActivityNotFoundException -> 0x02f2 }
        r12.H = r1;	 Catch:{ ActivityNotFoundException -> 0x02f2 }
        if (r8 == 0) goto L_0x029f;
    L_0x0294:
        r1 = r0.k;	 Catch:{ ActivityNotFoundException -> 0x02f2 }
        r1 = r1.c;	 Catch:{ ActivityNotFoundException -> 0x02f2 }
        r0 = com.whatsapp.MediaView.a(r0, r1, r12);	 Catch:{ ActivityNotFoundException -> 0x02f2 }
        r12.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x02f2 }
    L_0x029f:
        if (r8 == 0) goto L_0x02aa;
    L_0x02a1:
        r0 = r12.bd;	 Catch:{ ActivityNotFoundException -> 0x02f4 }
        r0 = r0.getCursor();	 Catch:{ ActivityNotFoundException -> 0x02f4 }
        r0.requery();	 Catch:{ ActivityNotFoundException -> 0x02f4 }
    L_0x02aa:
        r9.b();
        r0 = r12.K;
        r1 = com.whatsapp.t4.ON_START;
        r0.a(r1);
        return;
    L_0x02b5:
        r0 = move-exception;
        throw r0;
    L_0x02b7:
        r0 = move-exception;
        throw r0;
    L_0x02b9:
        r0 = move-exception;
        throw r0;
    L_0x02bb:
        r0 = r7;
        goto L_0x00d0;
    L_0x02be:
        r0 = move-exception;
        throw r0;
    L_0x02c0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02c2 }
    L_0x02c2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02c4 }
    L_0x02c4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02c6 }
    L_0x02c6:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02c8 }
    L_0x02c8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02ca }
    L_0x02ca:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02cc }
    L_0x02cc:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02ce }
    L_0x02ce:
        r0 = move-exception;
        throw r0;
    L_0x02d0:
        r0 = move-exception;
        throw r0;
    L_0x02d2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02d4 }
    L_0x02d4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02d6 }
    L_0x02d6:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02d8 }
    L_0x02d8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02da }
    L_0x02da:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02dc }
    L_0x02dc:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02de }
    L_0x02de:
        r0 = move-exception;
        throw r0;
    L_0x02e0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02e2 }
    L_0x02e2:
        r0 = move-exception;
        throw r0;
    L_0x02e4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02e6 }
    L_0x02e6:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02e8 }
    L_0x02e8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02ea }
    L_0x02ea:
        r0 = move-exception;
        throw r0;
    L_0x02ec:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02ee }
    L_0x02ee:
        r0 = move-exception;
        throw r0;
    L_0x02f0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x02f2 }
    L_0x02f2:
        r0 = move-exception;
        throw r0;
    L_0x02f4:
        r0 = move-exception;
        throw r0;
    L_0x02f6:
        r11 = r2;
        r2 = r0;
        r0 = r11;
        goto L_0x00f7;
    L_0x02fb:
        r2 = r6;
        goto L_0x00f7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onStart():void");
    }

    static boolean K(Conversation conversation) {
        return conversation.bv;
    }

    static TextView at(Conversation conversation) {
        return conversation.ax;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (keyEvent.isPrintingKey()) {
                if (this.Z.isShown()) {
                    try {
                        if (!this.Z.hasFocus()) {
                            this.Z.requestFocus();
                            dispatchKeyEvent(keyEvent);
                            return true;
                        }
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                }
            }
            return super.onKeyDown(i, keyEvent);
        } catch (ActivityNotFoundException e2) {
            throw e2;
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    private int U() {
        try {
            if (a3b.a(App.z()).e(this.ae)) {
                return 2131231432;
            }
            return 2131231431;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static boolean k(Conversation conversation, boolean z) {
        conversation.bi = z;
        return z;
    }

    private void k(String str) {
        try {
            Intent intent = new Intent(cb[175]);
            intent.setType(cb[173]);
            intent.putExtra(cb[174], str);
            intent.putExtra(cb[176], 2);
            intent.setFlags(524288);
            startActivityForResult(intent, 13);
            bh = false;
        } catch (ActivityNotFoundException e) {
            showDialog(12);
        }
    }

    static int am(Conversation conversation) {
        return conversation.af;
    }

    static boolean f(Conversation conversation, boolean z) {
        conversation.J = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String f(java.lang.String r15) {
        /*
        r14 = this;
        r13 = 1;
        r8 = com.whatsapp.DialogToastActivity.f;
        r9 = new p;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r9.<init>();	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r10 = q.k(r15);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        if (r10 == 0) goto L_0x00d5;
    L_0x000e:
        r1 = r10.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00d6 }
        if (r1 == 0) goto L_0x00d5;
    L_0x0012:
        r1 = r10.k;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r11 = r1.iterator();	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
    L_0x0018:
        r1 = r11.hasNext();	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        if (r1 == 0) goto L_0x00be;
    L_0x001e:
        r1 = r11.next();	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r0 = r1;
        r0 = (g) r0;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r7 = r0;
        r1 = r7.c;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r1 = r1.trim();	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r1 = android.telephony.PhoneNumberUtils.stripSeparators(r1);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r2 = "+";
        r2 = r1.startsWith(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00dd }
        if (r2 == 0) goto L_0x0044;
    L_0x0039:
        r2 = r1.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00dd }
        if (r2 <= r13) goto L_0x0044;
    L_0x003f:
        r2 = 1;
        r1 = r1.substring(r2);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
    L_0x0044:
        r2 = com.whatsapp.App.as;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r1 = r2.i(r1);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r2 = r1.isEmpty();	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        if (r2 != 0) goto L_0x00bc;
    L_0x0050:
        r2 = 0;
        r1 = r1.get(r2);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r1 = (com.whatsapp.l5) r1;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r12 = r1.p;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r1 = android.provider.ContactsContract.RawContacts.CONTENT_URI;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r1 = r1.buildUpon();	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r2 = cb;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r3 = 99;
        r2 = r2[r3];	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r3 = 2131232306; // 0x7f080632 float:1.8080718E38 double:1.0529686657E-314;
        r3 = r14.getString(r3);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r1 = r1.appendQueryParameter(r2, r3);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r2 = cb;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r3 = 100;
        r2 = r2[r3];	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r3 = cb;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r3 = r3[r4];	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r1 = r1.appendQueryParameter(r2, r3);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r2 = r1.build();	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r1 = r14.getContentResolver();	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r4 = 0;
        r5 = cb;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r6 = 98;
        r5 = r5[r6];	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r3[r4] = r5;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r4 = cb;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r5 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r4 = r4[r5];	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r6 = 0;
        r5[r6] = r12;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r6 = 0;
        r1 = r1.query(r2, r3, r4, r5, r6);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r2 = r1.moveToFirst();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e1 }
        if (r2 == 0) goto L_0x00b9;
    L_0x00ab:
        r2 = 0;
        r3 = "@";
        r3 = r12.indexOf(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e1 }
        r2 = r12.substring(r2, r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e1 }
        r7.b = r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e1 }
    L_0x00b9:
        r1.close();	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
    L_0x00bc:
        if (r8 == 0) goto L_0x0018;
    L_0x00be:
        r1 = r10.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e3 }
        if (r1 == 0) goto L_0x00d0;
    L_0x00c2:
        r1 = r10.e;	 Catch:{ d -> 0x00e5, IOException -> 0x00df }
        r1 = r1.length;	 Catch:{ d -> 0x00e5, IOException -> 0x00df }
        if (r1 <= 0) goto L_0x00d0;
    L_0x00c7:
        r1 = r10.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e7, StringIndexOutOfBoundsException -> 0x00f7, IllegalArgumentException -> 0x00f5 }
        r2 = 0;
        r1 = android.backport.util.Base64.decode(r1, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e7, StringIndexOutOfBoundsException -> 0x00f7, IllegalArgumentException -> 0x00f5 }
        r10.e = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00e7, StringIndexOutOfBoundsException -> 0x00f7, IllegalArgumentException -> 0x00f5 }
    L_0x00d0:
        r1 = 2;
        r15 = r9.a(r14, r10, r1);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
    L_0x00d5:
        return r15;
    L_0x00d6:
        r1 = move-exception;
        throw r1;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
    L_0x00d8:
        r1 = move-exception;
    L_0x00d9:
        r1.printStackTrace();
        goto L_0x00d5;
    L_0x00dd:
        r1 = move-exception;
        throw r1;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
    L_0x00df:
        r1 = move-exception;
        goto L_0x00d9;
    L_0x00e1:
        r1 = move-exception;
        throw r1;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
    L_0x00e3:
        r1 = move-exception;
        throw r1;	 Catch:{  }
    L_0x00e5:
        r1 = move-exception;
        throw r1;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
    L_0x00e7:
        r1 = move-exception;
    L_0x00e8:
        r2 = 0;
        r10.e = r2;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r2 = cb;	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        r3 = 97;
        r2 = r2[r3];	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        com.whatsapp.util.Log.b(r2, r1);	 Catch:{ d -> 0x00d8, IOException -> 0x00df }
        goto L_0x00d0;
    L_0x00f5:
        r1 = move-exception;
        goto L_0x00e8;
    L_0x00f7:
        r1 = move-exception;
        goto L_0x00e8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.f(java.lang.String):java.lang.String");
    }

    static boolean l(Conversation conversation) {
        return conversation.aS;
    }

    private void G() {
        this.by = aam.a((LayoutInflater) getBaseContext().getSystemService(cb[172]), 2130903115, this.bc, false);
        this.by.findViewById(2131755499).setOnClickListener(new hz(this));
        this.by.findViewById(2131755500).setOnClickListener(new a_e(this));
    }

    static boolean j(Conversation conversation, boolean z) {
        conversation.be = z;
        return z;
    }

    public void a(String str, long j) {
        try {
            if (this.bn.getVisibility() != 0) {
                this.bn.setVisibility(0);
            }
            this.aA.setText(DateUtils.formatElapsedTime(j / 1000));
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void ah(Conversation conversation) {
        conversation.t();
    }

    public static Intent a(l5 l5Var) {
        return new Intent(App.z().getApplicationContext(), Conversation.class).putExtra(cb[177], l5Var.p).addFlags(335544320);
    }

    public boolean M() {
        try {
            return this.a4 != null ? this.a4.g() : false;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void s() {
        this.bw.removeCallbacks(this.a6);
        View view = this.bs;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (((float) (defaultDisplay.getHeight() - (iArr[1] + view.getHeight()))) > 128.0f * this.ag.g) {
            Log.i(cb[0] + (defaultDisplay.getHeight() - (iArr[1] + view.getHeight())));
            I();
            this.aM.a(true);
            this.aM.a(view, this.a_, this.aZ, this.Z);
            this.bw.setFreezeHeight();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        int b = this.aM.b();
        Log.i(cb[1] + b);
        if (b == 0) {
            b = (defaultDisplay.getHeight() * 2) / 5;
        }
        b = Math.max(b, getResources().getDimensionPixelSize(2131427483) * 4);
        this.bc.setTranscriptMode(2);
        this.bc.setFastScrollEnabled(false);
        this.al.sendEmptyMessageDelayed(0, 1000);
        this.aM.a(false);
        this.aM.a(view, this.a_, this.aZ, this.Z);
        this.bw.setFreezeHeight(this.bw.getHeight() - b);
    }

    static int f(Conversation conversation) {
        return conversation.aa;
    }

    static void X(Conversation conversation) {
        conversation.D();
    }

    static c3 Z(Conversation conversation) {
        return conversation.H;
    }

    public void a(View view) {
        View imageView = new ImageView(this);
        imageView.setImageResource(2130839651);
        imageView.setVisibility(4);
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new oc(this, imageView, view));
        this.bw.addView(imageView);
    }

    static void a(Activity activity, by byVar, l5 l5Var, boolean z) {
        byVar.a(2131231814, 2131231813);
        bq.a(new aqc(l5Var, z, new Handler(Looper.getMainLooper()), byVar, activity));
    }

    static a4d A(Conversation conversation) {
        return conversation.ag;
    }

    static ImageButton ak(Conversation conversation) {
        return conversation.am;
    }

    static c3 b(Conversation conversation, c3 c3Var) {
        conversation.a9 = c3Var;
        return c3Var;
    }

    private int a(boolean z) {
        if (z) {
            return 100;
        }
        try {
            if (this.aa > 90) {
                Log.e(cb[157] + (this.aa + 10));
                return this.aa + 10;
            }
            try {
                if (this.aF > 0) {
                    return this.aF;
                }
                return 100;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public static Animation d(boolean z) {
        Animation animationSet = new AnimationSet(true);
        if (z) {
            try {
                Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        try {
            alphaAnimation.setDuration(100);
            animationSet.addAnimation(alphaAnimation);
            if (z) {
                float f;
                if (App.a1()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                alphaAnimation = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, f, 1, 0.5f);
            } else {
                try {
                    alphaAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, App.a1() ? 1.0f : 0.0f, 1, 0.5f);
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            }
            alphaAnimation.setDuration(100);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setDuration(100);
            return animationSet;
        } catch (ActivityNotFoundException e22) {
            throw e22;
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    static nt ar(Conversation conversation) {
        return conversation.aD;
    }

    static ActionMode j(Conversation conversation) {
        return conversation.aj;
    }

    static void a(Conversation conversation, String str) {
        conversation.k(str);
    }

    static View W(Conversation conversation) {
        return conversation.an;
    }

    static String as(Conversation conversation) {
        return conversation.ay;
    }

    private void C() {
        Intent intent = new Intent(cb[178]);
        intent.setType(cb[179]);
        try {
            startActivityForResult(intent, 7);
            bh = false;
        } catch (ActivityNotFoundException e) {
            App.a((Context) this, 2131230782, 0);
        }
    }

    static ActionMode a(Conversation conversation, ActionMode actionMode) {
        conversation.aj = actionMode;
        return actionMode;
    }

    private void A() {
        try {
            if (this.a4 == null) {
                ((ViewStub) findViewById(2131755511)).inflate();
                this.a4 = new a9a(this, this, this);
                this.a4.a(this.ae);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        boolean z = DialogToastActivity.f;
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = new ArrayList();
        if (this.u != null) {
            for (co coVar : this.u.values()) {
                arrayList.add(new a4p(coVar.k));
                if (z) {
                    break;
                }
            }
            bundle.putParcelableArrayList(cb[165], arrayList);
        }
    }

    static c3 a(Conversation conversation, c3 c3Var) {
        conversation.H = c3Var;
        return c3Var;
    }

    static void N(Conversation conversation) {
        conversation.Z();
    }

    static ViewGroup w(Conversation conversation) {
        return conversation.aB;
    }

    static boolean b(Conversation conversation, boolean z) {
        conversation.bo = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r10) {
        /*
        r9 = this;
        r8 = 3;
        r7 = 11;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        r1 = r9.aI;	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        if (r1 == 0) goto L_0x01c2;
    L_0x0012:
        r1 = r9.ar;	 Catch:{ ActivityNotFoundException -> 0x01c7 }
        if (r1 == 0) goto L_0x0071;
    L_0x0016:
        r1 = 15;
        r2 = 2131230822; // 0x7f080066 float:1.8077708E38 double:1.0529679325E-314;
        r3 = 2130839426; // 0x7f020782 float:1.7283862E38 double:1.052774557E-314;
        r1 = r9.a(r10, r1, r2, r3);
        r9.w = r1;
        r1 = 9;
        r2 = 2131231318; // 0x7f080256 float:1.8078714E38 double:1.0529681776E-314;
        r9.a(r10, r1, r2);
        r1 = 12;
        r2 = 2131232231; // 0x7f0805e7 float:1.8080565E38 double:1.0529686286E-314;
        r9.a(r10, r1, r2);
        r1 = 14;
        r2 = 2131231845; // 0x7f080465 float:1.8079783E38 double:1.052968438E-314;
        r9.a(r10, r1, r2);
        r1 = 10;
        r2 = r9.U();
        r9.a(r10, r1, r2);
        r1 = 2131232270; // 0x7f08060e float:1.8080645E38 double:1.052968648E-314;
        r9.a(r10, r7, r1);
        r1 = 2131231467; // 0x7f0802eb float:1.8079016E38 double:1.052968251E-314;
        r1 = r9.b(r10, r8, r1);
        r2 = 17;
        r3 = 2131230918; // 0x7f0800c6 float:1.8077902E38 double:1.05296798E-314;
        r9.a(r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01c9 }
        r2 = 8;
        r3 = 2131231085; // 0x7f08016d float:1.8078241E38 double:1.0529680624E-314;
        r9.a(r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01c9 }
        r2 = com.whatsapp.App.a2();	 Catch:{ ActivityNotFoundException -> 0x01c9 }
        if (r2 != 0) goto L_0x006f;
    L_0x0068:
        r2 = 6;
        r3 = 2131230794; // 0x7f08004a float:1.807765E38 double:1.0529679187E-314;
        r9.a(r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01c9 }
    L_0x006f:
        if (r0 == 0) goto L_0x01a8;
    L_0x0071:
        r1 = r9.bx;	 Catch:{ ActivityNotFoundException -> 0x01cb }
        if (r1 == 0) goto L_0x00c7;
    L_0x0075:
        r1 = 15;
        r2 = 2131230822; // 0x7f080066 float:1.8077708E38 double:1.0529679325E-314;
        r3 = 2130839426; // 0x7f020782 float:1.7283862E38 double:1.052774557E-314;
        r1 = r9.a(r10, r1, r2, r3);
        r9.w = r1;
        r1 = 9;
        r2 = 2131231394; // 0x7f0802a2 float:1.8078868E38 double:1.052968215E-314;
        r9.a(r10, r1, r2);
        r1 = 12;
        r2 = 2131232234; // 0x7f0805ea float:1.8080571E38 double:1.05296863E-314;
        r9.a(r10, r1, r2);
        r1 = 14;
        r2 = 2131231845; // 0x7f080465 float:1.8079783E38 double:1.052968438E-314;
        r9.a(r10, r1, r2);
        r1 = 2131232270; // 0x7f08060e float:1.8080645E38 double:1.052968648E-314;
        r9.a(r10, r7, r1);
        r1 = 2131231467; // 0x7f0802eb float:1.8079016E38 double:1.052968251E-314;
        r1 = r9.b(r10, r8, r1);
        r2 = 17;
        r3 = 2131230918; // 0x7f0800c6 float:1.8077902E38 double:1.05296798E-314;
        r9.a(r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01cd }
        r2 = 8;
        r3 = 2131231085; // 0x7f08016d float:1.8078241E38 double:1.0529680624E-314;
        r9.a(r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01cd }
        r2 = com.whatsapp.App.a2();	 Catch:{ ActivityNotFoundException -> 0x01cd }
        if (r2 != 0) goto L_0x00c5;
    L_0x00be:
        r2 = 6;
        r3 = 2131230794; // 0x7f08004a float:1.807765E38 double:1.0529679187E-314;
        r9.a(r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01cd }
    L_0x00c5:
        if (r0 == 0) goto L_0x01a8;
    L_0x00c7:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x01cf }
        if (r1 < r7) goto L_0x012f;
    L_0x00cb:
        r1 = 1;
        r9.bf = r1;
        r1 = 16;
        r2 = 2131230863; // 0x7f08008f float:1.807779E38 double:1.052967953E-314;
        r1 = r9.a(r10, r1, r2);
        r9.bg = r1;
        r1 = r9.bg;
        r2 = 2130903086; // 0x7f03002e float:1.741298E38 double:1.0528060094E-314;
        r1.setActionView(r2);
        r1 = com.whatsapp.App.a1();	 Catch:{ ActivityNotFoundException -> 0x01d1 }
        if (r1 == 0) goto L_0x00fd;
    L_0x00e7:
        r1 = r9.bg;	 Catch:{ ActivityNotFoundException -> 0x01d3 }
        r1 = r1.getActionView();	 Catch:{ ActivityNotFoundException -> 0x01d3 }
        r2 = new com.whatsapp.gt;	 Catch:{ ActivityNotFoundException -> 0x01d3 }
        r3 = 0;
        r4 = 0;
        r5 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r6 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ ActivityNotFoundException -> 0x01d3 }
        r1.setOnTouchListener(r2);	 Catch:{ ActivityNotFoundException -> 0x01d3 }
        if (r0 == 0) goto L_0x0111;
    L_0x00fd:
        r1 = r9.bg;	 Catch:{ ActivityNotFoundException -> 0x01d3 }
        r1 = r1.getActionView();	 Catch:{ ActivityNotFoundException -> 0x01d3 }
        r2 = new com.whatsapp.gt;	 Catch:{ ActivityNotFoundException -> 0x01d3 }
        r3 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r2.<init>(r3, r4, r5, r6);	 Catch:{ ActivityNotFoundException -> 0x01d3 }
        r1.setOnTouchListener(r2);	 Catch:{ ActivityNotFoundException -> 0x01d3 }
    L_0x0111:
        r1 = r9.bg;	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r1 = r1.getActionView();	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r2 = new com.whatsapp.a4w;	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r2.<init>(r9);	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r1.setOnClickListener(r2);	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r1 = r9.bg;	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r1 = r1.getActionView();	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r2 = new com.whatsapp.e0;	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r2.<init>(r9);	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r1.setOnLongClickListener(r2);	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        if (r0 == 0) goto L_0x0140;
    L_0x012f:
        r0 = 0;
        r9.bf = r0;	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r0 = 16;
        r1 = 2131230863; // 0x7f08008f float:1.807779E38 double:1.052967953E-314;
        r2 = 2130839427; // 0x7f020783 float:1.7283864E38 double:1.0527745577E-314;
        r0 = r9.a(r10, r0, r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01d5 }
        r9.bg = r0;	 Catch:{ ActivityNotFoundException -> 0x01d5 }
    L_0x0140:
        r0 = r9.bg;
        r1 = 2;
        android.support.v4.view.MenuItemCompat.setShowAsAction(r0, r1);
        r0 = 15;
        r1 = 2131230822; // 0x7f080066 float:1.8077708E38 double:1.0529679325E-314;
        r2 = 2130839426; // 0x7f020782 float:1.7283862E38 double:1.052774557E-314;
        r0 = r9.a(r10, r0, r1, r2);
        r9.w = r0;
        r0 = 1;
        r1 = 2131232226; // 0x7f0805e2 float:1.8080555E38 double:1.052968626E-314;
        r9.a(r10, r0, r1);
        r0 = 12;
        r1 = 2131232230; // 0x7f0805e6 float:1.8080563E38 double:1.052968628E-314;
        r9.a(r10, r0, r1);
        r0 = 14;
        r1 = 2131231845; // 0x7f080465 float:1.8079783E38 double:1.052968438E-314;
        r9.a(r10, r0, r1);
        r0 = 10;
        r1 = r9.U();
        r9.a(r10, r0, r1);
        r0 = 2131232270; // 0x7f08060e float:1.8080645E38 double:1.052968648E-314;
        r9.a(r10, r7, r0);
        r0 = 2131231467; // 0x7f0802eb float:1.8079016E38 double:1.052968251E-314;
        r0 = r9.b(r10, r8, r0);
        r0.clearHeader();	 Catch:{ ActivityNotFoundException -> 0x01d7 }
        r1 = 4;
        r2 = 2131230839; // 0x7f080077 float:1.8077742E38 double:1.052967941E-314;
        r9.a(r0, r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01d7 }
        r1 = 17;
        r2 = 2131230918; // 0x7f0800c6 float:1.8077902E38 double:1.05296798E-314;
        r9.a(r0, r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01d7 }
        r1 = 8;
        r2 = 2131231085; // 0x7f08016d float:1.8078241E38 double:1.0529680624E-314;
        r9.a(r0, r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01d7 }
        r1 = com.whatsapp.App.a2();	 Catch:{ ActivityNotFoundException -> 0x01d7 }
        if (r1 != 0) goto L_0x01a8;
    L_0x01a1:
        r1 = 6;
        r2 = 2131230794; // 0x7f08004a float:1.807765E38 double:1.0529679187E-314;
        r9.a(r0, r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01d7 }
    L_0x01a8:
        r0 = r9.w;	 Catch:{ ActivityNotFoundException -> 0x01d9 }
        r1 = 2;
        android.support.v4.view.MenuItemCompat.setShowAsAction(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x01d9 }
        r0 = r9.ar;	 Catch:{ ActivityNotFoundException -> 0x01d9 }
        if (r0 == 0) goto L_0x01c2;
    L_0x01b2:
        r0 = r9.aI;	 Catch:{ ActivityNotFoundException -> 0x01db }
        r0 = r0.p;	 Catch:{ ActivityNotFoundException -> 0x01db }
        r0 = com.whatsapp.qm.h(r0);	 Catch:{ ActivityNotFoundException -> 0x01db }
        if (r0 != 0) goto L_0x01c2;
    L_0x01bc:
        r0 = r9.w;	 Catch:{ ActivityNotFoundException -> 0x01db }
        r1 = 0;
        r0.setVisible(r1);	 Catch:{ ActivityNotFoundException -> 0x01db }
    L_0x01c2:
        r0 = super.onCreateOptionsMenu(r10);
        return r0;
    L_0x01c7:
        r0 = move-exception;
        throw r0;
    L_0x01c9:
        r0 = move-exception;
        throw r0;
    L_0x01cb:
        r0 = move-exception;
        throw r0;
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r0 = move-exception;
        throw r0;
    L_0x01d1:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01d3 }
    L_0x01d3:
        r0 = move-exception;
        throw r0;
    L_0x01d5:
        r0 = move-exception;
        throw r0;
    L_0x01d7:
        r0 = move-exception;
        throw r0;
    L_0x01d9:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01db }
    L_0x01db:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void D() {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        r2 = r4.aI;	 Catch:{ ActivityNotFoundException -> 0x00a4 }
        r2 = r2.p;	 Catch:{ ActivityNotFoundException -> 0x00a4 }
        r2 = com.whatsapp.qa.d(r2);	 Catch:{ ActivityNotFoundException -> 0x00a4 }
        r4.aI = r2;	 Catch:{ ActivityNotFoundException -> 0x00a4 }
        r2 = r4.bb;	 Catch:{ ActivityNotFoundException -> 0x00a4 }
        r3 = r4.aI;	 Catch:{ ActivityNotFoundException -> 0x00a4 }
        r2.setContact(r3);	 Catch:{ ActivityNotFoundException -> 0x00a4 }
        r2 = r4.aO;	 Catch:{ ActivityNotFoundException -> 0x00a4 }
        if (r2 != 0) goto L_0x00a6;
    L_0x0017:
        r2 = r4.aO;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        if (r2 == 0) goto L_0x0023;
    L_0x001b:
        r2 = r4.aO;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        r2.a();	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        r2 = 0;
        r4.aO = r2;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
    L_0x0023:
        r4.o();	 Catch:{ ActivityNotFoundException -> 0x00ab }
        r2 = r4.ar;	 Catch:{ ActivityNotFoundException -> 0x00ab }
        if (r2 != 0) goto L_0x002e;
    L_0x002a:
        r2 = r4.bx;	 Catch:{ ActivityNotFoundException -> 0x00ad }
        if (r2 == 0) goto L_0x0041;
    L_0x002e:
        r2 = new com.whatsapp.awj;	 Catch:{ ActivityNotFoundException -> 0x00ad }
        r3 = r4.aI;	 Catch:{ ActivityNotFoundException -> 0x00ad }
        r3 = r3.p;	 Catch:{ ActivityNotFoundException -> 0x00ad }
        r2.<init>(r4, r3, r0);	 Catch:{ ActivityNotFoundException -> 0x00ad }
        r4.aO = r2;	 Catch:{ ActivityNotFoundException -> 0x00ad }
        r0 = r4.aO;	 Catch:{ ActivityNotFoundException -> 0x00ad }
        r2 = 0;
        r2 = new java.lang.Void[r2];	 Catch:{ ActivityNotFoundException -> 0x00ad }
        com.whatsapp.util.bq.a(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x00ad }
    L_0x0041:
        r4.n();	 Catch:{ ActivityNotFoundException -> 0x00af }
        r0 = r4.ar;	 Catch:{ ActivityNotFoundException -> 0x00af }
        if (r0 == 0) goto L_0x0077;
    L_0x0048:
        r0 = r4.aI;	 Catch:{ ActivityNotFoundException -> 0x00b1 }
        r0 = r0.p;	 Catch:{ ActivityNotFoundException -> 0x00b1 }
        r0 = com.whatsapp.qm.h(r0);	 Catch:{ ActivityNotFoundException -> 0x00b1 }
        if (r0 != 0) goto L_0x0077;
    L_0x0052:
        r0 = 2131755502; // 0x7f1001ee float:1.9141885E38 double:1.053227159E-314;
        r0 = r4.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x00b3 }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00b3 }
        r0 = 2131755501; // 0x7f1001ed float:1.9141883E38 double:1.0532271584E-314;
        r0 = r4.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x00b3 }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00b3 }
        r0 = r4.w;	 Catch:{ ActivityNotFoundException -> 0x00b3 }
        if (r0 == 0) goto L_0x0098;
    L_0x006d:
        r0 = r4.w;	 Catch:{ ActivityNotFoundException -> 0x00b5 }
        r2 = 0;
        r0.setVisible(r2);	 Catch:{ ActivityNotFoundException -> 0x00b5 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ ActivityNotFoundException -> 0x00b5 }
        if (r0 == 0) goto L_0x0098;
    L_0x0077:
        r0 = 2131755502; // 0x7f1001ee float:1.9141885E38 double:1.053227159E-314;
        r0 = r4.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r0 = 2131755501; // 0x7f1001ed float:1.9141883E38 double:1.0532271584E-314;
        r0 = r4.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r0 = r4.w;	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        if (r0 == 0) goto L_0x0098;
    L_0x0092:
        r0 = r4.w;	 Catch:{ ActivityNotFoundException -> 0x00b7 }
        r2 = 1;
        r0.setVisible(r2);	 Catch:{ ActivityNotFoundException -> 0x00b7 }
    L_0x0098:
        r0 = new com.whatsapp.a4m;
        r2 = 0;
        r0.<init>(r4, r2);
        r1 = new java.lang.Void[r1];
        com.whatsapp.util.bq.a(r0, r1);
        return;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = r1;
        goto L_0x0017;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.D():void");
    }

    static c3 d(Conversation conversation) {
        return conversation.a9;
    }

    public static Intent g(String str) {
        return new Intent(App.z(), Conversation.class).putExtra(cb[159], str).addFlags(335544320);
    }

    private void O() {
        try {
            if (!RequestPermissionActivity.a((Activity) this, 31)) {
                return;
            }
            if (App.a(this.P)) {
                ag.a(23, (Activity) this);
                bh = false;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static ArrayList a(Conversation conversation, ArrayList arrayList) {
        conversation.ac = arrayList;
        return arrayList;
    }

    private void k() {
        try {
            if (!a(38)) {
                return;
            }
            if (App.a(this.P)) {
                ag.a((Activity) this, this.aI.p);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static void Q(Conversation conversation) {
        conversation.V();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
        r2 = this;
        r0 = cb;	 Catch:{ ActivityNotFoundException -> 0x0097 }
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x0097 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x0097 }
        super.onDestroy();	 Catch:{ ActivityNotFoundException -> 0x0097 }
        r0 = r2.K;	 Catch:{ ActivityNotFoundException -> 0x0097 }
        r0.b();	 Catch:{ ActivityNotFoundException -> 0x0097 }
        r0 = r2.a4;	 Catch:{ ActivityNotFoundException -> 0x0097 }
        if (r0 == 0) goto L_0x001b;
    L_0x0015:
        r0 = r2.a4;	 Catch:{ ActivityNotFoundException -> 0x0097 }
        r1 = 0;
        r0.b(r1);	 Catch:{ ActivityNotFoundException -> 0x0097 }
    L_0x001b:
        r0 = r2.av;	 Catch:{ ActivityNotFoundException -> 0x0099 }
        if (r0 == 0) goto L_0x0029;
    L_0x001f:
        r0 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x0099 }
        r1 = r2.A;	 Catch:{ ActivityNotFoundException -> 0x0099 }
        r0.a(r1);	 Catch:{ ActivityNotFoundException -> 0x0099 }
        r0 = 0;
        r2.av = r0;	 Catch:{ ActivityNotFoundException -> 0x0099 }
    L_0x0029:
        r0 = 1;
        bh = r0;	 Catch:{ ActivityNotFoundException -> 0x009b }
        r0 = r2.bd;	 Catch:{ ActivityNotFoundException -> 0x009b }
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.S;	 Catch:{ ActivityNotFoundException -> 0x009d }
        if (r0 == 0) goto L_0x003b;
    L_0x0034:
        r0 = r2.bd;	 Catch:{ ActivityNotFoundException -> 0x009d }
        r1 = r2.S;	 Catch:{ ActivityNotFoundException -> 0x009d }
        r0.unregisterDataSetObserver(r1);	 Catch:{ ActivityNotFoundException -> 0x009d }
    L_0x003b:
        u(r2);	 Catch:{ ActivityNotFoundException -> 0x009f }
        v(r2);	 Catch:{ ActivityNotFoundException -> 0x009f }
        r0 = r2.bd;	 Catch:{ ActivityNotFoundException -> 0x009f }
        if (r0 == 0) goto L_0x0056;
    L_0x0045:
        r0 = r2.bd;	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r0 = r0.getCursor();	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        if (r0 == 0) goto L_0x0056;
    L_0x004d:
        r0 = r2.bd;	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r0 = r0.getCursor();	 Catch:{ ActivityNotFoundException -> 0x00a1 }
        r0.close();	 Catch:{ ActivityNotFoundException -> 0x00a1 }
    L_0x0056:
        r0 = r2.as;	 Catch:{ ActivityNotFoundException -> 0x00a3 }
        if (r0 == 0) goto L_0x0060;
    L_0x005a:
        r0 = r2.as;	 Catch:{ ActivityNotFoundException -> 0x00a3 }
        r1 = 1;
        r0.cancel(r1);	 Catch:{ ActivityNotFoundException -> 0x00a3 }
    L_0x0060:
        r0 = r2.ae;	 Catch:{ ActivityNotFoundException -> 0x00a5 }
        if (r0 == 0) goto L_0x0073;
    L_0x0064:
        r0 = r2.D;	 Catch:{ ActivityNotFoundException -> 0x00a7 }
        if (r0 != 0) goto L_0x006c;
    L_0x0068:
        r0 = r2.be;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        if (r0 != 0) goto L_0x0073;
    L_0x006c:
        r0 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        r1 = r2.ae;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
        r0.P(r1);	 Catch:{ ActivityNotFoundException -> 0x00a9 }
    L_0x0073:
        com.whatsapp.App.a(r2);	 Catch:{ ActivityNotFoundException -> 0x00ab }
        com.whatsapp.App.a(r2);	 Catch:{ ActivityNotFoundException -> 0x00ab }
        r0 = r2.aO;	 Catch:{ ActivityNotFoundException -> 0x00ab }
        if (r0 == 0) goto L_0x0085;
    L_0x007d:
        r0 = r2.aO;	 Catch:{ ActivityNotFoundException -> 0x00ab }
        r0.a();	 Catch:{ ActivityNotFoundException -> 0x00ab }
        r0 = 0;
        r2.aO = r0;	 Catch:{ ActivityNotFoundException -> 0x00ab }
    L_0x0085:
        com.whatsapp.i8.f();
        r0 = com.whatsapp.memory.d.a();
        r0.a(r2);
        r0 = r2.getApplicationContext();
        com.whatsapp.App.w(r0);
        return;
    L_0x0097:
        r0 = move-exception;
        throw r0;
    L_0x0099:
        r0 = move-exception;
        throw r0;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onDestroy():void");
    }

    static boolean l(Conversation conversation, boolean z) {
        conversation.bu = z;
        return z;
    }

    public void a() {
        try {
            if (!isFinishing()) {
                this.W++;
                this.bd.notifyDataSetChanged();
                D();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void P() {
        this.aP = aam.a((LayoutInflater) getBaseContext().getSystemService(cb[190]), 2130903114, this.bc, false);
        this.aP.findViewById(2131755498).setOnClickListener(new aw9(this));
        this.aP.findViewById(2131755499).setOnClickListener(new ua(this));
        this.aP.findViewById(2131755500).setOnClickListener(new to(this));
    }

    private void a(ArrayList arrayList) {
        boolean z = DialogToastActivity.f;
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ag.a(this.ae, (Uri) it.next());
                if (z) {
                    return;
                }
            }
        } catch (IOException e) {
            try {
                Log.e(cb[152] + e.toString());
                if (e.getMessage() != null) {
                    if (e.getMessage().contains(cb[156])) {
                        try {
                            App.b(App.z(), 2131231112, 0);
                            if (!z) {
                                return;
                            }
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                }
                App.a(App.z(), 2131232022, 0);
            } catch (IOException e22) {
                throw e22;
            } catch (IOException e222) {
                throw e222;
            }
        } catch (c_ e3) {
            Log.e(cb[155] + e3.toString());
            App.b(App.z(), 2131231105, 0);
        } catch (OutOfMemoryError e4) {
            Log.e(cb[153] + e4.toString());
            App.b(App.z(), 2131231116, 0);
        } catch (SecurityException e5) {
            Log.e(cb[154] + e5.toString());
            App.b(App.z(), 2131231550, 0);
        }
    }

    static boolean a(Conversation conversation, boolean z) {
        conversation.aN = z;
        return z;
    }

    static ImageButton M(Conversation conversation) {
        return conversation.F;
    }

    public Dialog onCreateDialog(int i) {
        try {
            if (M()) {
                this.a4.a(i);
                return null;
            }
            int i2;
            switch (i) {
                case v.m /*0*/:
                    View inflate = View.inflate(this, 2130903206, null);
                    Dialog create = new Builder(this).setMessage(2131230915).setView(inflate).setNegativeButton(2131230884, new a4n(this)).setPositiveButton(2131230912, new a2u(this, (CheckBox) inflate.findViewById(R.id.checkbox))).create();
                    create.show();
                    return create;
                case at.g /*1*/:
                    return new Builder(this).setMessage(getString(2131230840, new Object[]{this.aI.a((Context) this)})).setPositiveButton(2131231580, new aiz(this)).setNegativeButton(2131230884, null).create();
                case at.i /*2*/:
                    return new Builder(this).setTitle(2131231271).setMessage(2131231270).setPositiveButton(2131231580, new anx(this)).create();
                case aF.v /*7*/:
                    Log.w(cb[182]);
                    return new Builder(this).setMessage(2131231116).setPositiveButton(2131231580, new aa0(this)).create();
                case aF.u /*8*/:
                    Log.e(cb[186]);
                    return new Builder(this).setMessage(2131231105).setPositiveButton(2131231580, new z0(this)).create();
                case Y.l /*9*/:
                    Log.i(cb[188]);
                    return new Builder(this).setMessage(2131230865).setPositiveButton(2131230863, new ass(this)).setNegativeButton(2131230884, new gc(this)).create();
                case Y.t /*10*/:
                    return new Builder(this).setMessage(2131231086).setPositiveButton(2131230828, new ib(this)).setNeutralButton(2131232297, new aqp(this)).create();
                case Y.j /*11*/:
                    Log.i(cb[185]);
                    return new Builder(this).setMessage(2131230787).setPositiveButton(2131231544, new hl(this)).setNeutralButton(2131231135, new ad_(this)).create();
                case Y.p /*12*/:
                    Log.w(cb[184]);
                    return new Builder(this).setMessage(2131230782).setPositiveButton(2131231580, new az(this)).create();
                case Y.q /*13*/:
                    try {
                        if (this.u != null) {
                            if (!this.u.isEmpty()) {
                                Log.i(cb[180] + this.u.size());
                                return aea.a(this, this.u.values(), this.aI.p, 13, new wz(this, this.u));
                            }
                        }
                        Log.e(cb[183]);
                        return super.onCreateDialog(i);
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                case arj.Toolbar_titleMarginTop /*15*/:
                    try {
                        try {
                            Builder title = new Builder(this).setTitle(App.V() ? 2131231734 : 2131231735);
                            if (App.V()) {
                                i2 = 2131231732;
                            } else {
                                i2 = 2131231733;
                            }
                            return title.setMessage(i2).setPositiveButton(2131231580, new jp(this)).create();
                        } catch (ActivityNotFoundException e22) {
                            throw e22;
                        }
                    } catch (ActivityNotFoundException e222) {
                        throw e222;
                    }
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    Log.i(cb[187]);
                    DialogInterface.OnClickListener com_whatsapp_aoc = new aoc(this);
                    try {
                        Builder builder = new Builder(this);
                        if (this.ar) {
                            i2 = 2131231833;
                        } else {
                            i2 = 2131231831;
                        }
                        return builder.setMessage(i2).setPositiveButton(2131231580, com_whatsapp_aoc).setNegativeButton(2131230884, null).create();
                    } catch (ActivityNotFoundException e2222) {
                        throw e2222;
                    }
                case arj.Theme_ratingBarStyle /*106*/:
                    return new Builder(this).setMessage(getString(2131230891, new Object[]{this.aI.a((Context) this)})).setPositiveButton(2131232177, new atk(this)).setNegativeButton(2131230884, new _4(this)).create();
                case 115:
                    Log.i(cb[181]);
                    return pg.a((Activity) this);
                default:
                    return super.onCreateDialog(i);
            }
        } catch (ActivityNotFoundException e22222) {
            throw e22222;
        }
    }

    static int I(Conversation conversation) {
        return conversation.aR;
    }

    static pz J(Conversation conversation) {
        return conversation.aM;
    }

    private void c(boolean z) {
        Editor edit = getSharedPreferences(cb[163], 0).edit();
        try {
            edit.putBoolean(cb[162], z);
            if (!edit.commit()) {
                Log.e(cb[164]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[238];
        String str = ">Gj\u0016-/[e\u0014!2F+\u0005%2Bm\u0010'-]t\b-4Ol\u0014g6J`@";
        boolean z = true;
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
                        i3 = 93;
                        break;
                    case at.g /*1*/:
                        i3 = 40;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 72;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001,9Za\u0003-4^a\u0004g.\\e\f-9Ip\u0001h";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "/Gs@!9\bi\u0015;)\bf\u0005h-Za\u0013-3\\";
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001,9Za\u0003-4^a\u0004g.Cm\u0010g";
                    z = true;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "0I|?!)Mi\u0013";
                    z = true;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f8Pp\u0012)s{P2\r\u001ce";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013-)]t\u0010:8^m\u0005?r[l\u0001:8\u0005b\u0001!1M`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ">Gj\u0016-/[e\u0014!2F+\u00138<E+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "2]p\u0010=)nk\u0012%<\\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "2]p\u0010=)p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001d[*\u0017 <\\w\u00018-\u0006j\u0005<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Ar\t<$Za\u0013g;Im\fg1Ge\u0004e4Ee\u0007-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ">Gj\u0016-/[e\u0014!2FwO:8[q\f<}Kk\u000e<<Kp@&2\\$\u0001,9M`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ")Ai\u0005\u0017)G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ")Ai\u0005\u0017;Zk\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f8Pp\u0012)s{P2\r\u001ce";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "4[[\u0012-.Mp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0017)1Dt\u000188Z+\t&+Ih\t,\u0002Nm\f-g";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "9Aw\u0010$<Q[\u000e)0M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "?]g\u000b-)w`\t;-De\u0019\u00173Ii\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "4[[\u0004-;Iq\f<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "-@k\u000e-.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "9Aw\u0010$<Q[\u000e)0M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "5Iw?85Gj\u0005\u00173]i\u0002-/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = ")Ai\u0005\u0017)G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "}T$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "*Ih\f8<Xa\u0012h;Zk\rh-OoZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0016!9MkO;5Iv\u0005g;Im\f-9\u0007m\r):Mv\u0005<(Zj\u0005,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0002A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "*Ih\f8<Xa\u0012g.Mp\u00158r[v\u0003r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f8Pp\u0012)s{P2\r\u001ce";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0017)1Dt\u000188Z+\u0012-.Mp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "<F`\u0012'4L*\u0010-/Em\u0013;4GjN\u001a\u0018i@?\u000b\u0012fP!\u000b\t{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Za\u0013=1\\+\u0016+<Z`@!.\bj\u0015$1\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Ar\t<$Za\u0013g.@e\u0012-pNe\t$8L+\t&)Mj\u0014e4[)\u000e=1D";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = ";Ah\u0005\u0017-Ip\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "2]p\u0010=)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0016!9MkO;5Iv\u0005g3Gg\u00018)]v\u0005.4Da@";
                    z = true;
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    strArr2 = strArr3;
                    str = ">It\u0014!2F";
                    z = true;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = ">Zk\u0010\n$gq\u00148(\\W\t28";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0002A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "4G)\u0005:/Gv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\nIh\f\u0018<Xa\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Ar\t<$Za\u0013g2GiM-/Zk\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0017)1Dt\u000188Z+\u0004-;Iq\f<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0016!9MkO;5Iv\u0005g;Im\f-9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "8Lm\u0014\u0017>Gj\u0014)>\\[\t&;G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Ar\t<$Za\u0013=1\\+\u0003:2Xm\r):M+\u000f'0\u0005a\u0012:2Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Ar\t<$Za\u0013g.@e\u0012-pNe\t$8L+\u000e')@m\u000e/p\\kM;5Iv\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "}s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Za\u0013=1\\+\u0012-<L[\u0003'3\\e\u0003<.\bt\u0005:0Aw\u0013!2F$\u0004-3Aa\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = ">Gj\u0014)>\\[\t,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u001d[*\u0017 <\\w\u00018-\u0006j\u0005<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = ")Ai\u0005\u0017;Zk\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "7A`\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = ".Ke\f-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "+A`\u0005'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0016!9MkO;5Iv\u0005g;Im\f-9\u0007m\r):Mv\u0005<(Zj\u0005,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Ar\t<$Za\u0013g3G)\u00138<Ka";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "*Ih\f8<Xa\u0012g>Zk\u0010g5Mm\u0007 )\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "2]p\u0010=)q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = ">Gj\u0014)>\\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "5Iw?85Gj\u0005\u00173]i\u0002-/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = ".Ke\f-\bXM\u0006\u00068M`\u0005,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "2Gi";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "3G)\u00138<Ka";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = ";Ah\u0005\u0017-Ip\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "5Iw?8/Mr\t-*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "4[[\u0012-.Mp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u001d[*\u0017 <\\w\u00018-\u0006j\u0005<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "/M`),";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = ">It\u0014!2F";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0006'/_e\u0012,rAj\u0016)1A`M%8[w\u0001/8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001=9AkO;5Iv\u0005g;Im\f-9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = ">Gj\u0016-/[e\u0014!2FwO:8[q\f<r[o\t8rKk\u000e<<Kp@&2\\$\u0001,9M`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = ";Ah\u0005\u0017-Ip\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "+Ke\u0012,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = ";Ah\u0005\u0017-Ip\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0006'/_e\u0012,rNe\t$8L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "8Zv\u000f:pGk\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f<Kp\t'3\u0006@)\t\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = ")MhZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "}Bm\u0004u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013<2X+\u0012-1Me\u0013-}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "6M}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013<<Zp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "/Gs?!9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = ">GiN?5Ip\u0013)-X[\u0010:8Na\u0012-3Ka\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = ">@e\u000e/8\bt\u0001/8\bw\t28\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "4Fp\u0005:;Ig\u0005\u0017;Gj\u0014\u0017.A~\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "/Gs?!9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "6M}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = ",]a\u00121";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = ">GiN?5Ip\u0013)-X*\t&)Mj\u0014f<Kp\t'3\u0006T,\t\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001,9_e\t,.\\k\u0016+<Z`O*<[aV|pLa\u0003'9M+\u0005:/Gv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = ".Qj\u0003y";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "<Kg\u000f=3\\[\u000e)0M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "<Kg\u000f=3\\[\u00141-M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = ".Qj\u0003y`\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = ">GiN?5Ip\u0013)-X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = ">Gj\u0016-/[e\u0014!2F+\u000f&>Za\u0001<8Gt\u0014!2Fw\r-3]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004-.\\v\u000f1";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "}Kq\u0012;2ZG\u000f=3\\>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "}EK\u0012!:Aj\u0001$\bFw\u0005-3kk\u0015&)\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001,7]w\u0014=3[a\u0005&>Gq\u000e<r]j\u00050-Mg\u0014-9\u0007$\u0015&.Ma\u000e\u000b2]j\u0014r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "}[l\t.)kk\u0015&)\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = ".@k\u0017\u001b2Np)&-]p5&>@a\u0003#8L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f<Kp\t'3\u0006Q3\r\u000fwT2\r\u000emJ4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = ">Gj\u0016-/[e\u0014!2F[\u0013'(F`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "<Jk\u0012<4Fc@,(M$\u0014'}Fe\u0014!+M$\f!?Ze\u0012!8[$\r!.[m\u000e/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "6M}\u0007=<Z`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = ">Gj\u0016-/[e\u0014!2F+\f'>Ca\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0003:8Ip\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = ";Zk\r\u000b<Dh.')Ab\t+<\\m\u000f&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0003:8Ip\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "4Ft\u0015<\u0002Mj\u0014-/ww\u0005&9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = ".Mh\u0005+)M`?%8[w\u0001/8[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0003:8Ip\u0005g3G)\r-pGvM%.Ow\u0014'/M)\u0004*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u001eGj\u0016-/[e\u0014!2FE\u0003<4^m\u00141\u0014Fm\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0003:8Ip\u0005g:Zk\u00158p[l\u000f:)Kq\u0014e/Mi\u000f>8L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013';\\s\u0001:8\u0005a\u001884Za\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = ">GiN?5Ip\u0013)-X[\u0010:8Na\u0012-3Ka\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = ">Gj\u0016-/[e\u0014!2F$\u0002'(Fg\u0005h)G$\r)4F";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0003:8Ip\u0005h;Im\f-9\bp\u000fh.\\e\u0012<}Fa\u0017h>Gj\u0016-/[e\u0014!2F";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013';\\s\u0001:8\u0005e\u0002'(\\)\u0014'pM|\u0010!/M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "1I}\u000f=)wm\u000e.1Ip\u0005:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0003$2KoM?/Gj\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004-+Ag\u0005e3GpM;(Xt\u000f:)M`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = ".Ii\u0013=3O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "9Aw\u0010$<Qj\u0001%8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = ">GiN?5Ip\u0013)-X[\u0010:8Na\u0012-3Ka\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "*Iv\u000e-9we\u0002'(\\[\u0003)1D[\u0003 <Zc\u0005;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!.Xe\u0014+5\u0005p\u000f=>@)\u0005>8Fp@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!.Xe\u0014+5\u0005p\u000f=>@)\u0005>8Fp@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001<)Ig\be1Gg\u0001<4GjO&2\be\u0003<4^m\u00141}Ij\u0004h3G$\u0010-/Em\u0013;4Gj\u0013f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!<Dk\u0007\u0017+Gm\u0010\u0017>Ih\f\u0017<Kp\t>8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0012-.]i\u0005h";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0012-.]i\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = ">Gj\u0016-/[e\u0014!2F+\u00018r[p\u0001<8Mv\u0012'/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!<Dk\u0007\u0017.Gb\u0014?<Za?-%Xm\u0012-\u0002_e\u0012&4Fc";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!<Dk\u0007\u0017<[o?/-[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!<Dk\u0007\u00171Gc\t&\u0002Ne\t$8L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = "-@k\u000e-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f<Kp\t'3\u0006M.\u001b\u0018zP";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = ">Gj\u0016-/[e\u0014!2F+\u000f8)\bw\u0019;)Mi@+2Fp\u0001+)\bh\t;)\bg\u000f=1L$\u000e')\bb\u000f=3L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 151;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 152;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Ar\t<$Za\u0013g.@e\u0012-pNe\t$8L+@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 153;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Ar\t<$Za\u0013g.@e\u0012-pNe\t$8L+@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 154;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Ar\t<$Za\u0013g.@e\u0012-pNe\t$8L+@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 155;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001+)Ar\t<$Za\u0013g.@e\u0012-pNe\t$8L+@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 156;
                    str = "\u0013G$\u00138<Ka";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 157;
                    str = "-Ic\u0005h.A~\u0005r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 158;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013-1Mg\u0014!2Fv\u00059(Mw\u0014-9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 159;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 160;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013 2_h\t&6Xv\u0005>4MsO;)Iv\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 161;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013 2_h\t&6Xv\u0005>4Ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 162;
                    str = "*Iv\u000e-9we\u0002'(\\[\u0003)1D[\u0003 <Zc\u0005;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 163;
                    str = ">GiN?5Ip\u0013)-X[\u0010:8Na\u0012-3Ka\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 164;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013-)_e\u0012&8L+\u0006)4Da\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 165;
                    str = ".Mh\u0005+)M`?%8[w\u0001/8[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 166;
                    str = ">Gj\u0016-/[e\u0014!2F+\u000f&-Za\u0010)/Mk\u0010<4Gj\u0013%8Fq@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 167;
                    str = ">Gj\u0016-/[e\u0014!2F+\r-.[e\u0007-pKk\u000e<<KpO-/Zk\u0012h3G)\u0012-.Gq\u0012+8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 168;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001,9\u0005g\u000f&)Ig\u0014e;Im\f-9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 169;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001,9\u0005g\u000f&)Ig\u0014e;Im\f-9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 170;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0003)1D)\u0003'3\\e\u0003<rMv\u0012'/\bj\u000fe/Mw\u000f=/Ka";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 171;
                    str = "4Ft\u0015<\u0002Ea\u0014 2L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 172;
                    str = "1I}\u000f=)wm\u000e.1Ip\u0005:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 173;
                    str = "+F`N)3Lv\u000f!9\u0006g\u0015:.GvN!)MiO+2Fp\u0001+)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 174;
                    str = "-@k\u000e-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 175;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f<Kp\t'3\u0006M.\u001b\u0018zP?\u0007\u000fwA$\u0001\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 176;
                    str = "-@k\u000e-\u0002\\}\u0010-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 177;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 178;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f<Kp\t'3\u0006T)\u000b\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 179;
                    str = "+F`N)3Lv\u000f!9\u0006g\u0015:.GvN,4Z+\u0003'3\\e\u0003<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 180;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!<Dk\u0007g9Mh\u0005<8\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 181;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!<Dk\u0007h.Gb\u0014?<ZaM)?Gq\u0014e)G)\u00050-Av\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 182;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!<Dk\u0007g2Gi";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 183;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!<Dk\u0007g9Mh\u0005<8\bj\u000fh0Mw\u0013):Mw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 184;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0001,9\ba\u0018!.\\m\u000e/}Kk\u000e<<KpZh<Kp\t>4\\}@&2\\$\u0006'(F`Lh-Zk\u0002)?D}@<<Jh\u0005<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 185;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!<Dk\u0007e<L`M+2Fp\u0001+)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 186;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0004!<Dk\u0007g3GpM)3\u0005m\r):M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 187;
                    str = ">Gj\u0016-/[e\u0014!2F+\u00138<E+\u0012--Gv\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 188;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0017)/Fa\u0004e<Jk\u0015<pKe\f$pKl\u0001::Mw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 189;
                    str = ">Gj\u0016-/[e\u0014!2F+\b!9Mh\t&6Xv\u0005>4MsO;)Iv\u0014h";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 190;
                    str = "1I}\u000f=)wm\u000e.1Ip\u0005:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 191;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0010)([a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 192;
                    str = "-Gs\u0005:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 193;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013<<Zp@&2\bn\t,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 194;
                    str = "+Ke\u0012,\u0002[p\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 195;
                    str = ".Cm\u0010\u0017-Za\u0016!8_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 196;
                    str = "+Ke\u0012,\u0002[p\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 197;
                    str = "5Iw?;5Iv\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 198;
                    str = ".@e\u0012-\u0002Ew\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 199;
                    str = ".EwM\"4L+\u0012)*\u0005j\u0015%?Mv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 200;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0003:8Ip\u0005+2Fr\u0005:.Ip\t'3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 201;
                    str = "+Ke\u0012,\u0002Fe\r-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 202;
                    str = ".Ew\u0014'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 203;
                    str = "0Ai\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 204;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 205;
                    str = ">Gj\u0006!/E";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 206;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 207;
                    str = ".Cm\u0010\u0017-Za\u0016!8_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 208;
                    str = ">GiN)0I~\u000f&sLa\u0016!>M*\b'0M*\u00050)ZeN\u0000\u0018zK?\u001f\u0014lC%\u001c\u0002lE4\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 209;
                    str = "0I|?!)Mi\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 210;
                    str = "}]v\tr";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 211;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013%.\u0005n\t,g";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 212;
                    str = "*I[\u00141-M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 213;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013%.\u0007j\u000fh7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 214;
                    str = "\u001d[*\u0017 <\\w\u00018-\u0006j\u0005<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 215;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013<<ZpO?<wp\u001988\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 216;
                    str = ".Ew";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 217;
                    str = "5Iw?;5Iv\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 218;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f8Pp\u0012)s{P2\r\u001ce";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 219;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f8Pp\u0012)s{P2\r\u001ce";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 220;
                    str = ">It\u0014!2F";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 221;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0013<<Zp@&2\bm\u0003'3\\e\u0003<}Nk\u0012h";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 222;
                    str = "+Ke\u0012,\u0002Fe\r-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 223;
                    str = "4Ee\u0007-r\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 224;
                    str = "}T$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 225;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f8Pp\u0012)saJ)\u001c\u0014iH?\u0001\u0013|A.\u001c\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 226;
                    str = "<F`\u0012'4L*\t&)Mj\u0014f<Kp\t'3\u0006C%\u001c\u0002kK.\u001c\u0018fP";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 227;
                    str = ">GiN )K*\u0001$?]i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 228;
                    str = ">GiN?5Ip\u0013)-X*\t&)Mj\u0014f<Kp\t'3\u0006V%\u001b\u0018|[7\t\u0011dT!\u0018\u0018z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 229;
                    str = "7A`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 230;
                    str = ">GiN?5Ip\u0013)-X*\t&)Mj\u0014f<Kp\t'3\u0006@%\u000e\u001c}H4\u0017\niH,\u0018\u001cxA2";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 231;
                    str = ">Gk\f!/Aw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 232;
                    str = "2Zm\u0005&)Ip\t'3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 233;
                    str = ">GiN?5Ip\u0013)-X*\t&)Mj\u0014f<Kp\t'3\u0006W%\u001c\u0002\u007fE,\u0004\riT%\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 234;
                    str = "\u001aIh\f-/Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 235;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0005%<AhM))\\e\u0003 0Mj\u0014g3Ma\u0004e.L)\u0003)/L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 236;
                    str = "}T$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 237;
                    str = "2Zm\u0005&)Ip\t'3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    cb = strArr3;
                    strArr = new String[2];
                    str = "<F`\u0012'4L*\u0010-/Em\u0013;4GjN\t\u001ekA3\u001b\u0002kK!\u001a\u000em[,\u0007\u001eiP)\u0007\u0013";
                    z = true;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case true:
                    strArr2[i] = str;
                    str = "<F`\u0012'4L*\u0010-/Em\u0013;4GjN\t\u001ekA3\u001b\u0002nM.\r\u0002dK#\t\taK.";
                    z = true;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    y = strArr3;
                    ap = new HashSet();
                    bm = true;
                    aC = new ArrayList();
                    U = new HashMap();
                    bh = true;
                    G = true;
                    bz = true;
                    z = false;
                    ak = new AtomicReference(new a4r(null, false));
                    return;
                default:
                    strArr2[i] = str;
                    str = ">Gj\u0016-/[e\u0014!2F+\u0005%2Bm\u0010'-]t\b-4Ol\u0014g3Go\u0002,}";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    static void av(Conversation conversation) {
        conversation.o();
    }

    static String[] S() {
        return y;
    }

    private void a(File file) {
        boolean z = DialogToastActivity.f;
        try {
            if (ag.a(this.aI.p, (byte) 3, file)) {
                if (ag.a((byte) 3, file)) {
                    VideoPreviewActivity.a((Activity) this, this.aI, file);
                    if (!z) {
                        return;
                    }
                }
                try {
                    App.a(App.z(), 2131232023, 0);
                    if (!z) {
                        return;
                    }
                } catch (IOException e) {
                    throw e;
                }
            }
            try {
                if (akr.c(file)) {
                    try {
                        VideoPreviewActivity.a((Activity) this, this.aI, file);
                        if (!z) {
                            return;
                        }
                    } catch (IOException e2) {
                        throw e2;
                    }
                }
                try {
                    ag.a(this, this, this.aI.p, file, (byte) 3, 0, true, null);
                    this.R = true;
                } catch (IOException e22) {
                    try {
                        throw e22;
                    } catch (Throwable e3) {
                        Log.a(e3);
                        App.a(getBaseContext(), 2131232022, 0);
                    }
                }
            } catch (IOException e222) {
                throw e222;
            }
        } catch (IOException e2222) {
            throw e2222;
        } catch (IOException e22222) {
            throw e22222;
        }
    }

    private void N() {
        try {
            Log.i(cb[161]);
            if (this.bj == null) {
                this.bj = aam.a(getLayoutInflater(), 2130903296, null, false);
                this.aB.addView(this.bj);
                aam.a(this.bj.findViewById(R.id.title), 0, (int) (a4d.a().g * 24.0f));
                this.bj.findViewById(2131755369).setVisibility(0);
                this.bj.findViewById(2131755369).setOnClickListener(new y2(this));
            }
            try {
                if (this.aB.getVisibility() != 0 || this.br < 0) {
                    Log.i(cb[160]);
                    this.br = 1;
                    this.bw.setClipChildren(false);
                    boolean h = h();
                    if (h) {
                        try {
                            this.bc.setTranscriptMode(2);
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    }
                    this.aB.setVisibility(0);
                    this.aB.getViewTreeObserver().addOnGlobalLayoutListener(new uu(this, h));
                }
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    public static void o(String str) {
        a4r com_whatsapp_a4r = (a4r) ak.get();
        try {
            if (com_whatsapp_a4r.a()) {
                if (str != null) {
                    try {
                        if (!str.equals(com_whatsapp_a4r.b().ae)) {
                            return;
                        }
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                }
                com_whatsapp_a4r.b().finish();
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            Conversation a = a4r.a(com_whatsapp_a4r);
            if (a != null) {
                try {
                    if (!a.isFinishing()) {
                        if (str != null) {
                            try {
                                if (!str.equals(a.ae)) {
                                    return;
                                }
                            } catch (ActivityNotFoundException e2) {
                                throw e2;
                            }
                        }
                        a.finish();
                    }
                } catch (ActivityNotFoundException e22) {
                    throw e22;
                } catch (ActivityNotFoundException e222) {
                    throw e222;
                }
            }
        } catch (ActivityNotFoundException e2222) {
            throw e2222;
        } catch (ActivityNotFoundException e22222) {
            throw e22222;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        try {
            boolean dispatchTouchEvent;
            if (this.bv) {
                try {
                    if (!i8.q()) {
                        try {
                            dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        } catch (ActivityNotFoundException e) {
                            Log.e(cb[138] + e.toString());
                            App.a((Context) this, 2131230782, i);
                        } catch (IllegalArgumentException e2) {
                            Log.e(cb[137] + e2.toString());
                        }
                    }
                } catch (ActivityNotFoundException e3) {
                    throw e3;
                }
            }
            return dispatchTouchEvent;
        } catch (ActivityNotFoundException e32) {
            throw e32;
        }
    }

    static void c(Conversation conversation) {
        conversation.T();
    }

    static boolean d(Conversation conversation, boolean z) {
        conversation.at = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t() {
        /*
        r7 = this;
        r6 = 2;
        r5 = 0;
        r0 = r7.I;
        r0 = r0.isFullscreenMode();
        if (r0 != 0) goto L_0x003b;
    L_0x000a:
        r0 = android.view.inputmethod.InputMethodManager.class;
        r1 = cb;	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r1 = r1[r2];	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r2 = 2;
        r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r3 = 0;
        r4 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r3 = 1;
        r4 = android.os.ResultReceiver.class;
        r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r0 = r0.getMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r1 = 1;
        r0.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r1 = r7.I;	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r2 = 2;
        r2 = new java.lang.Object[r2];	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r3 = 0;
        r4 = 0;
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r3 = 1;
        r4 = 0;
        r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
        r0.invoke(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0043, InvocationTargetException -> 0x0045, IllegalAccessException -> 0x003c }
    L_0x003b:
        return;
    L_0x003c:
        r0 = move-exception;
    L_0x003d:
        r0 = r7.I;
        r0.toggleSoftInput(r6, r5);
        goto L_0x003b;
    L_0x0043:
        r0 = move-exception;
        goto L_0x003d;
    L_0x0045:
        r0 = move-exception;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.t():void");
    }

    private void R() {
        try {
            if (!a(36)) {
                return;
            }
            if (App.a(this.P)) {
                ag.a(21, (Activity) this);
                bh = false;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static int b(Conversation conversation, int i) {
        conversation.aa = i;
        return i;
    }

    static View i(Conversation conversation) {
        return conversation.bl;
    }

    static String z(Conversation conversation) {
        return conversation.D;
    }

    static ArrayList aj(Conversation conversation) {
        return conversation.ah;
    }

    static void F(Conversation conversation) {
        conversation.aa();
    }

    public Conversation() {
        this.I = (InputMethodManager) App.z().getSystemService(cb[171]);
        this.aX = null;
        this.ah = null;
        this.aL = null;
        this.aV = new HashSet();
        this.aS = false;
        this.bv = false;
        this.aq = true;
        this.J = false;
        this.af = 0;
        this.aa = 0;
        this.aG = new ArrayList();
        this.aR = 0;
        this.ao = a2c.a();
        this.aD = new an1(this);
        this.bo = false;
        this.bi = true;
        this.bu = false;
        this.aN = true;
        this.aw = true;
        this.al = new x7(this, Looper.getMainLooper());
        this.aK = new rl(this, Looper.getMainLooper());
        this.a6 = new a_v(this);
        this.P = new aul(this);
        this.B = false;
        this.aJ = new ul(this);
        this.a5 = new Handler(Looper.getMainLooper());
        this.aQ = new wy(this);
        this.Q = new a43(this);
        this.M = new je(this);
        this.V = new at1(this);
        this.bA = new _8(this);
        this.S = new _9(this);
        this.av = false;
        this.A = new ak0(this);
        this.L = null;
        this.bk = new ake(this);
        this.at = false;
        this.aF = 0;
    }

    static void E(Conversation conversation) {
        conversation.C();
    }

    static String c(Conversation conversation, String str) {
        conversation.aH = str;
        return str;
    }

    static ViewGroup aq(Conversation conversation) {
        return conversation.C;
    }

    static void aw(Conversation conversation) {
        conversation.A();
    }

    public void c(co coVar) {
        i8.f();
        j();
    }

    private void X() {
        boolean z = DialogToastActivity.f;
        Class cls = null;
        if (App.A()) {
            cls = LocationPicker2.class;
        } else if (App.aA()) {
            cls = LocationPicker.class;
        } else if (App.a2()) {
            cls = LocationPicker.class;
        }
        if (cls != null) {
            Intent intent = new Intent(this, cls);
            try {
                intent.putExtra(cb[140], this.aI.p);
                startActivity(intent);
                bh = false;
                if (!z) {
                    return;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        }
        if (App.u((Context) this)) {
            try {
                App.d((Context) this, this.aI.p);
                if (!z) {
                    return;
                }
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        }
        Log.w(cb[139]);
    }

    static View H(Conversation conversation) {
        return conversation.bs;
    }

    static boolean l(String str) {
        return n(str);
    }

    static HashMap b(Conversation conversation) {
        return conversation.aX;
    }

    static String d(Conversation conversation, String str) {
        conversation.O = str;
        return str;
    }
}
