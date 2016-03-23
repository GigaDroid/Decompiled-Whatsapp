package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;
import org.v;
import org.whispersystems.at;

public class MotionEventCompat {
    static final MotionEventVersionImpl IMPL;

    interface MotionEventVersionImpl {
        int findPointerIndex(MotionEvent motionEvent, int i);

        float getAxisValue(MotionEvent motionEvent, int i);

        int getPointerCount(MotionEvent motionEvent);

        int getPointerId(MotionEvent motionEvent, int i);

        int getSource(MotionEvent motionEvent);

        float getX(MotionEvent motionEvent, int i);

        float getY(MotionEvent motionEvent, int i);
    }

    class BaseMotionEventVersionImpl implements MotionEventVersionImpl {
        private static final String[] z;

        static {
            String[] strArr = new String[3];
            String str = "pX?CJCF;\u0007}\u0000N5\u000b|\u0000D5\u001a/S_*\u001e`R^z\u0003zL^3\u001ecE\n*\u0001fN^?\u001c|";
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
                            i3 = 32;
                            break;
                        case at.g /*1*/:
                            i3 = 42;
                            break;
                        case at.i /*2*/:
                            i3 = 90;
                            break;
                        case at.o /*3*/:
                            i3 = 110;
                            break;
                        default:
                            i3 = 15;
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
                        str = "pX?CJCF;\u0007}\u0000N5\u000b|\u0000D5\u001a/S_*\u001e`R^z\u0003zL^3\u001ecE\n*\u0001fN^?\u001c|";
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "pX?CJCF;\u0007}\u0000N5\u000b|\u0000D5\u001a/S_*\u001e`R^z\u0003zL^3\u001ecE\n*\u0001fN^?\u001c|";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public int getPointerId(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return 0;
            }
            throw new IndexOutOfBoundsException(z[0]);
        }

        BaseMotionEventVersionImpl() {
        }

        public int findPointerIndex(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return 0;
            }
            return -1;
        }

        public float getY(MotionEvent motionEvent, int i) {
            if (i == 0) {
                try {
                    return motionEvent.getY();
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                }
            }
            throw new IndexOutOfBoundsException(z[1]);
        }

        public int getPointerCount(MotionEvent motionEvent) {
            return 1;
        }

        public float getAxisValue(MotionEvent motionEvent, int i) {
            return 0.0f;
        }

        public float getX(MotionEvent motionEvent, int i) {
            if (i == 0) {
                try {
                    return motionEvent.getX();
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                }
            }
            throw new IndexOutOfBoundsException(z[2]);
        }

        public int getSource(MotionEvent motionEvent) {
            return 0;
        }
    }

    class EclairMotionEventVersionImpl extends BaseMotionEventVersionImpl {
        public float getY(MotionEvent motionEvent, int i) {
            return MotionEventCompatEclair.getY(motionEvent, i);
        }

        public int findPointerIndex(MotionEvent motionEvent, int i) {
            return MotionEventCompatEclair.findPointerIndex(motionEvent, i);
        }

        public float getX(MotionEvent motionEvent, int i) {
            return MotionEventCompatEclair.getX(motionEvent, i);
        }

        EclairMotionEventVersionImpl() {
        }

        public int getPointerCount(MotionEvent motionEvent) {
            return MotionEventCompatEclair.getPointerCount(motionEvent);
        }

        public int getPointerId(MotionEvent motionEvent, int i) {
            return MotionEventCompatEclair.getPointerId(motionEvent, i);
        }
    }

    class GingerbreadMotionEventVersionImpl extends EclairMotionEventVersionImpl {
        public int getSource(MotionEvent motionEvent) {
            return MotionEventCompatGingerbread.getSource(motionEvent);
        }

        GingerbreadMotionEventVersionImpl() {
        }
    }

    class HoneycombMr1MotionEventVersionImpl extends GingerbreadMotionEventVersionImpl {
        public float getAxisValue(MotionEvent motionEvent, int i) {
            return MotionEventCompatHoneycombMr1.getAxisValue(motionEvent, i);
        }

        HoneycombMr1MotionEventVersionImpl() {
        }
    }

    public static int getPointerCount(MotionEvent motionEvent) {
        return IMPL.getPointerCount(motionEvent);
    }

    public static int getSource(MotionEvent motionEvent) {
        return IMPL.getSource(motionEvent);
    }

    public static int getActionIndex(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int getActionMasked(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    static {
        if (VERSION.SDK_INT >= 12) {
            IMPL = new HoneycombMr1MotionEventVersionImpl();
        } else if (VERSION.SDK_INT >= 9) {
            IMPL = new GingerbreadMotionEventVersionImpl();
        } else if (VERSION.SDK_INT >= 5) {
            IMPL = new EclairMotionEventVersionImpl();
        } else {
            IMPL = new BaseMotionEventVersionImpl();
        }
    }

    public static int getPointerId(MotionEvent motionEvent, int i) {
        return IMPL.getPointerId(motionEvent, i);
    }

    public static float getAxisValue(MotionEvent motionEvent, int i) {
        return IMPL.getAxisValue(motionEvent, i);
    }

    public static float getY(MotionEvent motionEvent, int i) {
        return IMPL.getY(motionEvent, i);
    }

    public static int findPointerIndex(MotionEvent motionEvent, int i) {
        return IMPL.findPointerIndex(motionEvent, i);
    }

    public static float getX(MotionEvent motionEvent, int i) {
        return IMPL.getX(motionEvent, i);
    }
}
