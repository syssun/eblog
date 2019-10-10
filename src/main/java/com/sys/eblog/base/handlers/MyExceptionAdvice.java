package com.sys.eblog.base.handlers;

import com.sys.eblog.base.beans.Data;
import com.sys.eblog.common.exceptions.NoLoginException;
import com.sys.eblog.common.exceptions.ParamsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@ControllerAdvice
public class MyExceptionAdvice {
	private final static Logger logger = LoggerFactory.getLogger(MyExceptionAdvice.class);
	/**
     *参数异常
     */
    @ResponseBody
    @ExceptionHandler(value = ParamsException.class)
	public Data paramsHandler(Exception ex, HttpServletRequest res, HttpServletResponse req) {
	       Data d = new Data();
	       d.setCode(10006);
	       d.setMessage("参数异常,请检查您的参数是否正确！");
	       logger.error("ParamsException",ex);
	       return d;
	}

    /**
     *参数异常
     */
    @ExceptionHandler(value = NoLoginException.class)
    public ModelAndView noLoginHandler(Exception ex, HttpServletRequest res, HttpServletResponse req) {
       String url = res.getRequestURL().toString();
        System.out.println("**********");
        System.out.println(url);
       return new ModelAndView("redirect:login");
    }



    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Data handleBindException(MethodArgumentNotValidException ex) {
        // ex.getFieldError():随机返回一个对象属性的异常信息。如果要一次性返回所有对象属性异常信息，则调用ex.getAllErrors()
        System.err.println("BindException:"+ex.toString());
        BindingResult res = ex.getBindingResult();
        ObjectError error = res.getAllErrors().get(0);
        Data data = new Data();
        data.setCode(10007);
        data.setMessage(error.getDefaultMessage());
        return data;
    }

    //
    
    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public Data NoBodyPram(Exception ex, HttpServletRequest res, HttpServletResponse req) {
       Data d = new Data();
       d.setCode(10100);
      // d.setMessage(ex.getMessage());
       d.setMessage("请检查传入JSON数据是否正确");
       logger.error("HttpMessageNotReadableException", ex);
       return d;
    }

    @ResponseBody
    @ExceptionHandler(value = java.sql.SQLDataException.class)
    public Data DataException(Exception ex, HttpServletRequest res, HttpServletResponse req) {
       Data d = new Data();
       d.setCode(10100);
      // d.setMessage(ex.getMessage());
       d.setMessage("请检查日期格式是否正确");
       logger.error("SQLDataException", ex);
       return d;
    }
    
	/**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Data errorHandler(Exception ex, HttpServletRequest res, HttpServletResponse req) {
       Data d = new Data();
       d.setCode(10100);
      // d.setMessage(ex.getMessage());
       d.setMessage("~~~服务器出错啦！");
       logger.error("服务器出错啦", ex);
       return d;
    }
}