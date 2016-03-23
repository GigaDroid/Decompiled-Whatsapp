package org.whispersystems;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.UnknownHostException;

public class aB {
    public static boolean a;

    public static void a(String str, Throwable th) {
        a(5, str, a(th));
    }

    public static void a(String str, String str2) {
        a(5, str, str2);
    }

    private static String a(Throwable th) {
        boolean z = a;
        if (th == null) {
            return "";
        }
        Throwable th2 = th;
        while (th2 != null) {
            if (!(th2 instanceof UnknownHostException)) {
                th2 = th2.getCause();
                if (z) {
                    break;
                }
            }
            return "";
        }
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private static void a(int i, String str, String str2) {
        aL a = a2.a();
        if (a != null) {
            a.a(i, str, str2);
        }
    }
}
