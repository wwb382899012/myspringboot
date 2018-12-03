package com.wwb.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wwb.demo.entity.Person;

@RestController
@RequestMapping("/db")
public class DbController {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 查询person表的所有数据: http://localhost:8080/db/getPersons
	 * @return
	 */
	@RequestMapping("/getPersons")
    public List<Map<String, Object>> getDbType(){
        String sql = "select * from person";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Entry<String, Object>> entries = map.entrySet( );
                if(entries != null) {
                    Iterator<Entry<String, Object>> iterator = entries.iterator( );
                    while(iterator.hasNext( )) {
                    Entry<String, Object> entry =(Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list; //返回数据

    }
	/**
	 * 人员详情：http://localhost:8080/db/person/2
	 */
	@RequestMapping("/person/{id}")
    public Map<String,Object> getUser(@PathVariable String id){
        Map<String,Object> map = null;
        
        List<Map<String, Object>> list = getDbType();
        
        for (Map<String, Object> dbmap : list) {
            
            Set<String> set = dbmap.keySet();
            
            for (String key : set) {
                if(key.equals("id")){    
                    if(dbmap.get(key).equals(id)){
                        map = dbmap;
                    }
                }
            }
        }
        
        if(map==null)
            map = list.get(0);
        return map;
    }
	
	
	@RequestMapping("result")
	public String result() {
		return "db/index";
	}
	
	/**
	 * 测试
	 * @return
	 */
	@RequestMapping("/getPersons2")
    public List<String> list(){
      
		List<String> persons = new ArrayList<>();
		persons.add("wwb");
		return persons;
    }
	
}
