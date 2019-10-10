package com.sys.eblog.common.exceptions;
/**
 * 
 * 参数异常抛出的
 *
 */
public class ParamsException extends RuntimeException{
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

    public ParamsException() {
        super();
    }
    public ParamsException(String message) {
        super(message);
    }
    public ParamsException(Integer code, String message) {
        super(message);
        this.code = code;
    }
    public ParamsException(String message, Throwable cause) {
        super(message, cause);
    }
    public ParamsException(Throwable cause) {
        super(cause);
    }
}
