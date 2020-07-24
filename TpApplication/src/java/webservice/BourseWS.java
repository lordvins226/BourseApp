/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import models.Cotation;
import views.Bourse;

/**
 *
 * @author kevin
 */
@WebService(serviceName = "BourseWS")
public class BourseWS {

    Bourse bourse = new Bourse();

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "liste")
    public List<Cotation> liste() {
        List cota = bourse.listCota();
        return cota;
    }

}
