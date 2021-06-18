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
@TableName("wechat_user")
public class WechatUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String wechatNumber;
	/**
	 * 
	 */
	private Integer phone;
	/**
	 * 
	 */
	private String wechatName;
	/**
	 * 
	 */
	private String wechatAvatarUrl;
	/**
	 * 
	 */
	private Integer sex;
	/**
	 * 
	 */
	private String country;
	/**
	 * 
	 */
	private String province;
	/**
	 * 
	 */
	private String city;
	/**
	 * 
	 */
	private Integer userAttentionTime;

}
