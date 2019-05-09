package Facade_Pattern;

/**
 * @author hongfei.shen
 * @date 2019/03/26
 */
public class EncryptFacade extends AbstractEncryptFacade {
    @Override
    public void FileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = FileReader.read(fileNameSrc);
        String encryptStr = CipherMachine.encrypt(plainStr);
        FileWriter.writer(encryptStr, fileNameDes);
    }
}
