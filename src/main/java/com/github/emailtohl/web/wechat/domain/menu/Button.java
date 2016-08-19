package com.github.emailtohl.web.wechat.domain.menu;

import java.io.Serializable;
/**
 * 微信菜单按钮
 * 
 * @author HeLei
 */
public class Button implements Serializable {
	private static final long serialVersionUID = 9067211269878232969L;
	protected String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
