package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.view.LayoutInflater;
import android.view.View;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class DialogFragment extends Fragment implements OnCancelListener, OnDismissListener {
    private static final String[] z;
    int mBackStackId;
    boolean mCancelable;
    Dialog mDialog;
    boolean mDismissed;
    boolean mShownByMe;
    boolean mShowsDialog;
    int mStyle;
    int mTheme;
    boolean mViewDestroyed;

    static {
        String[] strArr = new String[15];
        String str = "m\u001er\u0004\u0016e\u0014,\u0005\u0018z\u0015r2\u0010m\u001cy\u0011*x\u0011b\u0013";
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
                        i3 = 12;
                        break;
                    case at.g /*1*/:
                        i3 = 112;
                        break;
                    case at.i /*2*/:
                        i3 = 22;
                        break;
                    case at.o /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "`\u0011o\u0019\fx/\u007f\u0018\u001f`\u0011b\u0013\u000b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "`\u0011o\u0019\fx/\u007f\u0018\u001f`\u0011b\u0013\u000b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "m\u001er\u0004\u0016e\u0014,\u0005\u0011c\u0007e2\u0010m\u001cy\u0011";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "m\u001er\u0004\u0016e\u0014,\u0015\u0018b\u0013s\u001a\u0018n\u001cs";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "m\u001er\u0004\u0016e\u0014,\u0014\u0018o\u001bE\u0002\u0018o\u001b_\u0012";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "m\u001er\u0004\u0016e\u0014,\u0005\ru\u001cs";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "m\u001er\u0004\u0016e\u0014,\u0002\u0011i\u001ds";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "m\u001er\u0004\u0016e\u0014,\u0005\u0018z\u0015r2\u0010m\u001cy\u0011*x\u0011b\u0013";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "m\u001er\u0004\u0016e\u0014,\u0002\u0011i\u001ds";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "m\u001er\u0004\u0016e\u0014,\u0005\ru\u001cs";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "m\u001er\u0004\u0016e\u0014,\u0015\u0018b\u0013s\u001a\u0018n\u001cs";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "m\u001er\u0004\u0016e\u0014,\u0014\u0018o\u001bE\u0002\u0018o\u001b_\u0012";
                    obj = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "m\u001er\u0004\u0016e\u0014,\u0005\u0011c\u0007e2\u0010m\u001cy\u0011";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "H\u0019w\u001a\u0016k6d\u0017\u001ea\u0015x\u0002Yo\u0011xV\u0017c\u00046\u0014\u001c,\u0011b\u0002\u0018o\u0018s\u0012Yx\u001f6\u0017Yo\u001fx\u0002\u0018e\u001es\u0004Yz\u0019s\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    @StyleRes
    public int getTheme() {
        return this.mTheme;
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public void onCreate(@Nullable Bundle bundle) {
        boolean z = true;
        try {
            super.onCreate(bundle);
            if (this.mContainerId != 0) {
                z = false;
            }
            try {
                this.mShowsDialog = z;
                if (bundle != null) {
                    this.mStyle = bundle.getInt(z[7], 0);
                    this.mTheme = bundle.getInt(z[8], 0);
                    this.mCancelable = bundle.getBoolean(z[5], true);
                    this.mShowsDialog = bundle.getBoolean(z[4], this.mShowsDialog);
                    this.mBackStackId = bundle.getInt(z[6], -1);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void onDetach() {
        try {
            super.onDetach();
            if (!this.mShownByMe) {
                if (!this.mDismissed) {
                    this.mDismissed = true;
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        try {
            super.onActivityCreated(bundle);
            if (this.mShowsDialog) {
                View view = getView();
                if (view != null) {
                    try {
                        if (view.getParent() != null) {
                            throw new IllegalStateException(z[1]);
                        }
                        this.mDialog.setContentView(view);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                this.mDialog.setOwnerActivity(getActivity());
                this.mDialog.setCancelable(this.mCancelable);
                this.mDialog.setOnCancelListener(this);
                this.mDialog.setOnDismissListener(this);
                if (bundle != null) {
                    Bundle bundle2 = bundle.getBundle(z[0]);
                    if (bundle2 != null) {
                        try {
                            this.mDialog.onRestoreInstanceState(bundle2);
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    }
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        try {
            if (!this.mShowsDialog) {
                return super.getLayoutInflater(bundle);
            }
            try {
                this.mDialog = onCreateDialog(bundle);
                if (this.mDialog == null) {
                    return (LayoutInflater) this.mHost.getContext().getSystemService(z[3]);
                }
                setupDialog(this.mDialog, this.mStyle);
                return (LayoutInflater) this.mDialog.getContext().getSystemService(z[2]);
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void onStart() {
        try {
            super.onStart();
            if (this.mDialog != null) {
                this.mViewDestroyed = false;
                this.mDialog.show();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.mDialog != null) {
            Bundle onSaveInstanceState = this.mDialog.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                try {
                    bundle.putBundle(z[9], onSaveInstanceState);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
        try {
            if (this.mStyle != 0) {
                bundle.putInt(z[11], this.mStyle);
            }
            try {
                if (this.mTheme != 0) {
                    bundle.putInt(z[10], this.mTheme);
                }
                try {
                    if (!this.mCancelable) {
                        bundle.putBoolean(z[12], this.mCancelable);
                    }
                    try {
                        if (!this.mShowsDialog) {
                            bundle.putBoolean(z[14], this.mShowsDialog);
                        }
                        try {
                            if (this.mBackStackId != -1) {
                                bundle.putInt(z[13], this.mBackStackId);
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    public void onStop() {
        try {
            super.onStop();
            if (this.mDialog != null) {
                this.mDialog.hide();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public DialogFragment() {
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(getActivity(), getTheme());
    }

    public void dismiss() {
        dismissInternal(false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        try {
            if (!this.mViewDestroyed) {
                dismissInternal(true);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add((Fragment) this, str);
        beginTransaction.commit();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onAttach(Activity activity) {
        try {
            super.onAttach(activity);
            if (!this.mShownByMe) {
                this.mDismissed = false;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true);
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void onDestroyView() {
        try {
            super.onDestroyView();
            if (this.mDialog != null) {
                this.mViewDestroyed = true;
                this.mDialog.dismiss();
                this.mDialog = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    void dismissInternal(boolean z) {
        boolean z2 = Fragment.a;
        try {
            if (!this.mDismissed) {
                try {
                    this.mDismissed = true;
                    this.mShownByMe = false;
                    if (this.mDialog != null) {
                        this.mDialog.dismiss();
                        this.mDialog = null;
                    }
                    try {
                        this.mViewDestroyed = true;
                        if (this.mBackStackId >= 0) {
                            getFragmentManager().popBackStack(this.mBackStackId, 1);
                            this.mBackStackId = -1;
                            if (!z2) {
                                return;
                            }
                        }
                        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                        try {
                            beginTransaction.remove(this);
                            if (z) {
                                beginTransaction.commitAllowingStateLoss();
                                if (!z2) {
                                    return;
                                }
                            }
                            beginTransaction.commit();
                        } catch (IllegalStateException e) {
                            throw e;
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        switch (i) {
            case at.g /*1*/:
            case at.i /*2*/:
                break;
            case at.o /*3*/:
                try {
                    dialog.getWindow().addFlags(24);
                    break;
                } catch (IllegalStateException e) {
                    throw e;
                }
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    public void setCancelable(boolean z) {
        try {
            this.mCancelable = z;
            if (this.mDialog != null) {
                this.mDialog.setCancelable(z);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
