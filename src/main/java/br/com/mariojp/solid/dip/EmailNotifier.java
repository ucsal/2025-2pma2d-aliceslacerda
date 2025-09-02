package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final MailSender mailSender;

	public EmailNotifier(MailSender mailSender){
			this.mailSender =  mailSender;
						
		}
	

	public void welcome(User user){
		String from = "no-reply@acme.com";
		String to = user.getEmail();
		String body = "Bem-vindo(a), " + user.getName() + "!";
		mailSender.send(from, to, body);

	}
	}

