package com.study;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class NutritionFactsTest {
    @Test
    @DisplayName("생성자 생성해보기")
    public void NutritionFactsTest1(){
        NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
    }

    @Test
    @DisplayName("자바 빈즈로 생성자 생성해보기")
    public void NutritionFactsTest2(){
        NutritionFacts2 cocaCola = new NutritionFacts2();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }
    @Test
    @DisplayName("빌더 패턴을 이용해서 생성해보기")
    public void NutritionFactsTest3(){
        NutritionFacts3 cocaCola = new NutritionFacts3.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}