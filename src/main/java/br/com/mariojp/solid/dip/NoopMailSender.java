package br.com.mariojp.solid.dip;

public class NoopMailSender implements MailSender{
    
    @Override
    public void send(String from, String to, String body){
        System.out.println("[DRY_RUN] Email não enviado " + body +" de "+ from + " para "+ to );
    }

}
