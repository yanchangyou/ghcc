/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.online.apache.ant.util;

import java.util.HashMap;
import java.util.Map;

/**
 * ParamUtil
 * 
 * @author yanchangyou
 * @date 2010-11-22 上午12:30:15
 * @version 0.1-1-1
 * 
 */

public class ParamUtil {

	public static String PARAM_BEGIN = "${";
	public static String PARAM_END = "}";

	public static String getRealValueByParam(String value, Map<String, String> param) {
		
		StringBuffer realValue = new StringBuffer();

		int valueIndex = 0;
		int paramBeginIndex = value.indexOf(PARAM_BEGIN);
		int paramEndIndex = 0;
		while (paramBeginIndex != -1) {
			realValue.append(value.substring(valueIndex, paramBeginIndex));
			paramEndIndex = value.indexOf(PARAM_END, paramBeginIndex);
			String paramName = value.substring(paramBeginIndex+2, paramEndIndex);
			realValue.append(param.get(paramName));
			valueIndex = paramEndIndex + 1;
			paramBeginIndex = value.indexOf(PARAM_BEGIN, valueIndex);
		}
		realValue.append(value.substring(valueIndex));

		return realValue.toString();
	}

	public static void main(String[] args) {

		String value = "${src}/abc123/${dest}/abc";
		Map<String, String> param = new HashMap<String, String>();
		param.put("src", "xyz");
		param.put("dest", "789");
		System.out.println(ParamUtil.getRealValueByParam(value, param));
	}
}
