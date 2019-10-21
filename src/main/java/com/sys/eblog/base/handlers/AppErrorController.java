package com.sys.eblog.base.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
@Controller
public class AppErrorController  implements ErrorController {
    private static final String ERROR_PATH = "/error";

    private ErrorAttributes errorAttributes;

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @Autowired
    public AppErrorController(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    /**
     * Web页面错误处理
     */
    @RequestMapping(value = ERROR_PATH, produces = "text/html")
    public String errorPageHandler(HttpServletRequest request, HttpServletResponse response) {
        int status = response.getStatus();
        System.out.println("*********************************\n"+status);
        switch (status) {
            case 400:
                return "error/400";
            case 403:
                return "error/403";
            case 404:
                return "error/404";
            case 500:
                return "error/500";
        }

        return "index";
    }

    /**
     * 除Web页面外的错误处理，比如Json/XML等
     */
    @RequestMapping(value = ERROR_PATH)
    @ResponseBody
    @ExceptionHandler(value = {Exception.class})
    public Map<String, Object> errorApiHandler(HttpServletRequest request, final Exception ex, final WebRequest req) {

        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        Map<String, Object> attr = this.errorAttributes.getErrorAttributes(req, false);
        int status = getStatus(request);
        System.out.println("------------------"+status);
        return attr;
    }

    private int getStatus(HttpServletRequest request) {
        Integer status = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (status != null) {
            return status;
        }

        return 500;
    }
}