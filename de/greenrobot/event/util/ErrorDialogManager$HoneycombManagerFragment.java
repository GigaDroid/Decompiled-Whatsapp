package de.greenrobot.event.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

@TargetApi(11)
public class ErrorDialogManager$HoneycombManagerFragment extends Fragment {
    private static final String[] z;
    private Object a;
    private h b;
    protected Bundle c;
    protected boolean d;

    static {
        String[] strArr = new String[4];
        String str = ",\n\u0019A\"-\nYT?*\u0000C\b5>\nYR2=\u001c\u0019C\":\u0000Ey4!\u000e[I7\u0017\u0002VH1/\nE";
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
                        i3 = 72;
                        break;
                    case at.g /*1*/:
                        i3 = 111;
                        break;
                    case at.i /*2*/:
                        i3 = 55;
                        break;
                    case at.o /*3*/:
                        i3 = 38;
                        break;
                    default:
                        i3 = 80;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ",\n\u0019A\"-\nYT?*\u0000C\b5>\nYR2=\u001c\u0019C\":\u0000Ey4!\u000e[I7";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ",\n\u0019A\"-\nYT?*\u0000C\b5>\nYR2=\u001c\u0019C\":\u0000Ey4!\u000e[I7";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ",\n\u0019A\"-\nYT?*\u0000C\b5>\nYR2=\u001c\u0019C\":\u0000Ey4!\u000e[I7\u0017\u0002VH1/\nE";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(Activity activity, Object obj, boolean z, Bundle bundle) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        ErrorDialogManager$HoneycombManagerFragment errorDialogManager$HoneycombManagerFragment = (ErrorDialogManager$HoneycombManagerFragment) fragmentManager.findFragmentByTag(z[1]);
        if (errorDialogManager$HoneycombManagerFragment == null) {
            errorDialogManager$HoneycombManagerFragment = new ErrorDialogManager$HoneycombManagerFragment();
            fragmentManager.beginTransaction().add(errorDialogManager$HoneycombManagerFragment, z[0]).commit();
            fragmentManager.executePendingTransactions();
        }
        errorDialogManager$HoneycombManagerFragment.d = z;
        errorDialogManager$HoneycombManagerFragment.c = bundle;
        errorDialogManager$HoneycombManagerFragment.a = obj;
    }

    public void onResume() {
        super.onResume();
        this.b = c.g.a.b();
        this.b.e(this);
    }

    public void onEventMainThread(f fVar) {
        if (c.b(this.a, fVar)) {
            c.a(fVar);
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.executePendingTransactions();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(z[2]);
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            dialogFragment = (DialogFragment) c.g.a(fVar, this.d, this.c);
            if (dialogFragment != null) {
                dialogFragment.show(fragmentManager, z[3]);
            }
        }
    }

    public void onPause() {
        this.b.c(this);
        super.onPause();
    }
}
