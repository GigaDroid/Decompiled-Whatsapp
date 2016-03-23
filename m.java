import android.content.ContentValues;
import com.whatsapp.WAAppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.v;
import org.whispersystems.at;

public class m {
    public static boolean e;
    private static final String[] z;
    public String a;
    public ContentValues b;
    public String c;
    public Set d;
    public List f;
    public byte[] g;
    public Set h;

    static {
        String[] strArr = new String[7];
        String str = "v[!\u0002!*\u0016\u001c\u0011>\u0005/\b \u000b`[";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = 123;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 78;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "v[!\u0011<;\u0016\u001c\u0011>`[";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "v[!\u0002!*-0\u001c;?$'\u0015-.\u0014#P=3\u00014Jn";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "*\t>\u0000\u0000;\u00164Jn";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "v[!\u0002!*<#\u001f;*(4\u0004tz";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "v[!\u0002!*-0\u001c;?Aq";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "v[!\u0002!*-0\u001c;?$3\t:?\bq\u0003' \u001ekP";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == null || !this.a.equals(mVar.a) || !this.b.equals(mVar.b) || !this.d.equals(mVar.d) || !this.h.equals(mVar.h)) {
            return false;
        }
        if (this.g != null && Arrays.equals(this.g, mVar.g)) {
            return true;
        }
        if (!this.c.equals(mVar.c)) {
            return false;
        }
        if (this.f.equals(mVar.f) || this.f.size() == 1 || mVar.f.size() == 1) {
            return true;
        }
        return false;
    }

    public void a(String str) {
        this.d.add(str.toUpperCase());
    }

    public m() {
        this.a = "";
        this.c = "";
        this.f = new ArrayList();
        this.b = new ContentValues();
        this.d = new HashSet();
        this.h = new HashSet();
    }

    public String toString() {
        boolean z = e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(z[4]);
        stringBuilder.append(this.a);
        stringBuilder.append(z[2]);
        stringBuilder.append(this.b.toString());
        stringBuilder.append(z[0]);
        stringBuilder.append(this.d.toString());
        stringBuilder.append(z[5]);
        stringBuilder.append(this.h.toString());
        if (this.f != null && this.f.size() > 1) {
            stringBuilder.append(z[3]);
            stringBuilder.append(this.f.size());
        }
        if (this.g != null) {
            stringBuilder.append(z[1]);
            stringBuilder.append(this.g.length);
        }
        stringBuilder.append(z[6]);
        stringBuilder.append(this.c);
        String stringBuilder2 = stringBuilder.toString();
        if (z) {
            WAAppCompatActivity.c++;
        }
        return stringBuilder2;
    }
}
