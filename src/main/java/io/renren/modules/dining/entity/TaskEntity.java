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
@TableName("task")
public class TaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer taskId;
	/**
	 * 
	 */
	private String taskContext;
	/**
	 * 
	 */
	private Integer taskTime;
	/**
	 * 0,,,1
	 */
	private Integer taskStatus;
	/**
	 * 
	 */
	private Integer updateTime;
	/**
	 * 
	 */
	private String company;

}
