package org.example;

/**
 * rest接口返回的对象类
 * 2020-05-12 15:44
 * yds
 **/
public class Result {

    private static final String SUCCESS_CODE = "0";
    private static final String SUCCESS_MSG = "ok";

    private static final String DEFAULT_FAIL_CODE = "1";

    private String code;
    private String msg;
    private Object data;
    private String from = Mark.APP_MARK;

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Result ok() {
        return new Result(SUCCESS_CODE, SUCCESS_MSG);
    }

    public static Result ok(Object data) {
        Result result = new Result(SUCCESS_CODE, SUCCESS_MSG);
        result.setData(data);
        return result;
    }

    public static Result fail(String code, String msg) {
        return new Result(code, msg);
    }

    public static Result fail(String msg) {
        return new Result(DEFAULT_FAIL_CODE, msg);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }
}
