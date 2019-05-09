package Prototype_Pattern.example;

/**
 * @author hongfei.shen
 * @date 2019/03/19
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Resume resume = new Resume("HongFei");
        resume.setPersonInfo("2.16", "男", "XX大学");
        resume.setWorkExperience("2012", "XX公司");
        resume.display();
        System.out.println("-------------------------------");
        PrototypeManager.setResume("r1", resume);
        Resume newResume = (Resume) PrototypeManager.getResume("r1").clone();
        newResume.display();
    }
}
