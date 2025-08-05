package javaPro.lesson12;

import java.util.List;

@FunctionalInterface
public interface ListMerger <T>{
    List<T> merge(List<T> firstList, List<T> secondList);
}
