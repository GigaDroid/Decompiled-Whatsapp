package com.whatsapp;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.appcompat.R;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.cb;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class DocumentPickerActivity extends DialogToastListActivity implements LoaderCallbacks {
    private static final String[] E;
    private final List A;
    private List B;
    private g4 C;
    private MenuItem D;
    private String t;
    private Callback u;
    private int v;
    private List w;
    private String x;
    private ArrayList y;
    private ActionMode z;

    public class SendDocumentsConfirmationDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[5];
            String str = "b\u007fzHI~~g";
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
                            i3 = 23;
                            break;
                        case at.g /*1*/:
                            i3 = 13;
                            break;
                        case at.i /*2*/:
                            i3 = 19;
                            break;
                        case at.o /*3*/:
                            i3 = 23;
                            break;
                        default:
                            i3 = 37;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "qd\u007fr";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "}dw";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "b\u007fzHI~~g";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "}dw";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public static SendDocumentsConfirmationDialogFragment a(@NonNull String str, @NonNull ArrayList arrayList) {
            SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = new SendDocumentsConfirmationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[3], str);
            bundle.putParcelableArrayList(z[4], arrayList);
            sendDocumentsConfirmationDialogFragment.setArguments(bundle);
            return sendDocumentsConfirmationDialogFragment;
        }

        private static String a(Uri uri) {
            if (z[2].equals(uri.getScheme())) {
                return uri.getLastPathSegment();
            }
            return cb.a(uri);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.support.annotation.NonNull
        public android.app.Dialog onCreateDialog(android.os.Bundle r12) {
            /*
            r11 = this;
            r10 = 2;
            r9 = 1;
            r8 = 0;
            r1 = com.whatsapp.DialogToastActivity.f;
            r0 = com.whatsapp.App.as;
            r2 = r11.getArguments();
            r3 = z;
            r3 = r3[r9];
            r2 = r2.getString(r3);
            r0 = r0.b(r2);
            r2 = r11.getContext();
            r2 = r0.a(r2);
            r3 = r11.getArguments();
            r4 = z;
            r4 = r4[r8];
            r3 = r3.getParcelableArrayList(r4);
            r4 = r0.m();
            if (r4 != 0) goto L_0x0037;
        L_0x0031:
            r0 = r0.c();
            if (r0 == 0) goto L_0x0079;
        L_0x0037:
            r0 = r3.get(r8);
            r0 = (android.net.Uri) r0;
            r0 = a(r0);
            r4 = r3.size();
            if (r4 != r9) goto L_0x005c;
        L_0x0047:
            r4 = android.text.TextUtils.isEmpty(r0);
            if (r4 != 0) goto L_0x005c;
        L_0x004d:
            r4 = 2131231276; // 0x7f08022c float:1.8078628E38 double:1.052968157E-314;
            r5 = new java.lang.Object[r10];
            r5[r8] = r0;
            r5[r9] = r2;
            r0 = r11.getString(r4, r5);
            if (r1 == 0) goto L_0x0077;
        L_0x005c:
            r0 = com.whatsapp.App.az;
            r4 = 2131296277; // 0x7f090015 float:1.8210466E38 double:1.0530002716E-314;
            r5 = r3.size();
            r6 = new java.lang.Object[r10];
            r7 = r3.size();
            r7 = java.lang.Integer.valueOf(r7);
            r6[r8] = r7;
            r6[r9] = r2;
            r0 = r0.a(r4, r5, r6);
        L_0x0077:
            if (r1 == 0) goto L_0x00b9;
        L_0x0079:
            r0 = r3.get(r8);
            r0 = (android.net.Uri) r0;
            r0 = a(r0);
            r4 = r3.size();
            if (r4 != r9) goto L_0x009e;
        L_0x0089:
            r4 = android.text.TextUtils.isEmpty(r0);
            if (r4 != 0) goto L_0x009e;
        L_0x008f:
            r4 = 2131230935; // 0x7f0800d7 float:1.8077937E38 double:1.0529679883E-314;
            r5 = new java.lang.Object[r10];
            r5[r8] = r0;
            r5[r9] = r2;
            r0 = r11.getString(r4, r5);
            if (r1 == 0) goto L_0x00b9;
        L_0x009e:
            r0 = com.whatsapp.App.az;
            r1 = 2131296266; // 0x7f09000a float:1.8210444E38 double:1.053000266E-314;
            r4 = r3.size();
            r5 = new java.lang.Object[r10];
            r6 = r3.size();
            r6 = java.lang.Integer.valueOf(r6);
            r5[r8] = r6;
            r5[r9] = r2;
            r0 = r0.a(r1, r4, r5);
        L_0x00b9:
            r1 = new android.support.v7.app.AlertDialog$Builder;
            r2 = r11.getActivity();
            r1.<init>(r2);
            r2 = r11.getContext();
            r0 = com.whatsapp.a28.b(r0, r2);
            r0 = r1.setMessage(r0);
            r1 = 2131231861; // 0x7f080475 float:1.8079815E38 double:1.052968446E-314;
            r2 = new com.whatsapp.aec;
            r2.<init>(r11, r3);
            r0 = r0.setPositiveButton(r1, r2);
            r1 = 2131230884; // 0x7f0800a4 float:1.8077833E38 double:1.052967963E-314;
            r2 = 0;
            r0 = r0.setNegativeButton(r1, r2);
            r0 = r0.create();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DocumentPickerActivity.SendDocumentsConfirmationDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }
    }

    static {
        String[] strArr = new String[20];
        String str = "\u0002w7\"\n\u0003v \b\u0017\u000f{?2\u00159k;%\u0013";
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
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 24;
                        break;
                    case at.i /*2*/:
                        i3 = 84;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\fq0";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0005w9y\u0010\u000ey $\u0006\u0016h\u000b'\u0015\u0003~1%\u0002\b{1$";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0005w9y\u0010\u000ey $\u0006\u0016h";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0005w:#\u0006\u0005l$>\u0004\r}&x\u0017\u0003j9>\u0014\u0015q;9G";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0007v0%\b\u000f|z>\t\u0012}:#I\u0007{ >\b\b6\u001b\u0007\"(G\u0010\u0018$3U\u0011\u00193";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0007h$;\u000e\u0005y >\b\b7\"9\u0003H\u007f;8\u0000\n}y6\u0017\u0016kz$\u0017\u0014}53\u0014\u000e}1#";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0007v0%\b\u000f|z>\t\u0012}:#I\u0003` %\u0006HY\u0018\u001b(1G\u0019\u0002+2Q\u0004\u001b\"";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0007h$;\u000e\u0005y >\b\b7\"9\u0003H\u007f;8\u0000\n}y6\u0017\u0016kz'\u0015\u0003k19\u0013\u0007l=8\t";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "L7~";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0007v0%\b\u000f|z>\t\u0012}:#I\u0005y 2\u0000\tj-y(6]\u001a\u0016%*]";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0007h$;\u000e\u0005y >\b\b7$3\u0001";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0007h$;\u000e\u0005y >\b\b7\"9\u0003H\u007f;8\u0000\n}y6\u0017\u0016kz3\b\u0005m92\t\u0012";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0007v0%\b\u000f|z>\t\u0012}:#I\u0003` %\u0006HU\u001d\u001a\"9L\r\u0007\"5";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0002w7'\u000e\u0005s1%H\u0002}'#\u0015\ta";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0005w9y\u0010\u000ey $\u0006\u0016h\u000b'\u0015\u0003~1%\u0002\b{1$";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0002w7\"\n\u0003v \b\u0017\u000f{?2\u00159k;%\u0013";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0005w9y\u0010\u000ey $\u0006\u0016h\u000b'\u0015\u0003~1%\u0002\b{1$";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0002w7\"\n\u0003v \b\u0017\u000f{?2\u00159k;%\u0013";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    E = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0002w7'\u000e\u0005s1%H\u0005j16\u0013\u0003";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onLoadFinished(Loader loader, Object obj) {
        a(loader, (List) obj);
    }

    static void h(DocumentPickerActivity documentPickerActivity) {
        documentPickerActivity.b();
    }

    static void b(List list, int i) {
        a(list, i);
    }

    static List a(DocumentPickerActivity documentPickerActivity, List list) {
        documentPickerActivity.B = list;
        return list;
    }

    static List k(DocumentPickerActivity documentPickerActivity) {
        return documentPickerActivity.A;
    }

    static void f(DocumentPickerActivity documentPickerActivity) {
        documentPickerActivity.a();
    }

    public DocumentPickerActivity() {
        this.A = new ArrayList();
        this.v = 0;
        this.u = new dr(this);
    }

    static List j(DocumentPickerActivity documentPickerActivity) {
        return documentPickerActivity.w;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            if (menuItem.getItemId() == 2131756001) {
                this.v = 0;
                getSharedPreferences(E[18], 0).edit().putInt(E[19], this.v).commit();
                invalidateOptionsMenu();
                a(this.x);
            } else {
                try {
                    if (menuItem.getItemId() == 2131756002) {
                        this.v = 1;
                        getSharedPreferences(E[16], 0).edit().putInt(E[17], this.v).commit();
                        invalidateOptionsMenu();
                        a(this.x);
                    } else {
                        try {
                            if (menuItem.getItemId() == 16908332) {
                                finish();
                            }
                        } catch (SecurityException e) {
                            throw e;
                        }
                    }
                } catch (SecurityException e2) {
                    throw e2;
                }
            }
            return true;
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    static ActionMode a(DocumentPickerActivity documentPickerActivity, ActionMode actionMode) {
        documentPickerActivity.z = actionMode;
        return actionMode;
    }

    public void onDestroy() {
        Log.i(E[15]);
        super.onDestroy();
    }

    public void a(Loader loader, List list) {
        try {
            this.w = list;
            if (this.D != null) {
                boolean z;
                MenuItem menuItem = this.D;
                if (this.w != null) {
                    try {
                        if (!this.w.isEmpty()) {
                            z = true;
                            menuItem.setVisible(z);
                        }
                    } catch (SecurityException e) {
                        throw e;
                    }
                }
                z = false;
                menuItem.setVisible(z);
            }
            try {
                a(this.x);
                if (VERSION.SDK_INT >= 19) {
                    if (this.w != null) {
                        try {
                            if (!this.w.isEmpty()) {
                                return;
                            }
                        } catch (SecurityException e2) {
                            throw e2;
                        }
                    }
                    b();
                }
            } catch (SecurityException e22) {
                throw e22;
            } catch (SecurityException e222) {
                throw e222;
            }
        } catch (SecurityException e2222) {
            throw e2222;
        } catch (SecurityException e22222) {
            throw e22222;
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        try {
            super.onActivityResult(i, i2, intent);
            switch (i) {
                case at.g /*1*/:
                    if (i2 == -1) {
                        ArrayList arrayList = new ArrayList();
                        ClipData clipData = intent.getClipData();
                        if (clipData != null) {
                            int i3 = 0;
                            while (i3 < clipData.getItemCount()) {
                                Item itemAt = clipData.getItemAt(i3);
                                if (itemAt != null) {
                                    Uri uri = itemAt.getUri();
                                    if (uri != null) {
                                        try {
                                            arrayList.add(uri);
                                        } catch (SecurityException e) {
                                            throw e;
                                        }
                                    }
                                }
                                i3++;
                                if (z) {
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Uri data = intent.getData();
                            if (data != null) {
                                try {
                                    arrayList.add(data);
                                } catch (SecurityException e2) {
                                    throw e2;
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                try {
                                    grantUriPermission(E[4], (Uri) it.next(), 1);
                                    continue;
                                } catch (SecurityException e22) {
                                    Log.w(E[5] + e22);
                                    continue;
                                }
                                if (z) {
                                    SendDocumentsConfirmationDialogFragment.a(this.t, arrayList).show(getSupportFragmentManager(), null);
                                }
                            }
                            SendDocumentsConfirmationDialogFragment.a(this.t, arrayList).show(getSupportFragmentManager(), null);
                        }
                        if (!z) {
                            return;
                        }
                    }
                    if (i2 == 0) {
                        try {
                            if (this.w != null) {
                                if (!this.w.isEmpty()) {
                                    return;
                                }
                            }
                            finish();
                        } catch (SecurityException e222) {
                            throw e222;
                        } catch (SecurityException e2222) {
                            throw e2222;
                        }
                    }
                default:
            }
        } catch (SecurityException e22222) {
            throw e22222;
        }
    }

    static ArrayList a(DocumentPickerActivity documentPickerActivity, ArrayList arrayList) {
        documentPickerActivity.y = arrayList;
        return arrayList;
    }

    static void a(DocumentPickerActivity documentPickerActivity, CharSequence charSequence) {
        documentPickerActivity.a(charSequence);
    }

    static ArrayList a(DocumentPickerActivity documentPickerActivity) {
        return documentPickerActivity.y;
    }

    static void a(DocumentPickerActivity documentPickerActivity, File file) {
        documentPickerActivity.a(file);
    }

    public Loader onCreateLoader(int i, Bundle bundle) {
        return new an6(this);
    }

    static String b(DocumentPickerActivity documentPickerActivity) {
        return documentPickerActivity.x;
    }

    static List g(DocumentPickerActivity documentPickerActivity) {
        return documentPickerActivity.B;
    }

    static ActionMode c(DocumentPickerActivity documentPickerActivity) {
        return documentPickerActivity.z;
    }

    public void onLoaderReset(Loader loader) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r5) {
        /*
        r4 = this;
        r3 = 1;
        r0 = 2131756001; // 0x7f1003e1 float:1.9142897E38 double:1.0532274054E-314;
        r0 = r5.findItem(r0);
        r1 = 2131756002; // 0x7f1003e2 float:1.91429E38 double:1.053227406E-314;
        r1 = r5.findItem(r1);
        r2 = r4.v;	 Catch:{ SecurityException -> 0x0020 }
        if (r2 != 0) goto L_0x001b;
    L_0x0013:
        r2 = 1;
        r0.setChecked(r2);	 Catch:{ SecurityException -> 0x0022 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ SecurityException -> 0x0022 }
        if (r0 == 0) goto L_0x001f;
    L_0x001b:
        r0 = 1;
        r1.setChecked(r0);	 Catch:{ SecurityException -> 0x0022 }
    L_0x001f:
        return r3;
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DocumentPickerActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    static g4 l(DocumentPickerActivity documentPickerActivity) {
        return documentPickerActivity.C;
    }

    static int d(DocumentPickerActivity documentPickerActivity) {
        return documentPickerActivity.v;
    }

    static Callback i(DocumentPickerActivity documentPickerActivity) {
        return documentPickerActivity.u;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r9 = this;
        r8 = 2131755623; // 0x7f100267 float:1.914213E38 double:1.0532272187E-314;
        r7 = 2131755379; // 0x7f100173 float:1.9141636E38 double:1.053227098E-314;
        r6 = 8;
        r5 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.C;	 Catch:{ SecurityException -> 0x0093 }
        r0 = r0.getCount();	 Catch:{ SecurityException -> 0x0093 }
        if (r0 != 0) goto L_0x0086;
    L_0x0013:
        r0 = r9.w;	 Catch:{ SecurityException -> 0x0095 }
        if (r0 != 0) goto L_0x0030;
    L_0x0017:
        r0 = 2131755379; // 0x7f100173 float:1.9141636E38 double:1.053227098E-314;
        r0 = r9.findViewById(r0);	 Catch:{ SecurityException -> 0x0097 }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ SecurityException -> 0x0097 }
        r0 = 2131755623; // 0x7f100267 float:1.914213E38 double:1.0532272187E-314;
        r0 = r9.findViewById(r0);	 Catch:{ SecurityException -> 0x0097 }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ SecurityException -> 0x0097 }
        if (r1 == 0) goto L_0x0079;
    L_0x0030:
        r0 = r9.y;	 Catch:{ SecurityException -> 0x0099 }
        if (r0 == 0) goto L_0x005f;
    L_0x0034:
        r0 = r9.y;	 Catch:{ SecurityException -> 0x0099 }
        r0 = r0.isEmpty();	 Catch:{ SecurityException -> 0x0099 }
        if (r0 != 0) goto L_0x005f;
    L_0x003c:
        r0 = r9.findViewById(r7);
        r0 = (android.widget.TextView) r0;
        r0.setVisibility(r5);
        r2 = 2131231851; // 0x7f08046b float:1.8079795E38 double:1.052968441E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r4 = r9.x;
        r3[r5] = r4;
        r2 = r9.getString(r2, r3);
        r0.setText(r2);
        r0 = r9.findViewById(r8);
        r0.setVisibility(r6);
        if (r1 == 0) goto L_0x0079;
    L_0x005f:
        r0 = r9.findViewById(r7);
        r0 = (android.widget.TextView) r0;
        r0.setVisibility(r5);
        r2 = 2131231552; // 0x7f080340 float:1.8079188E38 double:1.052968293E-314;
        r2 = r9.getString(r2);
        r0.setText(r2);
        r0 = r9.findViewById(r8);
        r0.setVisibility(r6);
    L_0x0079:
        r0 = 16908292; // 0x1020004 float:2.387724E-38 double:8.353806E-317;
        r0 = r9.findViewById(r0);	 Catch:{ SecurityException -> 0x009b }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ SecurityException -> 0x009b }
        if (r1 == 0) goto L_0x0092;
    L_0x0086:
        r0 = 16908292; // 0x1020004 float:2.387724E-38 double:8.353806E-317;
        r0 = r9.findViewById(r0);	 Catch:{ SecurityException -> 0x009b }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ SecurityException -> 0x009b }
    L_0x0092:
        return;
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        throw r0;
    L_0x009b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DocumentPickerActivity.a():void");
    }

    public void onCreate(Bundle bundle) {
        Log.i(E[1]);
        super.onCreate(bundle);
        getSupportActionBar().setElevation(getResources().getDimension(2131427411));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.t = getIntent().getStringExtra(E[2]);
        this.v = getSharedPreferences(E[3], 0).getInt(E[0], this.v);
        setContentView(2130903171);
        this.C = new g4(this, null);
        if (VERSION.SDK_INT >= 19) {
            a().addHeaderView(aam.a(getLayoutInflater(), 2130903172, null, false));
        }
        a(this.C);
        a().setOnItemClickListener(new py(this));
        a().setOnItemLongClickListener(new v8(this));
        getSupportLoaderManager().initLoader(0, null, this);
    }

    public void onSupportActionModeStarted(ActionMode actionMode) {
        try {
            super.onSupportActionModeStarted(actionMode);
            if (VERSION.SDK_INT >= 21) {
                getWindow().setStatusBarColor(ContextCompat.getColor(this, 2131623947));
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    static String a(DocumentPickerActivity documentPickerActivity, String str) {
        documentPickerActivity.x = str;
        return str;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131820544, menu);
        View searchView = new SearchView(getSupportActionBar().getThemedContext());
        try {
            boolean z;
            ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(ContextCompat.getColor(this, R.color.primary_text_default_material_dark));
            searchView.setQueryHint(getString(2131231848));
            searchView.setOnQueryTextListener(new bo(this));
            this.D = menu.findItem(2131755047);
            MenuItem menuItem = this.D;
            if (this.w != null) {
                if (!this.w.isEmpty()) {
                    z = true;
                    menuItem.setVisible(z);
                    MenuItemCompat.setActionView(this.D, searchView);
                    MenuItemCompat.setShowAsAction(this.D, 10);
                    MenuItemCompat.setOnActionExpandListener(this.D, new az2(this));
                    return super.onCreateOptionsMenu(menu);
                }
            }
            z = false;
            menuItem.setVisible(z);
            MenuItemCompat.setActionView(this.D, searchView);
            MenuItemCompat.setShowAsAction(this.D, 10);
            MenuItemCompat.setOnActionExpandListener(this.D, new az2(this));
            return super.onCreateOptionsMenu(menu);
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    private static void a(List list, int i) {
        switch (i) {
            case v.m /*0*/:
                break;
            case at.g /*1*/:
                try {
                    Collections.sort(list, new a9n());
                    if (!DialogToastActivity.f) {
                        return;
                    }
                } catch (SecurityException e) {
                    throw e;
                }
                break;
            default:
                return;
        }
        Collections.sort(list, new aai());
    }

    private void a(CharSequence charSequence) {
        this.C.getFilter().filter(charSequence);
    }

    public void onSupportActionModeFinished(ActionMode actionMode) {
        try {
            super.onSupportActionModeFinished(actionMode);
            if (VERSION.SDK_INT >= 21) {
                getWindow().setStatusBarColor(ContextCompat.getColor(this, 2131624054));
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.io.File r5) {
        /*
        r4 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r4.A;	 Catch:{ SecurityException -> 0x004c }
        r1 = r1.contains(r5);	 Catch:{ SecurityException -> 0x004c }
        if (r1 == 0) goto L_0x0025;
    L_0x000a:
        r1 = r4.A;	 Catch:{ SecurityException -> 0x004e }
        r1.remove(r5);	 Catch:{ SecurityException -> 0x004e }
        r1 = r4.A;	 Catch:{ SecurityException -> 0x004e }
        r1 = r1.isEmpty();	 Catch:{ SecurityException -> 0x004e }
        if (r1 == 0) goto L_0x001e;
    L_0x0017:
        r1 = r4.z;	 Catch:{ SecurityException -> 0x0050 }
        r1.finish();	 Catch:{ SecurityException -> 0x0050 }
        if (r0 == 0) goto L_0x0046;
    L_0x001e:
        r1 = r4.z;	 Catch:{ SecurityException -> 0x0052 }
        r1.invalidate();	 Catch:{ SecurityException -> 0x0052 }
        if (r0 == 0) goto L_0x0046;
    L_0x0025:
        r1 = r4.A;	 Catch:{ SecurityException -> 0x0054 }
        r1 = r1.size();	 Catch:{ SecurityException -> 0x0054 }
        r2 = 10;
        if (r1 < r2) goto L_0x003c;
    L_0x002f:
        r1 = r4.getBaseContext();	 Catch:{ SecurityException -> 0x0056 }
        r2 = 2131232024; // 0x7f080518 float:1.8080146E38 double:1.0529685264E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ SecurityException -> 0x0056 }
        if (r0 == 0) goto L_0x0046;
    L_0x003c:
        r0 = r4.A;	 Catch:{ SecurityException -> 0x0056 }
        r0.add(r5);	 Catch:{ SecurityException -> 0x0056 }
        r0 = r4.z;	 Catch:{ SecurityException -> 0x0056 }
        r0.invalidate();	 Catch:{ SecurityException -> 0x0056 }
    L_0x0046:
        r0 = r4.C;
        r0.notifyDataSetChanged();
        return;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DocumentPickerActivity.a(java.io.File):void");
    }

    private void b() {
        Intent intent = new Intent(E[6]);
        intent.addCategory(E[11]);
        intent.setType(E[10]);
        intent.putExtra(E[8], true);
        ArrayList c = a59.c();
        try {
            if (c.contains(E[12])) {
                c.add(E[13]);
                c.add(E[9]);
                c.add(E[7]);
            }
            intent.putExtra(E[14], (String[]) c.toArray(new String[c.size()]));
            startActivityForResult(intent, 1);
        } catch (SecurityException e) {
            throw e;
        }
    }

    static void e(DocumentPickerActivity documentPickerActivity) {
        documentPickerActivity.d();
    }

    private void d() {
        boolean z = DialogToastActivity.f;
        if (!this.A.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (File fromFile : this.A) {
                arrayList.add(Uri.fromFile(fromFile));
                if (z) {
                    break;
                }
            }
            SendDocumentsConfirmationDialogFragment.a(this.t, arrayList).show(getSupportFragmentManager(), null);
        }
    }
}
