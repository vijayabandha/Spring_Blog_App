package com.Damera.entity;

import java.time.LocalDate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "blogs")

public class BlogsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer blogId;
	private String blogTitle;
	private String shortDesp;
	private String status;
	
	@Lob
	private String content;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	
	
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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

	/**
	 * @return the createdDate
	 */
	public LocalDate getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the updatedDate
	 */
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * @return the user
	 */
	public UserDtlsEntity getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserDtlsEntity user) {
		this.user = user;
	}

	/**
	 * @return the lstOfComments
	 */
	public List<CommentsEntity> getLstOfComments() {
		return lstOfComments;
	}

	/**
	 * @param lstOfComments the lstOfComments to set
	 */
	public void setLstOfComments(List<CommentsEntity> lstOfComments) {
		this.lstOfComments = lstOfComments;
	}

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserDtlsEntity user;
	
	@OneToMany(cascade = {CascadeType.REMOVE ,CascadeType.PERSIST},fetch = FetchType.EAGER,mappedBy = "blog")
	private List<CommentsEntity> lstOfComments;

	
	
}
