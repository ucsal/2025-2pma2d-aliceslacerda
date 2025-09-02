package br.com.mariojp.solid.dip;

public class Main {
	public static void main(String[] args) {
		System.setProperty("DRY_RUN", "true"); 

		MailSender sender = MailSenderFactory.create();
		EmailNotifier notifier = new EmailNotifier(sender);

		User user = new User("Alice", "alice@doc.com");
       notifier.welcome(user);
		
		System.out.println("Email enviado!");
	}
}
