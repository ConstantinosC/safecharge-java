package com.safecharge.request.model;

import com.safecharge.util.BooleanString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ExternalMpi {

    @BooleanString(mandatory = true)
    private String isExternalMpi;

    @Size(min = 1, max = 2, message = "value is invalid.")
    @NotNull
    private String eci;

    @Size(min = 1, max = 50, message = "value is invalid. The length of the value should be between {min} and {max} symbols.")
    @NotNull
    private String cavv;

    @Size(max = 50, message = "value is invalid. The length of the value should be maximum {max} symbols.")
    private String xid;
}
