package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.text.TextPaint;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import com.whatsapp.util.u;
import java.util.ArrayList;
import java.util.Arrays;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class DialogToastActivity extends WAAppCompatActivity implements by {
    public static boolean f;
    private static DialogFragment l;
    private static final String[] z;
    private ViewGroup d;
    private ViewGroup e;
    private boolean g;
    private boolean h;
    private boolean i;
    private g0 j;
    private boolean k;
    private View m;

    public class ClockWrongDialogFragment extends DialogFragment {
        private static final String z;
        boolean b;

        static {
            char[] toCharArray = "}_=M|qY1D<r\u00103D<v[}_!z^7".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 21;
                        break;
                    case at.g /*1*/:
                        i2 = 48;
                        break;
                    case at.i /*2*/:
                        i2 = 80;
                        break;
                    case at.o /*3*/:
                        i2 = 40;
                        break;
                    default:
                        i2 = 83;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public void onConfigurationChanged(Configuration configuration) {
            this.b = false;
            dismiss();
            new ClockWrongDialogFragment().show(getActivity().getSupportFragmentManager(), getClass().getName());
        }

        public ClockWrongDialogFragment() {
            this.b = true;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            if (this.b && getActivity() != null) {
                getActivity().finish();
            }
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            Log.w(z);
            return aro.b(getActivity());
        }

        public void onResume() {
            super.onResume();
            if (!App.p.F()) {
                dismiss();
            }
        }
    }

    public class ContactBlockedDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[5];
            String str = "oF;\\geF";
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
                            i3 = 2;
                            break;
                        case at.g /*1*/:
                            i3 = 35;
                            break;
                        case at.i /*2*/:
                            i3 = 72;
                            break;
                        case at.o /*3*/:
                            i3 = 47;
                            break;
                        default:
                            i3 = 6;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "hJ,";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "jL%J)fJ)Cie\u0003+@hvB+[+`O'LmgG";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "oF;\\geF";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "hJ,";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        static DialogFragment b(String str, String str2) {
            return a(str, str2);
        }

        private static DialogFragment a(String str, String str2) {
            DialogFragment contactBlockedDialogFragment = new ContactBlockedDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[0], str);
            bundle.putString(z[1], str2);
            contactBlockedDialogFragment.setArguments(bundle);
            return contactBlockedDialogFragment;
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            Log.w(z[3]);
            return aro.a(getActivity(), getArguments().getString(z[4]), getArguments().getString(z[2]));
        }
    }

    public class LoginFailedDialogFragment extends DialogFragment {
        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(2131231414).setCancelable(false).setPositiveButton(2131231588, new wr(this)).create();
        }
    }

    public class MessageDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[11];
            String str = "QX[!dR";
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
                            i3 = 33;
                            break;
                        case at.g /*1*/:
                            i3 = 57;
                            break;
                        case at.i /*2*/:
                            i3 = 41;
                            break;
                        case at.o /*3*/:
                            i3 = 64;
                            break;
                        default:
                            i3 = 9;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "UP],l~PM";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "L\\Z3hF\\v)m";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "L\\Z3hF\\";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "QX[!dR";
                        obj = 4;
                        strArr2 = strArr3;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "UP],l~PM";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "L\\Z3hF\\v)m";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "UP],l~PM";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        str = "L\\Z3hF\\v)m";
                        obj = 8;
                        i = 9;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        strArr2 = strArr3;
                        str = "L\\Z3hF\\";
                        obj = 9;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "L\\Z3hF\\v)m";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        private static DialogFragment b(String str) {
            DialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[10], str);
            messageDialogFragment.setArguments(bundle);
            return messageDialogFragment;
        }

        public void show(FragmentManager fragmentManager, String str) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add((Fragment) this, str);
            beginTransaction.commitAllowingStateLoss();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            if (getActivity() instanceof DialogToastActivity) {
                ((DialogToastActivity) getActivity()).g(getArguments().getInt(z[3]));
            }
        }

        static DialogFragment b(int i, int i2, String[] strArr) {
            return a(i, i2, strArr);
        }

        static DialogFragment b(int i, int i2) {
            return a(i, i2);
        }

        private static DialogFragment a(int i, int i2) {
            DialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(z[8], i);
            bundle.putInt(z[9], i2);
            messageDialogFragment.setArguments(bundle);
            return messageDialogFragment;
        }

        private static DialogFragment a(int i, int i2, String[] strArr) {
            DialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
            bundle.putInt(z[2], i);
            bundle.putInt(z[1], i2);
            bundle.putStringArrayList(z[0], arrayList);
            messageDialogFragment.setArguments(bundle);
            return messageDialogFragment;
        }

        static DialogFragment a(String str) {
            return b(str);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.support.annotation.NonNull
        public android.app.Dialog onCreateDialog(android.os.Bundle r6) {
            /*
            r5 = this;
            r1 = com.whatsapp.DialogToastActivity.f;
            r0 = r5.getArguments();
            r2 = z;
            r3 = 7;
            r2 = r2[r3];
            r2 = r0.getInt(r2);
            if (r2 != 0) goto L_0x0020;
        L_0x0011:
            r0 = r5.getArguments();
            r3 = z;
            r4 = 4;
            r3 = r3[r4];
            r0 = r0.getString(r3);
            if (r1 == 0) goto L_0x003d;
        L_0x0020:
            r0 = r5.getArguments();
            r3 = z;
            r4 = 5;
            r3 = r3[r4];
            r3 = r0.getStringArrayList(r3);
            if (r3 != 0) goto L_0x0035;
        L_0x002f:
            r0 = r5.getString(r2);
            if (r1 == 0) goto L_0x003d;
        L_0x0035:
            r0 = r3.toArray();
            r0 = r5.getString(r2, r0);
        L_0x003d:
            r1 = r5.getArguments();
            r2 = z;
            r3 = 6;
            r2 = r2[r3];
            r1 = r1.getInt(r2);
            r2 = new android.support.v7.app.AlertDialog$Builder;
            r3 = r5.getActivity();
            r2.<init>(r3);
            r3 = r5.getContext();
            r4 = 0;
            r0 = com.whatsapp.a28.a(r0, r3, r4);
            r0 = r2.setMessage(r0);
            r2 = 1;
            r0 = r0.setCancelable(r2);
            r2 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
            r3 = new com.whatsapp.qv;
            r3.<init>(r5);
            r0 = r0.setPositiveButton(r2, r3);
            if (r1 == 0) goto L_0x0076;
        L_0x0073:
            r0.setTitle(r1);
        L_0x0076:
            r0 = r0.create();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastActivity.MessageDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }
    }

    public class ProgressDialogFragment extends DialogFragment {
        private static final String[] z;
        private boolean b;

        static {
            String[] strArr = new String[6];
            String str = "\r\u001ax1E&\u001ah";
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
                            i3 = 121;
                            break;
                        case at.g /*1*/:
                            i3 = 115;
                            break;
                        case at.i /*2*/:
                            i3 = 12;
                            break;
                        case at.o /*3*/:
                            i3 = 93;
                            break;
                        default:
                            i3 = 32;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\r\u001ax1E&\u001ah";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\u0014\u0016\u007f.A\u001e\u0016S4D";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "\r\u001ax1E&\u001ah";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\u0014\u0016\u007f.A\u001e\u0016S4D";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u0014\u0016\u007f.A\u001e\u0016S4D";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public ProgressDialogFragment() {
            this.b = false;
            Bundle bundle = new Bundle();
            bundle.putInt(z[4], 2131231710);
            bundle.putInt(z[5], 2131231813);
            setArguments(bundle);
        }

        public void show(FragmentManager fragmentManager, String str) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add((Fragment) this, str);
            beginTransaction.commitAllowingStateLoss();
        }

        static DialogFragment b(int i, int i2) {
            return a(i, i2);
        }

        private static DialogFragment a(@StringRes int i, @StringRes int i2) {
            DialogFragment progressDialogFragment = new ProgressDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(z[2], i);
            bundle.putInt(z[3], i2);
            progressDialogFragment.setArguments(bundle);
            return progressDialogFragment;
        }

        public void onStart() {
            super.onStart();
            if (this.b) {
                dismiss();
                this.b = false;
            }
        }

        public void a() {
            if (isResumed()) {
                dismiss();
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            this.b = true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.support.annotation.NonNull
        public android.app.Dialog onCreateDialog(android.os.Bundle r7) {
            /*
            r6 = this;
            r5 = 0;
            r4 = 1;
            if (r7 == 0) goto L_0x0013;
        L_0x0004:
            r0 = com.whatsapp.DialogToastActivity.f();
            if (r0 != 0) goto L_0x0010;
        L_0x000a:
            r6.b = r4;
            r0 = com.whatsapp.DialogToastActivity.f;
            if (r0 == 0) goto L_0x0013;
        L_0x0010:
            com.whatsapp.DialogToastActivity.a(r6);
        L_0x0013:
            r0 = r6.getArguments();
            r1 = z;
            r1 = r1[r5];
            r0 = r0.getInt(r1);
            r1 = r6.getArguments();
            r2 = z;
            r2 = r2[r4];
            r1 = r1.getInt(r2);
            r2 = new android.app.ProgressDialog;
            r3 = r6.getActivity();
            r2.<init>(r3);
            if (r0 == 0) goto L_0x003d;
        L_0x0036:
            r0 = r6.getString(r0);
            r2.setTitle(r0);
        L_0x003d:
            r0 = r6.getString(r1);
            r2.setMessage(r0);
            r2.setIndeterminate(r4);
            r6.setCancelable(r5);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastActivity.ProgressDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }
    }

    public class SoftwareAboutToExpireDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "`42GJl2>N\no{,M\u0003|,>P\u0000%:=M\u0010|v+MHm#/K\u0017m".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 8;
                        break;
                    case at.g /*1*/:
                        i2 = 91;
                        break;
                    case at.i /*2*/:
                        i2 = 95;
                        break;
                    case at.o /*3*/:
                        i2 = 34;
                        break;
                    default:
                        i2 = arj.Theme_buttonStyleSmall;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            Log.i(z);
            return pg.a(getActivity());
        }
    }

    public class SoftwareExpiredDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "Di\u000b\u001f\u0018Ho\u0007\u0016XK&\u0015\u0015QXq\u0007\bR\u0001c\u001e\n^^c\u0002".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 44;
                        break;
                    case at.g /*1*/:
                        i2 = 6;
                        break;
                    case at.i /*2*/:
                        i2 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i2 = 122;
                        break;
                    default:
                        i2 = 55;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            Log.w(z);
            return aro.a(getActivity());
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public class UnsupportedDeviceDialogFragment extends DialogFragment {
        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setTitle(2131232306).setMessage(2131231069).setCancelable(false).setPositiveButton(2131231580, null).create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            Activity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    static {
        String[] strArr = new String[11];
        String str = "3eS\n=0x]\u0007!#j@\u00075:i\\\u001234x[\u0010;#u\u001d\t<5mQ\r\"%iA\u001573#S\u0005&>z[\u0012+wb]F34x[\u00107";
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
                        i3 = 87;
                        break;
                    case at.g /*1*/:
                        i3 = 12;
                        break;
                    case at.i /*2*/:
                        i3 = 50;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "yc\\47$y_\u0003";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "3eS\n=0x]\u0007!##G\u001666xWK\"%cU\u00147$\u007f\u001f\u000b7$\u007fS\u00017x|@\t5%iA\u0015\u007f$|[\b<2~\u001f\b=#!A\u000e= b\u001dFp";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "3eS\n=0x]\u0007!##G\u001666xWK\"%cU\u00147$\u007f\u001f\u000b7$\u007fS\u00017xh[\u0007>8k\u001f\u0012+'i\u001f\b=#!B\u0014=0~W\u0015!zh[\u0007>8k\u001dFp";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "3eS\n=0x]\u0007!##G\u001666xWK\"%cU\u00147$\u007f\u001f\u000b7$\u007fS\u00017xbG\n>zh[\u0007>8k\u001dFp";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "yc\\53!i{\b!#m\\\u00057\u0004xS\u00127";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "yc\\\"7$x@\t+";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "yc\\% 2mF\u0003";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "yc\\5&8|";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "yc\\5&6~F";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "yc\\63\"\u007fW";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void setContentView(int i) {
        setContentView(aam.a(getLayoutInflater(), i, null, false));
    }

    public void b(DialogFragment dialogFragment) {
        if (getSupportFragmentManager().findFragmentByTag(dialogFragment.getClass().getName()) == null) {
            dialogFragment.show(getSupportFragmentManager(), dialogFragment.getClass().getName());
        }
    }

    public void setContentView(View view) {
        if (this.d != null) {
            this.e.addView(view, -1, -1);
            super.setContentView(this.d);
            if (!f) {
                return;
            }
        }
        super.setContentView(view);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        Log.i(getClass().getName() + z[6]);
        super.onSaveInstanceState(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        if (App.j == 3) {
            u.b((Activity) this);
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean a(String str, String str2) {
        if (isFinishing()) {
            return false;
        }
        b(ContactBlockedDialogFragment.b(str, str2));
        return true;
    }

    public void g(@StringRes int i) {
    }

    static DialogFragment f() {
        return l;
    }

    static DialogFragment a(DialogFragment dialogFragment) {
        l = dialogFragment;
        return dialogFragment;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r5) {
        /*
        r4 = this;
        r1 = 1;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = r4.getClass();
        r2 = r2.getName();
        r0 = r0.append(r2);
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.j;
        r2 = 3;
        if (r0 != r2) goto L_0x002b;
    L_0x0028:
        com.whatsapp.util.u.a(r4);
    L_0x002b:
        r0 = r4.getWindow();
        com.whatsapp.aam.a(r0);
        r0 = com.whatsapp.App.av;
        if (r0 == 0) goto L_0x006a;
    L_0x0036:
        r0 = com.whatsapp.aam.a;
        if (r0 != 0) goto L_0x0060;
    L_0x003a:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r2 = r4.getTheme();
        r3 = 2130772146; // 0x7f0100b2 float:1.7147402E38 double:1.0527413165E-314;
        r2.resolveAttribute(r3, r0, r1);
        r2 = r0.type;
        r3 = 18;
        if (r2 != r3) goto L_0x0056;
    L_0x004f:
        r0 = r0.data;
        if (r0 != 0) goto L_0x00aa;
    L_0x0053:
        r0 = r1;
    L_0x0054:
        r4.i = r0;
    L_0x0056:
        r0 = r4.getTheme();
        r2 = 2131493081; // 0x7f0c00d9 float:1.8609632E38 double:1.0530975057E-314;
        r0.applyStyle(r2, r1);
    L_0x0060:
        r0 = r4.getTheme();
        r2 = 2131493086; // 0x7f0c00de float:1.8609642E38 double:1.053097508E-314;
        r0.applyStyle(r2, r1);
    L_0x006a:
        super.onCreate(r5);
        r0 = com.whatsapp.App.av;
        if (r0 == 0) goto L_0x009e;
    L_0x0071:
        r0 = com.whatsapp.aam.a;
        if (r0 != 0) goto L_0x0080;
    L_0x0075:
        r0 = r4.i;
        if (r0 != 0) goto L_0x009e;
    L_0x0079:
        r4.h();
        r0 = f;
        if (r0 == 0) goto L_0x009e;
    L_0x0080:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 >= r1) goto L_0x009e;
    L_0x0086:
        r0 = r4.getSupportActionBar();
        if (r0 == 0) goto L_0x009e;
    L_0x008c:
        r0 = r4.getSupportActionBar();
        r1 = r4.getResources();
        r2 = 2130839455; // 0x7f02079f float:1.7283921E38 double:1.0527745715E-314;
        r1 = r1.getDrawable(r2);
        r0.setHomeAsUpIndicator(r1);
    L_0x009e:
        r0 = new com.whatsapp.g0;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r1);
        r4.j = r0;
        return;
    L_0x00aa:
        r0 = 0;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastActivity.onCreate(android.os.Bundle):void");
    }

    protected void g() {
        if (this.g && vh.f(this)) {
            startActivity(new Intent(this, TosUpdateActivity.class));
        }
    }

    protected void onStop() {
        Log.i(getClass().getName() + z[9]);
        super.onStop();
    }

    public void e() {
        if (l != null) {
            l.dismissAllowingStateLoss();
        }
        l = null;
    }

    @Deprecated
    public void f(String str) {
        if (!isFinishing()) {
            MessageDialogFragment.a(str).show(getSupportFragmentManager(), null);
        }
    }

    protected void onPause() {
        Log.i(getClass().getName() + z[1]);
        App.c((by) this);
        super.onPause();
        if (this.j.hasMessages(0)) {
            this.j.removeMessages(0);
        }
        App.H();
        this.k = false;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public boolean b() {
        if (isFinishing()) {
            return false;
        }
        b(new LoginFailedDialogFragment());
        return true;
    }

    protected void onStart() {
        Log.i(getClass().getName() + z[10]);
        super.onStart();
        vh.a(this);
        g();
    }

    public boolean m445f() {
        if (isFinishing()) {
            return false;
        }
        App.ac = true;
        App.p.R();
        b(new SoftwareExpiredDialogFragment());
        return true;
    }

    public void i(String str) {
        Paint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(2131427554));
        setTitle(a28.a(str, getBaseContext(), textPaint));
    }

    public void f(@StringRes int i) {
        a(0, i);
    }

    public void g(String str) {
        if (!isFinishing()) {
            if (l == null) {
                Log.w(z[3] + str + "\"");
                return;
            }
            Dialog dialog = l.getDialog();
            if (dialog == null) {
                Log.w(z[5] + str + "\"");
            } else if (dialog instanceof ProgressDialog) {
                ((ProgressDialog) dialog).setMessage(str);
            } else {
                Log.w(z[4] + str + "\"");
            }
        }
    }

    public boolean d() {
        if (isFinishing()) {
            return false;
        }
        App.ac = true;
        App.p.R();
        b(new ClockWrongDialogFragment());
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (App.j == 3) {
            u.b((Activity) this);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void a(@StringRes int i, @StringRes int i2) {
        if (!isFinishing()) {
            DialogFragment b = ProgressDialogFragment.b(i, i2);
            if (l == null) {
                l = b;
                b.show(getSupportFragmentManager(), b.getClass().getName());
            }
        }
    }

    public void h(String str) {
        Paint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(2131427549));
        getSupportActionBar().setSubtitle(a28.a(str, getBaseContext(), textPaint));
    }

    public DialogToastActivity() {
        this.h = true;
        this.g = true;
        this.k = true;
    }

    public ActionMode startSupportActionMode(Callback callback) {
        ActionMode startSupportActionMode = super.startSupportActionMode(callback);
        if (startSupportActionMode != null) {
            startSupportActionMode.invalidate();
        }
        return startSupportActionMode;
    }

    protected void onDestroy() {
        Log.i(getClass().getName() + z[7]);
        super.onDestroy();
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
        View inflate;
        int i = 0;
        if (this.m == null) {
            inflate = getLayoutInflater().inflate(2130903066, null, false);
            this.m = inflate.findViewById(2131755177);
            if (this.m != null) {
                getSupportActionBar().setDisplayShowCustomEnabled(true);
                getSupportActionBar().setCustomView(inflate, new LayoutParams(-2, -2, 21));
            }
        }
        if (this.m != null) {
            inflate = this.m;
            if (!z) {
                i = 8;
            }
            inflate.setVisibility(i);
        }
    }

    public void onBackPressed() {
        if (this.k) {
            super.onBackPressed();
            if (!f) {
                return;
            }
        }
        Log.e(z[0]);
    }

    public void a(@StringRes int i) {
        if (!isFinishing()) {
            MessageDialogFragment.b(0, i).show(getSupportFragmentManager(), null);
        }
    }

    protected void onResume() {
        Log.i(getClass().getName() + z[2]);
        App.a((by) this);
        super.onResume();
        if (this.h) {
            this.j.sendEmptyMessageDelayed(0, 3000);
        }
        this.k = true;
    }

    public static void a(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (elapsedRealtime < j2) {
            try {
                Thread.sleep(j2 - elapsedRealtime);
            } catch (InterruptedException e) {
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean m444e() {
        return !this.k;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r6, int r7) {
        /*
        r5 = 1;
        r4 = -1;
        r0 = r6.getLayoutInflater();
        r1 = 2130903280; // 0x7f0300f0 float:1.7413374E38 double:1.0528061053E-314;
        r2 = 0;
        r3 = 0;
        r0 = r0.inflate(r1, r2, r3);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r1 = r6.getTitle();
        r0.setTitle(r1);
        r1 = com.whatsapp.App.av;
        if (r1 == 0) goto L_0x0026;
    L_0x001c:
        r1 = 2130839455; // 0x7f02079f float:1.7283921E38 double:1.0527745715E-314;
        r0.setNavigationIcon(r1);
        r1 = f;
        if (r1 == 0) goto L_0x0030;
    L_0x0026:
        r1 = 2130837526; // 0x7f020016 float:1.7280009E38 double:1.0527736185E-314;
        r1 = android.support.v4.content.ContextCompat.getDrawable(r6, r1);
        r0.setNavigationIcon(r1);
    L_0x0030:
        r1 = new android.widget.LinearLayout;
        r1.<init>(r6);
        r1.setOrientation(r5);
        r2 = r6.getResources();
        r3 = 2131427412; // 0x7f0b0054 float:1.847644E38 double:1.053065061E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r1.addView(r0, r4, r2);
        r2 = new android.widget.FrameLayout;
        r2.<init>(r6);
        r3 = r6.getLayoutInflater();
        com.whatsapp.aam.a(r3, r7, r2, r5);
        r1.addView(r2, r4, r4);
        r6.setContentView(r1);
        r1 = new com.whatsapp.aw8;
        r1.<init>(r6);
        r0.setNavigationOnClickListener(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastActivity.a(android.app.Activity, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
        r9 = this;
        r8 = 2131427412; // 0x7f0b0054 float:1.847644E38 double:1.053065061E-314;
        r7 = 2130839455; // 0x7f02079f float:1.7283921E38 double:1.0527745715E-314;
        r1 = 0;
        r2 = 1;
        r6 = -1;
        r0 = r9.getLayoutInflater();
        r3 = 2130903280; // 0x7f0300f0 float:1.7413374E38 double:1.0528061053E-314;
        r4 = 0;
        r0 = r0.inflate(r3, r4, r1);
        r0 = (android.support.v7.widget.Toolbar) r0;
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 14;
        if (r3 < r4) goto L_0x0020;
    L_0x001d:
        r0.setFitsSystemWindows(r2);
    L_0x0020:
        r3 = com.whatsapp.App.av;
        if (r3 == 0) goto L_0x0027;
    L_0x0024:
        r0.setNavigationIcon(r7);
    L_0x0027:
        r3 = new android.util.TypedValue;
        r3.<init>();
        r4 = r9.getTheme();
        r5 = 2130772148; // 0x7f0100b4 float:1.7147406E38 double:1.0527413174E-314;
        r4.resolveAttribute(r5, r3, r2);
        r4 = r3.type;
        r5 = 18;
        if (r4 != r5) goto L_0x0041;
    L_0x003c:
        r3 = r3.data;
        if (r3 == 0) goto L_0x0041;
    L_0x0040:
        r1 = r2;
    L_0x0041:
        if (r1 == 0) goto L_0x0069;
    L_0x0043:
        r1 = new android.widget.FrameLayout;
        r1.<init>(r9);
        r9.d = r1;
        r1 = new android.widget.FrameLayout;
        r1.<init>(r9);
        r9.e = r1;
        r1 = r9.d;
        r3 = r9.e;
        r1.addView(r3, r6, r6);
        r1 = r9.d;
        r3 = r9.getResources();
        r3 = r3.getDimensionPixelSize(r8);
        r1.addView(r0, r6, r3);
        r1 = f;
        if (r1 == 0) goto L_0x0088;
    L_0x0069:
        r1 = new android.widget.LinearLayout;
        r1.<init>(r9);
        r9.d = r1;
        r1 = r9.d;
        r9.e = r1;
        r1 = r9.d;
        r1 = (android.widget.LinearLayout) r1;
        r1.setOrientation(r2);
        r1 = r9.d;
        r2 = r9.getResources();
        r2 = r2.getDimensionPixelSize(r8);
        r1.addView(r0, r6, r2);
    L_0x0088:
        r9.setSupportActionBar(r0);
        r1 = com.whatsapp.App.av;
        if (r1 == 0) goto L_0x009e;
    L_0x008f:
        r1 = r9.getSupportActionBar();
        r2 = r9.getResources();
        r2 = r2.getDrawable(r7);
        r1.setHomeAsUpIndicator(r2);
    L_0x009e:
        r1 = new com.whatsapp.ph;
        r1.<init>(r9);
        r0.setNavigationOnClickListener(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastActivity.h():void");
    }

    public void a(boolean z) {
        this.h = z;
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

    public void a(@StringRes int i, @StringRes int i2, String[] strArr) {
        if (!isFinishing()) {
            MessageDialogFragment.b(i, i2, strArr).show(getSupportFragmentManager(), null);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.j == 3) {
            switch (i) {
                case arj.Toolbar_subtitleTextColor /*24*/:
                    u.c(this).show();
                    return true;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    u.d();
                    return true;
                case arj.Theme_colorAccent /*84*/:
                    u.a((Activity) this, false);
                    return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
