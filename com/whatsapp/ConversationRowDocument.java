package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.at;

public class ConversationRowDocument extends ConversationRowMedia {
    private static final String bb;
    private final View U;
    private final ImageButton V;
    private final View W;
    private final View X;
    private final TextEmojiLabel Y;
    private final View Z;
    private final ImageView aa;
    private final TextView ab;
    private final CircularProgressBar ac;
    private final TextView ad;
    private final View ae;
    private final ImageView af;
    private final TextView ag;

    public class DocumentPreviewView extends ImageView {
        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected boolean setFrame(int r9, int r10, int r11, int r12) {
            /*
            r8 = this;
            r7 = 0;
            r0 = r8.getDrawable();
            if (r0 == 0) goto L_0x0062;
        L_0x0007:
            r1 = r8.getImageMatrix();
            r0 = r8.getMeasuredWidth();
            r2 = r8.getPaddingLeft();
            r0 = r0 - r2;
            r2 = r8.getPaddingRight();
            r2 = r0 - r2;
            r0 = r8.getMeasuredHeight();
            r3 = r8.getPaddingTop();
            r0 = r0 - r3;
            r3 = r8.getPaddingBottom();
            r3 = r0 - r3;
            r0 = r8.getDrawable();
            r4 = r0.getIntrinsicWidth();
            r0 = r8.getDrawable();
            r0 = r0.getIntrinsicHeight();
            r5 = r4 * r3;
            r6 = r0 * r2;
            if (r5 <= r6) goto L_0x0047;
        L_0x003f:
            r5 = (float) r3;
            r0 = (float) r0;
            r0 = r5 / r0;
            r5 = com.whatsapp.DialogToastActivity.f;
            if (r5 == 0) goto L_0x004a;
        L_0x0047:
            r0 = (float) r2;
            r5 = (float) r4;
            r0 = r0 / r5;
        L_0x004a:
            r5 = new android.graphics.RectF;
            r4 = (float) r4;
            r6 = (float) r3;
            r0 = r6 / r0;
            r5.<init>(r7, r7, r4, r0);
            r0 = new android.graphics.RectF;
            r2 = (float) r2;
            r3 = (float) r3;
            r0.<init>(r7, r7, r2, r3);
            r2 = android.graphics.Matrix.ScaleToFit.FILL;
            r1.setRectToRect(r5, r0, r2);
            r8.setImageMatrix(r1);
        L_0x0062:
            r0 = super.setFrame(r9, r10, r11, r12);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowDocument.DocumentPreviewView.setFrame(int, int, int, int):boolean");
        }

        public DocumentPreviewView(Context context) {
            super(context);
            a();
        }

        private void a() {
            setScaleType(ScaleType.MATRIX);
        }

        public DocumentPreviewView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            a();
        }

        public DocumentPreviewView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            a();
        }
    }

    public class DocumentWarningDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "\n\u001b\u0011w\u0017\u0000\u001b=m\u0012".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.g /*1*/:
                        i2 = 126;
                        break;
                    case at.i /*2*/:
                        i2 = 98;
                        break;
                    case at.o /*3*/:
                        i2 = 4;
                        break;
                    default:
                        i2 = 118;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getContext()).setMessage(getString(2131232276)).setPositiveButton(2131231584, new a4(this)).setNegativeButton(2131230884, null).create();
        }

        public static DocumentWarningDialogFragment a(long j) {
            DocumentWarningDialogFragment documentWarningDialogFragment = new DocumentWarningDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putLong(z, j);
            documentWarningDialogFragment.setArguments(bundle);
            return documentWarningDialogFragment;
        }
    }

    static {
        char[] toCharArray = "gyx{}os2`|rrr}<gth`}h9J@WQ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 6;
                    break;
                case at.g /*1*/:
                    i2 = 23;
                    break;
                case at.i /*2*/:
                    i2 = 28;
                    break;
                case at.o /*3*/:
                    i2 = 9;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        bb = new String(cArr).intern();
    }

    protected void f() {
        boolean z = DialogToastActivity.f;
        MediaData mediaData = (MediaData) this.e.Q;
        if (this.e.k.a || mediaData.transferred) {
            if (mediaData.file == null || !mediaData.file.exists()) {
                Context context = getContext();
                if (context instanceof DialogToastActivity) {
                    App.a((DialogToastActivity) context);
                }
                if (!z) {
                    return;
                }
            }
            if (mediaData.suspiciousContent == MediaData.SUSPICIOUS_CONTENT_YES) {
                DocumentWarningDialogFragment.a(this.e.I).show(((AppCompatActivity) getContext()).getSupportFragmentManager(), null);
                if (!z) {
                    return;
                }
            }
            Intent intent = new Intent(bb);
            intent.setDataAndType(Uri.fromFile(mediaData.file), this.e.n);
            App.a(getContext(), intent);
        }
    }

    public ConversationRowDocument(Context context, co coVar) {
        super(context, coVar);
        this.aa = (ImageView) findViewById(R.id.icon);
        this.V = (ImageButton) findViewById(2131755525);
        this.U = findViewById(2131755536);
        this.ac = (CircularProgressBar) findViewById(2131755547);
        this.ac.setMax(100);
        this.ac.setProgressBarColor(ContextCompat.getColor(context, 2131624046));
        this.ac.setProgressBarBackgroundColor(536870912);
        this.Y = (TextEmojiLabel) findViewById(R.id.title);
        this.X = findViewById(2131755310);
        this.ag = (TextView) findViewById(R.id.info);
        this.Z = findViewById(2131755548);
        this.ab = (TextView) findViewById(2131755549);
        this.W = findViewById(2131755550);
        this.ad = (TextView) findViewById(2131755551);
        this.af = (ImageView) findViewById(2131755545);
        this.ae = findViewById(2131755546);
        a(coVar);
    }

    protected int g() {
        return 2130903125;
    }

    public void i() {
        a(this.e);
        super.i();
    }

    public void a(co coVar, boolean z) {
        if (coVar != this.e || z) {
            a(coVar);
        }
        super.a(coVar, z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r12) {
        /*
        r11 = this;
        r3 = 1;
        r10 = 8;
        r2 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r11.aa;
        r5 = r11.getContext();
        r5 = com.whatsapp.util.cb.a(r5, r12);
        r1.setImageDrawable(r5);
        r1 = r12.a;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 == 0) goto L_0x0029;
    L_0x001f:
        r1 = r11.Y;
        r5 = 2131232185; // 0x7f0805b9 float:1.8080472E38 double:1.052968606E-314;
        r1.setText(r5);
        if (r4 == 0) goto L_0x0034;
    L_0x0029:
        r1 = r11.Y;
        r5 = r12.a;
        r5 = r11.a(r5);
        r1.setText(r5);
    L_0x0034:
        r1 = r12.e();
        if (r1 == 0) goto L_0x0057;
    L_0x003a:
        r1 = r12.e();
        r1 = r1.length;
        if (r1 <= 0) goto L_0x0057;
    L_0x0041:
        r1 = r11.af;
        r5 = new com.whatsapp.t8;
        r5.<init>(r11);
        com.whatsapp.util.bd.b(r12, r1, r5);
        r1 = r11.af;
        r1.setVisibility(r2);
        r1 = r11.ae;
        r1.setVisibility(r2);
        if (r4 == 0) goto L_0x0061;
    L_0x0057:
        r1 = r11.af;
        r1.setVisibility(r10);
        r1 = r11.ae;
        r1.setVisibility(r10);
    L_0x0061:
        r1 = r0.transferring;
        if (r1 == 0) goto L_0x009e;
    L_0x0065:
        r1 = r11.U;
        r1.setVisibility(r2);
        r1 = r11.ac;
        r1.setVisibility(r2);
        r5 = r11.ac;
        r6 = r0.progress;
        r8 = 0;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 == 0) goto L_0x0081;
    L_0x0079:
        r6 = r0.progress;
        r8 = 100;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 != 0) goto L_0x01a3;
    L_0x0081:
        r1 = r3;
    L_0x0082:
        r5.setIndeterminate(r1);
        r1 = r11.ac;
        r6 = r0.progress;
        r5 = (int) r6;
        r1.setProgress(r5);
        r1 = r11.V;
        r5 = 2130839581; // 0x7f02081d float:1.7284177E38 double:1.052774634E-314;
        r1.setImageResource(r5);
        r1 = r11.V;
        r5 = r11.R;
        r1.setOnClickListener(r5);
        if (r4 == 0) goto L_0x0118;
    L_0x009e:
        r1 = r0.transferred;
        if (r1 != 0) goto L_0x00b6;
    L_0x00a2:
        r1 = r12.x;
        if (r1 == 0) goto L_0x00c2;
    L_0x00a6:
        r1 = r12.k;
        r1 = r1.a;
        if (r1 == 0) goto L_0x00c2;
    L_0x00ac:
        r1 = r12.k;
        r1 = r1.c;
        r1 = com.whatsapp.l5.g(r1);
        if (r1 != 0) goto L_0x00c2;
    L_0x00b6:
        r1 = r11.U;
        r1.setVisibility(r10);
        r1 = r11.ac;
        r1.setVisibility(r10);
        if (r4 == 0) goto L_0x01a6;
    L_0x00c2:
        r1 = r11.U;
        r1.setVisibility(r2);
        r1 = r11.ac;
        r1.setVisibility(r10);
        r1 = r12.k;
        r1 = r1.a;
        if (r1 == 0) goto L_0x00f9;
    L_0x00d2:
        if (r0 == 0) goto L_0x00f9;
    L_0x00d4:
        r0 = r0.file;
        if (r0 == 0) goto L_0x00f9;
    L_0x00d8:
        r0 = r11.V;
        r1 = 2130839593; // 0x7f020829 float:1.72842E38 double:1.0527746397E-314;
        r0.setImageResource(r1);
        r0 = r11.V;
        r1 = r11.getContext();
        r5 = 2131231838; // 0x7f08045e float:1.8079768E38 double:1.0529684345E-314;
        r1 = r1.getString(r5);
        r0.setContentDescription(r1);
        r0 = r11.V;
        r1 = r11.T;
        r0.setOnClickListener(r1);
        if (r4 == 0) goto L_0x0118;
    L_0x00f9:
        r0 = r11.V;
        r1 = 2130839584; // 0x7f020820 float:1.7284183E38 double:1.0527746353E-314;
        r0.setImageResource(r1);
        r0 = r11.V;
        r1 = r11.getContext();
        r5 = 2131230862; // 0x7f08008e float:1.8077789E38 double:1.0529679523E-314;
        r1 = r1.getString(r5);
        r0.setContentDescription(r1);
        r0 = r11.V;
        r1 = r11.S;
        r0.setOnClickListener(r1);
    L_0x0118:
        if (r3 == 0) goto L_0x0135;
    L_0x011a:
        r0 = r11.ab;
        r0.setVisibility(r2);
        r0 = r11.W;
        r0.setVisibility(r2);
        r0 = r11.ab;
        r1 = com.whatsapp.App.z();
        r6 = r12.z;
        r1 = android.text.format.Formatter.formatShortFileSize(r1, r6);
        r0.setText(r1);
        if (r4 == 0) goto L_0x013f;
    L_0x0135:
        r0 = r11.ab;
        r0.setVisibility(r10);
        r0 = r11.W;
        r0.setVisibility(r10);
    L_0x013f:
        r0 = r12.R;
        if (r0 == 0) goto L_0x0158;
    L_0x0143:
        r0 = r11.ag;
        r0.setVisibility(r2);
        r0 = r11.Z;
        r0.setVisibility(r2);
        r0 = r11.ag;
        r1 = com.whatsapp.util.cb.a(r12);
        r0.setText(r1);
        if (r4 == 0) goto L_0x0162;
    L_0x0158:
        r0 = r11.ag;
        r0.setVisibility(r10);
        r0 = r11.Z;
        r0.setVisibility(r10);
    L_0x0162:
        r0 = r12.n;
        r0 = com.whatsapp.util.ag.c(r0);
        r0 = r0.toUpperCase();
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x0184;
    L_0x0172:
        r1 = r12.A;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0184;
    L_0x017a:
        r0 = r12.A;
        r0 = com.whatsapp.util.a1.b(r0);
        r0 = r0.toUpperCase();
    L_0x0184:
        r1 = r11.ad;
        r0 = r11.a(r0);
        r1.setText(r0);
        r0 = r11.X;
        r1 = r11.Q;
        r0.setOnClickListener(r1);
        r0 = r11.X;
        r1 = r11.K;
        r0.setOnLongClickListener(r1);
        r0 = r11.X;
        r1 = r11.P;
        r0.setOnTouchListener(r1);
        return;
    L_0x01a3:
        r1 = r2;
        goto L_0x0082;
    L_0x01a6:
        r3 = r2;
        goto L_0x0118;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowDocument.a(com.whatsapp.protocol.co):void");
    }

    static ImageView a(ConversationRowDocument conversationRowDocument) {
        return conversationRowDocument.af;
    }

    protected int h() {
        return 2130903127;
    }
}
