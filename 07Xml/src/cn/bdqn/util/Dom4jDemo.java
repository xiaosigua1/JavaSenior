package cn.bdqn.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4jDemo {
	/**
	 * 
	 * 01.整个xml文件是一个倒挂的DOM树
	 * 02.我们想遍历xml文件中所有的属性内容
	 * 03.找到文件   找到文件的根节点
	 * 04.在根节点的基础之上 进行遍历
	 * 
	 * 
	 * 任务 ：
	 * 
	 *   实现xml文件中 节点的   增删 改查
	 * 
	 * 01.这4个功能都需要找到文件和根节点
	 * 02.都需要dom
	 * 03.都需要根节点
	 * 04.我们就把需要的 dom 和根节点 定义成 成员变量
	 */

	static Document document = null; // 倒挂的DOM树
	static Element root = null; // 根节点

	public static void main(String[] args) {
		getDocument(); // 加载dom树 获取根节点
		// 新增节点insertByXml();
		// 删除节点deleteByXml();
		// 修改
		updateByXml();

		listByXml(); // 遍历所有节点属性
	}

	/**
	 * 解析xml文件   是把xml文件中的内容读到内存中   输入流
	 * 01.找文件
	 * 02.根据dom树到根节点
	 */
	public static void getDocument() {
		SAXReader reader = new SAXReader(); // 创建解析器
		try {
			document = reader.read("src/MySchool.xml"); // 把文件中所有的内容读取到了dom树
			root = document.getRootElement(); // 获取根节点
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询xml文件中所有的内容
	 */
	public static void listByXml() {
		// 根据根节点 遍历所有的子节点
		Iterator eClass = root.elementIterator();
		while (eClass.hasNext()) { // 遍历 class 节点
			Element className = (Element) eClass.next();
			System.out.println("年级的名称是：" + className.attributeValue("name"));
			System.out
					.println("年级的位置是：" + className.attributeValue("location"));
			System.out
					.println("===================================================");
			Iterator eStudent = className.elementIterator();
			while (eStudent.hasNext()) { // 遍历 student节点
				Element studentName = (Element) eStudent.next();
				System.out.println("学生的名称是："
						+ studentName.attributeValue("name"));
				System.out.println("学生的年龄是："
						+ studentName.attributeValue("age"));
				// 输出文本的属性值
				if (!studentName.getTextTrim().equals("")) {
					System.out.println("学生在做的事情：" + studentName.getTextTrim());
				}
			}
		}
	}

	/**
	 * 新增xml文件的内容
	 */
	public static void insertByXml() {
		// 在内存中创建需要的节点
		Element classElement = root.addElement("class");
		// 给class节点增加属性
		classElement.addAttribute("name", "研四");
		classElement.addAttribute("location", "四楼");
		// 以上的结果是 <class name="研四" location="四楼"></class> 在内存中
		// 给class增加子节点
		Element studentElement = classElement.addElement("student");
		studentElement.addAttribute("name", "小屁孩");
		studentElement.addAttribute("age", "80");
		/**
		 * 以上的结果在内存中是 
		 * <class name="研四" location="四楼">
		 *    <student name="小屁孩"  age="80"> </student>
		 *  </class> 
		 *  
		 *  仅限于在内存中  并没有保存到 xml文件中
		 */
		saveXml();

	}

	/**
	 * 在内存中的数据 持久化到 xml文件中
	 */
	private static void saveXml() {
		XMLWriter writer = null;
		OutputFormat format = null;
		try {
			format = OutputFormat.createPrettyPrint(); // 格式化我们新增的xml节点
			writer = new XMLWriter(new FileWriter("src/MySchool.xml"), format);
			writer.write(document);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * 删除xml文件的内容
	 */
	public static void deleteByXml() {

		// 根据根节点 遍历所有的子节点
		Iterator eClass = root.elementIterator();
		while (eClass.hasNext()) { // 循环找到需要删除的节点
			Element name = (Element) eClass.next();
			if (name.attributeValue("name").equals("研三")) {
				// 找到父节点 让父节点删除
				eClass.remove();
			}
		}
		saveXml(); // 持久化保存
	}

	/**
	 * 修改xml文件的内容
	 */
	public static void updateByXml() {

		// 根据根节点 遍历所有的子节点
		Iterator eClass = root.elementIterator();
		while (eClass.hasNext()) { // class
			Element name = (Element) eClass.next();
			Iterator studentElement = name.elementIterator();
			while (studentElement.hasNext()) { // student
				Element studentName = (Element) studentElement.next();
				if (studentName.attributeValue("name").equals("小屁孩")) {
					studentName.setAttributeValue("name", "老男孩");
				}
			}
		}
		saveXml(); // 持久化保存

	}

}
