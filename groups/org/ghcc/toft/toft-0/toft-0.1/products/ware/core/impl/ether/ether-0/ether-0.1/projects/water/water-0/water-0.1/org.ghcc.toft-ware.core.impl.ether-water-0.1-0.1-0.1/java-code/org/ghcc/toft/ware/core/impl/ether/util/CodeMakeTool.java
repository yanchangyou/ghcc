package org.ghcc.toft.ware.core.impl.ether.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeMakeTool {

	public static void main(String[] args) throws IOException {
		String[] cop = new String[]{"Concept", "Node", "Entity", "Driver"};
		String[] saas = new String[]{"WareDocument", "Ware", "Function", "Input", "Output"};
		String path = "L:/ghcc/svn/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/impl/ether/ether-0/ether-0.1/projects/water/water-0/water-0.1/org.ghcc.toft-ware.core.impl.ether-water-0.1-0.1-0.1/java-code/org/ghcc/toft/ware/core/impl/ether/defaults";
		String prefix = "Ether$Defaults";
		createCopPackage(prefix, cop, path);
		createCaasPackage(prefix, saas, path);
		createMatrixPackage(prefix, cop, saas, path);
		
		
	}
	private static void createCopPackage(String prifix, String[] cop, String path) throws IOException, FileNotFoundException {
		for (int i = 0; i < cop.length; i++) {
			String fileName = prifix + cop[i];
			File parent = new File(path + "/cop");
			parent.mkdirs();
			File file = new File(parent, fileName + ".java");
			file.createNewFile();
			PrintWriter write = new PrintWriter(file);
			
			write.write(
"package org.ghcc.toft.ware.core.impl.ether.defaults.cop;\r\n" +
"\r\n" +
"import org.ghcc.toft.ware.core.design.cop." + cop[i] + ";\r\n" +
"\r\n" +
"public interface " + fileName + " extends " + cop[i] + " {\r\n\r\n}" +
"");
			write.flush();
			write.close();
			System.out.println(file);
		}
	}
	private static void createCaasPackage(String prifix, String[] caas, String path) throws IOException, FileNotFoundException {
		for (int i = 0; i < caas.length; i++) {
			String fileName = prifix + caas[i];
			File parent = new File(path + "/caas");
			parent.mkdirs();
			File file = new File(parent, fileName + ".java");
			file.createNewFile();
			PrintWriter write = new PrintWriter(file);
			
			write.write(
"package org.ghcc.toft.ware.core.impl.ether.defaults.caas;\r\n" +
"\r\n" +
"import org.ghcc.toft.ware.core.design.caas." + caas[i] + ";\r\n" +
"\r\n" +
"public interface " + fileName + " extends " + caas[i] + " {\r\n\r\n}" +
"");
			write.flush();
			write.close();
			System.out.println(file);
		}
	}

	private static void createMatrixPackage(String prefix, String[] cop, String[] saas,
			String path) throws IOException, FileNotFoundException {
		for (int j = 0; j < saas.length; j++) {
			for (int i = 0; i < cop.length; i++) {
				String fileName = prefix + saas[j] + cop[i];
				File parent = new File(path + "/matrix");
				parent.mkdirs();
				File file = new File(parent, fileName + ".java");
				file.createNewFile();
				PrintWriter write = new PrintWriter(file);
				
				write.write(
"package org.ghcc.toft.ware.core.impl.ether.defaults.matrix;\r\n" +
"\r\n" +
"import org.ghcc.toft.ware.core.impl.ether.defaults.caas." + prefix + saas[j] + ";\r\n" +
"import org.ghcc.toft.ware.core.impl.ether.defaults.cop." + prefix + cop[i] + ";\r\n" +
"\r\n" +
"public class " + fileName + " implements " + prefix + saas[j] + ", " + prefix + cop[i] + " {\r\n\r\n}" +
"");
				write.flush();
				write.close();
				System.out.println(file);
			}
		}
	}
	
}
