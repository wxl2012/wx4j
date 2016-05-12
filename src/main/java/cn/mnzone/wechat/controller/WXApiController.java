package cn.mnzone.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ray on 16/4/25.
 * Email: zyr.wxl@gmail.com
 * Site: http://www.mnzone.cn
 */
@Controller
@RequestMapping("/wxapi")
public class WXApiController extends BaseController{

    @RequestMapping("/action")
    public String action(){
        return "action";
    }


    @RequestMapping("/oauth2_callback")
    public String oauth2Callback(){
        return "oauth2_callback";
    }

    @RequestMapping("/list")
    public String list(){
        return "goods/index";
    }
}
