package com.talos.javatraining.lesson3;

import org.apache.commons.collections4.ListUtils;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public interface BonyFish extends Fish {

    default List<String> getCharacteristics()
    {
        return ListUtils.union(asList("They have skeletons primarily composed of bone tissue"), Fish.super.getCharacteristics());
    }
}
