package cn.sueyun.rest;

/**
 * @author gfc
 * 2018年11月17日 下午 5:04
 */
public class Result<T> {

    private int code;

    private String msg;

    private T data;

    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(CodeMsg cm) {
        if (cm == null) {
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    public static <T> Result<T> success(T data) {
        return new Result(data);
    }
    
    public static <T> Result<T> error(CodeMsg cm) {
        return new Result(cm);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

}
