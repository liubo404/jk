package mvc;

/**
 * User: liubo
 * Datetime: 2017/5/916:54
 */
public interface BaseService {
    int SUCCESS = 1; //成功
    int FAIL = 0; //失败

    public enum BaseServiceResult {
        /**
         * 成功
         */
        SUCCESS,
        /**
         * 失败
         */
        FAILED,
        /**
         * 信息错误
         */
        ERROR,
        /**
         * 信息重复
         */
        DEPLICATED
    }
}
