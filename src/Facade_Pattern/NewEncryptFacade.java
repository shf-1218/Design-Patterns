package Facade_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/26
 * 具体加密外观类
 */
public class NewEncryptFacade extends AbstractEncryptFacade {
    @Override
    public void FileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = FileReader.read(fileNameSrc);
        String encryptStr = NewCipherMachine.encrypt(plainStr);
        FileWriter.writer(encryptStr, fileNameDes);
    }
}
