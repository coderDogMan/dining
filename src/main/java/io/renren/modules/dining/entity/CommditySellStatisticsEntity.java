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
@TableName("commdity_sell_statistics")
public class CommditySellStatisticsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer commdityId;
	/**
	 * 
	 */
	private String commdityTitel;
	/**
	 * 
	 */
	private Integer quantity;
	/**
	 * 
	 */
	private Integer tatal;
	/**
	 * 
	 */
	private String mainCompany;
	/**
	 * 
	 */
	private String subCompany;
	/**
	 * 
	 */
	private Integer year;
	/**
	 * 
	 */
	private Integer month;
	/**
	 * 
	 */
	private Integer sellStatus;
	/**
	 * 
	 */
	private String description;

}
