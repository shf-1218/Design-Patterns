package utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author hongfei.shen
 * @date 2019/03/27
 */
public class XMLUtil {
    public static String getNodeName(String tagName) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config.xml"));

            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName(tagName);
            Node classNode = nl.item(0).getFirstChild();
            String nodeName = classNode.getNodeValue().trim();
            return nodeName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(String tagName) {
        try {
            //通过类名生成实例对象并将其返回
            Class c = Class.forName(getNodeName(tagName));
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
