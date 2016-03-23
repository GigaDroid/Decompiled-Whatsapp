package com.whatsapp;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c;
import com.whatsapp.protocol.co;
import com.whatsapp.util.bu;
import g;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;
import q;

public class ConversationRowContact extends ConversationRow {
    private static final String[] ab;
    private int Q;
    private String R;
    private ArrayList S;
    private final TextView T;
    private ArrayList U;
    private q V;
    private final TextView W;
    private Bitmap X;
    private final ImageView Y;
    private final TextView Z;

    public class AddOrEditContactDialogFragment extends DialogFragment {
        private static final String[] z;
        private l5 b;
        private boolean c;
        private Bitmap d;
        private q e;

        static {
            String[] strArr = new String[6];
            String str = "I;^8vL&U:{R'_\u001bjF6";
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
                            i3 = 35;
                            break;
                        case at.g /*1*/:
                            i3 = 82;
                            break;
                        case at.i /*2*/:
                            i3 = 58;
                            break;
                        case at.o /*3*/:
                            i3 = arj.Theme_editTextStyle;
                            break;
                        default:
                            i3 = 30;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "c!\u0014\u001fvB&I\tnS|T\rj";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "@=T\u001e{Q![\u001cwL<\u0017\u001aqT\u007fY\u0007pW3Y\u001c1@=T\u001c\u007f@&\u0017\u001cvV?XG|B!_^*\u000e6_\u000bqG7\u0015\rlQ=H";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "U1[\u001az";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "I;^8vL&U:{R'_\u001bjF6";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "U1[\u001az";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        static l5 b(AddOrEditContactDialogFragment addOrEditContactDialogFragment) {
            return addOrEditContactDialogFragment.b;
        }

        static Bitmap c(AddOrEditContactDialogFragment addOrEditContactDialogFragment) {
            return addOrEditContactDialogFragment.d;
        }

        static q d(AddOrEditContactDialogFragment addOrEditContactDialogFragment) {
            return addOrEditContactDialogFragment.e;
        }

        static boolean a(AddOrEditContactDialogFragment addOrEditContactDialogFragment) {
            return addOrEditContactDialogFragment.c;
        }

        static Bitmap a(AddOrEditContactDialogFragment addOrEditContactDialogFragment, Bitmap bitmap) {
            addOrEditContactDialogFragment.d = bitmap;
            return bitmap;
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            boolean z = DialogToastActivity.f;
            switch (i) {
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    if (i2 == -1) {
                        String lastPathSegment = intent.getData().getLastPathSegment();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        try {
                            if (!(this.e == null || this.e.k == null)) {
                                for (g gVar : this.e.k) {
                                    arrayList2.add(gVar.c);
                                    if (gVar.b != null) {
                                        try {
                                            arrayList.add(gVar.b + z[2]);
                                            if (!z) {
                                                continue;
                                                if (z) {
                                                    bu.a(arrayList2, arrayList, this.e.a(), lastPathSegment, getActivity());
                                                }
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e) {
                                            throw e;
                                        }
                                    }
                                    arrayList.add(null);
                                    continue;
                                    if (z) {
                                        bu.a(arrayList2, arrayList, this.e.a(), lastPathSegment, getActivity());
                                    }
                                }
                                bu.a(arrayList2, arrayList, this.e.a(), lastPathSegment, getActivity());
                            }
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw e2;
                        }
                    }
                    dismiss();
                default:
            }
        }

        public AddOrEditContactDialogFragment() {
            this.c = false;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.support.annotation.NonNull
        public android.app.Dialog onCreateDialog(android.os.Bundle r6) {
            /*
            r5 = this;
            r0 = 0;
            r1 = r5.getArguments();
            r2 = z;
            r3 = 4;
            r2 = r2[r3];
            r1 = r1.getString(r2);
            r2 = r5.getArguments();
            r3 = z;
            r4 = 5;
            r3 = r3[r4];
            r2 = r2.getString(r3);
            if (r2 == 0) goto L_0x0023;
        L_0x001d:
            r0 = com.whatsapp.App.as;	 Catch:{ UnsupportedEncodingException -> 0x0089 }
            r0 = r0.f(r2);	 Catch:{ UnsupportedEncodingException -> 0x0089 }
        L_0x0023:
            r5.b = r0;
            r0 = q.k(r1);	 Catch:{ UnsupportedEncodingException -> 0x00b2, d -> 0x008b, Exception -> 0x0090 }
            r5.e = r0;	 Catch:{ UnsupportedEncodingException -> 0x00b2, d -> 0x008b, Exception -> 0x0090 }
        L_0x002b:
            r0 = r5.e;	 Catch:{ UnsupportedEncodingException -> 0x0095 }
            if (r0 == 0) goto L_0x00a6;
        L_0x002f:
            r0 = r5.e;	 Catch:{ UnsupportedEncodingException -> 0x0095 }
            r0 = r0.e;	 Catch:{ UnsupportedEncodingException -> 0x0095 }
            if (r0 == 0) goto L_0x00a6;
        L_0x0035:
            r0 = r5.e;	 Catch:{ UnsupportedEncodingException -> 0x0097 }
            r0 = r0.e;	 Catch:{ UnsupportedEncodingException -> 0x0097 }
            r0 = r0.length;	 Catch:{ UnsupportedEncodingException -> 0x0097 }
            if (r0 <= 0) goto L_0x00a6;
        L_0x003c:
            r0 = r5.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0099, StringIndexOutOfBoundsException -> 0x00b0, IllegalArgumentException -> 0x00ae }
            r0 = r0.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0099, StringIndexOutOfBoundsException -> 0x00b0, IllegalArgumentException -> 0x00ae }
            r1 = 0;
            r0 = android.backport.util.Base64.decode(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0099, StringIndexOutOfBoundsException -> 0x00b0, IllegalArgumentException -> 0x00ae }
            r1 = 0;
            r2 = r0.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0099, StringIndexOutOfBoundsException -> 0x00b0, IllegalArgumentException -> 0x00ae }
            r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0099, StringIndexOutOfBoundsException -> 0x00b0, IllegalArgumentException -> 0x00ae }
            r5.d = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0099, StringIndexOutOfBoundsException -> 0x00b0, IllegalArgumentException -> 0x00ae }
        L_0x004d:
            r0 = r5.b;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
            if (r0 == 0) goto L_0x005c;
        L_0x0051:
            r0 = new com.whatsapp.p8;	 Catch:{ UnsupportedEncodingException -> 0x00ac }
            r0.<init>(r5);	 Catch:{ UnsupportedEncodingException -> 0x00ac }
            r1 = 0;
            r1 = new java.lang.Void[r1];	 Catch:{ UnsupportedEncodingException -> 0x00ac }
            com.whatsapp.util.bq.a(r0, r1);	 Catch:{ UnsupportedEncodingException -> 0x00ac }
        L_0x005c:
            r0 = new android.support.v7.app.AlertDialog$Builder;
            r1 = r5.getContext();
            r0.<init>(r1);
            r1 = 2131230787; // 0x7f080043 float:1.8077637E38 double:1.052967915E-314;
            r0 = r0.setMessage(r1);
            r1 = 2131231544; // 0x7f080338 float:1.8079172E38 double:1.052968289E-314;
            r2 = new com.whatsapp.auu;
            r2.<init>(r5);
            r0 = r0.setPositiveButton(r1, r2);
            r1 = 2131231135; // 0x7f08019f float:1.8078342E38 double:1.052968087E-314;
            r2 = new com.whatsapp.rv;
            r2.<init>(r5);
            r0 = r0.setNeutralButton(r1, r2);
            r0 = r0.create();
            return r0;
        L_0x0089:
            r0 = move-exception;
            throw r0;
        L_0x008b:
            r0 = move-exception;
        L_0x008c:
            com.whatsapp.util.Log.c(r0);
            goto L_0x002b;
        L_0x0090:
            r0 = move-exception;
            com.whatsapp.util.Log.a(r0);
            goto L_0x002b;
        L_0x0095:
            r0 = move-exception;
            throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0097 }
        L_0x0097:
            r0 = move-exception;
            throw r0;
        L_0x0099:
            r0 = move-exception;
        L_0x009a:
            r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x00aa }
            r2 = 3;
            r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x00aa }
            com.whatsapp.util.Log.b(r1, r0);	 Catch:{ UnsupportedEncodingException -> 0x00aa }
            r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ UnsupportedEncodingException -> 0x00aa }
            if (r0 == 0) goto L_0x004d;
        L_0x00a6:
            r0 = 0;
            r5.d = r0;	 Catch:{ UnsupportedEncodingException -> 0x00aa }
            goto L_0x004d;
        L_0x00aa:
            r0 = move-exception;
            throw r0;
        L_0x00ac:
            r0 = move-exception;
            throw r0;
        L_0x00ae:
            r0 = move-exception;
            goto L_0x009a;
        L_0x00b0:
            r0 = move-exception;
            goto L_0x009a;
        L_0x00b2:
            r0 = move-exception;
            goto L_0x008c;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowContact.AddOrEditContactDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }

        public static AddOrEditContactDialogFragment a(String str, String str2) {
            AddOrEditContactDialogFragment addOrEditContactDialogFragment = new AddOrEditContactDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[1], str);
            bundle.putString(z[0], str2);
            addOrEditContactDialogFragment.setArguments(bundle);
            return addOrEditContactDialogFragment;
        }

        static boolean a(AddOrEditContactDialogFragment addOrEditContactDialogFragment, boolean z) {
            addOrEditContactDialogFragment.c = z;
            return z;
        }
    }

    public class MessageSharedContactDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[7];
            String str = "\u001eGN\u001eC\u001d";
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
                            i3 = 110;
                            break;
                        case at.g /*1*/:
                            i3 = 47;
                            break;
                        case at.i /*2*/:
                            i3 = 33;
                            break;
                        case at.o /*3*/:
                            i3 = 112;
                            break;
                        default:
                            i3 = 38;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u0002NC\u0015J\u001d";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "N\u0007";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "\u001eGN\u001eC\u001d";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\u0004FE\u0003";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\u0002NC\u0015J\u001d";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u0004FE\u0003";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public static MessageSharedContactDialogFragment a(@NonNull ArrayList arrayList, @NonNull ArrayList arrayList2, @NonNull ArrayList arrayList3) {
            MessageSharedContactDialogFragment messageSharedContactDialogFragment = new MessageSharedContactDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(z[1], arrayList);
            bundle.putStringArrayList(z[0], arrayList2);
            bundle.putStringArrayList(z[2], arrayList3);
            messageSharedContactDialogFragment.setArguments(bundle);
            return messageSharedContactDialogFragment;
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            boolean z = DialogToastActivity.f;
            ArrayList stringArrayList = getArguments().getStringArrayList(z[5]);
            ArrayList stringArrayList2 = getArguments().getStringArrayList(z[4]);
            ArrayList stringArrayList3 = getArguments().getStringArrayList(z[6]);
            List arrayList = new ArrayList();
            if (!(stringArrayList == null || stringArrayList3 == null || stringArrayList2 == null)) {
                int i = 0;
                while (i < stringArrayList.size()) {
                    if (stringArrayList.get(i) != null) {
                        arrayList.add(new a96(getResources().getString(2131231445, new Object[]{stringArrayList2.get(i)}) + (TextUtils.isEmpty((CharSequence) stringArrayList3.get(i)) ? "" : z[3] + ((String) stringArrayList3.get(i)) + ")"), (String) stringArrayList.get(i), 0));
                    }
                    int i2 = i + 1;
                    if (z) {
                        break;
                    }
                    i = i2;
                }
            }
            Builder builder = new Builder(getContext());
            builder.setAdapter(new ArrayAdapter(getContext(), 2130903266, arrayList), new al7(this, arrayList));
            return builder.create();
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "O@V-v^\\Y/zCA\u0015)|[\u0002[4}XN[/<O@V/rO[\u0015/{YBZtqM\\]m'\u0001K]8|HJ\u0017>a^@J";
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
                        i3 = 44;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 56;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 19;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "l\\\u0016,{M[K:c\\\u0001V>g";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    ab = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "l\\\u0016,{M[K:c\\\u0001V>g";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static int f(ConversationRowContact conversationRowContact) {
        return conversationRowContact.Q;
    }

    public void a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.R)) {
                    try {
                        if (str.equals(this.R)) {
                            l5 f = App.as.f(str);
                            if (f != null) {
                                try {
                                    F.b(f, this.Y);
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    throw e;
                                }
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw e2;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e22) {
            throw e22;
        } catch (ArrayIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    static ArrayList a(ConversationRowContact conversationRowContact) {
        return conversationRowContact.U;
    }

    @TargetApi(11)
    protected void b() {
        Context context = getContext();
        if (context instanceof AppCompatActivity) {
            AddOrEditContactDialogFragment.a(this.e.c(), this.R).show(((AppCompatActivity) context).getSupportFragmentManager(), null);
        }
    }

    protected int h() {
        return 2130903123;
    }

    static Bitmap b(ConversationRowContact conversationRowContact) {
        return conversationRowContact.X;
    }

    public void a(co coVar, boolean z) {
        try {
            if (this.e != coVar || z) {
                a(coVar);
            }
            super.a(coVar, z);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    protected int g() {
        return 2130903122;
    }

    static q e(ConversationRowContact conversationRowContact) {
        return conversationRowContact.V;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r9) {
        /*
        r8 = this;
        r1 = 1;
        r7 = 0;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.T;
        r4 = r9.A;
        r5 = r8.getContext();
        r6 = r8.T;
        r6 = r6.getPaint();
        r4 = com.whatsapp.a28.a(r4, r5, r6);
        r4 = r8.a(r4);
        r0.setText(r4);
        r8.V = r7;
        r0 = r9.c();	 Catch:{ UnsupportedEncodingException -> 0x0256, d -> 0x0203, Exception -> 0x0209 }
        r0 = q.k(r0);	 Catch:{ UnsupportedEncodingException -> 0x0256, d -> 0x0203, Exception -> 0x0209 }
        r8.V = r0;	 Catch:{ UnsupportedEncodingException -> 0x0256, d -> 0x0203, Exception -> 0x0209 }
    L_0x002a:
        r0 = r8.V;	 Catch:{ UnsupportedEncodingException -> 0x020f }
        if (r0 == 0) goto L_0x021e;
    L_0x002e:
        r0 = r8.V;	 Catch:{ UnsupportedEncodingException -> 0x020f }
        r0 = r0.e;	 Catch:{ UnsupportedEncodingException -> 0x020f }
        if (r0 == 0) goto L_0x021e;
    L_0x0034:
        r0 = r8.V;	 Catch:{ UnsupportedEncodingException -> 0x0211 }
        r0 = r0.e;	 Catch:{ UnsupportedEncodingException -> 0x0211 }
        r0 = r0.length;	 Catch:{ UnsupportedEncodingException -> 0x0211 }
        if (r0 <= 0) goto L_0x021e;
    L_0x003b:
        r0 = r8.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0213, StringIndexOutOfBoundsException -> 0x0254, IllegalArgumentException -> 0x0252 }
        r0 = r0.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0213, StringIndexOutOfBoundsException -> 0x0254, IllegalArgumentException -> 0x0252 }
        r4 = 0;
        r0 = android.backport.util.Base64.decode(r0, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0213, StringIndexOutOfBoundsException -> 0x0254, IllegalArgumentException -> 0x0252 }
        r4 = 0;
        r5 = r0.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0213, StringIndexOutOfBoundsException -> 0x0254, IllegalArgumentException -> 0x0252 }
        r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r4, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0213, StringIndexOutOfBoundsException -> 0x0254, IllegalArgumentException -> 0x0252 }
        r8.X = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0213, StringIndexOutOfBoundsException -> 0x0254, IllegalArgumentException -> 0x0252 }
    L_0x004c:
        r0 = r8.X;	 Catch:{ UnsupportedEncodingException -> 0x0225 }
        if (r0 == 0) goto L_0x0059;
    L_0x0050:
        r0 = r8.Y;	 Catch:{ UnsupportedEncodingException -> 0x0227 }
        r4 = r8.X;	 Catch:{ UnsupportedEncodingException -> 0x0227 }
        r0.setImageBitmap(r4);	 Catch:{ UnsupportedEncodingException -> 0x0227 }
        if (r3 == 0) goto L_0x0069;
    L_0x0059:
        r0 = 2130837611; // 0x7f02006b float:1.728018E38 double:1.0527736605E-314;
        r0 = com.whatsapp.l5.b(r0);	 Catch:{ UnsupportedEncodingException -> 0x0227 }
        r8.X = r0;	 Catch:{ UnsupportedEncodingException -> 0x0227 }
        r0 = r8.Y;	 Catch:{ UnsupportedEncodingException -> 0x0227 }
        r4 = r8.X;	 Catch:{ UnsupportedEncodingException -> 0x0227 }
        r0.setImageBitmap(r4);	 Catch:{ UnsupportedEncodingException -> 0x0227 }
    L_0x0069:
        r0 = 0;
        r8.Q = r0;	 Catch:{ UnsupportedEncodingException -> 0x0229 }
        r0 = new java.util.ArrayList;	 Catch:{ UnsupportedEncodingException -> 0x0229 }
        r0.<init>();	 Catch:{ UnsupportedEncodingException -> 0x0229 }
        r8.S = r0;	 Catch:{ UnsupportedEncodingException -> 0x0229 }
        r0 = new java.util.ArrayList;	 Catch:{ UnsupportedEncodingException -> 0x0229 }
        r0.<init>();	 Catch:{ UnsupportedEncodingException -> 0x0229 }
        r8.U = r0;	 Catch:{ UnsupportedEncodingException -> 0x0229 }
        r0 = r8.V;	 Catch:{ UnsupportedEncodingException -> 0x0229 }
        if (r0 == 0) goto L_0x00cf;
    L_0x007e:
        r0 = r8.V;	 Catch:{ UnsupportedEncodingException -> 0x0229 }
        r0 = r0.k;	 Catch:{ UnsupportedEncodingException -> 0x0229 }
        if (r0 == 0) goto L_0x00cf;
    L_0x0084:
        r0 = r8.V;
        r0 = r0.k;
        r4 = r0.iterator();
    L_0x008c:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00cf;
    L_0x0092:
        r0 = r4.next();
        r0 = (g) r0;
        r5 = r8.U;
        r6 = r0.c;
        r5.add(r6);
        r5 = r0.b;
        if (r5 == 0) goto L_0x00c7;
    L_0x00a3:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r0 = r0.b;
        r0 = r5.append(r0);
        r5 = ab;
        r5 = r5[r1];
        r0 = r0.append(r5);
        r0 = r0.toString();
        r5 = r8.S;	 Catch:{ UnsupportedEncodingException -> 0x022b }
        r5.add(r0);	 Catch:{ UnsupportedEncodingException -> 0x022b }
        r0 = r8.Q;	 Catch:{ UnsupportedEncodingException -> 0x022b }
        r0 = r0 + 1;
        r8.Q = r0;	 Catch:{ UnsupportedEncodingException -> 0x022b }
        if (r3 == 0) goto L_0x00cd;
    L_0x00c7:
        r0 = r8.S;	 Catch:{ UnsupportedEncodingException -> 0x022b }
        r5 = 0;
        r0.add(r5);	 Catch:{ UnsupportedEncodingException -> 0x022b }
    L_0x00cd:
        if (r3 == 0) goto L_0x008c;
    L_0x00cf:
        r0 = r8.S;
        r4 = r0.iterator();
    L_0x00d5:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0107;
    L_0x00db:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = android.text.TextUtils.isEmpty(r0);	 Catch:{ UnsupportedEncodingException -> 0x022d }
        if (r5 != 0) goto L_0x0105;
    L_0x00e7:
        r5 = ab;	 Catch:{ UnsupportedEncodingException -> 0x022d }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ UnsupportedEncodingException -> 0x022d }
        r5 = r0.endsWith(r5);	 Catch:{ UnsupportedEncodingException -> 0x022d }
        if (r5 == 0) goto L_0x0105;
    L_0x00f2:
        r5 = com.whatsapp.App.as;
        r0 = r5.b(r0);
        r5 = r0.p;	 Catch:{ UnsupportedEncodingException -> 0x022f }
        r8.R = r5;	 Catch:{ UnsupportedEncodingException -> 0x022f }
        r5 = F;	 Catch:{ UnsupportedEncodingException -> 0x022f }
        r6 = r8.Y;	 Catch:{ UnsupportedEncodingException -> 0x022f }
        r5.b(r0, r6);	 Catch:{ UnsupportedEncodingException -> 0x022f }
        if (r3 == 0) goto L_0x0107;
    L_0x0105:
        if (r3 == 0) goto L_0x00d5;
    L_0x0107:
        r0 = r9.k;	 Catch:{ UnsupportedEncodingException -> 0x0231 }
        r0 = r0.a;	 Catch:{ UnsupportedEncodingException -> 0x0231 }
        if (r0 != 0) goto L_0x0258;
    L_0x010d:
        r0 = r9.k;	 Catch:{ UnsupportedEncodingException -> 0x0231 }
        r0 = r0.c;	 Catch:{ UnsupportedEncodingException -> 0x0231 }
        r0 = com.whatsapp.qm.i(r0);	 Catch:{ UnsupportedEncodingException -> 0x0231 }
        if (r0 == 0) goto L_0x0121;
    L_0x0117:
        r0 = com.whatsapp.App.as;
        r4 = r9.t;
        r0 = r0.b(r4);
        if (r3 == 0) goto L_0x012b;
    L_0x0121:
        r0 = com.whatsapp.App.as;
        r4 = r9.k;
        r4 = r4.c;
        r0 = r0.b(r4);
    L_0x012b:
        r0 = r0.l;	 Catch:{ UnsupportedEncodingException -> 0x0233 }
        if (r0 != 0) goto L_0x0235;
    L_0x012f:
        r0 = r1;
    L_0x0130:
        r1 = 2131755540; // 0x7f100214 float:1.9141962E38 double:1.0532271776E-314;
        r1 = r8.findViewById(r1);
        r2 = 2131755543; // 0x7f100217 float:1.9141968E38 double:1.053227179E-314;
        r2 = r8.findViewById(r2);
        if (r0 != 0) goto L_0x01ea;
    L_0x0140:
        r0 = r8.Q;	 Catch:{ UnsupportedEncodingException -> 0x0238 }
        if (r0 <= 0) goto L_0x015f;
    L_0x0144:
        r0 = r8.W;	 Catch:{ UnsupportedEncodingException -> 0x023a }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ UnsupportedEncodingException -> 0x023a }
        r0 = r8.W;	 Catch:{ UnsupportedEncodingException -> 0x023a }
        r4 = 2131231866; // 0x7f08047a float:1.8079825E38 double:1.0529684483E-314;
        r0.setText(r4);	 Catch:{ UnsupportedEncodingException -> 0x023a }
        r0 = r8.W;	 Catch:{ UnsupportedEncodingException -> 0x023a }
        r4 = new com.whatsapp.y_;	 Catch:{ UnsupportedEncodingException -> 0x023a }
        r5 = 0;
        r4.<init>(r8, r5);	 Catch:{ UnsupportedEncodingException -> 0x023a }
        r0.setOnClickListener(r4);	 Catch:{ UnsupportedEncodingException -> 0x023a }
        if (r3 == 0) goto L_0x0189;
    L_0x015f:
        r0 = r8.V;	 Catch:{ UnsupportedEncodingException -> 0x023c }
        r0 = b(r0);	 Catch:{ UnsupportedEncodingException -> 0x023c }
        if (r0 == 0) goto L_0x0182;
    L_0x0167:
        r0 = r8.W;	 Catch:{ UnsupportedEncodingException -> 0x023e }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ UnsupportedEncodingException -> 0x023e }
        r0 = r8.W;	 Catch:{ UnsupportedEncodingException -> 0x023e }
        r4 = 2131231384; // 0x7f080298 float:1.8078847E38 double:1.05296821E-314;
        r0.setText(r4);	 Catch:{ UnsupportedEncodingException -> 0x023e }
        r0 = r8.W;	 Catch:{ UnsupportedEncodingException -> 0x023e }
        r4 = new com.whatsapp.ys;	 Catch:{ UnsupportedEncodingException -> 0x023e }
        r5 = 0;
        r4.<init>(r8, r5);	 Catch:{ UnsupportedEncodingException -> 0x023e }
        r0.setOnClickListener(r4);	 Catch:{ UnsupportedEncodingException -> 0x023e }
        if (r3 == 0) goto L_0x0189;
    L_0x0182:
        r0 = r8.W;	 Catch:{ UnsupportedEncodingException -> 0x023e }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ UnsupportedEncodingException -> 0x023e }
    L_0x0189:
        r0 = r9.k;	 Catch:{ UnsupportedEncodingException -> 0x0240 }
        r0 = r0.a;	 Catch:{ UnsupportedEncodingException -> 0x0240 }
        if (r0 == 0) goto L_0x019d;
    L_0x018f:
        r0 = 8;
        r2.setVisibility(r0);	 Catch:{ UnsupportedEncodingException -> 0x0242 }
        r0 = r8.Z;	 Catch:{ UnsupportedEncodingException -> 0x0242 }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ UnsupportedEncodingException -> 0x0242 }
        if (r3 == 0) goto L_0x01b2;
    L_0x019d:
        r0 = 0;
        r2.setVisibility(r0);	 Catch:{ UnsupportedEncodingException -> 0x0242 }
        r0 = r8.Z;	 Catch:{ UnsupportedEncodingException -> 0x0242 }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ UnsupportedEncodingException -> 0x0242 }
        r0 = r8.Z;	 Catch:{ UnsupportedEncodingException -> 0x0242 }
        r4 = new com.whatsapp.yd;	 Catch:{ UnsupportedEncodingException -> 0x0242 }
        r5 = 0;
        r4.<init>(r8, r5);	 Catch:{ UnsupportedEncodingException -> 0x0242 }
        r0.setOnClickListener(r4);	 Catch:{ UnsupportedEncodingException -> 0x0242 }
    L_0x01b2:
        r0 = r8.W;	 Catch:{ UnsupportedEncodingException -> 0x0244 }
        r0 = r0.getVisibility();	 Catch:{ UnsupportedEncodingException -> 0x0244 }
        if (r0 == 0) goto L_0x01c2;
    L_0x01ba:
        r0 = r8.Z;	 Catch:{ UnsupportedEncodingException -> 0x0246 }
        r0 = r0.getVisibility();	 Catch:{ UnsupportedEncodingException -> 0x0246 }
        if (r0 != 0) goto L_0x01c8;
    L_0x01c2:
        r0 = 0;
        r1.setVisibility(r0);	 Catch:{ UnsupportedEncodingException -> 0x0248 }
        if (r3 == 0) goto L_0x01cd;
    L_0x01c8:
        r0 = 8;
        r1.setVisibility(r0);	 Catch:{ UnsupportedEncodingException -> 0x0248 }
    L_0x01cd:
        r0 = r8.W;	 Catch:{ UnsupportedEncodingException -> 0x024a }
        r0 = r0.getVisibility();	 Catch:{ UnsupportedEncodingException -> 0x024a }
        if (r0 != 0) goto L_0x01e3;
    L_0x01d5:
        r0 = r8.Z;	 Catch:{ UnsupportedEncodingException -> 0x024c }
        r0 = r0.getVisibility();	 Catch:{ UnsupportedEncodingException -> 0x024c }
        if (r0 != 0) goto L_0x01e3;
    L_0x01dd:
        r0 = 0;
        r2.setVisibility(r0);	 Catch:{ UnsupportedEncodingException -> 0x024e }
        if (r3 == 0) goto L_0x0202;
    L_0x01e3:
        r0 = 8;
        r2.setVisibility(r0);	 Catch:{ UnsupportedEncodingException -> 0x0250 }
        if (r3 == 0) goto L_0x0202;
    L_0x01ea:
        r0 = r8.W;	 Catch:{ UnsupportedEncodingException -> 0x0250 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ UnsupportedEncodingException -> 0x0250 }
        r0 = r8.Z;	 Catch:{ UnsupportedEncodingException -> 0x0250 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ UnsupportedEncodingException -> 0x0250 }
        r0 = 8;
        r1.setVisibility(r0);	 Catch:{ UnsupportedEncodingException -> 0x0250 }
        r0 = 8;
        r2.setVisibility(r0);	 Catch:{ UnsupportedEncodingException -> 0x0250 }
    L_0x0202:
        return;
    L_0x0203:
        r0 = move-exception;
    L_0x0204:
        com.whatsapp.util.Log.c(r0);
        goto L_0x002a;
    L_0x0209:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x002a;
    L_0x020f:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0211 }
    L_0x0211:
        r0 = move-exception;
        throw r0;
    L_0x0213:
        r0 = move-exception;
    L_0x0214:
        r4 = ab;	 Catch:{ UnsupportedEncodingException -> 0x0223 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ UnsupportedEncodingException -> 0x0223 }
        com.whatsapp.util.Log.b(r4, r0);	 Catch:{ UnsupportedEncodingException -> 0x0223 }
        if (r3 == 0) goto L_0x004c;
    L_0x021e:
        r0 = 0;
        r8.X = r0;	 Catch:{ UnsupportedEncodingException -> 0x0223 }
        goto L_0x004c;
    L_0x0223:
        r0 = move-exception;
        throw r0;
    L_0x0225:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0227 }
    L_0x0227:
        r0 = move-exception;
        throw r0;
    L_0x0229:
        r0 = move-exception;
        throw r0;
    L_0x022b:
        r0 = move-exception;
        throw r0;
    L_0x022d:
        r0 = move-exception;
        throw r0;
    L_0x022f:
        r0 = move-exception;
        throw r0;
    L_0x0231:
        r0 = move-exception;
        throw r0;
    L_0x0233:
        r0 = move-exception;
        throw r0;
    L_0x0235:
        r0 = r2;
        goto L_0x0130;
    L_0x0238:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x023a }
    L_0x023a:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x023c }
    L_0x023c:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x023e }
    L_0x023e:
        r0 = move-exception;
        throw r0;
    L_0x0240:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0242 }
    L_0x0242:
        r0 = move-exception;
        throw r0;
    L_0x0244:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0246 }
    L_0x0246:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0248 }
    L_0x0248:
        r0 = move-exception;
        throw r0;
    L_0x024a:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x024c }
    L_0x024c:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x024e }
    L_0x024e:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0250 }
    L_0x0250:
        r0 = move-exception;
        throw r0;
    L_0x0252:
        r0 = move-exception;
        goto L_0x0214;
    L_0x0254:
        r0 = move-exception;
        goto L_0x0214;
    L_0x0256:
        r0 = move-exception;
        goto L_0x0204;
    L_0x0258:
        r0 = r2;
        goto L_0x0130;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowContact.a(com.whatsapp.protocol.co):void");
    }

    static String c(ConversationRowContact conversationRowContact) {
        return conversationRowContact.R;
    }

    static boolean c(q qVar) {
        return b(qVar);
    }

    static Bitmap a(ConversationRowContact conversationRowContact, Bitmap bitmap) {
        conversationRowContact.X = bitmap;
        return bitmap;
    }

    static ArrayList d(ConversationRowContact conversationRowContact) {
        return conversationRowContact.S;
    }

    @NonNull
    private static List a(@NonNull q qVar) {
        boolean z = DialogToastActivity.f;
        List arrayList = new ArrayList();
        if (qVar.l != null) {
            for (c cVar : qVar.l) {
                try {
                    if (cVar.c == Email.class) {
                        arrayList.add(cVar.e);
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw e;
                }
            }
        }
        return arrayList;
    }

    private static boolean b(@Nullable q qVar) {
        boolean z = DialogToastActivity.f;
        if (qVar == null) {
            return false;
        }
        List list = qVar.k;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        List<c> list2 = qVar.l;
        if (list2 != null) {
            for (c cVar : list2) {
                try {
                    if (cVar.c != Email.class) {
                        if (z) {
                            break;
                        }
                    }
                    return true;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw e2;
                }
            }
        }
        return false;
    }

    ConversationRowContact(Context context, co coVar) {
        super(context, coVar);
        this.X = null;
        this.Q = 0;
        this.R = null;
        this.T = (TextView) findViewById(2131755539);
        this.Y = (ImageView) findViewById(2131755434);
        this.W = (TextView) findViewById(2131755542);
        this.Z = (TextView) findViewById(2131755544);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131755538);
        linearLayout.setOnClickListener(new yv(this, null));
        linearLayout.setOnLongClickListener(this.K);
        a(coVar);
    }

    static List d(q qVar) {
        return a(qVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a() {
        /*
        r7 = this;
        r6 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r7.getContext();
        r1 = r0 instanceof android.support.v7.app.AppCompatActivity;
        if (r1 == 0) goto L_0x0064;
    L_0x000b:
        r0 = (android.support.v7.app.AppCompatActivity) r0;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r1 = 0;
        r2 = r1;
    L_0x0019:
        r1 = r7.V;
        r1 = r1.k;
        r1 = r1.size();
        if (r2 >= r1) goto L_0x0057;
    L_0x0023:
        r1 = r7.S;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0065 }
        r1 = r1.get(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0065 }
        if (r1 == 0) goto L_0x004b;
    L_0x002b:
        r1 = r7.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r1 = r1.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r1 = r1.get(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r1 = (g) r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r1 = r1.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r4.add(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r1 = r7.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r1 = r1.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r1 = r1.get(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r1 = (g) r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r1 = r1.d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r5.add(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        if (r3 == 0) goto L_0x0053;
    L_0x004b:
        r1 = 0;
        r4.add(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        r1 = 0;
        r5.add(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
    L_0x0053:
        r1 = r2 + 1;
        if (r3 == 0) goto L_0x0069;
    L_0x0057:
        r1 = r7.S;
        r1 = com.whatsapp.ConversationRowContact.MessageSharedContactDialogFragment.a(r1, r4, r5);
        r0 = r0.getSupportFragmentManager();
        r1.show(r0, r6);
    L_0x0064:
        return;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r2 = r1;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowContact.a():void");
    }
}
