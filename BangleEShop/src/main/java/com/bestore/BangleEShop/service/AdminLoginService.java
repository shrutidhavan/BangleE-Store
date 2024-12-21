package com.bestore.BangleEShop.service;

import java.util.List;

import com.bestore.BangleEShop.model.AdminLogin;

public interface AdminLoginService {
List<AdminLogin> login(String email,String password);
}
