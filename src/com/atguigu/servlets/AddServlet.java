package com.atguigu.servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 1/23/2023 11:36 PM
 */


public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        String price = req.getParameter("price"); //string to integer
        Integer priceInt = Integer.parseInt(price);
        String stock = req.getParameter("stock");
        Integer stockInt = Integer.parseInt(stock);
        String remark = req.getParameter("remark");

        System.out.println("fname = " + fname);
        System.out.println("price = " + priceInt);
        System.out.println("stock = " + stockInt);
        System.out.println("remark = " + remark);



    }
}
