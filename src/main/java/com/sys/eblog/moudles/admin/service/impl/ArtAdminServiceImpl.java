package com.sys.eblog.moudles.admin.service.impl;

import com.sys.eblog.moudles.admin.service.ArtAdminService;
import com.sys.eblog.moudles.web.beans.Article;
import com.sys.eblog.moudles.web.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArtAdminServiceImpl implements ArtAdminService {
    @Autowired
    private ArticleDao articleDao;
    @Override
    public int artAdd(Article article) {
        return  articleDao.artAdd(article);
    }
}
