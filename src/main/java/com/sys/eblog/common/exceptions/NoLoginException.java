package com.sys.eblog.common.exceptions;

public class NoLoginException extends RuntimeException{
    /**
     *
     */
    private Integer code=10006;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }




    private static final long serialVersionUID = 1L;

    public NoLoginException() {
        super();
    }
    public NoLoginException(String message) {
        super(message);
    }
    public NoLoginException(Integer code, String message) {
        super(message);
        this.code = code;
    }
    public NoLoginException(String message, Throwable cause) {
        super(message, cause);
    }
    public NoLoginException(Throwable cause) {
        super(cause);
    }
}
