package com.yhl.boot.websocket.service;

import com.yhl.boot.websocket.domain.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Charles
 * @Title: WebSocketService
 * @Package com.yhl.boot.websocket.service
 * @Description: TODO
 * @date 2017/11/7 11:37
 */
@Service
public class WebSocketService {

    @Autowired
    //使用SimpMessagingTemplate 向浏览器发送消息
    private SimpMessagingTemplate template;

    public void sendMessage() throws Exception{
        for(int i=0;i<10;i++)
        {
            Thread.sleep(1000);
            template.convertAndSend("/topic/getResponse",new Response("Welcome,yangyibo !"+i));
            System.out.println("----------------------yangyibo"+i);
        }
    }

}