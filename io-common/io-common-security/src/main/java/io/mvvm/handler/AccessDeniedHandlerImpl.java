package io.mvvm.handler;

import com.alibaba.fastjson.JSON;
import io.mvvm.constant.SecurityConstant;
import io.mvvm.entity.Ret;
import io.mvvm.enums.RetTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: io-admin
 * @description: 认证用户无权限处理器
 * @author: Mr. Pan
 * @create: 2021-06-02 19:59
 **/
@Slf4j
@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException {
        log.warn(e.getMessage());
        httpServletResponse.setContentType(SecurityConstant.CONTENT_TYPE_JSON_UTF8);
        httpServletResponse.getWriter().write(JSON.toJSONString(Ret.type(RetTypeEnum.NO_PERMISSION)));
    }
}
