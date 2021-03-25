package cn.ld.peach.mall.commons.util;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * BeanCopier工具类
 * 原型模式 + 享元模式
 *
 * @author lidong
 * @date 2021/3/24
 */
@Slf4j
public class BeanCopierUtil {

    /**
     * BeanCopier的缓存
     */
    private static final ConcurrentHashMap<String, BeanCopier> BEAN_COPIER_CACHE = new ConcurrentHashMap<>();

    private BeanCopierUtil() {
    }

    /**
     * 转换列表
     *
     * @param sourceList 数据源
     * @param tgtClazz   类型
     * @return 转换后的列表
     */
    public static <A, B> List<B> copyList(List<A> sourceList, Class<B> tgtClazz) {
        if (Objects.isNull(sourceList) || sourceList.size() <= 0) {
            return Collections.emptyList();
        }
        Object source = sourceList.get(0);
        String key = genKey(source.getClass(), tgtClazz);
        BeanCopier beanCopier;
        if (BEAN_COPIER_CACHE.containsKey(key)) {
            beanCopier = BEAN_COPIER_CACHE.get(key);
        } else {
            beanCopier = BeanCopier.create(source.getClass(), tgtClazz, false);
            BEAN_COPIER_CACHE.put(key, beanCopier);
        }

        List<B> targetList = new ArrayList<>(sourceList.size());
        for (Object s : sourceList) {
            try {
                B t = tgtClazz.newInstance();
                beanCopier.copy(s, t, null);
                targetList.add(t);
            } catch (InstantiationException | IllegalAccessException e) {
                log.info("copyList occur error: ", e);
            }
        }

        return targetList;
    }

    /**
     * BeanCopier的copy
     *
     * @param source 源文件的
     * @param target 目标文件
     */
    public static void copy(Object source, Object target) {
        String key = genKey(source.getClass(), target.getClass());
        BeanCopier beanCopier;
        if (BEAN_COPIER_CACHE.containsKey(key)) {
            beanCopier = BEAN_COPIER_CACHE.get(key);
        } else {
            beanCopier = BeanCopier.create(source.getClass(), target.getClass(), false);
            BEAN_COPIER_CACHE.put(key, beanCopier);
        }
        beanCopier.copy(source, target, null);
    }

    /**
     * 生成key
     *
     * @param srcClazz 源文件的class
     * @param tgtClazz 目标文件的class
     * @return string
     */
    private static String genKey(Class<?> srcClazz, Class<?> tgtClazz) {
        return srcClazz.getName() + tgtClazz.getName();
    }
}
