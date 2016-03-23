package de.greenrobot.event;

/* synthetic */ class e {
    static final int[] a;

    static {
        a = new int[n.values().length];
        try {
            a[n.PostThread.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[n.MainThread.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[n.BackgroundThread.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[n.Async.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
