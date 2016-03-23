package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog.Builder;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.whatsapp.preference.WaFontListPreference;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.bw;
import com.whatsapp.util.cs;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public abstract class ConversationRow extends BubbleRelativeLayout {
    private static final int A;
    private static float B;
    protected static a2_ F;
    private static float L;
    private static Paint M;
    private static final String[] Q;
    int C;
    private View D;
    private Drawable E;
    private View G;
    private TextView H;
    private TextEmojiLabel I;
    private TextEmojiLabel J;
    protected OnLongClickListener K;
    private TextView N;
    private final ViewGroup O;
    protected OnTouchListener P;
    private int r;
    boolean s;
    OnClickListener t;
    protected final ImageView u;
    private ImageView v;
    private final View w;
    protected final TextView x;
    private ImageView y;
    private final Runnable z;

    class 4 extends View {
        final ConversationRow a;
        private final Rect b;

        4(ConversationRow conversationRow, Context context) {
            this.a = conversationRow;
            super(context);
            this.b = new Rect();
        }

        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (isSelected()) {
                getDrawingRect(this.b);
                if (!this.a.i) {
                    this.b.top = this.a.q.top - a4d.a().b;
                    this.b.bottom = this.a.q.bottom + a4d.a().s;
                }
                canvas.drawRect(this.b, ConversationRow.p());
            }
        }
    }

    public class GroupNameDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[2];
            String str = "z0\u0012";
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
                            i3 = 16;
                            break;
                        case at.g /*1*/:
                            i3 = 89;
                            break;
                        case at.i /*2*/:
                            i3 = 118;
                            break;
                        case at.o /*3*/:
                            i3 = 1;
                            break;
                        default:
                            i3 = 64;
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
                        str = "z0\u0012";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                }
            }
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            Object string = getArguments().getString(z[1]);
            l5 b = App.as.b((String) auv.a(string));
            List arrayList = new ArrayList();
            if (b.l == null) {
                arrayList.add(new a96(getResources().getString(2131230786), 2131755014));
                arrayList.add(new a96(getResources().getString(2131230789), 2131755015));
            }
            arrayList.add(new a96(getResources().getString(2131231445, new Object[]{b.i()}), 2131755038));
            arrayList.add(new a96(getResources().getString(2131230866, new Object[]{b.i()}), 2131755017));
            Builder builder = new Builder(getContext());
            builder.setAdapter(new ArrayAdapter(getContext(), 17367057, arrayList), new aot(this, arrayList, string));
            return builder.create();
        }

        public static GroupNameDialogFragment a(@NonNull String str) {
            GroupNameDialogFragment groupNameDialogFragment = new GroupNameDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[0], str);
            groupNameDialogFragment.setArguments(bundle);
            return groupNameDialogFragment;
        }
    }

    protected abstract int g();

    protected abstract int h();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConversationRow(android.content.Context r11, com.whatsapp.protocol.co r12) {
        /*
        r10 = this;
        r2 = 5;
        r1 = 3;
        r3 = 0;
        r9 = 1;
        r4 = com.whatsapp.DialogToastActivity.f;
        r10.<init>(r11, r12);
        r10.s = r3;
        r0 = -1;
        r10.r = r0;
        r0 = new com.whatsapp.a52;
        r0.<init>(r10);
        r10.E = r0;
        r0 = new com.whatsapp.w7;
        r0.<init>(r10);
        r10.P = r0;
        r0 = new com.whatsapp.wm;
        r0.<init>(r10);
        r10.K = r0;
        r0 = new com.whatsapp.akm;
        r0.<init>(r10);
        r10.z = r0;
        r0 = new com.whatsapp.p7;
        r0.<init>(r10);
        r10.t = r0;
        r0 = r10.k();
        if (r0 == 0) goto L_0x003d;
    L_0x0037:
        r0 = r0.c();	 Catch:{ RuntimeException -> 0x008e }
        r10.i = r0;	 Catch:{ RuntimeException -> 0x008e }
    L_0x003d:
        r10.setClipToPadding(r3);
        r5 = com.whatsapp.a4d.a();
        r0 = r12.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0050;
    L_0x004a:
        r0 = r10.h();
        if (r4 == 0) goto L_0x0054;
    L_0x0050:
        r0 = r10.g();
    L_0x0054:
        r3 = r12.k;
        r3 = r3.c;
        r3 = com.whatsapp.qm.i(r3);
        r10.a = r3;
        r3 = r10.getContext();
        r3 = android.view.LayoutInflater.from(r3);
        r0 = com.whatsapp.aam.a(r3, r0, r10, r9);
        if (r0 != 0) goto L_0x0090;
    L_0x006c:
        r0 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x008c }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x008c }
        r1.<init>();	 Catch:{ RuntimeException -> 0x008c }
        r2 = Q;	 Catch:{ RuntimeException -> 0x008c }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x008c }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x008c }
        r2 = r12.k;	 Catch:{ RuntimeException -> 0x008c }
        r2 = r2.a;	 Catch:{ RuntimeException -> 0x008c }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x008c }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x008c }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x008c }
        throw r0;	 Catch:{ RuntimeException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        r0 = r10.i;	 Catch:{ RuntimeException -> 0x0195 }
        if (r0 == 0) goto L_0x0197;
    L_0x0094:
        r0 = r5.q;	 Catch:{ RuntimeException -> 0x0195 }
    L_0x0096:
        r3 = r12.d;	 Catch:{ RuntimeException -> 0x019b }
        r6 = 6;
        if (r3 != r6) goto L_0x00bb;
    L_0x009b:
        r3 = r12.c;	 Catch:{ RuntimeException -> 0x019d }
        r6 = 8;
        if (r3 == r6) goto L_0x00bb;
    L_0x00a1:
        r3 = 17;
        r10.setGravity(r3);	 Catch:{ RuntimeException -> 0x019f }
        r3 = r5.t;	 Catch:{ RuntimeException -> 0x019f }
        r6 = r5.m;	 Catch:{ RuntimeException -> 0x019f }
        r7 = n;	 Catch:{ RuntimeException -> 0x019f }
        r7 = r7.top;	 Catch:{ RuntimeException -> 0x019f }
        r6 = r6 + r7;
        r7 = r5.t;	 Catch:{ RuntimeException -> 0x019f }
        r8 = n;	 Catch:{ RuntimeException -> 0x019f }
        r8 = r8.bottom;	 Catch:{ RuntimeException -> 0x019f }
        r8 = r8 + r0;
        r10.setPadding(r3, r6, r7, r8);	 Catch:{ RuntimeException -> 0x019f }
        if (r4 == 0) goto L_0x0127;
    L_0x00bb:
        r3 = r12.k;	 Catch:{ RuntimeException -> 0x01a1 }
        r3 = r3.a;	 Catch:{ RuntimeException -> 0x01a1 }
        if (r3 == 0) goto L_0x00ea;
    L_0x00c1:
        r3 = com.whatsapp.App.a1();	 Catch:{ RuntimeException -> 0x01a3 }
        if (r3 == 0) goto L_0x01a5;
    L_0x00c7:
        r3 = r2;
    L_0x00c8:
        r10.setGravity(r3);	 Catch:{ RuntimeException -> 0x01a8 }
        r3 = r5.t;	 Catch:{ RuntimeException -> 0x01a8 }
        r6 = l;	 Catch:{ RuntimeException -> 0x01a8 }
        r6 = r6.left;	 Catch:{ RuntimeException -> 0x01a8 }
        r3 = r3 + r6;
        r6 = r5.m;	 Catch:{ RuntimeException -> 0x01a8 }
        r7 = l;	 Catch:{ RuntimeException -> 0x01a8 }
        r7 = r7.top;	 Catch:{ RuntimeException -> 0x01a8 }
        r6 = r6 + r7;
        r7 = r5.t;	 Catch:{ RuntimeException -> 0x01a8 }
        r8 = l;	 Catch:{ RuntimeException -> 0x01a8 }
        r8 = r8.right;	 Catch:{ RuntimeException -> 0x01a8 }
        r7 = r7 + r8;
        r8 = l;	 Catch:{ RuntimeException -> 0x01a8 }
        r8 = r8.bottom;	 Catch:{ RuntimeException -> 0x01a8 }
        r8 = r8 + r0;
        com.whatsapp.aam.a(r10, r3, r6, r7, r8);	 Catch:{ RuntimeException -> 0x01a8 }
        if (r4 == 0) goto L_0x0110;
    L_0x00ea:
        r3 = com.whatsapp.App.a1();	 Catch:{ RuntimeException -> 0x01aa }
        if (r3 == 0) goto L_0x01ac;
    L_0x00f0:
        r10.setGravity(r1);
        r1 = r5.t;
        r2 = n;
        r2 = r2.left;
        r1 = r1 + r2;
        r2 = r5.m;
        r3 = n;
        r3 = r3.top;
        r2 = r2 + r3;
        r3 = r5.t;
        r5 = n;
        r5 = r5.right;
        r3 = r3 + r5;
        r5 = n;
        r5 = r5.bottom;
        r0 = r0 + r5;
        com.whatsapp.aam.a(r10, r1, r2, r3, r0);
    L_0x0110:
        r0 = r10.E;
        r10.setBackgroundDrawable(r0);
        r0 = r10.getResources();
        r1 = 2131427448; // 0x7f0b0078 float:1.8476513E38 double:1.0530650787E-314;
        r0 = r0.getDimension(r1);
        r0 = (int) r0;
        r10.setMinimumHeight(r0);
        r10.setLongClickable(r9);
    L_0x0127:
        r0 = 2131755530; // 0x7f10020a float:1.9141942E38 double:1.0532271727E-314;
        r0 = r10.findViewById(r0);	 Catch:{ RuntimeException -> 0x01af }
        r0 = (android.widget.TextView) r0;	 Catch:{ RuntimeException -> 0x01af }
        r10.x = r0;	 Catch:{ RuntimeException -> 0x01af }
        r0 = 2131755352; // 0x7f100158 float:1.914158E38 double:1.053227085E-314;
        r0 = r10.findViewById(r0);	 Catch:{ RuntimeException -> 0x01af }
        r0 = (android.widget.ImageView) r0;	 Catch:{ RuntimeException -> 0x01af }
        r10.u = r0;	 Catch:{ RuntimeException -> 0x01af }
        r0 = 2131755521; // 0x7f100201 float:1.9141924E38 double:1.0532271683E-314;
        r0 = r10.findViewById(r0);	 Catch:{ RuntimeException -> 0x01af }
        r10.w = r0;	 Catch:{ RuntimeException -> 0x01af }
        r0 = 2131755529; // 0x7f100209 float:1.914194E38 double:1.053227172E-314;
        r0 = r10.findViewById(r0);	 Catch:{ RuntimeException -> 0x01af }
        r0 = (android.view.ViewGroup) r0;	 Catch:{ RuntimeException -> 0x01af }
        r10.O = r0;	 Catch:{ RuntimeException -> 0x01af }
        r10.b(r12);	 Catch:{ RuntimeException -> 0x01af }
        r0 = r10.K;	 Catch:{ RuntimeException -> 0x01af }
        r10.setOnLongClickListener(r0);	 Catch:{ RuntimeException -> 0x01af }
        r0 = M;	 Catch:{ RuntimeException -> 0x01af }
        if (r0 != 0) goto L_0x0179;
    L_0x015d:
        r0 = new android.graphics.Paint;	 Catch:{ RuntimeException -> 0x01af }
        r0.<init>();	 Catch:{ RuntimeException -> 0x01af }
        M = r0;	 Catch:{ RuntimeException -> 0x01af }
        r0 = M;	 Catch:{ RuntimeException -> 0x01af }
        r1 = 1295234533; // 0x4d33b5e5 float:1.88440144E8 double:6.39930886E-315;
        r0.setColor(r1);	 Catch:{ RuntimeException -> 0x01af }
        r0 = M;	 Catch:{ RuntimeException -> 0x01af }
        r1 = android.graphics.Paint.Style.FILL;	 Catch:{ RuntimeException -> 0x01af }
        r0.setStyle(r1);	 Catch:{ RuntimeException -> 0x01af }
        r0 = M;	 Catch:{ RuntimeException -> 0x01af }
        r1 = 1;
        r0.setAntiAlias(r1);	 Catch:{ RuntimeException -> 0x01af }
    L_0x0179:
        r0 = r10.r();	 Catch:{ RuntimeException -> 0x01b1 }
        if (r0 == 0) goto L_0x0191;
    L_0x017f:
        r10.j();	 Catch:{ RuntimeException -> 0x01b3 }
        r0 = r10.G;	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r10.k();	 Catch:{ RuntimeException -> 0x01b3 }
        r1 = r1.b(r12);	 Catch:{ RuntimeException -> 0x01b3 }
        r0.setSelected(r1);	 Catch:{ RuntimeException -> 0x01b3 }
        if (r4 == 0) goto L_0x0194;
    L_0x0191:
        r10.o();	 Catch:{ RuntimeException -> 0x01b3 }
    L_0x0194:
        return;
    L_0x0195:
        r0 = move-exception;
        throw r0;
    L_0x0197:
        r0 = r5.m;
        goto L_0x0096;
    L_0x019b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x019d }
    L_0x019d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x019f }
    L_0x019f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01a1 }
    L_0x01a1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01a3 }
    L_0x01a3:
        r0 = move-exception;
        throw r0;
    L_0x01a5:
        r3 = r1;
        goto L_0x00c8;
    L_0x01a8:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01aa }
    L_0x01aa:
        r0 = move-exception;
        throw r0;
    L_0x01ac:
        r1 = r2;
        goto L_0x00f0;
    L_0x01af:
        r0 = move-exception;
        throw r0;
    L_0x01b1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01b3 }
    L_0x01b3:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.<init>(android.content.Context, com.whatsapp.protocol.co):void");
    }

    public void a(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r10) {
        /*
        r9 = this;
        r0 = r9.v;	 Catch:{ RuntimeException -> 0x0063 }
        if (r0 == 0) goto L_0x0062;
    L_0x0004:
        if (r10 == 0) goto L_0x0031;
    L_0x0006:
        r0 = new android.view.animation.ScaleAnimation;
        r1 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 1;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = 1;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = new android.view.animation.OvershootInterpolator;
        r1.<init>();
        r0.setInterpolator(r1);
        r1 = r9.v;
        r1 = r1.getViewTreeObserver();
        r2 = new com.whatsapp.akp;
        r2.<init>(r9);
        r1.addOnPreDrawListener(r2);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0058;
    L_0x0031:
        r0 = new android.view.animation.ScaleAnimation;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = 0;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        r5 = 1;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = 1;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = r9.v;
        r2 = 0;
        r1.setVisibility(r2);
        r1 = new com.whatsapp.a5g;
        r1.<init>(r9);
        r0.setAnimationListener(r1);
        r1 = new android.view.animation.AnticipateInterpolator;
        r1.<init>();
        r0.setInterpolator(r1);
    L_0x0058:
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0.setDuration(r2);
        r1 = r9.v;
        r1.startAnimation(r0);
    L_0x0062:
        return;
    L_0x0063:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.a(boolean):void");
    }

    static ImageView c(ConversationRow conversationRow) {
        return conversationRow.y;
    }

    void o() {
        try {
            if (this.G != null) {
                this.G.setVisibility(8);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void b(boolean z) {
        if (z) {
            try {
                this.H = (TextView) findViewById(2131755520);
                this.H.setText(cs.b(getContext(), this.e.b));
                this.H.setTextSize(b(getResources()));
                this.H.setVisibility(0);
                this.s = true;
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        findViewById(2131755520).setVisibility(8);
        this.s = false;
    }

    public final void l() {
        Handler handler = getHandler();
        if (handler == null) {
            try {
                removeCallbacks(this.z);
                post(this.z);
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        if (!handler.hasMessages(0, this.z)) {
            Message obtain = Message.obtain(handler, this.z);
            obtain.what = 0;
            obtain.obj = this.z;
            obtain.sendToTarget();
        }
    }

    void j() {
        try {
            if (this.G != null) {
                this.G.setVisibility(0);
                return;
            }
            this.G = new 4(this, getContext());
            this.G.setClickable(true);
            this.G.setOnClickListener(new gy(this));
            setClipToPadding(false);
            addView(this.G, new LayoutParams(-1, -1));
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.whatsapp.protocol.co r9) {
        /*
        r2 = 0;
        r1 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        if (r3 == 0) goto L_0x00ae;
    L_0x000c:
        r0 = com.whatsapp.App.aK;	 Catch:{ RuntimeException -> 0x00af }
        r4 = r9.k;	 Catch:{ RuntimeException -> 0x00af }
        r4 = r4.c;	 Catch:{ RuntimeException -> 0x00af }
        r0 = r0.k(r4);	 Catch:{ RuntimeException -> 0x00af }
        if (r0 != r1) goto L_0x001a;
    L_0x0018:
        if (r3 == 0) goto L_0x00ae;
    L_0x001a:
        r0 = r9.k;
        r0 = r0.c;
        r4 = com.whatsapp.qa.d(r0);
        r0 = r4.c();	 Catch:{ RuntimeException -> 0x00b1 }
        if (r0 == 0) goto L_0x0079;
    L_0x0028:
        r0 = r9.t;	 Catch:{ RuntimeException -> 0x00b1 }
        if (r0 == 0) goto L_0x0077;
    L_0x002c:
        r0 = com.whatsapp.App.as;
        r5 = r9.t;
        r5 = r0.b(r5);
        r0 = com.whatsapp.App.as;
        r6 = r4.a();
        r6 = r0.b(r6);
        r0 = com.whatsapp.App.ay;	 Catch:{ RuntimeException -> 0x00b3 }
        if (r0 == 0) goto L_0x00b5;
    L_0x0042:
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00b3 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x00b3 }
        r7 = com.whatsapp.App.ay;	 Catch:{ RuntimeException -> 0x00b3 }
        r7 = r7.jabber_id;	 Catch:{ RuntimeException -> 0x00b3 }
        r0 = r0.append(r7);	 Catch:{ RuntimeException -> 0x00b3 }
        r7 = Q;	 Catch:{ RuntimeException -> 0x00b3 }
        r8 = 5;
        r7 = r7[r8];	 Catch:{ RuntimeException -> 0x00b3 }
        r0 = r0.append(r7);	 Catch:{ RuntimeException -> 0x00b3 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x00b3 }
    L_0x005c:
        r7 = r4.p;	 Catch:{ RuntimeException -> 0x00b9 }
        r7 = com.whatsapp.qm.f(r7);	 Catch:{ RuntimeException -> 0x00b9 }
        if (r7 != 0) goto L_0x0074;
    L_0x0064:
        r7 = r6.l;	 Catch:{ RuntimeException -> 0x00bb }
        if (r7 != 0) goto L_0x0074;
    L_0x0068:
        r6 = r6.p;	 Catch:{ RuntimeException -> 0x00bd }
        r0 = r0.equals(r6);	 Catch:{ RuntimeException -> 0x00bd }
        if (r0 != 0) goto L_0x0074;
    L_0x0070:
        r0 = r5.l;	 Catch:{ RuntimeException -> 0x00bf }
        if (r0 == 0) goto L_0x00c1;
    L_0x0074:
        r0 = r1;
    L_0x0075:
        if (r3 == 0) goto L_0x00cb;
    L_0x0077:
        if (r3 == 0) goto L_0x00cd;
    L_0x0079:
        r0 = r4.l;	 Catch:{ RuntimeException -> 0x00c3 }
        if (r0 == 0) goto L_0x00c5;
    L_0x007d:
        r0 = r1;
    L_0x007e:
        if (r0 != 0) goto L_0x00cb;
    L_0x0080:
        r4 = r9.k;	 Catch:{ RuntimeException -> 0x00c7 }
        r4 = r4.c;	 Catch:{ RuntimeException -> 0x00c7 }
        if (r4 == 0) goto L_0x00cb;
    L_0x0086:
        r0 = r9.k;
        r0 = r0.c;
        r4 = Q;
        r5 = 6;
        r4 = r4[r5];
        r4 = r0.indexOf(r4);
        r0 = r1;
        r1 = r2;
    L_0x0095:
        if (r1 >= r4) goto L_0x00c9;
    L_0x0097:
        r5 = r9.k;
        r5 = r5.c;
        r5 = r5.charAt(r1);
        r5 = java.lang.Character.isDigit(r5);
        if (r5 == 0) goto L_0x00a8;
    L_0x00a5:
        if (r3 == 0) goto L_0x00ad;
    L_0x00a7:
        r0 = r2;
    L_0x00a8:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0095;
    L_0x00ac:
        r2 = r0;
    L_0x00ad:
        r1 = r2;
    L_0x00ae:
        return r1;
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;
    L_0x00b3:
        r0 = move-exception;
        throw r0;
    L_0x00b5:
        r0 = "";
        goto L_0x005c;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = r2;
        goto L_0x0075;
    L_0x00c3:
        r0 = move-exception;
        throw r0;
    L_0x00c5:
        r0 = r2;
        goto L_0x007e;
    L_0x00c7:
        r0 = move-exception;
        throw r0;
    L_0x00c9:
        r2 = r0;
        goto L_0x00ad;
    L_0x00cb:
        r1 = r0;
        goto L_0x00ae;
    L_0x00cd:
        r1 = r2;
        goto L_0x00ae;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.a(com.whatsapp.protocol.co):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
        r10 = this;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        super.onLayout(r11, r12, r13, r14, r15);	 Catch:{ RuntimeException -> 0x0168 }
        r0 = r10.G;	 Catch:{ RuntimeException -> 0x0168 }
        if (r0 == 0) goto L_0x0019;
    L_0x000a:
        r0 = r10.G;	 Catch:{ RuntimeException -> 0x0168 }
        r1 = 0;
        r4 = 0;
        r5 = r10.getWidth();	 Catch:{ RuntimeException -> 0x0168 }
        r6 = r10.getHeight();	 Catch:{ RuntimeException -> 0x0168 }
        r0.layout(r1, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0168 }
    L_0x0019:
        r0 = r10.w;	 Catch:{ RuntimeException -> 0x016a }
        if (r0 == 0) goto L_0x00b5;
    L_0x001d:
        r0 = r10.w;	 Catch:{ RuntimeException -> 0x016a }
        r0 = r0.getVisibility();	 Catch:{ RuntimeException -> 0x016a }
        if (r0 != 0) goto L_0x00b5;
    L_0x0025:
        r0 = r10.w;
        r0 = r0.getParent();
        r0 = (android.view.View) r0;
        r1 = 2131755523; // 0x7f100203 float:1.9141928E38 double:1.053227169E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r4 = r10.w;	 Catch:{ RuntimeException -> 0x016c }
        r5 = r0.getPaddingLeft();	 Catch:{ RuntimeException -> 0x016c }
        r6 = r0.getPaddingTop();	 Catch:{ RuntimeException -> 0x016c }
        r7 = r0.getWidth();	 Catch:{ RuntimeException -> 0x016c }
        r8 = r0.getPaddingRight();	 Catch:{ RuntimeException -> 0x016c }
        r7 = r7 - r8;
        r0 = r0.getPaddingTop();	 Catch:{ RuntimeException -> 0x016c }
        r8 = r10.w;	 Catch:{ RuntimeException -> 0x016c }
        r8 = r8.getMeasuredHeight();	 Catch:{ RuntimeException -> 0x016c }
        r0 = r0 + r8;
        r4.layout(r5, r6, r7, r0);	 Catch:{ RuntimeException -> 0x016c }
        r0 = com.whatsapp.App.av;	 Catch:{ RuntimeException -> 0x016c }
        if (r0 == 0) goto L_0x0082;
    L_0x005b:
        r0 = r10.w;	 Catch:{ RuntimeException -> 0x016e }
        r0 = r0.getPaddingLeft();	 Catch:{ RuntimeException -> 0x016e }
        r4 = r10.w;	 Catch:{ RuntimeException -> 0x016e }
        r4 = r4.getPaddingTop();	 Catch:{ RuntimeException -> 0x016e }
        r5 = r10.w;	 Catch:{ RuntimeException -> 0x016e }
        r5 = r5.getPaddingLeft();	 Catch:{ RuntimeException -> 0x016e }
        r6 = r1.getWidth();	 Catch:{ RuntimeException -> 0x016e }
        r5 = r5 + r6;
        r6 = r10.w;	 Catch:{ RuntimeException -> 0x016e }
        r6 = r6.getPaddingTop();	 Catch:{ RuntimeException -> 0x016e }
        r7 = r1.getHeight();	 Catch:{ RuntimeException -> 0x016e }
        r6 = r6 + r7;
        r1.layout(r0, r4, r5, r6);	 Catch:{ RuntimeException -> 0x016e }
        if (r3 == 0) goto L_0x00b5;
    L_0x0082:
        r0 = r10.w;	 Catch:{ RuntimeException -> 0x016e }
        r0 = r0.getWidth();	 Catch:{ RuntimeException -> 0x016e }
        r4 = r10.w;	 Catch:{ RuntimeException -> 0x016e }
        r4 = r4.getPaddingRight();	 Catch:{ RuntimeException -> 0x016e }
        r0 = r0 - r4;
        r4 = r1.getWidth();	 Catch:{ RuntimeException -> 0x016e }
        r0 = r0 - r4;
        r4 = r10.w;	 Catch:{ RuntimeException -> 0x016e }
        r4 = r4.getPaddingTop();	 Catch:{ RuntimeException -> 0x016e }
        r5 = r10.w;	 Catch:{ RuntimeException -> 0x016e }
        r5 = r5.getWidth();	 Catch:{ RuntimeException -> 0x016e }
        r6 = r10.w;	 Catch:{ RuntimeException -> 0x016e }
        r6 = r6.getPaddingRight();	 Catch:{ RuntimeException -> 0x016e }
        r5 = r5 - r6;
        r6 = r10.w;	 Catch:{ RuntimeException -> 0x016e }
        r6 = r6.getPaddingTop();	 Catch:{ RuntimeException -> 0x016e }
        r7 = r1.getHeight();	 Catch:{ RuntimeException -> 0x016e }
        r6 = r6 + r7;
        r1.layout(r0, r4, r5, r6);	 Catch:{ RuntimeException -> 0x016e }
    L_0x00b5:
        r0 = r10.y;
        if (r0 == 0) goto L_0x010f;
    L_0x00b9:
        r0 = r10.y;
        r0 = r0.getDrawable();
        r0 = r0.getIntrinsicWidth();
        r1 = r10.y;
        r1 = r1.getDrawable();
        r1 = r1.getIntrinsicHeight();
        r4 = 1;
        r4 = r10.getChildAt(r4);
        r4 = r4.getTop();
        r5 = r10.getPaddingTop();
        r5 = r5 / 2;
        r4 = r4 - r5;
        r5 = com.whatsapp.a4d.a();
        r5 = r5.t;
        r6 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r7 = com.whatsapp.a4d.a();
        r7 = r7.g;
        r6 = r6 * r7;
        r6 = (int) r6;
        r5 = r5 + r6;
        r6 = com.whatsapp.App.a1();	 Catch:{ RuntimeException -> 0x0170 }
        if (r6 == 0) goto L_0x0108;
    L_0x00f4:
        r6 = r10.y;	 Catch:{ RuntimeException -> 0x0172 }
        r7 = r10.getWidth();	 Catch:{ RuntimeException -> 0x0172 }
        r7 = r7 - r0;
        r7 = r7 - r5;
        r8 = r10.getWidth();	 Catch:{ RuntimeException -> 0x0172 }
        r8 = r8 - r5;
        r9 = r4 + r1;
        r6.layout(r7, r4, r8, r9);	 Catch:{ RuntimeException -> 0x0172 }
        if (r3 == 0) goto L_0x010f;
    L_0x0108:
        r6 = r10.y;	 Catch:{ RuntimeException -> 0x0172 }
        r0 = r0 + r5;
        r1 = r1 + r4;
        r6.layout(r5, r4, r0, r1);	 Catch:{ RuntimeException -> 0x0172 }
    L_0x010f:
        r0 = r10.i;	 Catch:{ RuntimeException -> 0x0174 }
        if (r0 == 0) goto L_0x0167;
    L_0x0113:
        r0 = r10.e;	 Catch:{ RuntimeException -> 0x0174 }
        r0 = r0.k;	 Catch:{ RuntimeException -> 0x0174 }
        r0 = r0.a;	 Catch:{ RuntimeException -> 0x0174 }
        if (r0 == 0) goto L_0x0167;
    L_0x011b:
        r1 = r10.getChildCount();
        r0 = r2;
    L_0x0120:
        if (r0 >= r1) goto L_0x0167;
    L_0x0122:
        r2 = r10.getChildAt(r0);
        r4 = r2.getVisibility();	 Catch:{ RuntimeException -> 0x0176 }
        r5 = 8;
        if (r4 == r5) goto L_0x0163;
    L_0x012e:
        r4 = r10.G;	 Catch:{ RuntimeException -> 0x0178 }
        if (r2 == r4) goto L_0x0163;
    L_0x0132:
        r4 = r10.getPaddingLeft();	 Catch:{ RuntimeException -> 0x0178 }
        r5 = r10.getWidth();	 Catch:{ RuntimeException -> 0x0178 }
        r4 = r4 + r5;
        r5 = r2.getRight();	 Catch:{ RuntimeException -> 0x0178 }
        r4 = r4 - r5;
        r5 = r10.getPaddingRight();	 Catch:{ RuntimeException -> 0x0178 }
        r4 = r4 - r5;
        r5 = r2.getTop();	 Catch:{ RuntimeException -> 0x0178 }
        r6 = r10.getPaddingLeft();	 Catch:{ RuntimeException -> 0x0178 }
        r7 = r10.getWidth();	 Catch:{ RuntimeException -> 0x0178 }
        r6 = r6 + r7;
        r7 = r2.getLeft();	 Catch:{ RuntimeException -> 0x0178 }
        r6 = r6 - r7;
        r7 = r10.getPaddingRight();	 Catch:{ RuntimeException -> 0x0178 }
        r6 = r6 - r7;
        r7 = r2.getBottom();	 Catch:{ RuntimeException -> 0x0178 }
        r2.layout(r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0178 }
    L_0x0163:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0120;
    L_0x0167:
        return;
    L_0x0168:
        r0 = move-exception;
        throw r0;
    L_0x016a:
        r0 = move-exception;
        throw r0;
    L_0x016c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x016e }
    L_0x016e:
        r0 = move-exception;
        throw r0;
    L_0x0170:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0172 }
    L_0x0172:
        r0 = move-exception;
        throw r0;
    L_0x0174:
        r0 = move-exception;
        throw r0;
    L_0x0176:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0178 }
    L_0x0178:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.onLayout(boolean, int, int, int, int):void");
    }

    protected void m() {
        b2 k = k();
        if (k != null) {
            try {
                k.d(this.e);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    protected void e() {
        if (getContext() instanceof Conversation) {
            Conversation conversation = (Conversation) getContext();
            try {
                if (!qm.i(this.e.k.c)) {
                    return;
                }
                if (!this.e.k.a || this.e.d == 6) {
                    String str;
                    String c = qm.c(this.e);
                    if (c != null) {
                        try {
                            GroupNameDialogFragment.a(c).show(conversation.getSupportFragmentManager(), null);
                            if (!DialogToastActivity.f) {
                                return;
                            }
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (RuntimeException e2) {
                            throw e2;
                        }
                    }
                    StringBuilder append = new StringBuilder().append(Q[9]).append(Log.a(this.e));
                    if (App.am >= 1) {
                        try {
                            if (this.e.u == 0) {
                                str = Q[10] + this.e.c();
                                Log.i(append.append(str).toString());
                            }
                        } catch (RuntimeException e22) {
                            throw e22;
                        }
                    }
                    str = "";
                    Log.i(append.append(str).toString());
                }
            } catch (RuntimeException e222) {
                throw e222;
            } catch (RuntimeException e2222) {
                throw e2222;
            }
        }
    }

    protected b2 k() {
        try {
            return getContext() instanceof b2 ? (b2) getContext() : null;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private boolean r() {
        b2 k = k();
        if (k != null) {
            try {
                if (k.a()) {
                    return true;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return false;
    }

    protected int n() {
        return 2130839648;
    }

    public void i() {
        b(this.e);
    }

    static Paint p() {
        return M;
    }

    private boolean s() {
        try {
            if (this.e.k.a) {
                if (this.e.d < 4) {
                    try {
                        if (this.e.b + 86400000 < App.av()) {
                            try {
                                if (!App.p.aV.contains(this.e.k)) {
                                    return true;
                                }
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        }
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                }
            }
            return false;
        } catch (RuntimeException e22) {
            throw e22;
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(int r9) {
        /*
        r8 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r8.h = r9;	 Catch:{ RuntimeException -> 0x0068 }
        r0 = r8.w;	 Catch:{ RuntimeException -> 0x0068 }
        if (r0 == 0) goto L_0x0026;
    L_0x0008:
        r0 = 1;
        if (r9 > r0) goto L_0x001f;
    L_0x000b:
        r0 = r8.e;	 Catch:{ RuntimeException -> 0x006c }
        r0 = r0.k;	 Catch:{ RuntimeException -> 0x006c }
        r0 = r0.a;	 Catch:{ RuntimeException -> 0x006c }
        if (r0 != 0) goto L_0x001f;
    L_0x0013:
        r0 = r8.a;	 Catch:{ RuntimeException -> 0x006e }
        if (r0 == 0) goto L_0x001f;
    L_0x0017:
        r0 = r8.w;	 Catch:{ RuntimeException -> 0x0070 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ RuntimeException -> 0x0070 }
        if (r2 == 0) goto L_0x0026;
    L_0x001f:
        r0 = r8.w;	 Catch:{ RuntimeException -> 0x0070 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ RuntimeException -> 0x0070 }
    L_0x0026:
        r3 = com.whatsapp.a4d.a();
        r0 = r8.e;	 Catch:{ RuntimeException -> 0x0072 }
        r0 = r0.k;	 Catch:{ RuntimeException -> 0x0072 }
        r0 = r0.a;	 Catch:{ RuntimeException -> 0x0072 }
        if (r0 == 0) goto L_0x0074;
    L_0x0032:
        r0 = l;	 Catch:{ RuntimeException -> 0x0072 }
        r0 = r0.top;	 Catch:{ RuntimeException -> 0x0072 }
    L_0x0036:
        r1 = r8.e;	 Catch:{ RuntimeException -> 0x0079 }
        r1 = r1.k;	 Catch:{ RuntimeException -> 0x0079 }
        r1 = r1.a;	 Catch:{ RuntimeException -> 0x0079 }
        if (r1 == 0) goto L_0x007b;
    L_0x003e:
        r1 = l;	 Catch:{ RuntimeException -> 0x0079 }
        r1 = r1.bottom;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x0042:
        r4 = r8.getPaddingLeft();
        r5 = r8.getPaddingRight();
        r6 = r8.h;	 Catch:{ RuntimeException -> 0x00cb }
        switch(r6) {
            case 1: goto L_0x0080;
            case 2: goto L_0x0099;
            case 3: goto L_0x00b1;
            default: goto L_0x004f;
        };
    L_0x004f:
        r2 = r3.m;	 Catch:{ RuntimeException -> 0x00d1 }
        r0 = r0 + r2;
        r2 = r3.m;	 Catch:{ RuntimeException -> 0x00d1 }
        r1 = r1 + r2;
        r8.setPadding(r4, r0, r5, r1);	 Catch:{ RuntimeException -> 0x00d1 }
        r0 = r8.getResources();	 Catch:{ RuntimeException -> 0x00d1 }
        r1 = 2131427448; // 0x7f0b0078 float:1.8476513E38 double:1.0530650787E-314;
        r0 = r0.getDimension(r1);	 Catch:{ RuntimeException -> 0x00d1 }
        r0 = (int) r0;	 Catch:{ RuntimeException -> 0x00d1 }
        r8.setMinimumHeight(r0);	 Catch:{ RuntimeException -> 0x00d1 }
    L_0x0067:
        return;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = n;
        r0 = r0.top;
        goto L_0x0036;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r1 = n;
        r1 = r1.bottom;
        goto L_0x0042;
    L_0x0080:
        r6 = r3.m;	 Catch:{ RuntimeException -> 0x00cd }
        r6 = r6 + r0;
        r7 = r3.u;	 Catch:{ RuntimeException -> 0x00cd }
        r8.setPadding(r4, r6, r5, r7);	 Catch:{ RuntimeException -> 0x00cd }
        r6 = r8.getResources();	 Catch:{ RuntimeException -> 0x00cd }
        r7 = 2131427449; // 0x7f0b0079 float:1.8476515E38 double:1.053065079E-314;
        r6 = r6.getDimension(r7);	 Catch:{ RuntimeException -> 0x00cd }
        r6 = (int) r6;	 Catch:{ RuntimeException -> 0x00cd }
        r8.setMinimumHeight(r6);	 Catch:{ RuntimeException -> 0x00cd }
        if (r2 == 0) goto L_0x0067;
    L_0x0099:
        r6 = r3.u;	 Catch:{ RuntimeException -> 0x00cf }
        r7 = r3.u;	 Catch:{ RuntimeException -> 0x00cf }
        r8.setPadding(r4, r6, r5, r7);	 Catch:{ RuntimeException -> 0x00cf }
        r6 = r8.getResources();	 Catch:{ RuntimeException -> 0x00cf }
        r7 = 2131427449; // 0x7f0b0079 float:1.8476515E38 double:1.053065079E-314;
        r6 = r6.getDimension(r7);	 Catch:{ RuntimeException -> 0x00cf }
        r6 = (int) r6;	 Catch:{ RuntimeException -> 0x00cf }
        r8.setMinimumHeight(r6);	 Catch:{ RuntimeException -> 0x00cf }
        if (r2 == 0) goto L_0x0067;
    L_0x00b1:
        r6 = r3.u;	 Catch:{ RuntimeException -> 0x00d1 }
        r7 = r3.m;	 Catch:{ RuntimeException -> 0x00d1 }
        r7 = r7 + r1;
        r8.setPadding(r4, r6, r5, r7);	 Catch:{ RuntimeException -> 0x00d1 }
        r6 = r8.getResources();	 Catch:{ RuntimeException -> 0x00d1 }
        r7 = 2131427449; // 0x7f0b0079 float:1.8476515E38 double:1.053065079E-314;
        r6 = r6.getDimension(r7);	 Catch:{ RuntimeException -> 0x00d1 }
        r6 = (int) r6;	 Catch:{ RuntimeException -> 0x00d1 }
        r8.setMinimumHeight(r6);	 Catch:{ RuntimeException -> 0x00d1 }
        if (r2 == 0) goto L_0x0067;
    L_0x00ca:
        goto L_0x004f;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.b(int):void");
    }

    public CharSequence a(CharSequence charSequence) {
        try {
            if (TextUtils.isEmpty(charSequence)) {
                return charSequence;
            }
            try {
                SpannableStringBuilder spannableStringBuilder;
                if (charSequence instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) charSequence;
                } else {
                    spannableStringBuilder = null;
                }
                spannableStringBuilder = a(charSequence.toString(), spannableStringBuilder);
                if (spannableStringBuilder != null) {
                    return spannableStringBuilder;
                }
                return charSequence;
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static float b(android.content.res.Resources r3) {
        /*
        r0 = L;
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x0018;
    L_0x0007:
        r0 = r3.getDisplayMetrics();
        r0 = r0.scaledDensity;
        r1 = 2131427438; // 0x7f0b006e float:1.8476492E38 double:1.0530650737E-314;
        r1 = r3.getDimension(r1);
        r0 = r1 / r0;
        L = r0;
    L_0x0018:
        r0 = 0;
        r1 = com.whatsapp.preference.WaFontListPreference.b;
        r2 = -1;
        if (r1 != r2) goto L_0x0023;
    L_0x001e:
        r0 = -2;
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ RuntimeException -> 0x002e }
        if (r1 == 0) goto L_0x0029;
    L_0x0023:
        r1 = com.whatsapp.preference.WaFontListPreference.b;	 Catch:{ RuntimeException -> 0x002e }
        r2 = 1;
        if (r1 != r2) goto L_0x0029;
    L_0x0028:
        r0 = 4;
    L_0x0029:
        r1 = L;
        r0 = (float) r0;
        r0 = r0 + r1;
        return r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.b(android.content.res.Resources):float");
    }

    static ImageView a(ConversationRow conversationRow) {
        return conversationRow.v;
    }

    public int a() {
        try {
            return this.w != null ? this.w.getMeasuredHeight() : 0;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static int c() {
        return A;
    }

    static View b(ConversationRow conversationRow) {
        return conversationRow.G;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int a(int r5) {
        /*
        r4 = this;
        r0 = 2130839652; // 0x7f020864 float:1.728432E38 double:1.052774669E-314;
        r2 = com.whatsapp.DialogToastActivity.f;
        r1 = 13;
        r1 = com.whatsapp.protocol.b7.a(r5, r1);
        if (r1 < 0) goto L_0x0012;
    L_0x000d:
        r1 = 2130839642; // 0x7f02085a float:1.72843E38 double:1.052774664E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x0012:
        r1 = 5;
        r1 = com.whatsapp.protocol.b7.a(r5, r1);	 Catch:{ RuntimeException -> 0x0034 }
        if (r1 < 0) goto L_0x001e;
    L_0x0019:
        r1 = 2130839646; // 0x7f02085e float:1.7284308E38 double:1.052774666E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x001e:
        r1 = 4;
        r1 = com.whatsapp.protocol.b7.a(r5, r1);	 Catch:{ RuntimeException -> 0x0036 }
        if (r1 != 0) goto L_0x002a;
    L_0x0025:
        r1 = 2130839644; // 0x7f02085c float:1.7284304E38 double:1.052774665E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x002a:
        r1 = r0;
    L_0x002b:
        r2 = com.whatsapp.App.am;	 Catch:{ RuntimeException -> 0x0038 }
        r3 = 3;
        if (r2 != r3) goto L_0x003a;
    L_0x0030:
        r2 = 7;
        if (r5 != r2) goto L_0x003a;
    L_0x0033:
        return r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r0 = r1;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.a(int):int");
    }

    public SpannableStringBuilder a(String str, SpannableStringBuilder spannableStringBuilder) {
        try {
            if (TextUtils.isEmpty(str)) {
                return spannableStringBuilder;
            }
            b2 k = k();
            if (k == null) {
                return spannableStringBuilder;
            }
            List d = k.d();
            if (d == null) {
                return spannableStringBuilder;
            }
            try {
                if (d.isEmpty()) {
                    return spannableStringBuilder;
                }
                SpannableStringBuilder spannableStringBuilder2;
                CharSequence a = bw.a(getContext(), spannableStringBuilder, str, d, bw.b);
                if (a instanceof SpannableStringBuilder) {
                    spannableStringBuilder2 = (SpannableStringBuilder) a;
                } else {
                    spannableStringBuilder2 = spannableStringBuilder;
                }
                return spannableStringBuilder2;
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float a(android.content.res.Resources r4, int r5) {
        /*
        r1 = 4;
        r0 = B;
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0019;
    L_0x0008:
        r0 = r4.getDisplayMetrics();
        r0 = r0.scaledDensity;
        r2 = 2131427454; // 0x7f0b007e float:1.8476525E38 double:1.0530650816E-314;
        r2 = r4.getDimension(r2);
        r0 = r2 / r0;
        B = r0;
    L_0x0019:
        r0 = 0;
        r2 = -1;
        if (r5 != r2) goto L_0x0022;
    L_0x001d:
        r0 = -2;
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ RuntimeException -> 0x004b }
        if (r2 == 0) goto L_0x0026;
    L_0x0022:
        r2 = 1;
        if (r5 != r2) goto L_0x0026;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        r1 = com.whatsapp.aqu.g();	 Catch:{ RuntimeException -> 0x004d }
        r2 = Q;	 Catch:{ RuntimeException -> 0x004d }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x004d }
        r1 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x004d }
        if (r1 != 0) goto L_0x0044;
    L_0x0035:
        r1 = com.whatsapp.aqu.g();	 Catch:{ RuntimeException -> 0x004f }
        r2 = Q;	 Catch:{ RuntimeException -> 0x004f }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x004f }
        r1 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x004f }
        if (r1 == 0) goto L_0x0046;
    L_0x0044:
        r0 = r0 + 1;
    L_0x0046:
        r1 = B;
        r0 = (float) r0;
        r0 = r0 + r1;
        return r0;
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.a(android.content.res.Resources, int):float");
    }

    public void a(co coVar, boolean z) {
        try {
            if (this.e != coVar || z) {
                b(coVar);
            }
            try {
                if (r()) {
                    j();
                    this.G.setSelected(k().b(this.e));
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                o();
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.protocol.co r12) {
        /*
        r11 = this;
        r10 = -2;
        r9 = 1103101952; // 0x41c00000 float:24.0 double:5.450047783E-315;
        r8 = 1104674816; // 0x41d80000 float:27.0 double:5.457818764E-315;
        r1 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.e;	 Catch:{ RuntimeException -> 0x03c4 }
        if (r12 == r0) goto L_0x03c6;
    L_0x000c:
        r0 = 1;
    L_0x000d:
        r11.e = r12;	 Catch:{ RuntimeException -> 0x03c9 }
        r11.setTag(r12);	 Catch:{ RuntimeException -> 0x03c9 }
        r2 = r11.s();	 Catch:{ RuntimeException -> 0x03c9 }
        if (r2 == 0) goto L_0x0061;
    L_0x0018:
        r2 = r11.y;	 Catch:{ RuntimeException -> 0x03c9 }
        if (r2 != 0) goto L_0x0054;
    L_0x001c:
        r2 = new android.widget.ImageView;
        r3 = r11.getContext();
        r2.<init>(r3);
        r11.y = r2;
        r2 = r11.y;
        r3 = android.widget.ImageView.ScaleType.CENTER;
        r2.setScaleType(r3);
        r2 = r11.y;
        r3 = 2130839529; // 0x7f0207e9 float:1.7284071E38 double:1.052774608E-314;
        r2.setImageResource(r3);
        r2 = r11.getContext();
        r2 = r2.getResources();
        r3 = 2131427449; // 0x7f0b0079 float:1.8476515E38 double:1.053065079E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r3 = r11.y;
        r11.addView(r3, r2, r2);
        r2 = r11.y;
        r3 = new com.whatsapp.yx;
        r3.<init>(r11, r12);
        r2.setOnClickListener(r3);
    L_0x0054:
        r2 = r11.u;	 Catch:{ RuntimeException -> 0x03cb }
        if (r2 == 0) goto L_0x0077;
    L_0x0058:
        r2 = r11.u;	 Catch:{ RuntimeException -> 0x03cd }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ RuntimeException -> 0x03cd }
        if (r4 == 0) goto L_0x0077;
    L_0x0061:
        r2 = r11.y;	 Catch:{ RuntimeException -> 0x03cf }
        if (r2 == 0) goto L_0x006d;
    L_0x0065:
        r2 = r11.y;	 Catch:{ RuntimeException -> 0x03cf }
        r11.removeView(r2);	 Catch:{ RuntimeException -> 0x03cf }
        r2 = 0;
        r11.y = r2;	 Catch:{ RuntimeException -> 0x03cf }
    L_0x006d:
        r2 = r11.u;	 Catch:{ RuntimeException -> 0x03d1 }
        if (r2 == 0) goto L_0x0077;
    L_0x0071:
        r2 = r11.u;	 Catch:{ RuntimeException -> 0x03d1 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ RuntimeException -> 0x03d1 }
    L_0x0077:
        r2 = com.whatsapp.a4d.a();	 Catch:{ RuntimeException -> 0x03d3 }
        r3 = r2.t;	 Catch:{ RuntimeException -> 0x03d3 }
        r2 = r12.k;	 Catch:{ RuntimeException -> 0x03d3 }
        r2 = r2.a;	 Catch:{ RuntimeException -> 0x03d3 }
        if (r2 == 0) goto L_0x03d5;
    L_0x0083:
        r2 = l;	 Catch:{ RuntimeException -> 0x03d3 }
        r2 = r2.right;	 Catch:{ RuntimeException -> 0x03d3 }
    L_0x0087:
        r3 = r3 + r2;
        r2 = r11.y;
        if (r2 == 0) goto L_0x0414;
    L_0x008c:
        r2 = com.whatsapp.a4d.a();
        r2 = r2.o;
        r2 = r2 + r3;
    L_0x0093:
        r5 = r11.i;
        if (r5 == 0) goto L_0x009e;
    L_0x0097:
        r5 = com.whatsapp.a4d.a();
        r5 = r5.z;
        r3 = r3 + r5;
    L_0x009e:
        com.whatsapp.aam.a(r11, r3, r2);	 Catch:{ RuntimeException -> 0x03db }
        r2 = r11.x;	 Catch:{ RuntimeException -> 0x03db }
        if (r2 == 0) goto L_0x00e0;
    L_0x00a5:
        r2 = r11.x;	 Catch:{ RuntimeException -> 0x03dd }
        r3 = r11.getContext();	 Catch:{ RuntimeException -> 0x03dd }
        r6 = com.whatsapp.App.o(r12);	 Catch:{ RuntimeException -> 0x03dd }
        r3 = com.whatsapp.util.cs.a(r3, r6);	 Catch:{ RuntimeException -> 0x03dd }
        r2.setText(r3);	 Catch:{ RuntimeException -> 0x03dd }
        r2 = r12.x;	 Catch:{ RuntimeException -> 0x03dd }
        if (r2 == 0) goto L_0x00d7;
    L_0x00ba:
        r2 = r12.k;	 Catch:{ RuntimeException -> 0x03df }
        r2 = r2.a;	 Catch:{ RuntimeException -> 0x03df }
        if (r2 == 0) goto L_0x00d7;
    L_0x00c0:
        r2 = r12.k;	 Catch:{ RuntimeException -> 0x03e1 }
        r2 = r2.c;	 Catch:{ RuntimeException -> 0x03e1 }
        r2 = com.whatsapp.l5.e(r2);	 Catch:{ RuntimeException -> 0x03e1 }
        if (r2 != 0) goto L_0x00d7;
    L_0x00ca:
        r2 = r11.x;	 Catch:{ RuntimeException -> 0x03e3 }
        r3 = 2130837633; // 0x7f020081 float:1.7280226E38 double:1.0527736713E-314;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r2.setCompoundDrawablesWithIntrinsicBounds(r3, r5, r6, r7);	 Catch:{ RuntimeException -> 0x03e3 }
        if (r4 == 0) goto L_0x00e0;
    L_0x00d7:
        r2 = r11.x;	 Catch:{ RuntimeException -> 0x03e3 }
        r3 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r2.setCompoundDrawablesWithIntrinsicBounds(r3, r5, r6, r7);	 Catch:{ RuntimeException -> 0x03e3 }
    L_0x00e0:
        r2 = r11.O;	 Catch:{ RuntimeException -> 0x03e5 }
        if (r2 == 0) goto L_0x0138;
    L_0x00e4:
        r2 = r12.P;	 Catch:{ RuntimeException -> 0x03e7 }
        if (r2 == 0) goto L_0x012d;
    L_0x00e8:
        r2 = r11.v;	 Catch:{ RuntimeException -> 0x03e7 }
        if (r2 != 0) goto L_0x011c;
    L_0x00ec:
        r2 = new android.widget.ImageView;
        r3 = r11.getContext();
        r2.<init>(r3);
        r11.v = r2;
        r2 = new android.widget.LinearLayout$LayoutParams;
        r2.<init>(r10, r10);
        r3 = 16;
        r2.gravity = r3;
        r3 = r11.v;
        r3.setLayoutParams(r2);
        r2 = r11.v;
        r3 = com.whatsapp.a4d.a();
        r3 = r3.j;
        com.whatsapp.aam.a(r2, r1, r3);
        r2 = r11.O;
        r3 = r11.v;
        r2.addView(r3, r1);
        r2 = r11.O;
        r2.setClipChildren(r1);
    L_0x011c:
        r2 = r11.v;	 Catch:{ RuntimeException -> 0x03e9 }
        r3 = r11.n();	 Catch:{ RuntimeException -> 0x03e9 }
        r2.setImageResource(r3);	 Catch:{ RuntimeException -> 0x03e9 }
        r2 = r11.v;	 Catch:{ RuntimeException -> 0x03e9 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ RuntimeException -> 0x03e9 }
        if (r4 == 0) goto L_0x0138;
    L_0x012d:
        r2 = r11.v;	 Catch:{ RuntimeException -> 0x03eb }
        if (r2 == 0) goto L_0x0138;
    L_0x0131:
        r2 = r11.v;	 Catch:{ RuntimeException -> 0x03eb }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ RuntimeException -> 0x03eb }
    L_0x0138:
        r2 = r11.u;	 Catch:{ RuntimeException -> 0x03ed }
        if (r2 == 0) goto L_0x0188;
    L_0x013c:
        r2 = r12.k;	 Catch:{ RuntimeException -> 0x03ef }
        r2 = r2.a;	 Catch:{ RuntimeException -> 0x03ef }
        if (r2 == 0) goto L_0x0188;
    L_0x0142:
        r2 = r12.d;	 Catch:{ RuntimeException -> 0x03f1 }
        r3 = r11.r;	 Catch:{ RuntimeException -> 0x03f1 }
        if (r2 == r3) goto L_0x0188;
    L_0x0148:
        if (r0 != 0) goto L_0x0179;
    L_0x014a:
        r0 = r11.r;	 Catch:{ RuntimeException -> 0x03f5 }
        if (r0 <= 0) goto L_0x0179;
    L_0x014e:
        r0 = r12.d;	 Catch:{ RuntimeException -> 0x03f5 }
        r2 = 13;
        r0 = com.whatsapp.protocol.b7.a(r0, r2);	 Catch:{ RuntimeException -> 0x03f5 }
        if (r0 < 0) goto L_0x0179;
    L_0x0158:
        r0 = new com.whatsapp.sb;
        r2 = r11.u;
        r3 = r12.d;
        r3 = r11.a(r3);
        r0.<init>(r2, r3);
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r0.setDuration(r2);	 Catch:{ RuntimeException -> 0x03f7 }
        r2 = new android.view.animation.DecelerateInterpolator;	 Catch:{ RuntimeException -> 0x03f7 }
        r2.<init>();	 Catch:{ RuntimeException -> 0x03f7 }
        r0.setInterpolator(r2);	 Catch:{ RuntimeException -> 0x03f7 }
        r2 = r11.u;	 Catch:{ RuntimeException -> 0x03f7 }
        r2.startAnimation(r0);	 Catch:{ RuntimeException -> 0x03f7 }
        if (r4 == 0) goto L_0x0184;
    L_0x0179:
        r0 = r11.u;	 Catch:{ RuntimeException -> 0x03f7 }
        r2 = r12.d;	 Catch:{ RuntimeException -> 0x03f7 }
        r2 = r11.a(r2);	 Catch:{ RuntimeException -> 0x03f7 }
        r0.setImageResource(r2);	 Catch:{ RuntimeException -> 0x03f7 }
    L_0x0184:
        r0 = r12.d;
        r11.r = r0;
    L_0x0188:
        r0 = r12.k;	 Catch:{ RuntimeException -> 0x03f9 }
        r0 = r0.a;	 Catch:{ RuntimeException -> 0x03f9 }
        if (r0 != 0) goto L_0x0253;
    L_0x018e:
        r0 = r12.k;	 Catch:{ RuntimeException -> 0x03fb }
        r0 = r0.c;	 Catch:{ RuntimeException -> 0x03fb }
        r0 = com.whatsapp.qm.i(r0);	 Catch:{ RuntimeException -> 0x03fb }
        if (r0 == 0) goto L_0x0253;
    L_0x0198:
        r0 = r11.i;	 Catch:{ RuntimeException -> 0x03fd }
        if (r0 != 0) goto L_0x0253;
    L_0x019c:
        r0 = r12.t;	 Catch:{ RuntimeException -> 0x03fd }
        if (r0 == 0) goto L_0x021b;
    L_0x01a0:
        r0 = 2131755522; // 0x7f100202 float:1.9141926E38 double:1.0532271688E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r2 = r12.k;
        r2 = r2.c;
        r3 = r12.t;
        r2 = com.whatsapp.qm.a(r2, r3);
        if (r2 == 0) goto L_0x01bc;
    L_0x01b5:
        r2 = r2.c;	 Catch:{ RuntimeException -> 0x03ff }
        r0.setTextColor(r2);	 Catch:{ RuntimeException -> 0x03ff }
        if (r4 == 0) goto L_0x01c1;
    L_0x01bc:
        r2 = -1728053248; // 0xffffffff99000000 float:-6.617445E-24 double:NaN;
        r0.setTextColor(r2);	 Catch:{ RuntimeException -> 0x03ff }
    L_0x01c1:
        r2 = r11.getResources();
        r2 = a(r2);
        r2 = r2 * r9;
        r2 = r2 / r8;
        r0.setTextSize(r2);
        com.whatsapp.a4d.a(r0);
        r2 = com.whatsapp.App.as;
        r3 = r12.t;
        r2 = r2.b(r3);
        r0.setContact(r2);
        r0 = 2131755523; // 0x7f100203 float:1.9141928E38 double:1.053227169E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r3 = r2.q;	 Catch:{ RuntimeException -> 0x0401 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ RuntimeException -> 0x0401 }
        if (r3 == 0) goto L_0x0214;
    L_0x01ed:
        r3 = r2.f;	 Catch:{ RuntimeException -> 0x0401 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ RuntimeException -> 0x0401 }
        if (r3 != 0) goto L_0x0214;
    L_0x01f5:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = "~";
        r3 = r3.append(r5);
        r2 = r2.f;
        r2 = r3.append(r2);
        r2 = r2.toString();
        r0.a(r2);	 Catch:{ RuntimeException -> 0x0403 }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ RuntimeException -> 0x0403 }
        if (r4 == 0) goto L_0x0219;
    L_0x0214:
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ RuntimeException -> 0x0403 }
    L_0x0219:
        if (r4 == 0) goto L_0x0239;
    L_0x021b:
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0405 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0405 }
        r2 = Q;	 Catch:{ RuntimeException -> 0x0405 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0405 }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x0405 }
        r2 = com.whatsapp.util.Log.a(r12);	 Catch:{ RuntimeException -> 0x0405 }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x0405 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0405 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x0405 }
    L_0x0239:
        r0 = r11.h;	 Catch:{ RuntimeException -> 0x0407 }
        r2 = 2;
        if (r0 >= r2) goto L_0x0244;
    L_0x023e:
        r0 = r11.w;	 Catch:{ RuntimeException -> 0x0407 }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ RuntimeException -> 0x0407 }
    L_0x0244:
        r0 = r11.w;
        r2 = r11.t;
        r0.setOnClickListener(r2);
        r0 = r11.w;
        r2 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r0.setBackgroundResource(r2);
    L_0x0253:
        r0 = r11.i;	 Catch:{ RuntimeException -> 0x0409 }
        if (r0 == 0) goto L_0x03c3;
    L_0x0257:
        r0 = 0;
        r11.setClipToPadding(r0);	 Catch:{ RuntimeException -> 0x0409 }
        r0 = 0;
        r11.setClipChildren(r0);	 Catch:{ RuntimeException -> 0x0409 }
        r0 = r11.D;	 Catch:{ RuntimeException -> 0x0409 }
        if (r0 != 0) goto L_0x0338;
    L_0x0263:
        r0 = 2131755520; // 0x7f100200 float:1.9141922E38 double:1.053227168E-314;
        r3 = r11.findViewById(r0);
        r0 = r11.getContext();
        r0 = android.view.LayoutInflater.from(r0);
        r2 = 2130903276; // 0x7f0300ec float:1.7413365E38 double:1.0528061033E-314;
        r5 = 0;
        r0 = com.whatsapp.aam.a(r0, r2, r5);
        r11.D = r0;
        r0 = r11.D;
        r0 = (android.view.ViewGroup) r0;
        r0.setClipToPadding(r1);
        r0 = r11.D;
        r0 = (android.view.ViewGroup) r0;
        r0.setClipChildren(r1);
        r0 = r11.D;
        r2 = 2131755902; // 0x7f10037e float:1.9142696E38 double:1.0532273565E-314;
        r0 = r0.findViewById(r2);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r11.J = r0;
        r0 = r11.J;
        r2 = r11.getResources();
        r2 = a(r2);
        r2 = r2 * r9;
        r2 = r2 / r8;
        r0.setTextSize(r2);
        r0 = r11.J;
        com.whatsapp.a4d.a(r0);
        r0 = r11.D;
        r2 = 2131755904; // 0x7f100380 float:1.91427E38 double:1.0532273575E-314;
        r0 = r0.findViewById(r2);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r11.I = r0;
        r0 = r11.I;
        r2 = r11.getResources();
        r2 = a(r2);
        r2 = r2 * r9;
        r2 = r2 / r8;
        r0.setTextSize(r2);
        r0 = r11.I;
        com.whatsapp.a4d.a(r0);
        r0 = r11.D;
        r2 = 2131755903; // 0x7f10037f float:1.9142698E38 double:1.053227357E-314;
        r0 = r0.findViewById(r2);
        r0 = (android.widget.TextView) r0;
        r2 = r11.getResources();	 Catch:{ RuntimeException -> 0x040b }
        r2 = a(r2);	 Catch:{ RuntimeException -> 0x040b }
        r5 = 1094713344; // 0x41400000 float:12.0 double:5.408602553E-315;
        r2 = r2 * r5;
        r2 = r2 / r8;
        r0.setTextSize(r2);	 Catch:{ RuntimeException -> 0x040b }
        r2 = com.whatsapp.App.a1();	 Catch:{ RuntimeException -> 0x040b }
        if (r2 == 0) goto L_0x040d;
    L_0x02ec:
        r2 = "\u25b6";
    L_0x02ef:
        r0.setText(r2);
        r0 = r11.D;
        r2 = 2131755905; // 0x7f100381 float:1.9142702E38 double:1.053227358E-314;
        r0 = r0.findViewById(r2);
        r0 = (android.widget.TextView) r0;
        r11.N = r0;
        r0 = r11.D;
        r2 = 2131755723; // 0x7f1002cb float:1.9142333E38 double:1.053227268E-314;
        r0 = r0.findViewById(r2);
        r0 = (android.widget.ImageView) r0;
        r2 = new com.whatsapp.util.bz;
        r5 = r11.getContext();
        r6 = 2130837713; // 0x7f0200d1 float:1.7280388E38 double:1.052773711E-314;
        r5 = android.support.v4.content.ContextCompat.getDrawable(r5, r6);
        r2.<init>(r5);
        r0.setImageDrawable(r2);
        r0 = r11.D;
        r2 = new android.widget.RelativeLayout$LayoutParams;
        r5 = -1;
        r2.<init>(r5, r10);
        r0.setLayoutParams(r2);
        r11.removeView(r3);
        r0 = r11.D;
        r2 = 2131755520; // 0x7f100200 float:1.9141922E38 double:1.053227168E-314;
        r0.setId(r2);
        r0 = r11.D;
        r11.addView(r0, r1);
    L_0x0338:
        r0 = r12.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x035d;
    L_0x033e:
        r0 = r11.getContext();
        r1 = 2131232301; // 0x7f08062d float:1.8080707E38 double:1.052968663E-314;
        r1 = r0.getString(r1);
        r0 = com.whatsapp.App.as;
        r2 = r12.k;
        r2 = r2.c;
        r0 = r0.b(r2);
        r2 = r11.getContext();
        r0 = r0.a(r2);
        if (r4 == 0) goto L_0x03a8;
    L_0x035d:
        r0 = r12.k;	 Catch:{ RuntimeException -> 0x0412 }
        r0 = r0.c;	 Catch:{ RuntimeException -> 0x0412 }
        r0 = com.whatsapp.qm.i(r0);	 Catch:{ RuntimeException -> 0x0412 }
        if (r0 == 0) goto L_0x038b;
    L_0x0367:
        r0 = com.whatsapp.App.as;
        r1 = r12.t;
        r0 = r0.b(r1);
        r1 = r11.getContext();
        r1 = r0.a(r1);
        r0 = com.whatsapp.App.as;
        r2 = r12.k;
        r2 = r2.c;
        r0 = r0.b(r2);
        r2 = r11.getContext();
        r0 = r0.a(r2);
        if (r4 == 0) goto L_0x03a8;
    L_0x038b:
        r0 = com.whatsapp.App.as;
        r1 = r12.k;
        r1 = r1.c;
        r0 = r0.b(r1);
        r1 = r11.getContext();
        r1 = r0.a(r1);
        r0 = r11.getContext();
        r2 = 2131232301; // 0x7f08062d float:1.8080707E38 double:1.052968663E-314;
        r0 = r0.getString(r2);
    L_0x03a8:
        r2 = r11.J;
        r2.a(r1);
        r1 = r11.I;
        r1.a(r0);
        r0 = r11.N;
        r1 = r11.getContext();
        r2 = com.whatsapp.App.o(r12);
        r1 = com.whatsapp.util.cs.j(r1, r2);
        r0.setText(r1);
    L_0x03c3:
        return;
    L_0x03c4:
        r0 = move-exception;
        throw r0;
    L_0x03c6:
        r0 = r1;
        goto L_0x000d;
    L_0x03c9:
        r0 = move-exception;
        throw r0;
    L_0x03cb:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03cd }
    L_0x03cd:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03cf }
    L_0x03cf:
        r0 = move-exception;
        throw r0;
    L_0x03d1:
        r0 = move-exception;
        throw r0;
    L_0x03d3:
        r0 = move-exception;
        throw r0;
    L_0x03d5:
        r2 = n;
        r2 = r2.left;
        goto L_0x0087;
    L_0x03db:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03dd }
    L_0x03dd:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03df }
    L_0x03df:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03e1 }
    L_0x03e1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03e3 }
    L_0x03e3:
        r0 = move-exception;
        throw r0;
    L_0x03e5:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03e7 }
    L_0x03e7:
        r0 = move-exception;
        throw r0;
    L_0x03e9:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03eb }
    L_0x03eb:
        r0 = move-exception;
        throw r0;
    L_0x03ed:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03ef }
    L_0x03ef:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03f1 }
    L_0x03f1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03f3 }
    L_0x03f3:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03f5 }
    L_0x03f5:
        r0 = move-exception;
        throw r0;
    L_0x03f7:
        r0 = move-exception;
        throw r0;
    L_0x03f9:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03fb }
    L_0x03fb:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03fd }
    L_0x03fd:
        r0 = move-exception;
        throw r0;
    L_0x03ff:
        r0 = move-exception;
        throw r0;
    L_0x0401:
        r0 = move-exception;
        throw r0;
    L_0x0403:
        r0 = move-exception;
        throw r0;
    L_0x0405:
        r0 = move-exception;
        throw r0;
    L_0x0407:
        r0 = move-exception;
        throw r0;
    L_0x0409:
        r0 = move-exception;
        throw r0;
    L_0x040b:
        r0 = move-exception;
        throw r0;
    L_0x040d:
        r2 = "\u25c0";
        goto L_0x02ef;
    L_0x0412:
        r0 = move-exception;
        throw r0;
    L_0x0414:
        r2 = r3;
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.b(com.whatsapp.protocol.co):void");
    }

    public static float a(Resources resources) {
        return a(resources, WaFontListPreference.b);
    }

    public int d() {
        try {
            if (this.H == null) {
                this.H = (TextView) findViewById(2131755520);
            }
            return Math.round(getResources().getDimension(2131427436)) + this.H.getMeasuredHeight();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMessageText(java.lang.String r12, com.whatsapp.TextEmojiLabel r13, int r14, com.whatsapp.protocol.co r15) {
        /*
        r11 = this;
        r3 = 2131624030; // 0x7f0e005e float:1.8875228E38 double:1.053162203E-314;
        r4 = 2131624029; // 0x7f0e005d float:1.8875226E38 double:1.0531622026E-314;
        r0 = 1;
        r2 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        com.whatsapp.aam.a(r13, r12);
        r1 = r11.k();
        if (r1 == 0) goto L_0x0190;
    L_0x0013:
        r1 = r1.a(r15);
        if (r1 != 0) goto L_0x018d;
    L_0x0019:
        r1 = r13.getResources();
        r1 = a(r1);
        r13.setTextSize(r1);
        r6 = new com.whatsapp.gx;
        r0 = r0 * 3072;
        r1 = r12.length();
        r6.<init>(r0, r1);
        r0 = r13.getContext();
        r1 = r13.getPaint();
        r7 = 1067869798; // 0x3fa66666 float:1.3 double:5.275977814E-315;
        r0 = com.whatsapp.a28.a(r12, r0, r1, r7, r6);
        r1 = r6.a();	 Catch:{ Exception -> 0x0172 }
        if (r1 <= 0) goto L_0x0099;
    L_0x0044:
        if (r0 == 0) goto L_0x0054;
    L_0x0046:
        r1 = r6.a();
        r7 = r0.length();
        r0 = r0.delete(r1, r7);
        if (r5 == 0) goto L_0x0061;
    L_0x0054:
        r0 = new android.text.SpannableStringBuilder;
        r1 = r6.a();
        r1 = r12.substring(r2, r1);
        r0.<init>(r1);
    L_0x0061:
        r7 = new android.text.SpannableStringBuilder;
        r1 = r11.getContext();
        r8 = 2131231722; // 0x7f0803ea float:1.8079533E38 double:1.052968377E-314;
        r1 = r1.getString(r8);
        r7.<init>(r1);
        r8 = r13.getContext();	 Catch:{ Exception -> 0x0174 }
        r1 = r15.k;	 Catch:{ Exception -> 0x0174 }
        r1 = r1.a;	 Catch:{ Exception -> 0x0174 }
        if (r1 == 0) goto L_0x0176;
    L_0x007b:
        r1 = r3;
    L_0x007c:
        r1 = android.support.v4.content.ContextCompat.getColor(r8, r1);
        r8 = new com.whatsapp.g9;
        r8.<init>(r11, r1);
        r1 = r7.length();
        r9 = 18;
        r7.setSpan(r8, r2, r1, r9);
        r1 = Q;
        r2 = 2;
        r1 = r1[r2];
        r0.append(r1);
        r0.append(r7);
    L_0x0099:
        if (r0 != 0) goto L_0x018a;
    L_0x009b:
        r0 = new android.text.SpannableStringBuilder;
        r0.<init>(r12);
        r2 = r0;
    L_0x00a1:
        if (r14 == 0) goto L_0x00dd;
    L_0x00a3:
        r0 = Q;	 Catch:{ Exception -> 0x0179 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0179 }
        r2.append(r0);	 Catch:{ Exception -> 0x0179 }
        r0 = new com.whatsapp.oa;	 Catch:{ Exception -> 0x0179 }
        r1 = r13.getPaint();	 Catch:{ Exception -> 0x0179 }
        r7 = " ";
        r1 = r1.measureText(r7);	 Catch:{ Exception -> 0x0179 }
        r1 = (int) r1;	 Catch:{ Exception -> 0x0179 }
        r1 = r14 - r1;
        r7 = r13.getTextSize();	 Catch:{ Exception -> 0x0179 }
        r8 = r13.getResources();	 Catch:{ Exception -> 0x0179 }
        r8 = r8.getDisplayMetrics();	 Catch:{ Exception -> 0x0179 }
        r8 = r8.scaledDensity;	 Catch:{ Exception -> 0x0179 }
        r7 = r7 - r8;
        r7 = (int) r7;	 Catch:{ Exception -> 0x0179 }
        r0.<init>(r11, r1, r7);	 Catch:{ Exception -> 0x0179 }
        r1 = r2.length();	 Catch:{ Exception -> 0x0179 }
        r1 = r1 + -1;
        r7 = r2.length();	 Catch:{ Exception -> 0x0179 }
        r8 = 33;
        r2.setSpan(r0, r1, r7, r8);	 Catch:{ Exception -> 0x0179 }
    L_0x00dd:
        r0 = 6;
        android.text.util.Linkify.addLinks(r2, r0);	 Catch:{ Exception -> 0x0187 }
        com.whatsapp.util.ac.a(r2);	 Catch:{ Exception -> 0x0187 }
    L_0x00e4:
        r0 = android.text.style.URLSpan.class;
        r7 = com.whatsapp.util.l.a(r2, r0);
        if (r7 == 0) goto L_0x0159;
    L_0x00ec:
        r0 = r7.isEmpty();	 Catch:{ Exception -> 0x017b }
        if (r0 != 0) goto L_0x0159;
    L_0x00f2:
        r0 = a(r15);	 Catch:{ Exception -> 0x017b }
        if (r0 == 0) goto L_0x0144;
    L_0x00f8:
        r8 = r7.iterator();
    L_0x00fc:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x0144;
    L_0x0102:
        r0 = r8.next();
        r0 = (android.text.style.URLSpan) r0;
        r9 = r0.getURL();
        r1 = Q;	 Catch:{ Exception -> 0x017d }
        r10 = 0;
        r1 = r1[r10];	 Catch:{ Exception -> 0x017d }
        r1 = r9.startsWith(r1);	 Catch:{ Exception -> 0x017d }
        if (r1 == 0) goto L_0x011f;
    L_0x0117:
        r1 = com.whatsapp.util.ac.a(r9);	 Catch:{ Exception -> 0x017f }
        if (r1 == 0) goto L_0x011f;
    L_0x011d:
        if (r5 == 0) goto L_0x00fc;
    L_0x011f:
        r10 = r13.getContext();	 Catch:{ Exception -> 0x0181 }
        r1 = r15.k;	 Catch:{ Exception -> 0x0181 }
        r1 = r1.a;	 Catch:{ Exception -> 0x0181 }
        if (r1 == 0) goto L_0x0183;
    L_0x0129:
        r1 = r3;
    L_0x012a:
        r1 = android.support.v4.content.ContextCompat.getColor(r10, r1);
        r10 = new com.whatsapp.g3;
        r10.<init>(r9, r1);
        r1 = r2.getSpanStart(r0);
        r9 = r2.getSpanEnd(r0);
        r0 = r2.getSpanFlags(r0);
        r2.setSpan(r10, r1, r9, r0);
        if (r5 == 0) goto L_0x00fc;
    L_0x0144:
        r1 = r7.iterator();
    L_0x0148:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0159;
    L_0x014e:
        r0 = r1.next();
        r0 = (android.text.style.URLSpan) r0;
        r2.removeSpan(r0);
        if (r5 == 0) goto L_0x0148;
    L_0x0159:
        r0 = r6.a();	 Catch:{ Exception -> 0x0185 }
        if (r0 <= 0) goto L_0x0168;
    L_0x015f:
        r0 = 0;
        r1 = r6.a();	 Catch:{ Exception -> 0x0185 }
        r12 = r12.substring(r0, r1);	 Catch:{ Exception -> 0x0185 }
    L_0x0168:
        r0 = r11.a(r12, r2);
        r1 = android.widget.TextView.BufferType.SPANNABLE;
        r13.setText(r0, r1);
        return;
    L_0x0172:
        r0 = move-exception;
        throw r0;
    L_0x0174:
        r0 = move-exception;
        throw r0;
    L_0x0176:
        r1 = r4;
        goto L_0x007c;
    L_0x0179:
        r0 = move-exception;
        throw r0;
    L_0x017b:
        r0 = move-exception;
        throw r0;
    L_0x017d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x017f }
    L_0x017f:
        r0 = move-exception;
        throw r0;
    L_0x0181:
        r0 = move-exception;
        throw r0;
    L_0x0183:
        r1 = r4;
        goto L_0x012a;
    L_0x0185:
        r0 = move-exception;
        throw r0;
    L_0x0187:
        r0 = move-exception;
        goto L_0x00e4;
    L_0x018a:
        r2 = r0;
        goto L_0x00a1;
    L_0x018d:
        r0 = r1;
        goto L_0x0019;
    L_0x0190:
        r0 = r2;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.setMessageText(java.lang.String, com.whatsapp.TextEmojiLabel, int, com.whatsapp.protocol.co):void");
    }

    protected void f() {
    }

    static {
        String[] strArr = new String[11];
        String str = "2E\u0006;S0\u001e";
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
                        i3 = 95;
                        break;
                    case at.g /*1*/:
                        i3 = 36;
                        break;
                    case at.i /*2*/:
                        i3 = 111;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "q\nAw";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "9E";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ">V";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u001fWA O>P\u001c6W/\n\u00012S";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001fWA O>P\u001c6W/\n\u00012S";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "-K\u0000#Q6A\u0018wA0VO4H1R\n%T>P\u00068I\rK\u0018wN,\u0004\u0001\"K3\bO%N8L\u001b\u001bF&K\u001a#\u001a";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "<K\u0001!B-W\u000e#N0J0%H(\u000b\u0002>T,M\u00010x-I\u001b\bT-GU";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "<K\u0001!B-W\u000e#N0J@0B+@\u00066K0C\u0006#B2W@%B2K\u001b2x-A\u001c8R-G\nwN,\u0004\u0001\"K3\u0005O";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u007f@\u000e#Fb";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    Q = strArr3;
                    L = 0.0f;
                    B = 0.0f;
                    F = new a2_();
                    A = Math.max(64, Math.min(512, (int) ((Runtime.getRuntime().maxMemory() / 16) / 9216)));
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007f\u0004";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void q() {
        setOnLongClickListener(null);
        this.x.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    int b() {
        int i = 0;
        try {
            int i2 = (s() ? a4d.a().o : 0) + a4d.a().t;
            try {
                if (this.i) {
                    i = a4d.a().z;
                }
                return i + i2;
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }
}
