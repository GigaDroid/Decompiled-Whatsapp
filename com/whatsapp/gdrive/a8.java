package com.whatsapp.gdrive;

import android.support.v4.app.DialogFragment;
import com.whatsapp.App;
import com.whatsapp.a_3;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

class a8 {
    private static final String z;
    final bf a;

    static {
        char[] toCharArray = "Mcr3\u0015Pauj\u001bZto1\u0019\u0013id4\u0019Lpc5SIo`.Q]ih)\u0019]rc#\\Kuc5\\Wu&0\u001dWro)\u001b\u001eihg^\\ge,\tN&i)\\]cj+\tRgte\\Nti*\fJ&&&\u0012Z&Q.Qxo&.\u000f\u001eei)\u0012[er\"\u0018\u0012&u3\u001dLr&%\u001d]ms7".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 62;
                    break;
                case at.g /*1*/:
                    i2 = 6;
                    break;
                case at.i /*2*/:
                    i2 = 6;
                    break;
                case at.o /*3*/:
                    i2 = 71;
                    break;
                default:
                    i2 = 124;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a8(bf bfVar) {
        this.a = bfVar;
        h.b().e(this);
    }

    public void onEventAsync(a_3 com_whatsapp_a_3) {
        if (App.az() == 0 || App.az() == 2) {
            this.a.c.runOnUiThread(new ce(this));
        }
        if (App.az() == 1) {
            DialogFragment dialogFragment = (DialogFragment) this.a.c.getSupportFragmentManager().findFragmentByTag(String.valueOf(13));
            if (dialogFragment != null && dialogFragment.isVisible()) {
                Log.i(z);
                SettingsGoogleDrive.b(this.a.c, true);
                dialogFragment.dismissAllowingStateLoss();
            }
        }
    }
}
