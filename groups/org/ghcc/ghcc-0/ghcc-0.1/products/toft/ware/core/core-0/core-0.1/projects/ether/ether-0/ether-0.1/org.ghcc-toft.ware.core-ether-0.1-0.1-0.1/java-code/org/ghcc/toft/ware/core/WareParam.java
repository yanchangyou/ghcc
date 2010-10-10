package org.ghcc.toft.ware.core;

import java.util.HashMap;
import java.util.Map;

public class WareParam {
	
	private String param;
	
	private String warePath;

	private Map<String, String> wareParam;

	public String getWarePath() {
		return warePath;
	}

	public void setWarePath(String warePath) {
		this.warePath = warePath;
	}

	public Map<String, String> getWareParam() {
		return wareParam;
	}

	public void setWareParam(Map<String, String> wareParam) {
		this.wareParam = wareParam;
	}

	public WareParam(String param) {
		this.param = param;
		if (this.param == null) {
			throw new NullPointerException("WareParam 不能为空");
		}
		int indexOfQuestionMark = this.param.indexOf('?');
		if (indexOfQuestionMark == -1) {
			warePath = this.param;
		} else {
			warePath = this.param.substring(0, indexOfQuestionMark);
			wareParam = parsingParam(this.param.substring(indexOfQuestionMark+1));
		}
	}

	/**
	 * 解析参数成map
	 * 
	 * @param paramString
	 * @return
	 */
	public static Map<String, String> parsingParam(String paramString) {
		Map<String, String> paramMap = new HashMap<String, String>();

		if (paramString != null) {
			String[] params = paramString.split("\\&");
			for (int i = 0; i < params.length; i++) {
				// 忽略不规范的参数
				if (params[i].indexOf('=') != -1 // 存在等号
						&& !params[i].startsWith("=") // 并且不能以等号开头
						&& !params[i].endsWith("=") // 并且不能以等号结尾
				) {
					String[] nameValues = params[i].split("=");
					paramMap.put(nameValues[0], nameValues[1]);
				}
			}
		}

		return paramMap;
	}
	public String toString() {
		return this.param;
	}
}