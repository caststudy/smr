package com.smr.controller;

import com.smr.model.Func1;
import com.smr.service.Func1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/func1")
public class Func1Action {
    @Autowired
    Func1Service func1Service;//= new Func1ServiceImpl();


    @RequestMapping("/ajaxsel")
    public @ResponseBody List<Func1> ajaxsel(Func1 func1) throws ServletException, IOException {
        return func1Service.getAllFunc1(func1);
    }


    @RequestMapping("/check")
    public void check(HttpServletRequest req, HttpServletResponse resp, Func1 func1) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        if (func1Service.getFunc1(func1) != null) {
            out.print("yes");
        } else {
            out.print("no");
        }
    }


}
