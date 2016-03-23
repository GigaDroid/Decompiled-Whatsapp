package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;
import org.v;
import org.whispersystems.at;

public class IntentCompat {
    private static final IntentCompatImpl IMPL;

    interface IntentCompatImpl {
        Intent makeMainActivity(ComponentName componentName);
    }

    class IntentCompatImplBase implements IntentCompatImpl {
        private static final String[] z;

        static {
            String[] strArr = new String[2];
            String str = "E2~'lM84<mP9t!-E?n<lJrW\u0014Jj";
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
                            i3 = 36;
                            break;
                        case at.g /*1*/:
                            i3 = 92;
                            break;
                        case at.i /*2*/:
                            i3 = 26;
                            break;
                        case at.o /*3*/:
                            i3 = 85;
                            break;
                        default:
                            i3 = 3;
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
                        str = "E2~'lM84<mP9t!-G=n0dK.c{Oe\tT\u0016Ka\u000e";
                        obj = null;
                }
            }
        }

        public Intent makeMainActivity(ComponentName componentName) {
            Intent intent = new Intent(z[0]);
            intent.setComponent(componentName);
            intent.addCategory(z[1]);
            return intent;
        }

        IntentCompatImplBase() {
        }
    }

    class IntentCompatImplHC extends IntentCompatImplBase {
        IntentCompatImplHC() {
        }

        public Intent makeMainActivity(ComponentName componentName) {
            return IntentCompatHoneycomb.makeMainActivity(componentName);
        }
    }

    class IntentCompatImplIcsMr1 extends IntentCompatImplHC {
        IntentCompatImplIcsMr1() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 15) {
            IMPL = new IntentCompatImplIcsMr1();
        } else if (i >= 11) {
            IMPL = new IntentCompatImplHC();
        } else {
            IMPL = new IntentCompatImplBase();
        }
    }

    public static Intent makeMainActivity(ComponentName componentName) {
        return IMPL.makeMainActivity(componentName);
    }
}
