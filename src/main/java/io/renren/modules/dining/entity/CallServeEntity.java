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
@TableName("call_serve")
public class CallServeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String wechatNumber;
	/**
	 * 
	 */
	private String serveContext;
	/**
	 * 0等待，1处理
	 */
	private Integer serveStatus;
	/**
	 * 
	 */
	private Integer serveStartTime;
	/**
	 * 
	 */
	private Integer serveEndTime;
	/**
	 * 
	 */
	private Integer phone;
	/**
	 * 
	 */
	private String department;

}
