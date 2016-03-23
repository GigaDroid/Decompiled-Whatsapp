import java.io.BufferedReader;
import java.io.Reader;

class r extends BufferedReader {
    private long a;

    public r(Reader reader) {
        super(reader);
    }

    public String readLine() {
        long currentTimeMillis = System.currentTimeMillis();
        String readLine = super.readLine();
        this.a = (System.currentTimeMillis() - currentTimeMillis) + this.a;
        return readLine;
    }
}
