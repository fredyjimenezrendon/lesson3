package com.talos.javatraining.lesson3;

import org.apache.commons.collections4.ListUtils;

import java.util.List;

import static java.util.Arrays.asList;

public interface CartilaginousFish extends Fish {

    default List<String> getCharacteristics()
    {
        return ListUtils.union(asList("They have skeleton made of cartilage rather than bone"), Fish.super.getCharacteristics());
    }
}
