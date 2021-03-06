package com.zlebank.zplatform.manager.service.certhandler;

import com.zlebank.zplatform.manager.action.merch.CertType;
import com.zlebank.zplatform.manager.dao.object.PojoEnterpriseDetaApply;

public class SignFileFacePicHandler extends CertPicHandler{
    public SignFileFacePicHandler(){
        certType = CertType.SIGNATORYFILE_FACE;
    }
    
    @Override
    public PojoEnterpriseDetaApply decorate(PojoEnterpriseDetaApply enterpriseDetaApply,String fileName) {
        enterpriseDetaApply.setSignCertFile(fileName);
        return enterpriseDetaApply;
    }
    
    @Override
    public String getFileName(PojoEnterpriseDetaApply enterpriseDetaApply){
        return enterpriseDetaApply.getSignCertFile();
    }
}
