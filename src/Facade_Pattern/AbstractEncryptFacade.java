package Facade_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/26
 * 抽象外观类
 */
public abstract class AbstractEncryptFacade {

    public abstract void FileEncrypt(String fileNameSrc, String fileNameDes);
}
