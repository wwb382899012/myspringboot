package com.wwb.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class AppMessage {
		private Integer id;
		private String message;
		@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a",timezone="GMT+8",locale="zh")
		private Integer sendtime;
		@JsonIgnore
		private Integer createId;
		
		
		public AppMessage() {
			
		}
		
		public AppMessage(Integer id, String message, Integer sendtime, Integer createId) {
			this.id = id;
			this.message = message;
			this.sendtime = sendtime;
			this.createId = createId;
		}
		
		
		public Integer getCreateId() {
			return createId;
		}

		public void setCreateId(Integer createId) {
			this.createId = createId;
		}

		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public Integer getSendtime() {
			return sendtime;
		}
		public void setSendtime(Integer sendtime) {
			this.sendtime = sendtime;
		}
		
		
}
