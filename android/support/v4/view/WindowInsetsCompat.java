package android.support.v4.view;

public class WindowInsetsCompat {
    public static int a;

    public WindowInsetsCompat replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        return this;
    }

    public int getSystemWindowInsetLeft() {
        return 0;
    }

    public int getSystemWindowInsetTop() {
        return 0;
    }

    public boolean isConsumed() {
        return false;
    }

    public WindowInsetsCompat consumeSystemWindowInsets() {
        return this;
    }

    public int getSystemWindowInsetRight() {
        return 0;
    }

    WindowInsetsCompat() {
    }

    public int getSystemWindowInsetBottom() {
        return 0;
    }
}
