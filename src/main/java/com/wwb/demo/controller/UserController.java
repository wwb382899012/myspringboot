package com.wwb.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.wwb.demo.common.RestException;
import com.wwb.demo.common.ResultCodeEnum;
import com.wwb.demo.dto.UserListDto;
import com.wwb.demo.dto.resp.RespUserListDto;
import com.wwb.demo.entity.User;
import com.wwb.demo.json.RespJson;
import com.wwb.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

	@Autowired
	private UserService userService;
	
	/**
	 * 分页：显示 
	 * @param userListDto
	 * @return Page对象
	 */
	@RequestMapping("/list")
	@ResponseBody
	public RespJson list(@RequestBody @Validated UserListDto userListDto){
		
		try {
			
			if(userListDto==null){
				userListDto = new UserListDto();
			}
			
			RespUserListDto respUserListDto= new RespUserListDto();
			Page<User> page = userService.listPage(userListDto, userListDto.getPage(), userListDto.getPageSize());
			
			List<RespUserListDto.UserItem> userItems = new ArrayList<RespUserListDto.UserItem>();
			for(User user:page.getResult()){
				RespUserListDto.UserItem  userItem = new RespUserListDto.UserItem();
				userItem.setId(user.getId());
				userItem.setName(user.getName());
				userItem.setPwd(user.getName());
				userItem.setAge(user.getAge());
				userItems.add(userItem);
			}
			
			respUserListDto.setData(userItems);
			respUserListDto.setPage(page.getPageNum());
			respUserListDto.setPageSize(page.getPageSize());
			respUserListDto.setTotalPages(page.getPages());
			respUserListDto.setTotalRows((int)page.getTotal());
			
			return RespJson.success(respUserListDto);
			
		} catch (Exception e) {
			// TODO: handle exception
			 logger.error("异常:{}", e.getMessage());
	         throw new RestException(ResultCodeEnum.FAIL);
		}
	}
	
	/**
	 * 分页
	 * @param userListDto
	 * @return  List
	 */
	@RequestMapping("/list2")
	@ResponseBody
	public RespJson list2(@RequestBody @Validated UserListDto userListDto){
		
		try {
			if(userListDto==null){
				userListDto = new UserListDto();
			}
			
			RespUserListDto respUserListDto= new RespUserListDto();
			List<User> list = userService.listPage2(userListDto, 1, 10);
			
			return RespJson.success(list);
			
		} catch (Exception e) {
			// TODO: handle exception
			 logger.error("异常:{}", e.getMessage());
	         throw new RestException(ResultCodeEnum.FAIL);
		}
	}
	
	@RequestMapping("/index")
	public String index(){
		return "user/index";
	}
}
