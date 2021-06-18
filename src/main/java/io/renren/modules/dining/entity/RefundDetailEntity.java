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
@TableName("refund_detail")
public class RefundDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String wechatNumber;
	/**
	 * 
	 */
	private String refundOrderId;
	/**
	 * 
	 */
	private String commdityName;
	/**
	 * 
	 */
	private Integer refundMoney;
	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private Integer refundTime;
	/**
	 * 
	 */
	private Integer userId;
	/**
	 * 
	 */
	private String commdityBrand;
	/**
	 * 
	 */
	private String description;

}
