package com.example.functions.operations.funcs;

import com.example.functions.dto.UserDTO;
import com.example.functions.dto.UserInfoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * @author : mohammad
 * @since : 10/15/2021 6:36 PM , Fri
 * functions
 **/
@Component("user-info")
public class UserInfo implements Function<Message<UserDTO>, UserInfoDTO>
{
    private final Logger logger = LoggerFactory.getLogger(UserInfo.class);

    @Override
    public UserInfoDTO apply(Message<UserDTO> message)
    {
        logger.info(message.getPayload().toString());
        return new UserInfoDTO().setUsername(message.getPayload().getUsername()).setName("John").setAge(37);
    }
}
