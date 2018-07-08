package com.example.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;


	@RequestMapping(value="/login",method=RequestMethod.GET)
	public Map<String,Object> login(@RequestParam String phone,@RequestParam String password) {
		Map<String, Object> map=new HashMap<String,Object>();
		List<User> listUser=new ArrayList<User>();
		User user=new User();
		System.out.println("phone:"+phone+"password:"+password);
//		user=userService.findUserByPhone(phone);
		listUser=userService.findListUserByPhone(phone);
		System.out.println("user:"+user);
		try {
			if(password.equals(listUser.get(0).getPassword())) {
				map.put("code", "0000");
				map.put("msg", "登陆成功");
			}else {
				map.put("code", "0001");
				map.put("msg", "登陆错误");
			}
		}
		catch (Exception e) {
			map.put("0002", "密码错误");
		}
		return map;
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public Map register(@RequestParam String phone,@RequestParam String password,@RequestParam String username,@RequestParam String name) {
		Map<String,Object> map=new HashMap<>();
		User user=new User();
		try {
			System.out.println("phone："+phone+" password:"+password);
			boolean flag=false;
			user.setUsername(username);
			user.setPassword(password);
			user.setPhone(phone);
			user.setName(name);
			user.setId(UUID.randomUUID().toString().trim().replace("-", ""));
			flag=userService.insertUser(user);
			if(flag) {
				map.put("data", "0001");
				map.put("msg","注册成功");
			}else {
				map.put("data", "0001");
				map.put("msg","注册失败");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			map.put("msg","注册失败");
		}
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
