package com.yhl.boot.websocket.domain;

/**
 * @author Charles
 * @Title: Response
 * @Package com.yhl.boot.websocket.domain
 * @Description: TODO
 * @date 2017/11/7 11:35
 */
public class Response {
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    private String responseMessage;
    public Response(String responseMessage){
        this.responseMessage = responseMessage;
    }
    public String getResponseMessage(){
        return responseMessage;
    }

}
