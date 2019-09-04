package com.zch.crm.web.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zch.crm.entity.DocTest;
import com.zch.crm.service.IDocTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:38
 * @version:1.0.0
 */
@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private IDocTestService docTestService;

    @RequestMapping("/noticeView")
    public String noticeView(Model model, Integer pageIndex) {
        int pageSize = 5;//每页显示的记录数
        if (pageIndex == null) {
            pageIndex = 1;//第一次访问页面默认页面为第一页
        }
        PageHelper.startPage(pageIndex, pageSize);
        List<DocTest> docTests = docTestService.selectAll();
        //得到分页的结果对象
        PageInfo<DocTest> personPageInfo = new PageInfo<>(docTests);
        //得到分页中的person条目对象
        List<DocTest> pageList = personPageInfo.getList();
        model.addAttribute("docList", pageList);
        model.addAttribute("page", personPageInfo);
        return "notice/notice";
    }


    @RequestMapping("/addView")
    public String updateOrAddView() {
        return "notice/noticeAddOrUpdate";
    }

}
