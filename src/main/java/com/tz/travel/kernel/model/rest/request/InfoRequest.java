package com.tz.travel.kernel.model.rest.request;

/**
 * Created by tzjeefjalft on 12/15/2014.
 */
//@XmlRootElement
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class InfoRequest <ENTITY> extends AbstractRequest  {
    ENTITY info;

    public ENTITY getInfo() {
        return info;
    }

    public void setInfo(ENTITY info) {
        this.info = info;
    }
}
