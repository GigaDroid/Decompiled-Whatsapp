package com.whatsapp.gdrive;

import com.whatsapp.App;
import com.whatsapp.dg;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

class b0 implements Runnable {
    private static final String[] z;
    final GoogleDriveActivity a;
    final b6 b;

    static {
        String[] strArr = new String[4];
        String str = "\u0012.Em\u0019\u0010gVg\u001b\u001c<^p\u0016Z)Ea\u000e\u0001/\u001at\u0003\u0014)Rl\u0000\u0019.Rv@\u001c$\u001ai\n\u0011#V)\t\u001a&Sa\u001dU";
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
                        i3 = 117;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = 55;
                        break;
                    case at.o /*3*/:
                        i3 = 4;
                        break;
                    default:
                        i3 = 111;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0012.Em\u0019\u0010gVg\u001b\u001c<^p\u0016Z)Ea\u000e\u0001/\u001at\u0003\u0014)Rl\u0000\u0019.Rv@\u0011#E+\t\u0014#[a\u000bU";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0012.Em\u0019\u0010gVg\u001b\u001c<^p\u0016Z)Ea\u000e\u0001/\u001at\u0003\u0014)Rl\u0000\u0019.Rv@\u0013#[a@\u0013+^h\n\u0011j";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0012.Em\u0019\u0010gVg\u001b\u001c<^p\u0016Z)Ea\u000e\u0001/\u001at\u0003\u0014)Rl\u0000\u0019.Rv@\u0013+^h\n\u0011j";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    b0(GoogleDriveActivity googleDriveActivity, b6 b6Var) {
        this.a = googleDriveActivity;
        this.b = b6Var;
    }

    public void run() {
        boolean z = GoogleDriveService.c;
        dg.a();
        for (String file : this.b.s()) {
            boolean d;
            File file2 = new File(App.a3, file);
            try {
                d = dg.d(file2);
            } catch (Throwable e) {
                Log.b(z[0] + file2, e);
                d = false;
            }
            if (d) {
                try {
                    if (file2.exists()) {
                        continue;
                    } else {
                        File parentFile = file2.getParentFile();
                        try {
                            if (!(parentFile.exists() || parentFile.mkdirs())) {
                                Log.e(z[2] + file2.getAbsolutePath());
                                if (!z) {
                                    continue;
                                }
                            }
                            try {
                                if (!(file2.exists() || file2.createNewFile())) {
                                    Log.e(z[3] + file2.getAbsolutePath());
                                    continue;
                                }
                            } catch (IOException e2) {
                                throw e2;
                            } catch (IOException e22) {
                                try {
                                    throw e22;
                                } catch (Throwable e3) {
                                    Log.b(z[1] + file2.getAbsolutePath(), e3);
                                    continue;
                                }
                            }
                        } catch (IOException e222) {
                            throw e222;
                        } catch (IOException e2222) {
                            throw e2222;
                        }
                    }
                } catch (IOException e22222) {
                    throw e22222;
                }
            }
            if (z) {
                return;
            }
        }
    }
}
