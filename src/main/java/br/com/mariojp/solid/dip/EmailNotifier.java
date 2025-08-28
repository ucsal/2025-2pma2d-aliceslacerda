package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final MailSender mailSender;

	public EmailNotifier(){
		if ("true".equalsIgnoreCase(System.getenv("DRY_RUN"))) {
			this.mailSender = new NoopMailSender();
		}else{
			this.mailSender = new SmtpMailSender();
						
		}
	}
	

	public void welcome(User user){
		String subject = "Bem-vindo!";
		String body = "Olá" + user.getName()+ ", seja bm-vindo!";
		mailSender.send(user.getEmail(), subject, body);
	}
}
