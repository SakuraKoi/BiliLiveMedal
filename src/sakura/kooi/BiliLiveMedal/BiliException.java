package sakura.kooi.BiliLiveMedal;

public class BiliException extends RuntimeException {
    public BiliException() {}

    public BiliException(String var1) {
        super(var1);
    }

    public BiliException(String var1, Throwable var2) {
        super(var1, var2);
    }

    public BiliException(Throwable var1) {
        super(var1);
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
