package com.Damera.binding;

import lombok.Data;


public class CreateBlogForm {

	private Integer blogId;
	private String blogTitle;
	private String shortDesp;
	
	private String content;

	/**
	 * @return the blogId
	 */
	public Integer getBlogId() {
		return blogId;
	}

	/**
	 * @param blogId the blogId to set
	 */
	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	/**
	 * @return the blogTitle
	 */
	public String getBlogTitle() {
		return blogTitle;
	}

	/**
	 * @param blogTitle the blogTitle to set
	 */
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	/**
	 * @return the shortDesp
	 */
	public String getShortDesp() {
		return shortDesp;
	}

	/**
	 * @param shortDesp the shortDesp to set
	 */
	public void setShortDesp(String shortDesp) {
		this.shortDesp = shortDesp;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
