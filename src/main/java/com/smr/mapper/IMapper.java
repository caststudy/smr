
package com.smr.mapper;

import java.util.List;
import java.util.Map;

/**
 * @author karthy
 */
public interface IMapper {
    public Object getById(Integer id);
    public List<Object> getAll(Object obj);
}
