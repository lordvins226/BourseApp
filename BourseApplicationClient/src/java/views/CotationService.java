/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author kevin
 */
public class CotationService {

    public static java.util.List<webservice.Cotation> liste() {
        webservice.BourseWS_Service service = new webservice.BourseWS_Service();
        webservice.BourseWS port = service.getBourseWSPort();
        return port.liste();
    }
    
}
