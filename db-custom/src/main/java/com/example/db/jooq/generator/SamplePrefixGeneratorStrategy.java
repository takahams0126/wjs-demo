package com.example.db.jooq.generator;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

/**
 * JOOQコード生成時のストラテジクラス.
 */
public class SamplePrefixGeneratorStrategy extends DefaultGeneratorStrategy {

    /**
     * Javaクラス名ルールをカスタマイズします.
     * POJOクラスはクラス名＋"VO"とし、それ以外は"J"＋クラス名とします.
     * @param definition
     * @param mode
     */
    @Override
    public String getJavaClassName(final Definition definition, final Mode mode) {

        String name = super.getJavaClassName(definition, mode);

        switch (mode) {
            case POJO:
                return name + "Vo";
            case DEFAULT:
                return 'J' + name;
            default:
        }

        return name;
    }
}
