package io.renren.modules.dining.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-18 00:23:28
 */
@Data
@TableName("employee")
public class EmployeeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String userName;
	/**
	 * 
	 */
	private String userCode;
	/**
	 * 
	 */
	private Integer postId;
	/**
	 * 
	 */
	private String address;
	/**
	 * 
	 */
	private String linkman;
	/**
	 * 
	 */
	private String linkmanPhone;
	/**
	 * 
	 */
	private String idNumber;
	/**
	 * 
	 */
	private Integer phone;
	/**
	 * 
	 */
	private Integer sex;
	/**
	 * 
	 */
	private String photo;
	/**
	 * 
	 */
	private Integer workStatus;
	/**
	 * 
	 */
	private Integer inductionDate;
	/**
	 * 
	 */
	private Integer leaveDate;
	/**
	 * 
	 */
	private String nation;
	/**
	 * 
	 */
	private String remarks;
	/**
	 * 
	 */
	private String orgId;
	/**
	 * 
	 */
	private String status;

}
