package com.kedu.user;

import com.kedu.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    public int joinUser(UserEntity entity){
        int result = 0;
        try {
            result = mapper.joinUser(entity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public int loginUser(UserEntity entity){
        try {
            mapper.loginUser(entity);
            UserEntity entity1 = mapper.loginUser(entity);
            if ((entity1.getUpw().equals(entity.getUpw()))){
                return 1;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
