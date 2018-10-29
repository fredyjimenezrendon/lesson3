package com.talos.javatraining.lesson3;

import org.apache.commons.collections4.ListUtils;

import java.util.List;

import static java.util.Arrays.asList;

public interface JawlessFish extends Fish {

    default List<String> getCharacteristics()
    {
        return ListUtils.union(asList("They don't have jaw"), Fish.super.getCharacteristics());
    }
}
