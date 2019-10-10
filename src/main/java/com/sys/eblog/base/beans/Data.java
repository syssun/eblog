package com.sys.eblog.base.beans;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;

import java.io.Serializable;

/**
 * 
 * 返回信息实体
 *
 */
public class Data implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer code;//返回标识
	private String message;//返回信息
	private Object data;//返回数据
	//private Long timestamp = new Date().getTime(); //返回时间戳
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		ValueFilter filter = new ValueFilter() {
			@Override
			public Object process(Object object, String name, Object value) {
				if (value == null && !"data".equals(name))
                    return "";
				if("data".equals(name)&&value!=null&&value.toString().length()<5) {
					value=null;
				}
                return value;
			}
		};
		SerializeFilter[] filters = new SerializeFilter[1];
		filters[0] = filter ;
		return JSON.toJSONString(this, SerializeConfig.globalInstance,filters,"yyyy-MM-dd HH:mm:ss", JSON.DEFAULT_GENERATE_FEATURE, SerializerFeature.WriteNullStringAsEmpty);
		
	}
	public Data(Integer code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
		//this.timestamp = new Date().getTime();
	}
	public Data(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
		//this.timestamp = new Date().getTime();
	}
	public Data() {
		super();
	//	this.timestamp = new Date().getTime();
		
	}
	
	
	
	
}
