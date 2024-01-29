package testStructure.arrayList;

import org.w3c.dom.css.CSSStyleRule;

import java.util.Comparator;

public class ComparatorMyList implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
       return second.charAt(0) - first.charAt(0);
    }
}
