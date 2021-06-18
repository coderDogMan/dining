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
@TableName("dining_table")
public class DiningTableEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String tableName;
	/**
	 * 
	 */
	private String tableUrl;
	/**
	 * 
	 */
	private String imgAddress;
	/**
	 * 
	 */
	private String isUsed;
	/**
	 * 
	 */
	private String isJoinedTable;
	/**
	 * 
	 */
	private String description;

}
