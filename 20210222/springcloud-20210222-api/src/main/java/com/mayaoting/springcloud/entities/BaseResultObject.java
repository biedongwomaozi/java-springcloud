package com.mayaoting.springcloud.entities;

import com.mayaoting.springcloud.common.Contant;

import java.io.Serializable;

public class BaseResultObject implements Serializable {
     Boolean resultStatus = Contant.SUCCESS_BOOLEAN_STATUS;

    public Boolean getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(Boolean resultStatus) {
        this.resultStatus = resultStatus;
    }

}
