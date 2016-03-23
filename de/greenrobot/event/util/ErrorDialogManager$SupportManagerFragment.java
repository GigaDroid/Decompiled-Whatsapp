package de.greenrobot.event.util;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

public class ErrorDialogManager$SupportManagerFragment extends Fragment {
    private static final String[] z;
    private Object b;
    protected Bundle c;
    private boolean d;
    protected boolean e;
    private h f;

    static {
        String[] strArr = new String[4];
        String str = "AJ`K1@J ^,G@:\u0002&SJ X!P\\`I1W@<s'LN\"C$zB/B\"BJ<";
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
                        i3 = 37;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 78;
                        break;
                    case at.o /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 67;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "AJ`K1@J ^,G@:\u0002&SJ X!P\\`I1W@<s'LN\"C$";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "AJ`K1@J ^,G@:\u0002&SJ X!P\\`I1W@<s'LN\"C$";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "AJ`K1@J ^,G@:\u0002&SJ X!P\\`I1W@<s'LN\"C$zB/B\"BJ<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.d) {
            this.d = false;
            if (!g.b) {
                return;
            }
        }
        this.f = c.g.a.b();
        this.f.e(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = c.g.a.b();
        this.f.e(this);
        this.d = true;
    }

    public void onEventMainThread(f fVar) {
        if (c.b(this.b, fVar)) {
            c.a(fVar);
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.executePendingTransactions();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(z[3]);
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            dialogFragment = (DialogFragment) c.g.a(fVar, this.e, this.c);
            if (dialogFragment != null) {
                dialogFragment.show(fragmentManager, z[2]);
            }
        }
    }

    public static void a(Activity activity, Object obj, boolean z, Bundle bundle) {
        boolean z2 = g.b;
        FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        ErrorDialogManager$SupportManagerFragment errorDialogManager$SupportManagerFragment = (ErrorDialogManager$SupportManagerFragment) supportFragmentManager.findFragmentByTag(z[1]);
        if (errorDialogManager$SupportManagerFragment == null) {
            errorDialogManager$SupportManagerFragment = new ErrorDialogManager$SupportManagerFragment();
            supportFragmentManager.beginTransaction().add((Fragment) errorDialogManager$SupportManagerFragment, z[0]).commit();
            supportFragmentManager.executePendingTransactions();
        }
        errorDialogManager$SupportManagerFragment.e = z;
        errorDialogManager$SupportManagerFragment.c = bundle;
        errorDialogManager$SupportManagerFragment.b = obj;
        if (h.p != 0) {
            g.b = !z2;
        }
    }

    public void onPause() {
        this.f.c(this);
        super.onPause();
    }
}
