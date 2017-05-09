package mvc;

/**
 * User: liubo
 * Datetime: 2017/5/916:55
 */
public interface test extends BaseService {
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
