package org.ghcc.toft.project;

import java.net.URL;

import org.ghcc.toft.project.create.ware.project.CreateWareProject;
import org.ghcc.toft.project.drop.ware.project.DropWareProject;

public class Manager {

	public static CreateWareProject create = new CreateWareProject();
	public static DropWareProject drop = new DropWareProject();
	
	public static void main(String[] args) throws Exception {
		String wareID = "org.ghcc.toft.project-0.5-seeder";
		URL wareRootPath = new URL("file://L:/ghcc/ghcc/GHCC-1/svn");
		WareID ware = new WareID(wareRootPath, wareID);
		Manager manager = new Manager();
//		manager.manage(ware, drop);
		manager.manage(ware, create);
	}
	
	/**
	 * 管理 ware, 并且制定如何管理
	 * @param ware
	 * @param handler
	 * @throws Exception 
	 */
	public void manage(WareID ware, WareHandler handler) throws Exception {
		handler.handle(ware);
	}
}
