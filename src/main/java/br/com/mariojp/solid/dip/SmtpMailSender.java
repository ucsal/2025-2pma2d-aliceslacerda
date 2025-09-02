package br.com.mariojp.solid.dip;

public class SmtpMailSender implements MailSender{

    private final SmtpClient client = new SmtpClient();

    @Override
    public void send(String from, String to, String body){
    client.send(from, to, body);
    }

}
