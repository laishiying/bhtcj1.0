package com.bhtcj.jason.controller;

import com.bhtcj.jason.entity.WpUser;
import com.bhtcj.jason.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by HX0010080 on 2018/5/22 0022.
 */
@Controller
public class UserLoginController {

    public UserLoginController(){
        System.out.println("UserLoginController--------------------------------------------------------------");
    }

    @Autowired
    public UserLoginService userLoginService;


    /**
     * 登陆功能
     * */
    @RequestMapping("/login")
    public String login(@RequestParam(name="workNumber")String workNumber,@RequestParam(name="userPassword")String userPassword,HttpSession session,ModelMap modelMap){
        String userIdC = null;
        session.setAttribute("workNumber",workNumber);
        session.setAttribute("userPassword",userPassword);
        System.out.println(workNumber+userPassword);
        //判断登陆界面的文本框是否为空
        if(session.getAttribute("workNumber")!=null&&session.getAttribute("workNumber")!=""&&session.getAttribute("userPassword")!=null&&session.getAttribute("userPassword")!=""){
            List<WpUser> userLogin = userLoginService.userLogin(workNumber,userPassword);
            session.setAttribute("userLogin",userLogin);
            if(userLogin != null){
                //保存登陆用户对象
//                for(WpUser u : userLogin){
//                    session.setAttribute("User",u);
//                    session.setAttribute("sesseionUserName",u.getUserName());
//                    userIdC = u.getUserId().toString();
//                }
//                List<Module> menuList = menu(userIdC);
//                modelMap.put("menuList",menuList);
                //成功登陆返回首页
                return "shouye";
            }else {
                //失败登陆返回登陆页1
                return "../rear1";
            }
        }else
            //失败登陆返回登陆页1
            return "../rear1";
    }

    /**
     * 退出系统
     * */
//    @RequestMapping("/leftthe")
//    public String leftthe(HttpSession session){
//        session.setAttribute("userId",null);
//        session.setAttribute("userPassword", null);
//        System.out.println("leftthe");
//        return "../index.jsp";
//    }


//    /**
//     * 主菜单的展示功能
//     * */
//    public List<Module> menu(String userIdC){
//        //userIdC是调取登陆时候的用户id
//        List<Module> modules=moduleImlpService.menu(userIdC);
//        return modules;
//    }
}
