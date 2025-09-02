package br.com.mariojp.solid.dip;

public class MailSenderFactory {

    public static MailSender create(){
        if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))){
        return new NoopMailSender();

        }
        return new NoopMailSender();
    }

}
