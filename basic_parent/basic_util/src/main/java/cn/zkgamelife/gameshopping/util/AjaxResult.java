package cn.zkgamelife.gameshopping.util;

public class AjaxResult {
    private Boolean success = true;
    private String message = "操作成功";
    private Object objResult;

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObjResult() {
        return objResult;
    }

    public AjaxResult setObjResult(Object objResult) {
        this.objResult = objResult;
        return this;
    }

    public AjaxResult(){}

    public static AjaxResult me(){
        return new AjaxResult();
    }
}
