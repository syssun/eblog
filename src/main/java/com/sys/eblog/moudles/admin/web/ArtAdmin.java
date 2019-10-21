package com.sys.eblog.moudles.admin.web;

import com.sys.eblog.base.beans.Data;
import com.sys.eblog.moudles.web.beans.Article;
import com.sys.eblog.moudles.web.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class ArtAdmin {
    @Autowired
    private ArticleDao articleDao ;

    @RequestMapping("/artadd")
    public Data artAdd(@RequestBody  Article article){
        Data data = new Data(1,"success");
        //String content = new sun.misc.BASE64Encoder().encode(article.getContent().getBytes());
        //article.setContent(content.replace("+","").replace("=",""));
        articleDao.artAdd(article);
        return data ;
    }

    public static String filter(String message) {

        if (message == null)
            return (null);

        char content[] = new char[message.length()];
        message.getChars(0, message.length(), content, 0);
        StringBuilder result = new StringBuilder(content.length + 50);
        for (int i = 0; i < content.length; i++) {
            switch (content[i]) {
                case '<':
                    result.append("&lt;");
                    break;
                case '>':
                    result.append("&gt;");
                    break;
                case '&':
                    result.append("&amp;");
                    break;
                case '"':
                    result.append("&quot;");
                    break;
                default:
                    result.append(content[i]);
            }
        }
        return (result.toString());

    }

}

