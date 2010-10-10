package org.ghcc.toft.ware.manager;

import java.net.URL;

import org.ghcc.toft.ware.manager.create.ware.project.CreateWareProject;
import org.ghcc.toft.ware.manager.drop.ware.project.DropWareProject;

public class Manager {

	public static void main(String[] args) throws Exception {
		String wareID = "org.ghcc-toft.ware.core-ether-1-1-1";
		URL wareRootPath = new URL("file://L:/ghcc/svn");
		Ware ware = new Ware(wareRootPath, wareID);
		Manager manager = new Manager();
		manager.manage(ware, new DropWareProject());
		manager.manage(ware, new CreateWareProject());
	}
	
	/**
	 * 管理 ware, 并且制定如何管理
	 * @param ware
	 * @param handler
	 * @throws Exception 
	 */
	public void manage(Ware ware, WareHandler handler) throws Exception {
		handler.handle(ware);
	}
}
