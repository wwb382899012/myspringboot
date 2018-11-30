package com.wwb.demo.entity;

public class AppMessage {
		private Integer id;
		private String message;
		private Integer sendtime;
		
		
		public AppMessage() {
			
		}
		
		public AppMessage(Integer id, String message, Integer sendtime) {
			this.id = id;
			this.message = message;
			this.sendtime = sendtime;
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
