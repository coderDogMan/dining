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
@TableName("table_used_log")
public class TableUsedLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String isUsed;
	/**
	 * 
	 */
	private String reservePhone;
	/**
	 * 
	 */
	private String wecharNumber;
	/**
	 * 
	 */
	private Long reserveStartTime;
	/**
	 * 
	 */
	private Long reserveEndTime;
	/**
	 * 
	 */
	private String description;

}
