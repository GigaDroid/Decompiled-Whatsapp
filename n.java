class n extends Exception {
    private static final long serialVersionUID = 1;

    public n(String str, Throwable th) {
        super(str, th);
    }

    public n(String str) {
        super(str);
    }
}
