package fire.entity;

import java.io.Serializable;

/**
 * 用户 用户类
 */
public class User implements Serializable {

	/**
	 * 登录名
	 * 
	 */
	private String loginName;

	/**
	 * 密码
	 * 
	 */
	private String pswd;

	/**
	 * 权限字段
	 * 每一位表示一种权限
	 */
	private String rightContent="0101000000";


	/**
	 * 
	 */
	private static final long serialVersionUID = 8538631258084019523L;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getRightContent() {
		return rightContent;
	}

	public void setRightContent(String rightContent) {
		this.rightContent = rightContent;
	}

}