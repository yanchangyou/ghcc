/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.util;

import java.io.File;

/**
 * FileTraver
 * 
 * @author yanchangyou
 * @date 2010-11-17 下午10:05:03
 * @version 0.1-1-1
 *
 */

/**
 * 遍历文件
 */
public class FileTraver {

	public static void trave(File file, FileDealer fileDealer) throws Exception {
		if (file.isFile()) {
			fileDealer.deal(file);
		} else {
			for (File subFile : file.listFiles()) {
				trave(subFile, fileDealer);
			}
		}
	}
}
