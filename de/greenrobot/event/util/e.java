package de.greenrobot.event.util;

import de.greenrobot.event.h;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import org.v;
import org.whispersystems.at;

public class e {
    private static final String z;
    private final Constructor a;
    private final h b;
    private final Object c;
    private final Executor d;

    static {
        char[] toCharArray = "$v2*<\u0010r{#?\u0007y/f*\u000ev(5i\u000fb(2i\nv-#i\u000378)'\u0011c)3*\u0016x)f>\u000bc3f&\fr{6(\u0010v6#=\u0007e{)/Bc\"6,BC34&\u0015v9*,".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 23;
                    break;
                case at.i /*2*/:
                    i2 = 91;
                    break;
                case at.o /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 73;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private e(Executor executor, h hVar, Class cls, Object obj) {
        this.d = executor;
        this.b = hVar;
        this.c = obj;
        try {
            this.a = cls.getConstructor(new Class[]{Throwable.class});
        } catch (Throwable e) {
            throw new RuntimeException(z, e);
        }
    }

    static Object a(e eVar) {
        return eVar.c;
    }

    public void a(m mVar) {
        this.d.execute(new l(this, mVar));
    }

    public static e a() {
        return new j(null).a();
    }

    static Constructor b(e eVar) {
        return eVar.a;
    }

    e(Executor executor, h hVar, Class cls, Object obj, l lVar) {
        this(executor, hVar, cls, obj);
    }

    static h c(e eVar) {
        return eVar.b;
    }

    public static j b() {
        return new j(null);
    }
}
