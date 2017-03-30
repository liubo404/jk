package ax;

import lombok.Data;

/**
 * Created by Thinkpad on 2017/3/30.
 *
 * https://github.com/zzz40500/GsonFormat
 *
 */
/*
{
  "result": {
    "user_name": "liubo",
    "company_id": null,
    "update_time": "2017-02-16",
    "create_by": null,
    "create_time": "2017-02-16",
    "user_id": 6,
    "user_no": "liubo",
    "password": "111111",
    "update_by": null,
    "mobile": "13718160952"
  },
  "token": "617098809293",
  "resultType": "SUCCESS",
  "resultMessage": "创建用户成功。"
}

 */
@Data
public class GsonFormatTest {


    /**
     * result : {"user_name":"liubo","company_id":null,"update_time":"2017-02-16","create_by":null,"create_time":"2017-02-16","user_id":6,"user_no":"liubo","password":"111111","update_by":null,"mobile":"13718160952"}
     * token : 617098809293
     * resultType : SUCCESS
     * resultMessage : 创建用户成功。
     */

    private ResultBean result;
    private String token;
    private String resultType;
    private String resultMessage;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public static class ResultBean {
        /**
         * user_name : liubo
         * company_id : null
         * update_time : 2017-02-16
         * create_by : null
         * create_time : 2017-02-16
         * user_id : 6
         * user_no : liubo
         * password : 111111
         * update_by : null
         * mobile : 13718160952
         */

        private String user_name;
        private Object company_id;
        private String update_time;
        private Object create_by;
        private String create_time;
        private int user_id;
        private String user_no;
        private String password;
        private Object update_by;
        private String mobile;

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public Object getCompany_id() {
            return company_id;
        }

        public void setCompany_id(Object company_id) {
            this.company_id = company_id;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public Object getCreate_by() {
            return create_by;
        }

        public void setCreate_by(Object create_by) {
            this.create_by = create_by;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getUser_no() {
            return user_no;
        }

        public void setUser_no(String user_no) {
            this.user_no = user_no;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getUpdate_by() {
            return update_by;
        }

        public void setUpdate_by(Object update_by) {
            this.update_by = update_by;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }
    }
}
