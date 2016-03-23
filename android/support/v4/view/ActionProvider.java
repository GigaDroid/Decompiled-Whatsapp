package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import org.v;
import org.whispersystems.at;

public abstract class ActionProvider {
    private static final String[] z;
    private final Context mContext;
    private SubUiVisibilityListener mSubUiVisibilityListener;
    private VisibilityListener mVisibilityListener;

    public interface SubUiVisibilityListener {
        void onSubUiVisibilityChanged(boolean z);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean z);
    }

    static {
        String[] strArr = new String[3];
        String str = "*_he9*S~Z<0Ne\u007f9*Ny]5+\u0000<`5-Nu]7y[<]5.\u001a]P$0Urc\"6LuW5+\u0014JZ#0Xu_9-CPZ#-_rV\"yMtV>yUrVp0I<R<+_}W)yIyG~y{nVp Ui\u0013\"<OoZ>>\u001ah[9*\u001a";
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
                        i3 = 89;
                        break;
                    case at.g /*1*/:
                        i3 = 58;
                        break;
                    case at.i /*2*/:
                        i3 = 28;
                        break;
                    case at.o /*3*/:
                        i3 = 51;
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
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0018YhZ?7jn\\&0^yAx*OlC?+N5";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "ySr@$8T\u007fVp.Ru_5ySh\u00139*\u001aoG95V<Z>yOoVp*UqV'1_nVp<VoVo";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract View onCreateActionView();

    public void setSubUiVisibilityListener(SubUiVisibilityListener subUiVisibilityListener) {
        this.mSubUiVisibilityListener = subUiVisibilityListener;
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }

    public boolean hasSubMenu() {
        return false;
    }

    public ActionProvider(Context context) {
        this.mContext = context;
    }

    public void subUiVisibilityChanged(boolean z) {
        if (this.mSubUiVisibilityListener != null) {
            this.mSubUiVisibilityListener.onSubUiVisibilityChanged(z);
        }
    }

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public boolean isVisible() {
        return true;
    }

    public void setVisibilityListener(VisibilityListener visibilityListener) {
        if (!(this.mVisibilityListener == null || visibilityListener == null)) {
            Log.w(z[2], z[0] + getClass().getSimpleName() + z[1]);
        }
        this.mVisibilityListener = visibilityListener;
    }
}
