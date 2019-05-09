package Prototype_Pattern.example;


import java.util.HashMap;
import java.util.Map;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 */
public class PrototypeManager {

    /**
     * 用来记录原型的编号和原型实例的对应关系
     */
    private static Map<String, Resume> map = new HashMap<String,Resume>();

    /**
     * 私有化构造方法，避免外部创建实例
     */
    private PrototypeManager(){}
    /**
     * 向原型管理器里面添加或是修改某个原型注册
     * @param ResumeId 原型编号
     * @param Resume    原型实例
     */
    public synchronized static void setResume(String ResumeId , Resume Resume){
        map.put(ResumeId, Resume);
    }
    /**
     * 从原型管理器里面删除某个原型注册
     * @param ResumeId 原型编号
     */
    public synchronized static void removeResume(String ResumeId){
        map.remove(ResumeId);
    }
    /**
     * 获取某个原型编号对应的原型实例
     * @param ResumeId    原型编号
     * @return    原型编号对应的原型实例
     * @throws Exception    如果原型编号对应的实例不存在，则抛出异常
     */
    public synchronized static Resume getResume(String ResumeId) throws Exception{
        Resume Resume = map.get(ResumeId);
        if(Resume == null){
            throw new Exception("您希望获取的原型还没有注册或已被销毁");
        }
        return Resume;
    }
}
