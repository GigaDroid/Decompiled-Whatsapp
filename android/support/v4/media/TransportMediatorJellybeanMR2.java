package android.support.v4.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import org.v;
import org.whispersystems.at;

class TransportMediatorJellybeanMR2 {
    final TransportMediatorCallback mTransportCallback;

    class 3 extends BroadcastReceiver {
        private static final String[] z;
        final TransportMediatorJellybeanMR2 this$0;

        static {
            String[] strArr = new String[2];
            String str = "X\u001do(J|\u0000|2zc\u0001z4V`\u0003k4";
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
                            i3 = 111;
                            break;
                        case at.i /*2*/:
                            i3 = 14;
                            break;
                        case at.o /*3*/:
                            i3 = 70;
                            break;
                        default:
                            i3 = 57;
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
                        str = "m\u0001j4Ve\u000b /Wx\n`2\u0017i\u0017z4X\"$K\u001ffI9K\bm";
                        obj = null;
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            try {
                this.this$0.mTransportCallback.handleKey((KeyEvent) intent.getParcelableExtra(z[1]));
            } catch (Throwable e) {
                Log.w(z[0], e);
            }
        }
    }
}
