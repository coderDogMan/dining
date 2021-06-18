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
@TableName("order_detail")
public class OrderDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer commdityId;
	/**
	 * 
	 */
	private Integer orderId;
	/**
	 * 
	 */
	private Integer tableId;
	/**
	 * 
	 */
	private Integer quantity;
	/**
	 * 
	 */
	private Integer price;
	/**
	 * 
	 */
	private Integer total;
	/**
	 * 
	 */
	private String commdityImgUrl;
	/**
	 * 
	 */
	private String description;

}
