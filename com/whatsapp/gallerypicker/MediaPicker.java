package com.whatsapp.gallerypicker;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.a4d;
import com.whatsapp.arj;
import com.whatsapp.memory.d;
import com.whatsapp.util.Log;
import com.whatsapp.util.bz;
import org.v;
import org.whispersystems.at;

public class MediaPicker extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "o;OB\fr7H@\bpqON\u001ev,DR";
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
                        i3 = 2;
                        break;
                    case at.g /*1*/:
                        i3 = 94;
                        break;
                    case at.i /*2*/:
                        i3 = 43;
                        break;
                    case at.o /*3*/:
                        i3 = 43;
                        break;
                    default:
                        i3 = arj.Theme_switchStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "o;OB\fr7H@\bpqHY\bc*N";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "o;OB\fr7H@\bpq[J\u0018q;";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "o;OB\fr7H@\bpqYN\u001ew3N";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(2131755310);
        if (findFragmentById != null) {
            findFragmentById.onActivityResult(i, i2, intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ActivityCompat.finishAfterTransition(this);
        return true;
    }

    public void onPause() {
        Log.i(z[3]);
        super.onPause();
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[2]);
        supportRequestWindowFeature(5);
        if (VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.requestFeature(13);
            window.requestFeature(12);
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            window.setEnterTransition(inflateTransition);
            inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            window.setExitTransition(inflateTransition);
            inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            window.setReturnTransition(inflateTransition);
            inflateTransition = TransitionInflater.from(this).inflateTransition(17760257);
            window.setSharedElementEnterTransition(inflateTransition);
            window.setSharedElementExitTransition(inflateTransition);
            supportPostponeEnterTransition();
        }
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (!App.a1()) {
            getSupportActionBar().setHomeAsUpIndicator(new bz(ContextCompat.getDrawable(this, 2130839457)));
        }
        View frameLayout = new FrameLayout(this);
        frameLayout.setId(2131755310);
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().add(frameLayout.getId(), new MediaPickerFragment()).commit();
            View view = new View(this);
            view.setBackgroundColor(ContextCompat.getColor(this, 2131624010));
            view.setLayoutParams(new LayoutParams(-1, (int) Math.ceil((double) (a4d.a().g / 2.0f))));
            frameLayout.addView(view);
        }
        setContentView(frameLayout);
    }

    public void onResume() {
        Log.i(z[1]);
        super.onResume();
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
        d.a().a(this);
    }
}
