package cn.bdqn.pojo;

/**
 * Created by Administrator on 2018/4/30/030.
 */
public class JsonResult<T> {
    private Integer status;
    private String msg;
    private T data;

    public static <E> JsonResult<E> ok(E data) {
        JsonResult<E> jsonResult = new JsonResult<E>();
        jsonResult.status = 200;
        jsonResult.msg = "ok";
        jsonResult.data = data;
        return jsonResult;
    }

    public static JsonResult<?> ok() {
        return ok(null);
    }

    public static JsonResult<?> fail(String msg) {
        JsonResult<?> jsonResult = new JsonResult();
        jsonResult.status = 500;
        jsonResult.msg = msg;
        return jsonResult;
    }

    public static JsonResult<?> fail() {
        return fail(null);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
