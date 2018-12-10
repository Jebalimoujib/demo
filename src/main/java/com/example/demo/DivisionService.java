package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DivisionService {

    /**
     * @param input
     * @param subListSize
     * @return
     */
    public List<List> diviser(List input, int subListSize) {
        if (input == null || subListSize <= 0) {
            throw new IllegalArgumentException();
        }
        int inputSize = input.size();
        int nbSubList = inputSize / subListSize;
        List<List> result = new ArrayList<>();
        for (int i = 0; i < nbSubList; i++) {
            result.add(input.subList(i * subListSize, i * subListSize + subListSize));
        }
        if (nbSubList * subListSize < inputSize) {
            result.add(input.subList(nbSubList * subListSize, inputSize));
        }
        return result;
    }
}
