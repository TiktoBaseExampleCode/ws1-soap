package mni.dev;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Hello {

    @WebMethod
    public String bonjour(String name){
        return "Bonjour "+ name;
    }
}
