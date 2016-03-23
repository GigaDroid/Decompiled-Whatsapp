package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.whatsapp.util.Log;
import com.whatsapp.util.bz;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

class a3c implements OnClickListener {
    private static final String[] z;
    private VoiceNoteSeekBar a;
    private ImageButton b;
    final MediaView c;

    static {
        String[] strArr = new String[4];
        String str = "`.\u0012";
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
                        i3 = 64;
                        break;
                    case at.g /*1*/:
                        i3 = 3;
                        break;
                    case at.i /*2*/:
                        i3 = 50;
                        break;
                    case at.o /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 77;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "`\u007f\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "`\u007f\u0012";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "-fV},6jWcb!vV}\"#o[w&`";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        Throwable e;
        boolean z = DialogToastActivity.f;
        try {
            Log.i(z[1] + this.a.b() + z[3] + this.a.d() + z[0] + MediaView.p(this.c) + z[2] + 5);
            if (MediaView.p(this.c) == 5 && this.a.b() > 0) {
                try {
                    if (this.a.b() < this.a.d()) {
                        App.y(this.c);
                        i8.m();
                        try {
                            MediaView.r(this.c).c();
                            try {
                                MediaView.u(this.c).sendEmptyMessage(0);
                                this.b.setImageResource(2130839675);
                                MediaView.b(this.c, 4);
                                if (!z) {
                                    return;
                                }
                            } catch (IOException e2) {
                                throw e2;
                            } catch (IOException e22) {
                                throw e22;
                            }
                        } catch (Throwable e3) {
                            Log.a(e3);
                            this.c.a(2131231156);
                            return;
                        }
                    }
                } catch (IllegalStateException e4) {
                    throw e4;
                }
            }
            if (MediaView.p(this.c) == 5) {
                if (MediaView.r(this.c).a() >= MediaView.r(this.c).d()) {
                    try {
                        if (this.a.b() == this.a.d()) {
                            this.a.setProgress(0);
                            try {
                                MediaView.r(this.c).g();
                            } catch (IOException e5) {
                                e3 = e5;
                                Log.a(e3);
                                this.c.a(2131231156);
                                return;
                            } catch (IllegalStateException e6) {
                                e3 = e6;
                                Log.a(e3);
                                this.c.a(2131231156);
                                return;
                            }
                        }
                    } catch (IOException e222) {
                        throw e222;
                    }
                }
                App.y(this.c);
                i8.m();
                try {
                    MediaView.r(this.c).c();
                } catch (Throwable e32) {
                    Log.a(e32);
                    this.c.a(2131231156);
                    return;
                }
                try {
                    MediaView.u(this.c).removeMessages(0);
                    MediaView.u(this.c).sendEmptyMessage(0);
                    this.b.setImageResource(2130839675);
                    MediaView.b(this.c, 4);
                    if (!z) {
                        return;
                    }
                } catch (IOException e2222) {
                    throw e2222;
                } catch (IOException e22222) {
                    try {
                        throw e22222;
                    } catch (IOException e222222) {
                        throw e222222;
                    }
                }
            }
            if (MediaView.p(this.c) == 4) {
                MediaView.r(this.c).i();
                this.b.setImageDrawable(new bz(this.c.getResources().getDrawable(2130839676)));
                MediaView.b(this.c, 5);
                if (!z) {
                    return;
                }
            }
            try {
                MediaView.c(this.c, MediaView.i(this.c, MediaView.a(this.c)));
                if (MediaView.r(this.c) != null) {
                    App.y(this.c);
                    i8.m();
                    try {
                        MediaView.r(this.c).c();
                        this.b.setImageResource(2130839675);
                        MediaView.u(this.c).sendEmptyMessage(0);
                        MediaView.b(this.c, 4);
                    } catch (Throwable e322) {
                        Log.a(e322);
                        this.c.a(2131231156);
                    }
                }
            } catch (IllegalStateException e42) {
                throw e42;
            }
        } catch (IOException e2222222) {
            throw e2222222;
        } catch (IOException e22222222) {
            throw e22222222;
        }
    }

    public a3c(MediaView mediaView, VoiceNoteSeekBar voiceNoteSeekBar, ImageButton imageButton) {
        this.c = mediaView;
        this.a = voiceNoteSeekBar;
        this.b = imageButton;
    }
}
