package fire.controller.util;

import java.io.Serializable;

public class AjaxResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean result;
	
	private String code;
	
	private Integer id;
	
	private String errorMessage;
	
	private String toURL;
	
	public void success(String toURL) {
		this.result = true;
		this.toURL = toURL;
	}

	public void fail(String errorMessage) {
		this.result = false;
		this.errorMessage = errorMessage;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getToURL() {
		return toURL;
	}

	public void setToURL(String toURL) {
		this.toURL = toURL;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
