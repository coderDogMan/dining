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
@TableName("orders")
public class OrdersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer orderId;
	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String payType;
	/**
	 * 
	 */
	private String isPaid;
	/**
	 * 
	 */
	private String payMethond;
	/**
	 * 
	 */
	private String orderType;
	/**
	 * 
	 */
	private String linkedNumber;
	/**
	 * 
	 */
	private Double orderAllMoney;
	/**
	 * 
	 */
	private Double orderPayMoney;
	/**
	 * 
	 */
	private String orderStatus;
	/**
	 * 
	 */
	private Long createTime;
	/**
	 * 
	 */
	private Long endTime;
	/**
	 * 
	 */
	private Integer payUserNumber;
	/**
	 * 
	 */
	private Integer staffNumber;
	/**
	 * 
	 */
	private Integer phone;
	/**
	 * 
	 */
	private String address;
	/**
	 * 
	 */
	private String description;

}
