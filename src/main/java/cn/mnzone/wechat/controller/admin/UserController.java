package cn.mnzone.wechat.controller.admin;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ray on 16/5/11.
 * Email: zyr.wxl@gmail.com
 * Site: http://www.mnzone.cn
 */
@Controller
@RequestMapping("/admin/user")
public class UserController{

    static final Logger logger = LogManager.getLogger(UserController.class.getName());

    @RequestMapping("/list")
    public String list(){
        return "admin/user/list";
    }

    @RequestMapping("/save")
    public String save(){
        System.out.println("save...");
        return "admin/user/details";
    }

    @RequestMapping("/view")
    public String view(){
        System.out.println("aaaa");
        Logger log = LogManager.getLogger(UserController.class);
        log.debug("view");
        //logger.debug("UserController/view");
        return "admin/user/view";
    }
}
