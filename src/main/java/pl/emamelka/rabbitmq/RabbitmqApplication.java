package pl.emamelka.rabbitmq;

import pl.emamelka.rabbitmq.service.Receiver;
import pl.emamelka.rabbitmq.service.Sender;

public class RabbitmqApplication {

    public static void main(String[] args) throws Exception {

        Sender sender = new Sender();
        sender.createConnection();

        Receiver receiver = new Receiver();
        receiver.receiveConnection();
    }

}

