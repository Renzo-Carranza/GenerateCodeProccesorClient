/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logicbig.example;

import com.logicbig.example.annotation.AutoImplement;
import com.logicbig.example.annotation.Mandatory;

/**
 *
 * @author renzo
 */
@AutoImplement(as = "Entidad", builder = false)
public interface IEntidad {

    @Mandatory
    String getFirstName();

    
    String getLastName();
    
    String getTabla();

}
