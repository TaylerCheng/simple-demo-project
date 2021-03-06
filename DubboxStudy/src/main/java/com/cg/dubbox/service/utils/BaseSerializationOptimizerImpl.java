package com.cg.dubbox.service.utils;

/**
 * Created by Cheng Guang on 2016/9/26.
 */

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.cg.dubbox.service.pojo.User;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * 对象序列化优化处理类
 *
 * @author zhouzhengfa
 */
public class BaseSerializationOptimizerImpl implements SerializationOptimizer {

    @Override
    @SuppressWarnings("all")
    /**
     * 序列化的对象类型
     */
    public Collection<Class> getSerializableClasses() {
        List<Class> list = new LinkedList<Class>();
        list.add(User.class);
        return list;
    }

}