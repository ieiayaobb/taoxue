package com.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JSONTools {
    
    /**
     * 输出JSON字符串
     * @param str
     */
    public static void outJsonString(String str,HttpServletResponse response) {
        response.setContentType("text/javascript;charset=UTF-8");
        outString(str,response);
    }

    /**
     * 得到JSON数组
     * @param array
     */
    public static String getJsonArray(List list) {
        return JSONArray.fromObject(list).toString();
    }
    
    /**
     * 得到JSON对象
     * @param o
     * @return
     */
    public static String getJsonObject(Object o)
    {
        return JSONObject.fromObject(o).toString();
    }

    /**
     * 向客户端输出
     * @param str
     */
    public static void outString(String str,HttpServletResponse response) {
        try {
            PrintWriter out = response.getWriter();
            out.write(str);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("向客户端输出String出错");
        }
    }
    
    /**
     * 对中文进行编码
     * @param message
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String encode(String message) throws UnsupportedEncodingException
    {
        return java.net.URLEncoder.encode(message,"UTF-8");
    }

}