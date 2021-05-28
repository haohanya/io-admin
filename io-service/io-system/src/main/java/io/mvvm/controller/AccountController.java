package io.mvvm.controller;

import io.mvvm.common.controller.BaseController;
import io.mvvm.entity.Ret;
import io.mvvm.entity.domain.AccountTab;
import io.mvvm.service.IAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: io-admin
 * @description: UserAccountController
 * @author: Mr. Pan
 * @create: 2021-05-23 21:07
 **/
@Slf4j
@RestController
@RequestMapping("/user/account")
public class AccountController extends BaseController {

    @Resource
    private IAccountService accountService;

    @GetMapping("/get/{id}")
    public Ret getAccountById(@PathVariable String id) {
        AccountTab account = accountService.getById(id);
        return Ret.okData(account);
    }

    @GetMapping("/get/list")
    public Ret getAccountList() {
        List<AccountTab> accountList = accountService.list();
        return Ret.okData(accountList);
    }
}
