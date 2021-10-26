package mni.dev.services;

import mni.dev.services.impl.PersonServiceImpl;
import javax.xml.ws.Endpoint;

public class PersonSoapPublisher {
    public static void main(String... args){
        Endpoint.publish("http://localhost:8888/ws/person", new PersonServiceImpl());
    }
}
