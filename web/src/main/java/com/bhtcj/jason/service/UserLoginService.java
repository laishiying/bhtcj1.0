package com.bhtcj.jason.service;

import com.bhtcj.jason.entity.WpUser;
import com.bhtcj.jason.mapper.WpUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by HX0010080 on 2018/5/22 0022.
 */
@Service
public class UserLoginService {

    public UserLoginService(){
        System.out.println("UserLoginService---------------------------------------------------");
    }
    @Autowired
    public WpUserMapper wpUserMapper;


    public List<WpUser> userLogin(String  workNumber, String userPassword){
        HashMap<String ,String> map = new HashMap<String ,String>();
        map.put("workNumber",workNumber);
        map.put("userPassword",userPassword);
        try{
            return wpUserMapper.loginUser(map);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
