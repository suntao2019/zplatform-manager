package com.zlebank.zplatform.manager.dao.iface;

import java.util.List;

import com.zlebank.zplatform.commons.dao.BaseDAO;
import com.zlebank.zplatform.manager.dao.object.scan.ChannelFileMode;

public interface IChannelFileDao  extends BaseDAO<ChannelFileMode>{

    public List<ChannelFileMode> queryByHQL(String queryString) ;
    public boolean isInsitFileHandlerExist(String uploadFileName, String instiId);
}
