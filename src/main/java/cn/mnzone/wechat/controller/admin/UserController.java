package cn.mnzone.wechat.controller.admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
        logger.debug("list");

        return "admin/user/list";
    }

    @RequestMapping("/save")
    public String save(){
        logger.debug("save");
        return "admin/user/details";
    }

    @RequestMapping("/view")
    public String view(){
        logger.debug("view");
        return "admin/user/view";
    }
}
