package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.appcompat.R;
import android.support.v7.widget.TintManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.util.bz;
import org.v;
import org.whispersystems.at;

public class DeleteAccountFeedback extends DialogToastActivity {
    private static final String[] z;
    private EditText n;
    private DialogFragment o;
    private int p;

    public class ChangeNumberMessageDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[4];
            String str = "\u0013\u001d\u0002\"F\u001b\u0016\b*^1\u0016\u000b&W\u001c\r\u0015";
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
                            i3 = 114;
                            break;
                        case at.g /*1*/:
                            i3 = 121;
                            break;
                        case at.i /*2*/:
                            i3 = arj.Theme_checkboxStyle;
                            break;
                        case at.o /*3*/:
                            i3 = 75;
                            break;
                        default:
                            i3 = 50;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u0016\u001c\n.F\u0017+\u0003*A\u001d\u0017";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "\u0013\u001d\u0002\"F\u001b\u0016\b*^1\u0016\u000b&W\u001c\r\u0015";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u0016\u001c\n.F\u0017+\u0003*A\u001d\u0017";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        @NonNull
        public Dialog onCreateDialog(Bundle bundle) {
            int i = getArguments().getInt(z[1], -1);
            String string = getArguments().getString(z[0]);
            Builder builder = new Builder(getActivity());
            builder.setMessage(getString(2131231023, new Object[]{getString(2131231905)})).setPositiveButton(getString(2131231905), new aqd(this)).setNegativeButton(getString(2131231915), new o0(this, i, string));
            return builder.create();
        }

        private static DialogFragment a(int i, String str) {
            DialogFragment changeNumberMessageDialogFragment = new ChangeNumberMessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(z[2], i);
            bundle.putString(z[3], str);
            changeNumberMessageDialogFragment.setArguments(bundle);
            return changeNumberMessageDialogFragment;
        }

        static DialogFragment b(int i, String str) {
            return a(i, str);
        }
    }

    static {
        String[] strArr = new String[2];
        String str = "ty\b\u0019\nuC\u0016\u0019\u001fcs\n#\rup\u0001\u001f\nux";
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
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = 100;
                        break;
                    case at.o /*3*/:
                        i3 = 124;
                        break;
                    default:
                        i3 = 126;
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
                    str = "ty\b\u0019\nuC\u0016\u0019\u001fcs\n#\rup\u0001\u001f\nux";
                    obj = null;
            }
        }
    }

    static DialogFragment a(DeleteAccountFeedback deleteAccountFeedback, DialogFragment dialogFragment) {
        deleteAccountFeedback.o = dialogFragment;
        return dialogFragment;
    }

    static int c(DeleteAccountFeedback deleteAccountFeedback) {
        return deleteAccountFeedback.p;
    }

    static int a(DeleteAccountFeedback deleteAccountFeedback, int i) {
        deleteAccountFeedback.p = i;
        return i;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        setContentView(aam.a(getLayoutInflater(), 2130903156, null, false));
        this.n = (EditText) findViewById(2131755604);
        TextView textView = (TextView) findViewById(2131755603);
        textView.setBackgroundDrawable(new bz(TintManager.getDrawable((Context) this, (int) R.drawable.abc_spinner_textfield_background_material)));
        String[] stringArray = getResources().getStringArray(2131689480);
        if (bundle != null) {
            int i;
            this.p = bundle.getInt(z[1], 0);
            if (this.p < 0 || this.p >= stringArray.length) {
                this.p = 0;
            }
            EditText editText = this.n;
            if (this.p == 3) {
                i = 2131231022;
            } else {
                i = 2131231021;
            }
            editText.setHint(i);
        }
        textView.setText(stringArray[this.p]);
        textView.setOnClickListener(new ano(this, stringArray, textView));
        ((Button) findViewById(2131755605)).setOnClickListener(new awf(this));
    }

    public DeleteAccountFeedback() {
        this.p = 0;
    }

    static DialogFragment b(DeleteAccountFeedback deleteAccountFeedback) {
        return deleteAccountFeedback.o;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(z[0], this.p);
        super.onSaveInstanceState(bundle);
    }

    static EditText a(DeleteAccountFeedback deleteAccountFeedback) {
        return deleteAccountFeedback.n;
    }
}
