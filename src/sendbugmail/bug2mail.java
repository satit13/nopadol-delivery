package sendbugmail;


import org.zkoss.zk.ui.Executions;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.Div;

import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zul.*;
//--------------lib mail
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@SuppressWarnings("serial")
public class bug2mail extends SelectorComposer<Div>{
	@Wire
	Textbox txtSender;
	@Wire
	Textbox txtSMS;
	@Wire
	Button btnSend;
	@Wire
	Timer tm;

	
	@Listen("onClick=button#btnSend")
	public void sendMailBug(){
		
		///-----------------------------start mail  , chayarop@smartworks.in.th
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("it@nopadol.com","[vdw,jwfh");
					}
				});
		
		try {	
			String vMessage;
			String vSender;
			vMessage = txtSMS.getValue();
			vSender = txtSender.getValue();
		
			Message message = new MimeMessage(session);				
			message.setFrom(new InternetAddress("siravich@extensionsoft.biz"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("siravich@smartworks.in.th"));
			message.setSubject("E-mail Nopadol DO Bug by : "+vSender);
			message.setText(vMessage);
			Transport.send(message);			
			Executions.sendRedirect("/home.zul");
			
					    
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}	
	}
}
