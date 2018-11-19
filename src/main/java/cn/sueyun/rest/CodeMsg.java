package cn.sueyun.rest;

/**
 * @author gfc
 * 2018年11月17日 下午 5:11
 */
public class CodeMsg {

    private int code;

    private String msg;

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static CodeMsg SUCCESS = new CodeMsg(0, "success");

    public static CodeMsg ERROR = new CodeMsg(1, "failed");

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
