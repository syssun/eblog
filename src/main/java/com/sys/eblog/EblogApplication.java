package com.sys.eblog;
import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class EblogApplication {
    public static void main(String[] args) {

        SpringApplication.run(EblogApplication.class, args);
    }

   // @Bean
    public TomcatServletWebServerFactory tomcatServletWebServerFactory (){
        // 修改内置的 tomcat 容器配置
        TomcatServletWebServerFactory tomcatServlet = new TomcatServletWebServerFactory();
//        ErrorPage error400Page = new ErrorPage(HttpStatus.BAD_REQUEST, "/400.html");
//        ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
//        ErrorPage error403Page = new ErrorPage(HttpStatus.FORBIDDEN, "/403.html");
//        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
//        ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
//        tomcatServlet.addErrorPages(error400Page, error401Page, error403Page, error404Page, error500Page);
        tomcatServlet .addConnectorCustomizers(
                (TomcatConnectorCustomizer) connector -> {
                    connector.setProperty("relaxedPathChars", "\"<>[\\]^`{|}");
                    connector.setProperty("relaxedQueryChars", "\"<>[\\]^`{|}");
                }
        );
        return tomcatServlet ;
    }





}
