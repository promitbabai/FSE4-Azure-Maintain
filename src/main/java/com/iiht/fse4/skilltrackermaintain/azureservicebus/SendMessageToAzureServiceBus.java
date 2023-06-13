/**
 * 
 */
package com.iiht.fse4.skilltrackermaintain.azureservicebus;

import java.util.ArrayList;
import java.util.List;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;
import com.iiht.fse4.skilltrackermaintain.model.Profile;

/**
 * @author Promit Majumder
 *
 */
public class SendMessageToAzureServiceBus {
	
	public String CONN_STR = "Endpoint=sb://skill-tracker-service-bus.servicebus.windows.net/;SharedAccessKeyName=queue-policy;SharedAccessKey=qGTrNdBJeXrW08C27eninGOb2Hjq4pp9M+ASbDG6VVs=;EntityPath=update-record-in-search-queue";
    
	public String QUEUE_NAME = "update-record-in-search-queue";
	
	public void sendMessage(String mongoOpsCode, Profile profile) {
		 	System.out.println("SendMessageToAzureServiceBus - sendMessage()");
	    	List <ServiceBusMessage> listofMessages = new ArrayList<ServiceBusMessage>();
	    	listofMessages.add(new ServiceBusMessage("Second message from Spring Boot"));

	        System.out.println("########### sendMessageInAzureServiceBus() Method ");
	        java.lang.Iterable<com.azure.messaging.servicebus.ServiceBusMessage> iterableMessages = listofMessages;
			

	        ServiceBusSenderClient sender = new ServiceBusClientBuilder()
	                .connectionString(CONN_STR)
	                .sender()
	                .queueName(QUEUE_NAME)
	                .buildClient();

	        sender.sendMessages(iterableMessages);
	        System.out.println("Sent a single message to the queue: " + QUEUE_NAME);


	    }

	 
}
