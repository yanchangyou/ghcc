package org.ghcc.toft.ware.core.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeMakeTool {

	public static void main(String[] args) throws IOException {
		String[] cop = new String[]{"Loader", "ID", "Entity", "Concept", "Builder", "Resource", "PathInfo", "Driver"};
		String[] saas = new String[]{"WareDocument", "Ware", "Function"};
		String path = "L:/ghcc/svn/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/design/design-0/design-0.2/projects/nucleus/nucleus-0/nucleus-0.1/org.ghcc.toft-ware.core.design-nucleus-0.1-0.2-0.1/java-code/org/ghcc/toft/ware/core/design/interfaces/mop";
		for (int j = 0; j < saas.length; j++) {
			for (int i = 0; i < cop.length; i++) {
				String fileName = saas[j] + cop[i];
				File parent = new File(path);
				parent.mkdirs();
				File file = new File(parent, fileName + ".java");
				file.createNewFile();
				PrintWriter write = new PrintWriter(file);
				
				write.write(
"package org.ghcc.toft.ware.core.design.interfaces.mop;\r\n" +
"\r\n" +
"import org.ghcc.toft.ware.core.design.interfaces.caas." + saas[j] + ";\r\n" +
"import org.ghcc.toft.ware.core.design.interfaces.eop." + cop[i] + ";\r\n" +
"\r\n" +
"public interface " + fileName + " extends " + saas[j] + ", " + cop[i] + " {\r\n\r\n}" +
"");
				write.flush();
				write.close();
				System.out.println(file);
			}
		}
	}
}
