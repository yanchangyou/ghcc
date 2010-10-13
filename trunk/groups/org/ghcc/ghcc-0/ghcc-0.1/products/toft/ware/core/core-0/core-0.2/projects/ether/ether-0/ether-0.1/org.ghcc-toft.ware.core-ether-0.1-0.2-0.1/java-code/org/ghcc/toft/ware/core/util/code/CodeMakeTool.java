package org.ghcc.toft.ware.core.util.code;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeMakeTool {

	public static void main(String[] args) throws IOException {
		String[] cop = new String[]{"Concept", "Node", "Entity", "Driver"};
		String[] saas = new String[]{"WareDocument", "Ware", "Function", "Input", "Output"};
		String path = "L:/ghcc/svn/groups/org/ghcc/ghcc-0/ghcc-0.1/products/toft/ware/core/core-0/core-0.2/projects/ether/ether-0/ether-0.1/org.ghcc-toft.ware.core-ether-0.1-0.2-0.1/java-code/org/ghcc/toft/ware/core/design/matrix";
		for (int j = 0; j < saas.length; j++) {
			for (int i = 0; i < cop.length; i++) {
				String fileName = saas[j] + cop[i];
				File parent = new File(path);
				parent.mkdirs();
				File file = new File(parent, fileName + ".java");
				file.createNewFile();
				PrintWriter write = new PrintWriter(file);
				
				write.write(
"package org.ghcc.toft.ware.core.design.matrix;\r\n" +
"\r\n" +
"import org.ghcc.toft.ware.core.design.caas." + saas[j] + ";\r\n" +
"import org.ghcc.toft.ware.core.design.cop." + cop[i] + ";\r\n" +
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
