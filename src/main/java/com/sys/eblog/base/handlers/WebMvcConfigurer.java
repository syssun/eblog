package com.sys.eblog.base.handlers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        /**
         * 拦截器按照顺序执行,如果不同拦截器拦截存在相同的URL，前面的拦截器会执行，后面的拦截器将不执行
         */
        registry.addInterceptor(new AuthorityInterceptor())
                .addPathPatterns("/**/**");
        super.addInterceptors(registry);
    }

    /**
     * 解决url后缀包含特殊字符
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        // to  avoid HttpMediaTypeNotAcceptableException on standalone tomcat
        configurer.favorPathExtension(false);
    }

}