/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leona.transmissor.controller;

import br.leona.hardware.transmission.TransmissionController;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author leona
 *
 */

@WebService(serviceName = "ControllerServices")
public class ControllerServices {    
    private  TransmissionController transControll ;
    
    public ControllerServices(){
        transControll = new TransmissionController(1235);        
        IniciarVideo();
        iniciarTransmissao();
    }
    /**
    * Operação para inciar o video
    */
    @WebMethod(operationName = "iniciarVideo")
    public void IniciarVideo() {
      transControll.iniciarVideo();
    }

    /**
     * Operação para iniciar a transmissao das imagens
     */
    @WebMethod(operationName = "iniciarTransmissao")
    public void iniciarTransmissao() {
      System.out.println("ws - iniciar transmissão");
      transControll.iniciarTransmissao();
    }
    
     
    /**
     * Operação para parar a transmissao das imagens
     */
    @WebMethod(operationName = "iararTransmissao")
    public void pararTransmissao() {
      System.out.println("ws - parar transmissão");
      transControll.pararTransmissao();
    }
   
}
