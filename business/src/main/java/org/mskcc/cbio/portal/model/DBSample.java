/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mskcc.cbio.portal.model;

import java.io.Serializable;

/**
 *
 * @author abeshoua
 */
public class DBSample implements Serializable {
    public Integer internal_id;
    public String stable_id;
    public String sample_type;
    public Integer patient_id;
}
