package designpattern.sigleton;

public class EarlyLoading {
    private EarlyLoading() {

    }

    private final static EarlyLoading i = new EarlyLoading();

    public static EarlyLoading getInstance() {
        return i;
    }
}
