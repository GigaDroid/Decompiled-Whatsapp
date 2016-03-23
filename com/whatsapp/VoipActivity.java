package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog.Builder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.whatsapp.Voip.CallInfo;
import com.whatsapp.Voip.CallState;
import com.whatsapp.fieldstats.cd;
import com.whatsapp.notification.aw;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.util.Collection;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class VoipActivity extends DialogToastActivity implements tm, pm {
    private static final String[] D;
    private final Runnable A;
    private Toast B;
    private boolean C;
    private VoiceService n;
    private boolean o;
    private boolean p;
    private ServiceConnection q;
    private String r;
    private TextView s;
    private Handler t;
    private DialogFragment u;
    private DialogFragment v;
    private boolean w;
    private long x;
    private TextEmojiLabel y;
    private CallState z;

    public class EndCallConfirmationDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[2];
            String str = "\n)\u0010e:\u0000)";
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
                            i3 = arj.Theme_checkedTextViewStyle;
                            break;
                        case at.g /*1*/:
                            i3 = 76;
                            break;
                        case at.i /*2*/:
                            i3 = 99;
                            break;
                        case at.o /*3*/:
                            i3 = 22;
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
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "\n)\u0010e:\u0000)";
                        obj = null;
                }
            }
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(getArguments().getString(z[1])).setCancelable(true).setPositiveButton(2131230858, new x0(this)).setNegativeButton(2131231351, new ih(this)).create();
        }

        private static DialogFragment b(String str) {
            DialogFragment endCallConfirmationDialogFragment = new EndCallConfirmationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[0], str);
            endCallConfirmationDialogFragment.setArguments(bundle);
            return endCallConfirmationDialogFragment;
        }

        static DialogFragment a(String str) {
            return b(str);
        }
    }

    public class MessageDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[2];
            String str = ";\u0014/W)1\u0014";
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
                            i3 = 86;
                            break;
                        case at.g /*1*/:
                            i3 = 113;
                            break;
                        case at.i /*2*/:
                            i3 = 92;
                            break;
                        case at.o /*3*/:
                            i3 = 36;
                            break;
                        default:
                            i3 = 72;
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
                        str = ";\u0014/W)1\u0014";
                        obj = null;
                }
            }
        }

        static DialogFragment b(String str) {
            return a(str);
        }

        private static DialogFragment a(String str) {
            DialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[0], str);
            messageDialogFragment.setArguments(bundle);
            return messageDialogFragment;
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(getArguments().getString(z[1])).setCancelable(true).setPositiveButton(2131231580, new ao2(this)).create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (getActivity() != null && !Voip.d()) {
                getActivity().finish();
            }
        }
    }

    public class PermissionDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[8];
            String str = "q\u0003@svo\u0003\\j";
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
                            i3 = 1;
                            break;
                        case at.g /*1*/:
                            i3 = arj.Theme_checkboxStyle;
                            break;
                        case at.i /*2*/:
                            i3 = 50;
                            break;
                        case at.o /*3*/:
                            i3 = 30;
                            break;
                        default:
                            i3 = 23;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "k\u000fV";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "w\t[n8W\t[nVb\u0012[h~u\u001f\u001dnrs\u000b[mdh\t\\m8k\u000fV>~rF\\k{m";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "j\u0003Kyb`\u0014V";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "q\u0003@svo\u0003\\j";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "T\bYpxv\b";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "`\bVlxh\u0002\u001cnrs\u000b[mdh\t\\0ED%}LS^'gZ^N";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "k\u000fV";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        static DialogFragment b(String str, boolean z) {
            return a(str, z);
        }

        static void a(PermissionDialogFragment permissionDialogFragment) {
            permissionDialogFragment.a();
        }

        public void onStart() {
            super.onStart();
            getDialog().getWindow().setLayout(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        }

        private void a() {
            getActivity().onRequestPermissionsResult(0, new String[]{z[7]}, new int[]{-1});
        }

        private static DialogFragment a(String str, boolean z) {
            DialogFragment permissionDialogFragment = new PermissionDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[1], str);
            bundle.putBoolean(z[0], z);
            permissionDialogFragment.setArguments(bundle);
            return permissionDialogFragment;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.support.annotation.NonNull
        public android.app.Dialog onCreateDialog(android.os.Bundle r13) {
            /*
            r12 = this;
            r11 = 2131755835; // 0x7f10033b float:1.914256E38 double:1.0532273234E-314;
            r3 = 8;
            r10 = 1;
            r9 = 0;
            r4 = com.whatsapp.DialogToastActivity.f;
            r5 = new android.app.Dialog;
            r0 = r12.getActivity();
            r5.<init>(r0);
            r5.requestWindowFeature(r10);
            r0 = r5.getWindow();
            r1 = new android.graphics.drawable.ColorDrawable;
            r1.<init>(r9);
            r0.setBackgroundDrawable(r1);
            r5.setCancelable(r9);
            r5.setCanceledOnTouchOutside(r9);
            r0 = r12.getActivity();
            r0 = r0.getLayoutInflater();
            r1 = 2130903249; // 0x7f0300d1 float:1.741331E38 double:1.05280609E-314;
            r2 = 0;
            r0 = com.whatsapp.aam.a(r0, r1, r2, r9);
            r5.setContentView(r0);
            r0 = 2131755833; // 0x7f100339 float:1.9142556E38 double:1.0532273224E-314;
            r0 = r5.findViewById(r0);
            r0 = (android.widget.ImageView) r0;
            r1 = r12.getResources();
            r2 = 2130839701; // 0x7f020895 float:1.728442E38 double:1.052774693E-314;
            r1 = r1.getDrawable(r2);
            r0.setImageDrawable(r1);
            r0 = 2131755743; // 0x7f1002df float:1.9142374E38 double:1.053227278E-314;
            r0 = r5.findViewById(r0);
            r0.setVisibility(r3);
            r0 = 2131755834; // 0x7f10033a float:1.9142558E38 double:1.053227323E-314;
            r0 = r5.findViewById(r0);
            r0.setVisibility(r3);
            r0 = r12.getArguments();
            r1 = z;
            r2 = 2;
            r1 = r1[r2];
            r0 = r0.getString(r1);
            r1 = 2131755369; // 0x7f100169 float:1.9141615E38 double:1.053227093E-314;
            r1 = r5.findViewById(r1);
            r2 = new com.whatsapp.z_;
            r2.<init>(r12);
            r1.setOnClickListener(r2);
            if (r0 == 0) goto L_0x0093;
        L_0x0083:
            r1 = com.whatsapp.App.as;
            r0 = r1.b(r0);
            r1 = r12.getActivity();
            r0 = r0.a(r1);
            if (r4 == 0) goto L_0x0125;
        L_0x0093:
            r0 = z;
            r1 = 3;
            r0 = r0[r1];
            com.whatsapp.util.Log.e(r0);
            r0 = z;
            r1 = 6;
            r0 = r0[r1];
            r2 = r0;
        L_0x00a1:
            r0 = 2131755370; // 0x7f10016a float:1.9141617E38 double:1.0532270937E-314;
            r0 = r5.findViewById(r0);
            r0 = (android.widget.Button) r0;
            r1 = r12.getContext();
            r3 = z;
            r6 = 4;
            r3 = r3[r6];
            r1 = r1.getSystemService(r3);
            r1 = (android.app.KeyguardManager) r1;
            r6 = r1.inKeyguardRestrictedInputMode();
            r1 = r12.getArguments();
            r3 = z;
            r7 = 5;
            r3 = r3[r7];
            r1 = r1.getBoolean(r3);
            if (r1 == 0) goto L_0x00f7;
        L_0x00cc:
            if (r6 == 0) goto L_0x011b;
        L_0x00ce:
            r1 = 2131231628; // 0x7f08038c float:1.8079342E38 double:1.0529683307E-314;
            r3 = r1;
        L_0x00d2:
            r1 = r5.findViewById(r11);
            r1 = (android.widget.TextView) r1;
            r7 = r12.getResources();
            r8 = new java.lang.Object[r10];
            r8[r9] = r2;
            r3 = r7.getString(r3, r8);
            r1.setText(r3);
            r1 = 2131231634; // 0x7f080392 float:1.8079355E38 double:1.0529683337E-314;
            r0.setText(r1);
            r1 = new com.whatsapp.zv;
            r1.<init>(r12);
            r0.setOnClickListener(r1);
            if (r4 == 0) goto L_0x011a;
        L_0x00f7:
            if (r6 == 0) goto L_0x0120;
        L_0x00f9:
            r1 = 2131231629; // 0x7f08038d float:1.8079344E38 double:1.052968331E-314;
            r3 = r1;
        L_0x00fd:
            r1 = r5.findViewById(r11);
            r1 = (android.widget.TextView) r1;
            r4 = r12.getResources();
            r6 = new java.lang.Object[r10];
            r6[r9] = r2;
            r2 = r4.getString(r3, r6);
            r1.setText(r2);
            r1 = new com.whatsapp.z4;
            r1.<init>(r12);
            r0.setOnClickListener(r1);
        L_0x011a:
            return r5;
        L_0x011b:
            r1 = 2131231627; // 0x7f08038b float:1.807934E38 double:1.05296833E-314;
            r3 = r1;
            goto L_0x00d2;
        L_0x0120:
            r1 = 2131231630; // 0x7f08038e float:1.8079346E38 double:1.0529683317E-314;
            r3 = r1;
            goto L_0x00fd;
        L_0x0125:
            r2 = r0;
            goto L_0x00a1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipActivity.PermissionDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }
    }

    public class ReplyWithMessageDialogFragment extends DialogFragment {
        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            Builder builder = new Builder(getActivity());
            CharSequence[] stringArray = getResources().getStringArray(2131689488);
            builder.setItems(stringArray, new j7(this, stringArray));
            Dialog create = builder.create();
            create.setCanceledOnTouchOutside(true);
            return create;
        }
    }

    static {
        String[] strArr = new String[63];
        String str = "\u001ay(#::y(#T\u000fb(%|\u0018on0t\u0000zn2v\u000fs1'";
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
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 22;
                        break;
                    case at.i /*2*/:
                        i3 = 65;
                        break;
                    case at.o /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 21;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{<w4 p";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on0t\u0000zn6{\b";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "La):y\t67:p\u001b\u007f/45\u001ay(#5\ru5:c\u0005b8";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u000fw-?t\u000e\u007f-:a\u00156\";t\u0002q$75\ny3s";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on&e\bw56@\u0005E52a\t6':{\u0005e):{\u000b6%<5\u0002y5s`\u001cr 'p";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018oo<{9e$!Y\tw76]\u0005x5";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{>s2&x\t";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on1|\u0002r\u00126g\u001a\u007f\"6";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ":y(#T\u000fb(%|\u0018oa!p\u001dc$ a\u0005x&se\u001ey':y\t6(>t\u000bsa<sLe()pV6";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "L6\u0000\u0016VV";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on&e\bw56V\rz-\u0000a\rb4 W\rdn=`\u0000z";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on&e\bw56V\rz-\u0000a\rb4 W\rdn&{\u0007x.${/w-?F\u0018w56";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "LD\u0000\u0004/";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "LY\u0014\u0007/";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on0t\u0000z\u0012't\u0018s\u0002;t\u0002q$75\u0005x'<5Q+a\u001d@ Za5|\u0002\u007f2;|\u0002qa0`\u001ed$=aLw\"'|\u001a\u007f5*";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{\"s6\u001a{\u0018s/':\"s6\u0010t\u0000za0y\tw3:{\u000b62't\u0018s2";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u000fy,}b\u0004w5 t\u001cfo:{\u0018s/';\ru5:z\u00028\u0000\u0010V)F\u0015\fV-Z\r";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "@6 0a\u0005y/s";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on=p\u001b;(=a\tx5st\u000fb(%|\u0018oa:fLp(=|\u001f~(=r@6%<5\u0002y5;|\u0002q";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    str = "\u0002s6\u0010t\u0000z";
                    obj = 20;
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    str = "\u000fy/5|\u001e{ '|\u0003x\u0012'g\u0005x&";
                    i = 22;
                    strArr2 = strArr3;
                    obj = 21;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    strArr2 = strArr3;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{\"s6\u001a{\u0018s/'5";
                    obj = 22;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "@6( 5\n\u007f/:f\u0004\u007f/45";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u000fy,}b\u0004w5 t\u001cfo:{\u0018s/';\ru5:z\u00028\u0012\u001bZ;I\u0004\u001dQ3U\u0000\u001fY3U\u000e\u001dS%D\f\u0012A%Y\u000f";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u000fy,}b\u0004w5 t\u001cfo:{\u0018s/';\ru5:z\u00028\u0004\u001dQ3U\u0000\u001fY3W\u0007\u0007P>I\u0002\u001c[*_\u0013\u001eT8_\u000e\u001d";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001cs3>|\u001fe(<{3d$\"`\te5";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\rx%!z\u0005ro#p\u001e{( f\u0005y/}G)U\u000e\u0001Q3W\u0014\u0017\\#";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\rx%!z\u0005ro#p\u001e{( f\u0005y/}G)U\u000e\u0001Q3W\u0014\u0017\\#";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u001cs3>|\u001fe(<{3d$\"`\te5";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u001cs3>|\u001fe(<{3d$\"`\te5";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\rx%!z\u0005ro#p\u001e{( f\u0005y/}G)U\u000e\u0001Q3W\u0014\u0017\\#";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on5t\u0005z$7J\u0002y\u001e!p\u000fy37J\rc%:z3f$!x\u0005e2:z\u0002";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{'s8\u0017z\u001bxa";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{'s8\u0017z\u001bxa!p\u0006s\"'5\u000fw-?5\nd.>5\u001es,<a\t6\"<{\u0018d.?";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{'s8\u0017z\u001bxa6{\b6\"2y\u00006'!z\u0001636x\u0003b$sv\u0003x5!z\u0000";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{'s8\u0017z\u001bxa2v\u000fs1'5\u000fw-?5\nd.>5\u001es,<a\t6\"<{\u0018d.?";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on0t\u0000zn!p\u0006s\"'";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on&e\bw56W\u0019b5<{?b 'p\u001f9/&y\u0000";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on&e\bw56W\u0019b5<{?b 'p\u001f9 =f\u001bs3\u0010t\u0000z\u0017:p\u001b97:f\u0005t-6";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on&e\bw56W\u0019b5<{?b 'p\u001f";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on }\u0003a\u0004=q/w-?V\u0003x':g\u0001w5:z\u0002R(2y\u0003qo";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{/d$2a\t";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on0g\tw56:\u000fw-?J\u0002y5\ft\u000fb(%p";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0006\u007f%";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0006\u007f%";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u000fw-?J\nd.>";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u001fb !a3u ?y";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\nd.>V\rz-\u001dz\u0018\u007f':v\rb(<{";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{?b.#";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u0004s 7f\u0019f";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u001es'!p\u001f~\u001e=z\u0018\u007f':v\rb(<{";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\rx%!z\u0005ro#p\u001e{( f\u0005y/}G)U\u000e\u0001Q3W\u0014\u0017\\#";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\rx%!z\u0005ro#p\u001e{( f\u0005y/}G)U\u000e\u0001Q3W\u0014\u0017\\#";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0005x1&a3{$'}\u0003r";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u001f~.$V\rz-\u0015t\u0005z$7X\te22r\t";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{?b !a";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u001es'!p\u001f~\u001e=z\u0018\u007f':v\rb(<{";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{?b !aLu ?y3x.'J\ru5:c\t:a5|\u0002\u007f2;|\u0002q";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on<{(s2'g\u0003o";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u000fw-?5\nw(?p\b6,6f\u001fw&65\u0002y5sq\tp(=p\b";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on }\u0003a\u00022y\u0000P :y\tr\f6f\u001fw&6";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    D = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001ay(#::y(#T\u000fb(%|\u0018on&{\u000e\u007f/7F\td7:v\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onPause() {
        Log.i(D[2]);
        super.onPause();
        if (this.o) {
            Log.i(D[1]);
            try {
                unbindService(this.q);
            } catch (Throwable e) {
                Log.a(e);
            }
            this.o = false;
        }
        this.w = false;
    }

    private void m() {
        try {
            Log.i(D[3]);
            if (this.n != null) {
                this.n.a(vl.USER_END_CALL);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a(CallInfo callInfo) {
        b(callInfo);
        if (findViewById(2131755979) != null) {
            try {
                if (App.am >= 3) {
                    TextView textView = (TextView) findViewById(2131755980);
                    if (textView != null) {
                        try {
                            textView.setText(Voip.getStreamStatistics());
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        try {
            if (this.n != null) {
                if (this.n.aq) {
                    try {
                        if (callInfo.getCallState() == CallState.ACTIVE) {
                            try {
                                if (this.x == 0) {
                                    try {
                                        if (callInfo.getBytesReceived() > 0) {
                                            try {
                                                if (callInfo.isCaller()) {
                                                    try {
                                                        if (callInfo.getCallDuration() < 3000) {
                                                            a(c().getString(2131232241), 0);
                                                        }
                                                    } catch (IllegalArgumentException e22) {
                                                        throw e22;
                                                    }
                                                }
                                            } catch (IllegalArgumentException e222) {
                                                throw e222;
                                            }
                                        }
                                    } catch (IllegalArgumentException e2222) {
                                        throw e2222;
                                    }
                                }
                            } catch (IllegalArgumentException e22222) {
                                throw e22222;
                            }
                        }
                    } catch (IllegalArgumentException e222222) {
                        throw e222222;
                    }
                }
            }
            this.x = callInfo.getBytesReceived();
        } catch (IllegalArgumentException e2222222) {
            throw e2222222;
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        }
    }

    public void b() {
        c(Voip.getCallInfo());
    }

    private void c() {
        try {
            if (this.y != null && this.w) {
                ((InputMethodManager) getSystemService(D[55])).hideSoftInputFromWindow(this.y.getWindowToken(), 0);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void m487a(String str) {
    }

    static void f(VoipActivity voipActivity) {
        voipActivity.n();
    }

    static void g(VoipActivity voipActivity) {
        voipActivity.i();
    }

    public void onUserInteraction() {
        this.C = true;
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 0) {
            try {
                super.onRequestPermissionsResult(i, strArr, iArr);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (iArr.length > 0) {
                if (iArr[0] == 0) {
                    try {
                        if (this.n != null) {
                            try {
                                this.n.I();
                                if (!DialogToastActivity.f) {
                                    return;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        } else {
                            return;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
            }
            try {
                Log.w(D[33]);
                if (this.n != null) {
                    this.n.b(vl.OTHER_REASON, null);
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(com.whatsapp.Voip.CallInfo r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        if (r8 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r8.getCallState();
        r3 = com.whatsapp.Voip.CallState.NONE;	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r0 == r3) goto L_0x0004;
    L_0x000d:
        r3 = com.whatsapp.Voip.CallState.RECEIVED_CALL;	 Catch:{ IllegalArgumentException -> 0x0074 }
        if (r0 == r3) goto L_0x0004;
    L_0x0011:
        r0 = 2131755969; // 0x7f1003c1 float:1.9142832E38 double:1.0532273896E-314;
        r3 = r7.findViewById(r0);
        r0 = 2131755971; // 0x7f1003c3 float:1.9142836E38 double:1.0532273906E-314;
        r4 = r7.findViewById(r0);
        r0 = 2131755973; // 0x7f1003c5 float:1.914284E38 double:1.0532273916E-314;
        r5 = r7.findViewById(r0);
        r0 = 2131755970; // 0x7f1003c2 float:1.9142834E38 double:1.05322739E-314;
        r6 = r7.findViewById(r0);
        r0 = r7.n;	 Catch:{ IllegalArgumentException -> 0x0076 }
        if (r0 == 0) goto L_0x007a;
    L_0x0031:
        r0 = r7.n;	 Catch:{ IllegalArgumentException -> 0x0078 }
        r0 = r0.F();	 Catch:{ IllegalArgumentException -> 0x0078 }
        if (r0 == 0) goto L_0x007a;
    L_0x0039:
        r0 = r1;
    L_0x003a:
        r3.setSelected(r0);	 Catch:{ IllegalArgumentException -> 0x007c }
        r0 = r7.n;	 Catch:{ IllegalArgumentException -> 0x007c }
        if (r0 == 0) goto L_0x0080;
    L_0x0041:
        r0 = r7.n;	 Catch:{ IllegalArgumentException -> 0x007e }
        r0 = r0.u();	 Catch:{ IllegalArgumentException -> 0x007e }
        if (r0 == 0) goto L_0x0080;
    L_0x0049:
        r0 = r1;
    L_0x004a:
        r5.setSelected(r0);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r0 = r7.n;	 Catch:{ IllegalArgumentException -> 0x0082 }
        if (r0 == 0) goto L_0x0086;
    L_0x0051:
        r0 = r7.n;	 Catch:{ IllegalArgumentException -> 0x0084 }
        r0 = r0.i();	 Catch:{ IllegalArgumentException -> 0x0084 }
        if (r0 == 0) goto L_0x0086;
    L_0x0059:
        r0 = r1;
    L_0x005a:
        if (r0 == 0) goto L_0x0088;
    L_0x005c:
        r3 = r2;
    L_0x005d:
        r6.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x008b }
        if (r0 == 0) goto L_0x0004;
    L_0x0062:
        r0 = r7.n;	 Catch:{ IllegalArgumentException -> 0x008d }
        if (r0 == 0) goto L_0x0091;
    L_0x0066:
        r0 = r7.n;	 Catch:{ IllegalArgumentException -> 0x008f }
        r0 = r0.c();	 Catch:{ IllegalArgumentException -> 0x008f }
        if (r0 == 0) goto L_0x0091;
    L_0x006e:
        r4.setSelected(r1);
        goto L_0x0004;
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r0 = r2;
        goto L_0x003a;
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = r2;
        goto L_0x004a;
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0084 }
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r0 = r2;
        goto L_0x005a;
    L_0x0088:
        r3 = 8;
        goto L_0x005d;
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r1 = r2;
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipActivity.c(com.whatsapp.Voip$CallInfo):void");
    }

    protected void onCreate(Bundle bundle) {
        int i = 0;
        Log.i(D[43]);
        super.onCreate(bundle);
        CallRatingActivity.a();
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            try {
                if (callInfo.getCallState() != CallState.NONE) {
                    try {
                        a(false);
                        getWindow().addFlags(2621440);
                        if (!callInfo.isCaller()) {
                            if (callInfo.getCallState() == CallState.RECEIVED_CALL) {
                                getWindow().addFlags(128);
                            }
                        }
                        setContentView(aam.a(getLayoutInflater(), 2130903290, null));
                        this.s = (TextView) findViewById(2131755964);
                        a4d.a(this.s);
                        a4d.a((TextView) findViewById(2131755963));
                        this.y = (TextEmojiLabel) findViewById(2131755466);
                        this.y.setOnClickListener(new zs(this));
                        Button button = (Button) findViewById(2131755965);
                        try {
                            button.setText(2131231428);
                            button.setOnClickListener(new cy(this));
                            if (App.am < 3) {
                                i = 4;
                            }
                            button.setVisibility(i);
                            findViewById(2131755978).setOnClickListener(new ht(this));
                            findViewById(2131755973).setOnClickListener(new amr(this));
                            findViewById(2131755972).setOnClickListener(new aqy(this));
                            findViewById(2131755969).setOnClickListener(new k9(this));
                            findViewById(2131755971).setOnClickListener(new x_(this));
                            ((AnswerCallView) findViewById(2131755976)).setAnswerCallListener(new ail(this));
                            findViewById(2131755967).setOnClickListener(new ar5(this));
                            setIntent(getIntent());
                            App.b((tm) this);
                            this.t = new Handler(new axa(this));
                            return;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
        finish();
        if (getIntent().getBooleanExtra(D[49], false)) {
            aw.a().b();
            Intent intent = new Intent(D[48], null, App.z(), VoiceService.class);
            try {
                intent.putExtra(D[45], getIntent().getStringExtra(D[46]));
                intent.putExtra(D[47], cd.NOTIFICATION_MISSED.getCode());
                startService(intent);
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
        Log.e(D[44]);
    }

    public void c(String str) {
        CharSequence peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            try {
                if (TextUtils.equals(str, peerJid)) {
                    Log.w(D[5] + str + D[4]);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public void b(String str) {
    }

    public void a(CallState callState, CallInfo callInfo) {
        if (callInfo == null) {
            try {
                Log.w(D[16]);
                finish();
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        runOnUiThread(new aqb(this, callInfo.getCallState()));
    }

    static void i(VoipActivity voipActivity) {
        voipActivity.j();
    }

    private void j(String str) {
        try {
            if (this.u != null) {
                return;
            }
            if (Voip.d()) {
                Log.w(D[42]);
                this.u = EndCallConfirmationDialogFragment.a(str);
                this.u.show(getSupportFragmentManager(), null);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void o() {
        int width = getWindowManager().getDefaultDisplay().getWidth();
        Log.i(D[10] + width);
        bq.a(new a98(this, width), new Void[0]);
    }

    static void a(VoipActivity voipActivity) {
        voipActivity.m();
    }

    private void p() {
        try {
            if (this.u != null) {
                this.u.dismissAllowingStateLoss();
                this.u = null;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void k() {
        try {
            Log.i(D[62] + this.r);
            if (this.r != null) {
                l();
                this.v = MessageDialogFragment.b(this.r);
                this.v.show(getSupportFragmentManager(), null);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            auv.a(D[61]);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private static void a(@NonNull Activity activity) {
        App.a((Context) activity, D[54]);
        ActivityCompat.requestPermissions(activity, new String[]{D[53]}, 0);
    }

    private void j() {
        Log.i(D[0]);
        a(CallState.ACCEPT_SENT);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            try {
                if (callInfo.getCallState() != CallState.NONE) {
                    try {
                        if (this.n != null) {
                            this.n.t();
                            if (a(callInfo.getPeerId())) {
                                this.n.I();
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    static VoiceService e(VoipActivity voipActivity) {
        return voipActivity.n;
    }

    static boolean c(VoipActivity voipActivity) {
        return voipActivity.w;
    }

    protected void onUserLeaveHint() {
        Log.i(D[7]);
        this.C = false;
    }

    public void d(String str) {
        CharSequence peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            try {
                if (TextUtils.equals(str, peerJid)) {
                    o();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onNewIntent(android.content.Intent r6) {
        /*
        r5 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r6.getAction();
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0098 }
        r3 = D;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r4 = 23;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.append(r6);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r3 = D;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r4 = 19;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.append(r1);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r3 = D;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r3 = r5.isFinishing();	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0098 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalArgumentException -> 0x0098 }
        super.onNewIntent(r6);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = D;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r2.equals(r1);	 Catch:{ IllegalArgumentException -> 0x0098 }
        if (r2 == 0) goto L_0x0054;
    L_0x004f:
        r5.j();	 Catch:{ IllegalArgumentException -> 0x009a }
        if (r0 == 0) goto L_0x00d8;
    L_0x0054:
        r2 = D;	 Catch:{ IllegalArgumentException -> 0x009c }
        r3 = 25;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x009c }
        r2 = r2.equals(r1);	 Catch:{ IllegalArgumentException -> 0x009c }
        if (r2 == 0) goto L_0x006f;
    L_0x0060:
        r2 = D;	 Catch:{ IllegalArgumentException -> 0x009e }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x009e }
        r2 = r6.getStringExtra(r2);	 Catch:{ IllegalArgumentException -> 0x009e }
        r5.j(r2);	 Catch:{ IllegalArgumentException -> 0x009e }
        if (r0 == 0) goto L_0x00d8;
    L_0x006f:
        r2 = D;	 Catch:{ IllegalArgumentException -> 0x00a0 }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00a0 }
        r1 = r2.equals(r1);	 Catch:{ IllegalArgumentException -> 0x00a0 }
        if (r1 == 0) goto L_0x0088;
    L_0x007b:
        r1 = r5.n;	 Catch:{ IllegalArgumentException -> 0x00a2 }
        if (r1 == 0) goto L_0x00d8;
    L_0x007f:
        r1 = r5.n;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r2 = com.whatsapp.vl.USER_END_CALL_AFTER_CONFIRMATION;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r1.a(r2);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r0 == 0) goto L_0x00d8;
    L_0x0088:
        r0 = r5.isFinishing();	 Catch:{ IllegalArgumentException -> 0x00a6 }
        if (r0 == 0) goto L_0x00a8;
    L_0x008e:
        r0 = D;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r1 = 20;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00a6 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x00a6 }
    L_0x0097:
        return;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009e }
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r5.setIntent(r6);
        r5.n();
        r5.o();
        r0 = D;
        r1 = 21;
        r0 = r0[r1];
        r1 = 0;
        r0 = r6.getBooleanExtra(r0, r1);
        if (r0 == 0) goto L_0x00d8;
    L_0x00be:
        r0 = D;
        r1 = 17;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = 2131755976; // 0x7f1003c8 float:1.9142846E38 double:1.053227393E-314;
        r0 = r5.findViewById(r0);
        r0 = (com.whatsapp.AnswerCallView) r0;
        if (r0 == 0) goto L_0x00d5;
    L_0x00d2:
        r0.a();	 Catch:{ IllegalArgumentException -> 0x00e6 }
    L_0x00d5:
        r5.l();
    L_0x00d8:
        r0 = com.whatsapp.App.z();
        r0 = android.support.v4.app.NotificationManagerCompat.from(r0);
        r1 = 10;
        r0.cancel(r1);
        goto L_0x0097;
    L_0x00e6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipActivity.onNewIntent(android.content.Intent):void");
    }

    protected void onResume() {
        try {
            Log.i(D[8]);
            super.onResume();
            this.w = true;
            this.C = true;
            if (Voip.d()) {
                c();
                this.t.sendEmptyMessageDelayed(1, 500);
                Log.i(D[9]);
                bindService(new Intent(this, VoiceService.class), this.q, 1);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected void onStop() {
        Log.i(D[50]);
        super.onStop();
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            try {
                if (callInfo.getCallState() == CallState.RECEIVED_CALL && VERSION.SDK_INT >= 21) {
                    Intent intent = new Intent(D[52], null, this, VoiceService.class);
                    intent.putExtra(D[51], true);
                    startService(intent);
                    this.p = true;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    static Runnable j(VoipActivity voipActivity) {
        return voipActivity.A;
    }

    public void a(Collection collection) {
    }

    protected void g() {
        try {
            if (vh.k(this) != 1) {
                super.g();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static String h(VoipActivity voipActivity) {
        return voipActivity.r;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(@android.support.annotation.NonNull java.lang.String r7) {
        /*
        r6 = this;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r6.getSupportFragmentManager();
        r4 = D;
        r5 = 31;
        r4 = r4[r5];
        r0 = r0.findFragmentByTag(r4);
        r0 = (android.support.v4.app.DialogFragment) r0;
        if (r0 == 0) goto L_0x0019;
    L_0x0016:
        r0.dismiss();	 Catch:{ IllegalArgumentException -> 0x0027 }
    L_0x0019:
        r0 = D;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r4 = 32;
        r0 = r0[r4];	 Catch:{ IllegalArgumentException -> 0x0029 }
        r0 = com.whatsapp.App.h(r6, r0);	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 != 0) goto L_0x002b;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        return r0;
    L_0x0027:
        r0 = move-exception;
        throw r0;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = D;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1 = 28;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(r6, r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r0 == 0) goto L_0x004b;
    L_0x0037:
        r0 = 0;
        r0 = com.whatsapp.VoipActivity.PermissionDialogFragment.b(r7, r0);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = r6.getSupportFragmentManager();	 Catch:{ IllegalArgumentException -> 0x0072 }
        r4 = D;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r5 = 30;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0.show(r1, r4);	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r3 == 0) goto L_0x006e;
    L_0x004b:
        r0 = D;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r1 = 29;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0074 }
        r0 = com.whatsapp.App.i(r6, r0);	 Catch:{ IllegalArgumentException -> 0x0074 }
        if (r0 == 0) goto L_0x006b;
    L_0x0057:
        r0 = 1;
        r0 = com.whatsapp.VoipActivity.PermissionDialogFragment.b(r7, r0);	 Catch:{ IllegalArgumentException -> 0x0076 }
        r1 = r6.getSupportFragmentManager();	 Catch:{ IllegalArgumentException -> 0x0076 }
        r4 = D;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r5 = 27;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0076 }
        r0.show(r1, r4);	 Catch:{ IllegalArgumentException -> 0x0076 }
        if (r3 == 0) goto L_0x006e;
    L_0x006b:
        a(r6);	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x006e:
        r0 = r2;
        goto L_0x0026;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipActivity.a(java.lang.String):boolean");
    }

    public boolean m489g() {
        return this.C;
    }

    private void n() {
        try {
            if (isFinishing()) {
                Log.i(D[6]);
                return;
            }
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null) {
                try {
                    if (callInfo.getCallState() != CallState.NONE) {
                        this.y.setContact(App.as.b(callInfo.getPeerId()));
                        a(callInfo.getCallState());
                        b(callInfo);
                        c(callInfo);
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static boolean d(int i) {
        switch (i) {
            case arj.Theme_panelMenuListWidth /*79*/:
            case arj.Theme_colorControlNormal /*85*/:
                return true;
            default:
                return false;
        }
    }

    public void l() {
        try {
            if (this.v != null) {
                this.v.dismissAllowingStateLoss();
                this.v = null;
                this.r = null;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a() {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.n != null) {
                if (!this.n.F()) {
                    try {
                        if (this.n.m()) {
                            return true;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private void a(String str, int i) {
        try {
            if (this.B != null) {
                this.B.cancel();
            }
            int[] iArr = new int[2];
            findViewById(2131755977).getLocationOnScreen(iArr);
            int height = c().getWindow().getDecorView().getHeight() - iArr[1];
            this.B = Toast.makeText(c().getApplicationContext(), str, i);
            this.B.setGravity(80, 0, height);
            this.B.show();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static VoiceService a(VoipActivity voipActivity, VoiceService voiceService) {
        voipActivity.n = voiceService;
        return voiceService;
    }

    protected void onStart() {
        try {
            Log.i(D[57]);
            super.onStart();
            if (Voip.d()) {
                n();
                o();
                CallInfo callInfo = Voip.getCallInfo();
                try {
                    if (this.p && callInfo != null) {
                        if (callInfo.getCallState() == CallState.RECEIVED_CALL) {
                            startService(new Intent(D[58], null, this, VoiceService.class));
                            this.p = false;
                            return;
                        }
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            if (getIntent().hasExtra(D[56])) {
                try {
                    k();
                    if (!DialogToastActivity.f) {
                        return;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            finish();
            Log.e(D[59]);
        } catch (IllegalArgumentException e222) {
            throw e222;
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    static void b(Activity activity) {
        a(activity);
    }

    public static boolean b(int i) {
        switch (i) {
            case arj.Toolbar_subtitleTextColor /*24*/:
            case arj.Theme_actionMenuTextAppearance /*25*/:
            case arj.Theme_alertDialogStyle /*91*/:
            case 164:
                return true;
            default:
                return false;
        }
    }

    public VoipActivity() {
        this.A = new anq(this);
        this.q = new l4(this);
    }

    public void e(String str) {
        this.r = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r6, android.view.KeyEvent r7) {
        /*
        r5 = this;
        r4 = 24;
        r0 = 1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = D;
        r3 = 34;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r7);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = com.whatsapp.Voip.getCallInfo();
        r2 = r5.n;	 Catch:{ IllegalArgumentException -> 0x0043 }
        if (r2 == 0) goto L_0x00b5;
    L_0x0025:
        if (r1 == 0) goto L_0x00b5;
    L_0x0027:
        r2 = r1.getCallState();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r3 = com.whatsapp.Voip.CallState.NONE;	 Catch:{ IllegalArgumentException -> 0x0047 }
        if (r2 == r3) goto L_0x00b5;
    L_0x002f:
        r1 = r1.getCallState();	 Catch:{ IllegalArgumentException -> 0x0049 }
        r2 = com.whatsapp.Voip.CallState.RECEIVED_CALL;	 Catch:{ IllegalArgumentException -> 0x0049 }
        if (r1 != r2) goto L_0x007f;
    L_0x0037:
        r1 = b(r6);	 Catch:{ IllegalArgumentException -> 0x004b }
        if (r1 == 0) goto L_0x004d;
    L_0x003d:
        r1 = r5.n;	 Catch:{ IllegalArgumentException -> 0x004b }
        r1.M();	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x0042:
        return r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r1 = c(r6);	 Catch:{ IllegalArgumentException -> 0x0068 }
        if (r1 != 0) goto L_0x0059;
    L_0x0053:
        r1 = d(r6);	 Catch:{ IllegalArgumentException -> 0x0066 }
        if (r1 == 0) goto L_0x006a;
    L_0x0059:
        r1 = D;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r2 = 37;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0066 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r5.j();	 Catch:{ IllegalArgumentException -> 0x0066 }
        goto L_0x0042;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x006a:
        r1 = a(r6);	 Catch:{ IllegalArgumentException -> 0x007d }
        if (r1 == 0) goto L_0x00b5;
    L_0x0070:
        r1 = D;	 Catch:{ IllegalArgumentException -> 0x007d }
        r2 = 35;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x007d }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalArgumentException -> 0x007d }
        r5.i();	 Catch:{ IllegalArgumentException -> 0x007d }
        goto L_0x0042;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r1 = a(r6);	 Catch:{ IllegalArgumentException -> 0x00a0 }
        if (r1 != 0) goto L_0x0091;
    L_0x0085:
        r1 = d(r6);	 Catch:{ IllegalArgumentException -> 0x00a2 }
        if (r1 == 0) goto L_0x00a4;
    L_0x008b:
        r1 = r7.getRepeatCount();	 Catch:{ IllegalArgumentException -> 0x009e }
        if (r1 != 0) goto L_0x00a4;
    L_0x0091:
        r1 = D;	 Catch:{ IllegalArgumentException -> 0x009e }
        r2 = 36;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x009e }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalArgumentException -> 0x009e }
        r5.m();	 Catch:{ IllegalArgumentException -> 0x009e }
        goto L_0x0042;
    L_0x009e:
        r0 = move-exception;
        throw r0;
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009e }
    L_0x00a4:
        if (r6 == r4) goto L_0x00aa;
    L_0x00a6:
        r1 = 25;
        if (r6 != r1) goto L_0x00b5;
    L_0x00aa:
        r2 = r5.n;	 Catch:{ IllegalArgumentException -> 0x00ba }
        if (r6 != r4) goto L_0x00bc;
    L_0x00ae:
        r1 = r0;
    L_0x00af:
        r1 = r2.e(r1);	 Catch:{ IllegalArgumentException -> 0x00be }
        if (r1 != 0) goto L_0x0042;
    L_0x00b5:
        r0 = super.onKeyDown(r6, r7);
        goto L_0x0042;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r1 = 0;
        goto L_0x00af;
    L_0x00be:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    static void b(VoipActivity voipActivity) {
        voipActivity.p();
    }

    public void d() {
        this.t.removeMessages(2);
        this.t.sendEmptyMessageDelayed(2, 3000);
    }

    public void f() {
        this.t.removeMessages(2);
        CallInfo callInfo = Voip.getCallInfo();
        try {
            if (this.n == null) {
                return;
            }
            if (this.n.aA && callInfo != null) {
                try {
                    if (callInfo.getBytesReceived() == 0) {
                        try {
                            if (callInfo.getCallState() != CallState.ACTIVE) {
                                try {
                                    if (callInfo.getCallState() != CallState.ACCEPT_SENT) {
                                        try {
                                            if (callInfo.getCallState() != CallState.ACCEPT_RECEIVED) {
                                                return;
                                            }
                                        } catch (IllegalArgumentException e) {
                                            throw e;
                                        }
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw e2;
                                }
                            }
                            a(getString(2131232253), 1);
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        } catch (IllegalArgumentException e22222) {
            try {
                throw e22222;
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            }
        }
    }

    protected void onDestroy() {
        try {
            Log.i(D[60]);
            super.onDestroy();
            if (this.B != null) {
                this.B.cancel();
            }
            try {
                App.a((tm) this);
                if (this.n != null) {
                    this.n.a(null);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static boolean c(int i) {
        switch (i) {
            case at.m /*5*/:
            case 126:
                return true;
            default:
                return false;
        }
    }

    static boolean a(VoipActivity voipActivity, boolean z) {
        voipActivity.o = z;
        return z;
    }

    private void i() {
        try {
            Log.i(D[38]);
            if (this.n != null) {
                this.n.E();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static void d(VoipActivity voipActivity) {
        voipActivity.c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.Voip.CallInfo r9) {
        /*
        r8 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x0010 }
        if (r1 != 0) goto L_0x0012;
    L_0x0006:
        r0 = D;	 Catch:{ IllegalArgumentException -> 0x0010 }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0010 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x0010 }
    L_0x000f:
        return;
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        if (r9 == 0) goto L_0x002e;
    L_0x0014:
        r1 = com.whatsapp._x.a;	 Catch:{ IllegalArgumentException -> 0x0164 }
        r2 = r9.getCallState();	 Catch:{ IllegalArgumentException -> 0x0164 }
        r2 = r2.ordinal();	 Catch:{ IllegalArgumentException -> 0x0164 }
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0164 }
        switch(r1) {
            case 1: goto L_0x0037;
            case 2: goto L_0x0116;
            case 3: goto L_0x0116;
            case 4: goto L_0x0120;
            case 5: goto L_0x0158;
            default: goto L_0x0023;
        };
    L_0x0023:
        r1 = D;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0035 }
        com.whatsapp.auv.a(r1);	 Catch:{ IllegalArgumentException -> 0x0035 }
        if (r0 == 0) goto L_0x000f;
    L_0x002e:
        r0 = r8.s;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r1 = 0;
        r0.setText(r1);	 Catch:{ IllegalArgumentException -> 0x0035 }
        goto L_0x000f;
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r1 = r9.isSelfInterrupted();	 Catch:{ IllegalArgumentException -> 0x0166 }
        if (r1 != 0) goto L_0x0043;
    L_0x003d:
        r1 = r9.isPeerInterrupted();	 Catch:{ IllegalArgumentException -> 0x0168 }
        if (r1 == 0) goto L_0x004d;
    L_0x0043:
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x016a }
        r2 = 2131232267; // 0x7f08060b float:1.8080638E38 double:1.0529686464E-314;
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x016a }
        if (r0 == 0) goto L_0x000f;
    L_0x004d:
        r2 = r9.getBytesReceived();	 Catch:{ IllegalArgumentException -> 0x016c }
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 != 0) goto L_0x0061;
    L_0x0057:
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x016e }
        r2 = 2131232253; // 0x7f0805fd float:1.808061E38 double:1.0529686395E-314;
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x016e }
        if (r0 == 0) goto L_0x000f;
    L_0x0061:
        r1 = r8.n;	 Catch:{ IllegalArgumentException -> 0x0170 }
        if (r1 == 0) goto L_0x0077;
    L_0x0065:
        r1 = r8.n;	 Catch:{ IllegalArgumentException -> 0x0172 }
        r1 = r1.a(r9);	 Catch:{ IllegalArgumentException -> 0x0172 }
        if (r1 == 0) goto L_0x0077;
    L_0x006d:
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x0174 }
        r2 = 2131232269; // 0x7f08060d float:1.8080642E38 double:1.0529686474E-314;
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x0174 }
        if (r0 == 0) goto L_0x000f;
    L_0x0077:
        r1 = r8.n;	 Catch:{ IllegalArgumentException -> 0x0176 }
        if (r1 == 0) goto L_0x00a5;
    L_0x007b:
        r1 = r8.n;	 Catch:{ IllegalArgumentException -> 0x0178 }
        r1 = r1.N();	 Catch:{ IllegalArgumentException -> 0x0178 }
        if (r1 == 0) goto L_0x00a5;
    L_0x0083:
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x017a }
        r2 = 2131232268; // 0x7f08060c float:1.808064E38 double:1.052968647E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalArgumentException -> 0x017a }
        r4 = 0;
        r5 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x017a }
        r6 = r9.getPeerId();	 Catch:{ IllegalArgumentException -> 0x017a }
        r5 = r5.b(r6);	 Catch:{ IllegalArgumentException -> 0x017a }
        r5 = r5.i();	 Catch:{ IllegalArgumentException -> 0x017a }
        r3[r4] = r5;	 Catch:{ IllegalArgumentException -> 0x017a }
        r2 = r8.getString(r2, r3);	 Catch:{ IllegalArgumentException -> 0x017a }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x017a }
        if (r0 == 0) goto L_0x000f;
    L_0x00a5:
        r1 = com.whatsapp.App.am;	 Catch:{ IllegalArgumentException -> 0x017c }
        r2 = 3;
        if (r1 < r2) goto L_0x0104;
    L_0x00aa:
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x017e }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x017e }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x017e }
        r4 = r9.getCallDuration();	 Catch:{ IllegalArgumentException -> 0x017e }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 / r6;
        r3 = android.text.format.DateUtils.formatElapsedTime(r4);	 Catch:{ IllegalArgumentException -> 0x017e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x017e }
        r3 = D;	 Catch:{ IllegalArgumentException -> 0x017e }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x017e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x017e }
        r4 = r9.getECMode();	 Catch:{ IllegalArgumentException -> 0x017e }
        r3 = (int) r4;	 Catch:{ IllegalArgumentException -> 0x017e }
        r3 = com.whatsapp.Voip.e(r3);	 Catch:{ IllegalArgumentException -> 0x017e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x017e }
        r3 = D;	 Catch:{ IllegalArgumentException -> 0x017e }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x017e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x017e }
        r4 = r9.getEchoLevelBeforeEC();	 Catch:{ IllegalArgumentException -> 0x017e }
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x017e }
        r3 = D;	 Catch:{ IllegalArgumentException -> 0x017e }
        r4 = 15;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x017e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x017e }
        r4 = r9.getEchoLevel();	 Catch:{ IllegalArgumentException -> 0x017e }
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x017e }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x017e }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x017e }
        if (r0 == 0) goto L_0x000f;
    L_0x0104:
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x0180 }
        r2 = r9.getCallDuration();	 Catch:{ IllegalArgumentException -> 0x0180 }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 / r4;
        r2 = android.text.format.DateUtils.formatElapsedTime(r2);	 Catch:{ IllegalArgumentException -> 0x0180 }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x0180 }
        if (r0 == 0) goto L_0x000f;
    L_0x0116:
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x0182 }
        r2 = 2131232253; // 0x7f0805fd float:1.808061E38 double:1.0529686395E-314;
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x0182 }
        if (r0 == 0) goto L_0x000f;
    L_0x0120:
        r1 = r8.n;	 Catch:{ IllegalArgumentException -> 0x0184 }
        if (r1 == 0) goto L_0x014e;
    L_0x0124:
        r1 = r8.n;	 Catch:{ IllegalArgumentException -> 0x0186 }
        r1 = r1.A();	 Catch:{ IllegalArgumentException -> 0x0186 }
        if (r1 == 0) goto L_0x014e;
    L_0x012c:
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x0188 }
        r2 = 2131231596; // 0x7f08036c float:1.8079277E38 double:1.052968315E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalArgumentException -> 0x0188 }
        r4 = 0;
        r5 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x0188 }
        r6 = r9.getPeerId();	 Catch:{ IllegalArgumentException -> 0x0188 }
        r5 = r5.b(r6);	 Catch:{ IllegalArgumentException -> 0x0188 }
        r5 = r5.a(r8);	 Catch:{ IllegalArgumentException -> 0x0188 }
        r3[r4] = r5;	 Catch:{ IllegalArgumentException -> 0x0188 }
        r2 = r8.getString(r2, r3);	 Catch:{ IllegalArgumentException -> 0x0188 }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x0188 }
        if (r0 == 0) goto L_0x000f;
    L_0x014e:
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x018a }
        r2 = 2131232251; // 0x7f0805fb float:1.8080606E38 double:1.0529686385E-314;
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x018a }
        if (r0 == 0) goto L_0x000f;
    L_0x0158:
        r1 = r8.s;	 Catch:{ IllegalArgumentException -> 0x018c }
        r2 = 2131232248; // 0x7f0805f8 float:1.80806E38 double:1.052968637E-314;
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x018c }
        if (r0 == 0) goto L_0x000f;
    L_0x0162:
        goto L_0x0023;
    L_0x0164:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0166 }
    L_0x0166:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0168 }
    L_0x0168:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x016a }
    L_0x016a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x016c }
    L_0x016c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x016e }
    L_0x016e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0170 }
    L_0x0170:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0172 }
    L_0x0172:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0174 }
    L_0x0174:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0176 }
    L_0x0176:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0178 }
    L_0x0178:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x017a }
    L_0x017a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x017c }
    L_0x017c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x017e }
    L_0x017e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0180 }
    L_0x0180:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0182 }
    L_0x0182:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0184 }
    L_0x0184:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0186 }
    L_0x0186:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0188 }
    L_0x0188:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x018a }
    L_0x018a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x018c }
    L_0x018c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0035 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipActivity.b(com.whatsapp.Voip$CallInfo):void");
    }

    public Activity m488c() {
        return this;
    }

    private void a(View view, int i) {
        Animation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(1.0f));
        scaleAnimation.setDuration(300);
        scaleAnimation.setStartOffset((long) i);
        view.startAnimation(scaleAnimation);
    }

    public static boolean a(int i) {
        switch (i) {
            case Y.f /*6*/:
            case arj.Theme_colorControlActivated /*86*/:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.Voip.CallState r10) {
        /*
        r9 = this;
        r3 = 8;
        r2 = 0;
        r0 = com.whatsapp.Voip.CallState.NONE;	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r10 == r0) goto L_0x0039;
    L_0x0007:
        r0 = 1;
        r1 = r0;
    L_0x0009:
        r0 = 2131755976; // 0x7f1003c8 float:1.9142846E38 double:1.053227393E-314;
        r0 = r9.findViewById(r0);
        r4 = 2131755966; // 0x7f1003be float:1.9142826E38 double:1.053227388E-314;
        r4 = r9.findViewById(r4);
        r5 = 2131755977; // 0x7f1003c9 float:1.9142849E38 double:1.0532273936E-314;
        r5 = r9.findViewById(r5);
        r6 = 2131755968; // 0x7f1003c0 float:1.914283E38 double:1.053227389E-314;
        r6 = r9.findViewById(r6);
        if (r0 == 0) goto L_0x002d;
    L_0x0027:
        if (r4 == 0) goto L_0x002d;
    L_0x0029:
        if (r5 == 0) goto L_0x002d;
    L_0x002b:
        if (r6 != 0) goto L_0x003d;
    L_0x002d:
        r0 = D;	 Catch:{ IllegalArgumentException -> 0x003b }
        r1 = 39;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x003b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0036:
        return;
    L_0x0037:
        r0 = move-exception;
        throw r0;
    L_0x0039:
        r1 = r2;
        goto L_0x0009;
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r7 = com.whatsapp.Voip.CallState.RECEIVED_CALL;	 Catch:{ IllegalArgumentException -> 0x00d0 }
        if (r10 != r7) goto L_0x0060;
    L_0x0041:
        r7 = D;	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r8 = 40;
        r7 = r7[r8];	 Catch:{ IllegalArgumentException -> 0x00d0 }
        com.whatsapp.util.Log.i(r7);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r7 = 0;
        r0.setVisibility(r7);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r7 = 0;
        r4.setVisibility(r7);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r7 = 8;
        r5.setVisibility(r7);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r7 = 8;
        r6.setVisibility(r7);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r7 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x00d0 }
        if (r7 == 0) goto L_0x00cc;
    L_0x0060:
        r7 = D;
        r8 = 41;
        r7 = r7[r8];
        com.whatsapp.util.Log.i(r7);
        r0.setVisibility(r3);
        r4.setVisibility(r3);
        r5.setVisibility(r2);
        r6.setVisibility(r2);
        r0 = 2131755978; // 0x7f1003ca float:1.914285E38 double:1.053227394E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r4 = 2131755969; // 0x7f1003c1 float:1.9142832E38 double:1.0532273896E-314;
        r4 = r9.findViewById(r4);
        r5 = 2131755971; // 0x7f1003c3 float:1.9142836E38 double:1.0532273906E-314;
        r5 = r9.findViewById(r5);
        r6 = 2131755972; // 0x7f1003c4 float:1.9142838E38 double:1.053227391E-314;
        r6 = r9.findViewById(r6);
        r7 = 2131755973; // 0x7f1003c5 float:1.914284E38 double:1.0532273916E-314;
        r7 = r9.findViewById(r7);
        r8 = 2131755970; // 0x7f1003c2 float:1.9142834E38 double:1.05322739E-314;
        r8 = r9.findViewById(r8);
        if (r1 == 0) goto L_0x00d2;
    L_0x00a3:
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x00d4 }
        if (r1 == 0) goto L_0x00cc;
    L_0x00a8:
        r1 = r9.z;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        r2 = com.whatsapp.Voip.CallState.RECEIVED_CALL;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        if (r1 != r2) goto L_0x00cc;
    L_0x00ae:
        r1 = 0;
        r9.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r0 = 100;
        r9.a(r4, r0);	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r0 = r8.isShown();	 Catch:{ IllegalArgumentException -> 0x00d8 }
        if (r0 == 0) goto L_0x00c2;
    L_0x00bd:
        r0 = 100;
        r9.a(r5, r0);	 Catch:{ IllegalArgumentException -> 0x00d8 }
    L_0x00c2:
        r0 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r9.a(r6, r0);
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r9.a(r7, r0);
    L_0x00cc:
        r9.z = r10;
        goto L_0x0036;
    L_0x00d0:
        r0 = move-exception;
        throw r0;
    L_0x00d2:
        r2 = r3;
        goto L_0x00a3;
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipActivity.a(com.whatsapp.Voip$CallState):void");
    }
}
