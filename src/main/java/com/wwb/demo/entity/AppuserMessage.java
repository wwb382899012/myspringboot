package com.wwb.demo.entity;

import javax.persistence.*;

@Table(name = "appuser_message")
public class AppuserMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String message;

    private Integer sendtime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return sendtime
     */
    public Integer getSendtime() {
        return sendtime;
    }

    /**
     * @param sendtime
     */
    public void setSendtime(Integer sendtime) {
        this.sendtime = sendtime;
    }
}