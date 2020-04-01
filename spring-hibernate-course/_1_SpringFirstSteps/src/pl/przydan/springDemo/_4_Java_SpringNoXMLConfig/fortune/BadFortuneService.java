package pl.przydan.springDemo._4_Java_SpringNoXMLConfig.fortune;

public class BadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "It is your bad day... :'( ";
    }
}
