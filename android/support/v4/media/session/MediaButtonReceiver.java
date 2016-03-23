package android.support.v4.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v4.app.FragmentActivity;
import android.support.v4.media.session.MediaSessionCompat.Token;
import com.whatsapp.arj;
import java.util.List;
import org.v;
import org.whispersystems.at;

public class MediaButtonReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "F\u0007w\u0012\u0017N\r=\t\u0016S\f}\u0014VF\ng\t\u0017IG^%<n(L\"-s=\\.";
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
                        i3 = 39;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 19;
                        break;
                    case at.o /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 120;
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
                    str = "b\u0011c\u0005\u001bS\fw@I\u0007:v\u0012\u000eN\nv@\fO\bg@\u0010F\u0007w\f\u001dTIr\u000e\u001cU\u0006z\u0004VN\u0007g\u0005\u0016SGr\u0003\fN\u0006}N5b-Z!'e<G47iE3\u0006\u0017R\u0007w@";
                    obj = null;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        int i = Token.a;
        Intent intent2 = new Intent(z[0]);
        intent2.setPackage(context.getPackageName());
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent2, 0);
        try {
            if (queryIntentServices.size() != 1) {
                throw new IllegalStateException(z[1] + queryIntentServices.size());
            }
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            intent.setComponent(new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
            context.startService(intent);
            if (i != 0) {
                FragmentActivity.a++;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
