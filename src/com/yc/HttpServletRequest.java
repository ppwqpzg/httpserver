package com.yc;

import java.io.InputStream;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class HttpServletRequest {
    private InputStream ils;
    private Socket socket;
    private String realPath;
    private String requestURI;
    private String requestURL;
    private String queryString;
    private String method;
    private Map<String,String>headers=new ConcurrentHashMap<String,String>();

}
