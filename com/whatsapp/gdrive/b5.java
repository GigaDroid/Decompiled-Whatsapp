package com.whatsapp.gdrive;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.at;

final class b5 implements Comparator {
    private static final Pattern a;
    private static final Pattern b;

    public int a(String str, String str2) {
        int parseInt;
        int parseInt2;
        int i = 0;
        Matcher matcher = b.matcher(str);
        Matcher matcher2 = b.matcher(str2);
        if (matcher.find()) {
            parseInt = Integer.parseInt(matcher.group(1));
        } else {
            parseInt = 0;
        }
        if (matcher2.find()) {
            parseInt2 = Integer.parseInt(matcher2.group(1));
        } else {
            parseInt2 = 0;
        }
        if (parseInt == parseInt2) {
            matcher = a.matcher(str);
            matcher2 = a.matcher(str2);
            if (matcher.find()) {
                parseInt = Integer.parseInt(matcher.group(1));
            } else {
                parseInt = 0;
            }
            if (matcher2.find()) {
                i = Integer.parseInt(matcher2.group(1));
            }
        } else {
            i = parseInt2;
        }
        return (parseInt - i) * -1;
    }

    public int compare(Object obj, Object obj2) {
        return a((String) obj, (String) obj2);
    }

    static {
        String str = "\u0017b'\u0013\u001ee,S+&]\u0014k\u0013\u001ee,S+S\u0017b";
        Object obj = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 57;
                        break;
                    case at.g /*1*/:
                        i2 = 72;
                        break;
                    case at.i /*2*/:
                        i2 = 15;
                        break;
                    case at.o /*3*/:
                        i2 = 79;
                        break;
                    default:
                        i2 = 122;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    a = Pattern.compile(str);
                    return;
                default:
                    b = Pattern.compile(str);
                    str = "n\t'\u0013\u001ee,S+&]a";
                    obj = null;
            }
        }
    }
}
