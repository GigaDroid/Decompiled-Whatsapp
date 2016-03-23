package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;
import org.v;
import org.whispersystems.at;

public class KeyEventCompat {
    static final KeyEventVersionImpl IMPL;

    interface KeyEventVersionImpl {
        boolean metaStateHasModifiers(int i, int i2);

        boolean metaStateHasNoModifiers(int i);

        void startTracking(KeyEvent keyEvent);
    }

    class BaseKeyEventVersionImpl implements KeyEventVersionImpl {
        private static final String z;

        static {
            char[] toCharArray = "W?[\u0007WG9JJS[*L".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 53;
                        break;
                    case at.g /*1*/:
                        i2 = 94;
                        break;
                    case at.i /*2*/:
                        i2 = 63;
                        break;
                    case at.o /*3*/:
                        i2 = 39;
                        break;
                    default:
                        i2 = 54;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public boolean metaStateHasModifiers(int i, int i2) {
            if (metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(normalizeMetaState(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2) {
                return true;
            }
            return false;
        }

        BaseKeyEventVersionImpl() {
        }

        public void startTracking(KeyEvent keyEvent) {
        }

        public int normalizeMetaState(int i) {
            int i2;
            if ((i & 192) != 0) {
                i2 = i | 1;
            } else {
                i2 = i;
            }
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & 247;
        }

        public boolean metaStateHasNoModifiers(int i) {
            try {
                return (normalizeMetaState(i) & 247) == 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        private static int metaStateFilterDirectionalModifiers(int i, int i2, int i3, int i4, int i5) {
            Object obj;
            Object obj2 = 1;
            if ((i2 & i3) != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            int i6 = i4 | i5;
            if ((i2 & i6) == 0) {
                obj2 = null;
            }
            if (obj != null) {
                if (obj2 == null) {
                    return i & (i6 ^ -1);
                }
                try {
                    throw new IllegalArgumentException(z);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } else if (obj2 != null) {
                return i & (i3 ^ -1);
            } else {
                return i;
            }
        }
    }

    class EclairKeyEventVersionImpl extends BaseKeyEventVersionImpl {
        EclairKeyEventVersionImpl() {
        }

        public void startTracking(KeyEvent keyEvent) {
            KeyEventCompatEclair.startTracking(keyEvent);
        }
    }

    class HoneycombKeyEventVersionImpl extends EclairKeyEventVersionImpl {
        public int normalizeMetaState(int i) {
            return KeyEventCompatHoneycomb.normalizeMetaState(i);
        }

        public boolean metaStateHasModifiers(int i, int i2) {
            return KeyEventCompatHoneycomb.metaStateHasModifiers(i, i2);
        }

        public boolean metaStateHasNoModifiers(int i) {
            return KeyEventCompatHoneycomb.metaStateHasNoModifiers(i);
        }

        HoneycombKeyEventVersionImpl() {
        }
    }

    public static boolean hasNoModifiers(KeyEvent keyEvent) {
        return IMPL.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public static boolean hasModifiers(KeyEvent keyEvent, int i) {
        return IMPL.metaStateHasModifiers(keyEvent.getMetaState(), i);
    }

    public static void startTracking(KeyEvent keyEvent) {
        IMPL.startTracking(keyEvent);
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            IMPL = new HoneycombKeyEventVersionImpl();
        } else {
            IMPL = new BaseKeyEventVersionImpl();
        }
    }
}
