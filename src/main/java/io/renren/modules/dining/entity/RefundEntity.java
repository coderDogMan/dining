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
 * @date 2021-06-18 00:23:27
 */
@Data
@TableName("refund")
public class RefundEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private Integer orderId;
	/**
	 * 
	 */
	private Integer refundMoney;
	/**
	 * 
	 */
	private Integer refundStatus;
	/**
	 * 
	 */
	private Integer checkStatus;
	/**
	 * 
	 */
	private Integer isMade;
	/**
	 * 
	 */
	private Integer payMethod;
	/**
	 * 
	 */
	private Integer refundTime;
	/**
	 * 
	 */
	private String refundInfo;
	/**
	 * 
	 */
	private Integer userId;
	/**
	 * 
	 */
	private String description;

}
