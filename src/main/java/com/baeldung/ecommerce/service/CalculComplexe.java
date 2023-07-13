package com.baeldung.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

public class CalculComplexe {

    public static void calculComplexeAppliWeb() {
        // à décommenter pour l'exercice sur le profiling
        //        methodCreeDesListes();
        //        methodFaitDesCalculsModulo();
    }

        // environ 1s sur pc portable
    public static void calculComplexe() {
        methodCreeDesListes();
        methodFaitDesCalculsModulo();
    }

    private static void methodCreeDesListes() {
        List<ArrayList<Integer>> list = new ArrayList<>();
        for (int i=1; i<=2_000_000; i++) {
            list.add(new ArrayList<>(1_000));
        }
    }

    private static void methodFaitDesCalculsModulo() {
        for (int i=1; i<=4_000_000; i++) {
            for (int j=1; j<=1100; j++) {
                if ((i+j)%456_482==0) {
                    System.out.println("i="+i+" j="+j);
                }
            }
        }
    }
}
